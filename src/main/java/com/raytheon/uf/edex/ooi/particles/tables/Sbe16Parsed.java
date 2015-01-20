package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "sbe16_parsed")
public class Sbe16Parsed extends CassandraParticle {

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "conductivity")
    private int conductivity;

    @Column(value = "pressure")
    private int pressure;

    @Column(value = "thermistor_temperature")
    private float thermistorTemperature;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTemperature((int) particle.get("temperature"));
        setConductivity((int) particle.get("conductivity"));
        setPressure((int) particle.get("pressure"));
        setThermistorTemperature((float) particle.get("thermistor_temperature"));
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getConductivity() {
        return conductivity;
    }

    public void setConductivity(int conductivity) {
        this.conductivity = conductivity;
    }
    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public float getThermistorTemperature() {
        return thermistorTemperature;
    }

    public void setThermistorTemperature(float thermistorTemperature) {
        this.thermistorTemperature = thermistorTemperature;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}