package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "sami_regular_status")
public class SamiRegularStatus extends CassandraParticle {

    @Column(value = "elapsed_time_config")
    private long elapsedTimeConfig;

    @Column(value = "clock_active")
    private int clockActive;

    @Column(value = "recording_active")
    private int recordingActive;

    @Column(value = "record_end_on_time")
    private int recordEndOnTime;

    @Column(value = "record_memory_full")
    private int recordMemoryFull;

    @Column(value = "record_end_on_error")
    private int recordEndOnError;

    @Column(value = "data_download_ok")
    private int dataDownloadOk;

    @Column(value = "flash_memory_open")
    private int flashMemoryOpen;

    @Column(value = "battery_low_prestart")
    private int batteryLowPrestart;

    @Column(value = "battery_low_measurement")
    private int batteryLowMeasurement;

    @Column(value = "battery_low_bank")
    private int batteryLowBank;

    @Column(value = "battery_low_external")
    private int batteryLowExternal;

    @Column(value = "external_device1_fault")
    private int externalDevice1Fault;

    @Column(value = "external_device2_fault")
    private int externalDevice2Fault;

    @Column(value = "external_device3_fault")
    private int externalDevice3Fault;

    @Column(value = "flash_erased")
    private int flashErased;

    @Column(value = "power_on_invalid")
    private int powerOnInvalid;

    @Column(value = "num_data_records")
    private int numDataRecords;

    @Column(value = "num_error_records")
    private int numErrorRecords;

    @Column(value = "num_bytes_stored")
    private int numBytesStored;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setElapsedTimeConfig((long) particle.get("elapsed_time_config"));
        setClockActive((int) particle.get("clock_active"));
        setRecordingActive((int) particle.get("recording_active"));
        setRecordEndOnTime((int) particle.get("record_end_on_time"));
        setRecordMemoryFull((int) particle.get("record_memory_full"));
        setRecordEndOnError((int) particle.get("record_end_on_error"));
        setDataDownloadOk((int) particle.get("data_download_ok"));
        setFlashMemoryOpen((int) particle.get("flash_memory_open"));
        setBatteryLowPrestart((int) particle.get("battery_low_prestart"));
        setBatteryLowMeasurement((int) particle.get("battery_low_measurement"));
        setBatteryLowBank((int) particle.get("battery_low_bank"));
        setBatteryLowExternal((int) particle.get("battery_low_external"));
        setExternalDevice1Fault((int) particle.get("external_device1_fault"));
        setExternalDevice2Fault((int) particle.get("external_device2_fault"));
        setExternalDevice3Fault((int) particle.get("external_device3_fault"));
        setFlashErased((int) particle.get("flash_erased"));
        setPowerOnInvalid((int) particle.get("power_on_invalid"));
        setNumDataRecords((int) particle.get("num_data_records"));
        setNumErrorRecords((int) particle.get("num_error_records"));
        setNumBytesStored((int) particle.get("num_bytes_stored"));
    }

    public long getElapsedTimeConfig() {
        return elapsedTimeConfig;
    }

    public void setElapsedTimeConfig(long elapsedTimeConfig) {
        this.elapsedTimeConfig = elapsedTimeConfig;
    }
    public int getClockActive() {
        return clockActive;
    }

    public void setClockActive(int clockActive) {
        this.clockActive = clockActive;
    }
    public int getRecordingActive() {
        return recordingActive;
    }

    public void setRecordingActive(int recordingActive) {
        this.recordingActive = recordingActive;
    }
    public int getRecordEndOnTime() {
        return recordEndOnTime;
    }

    public void setRecordEndOnTime(int recordEndOnTime) {
        this.recordEndOnTime = recordEndOnTime;
    }
    public int getRecordMemoryFull() {
        return recordMemoryFull;
    }

    public void setRecordMemoryFull(int recordMemoryFull) {
        this.recordMemoryFull = recordMemoryFull;
    }
    public int getRecordEndOnError() {
        return recordEndOnError;
    }

    public void setRecordEndOnError(int recordEndOnError) {
        this.recordEndOnError = recordEndOnError;
    }
    public int getDataDownloadOk() {
        return dataDownloadOk;
    }

    public void setDataDownloadOk(int dataDownloadOk) {
        this.dataDownloadOk = dataDownloadOk;
    }
    public int getFlashMemoryOpen() {
        return flashMemoryOpen;
    }

    public void setFlashMemoryOpen(int flashMemoryOpen) {
        this.flashMemoryOpen = flashMemoryOpen;
    }
    public int getBatteryLowPrestart() {
        return batteryLowPrestart;
    }

    public void setBatteryLowPrestart(int batteryLowPrestart) {
        this.batteryLowPrestart = batteryLowPrestart;
    }
    public int getBatteryLowMeasurement() {
        return batteryLowMeasurement;
    }

    public void setBatteryLowMeasurement(int batteryLowMeasurement) {
        this.batteryLowMeasurement = batteryLowMeasurement;
    }
    public int getBatteryLowBank() {
        return batteryLowBank;
    }

    public void setBatteryLowBank(int batteryLowBank) {
        this.batteryLowBank = batteryLowBank;
    }
    public int getBatteryLowExternal() {
        return batteryLowExternal;
    }

    public void setBatteryLowExternal(int batteryLowExternal) {
        this.batteryLowExternal = batteryLowExternal;
    }
    public int getExternalDevice1Fault() {
        return externalDevice1Fault;
    }

    public void setExternalDevice1Fault(int externalDevice1Fault) {
        this.externalDevice1Fault = externalDevice1Fault;
    }
    public int getExternalDevice2Fault() {
        return externalDevice2Fault;
    }

    public void setExternalDevice2Fault(int externalDevice2Fault) {
        this.externalDevice2Fault = externalDevice2Fault;
    }
    public int getExternalDevice3Fault() {
        return externalDevice3Fault;
    }

    public void setExternalDevice3Fault(int externalDevice3Fault) {
        this.externalDevice3Fault = externalDevice3Fault;
    }
    public int getFlashErased() {
        return flashErased;
    }

    public void setFlashErased(int flashErased) {
        this.flashErased = flashErased;
    }
    public int getPowerOnInvalid() {
        return powerOnInvalid;
    }

    public void setPowerOnInvalid(int powerOnInvalid) {
        this.powerOnInvalid = powerOnInvalid;
    }
    public int getNumDataRecords() {
        return numDataRecords;
    }

    public void setNumDataRecords(int numDataRecords) {
        this.numDataRecords = numDataRecords;
    }
    public int getNumErrorRecords() {
        return numErrorRecords;
    }

    public void setNumErrorRecords(int numErrorRecords) {
        this.numErrorRecords = numErrorRecords;
    }
    public int getNumBytesStored() {
        return numBytesStored;
    }

    public void setNumBytesStored(int numBytesStored) {
        this.numBytesStored = numBytesStored;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}