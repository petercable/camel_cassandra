package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "nutnr_b_dcl_full_instrument")
public class NutnrBDclFullInstrument extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "frame_header")
    private String frameHeader;

    @Column(value = "frame_type")
    private String frameType;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "date_of_sample")
    private int dateOfSample;

    @Column(value = "time_of_sample")
    private double timeOfSample;

    @Column(value = "nitrate_concentration")
    private float nitrateConcentration;

    @Column(value = "aux_fitting_1")
    private float auxFitting1;

    @Column(value = "aux_fitting_2")
    private float auxFitting2;

    @Column(value = "aux_fitting_3")
    private float auxFitting3;

    @Column(value = "rms_error")
    private float rmsError;

    @Column(value = "temp_interior")
    private float tempInterior;

    @Column(value = "temp_spectrometer")
    private float tempSpectrometer;

    @Column(value = "temp_lamp")
    private float tempLamp;

    @Column(value = "lamp_time")
    private int lampTime;

    @Column(value = "humidity")
    private float humidity;

    @Column(value = "voltage_lamp")
    private float voltageLamp;

    @Column(value = "voltage_analog")
    private float voltageAnalog;

    @Column(value = "voltage_main")
    private float voltageMain;

    @Column(value = "ref_channel_average")
    private float refChannelAverage;

    @Column(value = "ref_channel_variance")
    private float refChannelVariance;

    @Column(value = "sea_water_dark")
    private float seaWaterDark;

    @Column(value = "spec_channel_average")
    private float specChannelAverage;

    @Column(value = "spectral_channels")
    private List<Integer> spectralChannels;

    @Column(value = "spectral_channels_dims")
    private int spectralChannelsDims;

    @Column(value = "spectral_channels_sizes")
    private List<Long> spectralChannelsSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setFrameHeader((String) particle.get("frame_header"));
        setFrameType((String) particle.get("frame_type"));
        setSerialNumber((String) particle.get("serial_number"));
        setDateOfSample((int) particle.get("date_of_sample"));
        setTimeOfSample((double) particle.get("time_of_sample"));
        setNitrateConcentration((float) particle.get("nitrate_concentration"));
        setAuxFitting1((float) particle.get("aux_fitting_1"));
        setAuxFitting2((float) particle.get("aux_fitting_2"));
        setAuxFitting3((float) particle.get("aux_fitting_3"));
        setRmsError((float) particle.get("rms_error"));
        setTempInterior((float) particle.get("temp_interior"));
        setTempSpectrometer((float) particle.get("temp_spectrometer"));
        setTempLamp((float) particle.get("temp_lamp"));
        setLampTime((int) particle.get("lamp_time"));
        setHumidity((float) particle.get("humidity"));
        setVoltageLamp((float) particle.get("voltage_lamp"));
        setVoltageAnalog((float) particle.get("voltage_analog"));
        setVoltageMain((float) particle.get("voltage_main"));
        setRefChannelAverage((float) particle.get("ref_channel_average"));
        setRefChannelVariance((float) particle.get("ref_channel_variance"));
        setSeaWaterDark((float) particle.get("sea_water_dark"));
        setSpecChannelAverage((float) particle.get("spec_channel_average"));
        setSpectralChannels((List<Integer>) particle.get("spectral_channels"));
        setSpectralChannelsDims((int) particle.get("spectral_channels_dims"));
        setSpectralChannelsSizes((List<Long>) particle.get("spectral_channels_sizes"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public String getFrameHeader() {
        return frameHeader;
    }

    public void setFrameHeader(String frameHeader) {
        this.frameHeader = frameHeader;
    }
    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getDateOfSample() {
        return dateOfSample;
    }

    public void setDateOfSample(int dateOfSample) {
        this.dateOfSample = dateOfSample;
    }
    public double getTimeOfSample() {
        return timeOfSample;
    }

    public void setTimeOfSample(double timeOfSample) {
        this.timeOfSample = timeOfSample;
    }
    public float getNitrateConcentration() {
        return nitrateConcentration;
    }

    public void setNitrateConcentration(float nitrateConcentration) {
        this.nitrateConcentration = nitrateConcentration;
    }
    public float getAuxFitting1() {
        return auxFitting1;
    }

    public void setAuxFitting1(float auxFitting1) {
        this.auxFitting1 = auxFitting1;
    }
    public float getAuxFitting2() {
        return auxFitting2;
    }

    public void setAuxFitting2(float auxFitting2) {
        this.auxFitting2 = auxFitting2;
    }
    public float getAuxFitting3() {
        return auxFitting3;
    }

    public void setAuxFitting3(float auxFitting3) {
        this.auxFitting3 = auxFitting3;
    }
    public float getRmsError() {
        return rmsError;
    }

    public void setRmsError(float rmsError) {
        this.rmsError = rmsError;
    }
    public float getTempInterior() {
        return tempInterior;
    }

    public void setTempInterior(float tempInterior) {
        this.tempInterior = tempInterior;
    }
    public float getTempSpectrometer() {
        return tempSpectrometer;
    }

    public void setTempSpectrometer(float tempSpectrometer) {
        this.tempSpectrometer = tempSpectrometer;
    }
    public float getTempLamp() {
        return tempLamp;
    }

    public void setTempLamp(float tempLamp) {
        this.tempLamp = tempLamp;
    }
    public int getLampTime() {
        return lampTime;
    }

    public void setLampTime(int lampTime) {
        this.lampTime = lampTime;
    }
    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public float getVoltageLamp() {
        return voltageLamp;
    }

    public void setVoltageLamp(float voltageLamp) {
        this.voltageLamp = voltageLamp;
    }
    public float getVoltageAnalog() {
        return voltageAnalog;
    }

    public void setVoltageAnalog(float voltageAnalog) {
        this.voltageAnalog = voltageAnalog;
    }
    public float getVoltageMain() {
        return voltageMain;
    }

    public void setVoltageMain(float voltageMain) {
        this.voltageMain = voltageMain;
    }
    public float getRefChannelAverage() {
        return refChannelAverage;
    }

    public void setRefChannelAverage(float refChannelAverage) {
        this.refChannelAverage = refChannelAverage;
    }
    public float getRefChannelVariance() {
        return refChannelVariance;
    }

    public void setRefChannelVariance(float refChannelVariance) {
        this.refChannelVariance = refChannelVariance;
    }
    public float getSeaWaterDark() {
        return seaWaterDark;
    }

    public void setSeaWaterDark(float seaWaterDark) {
        this.seaWaterDark = seaWaterDark;
    }
    public float getSpecChannelAverage() {
        return specChannelAverage;
    }

    public void setSpecChannelAverage(float specChannelAverage) {
        this.specChannelAverage = specChannelAverage;
    }
    public List<Integer> getSpectralChannels() {
        // TODO - restore original dimensions, (remove fill values?)
        return spectralChannels;
    }

    public void setSpectralChannels(List<Integer> spectralChannels) {
        // TODO - flatten for storage, insert fill values
        this.spectralChannels = spectralChannels;
    }
    public int getSpectralChannelsDims() {
        return spectralChannelsDims;
    }

    public void setSpectralChannelsDims(int spectralChannelsDims) {
        this.spectralChannelsDims = spectralChannelsDims;
    }
    public List<Long> getSpectralChannelsSizes() {
        return spectralChannelsSizes;
    }

    public void setSpectralChannelsSizes(List<Long> spectralChannelsSizes) {
        this.spectralChannelsSizes = spectralChannelsSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}