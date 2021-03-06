package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_cdef_sample")
public class CtdbpCdefSample extends CassandraParticle {

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "conductivity")
    private int conductivity;

    @Column(value = "pressure")
    private int pressure;

    @Column(value = "pressure_temp")
    private int pressureTemp;

    @Column(value = "ctd_time")
    private int ctdTime;

    @Column(value = "lat")
    private double lat;

    @Column(value = "lon")
    private double lon;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTemperature((int) particle.get("temperature"));
        setConductivity((int) particle.get("conductivity"));
        setPressure((int) particle.get("pressure"));
        setPressureTemp((int) particle.get("pressure_temp"));
        setCtdTime((int) particle.get("ctd_time"));
        setLat((double) particle.get("lat"));
        setLon((double) particle.get("lon"));
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
    public int getCtdTime() {
        return ctdTime;
    }

    public void setCtdTime(int ctdTime) {
        this.ctdTime = ctdTime;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}