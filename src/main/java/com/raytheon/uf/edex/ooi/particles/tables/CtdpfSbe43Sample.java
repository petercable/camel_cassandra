package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdpf_sbe43_sample")
public class CtdpfSbe43Sample extends CassandraParticle {

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "conductivity")
    private int conductivity;

    @Column(value = "pressure")
    private int pressure;

    @Column(value = "pressure_temp")
    private int pressureTemp;

    @Column(value = "lat")
    private double lat;

    @Column(value = "lon")
    private double lon;

    @Column(value = "ext_volt0")
    private int extVolt0;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTemperature((int) particle.get("temperature"));
        setConductivity((int) particle.get("conductivity"));
        setPressure((int) particle.get("pressure"));
        setPressureTemp((int) particle.get("pressure_temp"));
        setLat((double) particle.get("lat"));
        setLon((double) particle.get("lon"));
        setExtVolt0((int) particle.get("ext_volt0"));
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
    public int getPressureTemp() {
        return pressureTemp;
    }

    public void setPressureTemp(int pressureTemp) {
        this.pressureTemp = pressureTemp;
    }
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
    public int getExtVolt0() {
        return extVolt0;
    }

    public void setExtVolt0(int extVolt0) {
        this.extVolt0 = extVolt0;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}