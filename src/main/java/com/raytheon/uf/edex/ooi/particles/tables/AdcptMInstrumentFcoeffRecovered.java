package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcpt_m_instrument_fcoeff_recovered")
public class AdcptMInstrumentFcoeffRecovered extends CassandraParticle {

    @Column(value = "file_time")
    private String fileTime;

    @Column(value = "num_fields")
    private int numFields;

    @Column(value = "num_freq")
    private int numFreq;

    @Column(value = "freq_w_band")
    private double freqWBand;

    @Column(value = "freq_0")
    private double freq0;

    @Column(value = "frequency_band")
    private List<Double> frequencyBand;

    @Column(value = "frequency_band_dims")
    private int frequencyBandDims;

    @Column(value = "frequency_band_sizes")
    private List<Long> frequencyBandSizes;

    @Column(value = "bandwidth_band")
    private List<Double> bandwidthBand;

    @Column(value = "bandwidth_band_dims")
    private int bandwidthBandDims;

    @Column(value = "bandwidth_band_sizes")
    private List<Long> bandwidthBandSizes;

    @Column(value = "energy_density_band")
    private List<Double> energyDensityBand;

    @Column(value = "energy_density_band_dims")
    private int energyDensityBandDims;

    @Column(value = "energy_density_band_sizes")
    private List<Long> energyDensityBandSizes;

    @Column(value = "direction_band")
    private List<Double> directionBand;

    @Column(value = "direction_band_dims")
    private int directionBandDims;

    @Column(value = "direction_band_sizes")
    private List<Long> directionBandSizes;

    @Column(value = "a1_band")
    private List<Double> a1Band;

    @Column(value = "a1_band_dims")
    private int a1BandDims;

    @Column(value = "a1_band_sizes")
    private List<Long> a1BandSizes;

    @Column(value = "b1_band")
    private List<Double> b1Band;

    @Column(value = "b1_band_dims")
    private int b1BandDims;

    @Column(value = "b1_band_sizes")
    private List<Long> b1BandSizes;

    @Column(value = "a2_band")
    private List<Double> a2Band;

    @Column(value = "a2_band_dims")
    private int a2BandDims;

    @Column(value = "a2_band_sizes")
    private List<Long> a2BandSizes;

    @Column(value = "b2_band")
    private List<Double> b2Band;

    @Column(value = "b2_band_dims")
    private int b2BandDims;

    @Column(value = "b2_band_sizes")
    private List<Long> b2BandSizes;

    @Column(value = "check_factor_band")
    private List<Double> checkFactorBand;

    @Column(value = "check_factor_band_dims")
    private int checkFactorBandDims;

