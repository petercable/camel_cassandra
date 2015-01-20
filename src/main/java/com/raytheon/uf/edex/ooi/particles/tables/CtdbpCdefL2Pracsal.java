package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_cdef_L2_pracsal")
public class CtdbpCdefL2Pracsal extends CassandraParticle {

    @Column(value = "salinity")
    private float salinity;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSalinity((float) particle.get("salinity"));
    }

    public float getSalinity() {
        return salinity;
    }

    public void setSalinity(float salinity) {
        this.salinity = salinity;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}