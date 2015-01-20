package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "pco2a_a_dcl_metadata_recovered")
public class Pco2aADclMetadataRecovered extends CassandraParticle {

    @Column(value = "logging_start_time")
    private String loggingStartTime;

    @Column(value = "logging_stop_time")
    private String loggingStopTime;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setLoggingStartTime((String) particle.get("logging_start_time"));
        setLoggingStopTime((String) particle.get("logging_stop_time"));
    }

    public String getLoggingStartTime() {
        return loggingStartTime;
    }

    public void setLoggingStartTime(String loggingStartTime) {
        this.loggingStartTime = loggingStartTime;
    }
    public String getLoggingStopTime() {
        return loggingStopTime;
    }

    public void setLoggingStopTime(String loggingStopTime) {
        this.loggingStopTime = loggingStopTime;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}