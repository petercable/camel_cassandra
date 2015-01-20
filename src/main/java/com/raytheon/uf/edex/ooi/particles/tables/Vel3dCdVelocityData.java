package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_cd_velocity_data")
public class Vel3dCdVelocityData extends CassandraParticle {

    @Column(value = "analog_input_2")
    private int analogInput2;

    @Column(value = "ensemble_counter")
    private int ensembleCounter;

    @Column(value = "seawater_pressure_mbar")
    private float seawaterPressureMbar;

    @Column(value = "analog_input_1")
    private int analogInput1;

    @Column(value = "turbulent_velocity_east")
    private float turbulentVelocityEast;

    @Column(value = "turbulent_velocity_north")
    private float turbulentVelocityNorth;

    @Column(value = "turbulent_velocity_vertical")
    private float turbulentVelocityVertical;

    @Column(value = "amplitude_beam_1")
    private int amplitudeBeam1;

    @Column(value = "amplitude_beam_2")
    private int amplitudeBeam2;

    @Column(value = "amplitude_beam_3")
    private int amplitudeBeam3;

    @Column(value = "correlation_beam_1")
    private int correlationBeam1;

    @Column(value = "correlation_beam_2")
    private int correlationBeam2;

    @Column(value = "correlation_beam_3")
    private int correlationBeam3;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setAnalogInput2((int) particle.get("analog_input_2"));
        setEnsembleCounter((int) particle.get("ensemble_counter"));
        setSeawaterPressureMbar((float) particle.get("seawater_pressure_mbar"));
        setAnalogInput1((int) particle.get("analog_input_1"));
        setTurbulentVelocityEast((float) particle.get("turbulent_velocity_east"));
        setTurbulentVelocityNorth((float) particle.get("turbulent_velocity_north"));
        setTurbulentVelocityVertical((float) particle.get("turbulent_velocity_vertical"));
        setAmplitudeBeam1((int) particle.get("amplitude_beam_1"));
        setAmplitudeBeam2((int) particle.get("amplitude_beam_2"));
        setAmplitudeBeam3((int) particle.get("amplitude_beam_3"));
        setCorrelationBeam1((int) particle.get("correlation_beam_1"));
        setCorrelationBeam2((int) particle.get("correlation_beam_2"));
        setCorrelationBeam3((int) particle.get("correlation_beam_3"));
    }

    public int getAnalogInput2() {
        return analogInput2;
    }

    public void setAnalogInput2(int analogInput2) {
        this.analogInput2 = analogInput2;
    }
    public int getEnsembleCounter() {
        return ensembleCounter;
    }

    public void setEnsembleCounter(int ensembleCounter) {
        this.ensembleCounter = ensembleCounter;
    }
    public float getSeawaterPressureMbar() {
        return seawaterPressureMbar;
    }

    public void setSeawaterPressureMbar(float seawaterPressureMbar) {
        this.seawaterPressureMbar = seawaterPressureMbar;
    }
    public int getAnalogInput1() {
        return analogInput1;
    }

    public void setAnalogInput1(int analogInput1) {
        this.analogInput1 = analogInput1;
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
    public float getTurbulentVelocityVertical() {
        return turbulentVelocityVertical;
    }

    public void setTurbulentVelocityVertical(float turbulentVelocityVertical) {
        this.turbulentVelocityVertical = turbulentVelocityVertical;
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
    public int getCorrelationBeam1() {
        return correlationBeam1;
    }

    public void setCorrelationBeam1(int correlationBeam1) {
        this.correlationBeam1 = correlationBeam1;
    }
    public int getCorrelationBeam2() {
        return correlationBeam2;
    }

    public void setCorrelationBeam2(int correlationBeam2) {
        this.correlationBeam2 = correlationBeam2;
    }
    public int getCorrelationBeam3() {
        return correlationBeam3;
    }

    public void setCorrelationBeam3(int correlationBeam3) {
        this.correlationBeam3 = correlationBeam3;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}