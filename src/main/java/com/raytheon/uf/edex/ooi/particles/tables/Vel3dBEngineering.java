package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_b_engineering")
public class Vel3dBEngineering extends CassandraParticle {

    @Column(value = "velocity_offset_a")
    private String velocityOffsetA;

    @Column(value = "velocity_offset_b")
    private String velocityOffsetB;

    @Column(value = "velocity_offset_c")
    private String velocityOffsetC;

    @Column(value = "velocity_offset_d")
    private String velocityOffsetD;

    @Column(value = "compass_offset_0")
    private int compassOffset0;

    @Column(value = "compass_offset_1")
    private int compassOffset1;

    @Column(value = "compass_offset_2")
    private int compassOffset2;

    @Column(value = "compass_scale_factor_0")
    private float compassScaleFactor0;

    @Column(value = "compass_scale_factor_1")
    private float compassScaleFactor1;

    @Column(value = "compass_scale_factor_2")
    private float compassScaleFactor2;

    @Column(value = "tilt_offset_pitch")
    private int tiltOffsetPitch;

    @Column(value = "tilt_offset_roll")
    private int tiltOffsetRoll;

    @Column(value = "sample_period")
    private float samplePeriod;

    @Column(value = "samples_per_burst")
    private int samplesPerBurst;

    @Column(value = "burst_interval_days")
    private int burstIntervalDays;

    @Column(value = "burst_interval_hours")
    private int burstIntervalHours;

    @Column(value = "burst_interval_minutes")
    private int burstIntervalMinutes;

    @Column(value = "burst_interval_seconds")
    private int burstIntervalSeconds;

    @Column(value = "bin_to_si_conversion")
    private float binToSiConversion;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setVelocityOffsetA((String) particle.get("velocity_offset_a"));
        setVelocityOffsetB((String) particle.get("velocity_offset_b"));
        setVelocityOffsetC((String) particle.get("velocity_offset_c"));
        setVelocityOffsetD((String) particle.get("velocity_offset_d"));
        setCompassOffset0((int) particle.get("compass_offset_0"));
        setCompassOffset1((int) particle.get("compass_offset_1"));
        setCompassOffset2((int) particle.get("compass_offset_2"));
        setCompassScaleFactor0((float) particle.get("compass_scale_factor_0"));
        setCompassScaleFactor1((float) particle.get("compass_scale_factor_1"));
        setCompassScaleFactor2((float) particle.get("compass_scale_factor_2"));
        setTiltOffsetPitch((int) particle.get("tilt_offset_pitch"));
        setTiltOffsetRoll((int) particle.get("tilt_offset_roll"));
        setSamplePeriod((float) particle.get("sample_period"));
        setSamplesPerBurst((int) particle.get("samples_per_burst"));
        setBurstIntervalDays((int) particle.get("burst_interval_days"));
        setBurstIntervalHours((int) particle.get("burst_interval_hours"));
        setBurstIntervalMinutes((int) particle.get("burst_interval_minutes"));
        setBurstIntervalSeconds((int) particle.get("burst_interval_seconds"));
        setBinToSiConversion((float) particle.get("bin_to_si_conversion"));
    }

    public String getVelocityOffsetA() {
        return velocityOffsetA;
    }

    public void setVelocityOffsetA(String velocityOffsetA) {
        this.velocityOffsetA = velocityOffsetA;
    }
    public String getVelocityOffsetB() {
        return velocityOffsetB;
    }

    public void setVelocityOffsetB(String velocityOffsetB) {
        this.velocityOffsetB = velocityOffsetB;
    }
    public String getVelocityOffsetC() {
        return velocityOffsetC;
    }

    public void setVelocityOffsetC(String velocityOffsetC) {
        this.velocityOffsetC = velocityOffsetC;
    }
    public String getVelocityOffsetD() {
        return velocityOffsetD;
    }

    public void setVelocityOffsetD(String velocityOffsetD) {
        this.velocityOffsetD = velocityOffsetD;
    }
    public int getCompassOffset0() {
        return compassOffset0;
    }

    public void setCompassOffset0(int compassOffset0) {
        this.compassOffset0 = compassOffset0;
    }
    public int getCompassOffset1() {
        return compassOffset1;
    }

    public void setCompassOffset1(int compassOffset1) {
        this.compassOffset1 = compassOffset1;
    }
    public int getCompassOffset2() {
        return compassOffset2;
    }

    public void setCompassOffset2(int compassOffset2) {
        this.compassOffset2 = compassOffset2;
    }
    public float getCompassScaleFactor0() {
        return compassScaleFactor0;
    }

    public void setCompassScaleFactor0(float compassScaleFactor0) {
        this.compassScaleFactor0 = compassScaleFactor0;
    }
    public float getCompassScaleFactor1() {
        return compassScaleFactor1;
    }

    public void setCompassScaleFactor1(float compassScaleFactor1) {
        this.compassScaleFactor1 = compassScaleFactor1;
    }
    public float getCompassScaleFactor2() {
        return compassScaleFactor2;
    }

    public void setCompassScaleFactor2(float compassScaleFactor2) {
        this.compassScaleFactor2 = compassScaleFactor2;
    }
    public int getTiltOffsetPitch() {
        return tiltOffsetPitch;
    }

    public void setTiltOffsetPitch(int tiltOffsetPitch) {
        this.tiltOffsetPitch = tiltOffsetPitch;
    }
    public int getTiltOffsetRoll() {
        return tiltOffsetRoll;
    }

    public void setTiltOffsetRoll(int tiltOffsetRoll) {
        this.tiltOffsetRoll = tiltOffsetRoll;
    }
    public float getSamplePeriod() {
        return samplePeriod;
    }

    public void setSamplePeriod(float samplePeriod) {
        this.samplePeriod = samplePeriod;
    }
    public int getSamplesPerBurst() {
        return samplesPerBurst;
    }

    public void setSamplesPerBurst(int samplesPerBurst) {
        this.samplesPerBurst = samplesPerBurst;
    }
    public int getBurstIntervalDays() {
        return burstIntervalDays;
    }

    public void setBurstIntervalDays(int burstIntervalDays) {
        this.burstIntervalDays = burstIntervalDays;
    }
    public int getBurstIntervalHours() {
        return burstIntervalHours;
    }

    public void setBurstIntervalHours(int burstIntervalHours) {
        this.burstIntervalHours = burstIntervalHours;
    }
    public int getBurstIntervalMinutes() {
        return burstIntervalMinutes;
    }

    public void setBurstIntervalMinutes(int burstIntervalMinutes) {
        this.burstIntervalMinutes = burstIntervalMinutes;
    }
    public int getBurstIntervalSeconds() {
        return burstIntervalSeconds;
    }

    public void setBurstIntervalSeconds(int burstIntervalSeconds) {
        this.burstIntervalSeconds = burstIntervalSeconds;
    }
    public float getBinToSiConversion() {
        return binToSiConversion;
    }

    public void setBinToSiConversion(float binToSiConversion) {
        this.binToSiConversion = binToSiConversion;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}