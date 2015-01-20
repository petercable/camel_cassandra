package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flort_m_glider_instrument")
public class FlortMGliderInstrument extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "sci_flbbcd_bb_units")
    private float sciFlbbcdBbUnits;

    @Column(value = "sci_flbbcd_cdom_units")
    private float sciFlbbcdCdomUnits;

    @Column(value = "sci_flbbcd_chlor_units")
    private float sciFlbbcdChlorUnits;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMPresentTime((double) particle.get("m_present_time"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setSciMPresentTime((double) particle.get("sci_m_present_time"));
        setSciMPresentSecsIntoMission((float) particle.get("sci_m_present_secs_into_mission"));
        setSciFlbbcdBbUnits((float) particle.get("sci_flbbcd_bb_units"));
        setSciFlbbcdCdomUnits((float) particle.get("sci_flbbcd_cdom_units"));
        setSciFlbbcdChlorUnits((float) particle.get("sci_flbbcd_chlor_units"));
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
    public float getSciFlbbcdBbUnits() {
        return sciFlbbcdBbUnits;
    }

    public void setSciFlbbcdBbUnits(float sciFlbbcdBbUnits) {
        this.sciFlbbcdBbUnits = sciFlbbcdBbUnits;
    }
    public float getSciFlbbcdCdomUnits() {
        return sciFlbbcdCdomUnits;
    }

    public void setSciFlbbcdCdomUnits(float sciFlbbcdCdomUnits) {
        this.sciFlbbcdCdomUnits = sciFlbbcdCdomUnits;
    }
    public float getSciFlbbcdChlorUnits() {
        return sciFlbbcdChlorUnits;
    }

    public void setSciFlbbcdChlorUnits(float sciFlbbcdChlorUnits) {
        this.sciFlbbcdChlorUnits = sciFlbbcdChlorUnits;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}