package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "glider_eng_telemetered")
public class GliderEngTelemetered extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "m_gps_lat")
    private float mGpsLat;

    @Column(value = "m_gps_lon")
    private float mGpsLon;

    @Column(value = "m_lat")
    private float mLat;

    @Column(value = "m_lon")
    private float mLon;

    @Column(value = "c_battpos")
    private float cBattpos;

    @Column(value = "c_ballast_pumped")
    private float cBallastPumped;

    @Column(value = "c_de_oil_vol")
    private float cDeOilVol;

    @Column(value = "c_dvl_on")
    private float cDvlOn;

    @Column(value = "c_heading")
    private float cHeading;

    @Column(value = "c_pitch")
    private float cPitch;

    @Column(value = "c_wpt_lat")
    private float cWptLat;

    @Column(value = "c_wpt_lon")
    private float cWptLon;

    @Column(value = "m_air_pump")
    private int mAirPump;

    @Column(value = "m_altitude")
    private float mAltitude;

    @Column(value = "m_ballast_pumped")
    private float mBallastPumped;

    @Column(value = "m_battery")
    private float mBattery;

    @Column(value = "m_battpos")
    private float mBattpos;

    @Column(value = "m_coulomb_amphr")
    private float mCoulombAmphr;

    @Column(value = "m_coulomb_amphr_total")
    private float mCoulombAmphrTotal;

    @Column(value = "m_coulomb_current")
    private float mCoulombCurrent;

    @Column(value = "m_depth")
    private float mDepth;

    @Column(value = "m_de_oil_vol")
    private float mDeOilVol;

    @Column(value = "m_fin")
    private float mFin;

    @Column(value = "m_heading")
    private float mHeading;

    @Column(value = "m_lithium_battery_relative_charge")
    private float mLithiumBatteryRelativeCharge;

    @Column(value = "m_pitch")
    private float mPitch;

    @Column(value = "m_pressure")
    private float mPressure;

    @Column(value = "m_speed")
    private float mSpeed;

    @Column(value = "m_raw_altitude")
    private float mRawAltitude;

    @Column(value = "m_roll")
    private float mRoll;

    @Column(value = "m_vacuum")
    private float mVacuum;

    @Column(value = "m_water_depth")
    private float mWaterDepth;

    @Column(value = "m_water_vx")
    private float mWaterVx;

    @Column(value = "m_water_vy")
    private float mWaterVy;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMPresentTime((double) particle.get("m_present_time"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setMGpsLat((float) particle.get("m_gps_lat"));
        setMGpsLon((float) particle.get("m_gps_lon"));
        setMLat((float) particle.get("m_lat"));
        setMLon((float) particle.get("m_lon"));
        setCBattpos((float) particle.get("c_battpos"));
        setCBallastPumped((float) particle.get("c_ballast_pumped"));
        setCDeOilVol((float) particle.get("c_de_oil_vol"));
        setCDvlOn((float) particle.get("c_dvl_on"));
        setCHeading((float) particle.get("c_heading"));
        setCPitch((float) particle.get("c_pitch"));
        setCWptLat((float) particle.get("c_wpt_lat"));
        setCWptLon((float) particle.get("c_wpt_lon"));
        setMAirPump((int) particle.get("m_air_pump"));
        setMAltitude((float) particle.get("m_altitude"));
        setMBallastPumped((float) particle.get("m_ballast_pumped"));
        setMBattery((float) particle.get("m_battery"));
        setMBattpos((float) particle.get("m_battpos"));
        setMCoulombAmphr((float) particle.get("m_coulomb_amphr"));
        setMCoulombAmphrTotal((float) particle.get("m_coulomb_amphr_total"));
        setMCoulombCurrent((float) particle.get("m_coulomb_current"));
        setMDepth((float) particle.get("m_depth"));
        setMDeOilVol((float) particle.get("m_de_oil_vol"));
        setMFin((float) particle.get("m_fin"));
        setMHeading((float) particle.get("m_heading"));
        setMLithiumBatteryRelativeCharge((float) particle.get("m_lithium_battery_relative_charge"));
        setMPitch((float) particle.get("m_pitch"));
        setMPressure((float) particle.get("m_pressure"));
        setMSpeed((float) particle.get("m_speed"));
        setMRawAltitude((float) particle.get("m_raw_altitude"));
        setMRoll((float) particle.get("m_roll"));
        setMVacuum((float) particle.get("m_vacuum"));
        setMWaterDepth((float) particle.get("m_water_depth"));
        setMWaterVx((float) particle.get("m_water_vx"));
        setMWaterVy((float) particle.get("m_water_vy"));
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
    public float getCBattpos() {
        return cBattpos;
    }

    public void setCBattpos(float cBattpos) {
        this.cBattpos = cBattpos;
    }
    public float getCBallastPumped() {
        return cBallastPumped;
    }

    public void setCBallastPumped(float cBallastPumped) {
        this.cBallastPumped = cBallastPumped;
    }
    public float getCDeOilVol() {
        return cDeOilVol;
    }

    public void setCDeOilVol(float cDeOilVol) {
        this.cDeOilVol = cDeOilVol;
    }
    public float getCDvlOn() {
        return cDvlOn;
    }

    public void setCDvlOn(float cDvlOn) {
        this.cDvlOn = cDvlOn;
    }
    public float getCHeading() {
        return cHeading;
    }

    public void setCHeading(float cHeading) {
        this.cHeading = cHeading;
    }
    public float getCPitch() {
        return cPitch;
    }

    public void setCPitch(float cPitch) {
        this.cPitch = cPitch;
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
    public int getMAirPump() {
        return mAirPump;
    }

    public void setMAirPump(int mAirPump) {
        this.mAirPump = mAirPump;
    }
    public float getMAltitude() {
        return mAltitude;
    }

    public void setMAltitude(float mAltitude) {
        this.mAltitude = mAltitude;
    }
    public float getMBallastPumped() {
        return mBallastPumped;
    }

    public void setMBallastPumped(float mBallastPumped) {
        this.mBallastPumped = mBallastPumped;
    }
    public float getMBattery() {
        return mBattery;
    }

    public void setMBattery(float mBattery) {
        this.mBattery = mBattery;
    }
    public float getMBattpos() {
        return mBattpos;
    }

    public void setMBattpos(float mBattpos) {
        this.mBattpos = mBattpos;
    }
    public float getMCoulombAmphr() {
        return mCoulombAmphr;
    }

    public void setMCoulombAmphr(float mCoulombAmphr) {
        this.mCoulombAmphr = mCoulombAmphr;
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
    public float getMFin() {
        return mFin;
    }

    public void setMFin(float mFin) {
        this.mFin = mFin;
    }
    public float getMHeading() {
        return mHeading;
    }

    public void setMHeading(float mHeading) {
        this.mHeading = mHeading;
    }
    public float getMLithiumBatteryRelativeCharge() {
        return mLithiumBatteryRelativeCharge;
    }

    public void setMLithiumBatteryRelativeCharge(float mLithiumBatteryRelativeCharge) {
        this.mLithiumBatteryRelativeCharge = mLithiumBatteryRelativeCharge;
    }
    public float getMPitch() {
        return mPitch;
    }

    public void setMPitch(float mPitch) {
        this.mPitch = mPitch;
    }
    public float getMPressure() {
        return mPressure;
    }

    public void setMPressure(float mPressure) {
        this.mPressure = mPressure;
    }
    public float getMSpeed() {
        return mSpeed;
    }

    public void setMSpeed(float mSpeed) {
        this.mSpeed = mSpeed;
    }
    public float getMRawAltitude() {
        return mRawAltitude;
    }

    public void setMRawAltitude(float mRawAltitude) {
        this.mRawAltitude = mRawAltitude;
    }
    public float getMRoll() {
        return mRoll;
    }

    public void setMRoll(float mRoll) {
        this.mRoll = mRoll;
    }
    public float getMVacuum() {
        return mVacuum;
    }

    public void setMVacuum(float mVacuum) {
        this.mVacuum = mVacuum;
    }
    public float getMWaterDepth() {
        return mWaterDepth;
    }

    public void setMWaterDepth(float mWaterDepth) {
        this.mWaterDepth = mWaterDepth;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}