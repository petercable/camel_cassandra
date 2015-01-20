package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "sbe37_LC_TEST")
public class Sbe37LcTest extends CassandraParticle {

    @Column(value = "lat")
    private float lat;

    @Column(value = "lon")
    private float lon;

    @Column(value = "TEMPWAT_L0")
    private double TEMPWATL0;

    @Column(value = "CONDWAT_L0")
    private double CONDWATL0;

    @Column(value = "PRESWAT_L0")
    private double PRESWATL0;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setLat((float) particle.get("lat"));
        setLon((float) particle.get("lon"));
        setTempwatL0((double) particle.get("TEMPWAT_L0"));
        setCondwatL0((double) particle.get("CONDWAT_L0"));
        setPreswatL0((double) particle.get("PRESWAT_L0"));
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
    public double getTempwatL0() {
        return TEMPWATL0;
    }

    public void setTempwatL0(double TEMPWATL0) {
        this.TEMPWATL0 = TEMPWATL0;
    }
    public double getCondwatL0() {
        return CONDWATL0;
    }

    public void setCondwatL0(double CONDWATL0) {
        this.CONDWATL0 = CONDWATL0;
    }
    public double getPreswatL0() {
        return PRESWATL0;
    }

    public void setPreswatL0(double PRESWATL0) {
        this.PRESWATL0 = PRESWATL0;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}