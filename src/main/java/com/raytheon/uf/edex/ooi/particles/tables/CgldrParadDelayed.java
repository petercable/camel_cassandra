package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cgldr_parad_delayed")
public class CgldrParadDelayed extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "m_gps_lat")
    private float mGpsLat;

    @Column(value = "m_gps_lon")
    private float mGpsLon;

    @Column(value = "m_lat")
    private float mLat;

    @Column(value = "m_lon")
    private float mLon;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMPresentTime((double) particle.get("m_present_time"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setSciMPresentTime((double) particle.get("sci_m_present_time"));
        setSciMPresentSecsIntoMission((float) particle.get("sci_m_present_secs_into_mission"));
        setMGpsLat((float) particle.get("m_gps_lat"));
        setMGpsLon((float) particle.get("m_gps_lon"));
        setMLat((float) particle.get("m_lat"));
        setMLon((float) particle.get("m_lon"));
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
    public float getMGpsLat() {
        return mGpsLat;
    }

    public void setMGpsLat(float mGpsLat) {
        this.mGpsLat = mGpsLat;
    }
    public float getMGpsLon() {
        return mGpsLon;
    }

    public void setMGpsLon(float mGpsLon) {
        this.mGpsLon = mGpsLon;
    }
    public float getMLat() {
        return mLat;
    }

    public void setMLat(float mLat) {
        this.mLat = mLat;
    }
    public float getMLon() {
        return mLon;
    }

    public void setMLon(float mLon) {
        this.mLon = mLon;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}