package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "prest_parsed")
public class PrestParsed extends CassandraParticle {

    @Column(value = "sample_number")
    private int sampleNumber;

    @Column(value = "sample_type")
    private String sampleType;

    @Column(value = "InstTime")
    private String InstTime;

    @Column(value = "pressure")
    private float pressure;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSampleNumber((int) particle.get("sample_number"));
        setSampleType((String) particle.get("sample_type"));
        setInsttime((String) particle.get("InstTime"));
        setPressure((float) particle.get("pressure"));
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }
    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }
    public String getInsttime() {
        return InstTime;
    }

    public void setInsttime(String InstTime) {
        this.InstTime = InstTime;
    }
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}