package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_no_status")
public class CtdbpNoStatus extends CassandraParticle {

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "logging_status")
    private String loggingStatus;

    @Column(value = "num_events")
    private int numEvents;

    @Column(value = "battery_voltage_main")
    private float batteryVoltageMain;

    @Column(value = "battery_voltage_lithium")
    private float batteryVoltageLithium;

    @Column(value = "operational_current")
    private float operationalCurrent;

    @Column(value = "pump_current")
    private float pumpCurrent;

    @Column(value = "ext_v01_current")
    private float extV01Current;

    @Column(value = "serial_current")
    private float serialCurrent;

    @Column(value = "mem_free")
    private int memFree;

    @Column(value = "num_samples")
    private int numSamples;

    @Column(value = "samples_free")
    private int samplesFree;

    @Column(value = "sample_length")
    private int sampleLength;

    @Column(value = "profiles")
    private int profiles;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((int) particle.get("serial_number"));
        setDateTimeString((String) particle.get("date_time_string"));
        setLoggingStatus((String) particle.get("logging_status"));
        setNumEvents((int) particle.get("num_events"));
        setBatteryVoltageMain((float) particle.get("battery_voltage_main"));
        setBatteryVoltageLithium((float) particle.get("battery_voltage_lithium"));
        setOperationalCurrent((float) particle.get("operational_current"));
        setPumpCurrent((float) particle.get("pump_current"));
        setExtV01Current((float) particle.get("ext_v01_current"));
        setSerialCurrent((float) particle.get("serial_current"));
        setMemFree((int) particle.get("mem_free"));
        setNumSamples((int) particle.get("num_samples"));
        setSamplesFree((int) particle.get("samples_free"));
        setSampleLength((int) particle.get("sample_length"));
        setProfiles((int) particle.get("profiles"));
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
    public String getLoggingStatus() {
        return loggingStatus;
    }

    public void setLoggingStatus(String loggingStatus) {
        this.loggingStatus = loggingStatus;
    }
    public int getNumEvents() {
        return numEvents;
    }

    public void setNumEvents(int numEvents) {
        this.numEvents = numEvents;
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
    public float getOperationalCurrent() {
        return operationalCurrent;
    }

    public void setOperationalCurrent(float operationalCurrent) {
        this.operationalCurrent = operationalCurrent;
    }
    public float getPumpCurrent() {
        return pumpCurrent;
    }

    public void setPumpCurrent(float pumpCurrent) {
        this.pumpCurrent = pumpCurrent;
    }
    public float getExtV01Current() {
        return extV01Current;
    }

    public void setExtV01Current(float extV01Current) {
        this.extV01Current = extV01Current;
    }
    public float getSerialCurrent() {
        return serialCurrent;
    }

    public void setSerialCurrent(float serialCurrent) {
        this.serialCurrent = serialCurrent;
    }
    public int getMemFree() {
        return memFree;
    }

    public void setMemFree(int memFree) {
        this.memFree = memFree;
    }
    public int getNumSamples() {
        return numSamples;
    }

    public void setNumSamples(int numSamples) {
        this.numSamples = numSamples;
    }
    public int getSamplesFree() {
        return samplesFree;
    }

    public void setSamplesFree(int samplesFree) {
        this.samplesFree = samplesFree;
    }
    public int getSampleLength() {
        return sampleLength;
    }

    public void setSampleLength(int sampleLength) {
        this.sampleLength = sampleLength;
    }
    public int getProfiles() {
        return profiles;
    }

    public void setProfiles(int profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}