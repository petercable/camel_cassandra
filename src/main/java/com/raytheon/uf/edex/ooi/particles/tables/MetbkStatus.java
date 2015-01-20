package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "metbk_status")
public class MetbkStatus extends CassandraParticle {

    @Column(value = "instrument_model")
    private String instrumentModel;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "calibration_date")
    private String calibrationDate;

    @Column(value = "firmware_version")
    private String firmwareVersion;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "logging_interval")
    private int loggingInterval;

    @Column(value = "current_tick")
    private int currentTick;

    @Column(value = "recent_record_interval")
    private int recentRecordInterval;

    @Column(value = "flash_card_presence")
    private int flashCardPresence;

    @Column(value = "battery_voltage_main")
    private float batteryVoltageMain;

    @Column(value = "failure_messages")
    private String failureMessages;

    @Column(value = "ptt_id1")
    private String pttId1;

    @Column(value = "ptt_id2")
    private String pttId2;

    @Column(value = "ptt_id3")
    private String pttId3;

    @Column(value = "sampling_state")
    private String samplingState;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setInstrumentModel((String) particle.get("instrument_model"));
        setSerialNumber((String) particle.get("serial_number"));
        setCalibrationDate((String) particle.get("calibration_date"));
        setFirmwareVersion((String) particle.get("firmware_version"));
        setDateTimeString((String) particle.get("date_time_string"));
        setLoggingInterval((int) particle.get("logging_interval"));
        setCurrentTick((int) particle.get("current_tick"));
        setRecentRecordInterval((int) particle.get("recent_record_interval"));
        setFlashCardPresence((int) particle.get("flash_card_presence"));
        setBatteryVoltageMain((float) particle.get("battery_voltage_main"));
        setFailureMessages((String) particle.get("failure_messages"));
        setPttId1((String) particle.get("ptt_id1"));
        setPttId2((String) particle.get("ptt_id2"));
        setPttId3((String) particle.get("ptt_id3"));
        setSamplingState((String) particle.get("sampling_state"));
    }

    public String getInstrumentModel() {
        return instrumentModel;
    }

    public void setInstrumentModel(String instrumentModel) {
        this.instrumentModel = instrumentModel;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getCalibrationDate() {
        return calibrationDate;
    }

    public void setCalibrationDate(String calibrationDate) {
        this.calibrationDate = calibrationDate;
    }
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public int getLoggingInterval() {
        return loggingInterval;
    }

    public void setLoggingInterval(int loggingInterval) {
        this.loggingInterval = loggingInterval;
    }
    public int getCurrentTick() {
        return currentTick;
    }

    public void setCurrentTick(int currentTick) {
        this.currentTick = currentTick;
    }
    public int getRecentRecordInterval() {
        return recentRecordInterval;
    }

    public void setRecentRecordInterval(int recentRecordInterval) {
        this.recentRecordInterval = recentRecordInterval;
    }
    public int getFlashCardPresence() {
        return flashCardPresence;
    }

    public void setFlashCardPresence(int flashCardPresence) {
        this.flashCardPresence = flashCardPresence;
    }
    public float getBatteryVoltageMain() {
        return batteryVoltageMain;
    }

    public void setBatteryVoltageMain(float batteryVoltageMain) {
        this.batteryVoltageMain = batteryVoltageMain;
    }
    public String getFailureMessages() {
        return failureMessages;
    }

    public void setFailureMessages(String failureMessages) {
        this.failureMessages = failureMessages;
    }
    public String getPttId1() {
        return pttId1;
    }

    public void setPttId1(String pttId1) {
        this.pttId1 = pttId1;
    }
    public String getPttId2() {
        return pttId2;
    }

    public void setPttId2(String pttId2) {
        this.pttId2 = pttId2;
    }
    public String getPttId3() {
        return pttId3;
    }

    public void setPttId3(String pttId3) {
        this.pttId3 = pttId3;
    }
    public String getSamplingState() {
        return samplingState;
    }

    public void setSamplingState(String samplingState) {
        this.samplingState = samplingState;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}