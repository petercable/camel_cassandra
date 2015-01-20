package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dosta_abcdjm_mmp_cds_instrument")
public class DostaAbcdjmMmpCdsInstrument extends CassandraParticle {

    @Column(value = "raw_time_seconds")
    private long rawTimeSeconds;

    @Column(value = "raw_time_microseconds")
    private long rawTimeMicroseconds;

    @Column(value = "calibrated_phase")
    private float calibratedPhase;

    @Column(value = "optode_temperature")
    private float optodeTemperature;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setRawTimeSeconds((long) particle.get("raw_time_seconds"));
        setRawTimeMicroseconds((long) particle.get("raw_time_microseconds"));
        setCalibratedPhase((float) particle.get("calibrated_phase"));
        setOptodeTemperature((float) particle.get("optode_temperature"));
    }

    public long getRawTimeSeconds() {
        return rawTimeSeconds;
    }

    public void setRawTimeSeconds(long rawTimeSeconds) {
        this.rawTimeSeconds = rawTimeSeconds;
    }
    public long getRawTimeMicroseconds() {
        return rawTimeMicroseconds;
    }

    public void setRawTimeMicroseconds(long rawTimeMicroseconds) {
        this.rawTimeMicroseconds = rawTimeMicroseconds;
    }
    public float getCalibratedPhase() {
        return calibratedPhase;
    }

    public void setCalibratedPhase(float calibratedPhase) {
        this.calibratedPhase = calibratedPhase;
    }
    public float getOptodeTemperature() {
        return optodeTemperature;
    }

    public void setOptodeTemperature(float optodeTemperature) {
        this.optodeTemperature = optodeTemperature;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}