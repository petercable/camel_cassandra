package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_system_data")
public class VelptSystemData extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "battery_voltage")
    private float batteryVoltage;

    @Column(value = "speed_of_sound")
    private float speedOfSound;

    @Column(value = "heading")
    private float heading;

    @Column(value = "pitch")
    private float pitch;

    @Column(value = "roll")
    private float roll;

    @Column(value = "temperature")
    private float temperature;

    @Column(value = "error_code")
    private int errorCode;

    @Column(value = "status_code")
    private int statusCode;

    @Column(value = "analog_input")
    private int analogInput;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setBatteryVoltage((float) particle.get("battery_voltage"));
        setSpeedOfSound((float) particle.get("speed_of_sound"));
        setHeading((float) particle.get("heading"));
        setPitch((float) particle.get("pitch"));
        setRoll((float) particle.get("roll"));
        setTemperature((float) particle.get("temperature"));
        setErrorCode((int) particle.get("error_code"));
        setStatusCode((int) particle.get("status_code"));
        setAnalogInput((int) particle.get("analog_input"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public float getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }
    public float getSpeedOfSound() {
        return speedOfSound;
    }

    public void setSpeedOfSound(float speedOfSound) {
        this.speedOfSound = speedOfSound;
    }
    public float getHeading() {
        return heading;
    }

    public void setHeading(float heading) {
        this.heading = heading;
    }
    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }
    public float getRoll() {
        return roll;
    }

    public void setRoll(float roll) {
        this.roll = roll;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}