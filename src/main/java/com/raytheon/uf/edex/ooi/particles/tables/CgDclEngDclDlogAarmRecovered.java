package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_dlog_aarm_recovered")
public class CgDclEngDclDlogAarmRecovered extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "acceleration_x")
    private float accelerationX;

    @Column(value = "acceleration_y")
    private float accelerationY;

    @Column(value = "acceleration_z")
    private float accelerationZ;

    @Column(value = "angular_rate_x")
    private float angularRateX;

    @Column(value = "angular_rate_y")
    private float angularRateY;

    @Column(value = "angular_rate_z")
    private float angularRateZ;

    @Column(value = "magnetometer_x")
    private float magnetometerX;

    @Column(value = "magnetometer_y")
    private float magnetometerY;

    @Column(value = "magnetometer_z")
    private float magnetometerZ;

    @Column(value = "tic_counter")
    private float ticCounter;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setAccelerationX((float) particle.get("acceleration_x"));
        setAccelerationY((float) particle.get("acceleration_y"));
        setAccelerationZ((float) particle.get("acceleration_z"));
        setAngularRateX((float) particle.get("angular_rate_x"));
        setAngularRateY((float) particle.get("angular_rate_y"));
        setAngularRateZ((float) particle.get("angular_rate_z"));
        setMagnetometerX((float) particle.get("magnetometer_x"));
        setMagnetometerY((float) particle.get("magnetometer_y"));
        setMagnetometerZ((float) particle.get("magnetometer_z"));
        setTicCounter((float) particle.get("tic_counter"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public float getAccelerationX() {
        return accelerationX;
    }

    public void setAccelerationX(float accelerationX) {
        this.accelerationX = accelerationX;
    }
    public float getAccelerationY() {
        return accelerationY;
    }

    public void setAccelerationY(float accelerationY) {
        this.accelerationY = accelerationY;
    }
    public float getAccelerationZ() {
        return accelerationZ;
    }

    public void setAccelerationZ(float accelerationZ) {
        this.accelerationZ = accelerationZ;
    }
    public float getAngularRateX() {
        return angularRateX;
    }

    public void setAngularRateX(float angularRateX) {
        this.angularRateX = angularRateX;
    }
    public float getAngularRateY() {
        return angularRateY;
    }

    public void setAngularRateY(float angularRateY) {
        this.angularRateY = angularRateY;
    }
    public float getAngularRateZ() {
        return angularRateZ;
    }

    public void setAngularRateZ(float angularRateZ) {
        this.angularRateZ = angularRateZ;
    }
    public float getMagnetometerX() {
        return magnetometerX;
    }

    public void setMagnetometerX(float magnetometerX) {
        this.magnetometerX = magnetometerX;
    }
    public float getMagnetometerY() {
        return magnetometerY;
    }

    public void setMagnetometerY(float magnetometerY) {
        this.magnetometerY = magnetometerY;
    }
    public float getMagnetometerZ() {
        return magnetometerZ;
    }

    public void setMagnetometerZ(float magnetometerZ) {
        this.magnetometerZ = magnetometerZ;
    }
    public float getTicCounter() {
        return ticCounter;
    }

    public void setTicCounter(float ticCounter) {
        this.ticCounter = ticCounter;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}