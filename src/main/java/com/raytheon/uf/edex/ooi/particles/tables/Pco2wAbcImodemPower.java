package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "pco2w_abc_imodem_power")
public class Pco2wAbcImodemPower extends CassandraParticle {

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
    }


    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}