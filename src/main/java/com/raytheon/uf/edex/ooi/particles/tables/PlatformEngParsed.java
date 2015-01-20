package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "platform_eng_parsed")
public class PlatformEngParsed extends CassandraParticle {

    @Column(value = "lat")
    private float lat;

    @Column(value = "lon")
    private float lon;

    @Column(value = "input_voltage")
    private float inputVoltage;

    @Column(value = "input_bus_current")
    private float inputBusCurrent;

    @Column(value = "mvpc_temperature")
    private float mvpcTemperature;

    @Column(value = "mvpc_pressure_1")
    private float mvpcPressure1;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setLat((float) particle.get("lat"));
        setLon((float) particle.get("lon"));
        setInputVoltage((float) particle.get("input_voltage"));
        setInputBusCurrent((float) particle.get("input_bus_current"));
        setMvpcTemperature((float) particle.get("mvpc_temperature"));
        setMvpcPressure1((float) particle.get("mvpc_pressure_1"));
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }
    public float getInputVoltage() {
        return inputVoltage;
    }

    public void setInputVoltage(float inputVoltage) {
        this.inputVoltage = inputVoltage;
    }
    public float getInputBusCurrent() {
        return inputBusCurrent;
    }

    public void setInputBusCurrent(float inputBusCurrent) {
        this.inputBusCurrent = inputBusCurrent;
    }
    public float getMvpcTemperature() {
        return mvpcTemperature;
    }

    public void setMvpcTemperature(float mvpcTemperature) {
        this.mvpcTemperature = mvpcTemperature;
    }
    public float getMvpcPressure1() {
        return mvpcPressure1;
    }

    public void setMvpcPressure1(float mvpcPressure1) {
        this.mvpcPressure1 = mvpcPressure1;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}