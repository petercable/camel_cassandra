package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdpf_parsed")
public class CtdpfParsed extends CassandraParticle {

    @Column(value = "conductivity")
    private float conductivity;

    @Column(value = "temperature")
    private float temperature;

    @Column(value = "pressure")
    private float pressure;

    @Column(value = "oxygen")
    private double oxygen;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setConductivity((float) particle.get("conductivity"));
        setTemperature((float) particle.get("temperature"));
        setPressure((float) particle.get("pressure"));
        setOxygen((double) particle.get("oxygen"));
    }

    public float getConductivity() {
        return conductivity;
    }

    public void setConductivity(float conductivity) {
        this.conductivity = conductivity;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public double getOxygen() {
        return oxygen;
    }

    public void setOxygen(double oxygen) {
        this.oxygen = oxygen;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}