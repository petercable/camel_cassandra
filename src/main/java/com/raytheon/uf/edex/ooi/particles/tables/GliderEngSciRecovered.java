package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "glider_eng_sci_recovered")
public class GliderEngSciRecovered extends CassandraParticle {

    @Column(value = "sci_m_present_time")
    private double sciMPresentTime;

    @Column(value = "sci_m_present_secs_into_mission")
    private float sciMPresentSecsIntoMission;

    @Column(value = "sci_m_disk_free")
    private float sciMDiskFree;

    @Column(value = "sci_m_disk_usage")
    private float sciMDiskUsage;

    @Column(value = "sci_m_free_heap")
    private float sciMFreeHeap;

    @Column(value = "sci_m_min_free_heap")
    private float sciMMinFreeHeap;

    @Column(value = "sci_m_min_spare_heap")
    private float sciMMinSpareHeap;

    @Column(value = "sci_m_science_on")
    private int sciMScienceOn;

    @Column(value = "sci_ctd41cp_is_installed")
    private int sciCtd41cpIsInstalled;

    @Column(value = "sci_bsipar_is_installed")
    private int sciBsiparIsInstalled;

    @Column(value = "sci_flbbcd_is_installed")
    private int sciFlbbcdIsInstalled;

    @Column(value = "sci_oxy3835_wphase_is_installed")
    private int sciOxy3835WphaseIsInstalled;

    @Column(value = "sci_oxy4_is_installed")
    private int sciOxy4IsInstalled;

    @Column(value = "sci_dvl_is_installed")
    private int sciDvlIsInstalled;

    @Column(value = "sci_m_spare_heap")
    private float sciMSpareHeap;

    @Column(value = "sci_reqd_heartbeat")
    private float sciReqdHeartbeat;

    @Column(value = "sci_software_ver")
    private float sciSoftwareVer;

    @Column(value = "sci_wants_comms")
    private int sciWantsComms;

    @Column(value = "sci_wants_surface")
    private int sciWantsSurface;

    @Column(value = "sci_x_disk_files_removed")
    private float sciXDiskFilesRemoved;

    @Column(value = "sci_x_sent_data_files")
    private float sciXSentDataFiles;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSciMPresentTime((double) particle.get("sci_m_present_time"));
        setSciMPresentSecsIntoMission((float) particle.get("sci_m_present_secs_into_mission"));
        setSciMDiskFree((float) particle.get("sci_m_disk_free"));
        setSciMDiskUsage((float) particle.get("sci_m_disk_usage"));
        setSciMFreeHeap((float) particle.get("sci_m_free_heap"));
        setSciMMinFreeHeap((float) particle.get("sci_m_min_free_heap"));
        setSciMMinSpareHeap((float) particle.get("sci_m_min_spare_heap"));
        setSciMScienceOn((int) particle.get("sci_m_science_on"));
        setSciCtd41cpIsInstalled((int) particle.get("sci_ctd41cp_is_installed"));
        setSciBsiparIsInstalled((int) particle.get("sci_bsipar_is_installed"));
        setSciFlbbcdIsInstalled((int) particle.get("sci_flbbcd_is_installed"));
        setSciOxy3835WphaseIsInstalled((int) particle.get("sci_oxy3835_wphase_is_installed"));
        setSciOxy4IsInstalled((int) particle.get("sci_oxy4_is_installed"));
        setSciDvlIsInstalled((int) particle.get("sci_dvl_is_installed"));
        setSciMSpareHeap((float) particle.get("sci_m_spare_heap"));
        setSciReqdHeartbeat((float) particle.get("sci_reqd_heartbeat"));
        setSciSoftwareVer((float) particle.get("sci_software_ver"));
        setSciWantsComms((int) particle.get("sci_wants_comms"));
        setSciWantsSurface((int) particle.get("sci_wants_surface"));
        setSciXDiskFilesRemoved((float) particle.get("sci_x_disk_files_removed"));
        setSciXSentDataFiles((float) particle.get("sci_x_sent_data_files"));
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
    public float getSciMFreeHeap() {
        return sciMFreeHeap;
    }

