package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_cd_system_data")
public class Vel3dCdSystemData extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "error_code")
    private int errorCode;

    @Column(value = "status_code")
    private int statusCode;

    @Column(value = "analog_input")
    private int analogInput;

    @Column(value = "battery_voltage_dV")
    private float batteryVoltageDv;

    @Column(value = "sound_speed_dms")
    private float soundSpeedDms;

    @Column(value = "heading_decidegree")
    private float headingDecidegree;

    @Column(value = "pitch_decidegree")
    private float pitchDecidegree;

    @Column(value = "roll_decidegree")
    private float rollDecidegree;

    @Column(value = "temperature_centidegree")
    private float temperatureCentidegree;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setErrorCode((int) particle.get("error_code"));
        setStatusCode((int) particle.get("status_code"));
        setAnalogInput((int) particle.get("analog_input"));
        setBatteryVoltageDv((float) particle.get("battery_voltage_dV"));
        setSoundSpeedDms((float) particle.get("sound_speed_dms"));
        setHeadingDecidegree((float) particle.get("heading_decidegree"));
        setPitchDecidegree((float) particle.get("pitch_decidegree"));
        setRollDecidegree((float) particle.get("roll_decidegree"));
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
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public int getAnalogInput() {
        return analogInput;
    }

    public void setAnalogInput(int analogInput) {
        this.analogInput = analogInput;
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
    public float getPitchDecidegree() {
        return pitchDecidegree;
    }

    public void setPitchDecidegree(float pitchDecidegree) {
        this.pitchDecidegree = pitchDecidegree;
    }
    public float getRollDecidegree() {
        return rollDecidegree;
    }

    public void setRollDecidegree(float rollDecidegree) {
        this.rollDecidegree = rollDecidegree;
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