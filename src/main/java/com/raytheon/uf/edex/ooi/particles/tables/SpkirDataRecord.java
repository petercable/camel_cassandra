package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "spkir_data_record")
public class SpkirDataRecord extends CassandraParticle {

    @Column(value = "instrument_id")
    private String instrumentId;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "timer")
    private double timer;

    @Column(value = "sample_delay")
    private int sampleDelay;

    @Column(value = "spkir_samples")
    private List<Long> spkirSamples;

    @Column(value = "spkir_samples_dims")
    private int spkirSamplesDims;

    @Column(value = "spkir_samples_sizes")
    private List<Long> spkirSamplesSizes;

    @Column(value = "vin_sense")
    private int vinSense;

    @Column(value = "va_sense")
    private int vaSense;

    @Column(value = "internal_temperature")
    private int internalTemperature;

    @Column(value = "frame_counter")
    private int frameCounter;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setInstrumentId((String) particle.get("instrument_id"));
        setSerialNumber((String) particle.get("serial_number"));
        setTimer((double) particle.get("timer"));
        setSampleDelay((int) particle.get("sample_delay"));
        setSpkirSamples((List<Long>) particle.get("spkir_samples"));
        setSpkirSamplesDims((int) particle.get("spkir_samples_dims"));
        setSpkirSamplesSizes((List<Long>) particle.get("spkir_samples_sizes"));
        setVinSense((int) particle.get("vin_sense"));
        setVaSense((int) particle.get("va_sense"));
        setInternalTemperature((int) particle.get("internal_temperature"));
        setFrameCounter((int) particle.get("frame_counter"));
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
    public List<Long> getSpkirSamples() {
        // TODO - restore original dimensions, (remove fill values?)
        return spkirSamples;
    }

    public void setSpkirSamples(List<Long> spkirSamples) {
        // TODO - flatten for storage, insert fill values
        this.spkirSamples = spkirSamples;
    }
    public int getSpkirSamplesDims() {
        return spkirSamplesDims;
    }

    public void setSpkirSamplesDims(int spkirSamplesDims) {
        this.spkirSamplesDims = spkirSamplesDims;
    }
    public List<Long> getSpkirSamplesSizes() {
        return spkirSamplesSizes;
    }

    public void setSpkirSamplesSizes(List<Long> spkirSamplesSizes) {
        this.spkirSamplesSizes = spkirSamplesSizes;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}