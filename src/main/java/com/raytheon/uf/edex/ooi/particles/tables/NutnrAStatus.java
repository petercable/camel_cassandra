package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "nutnr_a_status")
public class NutnrAStatus extends CassandraParticle {

    @Column(value = "nutnr_sensor_type")
    private String nutnrSensorType;

    @Column(value = "nutnr_sensor_version")
    private String nutnrSensorVersion;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "nutnr_integrated_wiper")
    private String nutnrIntegratedWiper;

    @Column(value = "nutnr_ext_power_port")
    private String nutnrExtPowerPort;

    @Column(value = "nutnr_lamp_shutter")
    private String nutnrLampShutter;

    @Column(value = "nutnr_reference_detector")
    private String nutnrReferenceDetector;

    @Column(value = "nutnr_wiper_protector")
    private String nutnrWiperProtector;

    @Column(value = "nutnr_super_capacitors")
    private String nutnrSuperCapacitors;

    @Column(value = "nutnr_psb_supervisor")
    private String nutnrPsbSupervisor;

    @Column(value = "nutnr_usb_communication")
    private String nutnrUsbCommunication;

    @Column(value = "nutnr_relay_module")
    private String nutnrRelayModule;

    @Column(value = "nutnr_sdi12_interface")
    private String nutnrSdi12Interface;

    @Column(value = "nutnr_analog_output")
    private String nutnrAnalogOutput;

    @Column(value = "nutnr_int_data_logging")
    private String nutnrIntDataLogging;

    @Column(value = "nutnr_apf_interface")
    private String nutnrApfInterface;

    @Column(value = "nutnr_scheduling")
    private String nutnrScheduling;

    @Column(value = "nutnr_lamp_fan")
    private String nutnrLampFan;

    @Column(value = "nutnr_sensor_address_lamp_temp")
    private String nutnrSensorAddressLampTemp;

    @Column(value = "nutnr_sensor_address_spec_temp")
    private String nutnrSensorAddressSpecTemp;

    @Column(value = "nutnr_sensor_address_hous_temp")
    private String nutnrSensorAddressHousTemp;

    @Column(value = "nutnr_serial_number_spec")
    private String nutnrSerialNumberSpec;

    @Column(value = "nutnr_serial_number_lamp")
    private String nutnrSerialNumberLamp;

    @Column(value = "nutnr_stupstus")
    private String nutnrStupstus;

    @Column(value = "nutnr_output_dark_frame")
    private String nutnrOutputDarkFrame;

    @Column(value = "nutnr_logging_dark_frame")
    private String nutnrLoggingDarkFrame;

    @Column(value = "nutnr_timeresl")
    private String nutnrTimeresl;

    @Column(value = "nutnr_log_file_type")
    private String nutnrLogFileType;

    @Column(value = "nutnr_acqcount")
    private int nutnrAcqcount;

    @Column(value = "nutnr_cntcount")
    private int nutnrCntcount;

    @Column(value = "nutnr_dac_nitrate_min")
    private float nutnrDacNitrateMin;

    @Column(value = "nutnr_dac_nitrate_max")
    private float nutnrDacNitrateMax;

    @Column(value = "nutnr_data_wavelength_low")
    private float nutnrDataWavelengthLow;

    @Column(value = "baud_rate")
    private int baudRate;

    @Column(value = "nutnr_msg_level")
    private String nutnrMsgLevel;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setNutnrSensorType((String) particle.get("nutnr_sensor_type"));
        setNutnrSensorVersion((String) particle.get("nutnr_sensor_version"));
        setSerialNumber((String) particle.get("serial_number"));
        setNutnrIntegratedWiper((String) particle.get("nutnr_integrated_wiper"));
        setNutnrExtPowerPort((String) particle.get("nutnr_ext_power_port"));
        setNutnrLampShutter((String) particle.get("nutnr_lamp_shutter"));
        setNutnrReferenceDetector((String) particle.get("nutnr_reference_detector"));
        setNutnrWiperProtector((String) particle.get("nutnr_wiper_protector"));
        setNutnrSuperCapacitors((String) particle.get("nutnr_super_capacitors"));
        setNutnrPsbSupervisor((String) particle.get("nutnr_psb_supervisor"));
        setNutnrUsbCommunication((String) particle.get("nutnr_usb_communication"));
        setNutnrRelayModule((String) particle.get("nutnr_relay_module"));
        setNutnrSdi12Interface((String) particle.get("nutnr_sdi12_interface"));
        setNutnrAnalogOutput((String) particle.get("nutnr_analog_output"));
        setNutnrIntDataLogging((String) particle.get("nutnr_int_data_logging"));
        setNutnrApfInterface((String) particle.get("nutnr_apf_interface"));
        setNutnrScheduling((String) particle.get("nutnr_scheduling"));
        setNutnrLampFan((String) particle.get("nutnr_lamp_fan"));
        setNutnrSensorAddressLampTemp((String) particle.get("nutnr_sensor_address_lamp_temp"));
        setNutnrSensorAddressSpecTemp((String) particle.get("nutnr_sensor_address_spec_temp"));
        setNutnrSensorAddressHousTemp((String) particle.get("nutnr_sensor_address_hous_temp"));
        setNutnrSerialNumberSpec((String) particle.get("nutnr_serial_number_spec"));
        setNutnrSerialNumberLamp((String) particle.get("nutnr_serial_number_lamp"));
        setNutnrStupstus((String) particle.get("nutnr_stupstus"));
        setNutnrOutputDarkFrame((String) particle.get("nutnr_output_dark_frame"));
        setNutnrLoggingDarkFrame((String) particle.get("nutnr_logging_dark_frame"));
        setNutnrTimeresl((String) particle.get("nutnr_timeresl"));
        setNutnrLogFileType((String) particle.get("nutnr_log_file_type"));
        setNutnrAcqcount((int) particle.get("nutnr_acqcount"));
        setNutnrCntcount((int) particle.get("nutnr_cntcount"));
        setNutnrDacNitrateMin((float) particle.get("nutnr_dac_nitrate_min"));
        setNutnrDacNitrateMax((float) particle.get("nutnr_dac_nitrate_max"));
        setNutnrDataWavelengthLow((float) particle.get("nutnr_data_wavelength_low"));
        setBaudRate((int) particle.get("baud_rate"));
        setNutnrMsgLevel((String) particle.get("nutnr_msg_level"));
    }

    public String getNutnrSensorType() {
        return nutnrSensorType;
    }

    public void setNutnrSensorType(String nutnrSensorType) {
        this.nutnrSensorType = nutnrSensorType;
    }
    public String getNutnrSensorVersion() {
        return nutnrSensorVersion;
    }

    public void setNutnrSensorVersion(String nutnrSensorVersion) {
        this.nutnrSensorVersion = nutnrSensorVersion;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getNutnrIntegratedWiper() {
        return nutnrIntegratedWiper;
    }

    public void setNutnrIntegratedWiper(String nutnrIntegratedWiper) {
        this.nutnrIntegratedWiper = nutnrIntegratedWiper;
    }
    public String getNutnrExtPowerPort() {
        return nutnrExtPowerPort;
    }

    public void setNutnrExtPowerPort(String nutnrExtPowerPort) {
        this.nutnrExtPowerPort = nutnrExtPowerPort;
    }
    public String getNutnrLampShutter() {
        return nutnrLampShutter;
    }

    public void setNutnrLampShutter(String nutnrLampShutter) {
        this.nutnrLampShutter = nutnrLampShutter;
    }
    public String getNutnrReferenceDetector() {
        return nutnrReferenceDetector;
    }

    public void setNutnrReferenceDetector(String nutnrReferenceDetector) {
        this.nutnrReferenceDetector = nutnrReferenceDetector;
    }
    public String getNutnrWiperProtector() {
        return nutnrWiperProtector;
    }

    public void setNutnrWiperProtector(String nutnrWiperProtector) {
        this.nutnrWiperProtector = nutnrWiperProtector;
    }
    public String getNutnrSuperCapacitors() {
        return nutnrSuperCapacitors;
    }

    public void setNutnrSuperCapacitors(String nutnrSuperCapacitors) {
        this.nutnrSuperCapacitors = nutnrSuperCapacitors;
    }
    public String getNutnrPsbSupervisor() {
        return nutnrPsbSupervisor;
    }

    public void setNutnrPsbSupervisor(String nutnrPsbSupervisor) {
        this.nutnrPsbSupervisor = nutnrPsbSupervisor;
    }
    public String getNutnrUsbCommunication() {
        return nutnrUsbCommunication;
    }

    public void setNutnrUsbCommunication(String nutnrUsbCommunication) {
        this.nutnrUsbCommunication = nutnrUsbCommunication;
    }
    public String getNutnrRelayModule() {
        return nutnrRelayModule;
    }

    public void setNutnrRelayModule(String nutnrRelayModule) {
        this.nutnrRelayModule = nutnrRelayModule;
    }
    public String getNutnrSdi12Interface() {
        return nutnrSdi12Interface;
    }

    public void setNutnrSdi12Interface(String nutnrSdi12Interface) {
        this.nutnrSdi12Interface = nutnrSdi12Interface;
    }
    public String getNutnrAnalogOutput() {
        return nutnrAnalogOutput;
    }

    public void setNutnrAnalogOutput(String nutnrAnalogOutput) {
        this.nutnrAnalogOutput = nutnrAnalogOutput;
    }
    public String getNutnrIntDataLogging() {
        return nutnrIntDataLogging;
    }

    public void setNutnrIntDataLogging(String nutnrIntDataLogging) {
        this.nutnrIntDataLogging = nutnrIntDataLogging;
    }
    public String getNutnrApfInterface() {
        return nutnrApfInterface;
    }

    public void setNutnrApfInterface(String nutnrApfInterface) {
        this.nutnrApfInterface = nutnrApfInterface;
    }
    public String getNutnrScheduling() {
        return nutnrScheduling;
    }

    public void setNutnrScheduling(String nutnrScheduling) {
        this.nutnrScheduling = nutnrScheduling;
    }
    public String getNutnrLampFan() {
        return nutnrLampFan;
    }

    public void setNutnrLampFan(String nutnrLampFan) {
        this.nutnrLampFan = nutnrLampFan;
    }
    public String getNutnrSensorAddressLampTemp() {
        return nutnrSensorAddressLampTemp;
    }

    public void setNutnrSensorAddressLampTemp(String nutnrSensorAddressLampTemp) {
        this.nutnrSensorAddressLampTemp = nutnrSensorAddressLampTemp;
    }
    public String getNutnrSensorAddressSpecTemp() {
        return nutnrSensorAddressSpecTemp;
    }

    public void setNutnrSensorAddressSpecTemp(String nutnrSensorAddressSpecTemp) {
        this.nutnrSensorAddressSpecTemp = nutnrSensorAddressSpecTemp;
    }
    public String getNutnrSensorAddressHousTemp() {
        return nutnrSensorAddressHousTemp;
    }

    public void setNutnrSensorAddressHousTemp(String nutnrSensorAddressHousTemp) {
        this.nutnrSensorAddressHousTemp = nutnrSensorAddressHousTemp;
    }
    public String getNutnrSerialNumberSpec() {
        return nutnrSerialNumberSpec;
    }

    public void setNutnrSerialNumberSpec(String nutnrSerialNumberSpec) {
        this.nutnrSerialNumberSpec = nutnrSerialNumberSpec;
    }
    public String getNutnrSerialNumberLamp() {
        return nutnrSerialNumberLamp;
    }

    public void setNutnrSerialNumberLamp(String nutnrSerialNumberLamp) {
        this.nutnrSerialNumberLamp = nutnrSerialNumberLamp;
    }
    public String getNutnrStupstus() {
        return nutnrStupstus;
    }

    public void setNutnrStupstus(String nutnrStupstus) {
        this.nutnrStupstus = nutnrStupstus;
    }
    public String getNutnrOutputDarkFrame() {
        return nutnrOutputDarkFrame;
    }

    public void setNutnrOutputDarkFrame(String nutnrOutputDarkFrame) {
        this.nutnrOutputDarkFrame = nutnrOutputDarkFrame;
    }
    public String getNutnrLoggingDarkFrame() {
        return nutnrLoggingDarkFrame;
    }

    public void setNutnrLoggingDarkFrame(String nutnrLoggingDarkFrame) {
        this.nutnrLoggingDarkFrame = nutnrLoggingDarkFrame;
    }
    public String getNutnrTimeresl() {
        return nutnrTimeresl;
    }

    public void setNutnrTimeresl(String nutnrTimeresl) {
        this.nutnrTimeresl = nutnrTimeresl;
    }
    public String getNutnrLogFileType() {
        return nutnrLogFileType;
    }

    public void setNutnrLogFileType(String nutnrLogFileType) {
        this.nutnrLogFileType = nutnrLogFileType;
    }
    public int getNutnrAcqcount() {
        return nutnrAcqcount;
    }

    public void setNutnrAcqcount(int nutnrAcqcount) {
        this.nutnrAcqcount = nutnrAcqcount;
    }
    public int getNutnrCntcount() {
        return nutnrCntcount;
    }

    public void setNutnrCntcount(int nutnrCntcount) {
        this.nutnrCntcount = nutnrCntcount;
    }
    public float getNutnrDacNitrateMin() {
        return nutnrDacNitrateMin;
    }

    public void setNutnrDacNitrateMin(float nutnrDacNitrateMin) {
        this.nutnrDacNitrateMin = nutnrDacNitrateMin;
    }
    public float getNutnrDacNitrateMax() {
        return nutnrDacNitrateMax;
    }

    public void setNutnrDacNitrateMax(float nutnrDacNitrateMax) {
        this.nutnrDacNitrateMax = nutnrDacNitrateMax;
    }
    public float getNutnrDataWavelengthLow() {
        return nutnrDataWavelengthLow;
    }

    public void setNutnrDataWavelengthLow(float nutnrDataWavelengthLow) {
        this.nutnrDataWavelengthLow = nutnrDataWavelengthLow;
    }
    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }
    public String getNutnrMsgLevel() {
        return nutnrMsgLevel;
    }

    public void setNutnrMsgLevel(String nutnrMsgLevel) {
        this.nutnrMsgLevel = nutnrMsgLevel;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}