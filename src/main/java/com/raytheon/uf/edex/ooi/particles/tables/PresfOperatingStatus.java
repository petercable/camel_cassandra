package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "presf_operating_status")
public class PresfOperatingStatus extends CassandraParticle {

    @Column(value = "firmware_version")
    private String firmwareVersion;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "user_info")
    private String userInfo;

    @Column(value = "quartz_pressure_sensor_serial_number")
    private int quartzPressureSensorSerialNumber;

    @Column(value = "pressure_sensor_range")
    private int pressureSensorRange;

    @Column(value = "external_temperature_sensor")
    private int externalTemperatureSensor;

    @Column(value = "external_conductivity_sensor")
    private int externalConductivitySensor;

    @Column(value = "operational_current")
    private float operationalCurrent;

    @Column(value = "battery_voltage_main")
    private float batteryVoltageMain;

    @Column(value = "battery_voltage_lithium")
    private float batteryVoltageLithium;

    @Column(value = "last_sample_absolute_press")
    private float lastSampleAbsolutePress;

    @Column(value = "last_sample_temp")
    private float lastSampleTemp;

    @Column(value = "tide_measurement_interval")
    private int tideMeasurementInterval;

    @Column(value = "tide_measurement_duration")
    private int tideMeasurementDuration;

    @Column(value = "wave_samples_between_tide_measurements")
    private int waveSamplesBetweenTideMeasurements;

    @Column(value = "wave_samples_per_burst")
    private int waveSamplesPerBurst;

    @Column(value = "wave_samples_scans_per_second")
    private float waveSamplesScansPerSecond;

    @Column(value = "wave_samples_duration")
    private float waveSamplesDuration;

    @Column(value = "logging_start_time")
    private String loggingStartTime;

    @Column(value = "logging_stop_time")
    private String loggingStopTime;

    @Column(value = "tide_samples_per_day")
    private int tideSamplesPerDay;

    @Column(value = "wave_bursts_per_day")
    private int waveBurstsPerDay;

    @Column(value = "memory_endurance")
    private float memoryEndurance;

    @Column(value = "nominal_alkaline_battery_endurance")
    private float nominalAlkalineBatteryEndurance;

    @Column(value = "total_recorded_tide_measurements")
    private int totalRecordedTideMeasurements;

    @Column(value = "total_recorded_wave_bursts")
    private int totalRecordedWaveBursts;

    @Column(value = "tide_measurements_since_last_start")
    private int tideMeasurementsSinceLastStart;

    @Column(value = "wave_bursts_since_last_start")
    private int waveBurstsSinceLastStart;

    @Column(value = "tx_tide_samples")
    private int txTideSamples;

    @Column(value = "tx_wave_bursts")
    private int txWaveBursts;

    @Column(value = "tx_wave_stats")
    private int txWaveStats;

    @Column(value = "device_status")
    private String deviceStatus;

    @Column(value = "logging_status")
    private int loggingStatus;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFirmwareVersion((String) particle.get("firmware_version"));
        setSerialNumber((int) particle.get("serial_number"));
        setDateTimeString((String) particle.get("date_time_string"));
        setUserInfo((String) particle.get("user_info"));
        setQuartzPressureSensorSerialNumber((int) particle.get("quartz_pressure_sensor_serial_number"));
        setPressureSensorRange((int) particle.get("pressure_sensor_range"));
        setExternalTemperatureSensor((int) particle.get("external_temperature_sensor"));
        setExternalConductivitySensor((int) particle.get("external_conductivity_sensor"));
        setOperationalCurrent((float) particle.get("operational_current"));
        setBatteryVoltageMain((float) particle.get("battery_voltage_main"));
        setBatteryVoltageLithium((float) particle.get("battery_voltage_lithium"));
        setLastSampleAbsolutePress((float) particle.get("last_sample_absolute_press"));
        setLastSampleTemp((float) particle.get("last_sample_temp"));
        setTideMeasurementInterval((int) particle.get("tide_measurement_interval"));
        setTideMeasurementDuration((int) particle.get("tide_measurement_duration"));
        setWaveSamplesBetweenTideMeasurements((int) particle.get("wave_samples_between_tide_measurements"));
        setWaveSamplesPerBurst((int) particle.get("wave_samples_per_burst"));
        setWaveSamplesScansPerSecond((float) particle.get("wave_samples_scans_per_second"));
        setWaveSamplesDuration((float) particle.get("wave_samples_duration"));
        setLoggingStartTime((String) particle.get("logging_start_time"));
        setLoggingStopTime((String) particle.get("logging_stop_time"));
        setTideSamplesPerDay((int) particle.get("tide_samples_per_day"));
        setWaveBurstsPerDay((int) particle.get("wave_bursts_per_day"));
        setMemoryEndurance((float) particle.get("memory_endurance"));
        setNominalAlkalineBatteryEndurance((float) particle.get("nominal_alkaline_battery_endurance"));
        setTotalRecordedTideMeasurements((int) particle.get("total_recorded_tide_measurements"));
        setTotalRecordedWaveBursts((int) particle.get("total_recorded_wave_bursts"));
        setTideMeasurementsSinceLastStart((int) particle.get("tide_measurements_since_last_start"));
        setWaveBurstsSinceLastStart((int) particle.get("wave_bursts_since_last_start"));
        setTxTideSamples((int) particle.get("tx_tide_samples"));
        setTxWaveBursts((int) particle.get("tx_wave_bursts"));
        setTxWaveStats((int) particle.get("tx_wave_stats"));
        setDeviceStatus((String) particle.get("device_status"));
        setLoggingStatus((int) particle.get("logging_status"));
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
    public int getQuartzPressureSensorSerialNumber() {
        return quartzPressureSensorSerialNumber;
    }

    public void setQuartzPressureSensorSerialNumber(int quartzPressureSensorSerialNumber) {
        this.quartzPressureSensorSerialNumber = quartzPressureSensorSerialNumber;
    }
    public int getPressureSensorRange() {
        return pressureSensorRange;
    }

    public void setPressureSensorRange(int pressureSensorRange) {
        this.pressureSensorRange = pressureSensorRange;
    }
    public int getExternalTemperatureSensor() {
        return externalTemperatureSensor;
    }

    public void setExternalTemperatureSensor(int externalTemperatureSensor) {
        this.externalTemperatureSensor = externalTemperatureSensor;
    }
    public int getExternalConductivitySensor() {
        return externalConductivitySensor;
    }

    public void setExternalConductivitySensor(int externalConductivitySensor) {
        this.externalConductivitySensor = externalConductivitySensor;
    }
    public float getOperationalCurrent() {
        return operationalCurrent;
    }

    public void setOperationalCurrent(float operationalCurrent) {
        this.operationalCurrent = operationalCurrent;
    }
    public float getBatteryVoltageMain() {
        return batteryVoltageMain;
    }

    public void setBatteryVoltageMain(float batteryVoltageMain) {
        this.batteryVoltageMain = batteryVoltageMain;
    }
    public float getBatteryVoltageLithium() {
        return batteryVoltageLithium;
    }

    public void setBatteryVoltageLithium(float batteryVoltageLithium) {
        this.batteryVoltageLithium = batteryVoltageLithium;
    }
    public float getLastSampleAbsolutePress() {
        return lastSampleAbsolutePress;
    }

    public void setLastSampleAbsolutePress(float lastSampleAbsolutePress) {
        this.lastSampleAbsolutePress = lastSampleAbsolutePress;
    }
    public float getLastSampleTemp() {
        return lastSampleTemp;
    }

    public void setLastSampleTemp(float lastSampleTemp) {
        this.lastSampleTemp = lastSampleTemp;
    }
    public int getTideMeasurementInterval() {
        return tideMeasurementInterval;
    }

    public void setTideMeasurementInterval(int tideMeasurementInterval) {
        this.tideMeasurementInterval = tideMeasurementInterval;
    }
    public int getTideMeasurementDuration() {
        return tideMeasurementDuration;
    }

    public void setTideMeasurementDuration(int tideMeasurementDuration) {
        this.tideMeasurementDuration = tideMeasurementDuration;
    }
    public int getWaveSamplesBetweenTideMeasurements() {
        return waveSamplesBetweenTideMeasurements;
    }

    public void setWaveSamplesBetweenTideMeasurements(int waveSamplesBetweenTideMeasurements) {
        this.waveSamplesBetweenTideMeasurements = waveSamplesBetweenTideMeasurements;
    }
    public int getWaveSamplesPerBurst() {
        return waveSamplesPerBurst;
    }

    public void setWaveSamplesPerBurst(int waveSamplesPerBurst) {
        this.waveSamplesPerBurst = waveSamplesPerBurst;
    }
    public float getWaveSamplesScansPerSecond() {
        return waveSamplesScansPerSecond;
    }

    public void setWaveSamplesScansPerSecond(float waveSamplesScansPerSecond) {
        this.waveSamplesScansPerSecond = waveSamplesScansPerSecond;
    }
    public float getWaveSamplesDuration() {
        return waveSamplesDuration;
    }

    public void setWaveSamplesDuration(float waveSamplesDuration) {
        this.waveSamplesDuration = waveSamplesDuration;
    }
    public String getLoggingStartTime() {
        return loggingStartTime;
    }

    public void setLoggingStartTime(String loggingStartTime) {
        this.loggingStartTime = loggingStartTime;
    }
    public String getLoggingStopTime() {
        return loggingStopTime;
    }

    public void setLoggingStopTime(String loggingStopTime) {
        this.loggingStopTime = loggingStopTime;
    }
    public int getTideSamplesPerDay() {
        return tideSamplesPerDay;
    }

    public void setTideSamplesPerDay(int tideSamplesPerDay) {
        this.tideSamplesPerDay = tideSamplesPerDay;
    }
    public int getWaveBurstsPerDay() {
        return waveBurstsPerDay;
    }

    public void setWaveBurstsPerDay(int waveBurstsPerDay) {
        this.waveBurstsPerDay = waveBurstsPerDay;
    }
    public float getMemoryEndurance() {
        return memoryEndurance;
    }

    public void setMemoryEndurance(float memoryEndurance) {
        this.memoryEndurance = memoryEndurance;
    }
    public float getNominalAlkalineBatteryEndurance() {
        return nominalAlkalineBatteryEndurance;
    }

    public void setNominalAlkalineBatteryEndurance(float nominalAlkalineBatteryEndurance) {
        this.nominalAlkalineBatteryEndurance = nominalAlkalineBatteryEndurance;
    }
    public int getTotalRecordedTideMeasurements() {
        return totalRecordedTideMeasurements;
    }

    public void setTotalRecordedTideMeasurements(int totalRecordedTideMeasurements) {
        this.totalRecordedTideMeasurements = totalRecordedTideMeasurements;
    }
    public int getTotalRecordedWaveBursts() {
        return totalRecordedWaveBursts;
    }

    public void setTotalRecordedWaveBursts(int totalRecordedWaveBursts) {
        this.totalRecordedWaveBursts = totalRecordedWaveBursts;
    }
    public int getTideMeasurementsSinceLastStart() {
        return tideMeasurementsSinceLastStart;
    }

    public void setTideMeasurementsSinceLastStart(int tideMeasurementsSinceLastStart) {
        this.tideMeasurementsSinceLastStart = tideMeasurementsSinceLastStart;
    }
    public int getWaveBurstsSinceLastStart() {
        return waveBurstsSinceLastStart;
    }

    public void setWaveBurstsSinceLastStart(int waveBurstsSinceLastStart) {
        this.waveBurstsSinceLastStart = waveBurstsSinceLastStart;
    }
    public int getTxTideSamples() {
        return txTideSamples;
    }

    public void setTxTideSamples(int txTideSamples) {
        this.txTideSamples = txTideSamples;
    }
    public int getTxWaveBursts() {
        return txWaveBursts;
    }

    public void setTxWaveBursts(int txWaveBursts) {
        this.txWaveBursts = txWaveBursts;
    }
    public int getTxWaveStats() {
        return txWaveStats;
    }

    public void setTxWaveStats(int txWaveStats) {
        this.txWaveStats = txWaveStats;
    }
    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }
    public int getLoggingStatus() {
        return loggingStatus;
    }

    public void setLoggingStatus(int loggingStatus) {
        this.loggingStatus = loggingStatus;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}