package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flort_d_status")
public class FlortDStatus extends CassandraParticle {

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "firmware_version")
    private String firmwareVersion;

    @Column(value = "number_measurements_per_reported_value")
    private int numberMeasurementsPerReportedValue;

    @Column(value = "number_of_reported_values_per_packet")
    private int numberOfReportedValuesPerPacket;

    @Column(value = "measurement_1_dark_count_value")
    private int measurement1DarkCountValue;

    @Column(value = "measurement_2_dark_count_value")
    private int measurement2DarkCountValue;

    @Column(value = "measurement_3_dark_count_value")
    private int measurement3DarkCountValue;

    @Column(value = "measurement_1_slope_value")
    private float measurement1SlopeValue;

    @Column(value = "measurement_2_slope_value")
    private float measurement2SlopeValue;

    @Column(value = "measurement_3_slope_value")
    private float measurement3SlopeValue;

    @Column(value = "predefined_output_sequence")
    private int predefinedOutputSequence;

    @Column(value = "baud_rate")
    private int baudRate;

    @Column(value = "number_of_packets_per_set")
    private int numberOfPacketsPerSet;

    @Column(value = "recording_mode")
    private int recordingMode;

    @Column(value = "manual_mode")
    private int manualMode;

    @Column(value = "sampling_interval")
    private String samplingInterval;

    @Column(value = "date")
    private String date;

    @Column(value = "clock")
    private String clock;

    @Column(value = "manual_start_time")
    private String manualStartTime;

    @Column(value = "internal_memory")
    private int internalMemory;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((String) particle.get("serial_number"));
        setFirmwareVersion((String) particle.get("firmware_version"));
        setNumberMeasurementsPerReportedValue((int) particle.get("number_measurements_per_reported_value"));
        setNumberOfReportedValuesPerPacket((int) particle.get("number_of_reported_values_per_packet"));
        setMeasurement1DarkCountValue((int) particle.get("measurement_1_dark_count_value"));
        setMeasurement2DarkCountValue((int) particle.get("measurement_2_dark_count_value"));
        setMeasurement3DarkCountValue((int) particle.get("measurement_3_dark_count_value"));
        setMeasurement1SlopeValue((float) particle.get("measurement_1_slope_value"));
        setMeasurement2SlopeValue((float) particle.get("measurement_2_slope_value"));
        setMeasurement3SlopeValue((float) particle.get("measurement_3_slope_value"));
        setPredefinedOutputSequence((int) particle.get("predefined_output_sequence"));
        setBaudRate((int) particle.get("baud_rate"));
        setNumberOfPacketsPerSet((int) particle.get("number_of_packets_per_set"));
        setRecordingMode((int) particle.get("recording_mode"));
        setManualMode((int) particle.get("manual_mode"));
        setSamplingInterval((String) particle.get("sampling_interval"));
        setDate((String) particle.get("date"));
        setClock((String) particle.get("clock"));
        setManualStartTime((String) particle.get("manual_start_time"));
        setInternalMemory((int) particle.get("internal_memory"));
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public int getNumberMeasurementsPerReportedValue() {
        return numberMeasurementsPerReportedValue;
    }

    public void setNumberMeasurementsPerReportedValue(int numberMeasurementsPerReportedValue) {
        this.numberMeasurementsPerReportedValue = numberMeasurementsPerReportedValue;
    }
    public int getNumberOfReportedValuesPerPacket() {
        return numberOfReportedValuesPerPacket;
    }

    public void setNumberOfReportedValuesPerPacket(int numberOfReportedValuesPerPacket) {
        this.numberOfReportedValuesPerPacket = numberOfReportedValuesPerPacket;
    }
    public int getMeasurement1DarkCountValue() {
        return measurement1DarkCountValue;
    }

    public void setMeasurement1DarkCountValue(int measurement1DarkCountValue) {
        this.measurement1DarkCountValue = measurement1DarkCountValue;
    }
    public int getMeasurement2DarkCountValue() {
        return measurement2DarkCountValue;
    }

    public void setMeasurement2DarkCountValue(int measurement2DarkCountValue) {
        this.measurement2DarkCountValue = measurement2DarkCountValue;
    }
    public int getMeasurement3DarkCountValue() {
        return measurement3DarkCountValue;
    }

    public void setMeasurement3DarkCountValue(int measurement3DarkCountValue) {
        this.measurement3DarkCountValue = measurement3DarkCountValue;
    }
    public float getMeasurement1SlopeValue() {
        return measurement1SlopeValue;
    }

    public void setMeasurement1SlopeValue(float measurement1SlopeValue) {
        this.measurement1SlopeValue = measurement1SlopeValue;
    }
    public float getMeasurement2SlopeValue() {
        return measurement2SlopeValue;
    }

    public void setMeasurement2SlopeValue(float measurement2SlopeValue) {
        this.measurement2SlopeValue = measurement2SlopeValue;
    }
    public float getMeasurement3SlopeValue() {
        return measurement3SlopeValue;
    }

    public void setMeasurement3SlopeValue(float measurement3SlopeValue) {
        this.measurement3SlopeValue = measurement3SlopeValue;
    }
    public int getPredefinedOutputSequence() {
        return predefinedOutputSequence;
    }

    public void setPredefinedOutputSequence(int predefinedOutputSequence) {
        this.predefinedOutputSequence = predefinedOutputSequence;
    }
    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }
    public int getNumberOfPacketsPerSet() {
        return numberOfPacketsPerSet;
    }

    public void setNumberOfPacketsPerSet(int numberOfPacketsPerSet) {
        this.numberOfPacketsPerSet = numberOfPacketsPerSet;
    }
    public int getRecordingMode() {
        return recordingMode;
    }

    public void setRecordingMode(int recordingMode) {
        this.recordingMode = recordingMode;
    }
    public int getManualMode() {
        return manualMode;
    }

    public void setManualMode(int manualMode) {
        this.manualMode = manualMode;
    }
    public String getSamplingInterval() {
        return samplingInterval;
    }

    public void setSamplingInterval(String samplingInterval) {
        this.samplingInterval = samplingInterval;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }
    public String getManualStartTime() {
        return manualStartTime;
    }

    public void setManualStartTime(String manualStartTime) {
        this.manualStartTime = manualStartTime;
    }
    public int getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(int internalMemory) {
        this.internalMemory = internalMemory;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}