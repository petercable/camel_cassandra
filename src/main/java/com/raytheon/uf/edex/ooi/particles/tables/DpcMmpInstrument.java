package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dpc_mmp_instrument")
public class DpcMmpInstrument extends CassandraParticle {

    @Column(value = "raw_time_seconds")
    private long rawTimeSeconds;

    @Column(value = "raw_time_microseconds")
    private long rawTimeMicroseconds;

    @Column(value = "operating_mode")
    private String operatingMode;

    @Column(value = "wfp_profile_number")
    private long wfpProfileNumber;

    @Column(value = "wfp_prof_current")
    private float wfpProfCurrent;

    @Column(value = "wfp_prof_voltage")
    private float wfpProfVoltage;

    @Column(value = "wfp_prof_pressure")
    private float wfpProfPressure;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setRawTimeSeconds((long) particle.get("raw_time_seconds"));
        setRawTimeMicroseconds((long) particle.get("raw_time_microseconds"));
        setOperatingMode((String) particle.get("operating_mode"));
        setWfpProfileNumber((long) particle.get("wfp_profile_number"));
        setWfpProfCurrent((float) particle.get("wfp_prof_current"));
        setWfpProfVoltage((float) particle.get("wfp_prof_voltage"));
        setWfpProfPressure((float) particle.get("wfp_prof_pressure"));
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
    public String getOperatingMode() {
        return operatingMode;
    }

    public void setOperatingMode(String operatingMode) {
        this.operatingMode = operatingMode;
    }
    public long getWfpProfileNumber() {
        return wfpProfileNumber;
    }

    public void setWfpProfileNumber(long wfpProfileNumber) {
        this.wfpProfileNumber = wfpProfileNumber;
    }
    public float getWfpProfCurrent() {
        return wfpProfCurrent;
    }

    public void setWfpProfCurrent(float wfpProfCurrent) {
        this.wfpProfCurrent = wfpProfCurrent;
    }
    public float getWfpProfVoltage() {
        return wfpProfVoltage;
    }

    public void setWfpProfVoltage(float wfpProfVoltage) {
        this.wfpProfVoltage = wfpProfVoltage;
    }
    public float getWfpProfPressure() {
        return wfpProfPressure;
    }

    public void setWfpProfPressure(float wfpProfPressure) {
        this.wfpProfPressure = wfpProfPressure;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}