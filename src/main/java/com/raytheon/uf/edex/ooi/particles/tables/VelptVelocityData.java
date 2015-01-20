package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_velocity_data")
public class VelptVelocityData extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "error_code")
    private int errorCode;

    @Column(value = "analog1")
    private int analog1;

    @Column(value = "status")
    private int status;

    @Column(value = "velocity_beam1")
    private float velocityBeam1;

    @Column(value = "velocity_beam2")
    private float velocityBeam2;

    @Column(value = "velocity_beam3")
    private float velocityBeam3;

    @Column(value = "amplitude_beam1")
    private int amplitudeBeam1;

    @Column(value = "amplitude_beam2")
    private int amplitudeBeam2;

    @Column(value = "amplitude_beam3")
    private int amplitudeBeam3;

    @Column(value = "battery_voltage_dV")
    private float batteryVoltageDv;

    @Column(value = "sound_speed_dms")
    private float soundSpeedDms;

    @Column(value = "heading_decidegree")
    private float headingDecidegree;

    @Column(value = "roll_decidegree")
    private float rollDecidegree;

    @Column(value = "pitch_decidegree")
    private float pitchDecidegree;

    @Column(value = "pressure_mbar")
    private float pressureMbar;

    @Column(value = "temperature_centidegree")
    private float temperatureCentidegree;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setErrorCode((int) particle.get("error_code"));
        setAnalog1((int) particle.get("analog1"));
        setStatus((int) particle.get("status"));
        setVelocityBeam1((float) particle.get("velocity_beam1"));
        setVelocityBeam2((float) particle.get("velocity_beam2"));
        setVelocityBeam3((float) particle.get("velocity_beam3"));
        setAmplitudeBeam1((int) particle.get("amplitude_beam1"));
        setAmplitudeBeam2((int) particle.get("amplitude_beam2"));
        setAmplitudeBeam3((int) particle.get("amplitude_beam3"));
        setBatteryVoltageDv((float) particle.get("battery_voltage_dV"));
        setSoundSpeedDms((float) particle.get("sound_speed_dms"));
        setHeadingDecidegree((float) particle.get("heading_decidegree"));
        setRollDecidegree((float) particle.get("roll_decidegree"));
        setPitchDecidegree((float) particle.get("pitch_decidegree"));
        setPressureMbar((float) particle.get("pressure_mbar"));
        setTemperatureCentidegree((float) particle.get("temperature_centidegree"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    public int getAnalog1() {
        return analog1;
    }

    public void setAnalog1(int analog1) {
        this.analog1 = analog1;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public float getVelocityBeam1() {
        return velocityBeam1;
    }

    public void setVelocityBeam1(float velocityBeam1) {
        this.velocityBeam1 = velocityBeam1;
    }
    public float getVelocityBeam2() {
        return velocityBeam2;
    }

    public void setVelocityBeam2(float velocityBeam2) {
        this.velocityBeam2 = velocityBeam2;
    }
    public float getVelocityBeam3() {
        return velocityBeam3;
    }

    public void setVelocityBeam3(float velocityBeam3) {
        this.velocityBeam3 = velocityBeam3;
    }
    public int getAmplitudeBeam1() {
        return amplitudeBeam1;
    }

    public void setAmplitudeBeam1(int amplitudeBeam1) {
        this.amplitudeBeam1 = amplitudeBeam1;
    }
    public int getAmplitudeBeam2() {
        return amplitudeBeam2;
    }

    public void setAmplitudeBeam2(int amplitudeBeam2) {
        this.amplitudeBeam2 = amplitudeBeam2;
    }
    public int getAmplitudeBeam3() {
        return amplitudeBeam3;
    }

    public void setAmplitudeBeam3(int amplitudeBeam3) {
        this.amplitudeBeam3 = amplitudeBeam3;
    }
    public float getBatteryVoltageDv() {
        return batteryVoltageDv;
    }

    public void setBatteryVoltageDv(float batteryVoltageDv) {
        this.batteryVoltageDv = batteryVoltageDv;
    }
    public float getSoundSpeedDms() {
        return soundSpeedDms;
    }

    public void setSoundSpeedDms(float soundSpeedDms) {
        this.soundSpeedDms = soundSpeedDms;
    }
    public float getHeadingDecidegree() {
        return headingDecidegree;
    }

    public void setHeadingDecidegree(float headingDecidegree) {
        this.headingDecidegree = headingDecidegree;
    }
    public float getRollDecidegree() {
        return rollDecidegree;
    }

    public void setRollDecidegree(float rollDecidegree) {
        this.rollDecidegree = rollDecidegree;
    }
    public float getPitchDecidegree() {
        return pitchDecidegree;
    }

    public void setPitchDecidegree(float pitchDecidegree) {
        this.pitchDecidegree = pitchDecidegree;
    }
    public float getPressureMbar() {
        return pressureMbar;
    }

    public void setPressureMbar(float pressureMbar) {
        this.pressureMbar = pressureMbar;
    }
    public float getTemperatureCentidegree() {
        return temperatureCentidegree;
    }

    public void setTemperatureCentidegree(float temperatureCentidegree) {
        this.temperatureCentidegree = temperatureCentidegree;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}