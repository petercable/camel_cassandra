package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "sample")
public class Sample extends CassandraParticle {

    @Column(value = "sample_param")
    private int sampleParam;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSampleParam((int) particle.get("sample_param"));
    }

    public int getSampleParam() {
        return sampleParam;
    }

    public void setSampleParam(int sampleParam) {
        this.sampleParam = sampleParam;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}