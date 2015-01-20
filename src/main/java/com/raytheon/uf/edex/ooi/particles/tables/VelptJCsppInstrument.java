package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_j_cspp_instrument")
public class VelptJCsppInstrument extends CassandraParticle {

    @Column(value = "profiler_timestamp")
    private double profilerTimestamp;

    @Column(value = "pressure_depth")
    private float pressureDepth;

    @Column(value = "suspect_timestamp")
    private int suspectTimestamp;

    @Column(value = "speed_of_sound")
    private float speedOfSound;

    @Column(value = "heading")
    private float heading;

    @Column(value = "pitch")
    private float pitch;

    @Column(value = "roll")
    private float roll;

    @Column(value = "velpt_pressure")
    private float velptPressure;

    @Column(value = "temperature")
    private float temperature;

    @Column(value = "velocity_beam1_m_s")
    private float velocityBeam1MS;

    @Column(value = "velocity_beam2_m_s")
    private float velocityBeam2MS;

    @Column(value = "velocity_beam3_m_s")
    private float velocityBeam3MS;

    @Column(value = "amplitude_beam1")
    private int amplitudeBeam1;

    @Column(value = "amplitude_beam2")
    private int amplitudeBeam2;

    @Column(value = "amplitude_beam3")
    private int amplitudeBeam3;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProfilerTimestamp((double) particle.get("profiler_timestamp"));
        setPressureDepth((float) particle.get("pressure_depth"));
        setSuspectTimestamp((int) particle.get("suspect_timestamp"));
        setSpeedOfSound((float) particle.get("speed_of_sound"));
        setHeading((float) particle.get("heading"));
        setPitch((float) particle.get("pitch"));
        setRoll((float) particle.get("roll"));
        setVelptPressure((float) particle.get("velpt_pressure"));
        setTemperature((float) particle.get("temperature"));
        setVelocityBeam1MS((float) particle.get("velocity_beam1_m_s"));
        setVelocityBeam2MS((float) particle.get("velocity_beam2_m_s"));
        setVelocityBeam3MS((float) particle.get("velocity_beam3_m_s"));
        setAmplitudeBeam1((int) particle.get("amplitude_beam1"));
        setAmplitudeBeam2((int) particle.get("amplitude_beam2"));
        setAmplitudeBeam3((int) particle.get("amplitude_beam3"));
    }

    public double getProfilerTimestamp() {
        return profilerTimestamp;
    }

    public void setProfilerTimestamp(double profilerTimestamp) {
        this.profilerTimestamp = profilerTimestamp;
    }
    public float getPressureDepth() {
        return pressureDepth;
    }

    public void setPressureDepth(float pressureDepth) {
        this.pressureDepth = pressureDepth;
    }
    public int getSuspectTimestamp() {
        return suspectTimestamp;
    }

    public void setSuspectTimestamp(int suspectTimestamp) {
        this.suspectTimestamp = suspectTimestamp;
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
    public float getVelptPressure() {
        return velptPressure;
    }

    public void setVelptPressure(float velptPressure) {
        this.velptPressure = velptPressure;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getVelocityBeam1MS() {
        return velocityBeam1MS;
    }

    public void setVelocityBeam1MS(float velocityBeam1MS) {
        this.velocityBeam1MS = velocityBeam1MS;
    }
    public float getVelocityBeam2MS() {
        return velocityBeam2MS;
    }

    public void setVelocityBeam2MS(float velocityBeam2MS) {
        this.velocityBeam2MS = velocityBeam2MS;
    }
    public float getVelocityBeam3MS() {
        return velocityBeam3MS;
    }

    public void setVelocityBeam3MS(float velocityBeam3MS) {
        this.velocityBeam3MS = velocityBeam3MS;
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