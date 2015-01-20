package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcpt_m_instrument_dspec_recovered")
public class AdcptMInstrumentDspecRecovered extends CassandraParticle {

    @Column(value = "file_time")
    private String fileTime;

    @Column(value = "num_dir")
    private int numDir;

    @Column(value = "num_freq")
    private int numFreq;

    @Column(value = "freq_w_band")
    private double freqWBand;

    @Column(value = "freq_0")
    private double freq0;

    @Column(value = "start_dir")
    private double startDir;

    @Column(value = "directional_surface_spectrum")
    private List<Long> directionalSurfaceSpectrum;

    @Column(value = "directional_surface_spectrum_dims")
    private int directionalSurfaceSpectrumDims;

    @Column(value = "directional_surface_spectrum_sizes")
    private List<Long> directionalSurfaceSpectrumSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFileTime((String) particle.get("file_time"));
        setNumDir((int) particle.get("num_dir"));
        setNumFreq((int) particle.get("num_freq"));
        setFreqWBand((double) particle.get("freq_w_band"));
        setFreq0((double) particle.get("freq_0"));
        setStartDir((double) particle.get("start_dir"));
        setDirectionalSurfaceSpectrum((List<Long>) particle.get("directional_surface_spectrum"));
        setDirectionalSurfaceSpectrumDims((int) particle.get("directional_surface_spectrum_dims"));
        setDirectionalSurfaceSpectrumSizes((List<Long>) particle.get("directional_surface_spectrum_sizes"));
    }

    public String getFileTime() {
        return fileTime;
    }

    public void setFileTime(String fileTime) {
        this.fileTime = fileTime;
    }
    public int getNumDir() {
        return numDir;
    }

    public void setNumDir(int numDir) {
        this.numDir = numDir;
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
    public double getStartDir() {
        return startDir;
    }

    public void setStartDir(double startDir) {
        this.startDir = startDir;
    }
    public List<Long> getDirectionalSurfaceSpectrum() {
        // TODO - restore original dimensions, (remove fill values?)
        return directionalSurfaceSpectrum;
    }

    public void setDirectionalSurfaceSpectrum(List<Long> directionalSurfaceSpectrum) {
        // TODO - flatten for storage, insert fill values
        this.directionalSurfaceSpectrum = directionalSurfaceSpectrum;
    }
    public int getDirectionalSurfaceSpectrumDims() {
        return directionalSurfaceSpectrumDims;
    }

    public void setDirectionalSurfaceSpectrumDims(int directionalSurfaceSpectrumDims) {
        this.directionalSurfaceSpectrumDims = directionalSurfaceSpectrumDims;
    }
    public List<Long> getDirectionalSurfaceSpectrumSizes() {
        return directionalSurfaceSpectrumSizes;
    }

    public void setDirectionalSurfaceSpectrumSizes(List<Long> directionalSurfaceSpectrumSizes) {
        this.directionalSurfaceSpectrumSizes = directionalSurfaceSpectrumSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}