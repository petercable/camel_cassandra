package com.raytheon.uf.edex.ooi.particles;


import com.raytheon.uf.edex.ooi.particles.tables.*;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ParticleFactory implements Processor{
    private static final Logger LOG = LoggerFactory.getLogger(ParticleFactory.class);
    private static Map<String, Class<? extends CassandraParticle>> map = ParticleMapper.build();
    private static final ObjectMapper mapper = new ObjectMapper();
    private static AtomicInteger counter = new AtomicInteger(0);

    public void process(Exchange exchange) {
        String json = exchange.getIn().getBody(String.class);
        String sensor = exchange.getIn().getHeader("sensor", String.class);
        String method = exchange.getIn().getHeader("method", String.class);
        try {
            DataParticleJson particle = mapper.readValue(json, DataParticleJson.class);
            Class<? extends CassandraParticle> c = map.get(particle.getStream_name());
            if (c != null) {
                Constructor<? extends CassandraParticle> constructor = c.getConstructor();
                CassandraParticle p = constructor.newInstance();
                p.fill(particle, sensor, method);
                //LOG.info("particle: {}", p.getPk());

                exchange.getOut().setBody(p);
            } else {
                exchange.getOut().setBody(null);
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | IOException e) {
            e.printStackTrace();
            exchange.getOut().setBody(null);
        }
        int current = counter.getAndIncrement();
        if (current > 0 && current % 1000 == 0)
            LOG.info("Processed 1000 particles");
    }
}
