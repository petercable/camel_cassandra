package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "presf_tide_converted")
public class PresfTideConverted extends CassandraParticle {

    @Column(value = "seafloor_pressure")
    private float seafloorPressure;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSeafloorPressure((float) particle.get("seafloor_pressure"));
    }

    public float getSeafloorPressure() {
        return seafloorPressure;
    }

    public void setSeafloorPressure(float seafloorPressure) {
        this.seafloorPressure = seafloorPressure;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}