package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "botpt_iris_sample")
public class BotptIrisSample extends CassandraParticle {

    @Column(value = "sensor_id")
    private String sensorId;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "iris_x_tilt")
    private float irisXTilt;

    @Column(value = "iris_y_tilt")
    private float irisYTilt;

    @Column(value = "iris_temp")
    private float irisTemp;

    @Column(value = "serial_number")
    private String serialNumber;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSensorId((String) particle.get("sensor_id"));
        setDateTimeString((String) particle.get("date_time_string"));
        setIrisXTilt((float) particle.get("iris_x_tilt"));
        setIrisYTilt((float) particle.get("iris_y_tilt"));
        setIrisTemp((float) particle.get("iris_temp"));
        setSerialNumber((String) particle.get("serial_number"));
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }
    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public float getIrisXTilt() {
        return irisXTilt;
    }

    public void setIrisXTilt(float irisXTilt) {
        this.irisXTilt = irisXTilt;
    }
    public float getIrisYTilt() {
        return irisYTilt;
    }

    public void setIrisYTilt(float irisYTilt) {
        this.irisYTilt = irisYTilt;
    }
    public float getIrisTemp() {
        return irisTemp;
    }

    public void setIrisTemp(float irisTemp) {
        this.irisTemp = irisTemp;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}