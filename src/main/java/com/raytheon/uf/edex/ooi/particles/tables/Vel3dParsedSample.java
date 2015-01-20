package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_parsed_sample")
public class Vel3dParsedSample extends CassandraParticle {

    @Column(value = "pressure")
    private float pressure;

    @Column(value = "temperature")
    private float temperature;

    @Column(value = "mag_comp_x")
    private float magCompX;

    @Column(value = "mag_comp_y")
    private float magCompY;

    @Column(value = "pitch")
    private float pitch;

    @Column(value = "roll")
    private float roll;

    @Column(value = "raw_velocity_a")
    private float rawVelocityA;

    @Column(value = "raw_velocity_b")
    private float rawVelocityB;

    @Column(value = "raw_velocity_c")
    private float rawVelocityC;

    @Column(value = "raw_velocity_d")
    private float rawVelocityD;

    @Column(value = "velocity_east")
    private float velocityEast;

    @Column(value = "velocity_north")
    private float velocityNorth;

    @Column(value = "velocity_up")
    private float velocityUp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setPressure((float) particle.get("pressure"));
        setTemperature((float) particle.get("temperature"));
        setMagCompX((float) particle.get("mag_comp_x"));
        setMagCompY((float) particle.get("mag_comp_y"));
        setPitch((float) particle.get("pitch"));
        setRoll((float) particle.get("roll"));
        setRawVelocityA((float) particle.get("raw_velocity_a"));
        setRawVelocityB((float) particle.get("raw_velocity_b"));
        setRawVelocityC((float) particle.get("raw_velocity_c"));
        setRawVelocityD((float) particle.get("raw_velocity_d"));
        setVelocityEast((float) particle.get("velocity_east"));
        setVelocityNorth((float) particle.get("velocity_north"));
        setVelocityUp((float) particle.get("velocity_up"));
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getMagCompX() {
        return magCompX;
    }

    public void setMagCompX(float magCompX) {
        this.magCompX = magCompX;
    }
    public float getMagCompY() {
        return magCompY;
    }

    public void setMagCompY(float magCompY) {
        this.magCompY = magCompY;
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
    public float getRawVelocityA() {
        return rawVelocityA;
    }

    public void setRawVelocityA(float rawVelocityA) {
        this.rawVelocityA = rawVelocityA;
    }
    public float getRawVelocityB() {
        return rawVelocityB;
    }

    public void setRawVelocityB(float rawVelocityB) {
        this.rawVelocityB = rawVelocityB;
    }
    public float getRawVelocityC() {
        return rawVelocityC;
    }

    public void setRawVelocityC(float rawVelocityC) {
        this.rawVelocityC = rawVelocityC;
    }
    public float getRawVelocityD() {
        return rawVelocityD;
    }

    public void setRawVelocityD(float rawVelocityD) {
        this.rawVelocityD = rawVelocityD;
    }
    public float getVelocityEast() {
        return velocityEast;
    }

    public void setVelocityEast(float velocityEast) {
        this.velocityEast = velocityEast;
    }
    public float getVelocityNorth() {
        return velocityNorth;
    }

    public void setVelocityNorth(float velocityNorth) {
        this.velocityNorth = velocityNorth;
    }
    public float getVelocityUp() {
        return velocityUp;
    }

    public void setVelocityUp(float velocityUp) {
        this.velocityUp = velocityUp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}