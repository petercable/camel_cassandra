package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flord_m_glider_instrument")
public class FlordMGliderInstrument extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "sci_flbb_timestamp")
    private double sciFlbbTimestamp;

    @Column(value = "sci_flbb_bb_ref")
    private float sciFlbbBbRef;

    @Column(value = "sci_flbb_bb_sig")
    private float sciFlbbBbSig;

    @Column(value = "sci_flbb_bb_units")
    private float sciFlbbBbUnits;

    @Column(value = "sci_flbb_chlor_ref")
    private float sciFlbbChlorRef;

    @Column(value = "sci_flbb_chlor_sig")
    private float sciFlbbChlorSig;

    @Column(value = "sci_flbb_chlor_units")
    private float sciFlbbChlorUnits;

    @Column(value = "sci_flbb_therm")
    private float sciFlbbTherm;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMPresentTime((double) particle.get("m_present_time"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setSciMPresentTime((double) particle.get("sci_m_present_time"));
        setSciMPresentSecsIntoMission((float) particle.get("sci_m_present_secs_into_mission"));
        setSciFlbbTimestamp((double) particle.get("sci_flbb_timestamp"));
        setSciFlbbBbRef((float) particle.get("sci_flbb_bb_ref"));
        setSciFlbbBbSig((float) particle.get("sci_flbb_bb_sig"));
        setSciFlbbBbUnits((float) particle.get("sci_flbb_bb_units"));
        setSciFlbbChlorRef((float) particle.get("sci_flbb_chlor_ref"));
        setSciFlbbChlorSig((float) particle.get("sci_flbb_chlor_sig"));
        setSciFlbbChlorUnits((float) particle.get("sci_flbb_chlor_units"));
        setSciFlbbTherm((float) particle.get("sci_flbb_therm"));
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
    public double getSciFlbbTimestamp() {
        return sciFlbbTimestamp;
    }

    public void setSciFlbbTimestamp(double sciFlbbTimestamp) {
        this.sciFlbbTimestamp = sciFlbbTimestamp;
    }
    public float getSciFlbbBbRef() {
        return sciFlbbBbRef;
    }

    public void setSciFlbbBbRef(float sciFlbbBbRef) {
        this.sciFlbbBbRef = sciFlbbBbRef;
    }
    public float getSciFlbbBbSig() {
        return sciFlbbBbSig;
    }

    public void setSciFlbbBbSig(float sciFlbbBbSig) {
        this.sciFlbbBbSig = sciFlbbBbSig;
    }
    public float getSciFlbbBbUnits() {
        return sciFlbbBbUnits;
    }

    public void setSciFlbbBbUnits(float sciFlbbBbUnits) {
        this.sciFlbbBbUnits = sciFlbbBbUnits;
    }
    public float getSciFlbbChlorRef() {
        return sciFlbbChlorRef;
    }

    public void setSciFlbbChlorRef(float sciFlbbChlorRef) {
        this.sciFlbbChlorRef = sciFlbbChlorRef;
    }
    public float getSciFlbbChlorSig() {
        return sciFlbbChlorSig;
    }

    public void setSciFlbbChlorSig(float sciFlbbChlorSig) {
        this.sciFlbbChlorSig = sciFlbbChlorSig;
    }
    public float getSciFlbbChlorUnits() {
        return sciFlbbChlorUnits;
    }

    public void setSciFlbbChlorUnits(float sciFlbbChlorUnits) {
        this.sciFlbbChlorUnits = sciFlbbChlorUnits;
    }
    public float getSciFlbbTherm() {
        return sciFlbbTherm;
    }

    public void setSciFlbbTherm(float sciFlbbTherm) {
        this.sciFlbbTherm = sciFlbbTherm;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}