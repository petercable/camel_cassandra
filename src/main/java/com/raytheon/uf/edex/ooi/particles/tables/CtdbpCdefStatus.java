package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_cdef_status")
public class CtdbpCdefStatus extends CassandraParticle {

    @Column(value = "firmware_version")
    private String firmwareVersion;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "battery_voltage_main")
    private float batteryVoltageMain;

    @Column(value = "battery_voltage_lithium")
    private float batteryVoltageLithium;

    @Column(value = "operational_current")
    private float operationalCurrent;

    @Column(value = "pump_current")
    private float pumpCurrent;

    @Column(value = "logging_status")
    private String loggingStatus;

    @Column(value = "num_samples")
    private int numSamples;

    @Column(value = "mem_free")
    private int memFree;

    @Column(value = "sample_interval")
    private int sampleInterval;

    @Column(value = "measurements_per_sample")
    private int measurementsPerSample;

    @Column(value = "pump_mode")
    private String pumpMode;

    @Column(value = "delay_before_sampling")
    private float delayBeforeSampling;

    @Column(value = "delay_after_sampling")
    private float delayAfterSampling;

    @Column(value = "tx_real_time")
    private int txRealTime;

    @Column(value = "battery_cutoff")
    private float batteryCutoff;

    @Column(value = "pressure_sensor_type")
    private String pressureSensorType;

    @Column(value = "pressure_sensor_range")
    private int pressureSensorRange;

    @Column(value = "sbe38")
    private int sbe38;

    @Column(value = "sbe50")
    private int sbe50;

    @Column(value = "wetlabs")
    private int wetlabs;

    @Column(value = "optode")
    private int optode;

    @Column(value = "gas_tension_device")
    private int gasTensionDevice;

    @Column(value = "ext_volt_0")
    private int extVolt0;

    @Column(value = "ext_volt_1")
    private int extVolt1;

    @Column(value = "ext_volt_2")
    private int extVolt2;

    @Column(value = "ext_volt_3")
    private int extVolt3;

    @Column(value = "ext_volt_4")
    private int extVolt4;

    @Column(value = "ext_volt_5")
    private int extVolt5;

    @Column(value = "echo_characters")
    private int echoCharacters;

    @Column(value = "output_format")
    private String outputFormat;

    @Column(value = "output_salinity")
    private int outputSalinity;

    @Column(value = "output_sound_velocity")
    private int outputSoundVelocity;

    @Column(value = "serial_sync_mode")
    private int serialSyncMode;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFirmwareVersion((String) particle.get("firmware_version"));
        setSerialNumber((int) particle.get("serial_number"));
        setDateTimeString((String) particle.get("date_time_string"));
        setBatteryVoltageMain((float) particle.get("battery_voltage_main"));
        setBatteryVoltageLithium((float) particle.get("battery_voltage_lithium"));
        setOperationalCurrent((float) particle.get("operational_current"));
        setPumpCurrent((float) particle.get("pump_current"));
        setLoggingStatus((String) particle.get("logging_status"));
        setNumSamples((int) particle.get("num_samples"));
        setMemFree((int) particle.get("mem_free"));
        setSampleInterval((int) particle.get("sample_interval"));
        setMeasurementsPerSample((int) particle.get("measurements_per_sample"));
        setPumpMode((String) particle.get("pump_mode"));
        setDelayBeforeSampling((float) particle.get("delay_before_sampling"));
        setDelayAfterSampling((float) particle.get("delay_after_sampling"));
        setTxRealTime((int) particle.get("tx_real_time"));
        setBatteryCutoff((float) particle.get("battery_cutoff"));
        setPressureSensorType((String) particle.get("pressure_sensor_type"));
        setPressureSensorRange((int) particle.get("pressure_sensor_range"));
        setSbe38((int) particle.get("sbe38"));
        setSbe50((int) particle.get("sbe50"));
        setWetlabs((int) particle.get("wetlabs"));
        setOptode((int) particle.get("optode"));
        setGasTensionDevice((int) particle.get("gas_tension_device"));
        setExtVolt0((int) particle.get("ext_volt_0"));
        setExtVolt1((int) particle.get("ext_volt_1"));
        setExtVolt2((int) particle.get("ext_volt_2"));
        setExtVolt3((int) particle.get("ext_volt_3"));
        setExtVolt4((int) particle.get("ext_volt_4"));
        setExtVolt5((int) particle.get("ext_volt_5"));
        setEchoCharacters((int) particle.get("echo_characters"));
        setOutputFormat((String) particle.get("output_format"));
        setOutputSalinity((int) particle.get("output_salinity"));
        setOutputSoundVelocity((int) particle.get("output_sound_velocity"));
        setSerialSyncMode((int) particle.get("serial_sync_mode"));
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
    public String getLoggingStatus() {
        return loggingStatus;
    }

    public void setLoggingStatus(String loggingStatus) {
        this.loggingStatus = loggingStatus;
    }
    public int getNumSamples() {
        return numSamples;
    }

    public void setNumSamples(int numSamples) {
        this.numSamples = numSamples;
    }
    public int getMemFree() {
        return memFree;
    }

    public void setMemFree(int memFree) {
        this.memFree = memFree;
    }
    public int getSampleInterval() {
        return sampleInterval;
    }

    public void setSampleInterval(int sampleInterval) {
        this.sampleInterval = sampleInterval;
    }
    public int getMeasurementsPerSample() {
        return measurementsPerSample;
    }

    public void setMeasurementsPerSample(int measurementsPerSample) {
        this.measurementsPerSample = measurementsPerSample;
    }
    public String getPumpMode() {
        return pumpMode;
    }

    public void setPumpMode(String pumpMode) {
        this.pumpMode = pumpMode;
    }
    public float getDelayBeforeSampling() {
        return delayBeforeSampling;
    }

    public void setDelayBeforeSampling(float delayBeforeSampling) {
        this.delayBeforeSampling = delayBeforeSampling;
    }
    public float getDelayAfterSampling() {
        return delayAfterSampling;
    }

    public void setDelayAfterSampling(float delayAfterSampling) {
        this.delayAfterSampling = delayAfterSampling;
    }
    public int getTxRealTime() {
        return txRealTime;
    }

    public void setTxRealTime(int txRealTime) {
        this.txRealTime = txRealTime;
    }
    public float getBatteryCutoff() {
        return batteryCutoff;
    }

    public void setBatteryCutoff(float batteryCutoff) {
        this.batteryCutoff = batteryCutoff;
    }
    public String getPressureSensorType() {
        return pressureSensorType;
    }

    public void setPressureSensorType(String pressureSensorType) {
        this.pressureSensorType = pressureSensorType;
    }
    public int getPressureSensorRange() {
        return pressureSensorRange;
    }

    public void setPressureSensorRange(int pressureSensorRange) {
        this.pressureSensorRange = pressureSensorRange;
    }
    public int getSbe38() {
        return sbe38;
    }

    public void setSbe38(int sbe38) {
        this.sbe38 = sbe38;
    }
    public int getSbe50() {
        return sbe50;
    }

    public void setSbe50(int sbe50) {
        this.sbe50 = sbe50;
    }
    public int getWetlabs() {
        return wetlabs;
    }

    public void setWetlabs(int wetlabs) {
        this.wetlabs = wetlabs;
    }
    public int getOptode() {
        return optode;
    }

    public void setOptode(int optode) {
        this.optode = optode;
    }
    public int getGasTensionDevice() {
        return gasTensionDevice;
    }

    public void setGasTensionDevice(int gasTensionDevice) {
        this.gasTensionDevice = gasTensionDevice;
    }
    public int getExtVolt0() {
        return extVolt0;
    }

    public void setExtVolt0(int extVolt0) {
        this.extVolt0 = extVolt0;
    }
    public int getExtVolt1() {
        return extVolt1;
    }

    public void setExtVolt1(int extVolt1) {
        this.extVolt1 = extVolt1;
    }
    public int getExtVolt2() {
        return extVolt2;
    }

    public void setExtVolt2(int extVolt2) {
        this.extVolt2 = extVolt2;
    }
    public int getExtVolt3() {
        return extVolt3;
    }

    public void setExtVolt3(int extVolt3) {
        this.extVolt3 = extVolt3;
    }
    public int getExtVolt4() {
        return extVolt4;
    }

    public void setExtVolt4(int extVolt4) {
        this.extVolt4 = extVolt4;
    }
    public int getExtVolt5() {
        return extVolt5;
    }

    public void setExtVolt5(int extVolt5) {
        this.extVolt5 = extVolt5;
    }
    public int getEchoCharacters() {
        return echoCharacters;
    }

    public void setEchoCharacters(int echoCharacters) {
        this.echoCharacters = echoCharacters;
    }
    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }
    public int getOutputSalinity() {
        return outputSalinity;
    }

    public void setOutputSalinity(int outputSalinity) {
        this.outputSalinity = outputSalinity;
    }
    public int getOutputSoundVelocity() {
        return outputSoundVelocity;
    }

    public void setOutputSoundVelocity(int outputSoundVelocity) {
        this.outputSoundVelocity = outputSoundVelocity;
    }
    public int getSerialSyncMode() {
        return serialSyncMode;
    }

    public void setSerialSyncMode(int serialSyncMode) {
        this.serialSyncMode = serialSyncMode;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}