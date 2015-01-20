package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdpf_sbe43_hardware")
public class CtdpfSbe43Hardware extends CassandraParticle {

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "firmware_version")
    private String firmwareVersion;

    @Column(value = "firmware_date")
    private String firmwareDate;

    @Column(value = "command_set_version")
    private String commandSetVersion;

    @Column(value = "pcb_serial_number")
    private List<String> pcbSerialNumber;

    @Column(value = "pcb_serial_number_dims")
    private int pcbSerialNumberDims;

    @Column(value = "pcb_serial_number_sizes")
    private List<Long> pcbSerialNumberSizes;

    @Column(value = "assembly_number")
    private List<String> assemblyNumber;

    @Column(value = "assembly_number_dims")
    private int assemblyNumberDims;

    @Column(value = "assembly_number_sizes")
    private List<Long> assemblyNumberSizes;

    @Column(value = "manufacture_date")
    private String manufactureDate;

    @Column(value = "temp_sensor_serial_number")
    private int tempSensorSerialNumber;

    @Column(value = "cond_sensor_serial_number")
    private int condSensorSerialNumber;

    @Column(value = "pressure_sensor_type")
    private String pressureSensorType;

    @Column(value = "strain_pressure_sensor_serial_number")
    private String strainPressureSensorSerialNumber;

    @Column(value = "volt0_type")
    private String volt0Type;

    @Column(value = "volt0_serial_number")
    private String volt0SerialNumber;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((int) particle.get("serial_number"));
        setFirmwareVersion((String) particle.get("firmware_version"));
        setFirmwareDate((String) particle.get("firmware_date"));
        setCommandSetVersion((String) particle.get("command_set_version"));
        setPcbSerialNumber((List<String>) particle.get("pcb_serial_number"));
        setPcbSerialNumberDims((int) particle.get("pcb_serial_number_dims"));
        setPcbSerialNumberSizes((List<Long>) particle.get("pcb_serial_number_sizes"));
        setAssemblyNumber((List<String>) particle.get("assembly_number"));
        setAssemblyNumberDims((int) particle.get("assembly_number_dims"));
        setAssemblyNumberSizes((List<Long>) particle.get("assembly_number_sizes"));
        setManufactureDate((String) particle.get("manufacture_date"));
        setTempSensorSerialNumber((int) particle.get("temp_sensor_serial_number"));
        setCondSensorSerialNumber((int) particle.get("cond_sensor_serial_number"));
        setPressureSensorType((String) particle.get("pressure_sensor_type"));
        setStrainPressureSensorSerialNumber((String) particle.get("strain_pressure_sensor_serial_number"));
        setVolt0Type((String) particle.get("volt0_type"));
        setVolt0SerialNumber((String) particle.get("volt0_serial_number"));
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
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
    public String getCommandSetVersion() {
        return commandSetVersion;
    }

    public void setCommandSetVersion(String commandSetVersion) {
        this.commandSetVersion = commandSetVersion;
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
    public List<String> getAssemblyNumber() {
        // TODO - restore original dimensions, (remove fill values?)
        return assemblyNumber;
    }

    public void setAssemblyNumber(List<String> assemblyNumber) {
        // TODO - flatten for storage, insert fill values
        this.assemblyNumber = assemblyNumber;
    }
    public int getAssemblyNumberDims() {
        return assemblyNumberDims;
    }

    public void setAssemblyNumberDims(int assemblyNumberDims) {
        this.assemblyNumberDims = assemblyNumberDims;
    }
    public List<Long> getAssemblyNumberSizes() {
        return assemblyNumberSizes;
    }

    public void setAssemblyNumberSizes(List<Long> assemblyNumberSizes) {
        this.assemblyNumberSizes = assemblyNumberSizes;
    }
    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public int getTempSensorSerialNumber() {
        return tempSensorSerialNumber;
    }

    public void setTempSensorSerialNumber(int tempSensorSerialNumber) {
        this.tempSensorSerialNumber = tempSensorSerialNumber;
    }
    public int getCondSensorSerialNumber() {
        return condSensorSerialNumber;
    }

    public void setCondSensorSerialNumber(int condSensorSerialNumber) {
        this.condSensorSerialNumber = condSensorSerialNumber;
    }
    public String getPressureSensorType() {
        return pressureSensorType;
    }

    public void setPressureSensorType(String pressureSensorType) {
        this.pressureSensorType = pressureSensorType;
    }
    public String getStrainPressureSensorSerialNumber() {
        return strainPressureSensorSerialNumber;
    }

    public void setStrainPressureSensorSerialNumber(String strainPressureSensorSerialNumber) {
        this.strainPressureSensorSerialNumber = strainPressureSensorSerialNumber;
    }
    public String getVolt0Type() {
        return volt0Type;
    }

    public void setVolt0Type(String volt0Type) {
        this.volt0Type = volt0Type;
    }
    public String getVolt0SerialNumber() {
        return volt0SerialNumber;
    }

    public void setVolt0SerialNumber(String volt0SerialNumber) {
        this.volt0SerialNumber = volt0SerialNumber;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}