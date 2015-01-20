package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdmo_ghqr_imodem_metadata_recovered")
public class CtdmoGhqrImodemMetadataRecovered extends CassandraParticle {

    @Column(value = "sample_number")
    private int sampleNumber;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "battery_voltage_main")
    private float batteryVoltageMain;

    @Column(value = "battery_voltage_lithium")
    private float batteryVoltageLithium;

    @Column(value = "num_samples")
    private int numSamples;

    @Column(value = "mem_free")
    private int memFree;

    @Column(value = "sample_interval")
    private int sampleInterval;

    @Column(value = "instrument_serial_number_u32")
    private long instrumentSerialNumberU32;

    @Column(value = "pressure_range")
    private int pressureRange;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSampleNumber((int) particle.get("sample_number"));
        setDateTimeString((String) particle.get("date_time_string"));
        setBatteryVoltageMain((float) particle.get("battery_voltage_main"));
        setBatteryVoltageLithium((float) particle.get("battery_voltage_lithium"));
        setNumSamples((int) particle.get("num_samples"));
        setMemFree((int) particle.get("mem_free"));
        setSampleInterval((int) particle.get("sample_interval"));
        setInstrumentSerialNumberU32((long) particle.get("instrument_serial_number_u32"));
        setPressureRange((int) particle.get("pressure_range"));
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
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
    public long getInstrumentSerialNumberU32() {
        return instrumentSerialNumberU32;
    }

    public void setInstrumentSerialNumberU32(long instrumentSerialNumberU32) {
        this.instrumentSerialNumberU32 = instrumentSerialNumberU32;
    }
    public int getPressureRange() {
        return pressureRange;
    }

    public void setPressureRange(int pressureRange) {
        this.pressureRange = pressureRange;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}