package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctd_simulator")
public class CtdSimulator extends CassandraParticle {

    @Column(value = "pressure")
    private float pressure;

    @Column(value = "lat")
    private float lat;

    @Column(value = "conductivity")
    private float conductivity;

    @Column(value = "temp")
    private float temp;

    @Column(value = "lon")
    private float lon;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setPressure((float) particle.get("pressure"));
        setLat((float) particle.get("lat"));
        setConductivity((float) particle.get("conductivity"));
        setTemp((float) particle.get("temp"));
        setLon((float) particle.get("lon"));
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
    public float getConductivity() {
        return conductivity;
    }

    public void setConductivity(float conductivity) {
        this.conductivity = conductivity;
    }
    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}