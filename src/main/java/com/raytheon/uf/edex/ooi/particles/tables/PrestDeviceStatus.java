package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "prest_device_status")
public class PrestDeviceStatus extends CassandraParticle {

    @Column(value = "device_type")
    private String deviceType;

    @Column(value = "version")
    private String version;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "event_count")
    private int eventCount;

    @Column(value = "battery_voltage_main")
    private float batteryVoltageMain;

    @Column(value = "sample_number")
    private int sampleNumber;

    @Column(value = "bytes_used")
    private int bytesUsed;

    @Column(value = "bytes_free")
    private int bytesFree;

    @Column(value = "date_time_str")
    private String dateTimeStr;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDeviceType((String) particle.get("device_type"));
        setVersion((String) particle.get("version"));
        setSerialNumber((int) particle.get("serial_number"));
        setEventCount((int) particle.get("event_count"));
        setBatteryVoltageMain((float) particle.get("battery_voltage_main"));
        setSampleNumber((int) particle.get("sample_number"));
        setBytesUsed((int) particle.get("bytes_used"));
        setBytesFree((int) particle.get("bytes_free"));
        setDateTimeStr((String) particle.get("date_time_str"));
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getEventCount() {
        return eventCount;
    }

    public void setEventCount(int eventCount) {
        this.eventCount = eventCount;
    }
    public float getBatteryVoltageMain() {
        return batteryVoltageMain;
    }

    public void setBatteryVoltageMain(float batteryVoltageMain) {
        this.batteryVoltageMain = batteryVoltageMain;
    }
    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }
    public int getBytesUsed() {
        return bytesUsed;
    }

    public void setBytesUsed(int bytesUsed) {
        this.bytesUsed = bytesUsed;
    }
    public int getBytesFree() {
        return bytesFree;
    }

    public void setBytesFree(int bytesFree) {
        this.bytesFree = bytesFree;
    }
    public String getDateTimeStr() {
        return dateTimeStr;
    }

    public void setDateTimeStr(String dateTimeStr) {
        this.dateTimeStr = dateTimeStr;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}