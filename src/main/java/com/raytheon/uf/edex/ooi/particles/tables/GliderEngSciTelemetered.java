package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "glider_eng_sci_telemetered")
public class GliderEngSciTelemetered extends CassandraParticle {

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "sci_m_disk_free")
    private float sciMDiskFree;

    @Column(value = "sci_m_disk_usage")
    private float sciMDiskUsage;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSciMPresentTime((double) particle.get("sci_m_present_time"));
        setSciMPresentSecsIntoMission((float) particle.get("sci_m_present_secs_into_mission"));
        setSciMDiskFree((float) particle.get("sci_m_disk_free"));
        setSciMDiskUsage((float) particle.get("sci_m_disk_usage"));
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
    public float getSciMDiskFree() {
        return sciMDiskFree;
    }

    public void setSciMDiskFree(float sciMDiskFree) {
        this.sciMDiskFree = sciMDiskFree;
    }
    public float getSciMDiskUsage() {
        return sciMDiskUsage;
    }

    public void setSciMDiskUsage(float sciMDiskUsage) {
        this.sciMDiskUsage = sciMDiskUsage;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}