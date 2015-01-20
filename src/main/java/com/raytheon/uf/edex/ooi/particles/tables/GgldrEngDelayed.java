package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ggldr_eng_delayed")
public class GgldrEngDelayed extends CassandraParticle {

    @Column(value = "c_battpos")
    private float cBattpos;

    @Column(value = "c_wpt_lat")
    private float cWptLat;

    @Column(value = "c_wpt_lon")
    private float cWptLon;

    @Column(value = "m_battpos")
    private float mBattpos;

    @Column(value = "m_coulomb_amphr_total")
    private float mCoulombAmphrTotal;

    @Column(value = "m_coulomb_current")
    private float mCoulombCurrent;

    @Column(value = "m_depth")
    private float mDepth;

    @Column(value = "m_de_oil_vol")
    private float mDeOilVol;

    @Column(value = "m_gps_lat")
    private float mGpsLat;

    @Column(value = "m_gps_lon")
    private float mGpsLon;

    @Column(value = "m_heading")
    private float mHeading;

    @Column(value = "m_lat")
    private float mLat;

    @Column(value = "m_lon")
    private float mLon;

    @Column(value = "m_pitch")
    private float mPitch;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_speed")
    private float mSpeed;

    @Column(value = "m_water_vx")
    private float mWaterVx;

    @Column(value = "m_water_vy")
    private float mWaterVy;

    @Column(value = "x_low_power_status")
    private float xLowPowerStatus;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setCBattpos((float) particle.get("c_battpos"));
        setCWptLat((float) particle.get("c_wpt_lat"));
        setCWptLon((float) particle.get("c_wpt_lon"));
        setMBattpos((float) particle.get("m_battpos"));
        setMCoulombAmphrTotal((float) particle.get("m_coulomb_amphr_total"));
        setMCoulombCurrent((float) particle.get("m_coulomb_current"));
        setMDepth((float) particle.get("m_depth"));
        setMDeOilVol((float) particle.get("m_de_oil_vol"));
        setMGpsLat((float) particle.get("m_gps_lat"));
        setMGpsLon((float) particle.get("m_gps_lon"));
        setMHeading((float) particle.get("m_heading"));
        setMLat((float) particle.get("m_lat"));
        setMLon((float) particle.get("m_lon"));
        setMPitch((float) particle.get("m_pitch"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setMPresentTime((double) particle.get("m_present_time"));
        setMSpeed((float) particle.get("m_speed"));
        setMWaterVx((float) particle.get("m_water_vx"));
        setMWaterVy((float) particle.get("m_water_vy"));
        setXLowPowerStatus((float) particle.get("x_low_power_status"));
    }

    public float getCBattpos() {
        return cBattpos;
    }

    public void setCBattpos(float cBattpos) {
        this.cBattpos = cBattpos;
    }
    public float getCWptLat() {
        return cWptLat;
    }

    public void setCWptLat(float cWptLat) {
        this.cWptLat = cWptLat;
    }
    public float getCWptLon() {
        return cWptLon;
    }

    public void setCWptLon(float cWptLon) {
        this.cWptLon = cWptLon;
    }
    public float getMBattpos() {
        return mBattpos;
    }

    public void setMBattpos(float mBattpos) {
        this.mBattpos = mBattpos;
    }
    public float getMCoulombAmphrTotal() {
        return mCoulombAmphrTotal;
    }

    public void setMCoulombAmphrTotal(float mCoulombAmphrTotal) {
        this.mCoulombAmphrTotal = mCoulombAmphrTotal;
    }
    public float getMCoulombCurrent() {
        return mCoulombCurrent;
    }

    public void setMCoulombCurrent(float mCoulombCurrent) {
        this.mCoulombCurrent = mCoulombCurrent;
    }
    public float getMDepth() {
        return mDepth;
    }

    public void setMDepth(float mDepth) {
        this.mDepth = mDepth;
    }
    public float getMDeOilVol() {
        return mDeOilVol;
    }

    public void setMDeOilVol(float mDeOilVol) {
        this.mDeOilVol = mDeOilVol;
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
    public float getMHeading() {
        return mHeading;
    }

    public void setMHeading(float mHeading) {
        this.mHeading = mHeading;
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
    public float getMPitch() {
        return mPitch;
    }

    public void setMPitch(float mPitch) {
        this.mPitch = mPitch;
    }
    public float getMPresentSecsIntoMission() {
        return mPresentSecsIntoMission;
    }

    public void setMPresentSecsIntoMission(float mPresentSecsIntoMission) {
        this.mPresentSecsIntoMission = mPresentSecsIntoMission;
    }
    public double getMPresentTime() {
        return mPresentTime;
    }

    public void setMPresentTime(double mPresentTime) {
        this.mPresentTime = mPresentTime;
    }
    public float getMSpeed() {
        return mSpeed;
    }

    public void setMSpeed(float mSpeed) {
        this.mSpeed = mSpeed;
    }
    public float getMWaterVx() {
        return mWaterVx;
    }

    public void setMWaterVx(float mWaterVx) {
        this.mWaterVx = mWaterVx;
    }
    public float getMWaterVy() {
        return mWaterVy;
    }

    public void setMWaterVy(float mWaterVy) {
        this.mWaterVy = mWaterVy;
    }
    public float getXLowPowerStatus() {
        return xLowPowerStatus;
    }

    public void setXLowPowerStatus(float xLowPowerStatus) {
        this.xLowPowerStatus = xLowPowerStatus;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}