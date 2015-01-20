package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "phsen_parsed")
public class PhsenParsed extends CassandraParticle {

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
    }


    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}