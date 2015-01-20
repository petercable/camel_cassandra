package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dosta_abcdjm_glider_recovered")
public class DostaAbcdjmGliderRecovered extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "sci_oxy4_oxygen")
    private float sciOxy4Oxygen;

    @Column(value = "sci_oxy4_saturation")
    private float sciOxy4Saturation;

    @Column(value = "sci_oxy4_timestamp")
    private double sciOxy4Timestamp;

    @Column(value = "sci_oxy4_c1amp")
    private float sciOxy4C1amp;

    @Column(value = "sci_oxy4_c1rph")
    private float sciOxy4C1rph;

    @Column(value = "sci_oxy4_c2amp")
    private float sciOxy4C2amp;

    @Column(value = "sci_oxy4_c2rph")
    private float sciOxy4C2rph;

    @Column(value = "sci_oxy4_calphase")
    private float sciOxy4Calphase;

    @Column(value = "sci_oxy4_rawtemp")
    private float sciOxy4Rawtemp;

    @Column(value = "sci_oxy4_tcphase")
    private float sciOxy4Tcphase;

    @Column(value = "sci_oxy4_temp")
    private float sciOxy4Temp;

    @Column(value = "sci_water_cond")
    private float sciWaterCond;

    @Column(value = "sci_water_pressure")
    private float sciWaterPressure;

    @Column(value = "sci_water_temp")
    private float sciWaterTemp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMPresentTime((double) particle.get("m_present_time"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setSciMPresentTime((double) particle.get("sci_m_present_time"));
        setSciMPresentSecsIntoMission((float) particle.get("sci_m_present_secs_into_mission"));
        setSciOxy4Oxygen((float) particle.get("sci_oxy4_oxygen"));
        setSciOxy4Saturation((float) particle.get("sci_oxy4_saturation"));
        setSciOxy4Timestamp((double) particle.get("sci_oxy4_timestamp"));
        setSciOxy4C1amp((float) particle.get("sci_oxy4_c1amp"));
        setSciOxy4C1rph((float) particle.get("sci_oxy4_c1rph"));
        setSciOxy4C2amp((float) particle.get("sci_oxy4_c2amp"));
        setSciOxy4C2rph((float) particle.get("sci_oxy4_c2rph"));
        setSciOxy4Calphase((float) particle.get("sci_oxy4_calphase"));
        setSciOxy4Rawtemp((float) particle.get("sci_oxy4_rawtemp"));
        setSciOxy4Tcphase((float) particle.get("sci_oxy4_tcphase"));
        setSciOxy4Temp((float) particle.get("sci_oxy4_temp"));
        setSciWaterCond((float) particle.get("sci_water_cond"));
        setSciWaterPressure((float) particle.get("sci_water_pressure"));
        setSciWaterTemp((float) particle.get("sci_water_temp"));
    }

    public double getMPresentTime() {
        return mPresentTime;
    }

    public void setMPresentTime(double mPresentTime) {
        this.mPresentTime = mPresentTime;
    }
    public float getMPresentSecsIntoMission() {
        return mPresentSecsIntoMission;
    }

    public void setMPresentSecsIntoMission(float mPresentSecsIntoMission) {
        this.mPresentSecsIntoMission = mPresentSecsIntoMission;
    }
    public double getSciMPresentTime() {
        return sciMPresentTime;
    }

    public void setSciMPresentTime(double sciMPresentTime) {
        this.sciMPresentTime = sciMPresentTime;
    }
    public float getSciMPresentSecsIntoMission() {
        return sciMPresentSecsIntoMission;
    }

    public void setSciMPresentSecsIntoMission(float sciMPresentSecsIntoMission) {
        this.sciMPresentSecsIntoMission = sciMPresentSecsIntoMission;
    }
    public float getSciOxy4Oxygen() {
        return sciOxy4Oxygen;
    }

    public void setSciOxy4Oxygen(float sciOxy4Oxygen) {
        this.sciOxy4Oxygen = sciOxy4Oxygen;
    }
    public float getSciOxy4Saturation() {
        return sciOxy4Saturation;
    }

    public void setSciOxy4Saturation(float sciOxy4Saturation) {
        this.sciOxy4Saturation = sciOxy4Saturation;
    }
    public double getSciOxy4Timestamp() {
        return sciOxy4Timestamp;
    }

    public void setSciOxy4Timestamp(double sciOxy4Timestamp) {
        this.sciOxy4Timestamp = sciOxy4Timestamp;
    }
    public float getSciOxy4C1amp() {
        return sciOxy4C1amp;
    }

    public void setSciOxy4C1amp(float sciOxy4C1amp) {
        this.sciOxy4C1amp = sciOxy4C1amp;
    }
    public float getSciOxy4C1rph() {
        return sciOxy4C1rph;
    }

    public void setSciOxy4C1rph(float sciOxy4C1rph) {
        this.sciOxy4C1rph = sciOxy4C1rph;
    }
    public float getSciOxy4C2amp() {
        return sciOxy4C2amp;
    }

    public void setSciOxy4C2amp(float sciOxy4C2amp) {
        this.sciOxy4C2amp = sciOxy4C2amp;
    }
    public float getSciOxy4C2rph() {
        return sciOxy4C2rph;
    }

    public void setSciOxy4C2rph(float sciOxy4C2rph) {
        this.sciOxy4C2rph = sciOxy4C2rph;
    }
    public float getSciOxy4Calphase() {
        return sciOxy4Calphase;
    }

    public void setSciOxy4Calphase(float sciOxy4Calphase) {
        this.sciOxy4Calphase = sciOxy4Calphase;
    }
    public float getSciOxy4Rawtemp() {
        return sciOxy4Rawtemp;
    }

    public void setSciOxy4Rawtemp(float sciOxy4Rawtemp) {
        this.sciOxy4Rawtemp = sciOxy4Rawtemp;
    }
    public float getSciOxy4Tcphase() {
        return sciOxy4Tcphase;
    }

    public void setSciOxy4Tcphase(float sciOxy4Tcphase) {
        this.sciOxy4Tcphase = sciOxy4Tcphase;
    }
    public float getSciOxy4Temp() {
        return sciOxy4Temp;
    }

    public void setSciOxy4Temp(float sciOxy4Temp) {
        this.sciOxy4Temp = sciOxy4Temp;
    }
    public float getSciWaterCond() {
        return sciWaterCond;
    }

    public void setSciWaterCond(float sciWaterCond) {
        this.sciWaterCond = sciWaterCond;
    }
    public float getSciWaterPressure() {
        return sciWaterPressure;
    }

    public void setSciWaterPressure(float sciWaterPressure) {
        this.sciWaterPressure = sciWaterPressure;
    }
    public float getSciWaterTemp() {
        return sciWaterTemp;
    }

    public void setSciWaterTemp(float sciWaterTemp) {
        this.sciWaterTemp = sciWaterTemp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}