package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ies_status")
public class IesStatus extends CassandraParticle {

    @Column(value = "hpies_ies_timestamp")
    private BigInteger hpiesIesTimestamp;

    @Column(value = "hpies_data_validity")
    private int hpiesDataValidity;

    @Column(value = "hpies_status_travel_times")
    private List<Long> hpiesStatusTravelTimes;

    @Column(value = "hpies_status_travel_times_dims")
    private int hpiesStatusTravelTimesDims;

    @Column(value = "hpies_status_travel_times_sizes")
    private List<Long> hpiesStatusTravelTimesSizes;

    @Column(value = "hpies_status_pressures")
    private List<Integer> hpiesStatusPressures;

    @Column(value = "hpies_status_pressures_dims")
    private int hpiesStatusPressuresDims;

    @Column(value = "hpies_status_pressures_sizes")
    private List<Long> hpiesStatusPressuresSizes;

    @Column(value = "hpies_status_temperatures")
    private List<Integer> hpiesStatusTemperatures;

    @Column(value = "hpies_status_temperatures_dims")
    private int hpiesStatusTemperaturesDims;

    @Column(value = "hpies_status_temperatures_sizes")
    private List<Long> hpiesStatusTemperaturesSizes;

    @Column(value = "hpies_status_pressure_frequencies")
    private List<Long> hpiesStatusPressureFrequencies;

    @Column(value = "hpies_status_pressure_frequencies_dims")
    private int hpiesStatusPressureFrequenciesDims;

    @Column(value = "hpies_status_pressure_frequencies_sizes")
    private List<Long> hpiesStatusPressureFrequenciesSizes;

    @Column(value = "hpies_status_temperature_frequencies")
    private List<Long> hpiesStatusTemperatureFrequencies;

    @Column(value = "hpies_status_temperature_frequencies_dims")
    private int hpiesStatusTemperatureFrequenciesDims;

    @Column(value = "hpies_status_temperature_frequencies_sizes")
    private List<Long> hpiesStatusTemperatureFrequenciesSizes;

    @Column(value = "hpies_backup_battery_voltage")
    private float hpiesBackupBatteryVoltage;

    @Column(value = "hpies_release_drain")
    private float hpiesReleaseDrain;

    @Column(value = "hpies_system_drain")
    private float hpiesSystemDrain;

    @Column(value = "hpies_release_battery_voltage")
    private float hpiesReleaseBatteryVoltage;

    @Column(value = "hpies_system_battery_voltage")
    private float hpiesSystemBatteryVoltage;

    @Column(value = "hpies_release_system_voltage")
    private float hpiesReleaseSystemVoltage;

    @Column(value = "hpies_internal_temperature")
    private float hpiesInternalTemperature;

    @Column(value = "hpies_average_travel_time")
    private float hpiesAverageTravelTime;

    @Column(value = "hpies_average_pressure")
    private int hpiesAveragePressure;

    @Column(value = "hpies_average_temperature")
    private int hpiesAverageTemperature;

    @Column(value = "hpies_last_pressure")
    private float hpiesLastPressure;

    @Column(value = "hpies_last_temperature")
    private float hpiesLastTemperature;

