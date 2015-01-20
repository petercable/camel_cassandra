package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "highcharts")
public class Highcharts extends CassandraParticle {

    @Column(value = "viz_timestamp")
    private double vizTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setVizTimestamp((double) particle.get("viz_timestamp"));
    }

    public double getVizTimestamp() {
        return vizTimestamp;
    }

    public void setVizTimestamp(double vizTimestamp) {
        this.vizTimestamp = vizTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}