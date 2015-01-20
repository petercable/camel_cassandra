package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdgv_m_glider_instrument")
public class CtdgvMGliderInstrument extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "sci_ctd41cp_timestamp")
    private double sciCtd41cpTimestamp;

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
        setSciCtd41cpTimestamp((double) particle.get("sci_ctd41cp_timestamp"));
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
    public double getSciCtd41cpTimestamp() {
        return sciCtd41cpTimestamp;
    }

    public void setSciCtd41cpTimestamp(double sciCtd41cpTimestamp) {
        this.sciCtd41cpTimestamp = sciCtd41cpTimestamp;
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