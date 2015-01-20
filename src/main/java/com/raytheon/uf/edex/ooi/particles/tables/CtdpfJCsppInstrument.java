package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdpf_j_cspp_instrument")
public class CtdpfJCsppInstrument extends CassandraParticle {

    @Column(value = "profiler_timestamp")
    private double profilerTimestamp;

    @Column(value = "suspect_timestamp")
    private int suspectTimestamp;

    @Column(value = "temperature")
    private float temperature;

    @Column(value = "conductivity")
    private float conductivity;

    @Column(value = "pressure")
    private float pressure;

    @Column(value = "salinity")
    private float salinity;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProfilerTimestamp((double) particle.get("profiler_timestamp"));
        setSuspectTimestamp((int) particle.get("suspect_timestamp"));
        setTemperature((float) particle.get("temperature"));
        setConductivity((float) particle.get("conductivity"));
        setPressure((float) particle.get("pressure"));
        setSalinity((float) particle.get("salinity"));
    }

    public double getProfilerTimestamp() {
        return profilerTimestamp;
    }

    public void setProfilerTimestamp(double profilerTimestamp) {
        this.profilerTimestamp = profilerTimestamp;
    }
    public int getSuspectTimestamp() {
        return suspectTimestamp;
    }

    public void setSuspectTimestamp(int suspectTimestamp) {
        this.suspectTimestamp = suspectTimestamp;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getConductivity() {
        return conductivity;
    }

    public void setConductivity(float conductivity) {
        this.conductivity = conductivity;
    }
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
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