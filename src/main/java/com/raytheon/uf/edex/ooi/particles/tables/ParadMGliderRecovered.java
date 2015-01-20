package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "parad_m_glider_recovered")
public class ParadMGliderRecovered extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "sci_bsipar_par")
    private float sciBsiparPar;

    @Column(value = "sci_bsipar_sensor_volts")
    private float sciBsiparSensorVolts;

    @Column(value = "sci_bsipar_supply_volts")
    private float sciBsiparSupplyVolts;

    @Column(value = "sci_bsipar_temp")
    private float sciBsiparTemp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMPresentTime((double) particle.get("m_present_time"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setSciMPresentTime((double) particle.get("sci_m_present_time"));
        setSciMPresentSecsIntoMission((float) particle.get("sci_m_present_secs_into_mission"));
        setSciBsiparPar((float) particle.get("sci_bsipar_par"));
        setSciBsiparSensorVolts((float) particle.get("sci_bsipar_sensor_volts"));
        setSciBsiparSupplyVolts((float) particle.get("sci_bsipar_supply_volts"));
        setSciBsiparTemp((float) particle.get("sci_bsipar_temp"));
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
    public float getSciBsiparPar() {
        return sciBsiparPar;
    }

    public void setSciBsiparPar(float sciBsiparPar) {
        this.sciBsiparPar = sciBsiparPar;
    }
    public float getSciBsiparSensorVolts() {
        return sciBsiparSensorVolts;
    }

    public void setSciBsiparSensorVolts(float sciBsiparSensorVolts) {
        this.sciBsiparSensorVolts = sciBsiparSensorVolts;
    }
    public float getSciBsiparSupplyVolts() {
        return sciBsiparSupplyVolts;
    }

    public void setSciBsiparSupplyVolts(float sciBsiparSupplyVolts) {
        this.sciBsiparSupplyVolts = sciBsiparSupplyVolts;
    }
    public float getSciBsiparTemp() {
        return sciBsiparTemp;
    }

    public void setSciBsiparTemp(float sciBsiparTemp) {
        this.sciBsiparTemp = sciBsiparTemp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}