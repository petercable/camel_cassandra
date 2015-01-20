package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctd_derived")
public class CtdDerived extends CassandraParticle {

    @Column(value = "lat")
    private float lat;

    @Column(value = "lon")
    private float lon;

    @Column(value = "pressure")
    private float pressure;

    @Column(value = "conductivity")
    private float conductivity;

    @Column(value = "temp")
    private float temp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setLat((float) particle.get("lat"));
        setLon((float) particle.get("lon"));
        setPressure((float) particle.get("pressure"));
        setConductivity((float) particle.get("conductivity"));
        setTemp((float) particle.get("temp"));
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
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}