    public void setSciMFreeHeap(float sciMFreeHeap) {
        this.sciMFreeHeap = sciMFreeHeap;
    }
    public float getSciMMinFreeHeap() {
        return sciMMinFreeHeap;
    }

    public void setSciMMinFreeHeap(float sciMMinFreeHeap) {
        this.sciMMinFreeHeap = sciMMinFreeHeap;
    }
    public float getSciMMinSpareHeap() {
        return sciMMinSpareHeap;
    }

    public void setSciMMinSpareHeap(float sciMMinSpareHeap) {
        this.sciMMinSpareHeap = sciMMinSpareHeap;
    }
    public int getSciMScienceOn() {
        return sciMScienceOn;
    }

    public void setSciMScienceOn(int sciMScienceOn) {
        this.sciMScienceOn = sciMScienceOn;
    }
    public int getSciCtd41cpIsInstalled() {
        return sciCtd41cpIsInstalled;
    }

    public void setSciCtd41cpIsInstalled(int sciCtd41cpIsInstalled) {
        this.sciCtd41cpIsInstalled = sciCtd41cpIsInstalled;
    }
    public int getSciBsiparIsInstalled() {
        return sciBsiparIsInstalled;
    }

    public void setSciBsiparIsInstalled(int sciBsiparIsInstalled) {
        this.sciBsiparIsInstalled = sciBsiparIsInstalled;
    }
    public int getSciFlbbcdIsInstalled() {
        return sciFlbbcdIsInstalled;
    }

    public void setSciFlbbcdIsInstalled(int sciFlbbcdIsInstalled) {
        this.sciFlbbcdIsInstalled = sciFlbbcdIsInstalled;
    }
    public int getSciOxy3835WphaseIsInstalled() {
        return sciOxy3835WphaseIsInstalled;
    }

    public void setSciOxy3835WphaseIsInstalled(int sciOxy3835WphaseIsInstalled) {
        this.sciOxy3835WphaseIsInstalled = sciOxy3835WphaseIsInstalled;
    }
    public int getSciOxy4IsInstalled() {
        return sciOxy4IsInstalled;
    }

    public void setSciOxy4IsInstalled(int sciOxy4IsInstalled) {
        this.sciOxy4IsInstalled = sciOxy4IsInstalled;
    }
    public int getSciDvlIsInstalled() {
        return sciDvlIsInstalled;
    }

    public void setSciDvlIsInstalled(int sciDvlIsInstalled) {
        this.sciDvlIsInstalled = sciDvlIsInstalled;
    }
    public float getSciMSpareHeap() {
        return sciMSpareHeap;
    }

    public void setSciMSpareHeap(float sciMSpareHeap) {
        this.sciMSpareHeap = sciMSpareHeap;
    }
    public float getSciReqdHeartbeat() {
        return sciReqdHeartbeat;
    }

    public void setSciReqdHeartbeat(float sciReqdHeartbeat) {
        this.sciReqdHeartbeat = sciReqdHeartbeat;
    }
    public float getSciSoftwareVer() {
        return sciSoftwareVer;
    }

    public void setSciSoftwareVer(float sciSoftwareVer) {
        this.sciSoftwareVer = sciSoftwareVer;
    }
    public int getSciWantsComms() {
        return sciWantsComms;
    }

    public void setSciWantsComms(int sciWantsComms) {
        this.sciWantsComms = sciWantsComms;
    }
    public int getSciWantsSurface() {
        return sciWantsSurface;
    }

    public void setSciWantsSurface(int sciWantsSurface) {
        this.sciWantsSurface = sciWantsSurface;
    }
    public float getSciXDiskFilesRemoved() {
        return sciXDiskFilesRemoved;
    }

    public void setSciXDiskFilesRemoved(float sciXDiskFilesRemoved) {
        this.sciXDiskFilesRemoved = sciXDiskFilesRemoved;
    }
    public float getSciXSentDataFiles() {
        return sciXSentDataFiles;
    }

    public void setSciXSentDataFiles(float sciXSentDataFiles) {
        this.sciXSentDataFiles = sciXSentDataFiles;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}