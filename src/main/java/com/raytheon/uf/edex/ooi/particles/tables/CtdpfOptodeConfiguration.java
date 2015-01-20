package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdpf_optode_configuration")
public class CtdpfOptodeConfiguration extends CassandraParticle {

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "battery_cutoff")
    private float batteryCutoff;

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

    @Column(value = "sbe38")
    private int sbe38;

    @Column(value = "wetlabs")
    private int wetlabs;

    @Column(value = "optode")
    private int optode;

    @Column(value = "gas_tension_device")
    private int gasTensionDevice;

    @Column(value = "echo_characters")
    private int echoCharacters;

    @Column(value = "output_executed_tag")
    private int outputExecutedTag;

    @Column(value = "output_format")
    private String outputFormat;

    @Column(value = "scans_to_average")
    private int scansToAverage;

    @Column(value = "min_cond_freq")
    private int minCondFreq;

    @Column(value = "pump_delay")
    private int pumpDelay;

    @Column(value = "auto_run")
    private int autoRun;

    @Column(value = "ignore_switch")
    private int ignoreSwitch;

    @Column(value = "battery_type")
    private String batteryType;

    @Column(value = "sbe63")
    private int sbe63;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((int) particle.get("serial_number"));
        setBatteryCutoff((float) particle.get("battery_cutoff"));
        setExtVolt0((int) particle.get("ext_volt_0"));
        setExtVolt1((int) particle.get("ext_volt_1"));
        setExtVolt2((int) particle.get("ext_volt_2"));
        setExtVolt3((int) particle.get("ext_volt_3"));
        setExtVolt4((int) particle.get("ext_volt_4"));
        setExtVolt5((int) particle.get("ext_volt_5"));
        setSbe38((int) particle.get("sbe38"));
        setWetlabs((int) particle.get("wetlabs"));
        setOptode((int) particle.get("optode"));
        setGasTensionDevice((int) particle.get("gas_tension_device"));
        setEchoCharacters((int) particle.get("echo_characters"));
        setOutputExecutedTag((int) particle.get("output_executed_tag"));
        setOutputFormat((String) particle.get("output_format"));
        setScansToAverage((int) particle.get("scans_to_average"));
        setMinCondFreq((int) particle.get("min_cond_freq"));
        setPumpDelay((int) particle.get("pump_delay"));
        setAutoRun((int) particle.get("auto_run"));
        setIgnoreSwitch((int) particle.get("ignore_switch"));
        setBatteryType((String) particle.get("battery_type"));
        setSbe63((int) particle.get("sbe63"));
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public float getBatteryCutoff() {
        return batteryCutoff;
    }

    public void setBatteryCutoff(float batteryCutoff) {
        this.batteryCutoff = batteryCutoff;
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
    public int getSbe38() {
        return sbe38;
    }

    public void setSbe38(int sbe38) {
        this.sbe38 = sbe38;
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
    public int getEchoCharacters() {
        return echoCharacters;
    }

    public void setEchoCharacters(int echoCharacters) {
        this.echoCharacters = echoCharacters;
    }
    public int getOutputExecutedTag() {
        return outputExecutedTag;
    }

    public void setOutputExecutedTag(int outputExecutedTag) {
        this.outputExecutedTag = outputExecutedTag;
    }
    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }
    public int getScansToAverage() {
        return scansToAverage;
    }

    public void setScansToAverage(int scansToAverage) {
        this.scansToAverage = scansToAverage;
    }
    public int getMinCondFreq() {
        return minCondFreq;
    }

    public void setMinCondFreq(int minCondFreq) {
        this.minCondFreq = minCondFreq;
    }
    public int getPumpDelay() {
        return pumpDelay;
    }

    public void setPumpDelay(int pumpDelay) {
        this.pumpDelay = pumpDelay;
    }
    public int getAutoRun() {
        return autoRun;
    }

    public void setAutoRun(int autoRun) {
        this.autoRun = autoRun;
    }
    public int getIgnoreSwitch() {
        return ignoreSwitch;
    }

    public void setIgnoreSwitch(int ignoreSwitch) {
        this.ignoreSwitch = ignoreSwitch;
    }
    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }
    public int getSbe63() {
        return sbe63;
    }

    public void setSbe63(int sbe63) {
        this.sbe63 = sbe63;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}