package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "spkir_a_configuration_record")
public class SpkirAConfigurationRecord extends CassandraParticle {

    @Column(value = "spkir_a_firmware_version")
    private String spkirAFirmwareVersion;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "telemetry_baud_rate")
    private long telemetryBaudRate;

    @Column(value = "max_frame_rate")
    private String maxFrameRate;

    @Column(value = "initialize_silent_mode")
    private int initializeSilentMode;

    @Column(value = "initialize_power_down")
    private int initializePowerDown;

    @Column(value = "initialize_auto_telemetry")
    private int initializeAutoTelemetry;

    @Column(value = "network_mode")
    private int networkMode;

    @Column(value = "network_address")
    private int networkAddress;

    @Column(value = "network_baud_rate")
    private long networkBaudRate;

    @Column(value = "instrument_id")
    private String instrumentId;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSpkirAFirmwareVersion((String) particle.get("spkir_a_firmware_version"));
        setSerialNumber((String) particle.get("serial_number"));
        setTelemetryBaudRate((long) particle.get("telemetry_baud_rate"));
        setMaxFrameRate((String) particle.get("max_frame_rate"));
        setInitializeSilentMode((int) particle.get("initialize_silent_mode"));
        setInitializePowerDown((int) particle.get("initialize_power_down"));
        setInitializeAutoTelemetry((int) particle.get("initialize_auto_telemetry"));
        setNetworkMode((int) particle.get("network_mode"));
        setNetworkAddress((int) particle.get("network_address"));
        setNetworkBaudRate((long) particle.get("network_baud_rate"));
        setInstrumentId((String) particle.get("instrument_id"));
    }

    public String getSpkirAFirmwareVersion() {
        return spkirAFirmwareVersion;
    }

    public void setSpkirAFirmwareVersion(String spkirAFirmwareVersion) {
        this.spkirAFirmwareVersion = spkirAFirmwareVersion;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public long getTelemetryBaudRate() {
        return telemetryBaudRate;
    }

    public void setTelemetryBaudRate(long telemetryBaudRate) {
        this.telemetryBaudRate = telemetryBaudRate;
    }
    public String getMaxFrameRate() {
        return maxFrameRate;
    }

    public void setMaxFrameRate(String maxFrameRate) {
        this.maxFrameRate = maxFrameRate;
    }
    public int getInitializeSilentMode() {
        return initializeSilentMode;
    }

    public void setInitializeSilentMode(int initializeSilentMode) {
        this.initializeSilentMode = initializeSilentMode;
    }
    public int getInitializePowerDown() {
        return initializePowerDown;
    }

    public void setInitializePowerDown(int initializePowerDown) {
        this.initializePowerDown = initializePowerDown;
    }
    public int getInitializeAutoTelemetry() {
        return initializeAutoTelemetry;
    }

    public void setInitializeAutoTelemetry(int initializeAutoTelemetry) {
        this.initializeAutoTelemetry = initializeAutoTelemetry;
    }
    public int getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(int networkMode) {
        this.networkMode = networkMode;
    }
    public int getNetworkAddress() {
        return networkAddress;
    }

    public void setNetworkAddress(int networkAddress) {
        this.networkAddress = networkAddress;
    }
    public long getNetworkBaudRate() {
        return networkBaudRate;
    }

    public void setNetworkBaudRate(long networkBaudRate) {
        this.networkBaudRate = networkBaudRate;
    }
    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}