    @Column(value = "hpies_ies_clock_error")
    private float hpiesIesClockError;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHpiesIesTimestamp((BigInteger) particle.get("hpies_ies_timestamp"));
        setHpiesDataValidity((int) particle.get("hpies_data_validity"));
        setHpiesStatusTravelTimes((List<Long>) particle.get("hpies_status_travel_times"));
        setHpiesStatusTravelTimesDims((int) particle.get("hpies_status_travel_times_dims"));
        setHpiesStatusTravelTimesSizes((List<Long>) particle.get("hpies_status_travel_times_sizes"));
        setHpiesStatusPressures((List<Integer>) particle.get("hpies_status_pressures"));
        setHpiesStatusPressuresDims((int) particle.get("hpies_status_pressures_dims"));
        setHpiesStatusPressuresSizes((List<Long>) particle.get("hpies_status_pressures_sizes"));
        setHpiesStatusTemperatures((List<Integer>) particle.get("hpies_status_temperatures"));
        setHpiesStatusTemperaturesDims((int) particle.get("hpies_status_temperatures_dims"));
        setHpiesStatusTemperaturesSizes((List<Long>) particle.get("hpies_status_temperatures_sizes"));
        setHpiesStatusPressureFrequencies((List<Long>) particle.get("hpies_status_pressure_frequencies"));
        setHpiesStatusPressureFrequenciesDims((int) particle.get("hpies_status_pressure_frequencies_dims"));
        setHpiesStatusPressureFrequenciesSizes((List<Long>) particle.get("hpies_status_pressure_frequencies_sizes"));
        setHpiesStatusTemperatureFrequencies((List<Long>) particle.get("hpies_status_temperature_frequencies"));
        setHpiesStatusTemperatureFrequenciesDims((int) particle.get("hpies_status_temperature_frequencies_dims"));
        setHpiesStatusTemperatureFrequenciesSizes((List<Long>) particle.get("hpies_status_temperature_frequencies_sizes"));
        setHpiesBackupBatteryVoltage((float) particle.get("hpies_backup_battery_voltage"));
        setHpiesReleaseDrain((float) particle.get("hpies_release_drain"));
        setHpiesSystemDrain((float) particle.get("hpies_system_drain"));
        setHpiesReleaseBatteryVoltage((float) particle.get("hpies_release_battery_voltage"));
        setHpiesSystemBatteryVoltage((float) particle.get("hpies_system_battery_voltage"));
        setHpiesReleaseSystemVoltage((float) particle.get("hpies_release_system_voltage"));
        setHpiesInternalTemperature((float) particle.get("hpies_internal_temperature"));
        setHpiesAverageTravelTime((float) particle.get("hpies_average_travel_time"));
        setHpiesAveragePressure((int) particle.get("hpies_average_pressure"));
        setHpiesAverageTemperature((int) particle.get("hpies_average_temperature"));
        setHpiesLastPressure((float) particle.get("hpies_last_pressure"));
        setHpiesLastTemperature((float) particle.get("hpies_last_temperature"));
        setHpiesIesClockError((float) particle.get("hpies_ies_clock_error"));
    }

    public BigInteger getHpiesIesTimestamp() {
        return hpiesIesTimestamp;
    }

    public void setHpiesIesTimestamp(BigInteger hpiesIesTimestamp) {
        this.hpiesIesTimestamp = hpiesIesTimestamp;
    }
    public int getHpiesDataValidity() {
        return hpiesDataValidity;
    }

    public void setHpiesDataValidity(int hpiesDataValidity) {
        this.hpiesDataValidity = hpiesDataValidity;
    }
    public List<Long> getHpiesStatusTravelTimes() {
        // TODO - restore original dimensions, (remove fill values?)
        return hpiesStatusTravelTimes;
    }

    public void setHpiesStatusTravelTimes(List<Long> hpiesStatusTravelTimes) {
        // TODO - flatten for storage, insert fill values
        this.hpiesStatusTravelTimes = hpiesStatusTravelTimes;
    }
    public int getHpiesStatusTravelTimesDims() {
        return hpiesStatusTravelTimesDims;
    }

    public void setHpiesStatusTravelTimesDims(int hpiesStatusTravelTimesDims) {
        this.hpiesStatusTravelTimesDims = hpiesStatusTravelTimesDims;
    }
    public List<Long> getHpiesStatusTravelTimesSizes() {
        return hpiesStatusTravelTimesSizes;
    }

    public void setHpiesStatusTravelTimesSizes(List<Long> hpiesStatusTravelTimesSizes) {
        this.hpiesStatusTravelTimesSizes = hpiesStatusTravelTimesSizes;
    }
    public List<Integer> getHpiesStatusPressures() {
        // TODO - restore original dimensions, (remove fill values?)
        return hpiesStatusPressures;
    }

    public void setHpiesStatusPressures(List<Integer> hpiesStatusPressures) {
        // TODO - flatten for storage, insert fill values
        this.hpiesStatusPressures = hpiesStatusPressures;
    }
    public int getHpiesStatusPressuresDims() {
        return hpiesStatusPressuresDims;
    }

    public void setHpiesStatusPressuresDims(int hpiesStatusPressuresDims) {
        this.hpiesStatusPressuresDims = hpiesStatusPressuresDims;
    }
    public List<Long> getHpiesStatusPressuresSizes() {
        return hpiesStatusPressuresSizes;
    }

    public void setHpiesStatusPressuresSizes(List<Long> hpiesStatusPressuresSizes) {
        this.hpiesStatusPressuresSizes = hpiesStatusPressuresSizes;
    }
    public List<Integer> getHpiesStatusTemperatures() {
        // TODO - restore original dimensions, (remove fill values?)
        return hpiesStatusTemperatures;
    }

    public void setHpiesStatusTemperatures(List<Integer> hpiesStatusTemperatures) {
        // TODO - flatten for storage, insert fill values
        this.hpiesStatusTemperatures = hpiesStatusTemperatures;
    }
    public int getHpiesStatusTemperaturesDims() {
        return hpiesStatusTemperaturesDims;
    }

    public void setHpiesStatusTemperaturesDims(int hpiesStatusTemperaturesDims) {
        this.hpiesStatusTemperaturesDims = hpiesStatusTemperaturesDims;
    }
    public List<Long> getHpiesStatusTemperaturesSizes() {
        return hpiesStatusTemperaturesSizes;
    }

    public void setHpiesStatusTemperaturesSizes(List<Long> hpiesStatusTemperaturesSizes) {
        this.hpiesStatusTemperaturesSizes = hpiesStatusTemperaturesSizes;
    }
    public List<Long> getHpiesStatusPressureFrequencies() {
        // TODO - restore original dimensions, (remove fill values?)
        return hpiesStatusPressureFrequencies;
    }

    public void setHpiesStatusPressureFrequencies(List<Long> hpiesStatusPressureFrequencies) {
        // TODO - flatten for storage, insert fill values
        this.hpiesStatusPressureFrequencies = hpiesStatusPressureFrequencies;
    }
    public int getHpiesStatusPressureFrequenciesDims() {
        return hpiesStatusPressureFrequenciesDims;
    }

    public void setHpiesStatusPressureFrequenciesDims(int hpiesStatusPressureFrequenciesDims) {
        this.hpiesStatusPressureFrequenciesDims = hpiesStatusPressureFrequenciesDims;
    }
    public List<Long> getHpiesStatusPressureFrequenciesSizes() {
        return hpiesStatusPressureFrequenciesSizes;
    }

    public void setHpiesStatusPressureFrequenciesSizes(List<Long> hpiesStatusPressureFrequenciesSizes) {
        this.hpiesStatusPressureFrequenciesSizes = hpiesStatusPressureFrequenciesSizes;
    }
    public List<Long> getHpiesStatusTemperatureFrequencies() {
        // TODO - restore original dimensions, (remove fill values?)
        return hpiesStatusTemperatureFrequencies;
    }

    public void setHpiesStatusTemperatureFrequencies(List<Long> hpiesStatusTemperatureFrequencies) {
        // TODO - flatten for storage, insert fill values
        this.hpiesStatusTemperatureFrequencies = hpiesStatusTemperatureFrequencies;
    }
    public int getHpiesStatusTemperatureFrequenciesDims() {
        return hpiesStatusTemperatureFrequenciesDims;
    }

    public void setHpiesStatusTemperatureFrequenciesDims(int hpiesStatusTemperatureFrequenciesDims) {
        this.hpiesStatusTemperatureFrequenciesDims = hpiesStatusTemperatureFrequenciesDims;
    }
    public List<Long> getHpiesStatusTemperatureFrequenciesSizes() {
        return hpiesStatusTemperatureFrequenciesSizes;
    }

    public void setHpiesStatusTemperatureFrequenciesSizes(List<Long> hpiesStatusTemperatureFrequenciesSizes) {
        this.hpiesStatusTemperatureFrequenciesSizes = hpiesStatusTemperatureFrequenciesSizes;
    }
    public float getHpiesBackupBatteryVoltage() {
        return hpiesBackupBatteryVoltage;
    }

    public void setHpiesBackupBatteryVoltage(float hpiesBackupBatteryVoltage) {
        this.hpiesBackupBatteryVoltage = hpiesBackupBatteryVoltage;
    }
    public float getHpiesReleaseDrain() {
        return hpiesReleaseDrain;
    }

    public void setHpiesReleaseDrain(float hpiesReleaseDrain) {
        this.hpiesReleaseDrain = hpiesReleaseDrain;
    }
    public float getHpiesSystemDrain() {
        return hpiesSystemDrain;
    }

    public void setHpiesSystemDrain(float hpiesSystemDrain) {
        this.hpiesSystemDrain = hpiesSystemDrain;
    }
    public float getHpiesReleaseBatteryVoltage() {
        return hpiesReleaseBatteryVoltage;
    }

    public void setHpiesReleaseBatteryVoltage(float hpiesReleaseBatteryVoltage) {
        this.hpiesReleaseBatteryVoltage = hpiesReleaseBatteryVoltage;
    }
    public float getHpiesSystemBatteryVoltage() {
        return hpiesSystemBatteryVoltage;
    }

    public void setHpiesSystemBatteryVoltage(float hpiesSystemBatteryVoltage) {
        this.hpiesSystemBatteryVoltage = hpiesSystemBatteryVoltage;
    }
    public float getHpiesReleaseSystemVoltage() {
        return hpiesReleaseSystemVoltage;
    }

    public void setHpiesReleaseSystemVoltage(float hpiesReleaseSystemVoltage) {
        this.hpiesReleaseSystemVoltage = hpiesReleaseSystemVoltage;
    }
    public float getHpiesInternalTemperature() {
        return hpiesInternalTemperature;
    }

    public void setHpiesInternalTemperature(float hpiesInternalTemperature) {
        this.hpiesInternalTemperature = hpiesInternalTemperature;
    }
    public float getHpiesAverageTravelTime() {
        return hpiesAverageTravelTime;
    }

    public void setHpiesAverageTravelTime(float hpiesAverageTravelTime) {
        this.hpiesAverageTravelTime = hpiesAverageTravelTime;
    }
    public int getHpiesAveragePressure() {
        return hpiesAveragePressure;
    }

    public void setHpiesAveragePressure(int hpiesAveragePressure) {
        this.hpiesAveragePressure = hpiesAveragePressure;
    }
    public int getHpiesAverageTemperature() {
        return hpiesAverageTemperature;
    }

    public void setHpiesAverageTemperature(int hpiesAverageTemperature) {
        this.hpiesAverageTemperature = hpiesAverageTemperature;
    }
    public float getHpiesLastPressure() {
        return hpiesLastPressure;
    }

    public void setHpiesLastPressure(float hpiesLastPressure) {
        this.hpiesLastPressure = hpiesLastPressure;
    }
    public float getHpiesLastTemperature() {
        return hpiesLastTemperature;
    }

    public void setHpiesLastTemperature(float hpiesLastTemperature) {
        this.hpiesLastTemperature = hpiesLastTemperature;
    }
    public float getHpiesIesClockError() {
        return hpiesIesClockError;
    }

    public void setHpiesIesClockError(float hpiesIesClockError) {
        this.hpiesIesClockError = hpiesIesClockError;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}