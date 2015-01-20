package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "D1000_sample")
public class D1000Sample extends CassandraParticle {

    @Column(value = "temperature1")
    private float temperature1;

    @Column(value = "temperature2")
    private float temperature2;

    @Column(value = "temperature3")
    private float temperature3;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTemperature1((float) particle.get("temperature1"));
        setTemperature2((float) particle.get("temperature2"));
        setTemperature3((float) particle.get("temperature3"));
    }

    public float getTemperature1() {
        return temperature1;
    }

    public void setTemperature1(float temperature1) {
        this.temperature1 = temperature1;
    }
    public float getTemperature2() {
        return temperature2;
    }

    public void setTemperature2(float temperature2) {
        this.temperature2 = temperature2;
    }
    public float getTemperature3() {
        return temperature3;
    }

    public void setTemperature3(float temperature3) {
        this.temperature3 = temperature3;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}