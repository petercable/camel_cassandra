package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_parsed")
public class VelptParsed extends CassandraParticle {

    @Column(value = "timestamp")
    private String timestamp;

    @Column(value = "error")
    private int error;

    @Column(value = "analog1")
    private int analog1;

    @Column(value = "battery_voltage")
    private int batteryVoltage;

    @Column(value = "sound_speed_analog2")
    private int soundSpeedAnalog2;

    @Column(value = "heading")
    private int heading;

    @Column(value = "pitch")
    private int pitch;

    @Column(value = "roll")
    private int roll;

    @Column(value = "pressure")
    private float pressure;

    @Column(value = "status")
    private List<Integer> status;

    @Column(value = "status_dims")
    private int statusDims;

    @Column(value = "status_sizes")
    private List<Long> statusSizes;

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "velocity_beam1")
    private int velocityBeam1;

    @Column(value = "velocity_beam2")
    private int velocityBeam2;

    @Column(value = "velocity_beam3")
    private int velocityBeam3;

    @Column(value = "amplitude_beam1")
    private int amplitudeBeam1;

    @Column(value = "amplitude_beam2")
    private int amplitudeBeam2;

    @Column(value = "amplitude_beam3")
    private int amplitudeBeam3;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTimestamp((String) particle.get("timestamp"));
        setError((int) particle.get("error"));
        setAnalog1((int) particle.get("analog1"));
        setBatteryVoltage((int) particle.get("battery_voltage"));
        setSoundSpeedAnalog2((int) particle.get("sound_speed_analog2"));
        setHeading((int) particle.get("heading"));
        setPitch((int) particle.get("pitch"));
        setRoll((int) particle.get("roll"));
        setPressure((float) particle.get("pressure"));
        setStatus((List<Integer>) particle.get("status"));
        setStatusDims((int) particle.get("status_dims"));
        setStatusSizes((List<Long>) particle.get("status_sizes"));
        setTemperature((int) particle.get("temperature"));
        setVelocityBeam1((int) particle.get("velocity_beam1"));
        setVelocityBeam2((int) particle.get("velocity_beam2"));
        setVelocityBeam3((int) particle.get("velocity_beam3"));
        setAmplitudeBeam1((int) particle.get("amplitude_beam1"));
        setAmplitudeBeam2((int) particle.get("amplitude_beam2"));
        setAmplitudeBeam3((int) particle.get("amplitude_beam3"));
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
    public int getAnalog1() {
        return analog1;
    }

    public void setAnalog1(int analog1) {
        this.analog1 = analog1;
    }
    public int getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(int batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }
    public int getSoundSpeedAnalog2() {
        return soundSpeedAnalog2;
    }

    public void setSoundSpeedAnalog2(int soundSpeedAnalog2) {
        this.soundSpeedAnalog2 = soundSpeedAnalog2;
    }
    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }
    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public List<Integer> getStatus() {
        // TODO - restore original dimensions, (remove fill values?)
        return status;
    }

    public void setStatus(List<Integer> status) {
        // TODO - flatten for storage, insert fill values
        this.status = status;
    }
    public int getStatusDims() {
        return statusDims;
    }

    public void setStatusDims(int statusDims) {
        this.statusDims = statusDims;
    }
    public List<Long> getStatusSizes() {
        return statusSizes;
    }

    public void setStatusSizes(List<Long> statusSizes) {
        this.statusSizes = statusSizes;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getVelocityBeam1() {
        return velocityBeam1;
    }

    public void setVelocityBeam1(int velocityBeam1) {
        this.velocityBeam1 = velocityBeam1;
    }
    public int getVelocityBeam2() {
        return velocityBeam2;
    }

    public void setVelocityBeam2(int velocityBeam2) {
        this.velocityBeam2 = velocityBeam2;
    }
    public int getVelocityBeam3() {
        return velocityBeam3;
    }

    public void setVelocityBeam3(int velocityBeam3) {
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