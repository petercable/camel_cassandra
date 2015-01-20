package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cspp_eng_cspp_wc_wm_eng")
public class CsppEngCsppWcWmEng extends CassandraParticle {

    @Column(value = "profiler_timestamp")
    private double profilerTimestamp;

    @Column(value = "pressure_depth")
    private float pressureDepth;

    @Column(value = "suspect_timestamp")
    private int suspectTimestamp;

    @Column(value = "encoder_counts")
    private int encoderCounts;

    @Column(value = "current_flt32")
    private float currentFlt32;

    @Column(value = "device_status")
    private String deviceStatus;

    @Column(value = "winch_velocity")
    private float winchVelocity;

    @Column(value = "temperature")
    private float temperature;

    @Column(value = "voltage_flt32")
    private float voltageFlt32;

    @Column(value = "rope_on_drum")
    private float ropeOnDrum;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProfilerTimestamp((double) particle.get("profiler_timestamp"));
        setPressureDepth((float) particle.get("pressure_depth"));
        setSuspectTimestamp((int) particle.get("suspect_timestamp"));
        setEncoderCounts((int) particle.get("encoder_counts"));
        setCurrentFlt32((float) particle.get("current_flt32"));
        setDeviceStatus((String) particle.get("device_status"));
        setWinchVelocity((float) particle.get("winch_velocity"));
        setTemperature((float) particle.get("temperature"));
        setVoltageFlt32((float) particle.get("voltage_flt32"));
        setRopeOnDrum((float) particle.get("rope_on_drum"));
    }

    public double getProfilerTimestamp() {
        return profilerTimestamp;
    }

    public void setProfilerTimestamp(double profilerTimestamp) {
        this.profilerTimestamp = profilerTimestamp;
    }
    public float getPressureDepth() {
        return pressureDepth;
    }

    public void setPressureDepth(float pressureDepth) {
        this.pressureDepth = pressureDepth;
    }
    public int getSuspectTimestamp() {
        return suspectTimestamp;
    }

    public void setSuspectTimestamp(int suspectTimestamp) {
        this.suspectTimestamp = suspectTimestamp;
    }
    public int getEncoderCounts() {
        return encoderCounts;
    }

    public void setEncoderCounts(int encoderCounts) {
        this.encoderCounts = encoderCounts;
    }
    public float getCurrentFlt32() {
        return currentFlt32;
    }

    public void setCurrentFlt32(float currentFlt32) {
        this.currentFlt32 = currentFlt32;
    }
    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }
    public float getWinchVelocity() {
        return winchVelocity;
    }

    public void setWinchVelocity(float winchVelocity) {
        this.winchVelocity = winchVelocity;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getVoltageFlt32() {
        return voltageFlt32;
    }

    public void setVoltageFlt32(float voltageFlt32) {
        this.voltageFlt32 = voltageFlt32;
    }
    public float getRopeOnDrum() {
        return ropeOnDrum;
    }

    public void setRopeOnDrum(float ropeOnDrum) {
        this.ropeOnDrum = ropeOnDrum;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}