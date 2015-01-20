package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_cd_head_configuration")
public class Vel3dCdHeadConfiguration extends CassandraParticle {

    @Column(value = "pressure_sensor")
    private int pressureSensor;

    @Column(value = "magnetometer_sensor")
    private int magnetometerSensor;

    @Column(value = "tilt_sensor")
    private int tiltSensor;

    @Column(value = "tilt_sensor_mounting")
    private int tiltSensorMounting;

    @Column(value = "head_frequency")
    private int headFrequency;

    @Column(value = "head_type")
    private String headType;

    @Column(value = "head_serial_number")
    private String headSerialNumber;

    @Column(value = "system_data")
    private String systemData;

    @Column(value = "number_beams")
    private int numberBeams;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setPressureSensor((int) particle.get("pressure_sensor"));
        setMagnetometerSensor((int) particle.get("magnetometer_sensor"));
        setTiltSensor((int) particle.get("tilt_sensor"));
        setTiltSensorMounting((int) particle.get("tilt_sensor_mounting"));
        setHeadFrequency((int) particle.get("head_frequency"));
        setHeadType((String) particle.get("head_type"));
        setHeadSerialNumber((String) particle.get("head_serial_number"));
        setSystemData((String) particle.get("system_data"));
        setNumberBeams((int) particle.get("number_beams"));
    }

    public int getPressureSensor() {
        return pressureSensor;
    }

    public void setPressureSensor(int pressureSensor) {
        this.pressureSensor = pressureSensor;
    }
    public int getMagnetometerSensor() {
        return magnetometerSensor;
    }

    public void setMagnetometerSensor(int magnetometerSensor) {
        this.magnetometerSensor = magnetometerSensor;
    }
    public int getTiltSensor() {
        return tiltSensor;
    }

    public void setTiltSensor(int tiltSensor) {
        this.tiltSensor = tiltSensor;
    }
    public int getTiltSensorMounting() {
        return tiltSensorMounting;
    }

    public void setTiltSensorMounting(int tiltSensorMounting) {
        this.tiltSensorMounting = tiltSensorMounting;
    }
    public int getHeadFrequency() {
        return headFrequency;
    }

    public void setHeadFrequency(int headFrequency) {
        this.headFrequency = headFrequency;
    }
    public String getHeadType() {
        return headType;
    }

    public void setHeadType(String headType) {
        this.headType = headType;
    }
    public String getHeadSerialNumber() {
        return headSerialNumber;
    }

    public void setHeadSerialNumber(String headSerialNumber) {
        this.headSerialNumber = headSerialNumber;
    }
    public String getSystemData() {
        return systemData;
    }

    public void setSystemData(String systemData) {
        this.systemData = systemData;
    }
    public int getNumberBeams() {
        return numberBeams;
    }

    public void setNumberBeams(int numberBeams) {
        this.numberBeams = numberBeams;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}