    @Column(value = "check_factor_band_sizes")
    private List<Long> checkFactorBandSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFileTime((String) particle.get("file_time"));
        setNumFields((int) particle.get("num_fields"));
        setNumFreq((int) particle.get("num_freq"));
        setFreqWBand((double) particle.get("freq_w_band"));
        setFreq0((double) particle.get("freq_0"));
        setFrequencyBand((List<Double>) particle.get("frequency_band"));
        setFrequencyBandDims((int) particle.get("frequency_band_dims"));
        setFrequencyBandSizes((List<Long>) particle.get("frequency_band_sizes"));
        setBandwidthBand((List<Double>) particle.get("bandwidth_band"));
        setBandwidthBandDims((int) particle.get("bandwidth_band_dims"));
        setBandwidthBandSizes((List<Long>) particle.get("bandwidth_band_sizes"));
        setEnergyDensityBand((List<Double>) particle.get("energy_density_band"));
        setEnergyDensityBandDims((int) particle.get("energy_density_band_dims"));
        setEnergyDensityBandSizes((List<Long>) particle.get("energy_density_band_sizes"));
        setDirectionBand((List<Double>) particle.get("direction_band"));
        setDirectionBandDims((int) particle.get("direction_band_dims"));
        setDirectionBandSizes((List<Long>) particle.get("direction_band_sizes"));
        setA1Band((List<Double>) particle.get("a1_band"));
        setA1BandDims((int) particle.get("a1_band_dims"));
        setA1BandSizes((List<Long>) particle.get("a1_band_sizes"));
        setB1Band((List<Double>) particle.get("b1_band"));
        setB1BandDims((int) particle.get("b1_band_dims"));
        setB1BandSizes((List<Long>) particle.get("b1_band_sizes"));
        setA2Band((List<Double>) particle.get("a2_band"));
        setA2BandDims((int) particle.get("a2_band_dims"));
        setA2BandSizes((List<Long>) particle.get("a2_band_sizes"));
        setB2Band((List<Double>) particle.get("b2_band"));
        setB2BandDims((int) particle.get("b2_band_dims"));
        setB2BandSizes((List<Long>) particle.get("b2_band_sizes"));
        setCheckFactorBand((List<Double>) particle.get("check_factor_band"));
        setCheckFactorBandDims((int) particle.get("check_factor_band_dims"));
        setCheckFactorBandSizes((List<Long>) particle.get("check_factor_band_sizes"));
    }

    public String getFileTime() {
        return fileTime;
    }

    public void setFileTime(String fileTime) {
        this.fileTime = fileTime;
    }
    public int getNumFields() {
        return numFields;
    }

    public void setNumFields(int numFields) {
        this.numFields = numFields;
    }
    public int getNumFreq() {
        return numFreq;
    }

    public void setNumFreq(int numFreq) {
        this.numFreq = numFreq;
    }
    public double getFreqWBand() {
        return freqWBand;
    }

    public void setFreqWBand(double freqWBand) {
        this.freqWBand = freqWBand;
    }
    public double getFreq0() {
        return freq0;
    }

    public void setFreq0(double freq0) {
        this.freq0 = freq0;
    }
    public List<Double> getFrequencyBand() {
        // TODO - restore original dimensions, (remove fill values?)
        return frequencyBand;
    }

    public void setFrequencyBand(List<Double> frequencyBand) {
        // TODO - flatten for storage, insert fill values
        this.frequencyBand = frequencyBand;
    }
    public int getFrequencyBandDims() {
        return frequencyBandDims;
    }

    public void setFrequencyBandDims(int frequencyBandDims) {
        this.frequencyBandDims = frequencyBandDims;
    }
    public List<Long> getFrequencyBandSizes() {
        return frequencyBandSizes;
    }

    public void setFrequencyBandSizes(List<Long> frequencyBandSizes) {
        this.frequencyBandSizes = frequencyBandSizes;
    }
    public List<Double> getBandwidthBand() {
        // TODO - restore original dimensions, (remove fill values?)
        return bandwidthBand;
    }

    public void setBandwidthBand(List<Double> bandwidthBand) {
        // TODO - flatten for storage, insert fill values
        this.bandwidthBand = bandwidthBand;
    }
    public int getBandwidthBandDims() {
        return bandwidthBandDims;
    }

    public void setBandwidthBandDims(int bandwidthBandDims) {
        this.bandwidthBandDims = bandwidthBandDims;
    }
    public List<Long> getBandwidthBandSizes() {
        return bandwidthBandSizes;
    }

    public void setBandwidthBandSizes(List<Long> bandwidthBandSizes) {
        this.bandwidthBandSizes = bandwidthBandSizes;
    }
    public List<Double> getEnergyDensityBand() {
        // TODO - restore original dimensions, (remove fill values?)
        return energyDensityBand;
    }

    public void setEnergyDensityBand(List<Double> energyDensityBand) {
        // TODO - flatten for storage, insert fill values
        this.energyDensityBand = energyDensityBand;
    }
    public int getEnergyDensityBandDims() {
        return energyDensityBandDims;
    }

    public void setEnergyDensityBandDims(int energyDensityBandDims) {
        this.energyDensityBandDims = energyDensityBandDims;
    }
    public List<Long> getEnergyDensityBandSizes() {
        return energyDensityBandSizes;
    }

    public void setEnergyDensityBandSizes(List<Long> energyDensityBandSizes) {
        this.energyDensityBandSizes = energyDensityBandSizes;
    }
    public List<Double> getDirectionBand() {
        // TODO - restore original dimensions, (remove fill values?)
        return directionBand;
    }

    public void setDirectionBand(List<Double> directionBand) {
        // TODO - flatten for storage, insert fill values
        this.directionBand = directionBand;
    }
    public int getDirectionBandDims() {
        return directionBandDims;
    }

    public void setDirectionBandDims(int directionBandDims) {
        this.directionBandDims = directionBandDims;
    }
    public List<Long> getDirectionBandSizes() {
        return directionBandSizes;
    }

    public void setDirectionBandSizes(List<Long> directionBandSizes) {
        this.directionBandSizes = directionBandSizes;
    }
    public List<Double> getA1Band() {
        // TODO - restore original dimensions, (remove fill values?)
        return a1Band;
    }

    public void setA1Band(List<Double> a1Band) {
        // TODO - flatten for storage, insert fill values
        this.a1Band = a1Band;
    }
    public int getA1BandDims() {
        return a1BandDims;
    }

    public void setA1BandDims(int a1BandDims) {
        this.a1BandDims = a1BandDims;
    }
    public List<Long> getA1BandSizes() {
        return a1BandSizes;
    }

    public void setA1BandSizes(List<Long> a1BandSizes) {
        this.a1BandSizes = a1BandSizes;
    }
    public List<Double> getB1Band() {
        // TODO - restore original dimensions, (remove fill values?)
        return b1Band;
    }

    public void setB1Band(List<Double> b1Band) {
        // TODO - flatten for storage, insert fill values
        this.b1Band = b1Band;
    }
    public int getB1BandDims() {
        return b1BandDims;
    }

    public void setB1BandDims(int b1BandDims) {
        this.b1BandDims = b1BandDims;
    }
    public List<Long> getB1BandSizes() {
        return b1BandSizes;
    }

    public void setB1BandSizes(List<Long> b1BandSizes) {
        this.b1BandSizes = b1BandSizes;
    }
    public List<Double> getA2Band() {
        // TODO - restore original dimensions, (remove fill values?)
        return a2Band;
    }

    public void setA2Band(List<Double> a2Band) {
        // TODO - flatten for storage, insert fill values
        this.a2Band = a2Band;
    }
    public int getA2BandDims() {
        return a2BandDims;
    }

    public void setA2BandDims(int a2BandDims) {
        this.a2BandDims = a2BandDims;
    }
    public List<Long> getA2BandSizes() {
        return a2BandSizes;
    }

    public void setA2BandSizes(List<Long> a2BandSizes) {
        this.a2BandSizes = a2BandSizes;
    }
    public List<Double> getB2Band() {
        // TODO - restore original dimensions, (remove fill values?)
        return b2Band;
    }

    public void setB2Band(List<Double> b2Band) {
        // TODO - flatten for storage, insert fill values
        this.b2Band = b2Band;
    }
    public int getB2BandDims() {
        return b2BandDims;
    }

    public void setB2BandDims(int b2BandDims) {
        this.b2BandDims = b2BandDims;
    }
    public List<Long> getB2BandSizes() {
        return b2BandSizes;
    }

    public void setB2BandSizes(List<Long> b2BandSizes) {
        this.b2BandSizes = b2BandSizes;
    }
    public List<Double> getCheckFactorBand() {
        // TODO - restore original dimensions, (remove fill values?)
        return checkFactorBand;
    }

    public void setCheckFactorBand(List<Double> checkFactorBand) {
        // TODO - flatten for storage, insert fill values
        this.checkFactorBand = checkFactorBand;
    }
    public int getCheckFactorBandDims() {
        return checkFactorBandDims;
    }

    public void setCheckFactorBandDims(int checkFactorBandDims) {
        this.checkFactorBandDims = checkFactorBandDims;
    }
    public List<Long> getCheckFactorBandSizes() {
        return checkFactorBandSizes;
    }

    public void setCheckFactorBandSizes(List<Long> checkFactorBandSizes) {
        this.checkFactorBandSizes = checkFactorBandSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}