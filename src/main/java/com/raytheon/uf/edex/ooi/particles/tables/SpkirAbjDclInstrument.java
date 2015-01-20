package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "spkir_abj_dcl_instrument")
public class SpkirAbjDclInstrument extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "instrument_id")
    private String instrumentId;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "timer")
    private double timer;

    @Column(value = "sample_delay")
    private int sampleDelay;

    @Column(value = "channel_array")
    private List<Long> channelArray;

    @Column(value = "channel_array_dims")
    private int channelArrayDims;

    @Column(value = "channel_array_sizes")
    private List<Long> channelArraySizes;

    @Column(value = "vin_sense")
    private int vinSense;

    @Column(value = "va_sense")
    private int vaSense;

    @Column(value = "internal_temperature")
    private int internalTemperature;

    @Column(value = "frame_counter")
    private int frameCounter;

    @Column(value = "passed_checksum")
    private int passedChecksum;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setInstrumentId((String) particle.get("instrument_id"));
        setSerialNumber((String) particle.get("serial_number"));
        setTimer((double) particle.get("timer"));
        setSampleDelay((int) particle.get("sample_delay"));
        setChannelArray((List<Long>) particle.get("channel_array"));
        setChannelArrayDims((int) particle.get("channel_array_dims"));
        setChannelArraySizes((List<Long>) particle.get("channel_array_sizes"));
        setVinSense((int) particle.get("vin_sense"));
        setVaSense((int) particle.get("va_sense"));
        setInternalTemperature((int) particle.get("internal_temperature"));
        setFrameCounter((int) particle.get("frame_counter"));
        setPassedChecksum((int) particle.get("passed_checksum"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public double getTimer() {
        return timer;
    }

    public void setTimer(double timer) {
        this.timer = timer;
    }
    public int getSampleDelay() {
        return sampleDelay;
    }

    public void setSampleDelay(int sampleDelay) {
        this.sampleDelay = sampleDelay;
    }
    public List<Long> getChannelArray() {
        // TODO - restore original dimensions, (remove fill values?)
        return channelArray;
    }

    public void setChannelArray(List<Long> channelArray) {
        // TODO - flatten for storage, insert fill values
        this.channelArray = channelArray;
    }
    public int getChannelArrayDims() {
        return channelArrayDims;
    }

    public void setChannelArrayDims(int channelArrayDims) {
        this.channelArrayDims = channelArrayDims;
    }
    public List<Long> getChannelArraySizes() {
        return channelArraySizes;
    }

    public void setChannelArraySizes(List<Long> channelArraySizes) {
        this.channelArraySizes = channelArraySizes;
    }
    public int getVinSense() {
        return vinSense;
    }

    public void setVinSense(int vinSense) {
        this.vinSense = vinSense;
    }
    public int getVaSense() {
        return vaSense;
    }

    public void setVaSense(int vaSense) {
        this.vaSense = vaSense;
    }
    public int getInternalTemperature() {
        return internalTemperature;
    }

    public void setInternalTemperature(int internalTemperature) {
        this.internalTemperature = internalTemperature;
    }
    public int getFrameCounter() {
        return frameCounter;
    }

    public void setFrameCounter(int frameCounter) {
        this.frameCounter = frameCounter;
    }
    public int getPassedChecksum() {
        return passedChecksum;
    }

    public void setPassedChecksum(int passedChecksum) {
        this.passedChecksum = passedChecksum;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}