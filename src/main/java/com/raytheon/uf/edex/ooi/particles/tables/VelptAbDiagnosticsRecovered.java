package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_ab_diagnostics_recovered")
public class VelptAbDiagnosticsRecovered extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "error_code")
    private int errorCode;

    @Column(value = "analog1")
    private int analog1;

    @Column(value = "battery_voltage")
    private float batteryVoltage;

    @Column(value = "sound_speed_analog2")
    private float soundSpeedAnalog2;

    @Column(value = "heading")
    private float heading;

    @Column(value = "pitch")
    private float pitch;

    @Column(value = "roll")
    private float roll;

    @Column(value = "pressure")
    private float pressure;

    @Column(value = "status")
    private int status;

    @Column(value = "temperature")
    private float temperature;

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

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setErrorCode((int) particle.get("error_code"));
        setAnalog1((int) particle.get("analog1"));
        setBatteryVoltage((float) particle.get("battery_voltage"));
        setSoundSpeedAnalog2((float) particle.get("sound_speed_analog2"));
        setHeading((float) particle.get("heading"));
        setPitch((float) particle.get("pitch"));
        setRoll((float) particle.get("roll"));
        setPressure((float) particle.get("pressure"));
        setStatus((int) particle.get("status"));
        setTemperature((float) particle.get("temperature"));
        setVelocityBeam1((float) particle.get("velocity_beam1"));
        setVelocityBeam2((float) particle.get("velocity_beam2"));
        setVelocityBeam3((float) particle.get("velocity_beam3"));
        setAmplitudeBeam1((int) particle.get("amplitude_beam1"));
        setAmplitudeBeam2((int) particle.get("amplitude_beam2"));
        setAmplitudeBeam3((int) particle.get("amplitude_beam3"));
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
    public float getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }
    public float getSoundSpeedAnalog2() {
        return soundSpeedAnalog2;
    }

    public void setSoundSpeedAnalog2(float soundSpeedAnalog2) {
        this.soundSpeedAnalog2 = soundSpeedAnalog2;
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
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}