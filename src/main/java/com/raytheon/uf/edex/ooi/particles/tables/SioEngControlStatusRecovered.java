package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "sio_eng_control_status_recovered")
public class SioEngControlStatusRecovered extends CassandraParticle {

    @Column(value = "sio_controller_id")
    private long sioControllerId;

    @Column(value = "sio_controller_timestamp")
    private long sioControllerTimestamp;

    @Column(value = "sio_eng_voltage")
    private float sioEngVoltage;

    @Column(value = "sio_eng_temperature")
    private float sioEngTemperature;

    @Column(value = "sio_eng_on_time")
    private long sioEngOnTime;

    @Column(value = "sio_eng_number_of_wakeups")
    private long sioEngNumberOfWakeups;

    @Column(value = "sio_eng_clock_drift")
    private int sioEngClockDrift;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSioControllerId((long) particle.get("sio_controller_id"));
        setSioControllerTimestamp((long) particle.get("sio_controller_timestamp"));
        setSioEngVoltage((float) particle.get("sio_eng_voltage"));
        setSioEngTemperature((float) particle.get("sio_eng_temperature"));
        setSioEngOnTime((long) particle.get("sio_eng_on_time"));
        setSioEngNumberOfWakeups((long) particle.get("sio_eng_number_of_wakeups"));
        setSioEngClockDrift((int) particle.get("sio_eng_clock_drift"));
    }

    public long getSioControllerId() {
        return sioControllerId;
    }

    public void setSioControllerId(long sioControllerId) {
        this.sioControllerId = sioControllerId;
    }
    public long getSioControllerTimestamp() {
        return sioControllerTimestamp;
    }

    public void setSioControllerTimestamp(long sioControllerTimestamp) {
        this.sioControllerTimestamp = sioControllerTimestamp;
    }
    public float getSioEngVoltage() {
        return sioEngVoltage;
    }

    public void setSioEngVoltage(float sioEngVoltage) {
        this.sioEngVoltage = sioEngVoltage;
    }
    public float getSioEngTemperature() {
        return sioEngTemperature;
    }

    public void setSioEngTemperature(float sioEngTemperature) {
        this.sioEngTemperature = sioEngTemperature;
    }
    public long getSioEngOnTime() {
        return sioEngOnTime;
    }

    public void setSioEngOnTime(long sioEngOnTime) {
        this.sioEngOnTime = sioEngOnTime;
    }
    public long getSioEngNumberOfWakeups() {
        return sioEngNumberOfWakeups;
    }

    public void setSioEngNumberOfWakeups(long sioEngNumberOfWakeups) {
        this.sioEngNumberOfWakeups = sioEngNumberOfWakeups;
    }
    public int getSioEngClockDrift() {
        return sioEngClockDrift;
    }

    public void setSioEngClockDrift(int sioEngClockDrift) {
        this.sioEngClockDrift = sioEngClockDrift;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}