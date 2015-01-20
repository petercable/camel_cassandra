package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "prest_hardware_data")
public class PrestHardwareData extends CassandraParticle {

    @Column(value = "device_type")
    private String deviceType;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "manufacturer")
    private String manufacturer;

    @Column(value = "firmware_version")
    private String firmwareVersion;

    @Column(value = "firmware_date")
    private String firmwareDate;

    @Column(value = "hardware_version")
    private String hardwareVersion;

    @Column(value = "pcb_serial_number")
    private List<String> pcbSerialNumber;

    @Column(value = "pcb_serial_number_dims")
    private int pcbSerialNumberDims;

    @Column(value = "pcb_serial_number_sizes")
    private List<Long> pcbSerialNumberSizes;

    @Column(value = "pcb_type")
    private String pcbType;

    @Column(value = "manufacture_date")
    private String manufactureDate;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDeviceType((String) particle.get("device_type"));
        setSerialNumber((int) particle.get("serial_number"));
        setManufacturer((String) particle.get("manufacturer"));
        setFirmwareVersion((String) particle.get("firmware_version"));
        setFirmwareDate((String) particle.get("firmware_date"));
        setHardwareVersion((String) particle.get("hardware_version"));
        setPcbSerialNumber((List<String>) particle.get("pcb_serial_number"));
        setPcbSerialNumberDims((int) particle.get("pcb_serial_number_dims"));
        setPcbSerialNumberSizes((List<Long>) particle.get("pcb_serial_number_sizes"));
        setPcbType((String) particle.get("pcb_type"));
        setManufactureDate((String) particle.get("manufacture_date"));
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public String getFirmwareDate() {
        return firmwareDate;
    }

    public void setFirmwareDate(String firmwareDate) {
        this.firmwareDate = firmwareDate;
    }
    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }
    public List<String> getPcbSerialNumber() {
        // TODO - restore original dimensions, (remove fill values?)
        return pcbSerialNumber;
    }

    public void setPcbSerialNumber(List<String> pcbSerialNumber) {
        // TODO - flatten for storage, insert fill values
        this.pcbSerialNumber = pcbSerialNumber;
    }
    public int getPcbSerialNumberDims() {
        return pcbSerialNumberDims;
    }

    public void setPcbSerialNumberDims(int pcbSerialNumberDims) {
        this.pcbSerialNumberDims = pcbSerialNumberDims;
    }
    public List<Long> getPcbSerialNumberSizes() {
        return pcbSerialNumberSizes;
    }

    public void setPcbSerialNumberSizes(List<Long> pcbSerialNumberSizes) {
        this.pcbSerialNumberSizes = pcbSerialNumberSizes;
    }
    public String getPcbType() {
        return pcbType;
    }

    public void setPcbType(String pcbType) {
        this.pcbType = pcbType;
    }
    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}