package com.raytheon;

import com.datastax.driver.core.ResultSet;
import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.tables.CtdbpCdefCeDostaRecovered;
import com.raytheon.uf.edex.ooi.particles.tables.CtdbpCdefCpInstrumentRecovered;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.CassandraOperations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CassandraStore implements Processor {
    private static final Logger LOG = LoggerFactory.getLogger(CassandraStore.class);
    private static AtomicInteger counter = new AtomicInteger(0);

    @Autowired
    private CassandraOperations cassandraOperations;

    @Override
    public void process(Exchange exchange) throws Exception {

        CassandraParticle particle = exchange.getIn().getBody(CassandraParticle.class);
        if (particle != null)
            cassandraOperations.insert(particle);

        int current = counter.getAndIncrement();
        if (current > 0 && current % 1000 == 0)
            LOG.info("Processed 1000 particles");

        try {
            StringBuilder sb = new StringBuilder();
            List<CtdbpCdefCpInstrumentRecovered> x =
                    cassandraOperations.select("select * from ctdbp_cdef_cp_instrument_recovered",
                            CtdbpCdefCpInstrumentRecovered.class);
            for (CassandraParticle p: x) {
                LOG.info("particle: {}", p);
                sb.append(p);
            }
            LOG.info("fetched particles: {}", sb);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
