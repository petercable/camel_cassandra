package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vadcp_5thbeam_system_configuration")
public class Vadcp5thbeamSystemConfiguration extends CassandraParticle {

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "transducer_frequency")
    private long transducerFrequency;

    @Column(value = "configuration")
    private String configuration;

    @Column(value = "match_layer")
    private String matchLayer;

    @Column(value = "beam_angle")
    private int beamAngle;

    @Column(value = "beam_pattern")
    private String beamPattern;

    @Column(value = "orientation")
    private String orientation;

    @Column(value = "sensors")
    private String sensors;

    @Column(value = "pressure_coeff_c3")
    private float pressureCoeffC3;

    @Column(value = "pressure_coeff_c2")
    private float pressureCoeffC2;

    @Column(value = "pressure_coeff_c1")
    private float pressureCoeffC1;

    @Column(value = "pressure_coeff_offset")
    private float pressureCoeffOffset;

    @Column(value = "temperature_sensor_offset")
    private float temperatureSensorOffset;

    @Column(value = "cpu_firmware")
    private String cpuFirmware;

    @Column(value = "boot_code_required")
    private String bootCodeRequired;

    @Column(value = "boot_code_actual")
    private String bootCodeActual;

    @Column(value = "demod_1_version")
    private String demod1Version;

    @Column(value = "demod_1_type")
    private String demod1Type;

    @Column(value = "demod_2_version")
    private String demod2Version;

    @Column(value = "demod_2_type")
    private String demod2Type;

    @Column(value = "power_timing_version")
    private String powerTimingVersion;

    @Column(value = "power_timing_type")
    private String powerTimingType;

    @Column(value = "board_serial_numbers")
    private String boardSerialNumbers;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((String) particle.get("serial_number"));
        setTransducerFrequency((long) particle.get("transducer_frequency"));
        setConfiguration((String) particle.get("configuration"));
        setMatchLayer((String) particle.get("match_layer"));
        setBeamAngle((int) particle.get("beam_angle"));
        setBeamPattern((String) particle.get("beam_pattern"));
        setOrientation((String) particle.get("orientation"));
        setSensors((String) particle.get("sensors"));
        setPressureCoeffC3((float) particle.get("pressure_coeff_c3"));
        setPressureCoeffC2((float) particle.get("pressure_coeff_c2"));
        setPressureCoeffC1((float) particle.get("pressure_coeff_c1"));
        setPressureCoeffOffset((float) particle.get("pressure_coeff_offset"));
        setTemperatureSensorOffset((float) particle.get("temperature_sensor_offset"));
        setCpuFirmware((String) particle.get("cpu_firmware"));
        setBootCodeRequired((String) particle.get("boot_code_required"));
        setBootCodeActual((String) particle.get("boot_code_actual"));
        setDemod1Version((String) particle.get("demod_1_version"));
        setDemod1Type((String) particle.get("demod_1_type"));
        setDemod2Version((String) particle.get("demod_2_version"));
        setDemod2Type((String) particle.get("demod_2_type"));
        setPowerTimingVersion((String) particle.get("power_timing_version"));
        setPowerTimingType((String) particle.get("power_timing_type"));
        setBoardSerialNumbers((String) particle.get("board_serial_numbers"));
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public long getTransducerFrequency() {
        return transducerFrequency;
    }

    public void setTransducerFrequency(long transducerFrequency) {
        this.transducerFrequency = transducerFrequency;
    }
    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
    public String getMatchLayer() {
        return matchLayer;
    }

    public void setMatchLayer(String matchLayer) {
        this.matchLayer = matchLayer;
    }
    public int getBeamAngle() {
        return beamAngle;
    }

    public void setBeamAngle(int beamAngle) {
        this.beamAngle = beamAngle;
    }
    public String getBeamPattern() {
        return beamPattern;
    }

    public void setBeamPattern(String beamPattern) {
        this.beamPattern = beamPattern;
    }
    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }
    public float getPressureCoeffC3() {
        return pressureCoeffC3;
    }

    public void setPressureCoeffC3(float pressureCoeffC3) {
        this.pressureCoeffC3 = pressureCoeffC3;
    }
    public float getPressureCoeffC2() {
        return pressureCoeffC2;
    }

    public void setPressureCoeffC2(float pressureCoeffC2) {
        this.pressureCoeffC2 = pressureCoeffC2;
    }
    public float getPressureCoeffC1() {
        return pressureCoeffC1;
    }

    public void setPressureCoeffC1(float pressureCoeffC1) {
        this.pressureCoeffC1 = pressureCoeffC1;
    }
    public float getPressureCoeffOffset() {
        return pressureCoeffOffset;
    }

    public void setPressureCoeffOffset(float pressureCoeffOffset) {
        this.pressureCoeffOffset = pressureCoeffOffset;
    }
    public float getTemperatureSensorOffset() {
        return temperatureSensorOffset;
    }

    public void setTemperatureSensorOffset(float temperatureSensorOffset) {
        this.temperatureSensorOffset = temperatureSensorOffset;
    }
    public String getCpuFirmware() {
        return cpuFirmware;
    }

    public void setCpuFirmware(String cpuFirmware) {
        this.cpuFirmware = cpuFirmware;
    }
    public String getBootCodeRequired() {
        return bootCodeRequired;
    }

    public void setBootCodeRequired(String bootCodeRequired) {
        this.bootCodeRequired = bootCodeRequired;
    }
    public String getBootCodeActual() {
        return bootCodeActual;
    }

    public void setBootCodeActual(String bootCodeActual) {
        this.bootCodeActual = bootCodeActual;
    }
    public String getDemod1Version() {
        return demod1Version;
    }

    public void setDemod1Version(String demod1Version) {
        this.demod1Version = demod1Version;
    }
    public String getDemod1Type() {
        return demod1Type;
    }

    public void setDemod1Type(String demod1Type) {
        this.demod1Type = demod1Type;
    }
    public String getDemod2Version() {
        return demod2Version;
    }

    public void setDemod2Version(String demod2Version) {
        this.demod2Version = demod2Version;
    }
    public String getDemod2Type() {
        return demod2Type;
    }

    public void setDemod2Type(String demod2Type) {
        this.demod2Type = demod2Type;
    }
    public String getPowerTimingVersion() {
        return powerTimingVersion;
    }

    public void setPowerTimingVersion(String powerTimingVersion) {
        this.powerTimingVersion = powerTimingVersion;
    }
    public String getPowerTimingType() {
        return powerTimingType;
    }

    public void setPowerTimingType(String powerTimingType) {
        this.powerTimingType = powerTimingType;
    }
    public String getBoardSerialNumbers() {
        return boardSerialNumbers;
    }

    public void setBoardSerialNumbers(String boardSerialNumbers) {
        this.boardSerialNumbers = boardSerialNumbers;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}