package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_b_sample")
public class Vel3dBSample extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "velocity_beam_a")
    private String velocityBeamA;

    @Column(value = "velocity_beam_b")
    private String velocityBeamB;

    @Column(value = "velocity_beam_c")
    private String velocityBeamC;

    @Column(value = "velocity_beam_d")
    private String velocityBeamD;

    @Column(value = "turbulent_velocity_east")
    private float turbulentVelocityEast;

    @Column(value = "turbulent_velocity_north")
    private float turbulentVelocityNorth;

    @Column(value = "turbulent_velocity_up")
    private float turbulentVelocityUp;

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

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setVelocityBeamA((String) particle.get("velocity_beam_a"));
        setVelocityBeamB((String) particle.get("velocity_beam_b"));
        setVelocityBeamC((String) particle.get("velocity_beam_c"));
        setVelocityBeamD((String) particle.get("velocity_beam_d"));
        setTurbulentVelocityEast((float) particle.get("turbulent_velocity_east"));
        setTurbulentVelocityNorth((float) particle.get("turbulent_velocity_north"));
        setTurbulentVelocityUp((float) particle.get("turbulent_velocity_up"));
        setTemperature((float) particle.get("temperature"));
        setMagCompX((float) particle.get("mag_comp_x"));
        setMagCompY((float) particle.get("mag_comp_y"));
        setPitch((float) particle.get("pitch"));
        setRoll((float) particle.get("roll"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public String getVelocityBeamA() {
        return velocityBeamA;
    }

    public void setVelocityBeamA(String velocityBeamA) {
        this.velocityBeamA = velocityBeamA;
    }
    public String getVelocityBeamB() {
        return velocityBeamB;
    }

    public void setVelocityBeamB(String velocityBeamB) {
        this.velocityBeamB = velocityBeamB;
    }
    public String getVelocityBeamC() {
        return velocityBeamC;
    }

    public void setVelocityBeamC(String velocityBeamC) {
        this.velocityBeamC = velocityBeamC;
    }
    public String getVelocityBeamD() {
        return velocityBeamD;
    }

    public void setVelocityBeamD(String velocityBeamD) {
        this.velocityBeamD = velocityBeamD;
    }
    public float getTurbulentVelocityEast() {
        return turbulentVelocityEast;
    }

    public void setTurbulentVelocityEast(float turbulentVelocityEast) {
        this.turbulentVelocityEast = turbulentVelocityEast;
    }
    public float getTurbulentVelocityNorth() {
        return turbulentVelocityNorth;
    }

    public void setTurbulentVelocityNorth(float turbulentVelocityNorth) {
        this.turbulentVelocityNorth = turbulentVelocityNorth;
    }
    public float getTurbulentVelocityUp() {
        return turbulentVelocityUp;
    }

    public void setTurbulentVelocityUp(float turbulentVelocityUp) {
        this.turbulentVelocityUp = turbulentVelocityUp;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}