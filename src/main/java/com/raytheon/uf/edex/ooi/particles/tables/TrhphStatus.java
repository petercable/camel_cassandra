package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "trhph_status")
public class TrhphStatus extends CassandraParticle {

    @Column(value = "trhph_system_info")
    private String trhphSystemInfo;

    @Column(value = "trhph_eprom_status")
    private int trhphEpromStatus;

    @Column(value = "trhph_cycle_time")
    private int trhphCycleTime;

    @Column(value = "trhph_cycle_time_units")
    private String trhphCycleTimeUnits;

    @Column(value = "trhph_power_control_word")
    private int trhphPowerControlWord;

    @Column(value = "trhph_res_power_status")
    private int trhphResPowerStatus;

    @Column(value = "trhph_thermo_hydro_amp_power_status")
    private int trhphThermoHydroAmpPowerStatus;

    @Column(value = "trhph_eh_amp_power_status")
    private int trhphEhAmpPowerStatus;

    @Column(value = "trhph_hydro_sensor_power_status")
    private int trhphHydroSensorPowerStatus;

    @Column(value = "trhph_ref_temp_power_status")
    private int trhphRefTempPowerStatus;

    @Column(value = "trhph_metadata_on_powerup")
    private int trhphMetadataOnPowerup;

    @Column(value = "trhph_metadata_on_restart")
    private int trhphMetadataOnRestart;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTrhphSystemInfo((String) particle.get("trhph_system_info"));
        setTrhphEpromStatus((int) particle.get("trhph_eprom_status"));
        setTrhphCycleTime((int) particle.get("trhph_cycle_time"));
        setTrhphCycleTimeUnits((String) particle.get("trhph_cycle_time_units"));
        setTrhphPowerControlWord((int) particle.get("trhph_power_control_word"));
        setTrhphResPowerStatus((int) particle.get("trhph_res_power_status"));
        setTrhphThermoHydroAmpPowerStatus((int) particle.get("trhph_thermo_hydro_amp_power_status"));
        setTrhphEhAmpPowerStatus((int) particle.get("trhph_eh_amp_power_status"));
        setTrhphHydroSensorPowerStatus((int) particle.get("trhph_hydro_sensor_power_status"));
        setTrhphRefTempPowerStatus((int) particle.get("trhph_ref_temp_power_status"));
        setTrhphMetadataOnPowerup((int) particle.get("trhph_metadata_on_powerup"));
        setTrhphMetadataOnRestart((int) particle.get("trhph_metadata_on_restart"));
    }

    public String getTrhphSystemInfo() {
        return trhphSystemInfo;
    }

    public void setTrhphSystemInfo(String trhphSystemInfo) {
        this.trhphSystemInfo = trhphSystemInfo;
    }
    public int getTrhphEpromStatus() {
        return trhphEpromStatus;
    }

    public void setTrhphEpromStatus(int trhphEpromStatus) {
        this.trhphEpromStatus = trhphEpromStatus;
    }
    public int getTrhphCycleTime() {
        return trhphCycleTime;
    }

    public void setTrhphCycleTime(int trhphCycleTime) {
        this.trhphCycleTime = trhphCycleTime;
    }
    public String getTrhphCycleTimeUnits() {
        return trhphCycleTimeUnits;
    }

    public void setTrhphCycleTimeUnits(String trhphCycleTimeUnits) {
        this.trhphCycleTimeUnits = trhphCycleTimeUnits;
    }
    public int getTrhphPowerControlWord() {
        return trhphPowerControlWord;
    }

    public void setTrhphPowerControlWord(int trhphPowerControlWord) {
        this.trhphPowerControlWord = trhphPowerControlWord;
    }
    public int getTrhphResPowerStatus() {
        return trhphResPowerStatus;
    }

    public void setTrhphResPowerStatus(int trhphResPowerStatus) {
        this.trhphResPowerStatus = trhphResPowerStatus;
    }
    public int getTrhphThermoHydroAmpPowerStatus() {
        return trhphThermoHydroAmpPowerStatus;
    }

    public void setTrhphThermoHydroAmpPowerStatus(int trhphThermoHydroAmpPowerStatus) {
        this.trhphThermoHydroAmpPowerStatus = trhphThermoHydroAmpPowerStatus;
    }
    public int getTrhphEhAmpPowerStatus() {
        return trhphEhAmpPowerStatus;
    }

    public void setTrhphEhAmpPowerStatus(int trhphEhAmpPowerStatus) {
        this.trhphEhAmpPowerStatus = trhphEhAmpPowerStatus;
    }
    public int getTrhphHydroSensorPowerStatus() {
        return trhphHydroSensorPowerStatus;
    }

    public void setTrhphHydroSensorPowerStatus(int trhphHydroSensorPowerStatus) {
        this.trhphHydroSensorPowerStatus = trhphHydroSensorPowerStatus;
    }
    public int getTrhphRefTempPowerStatus() {
        return trhphRefTempPowerStatus;
    }

    public void setTrhphRefTempPowerStatus(int trhphRefTempPowerStatus) {
        this.trhphRefTempPowerStatus = trhphRefTempPowerStatus;
    }
    public int getTrhphMetadataOnPowerup() {
        return trhphMetadataOnPowerup;
    }

    public void setTrhphMetadataOnPowerup(int trhphMetadataOnPowerup) {
        this.trhphMetadataOnPowerup = trhphMetadataOnPowerup;
    }
    public int getTrhphMetadataOnRestart() {
        return trhphMetadataOnRestart;
    }

    public void setTrhphMetadataOnRestart(int trhphMetadataOnRestart) {
        this.trhphMetadataOnRestart = trhphMetadataOnRestart;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}