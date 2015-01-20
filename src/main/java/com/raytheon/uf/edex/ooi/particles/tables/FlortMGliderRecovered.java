package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flort_m_glider_recovered")
public class FlortMGliderRecovered extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "sci_flbbcd_timestamp")
    private double sciFlbbcdTimestamp;

    @Column(value = "sci_flbbcd_bb_ref")
    private float sciFlbbcdBbRef;

    @Column(value = "sci_flbbcd_bb_sig")
    private float sciFlbbcdBbSig;

    @Column(value = "sci_flbbcd_bb_units")
    private float sciFlbbcdBbUnits;

    @Column(value = "sci_flbbcd_cdom_ref")
    private float sciFlbbcdCdomRef;

    @Column(value = "sci_flbbcd_cdom_sig")
    private float sciFlbbcdCdomSig;

    @Column(value = "sci_flbbcd_cdom_units")
    private float sciFlbbcdCdomUnits;

    @Column(value = "sci_flbbcd_chlor_ref")
    private float sciFlbbcdChlorRef;

    @Column(value = "sci_flbbcd_chlor_sig")
    private float sciFlbbcdChlorSig;

    @Column(value = "sci_flbbcd_chlor_units")
    private float sciFlbbcdChlorUnits;

    @Column(value = "sci_flbbcd_therm")
    private float sciFlbbcdTherm;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMPresentTime((double) particle.get("m_present_time"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setSciMPresentTime((double) particle.get("sci_m_present_time"));
        setSciMPresentSecsIntoMission((float) particle.get("sci_m_present_secs_into_mission"));
        setSciFlbbcdTimestamp((double) particle.get("sci_flbbcd_timestamp"));
        setSciFlbbcdBbRef((float) particle.get("sci_flbbcd_bb_ref"));
        setSciFlbbcdBbSig((float) particle.get("sci_flbbcd_bb_sig"));
        setSciFlbbcdBbUnits((float) particle.get("sci_flbbcd_bb_units"));
        setSciFlbbcdCdomRef((float) particle.get("sci_flbbcd_cdom_ref"));
        setSciFlbbcdCdomSig((float) particle.get("sci_flbbcd_cdom_sig"));
        setSciFlbbcdCdomUnits((float) particle.get("sci_flbbcd_cdom_units"));
        setSciFlbbcdChlorRef((float) particle.get("sci_flbbcd_chlor_ref"));
        setSciFlbbcdChlorSig((float) particle.get("sci_flbbcd_chlor_sig"));
        setSciFlbbcdChlorUnits((float) particle.get("sci_flbbcd_chlor_units"));
        setSciFlbbcdTherm((float) particle.get("sci_flbbcd_therm"));
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
    public double getSciFlbbcdTimestamp() {
        return sciFlbbcdTimestamp;
    }

    public void setSciFlbbcdTimestamp(double sciFlbbcdTimestamp) {
        this.sciFlbbcdTimestamp = sciFlbbcdTimestamp;
    }
    public float getSciFlbbcdBbRef() {
        return sciFlbbcdBbRef;
    }

    public void setSciFlbbcdBbRef(float sciFlbbcdBbRef) {
        this.sciFlbbcdBbRef = sciFlbbcdBbRef;
    }
    public float getSciFlbbcdBbSig() {
        return sciFlbbcdBbSig;
    }

    public void setSciFlbbcdBbSig(float sciFlbbcdBbSig) {
        this.sciFlbbcdBbSig = sciFlbbcdBbSig;
    }
    public float getSciFlbbcdBbUnits() {
        return sciFlbbcdBbUnits;
    }

    public void setSciFlbbcdBbUnits(float sciFlbbcdBbUnits) {
        this.sciFlbbcdBbUnits = sciFlbbcdBbUnits;
    }
    public float getSciFlbbcdCdomRef() {
        return sciFlbbcdCdomRef;
    }

    public void setSciFlbbcdCdomRef(float sciFlbbcdCdomRef) {
        this.sciFlbbcdCdomRef = sciFlbbcdCdomRef;
    }
    public float getSciFlbbcdCdomSig() {
        return sciFlbbcdCdomSig;
    }

    public void setSciFlbbcdCdomSig(float sciFlbbcdCdomSig) {
        this.sciFlbbcdCdomSig = sciFlbbcdCdomSig;
    }
    public float getSciFlbbcdCdomUnits() {
        return sciFlbbcdCdomUnits;
    }

    public void setSciFlbbcdCdomUnits(float sciFlbbcdCdomUnits) {
        this.sciFlbbcdCdomUnits = sciFlbbcdCdomUnits;
    }
    public float getSciFlbbcdChlorRef() {
        return sciFlbbcdChlorRef;
    }

    public void setSciFlbbcdChlorRef(float sciFlbbcdChlorRef) {
        this.sciFlbbcdChlorRef = sciFlbbcdChlorRef;
    }
    public float getSciFlbbcdChlorSig() {
        return sciFlbbcdChlorSig;
    }

    public void setSciFlbbcdChlorSig(float sciFlbbcdChlorSig) {
        this.sciFlbbcdChlorSig = sciFlbbcdChlorSig;
    }
    public float getSciFlbbcdChlorUnits() {
        return sciFlbbcdChlorUnits;
    }

    public void setSciFlbbcdChlorUnits(float sciFlbbcdChlorUnits) {
        this.sciFlbbcdChlorUnits = sciFlbbcdChlorUnits;
    }
    public float getSciFlbbcdTherm() {
        return sciFlbbcdTherm;
    }

    public void setSciFlbbcdTherm(float sciFlbbcdTherm) {
        this.sciFlbbcdTherm = sciFlbbcdTherm;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}