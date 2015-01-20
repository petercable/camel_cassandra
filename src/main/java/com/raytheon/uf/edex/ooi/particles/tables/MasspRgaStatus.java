package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "massp_rga_status")
public class MasspRgaStatus extends CassandraParticle {

    @Column(value = "massp_rga_device_id")
    private String masspRgaDeviceId;

    @Column(value = "massp_rga_electron_energy")
    private int masspRgaElectronEnergy;

    @Column(value = "massp_rga_ion_energy")
    private int masspRgaIonEnergy;

    @Column(value = "massp_rga_focus_voltage")
    private int masspRgaFocusVoltage;

    @Column(value = "massp_rga_filament_emission_set")
    private float masspRgaFilamentEmissionSet;

    @Column(value = "massp_rga_filament_emission_actual")
    private float masspRgaFilamentEmissionActual;

    @Column(value = "massp_rga_high_voltage_cdem")
    private int masspRgaHighVoltageCdem;

    @Column(value = "massp_rga_noise_floor")
    private int masspRgaNoiseFloor;

    @Column(value = "massp_rga_error_status")
    private int masspRgaErrorStatus;

    @Column(value = "massp_rga_steps_per_amu")
    private int masspRgaStepsPerAmu;

    @Column(value = "massp_rga_initial_mass")
    private int masspRgaInitialMass;

    @Column(value = "massp_rga_final_mass")
    private int masspRgaFinalMass;

    @Column(value = "massp_rga_readings_per_scan")
    private int masspRgaReadingsPerScan;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMasspRgaDeviceId((String) particle.get("massp_rga_device_id"));
        setMasspRgaElectronEnergy((int) particle.get("massp_rga_electron_energy"));
        setMasspRgaIonEnergy((int) particle.get("massp_rga_ion_energy"));
        setMasspRgaFocusVoltage((int) particle.get("massp_rga_focus_voltage"));
        setMasspRgaFilamentEmissionSet((float) particle.get("massp_rga_filament_emission_set"));
        setMasspRgaFilamentEmissionActual((float) particle.get("massp_rga_filament_emission_actual"));
        setMasspRgaHighVoltageCdem((int) particle.get("massp_rga_high_voltage_cdem"));
        setMasspRgaNoiseFloor((int) particle.get("massp_rga_noise_floor"));
        setMasspRgaErrorStatus((int) particle.get("massp_rga_error_status"));
        setMasspRgaStepsPerAmu((int) particle.get("massp_rga_steps_per_amu"));
        setMasspRgaInitialMass((int) particle.get("massp_rga_initial_mass"));
        setMasspRgaFinalMass((int) particle.get("massp_rga_final_mass"));
        setMasspRgaReadingsPerScan((int) particle.get("massp_rga_readings_per_scan"));
    }

    public String getMasspRgaDeviceId() {
        return masspRgaDeviceId;
    }

    public void setMasspRgaDeviceId(String masspRgaDeviceId) {
        this.masspRgaDeviceId = masspRgaDeviceId;
    }
    public int getMasspRgaElectronEnergy() {
        return masspRgaElectronEnergy;
    }

    public void setMasspRgaElectronEnergy(int masspRgaElectronEnergy) {
        this.masspRgaElectronEnergy = masspRgaElectronEnergy;
    }
    public int getMasspRgaIonEnergy() {
        return masspRgaIonEnergy;
    }

    public void setMasspRgaIonEnergy(int masspRgaIonEnergy) {
        this.masspRgaIonEnergy = masspRgaIonEnergy;
    }
    public int getMasspRgaFocusVoltage() {
        return masspRgaFocusVoltage;
    }

    public void setMasspRgaFocusVoltage(int masspRgaFocusVoltage) {
        this.masspRgaFocusVoltage = masspRgaFocusVoltage;
    }
    public float getMasspRgaFilamentEmissionSet() {
        return masspRgaFilamentEmissionSet;
    }

    public void setMasspRgaFilamentEmissionSet(float masspRgaFilamentEmissionSet) {
        this.masspRgaFilamentEmissionSet = masspRgaFilamentEmissionSet;
    }
    public float getMasspRgaFilamentEmissionActual() {
        return masspRgaFilamentEmissionActual;
    }

    public void setMasspRgaFilamentEmissionActual(float masspRgaFilamentEmissionActual) {
        this.masspRgaFilamentEmissionActual = masspRgaFilamentEmissionActual;
    }
    public int getMasspRgaHighVoltageCdem() {
        return masspRgaHighVoltageCdem;
    }

    public void setMasspRgaHighVoltageCdem(int masspRgaHighVoltageCdem) {
        this.masspRgaHighVoltageCdem = masspRgaHighVoltageCdem;
    }
    public int getMasspRgaNoiseFloor() {
        return masspRgaNoiseFloor;
    }

    public void setMasspRgaNoiseFloor(int masspRgaNoiseFloor) {
        this.masspRgaNoiseFloor = masspRgaNoiseFloor;
    }
    public int getMasspRgaErrorStatus() {
        return masspRgaErrorStatus;
    }

    public void setMasspRgaErrorStatus(int masspRgaErrorStatus) {
        this.masspRgaErrorStatus = masspRgaErrorStatus;
    }
    public int getMasspRgaStepsPerAmu() {
        return masspRgaStepsPerAmu;
    }

    public void setMasspRgaStepsPerAmu(int masspRgaStepsPerAmu) {
        this.masspRgaStepsPerAmu = masspRgaStepsPerAmu;
    }
    public int getMasspRgaInitialMass() {
        return masspRgaInitialMass;
    }

    public void setMasspRgaInitialMass(int masspRgaInitialMass) {
        this.masspRgaInitialMass = masspRgaInitialMass;
    }
    public int getMasspRgaFinalMass() {
        return masspRgaFinalMass;
    }

    public void setMasspRgaFinalMass(int masspRgaFinalMass) {
        this.masspRgaFinalMass = masspRgaFinalMass;
    }
    public int getMasspRgaReadingsPerScan() {
        return masspRgaReadingsPerScan;
    }

    public void setMasspRgaReadingsPerScan(int masspRgaReadingsPerScan) {
        this.masspRgaReadingsPerScan = masspRgaReadingsPerScan;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}