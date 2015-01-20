package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcpt_m_wvs_recovered")
public class AdcptMWvsRecovered extends CassandraParticle {

    @Column(value = "file_time")
    private String fileTime;

    @Column(value = "sequence_number")
    private int sequenceNumber;

    @Column(value = "file_mode")
    private int fileMode;

    @Column(value = "rec_time_series")
    private int recTimeSeries;

    @Column(value = "rec_spectra")
    private int recSpectra;

    @Column(value = "rec_dir_spec")
    private int recDirSpec;

    @Column(value = "samples_per_burst")
    private int samplesPerBurst;

    @Column(value = "time_between_samples")
    private int timeBetweenSamples;

    @Column(value = "time_between_bursts_sec")
    private int timeBetweenBurstsSec;

    @Column(value = "bin_size")
    private int binSize;

    @Column(value = "bin_1_middle")
    private int bin1Middle;

    @Column(value = "num_range_bins")
    private int numRangeBins;

    @Column(value = "num_vel_bins")
    private int numVelBins;

    @Column(value = "num_int_bins")
    private int numIntBins;

    @Column(value = "num_beams")
    private int numBeams;

    @Column(value = "beam_conf")
    private int beamConf;

    @Column(value = "wave_param_source")
    private int waveParamSource;

    @Column(value = "nfft_samples")
    private int nfftSamples;

    @Column(value = "num_directional_slices")
    private int numDirectionalSlices;

    @Column(value = "num_freq_bins")
    private int numFreqBins;

    @Column(value = "window_type")
    private int windowType;

    @Column(value = "use_press_4_depth")
    private int usePress4Depth;

    @Column(value = "use_strack_4_depth")
    private int useStrack4Depth;

    @Column(value = "strack_spec")
    private int strackSpec;

    @Column(value = "press_spec")
    private int pressSpec;

    @Column(value = "vel_min")
    private int velMin;

    @Column(value = "vel_max")
    private int velMax;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFileTime((String) particle.get("file_time"));
        setSequenceNumber((int) particle.get("sequence_number"));
        setFileMode((int) particle.get("file_mode"));
        setRecTimeSeries((int) particle.get("rec_time_series"));
        setRecSpectra((int) particle.get("rec_spectra"));
        setRecDirSpec((int) particle.get("rec_dir_spec"));
        setSamplesPerBurst((int) particle.get("samples_per_burst"));
        setTimeBetweenSamples((int) particle.get("time_between_samples"));
        setTimeBetweenBurstsSec((int) particle.get("time_between_bursts_sec"));
        setBinSize((int) particle.get("bin_size"));
        setBin1Middle((int) particle.get("bin_1_middle"));
        setNumRangeBins((int) particle.get("num_range_bins"));
        setNumVelBins((int) particle.get("num_vel_bins"));
        setNumIntBins((int) particle.get("num_int_bins"));
        setNumBeams((int) particle.get("num_beams"));
        setBeamConf((int) particle.get("beam_conf"));
        setWaveParamSource((int) particle.get("wave_param_source"));
        setNfftSamples((int) particle.get("nfft_samples"));
        setNumDirectionalSlices((int) particle.get("num_directional_slices"));
        setNumFreqBins((int) particle.get("num_freq_bins"));
        setWindowType((int) particle.get("window_type"));
        setUsePress4Depth((int) particle.get("use_press_4_depth"));
        setUseStrack4Depth((int) particle.get("use_strack_4_depth"));
        setStrackSpec((int) particle.get("strack_spec"));
        setPressSpec((int) particle.get("press_spec"));
        setVelMin((int) particle.get("vel_min"));
        setVelMax((int) particle.get("vel_max"));
    }

    public String getFileTime() {
        return fileTime;
    }

    public void setFileTime(String fileTime) {
        this.fileTime = fileTime;
    }
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    public int getFileMode() {
        return fileMode;
    }

    public void setFileMode(int fileMode) {
        this.fileMode = fileMode;
    }
    public int getRecTimeSeries() {
        return recTimeSeries;
    }

    public void setRecTimeSeries(int recTimeSeries) {
        this.recTimeSeries = recTimeSeries;
    }
    public int getRecSpectra() {
        return recSpectra;
    }

    public void setRecSpectra(int recSpectra) {
        this.recSpectra = recSpectra;
    }
    public int getRecDirSpec() {
        return recDirSpec;
    }

    public void setRecDirSpec(int recDirSpec) {
        this.recDirSpec = recDirSpec;
    }
    public int getSamplesPerBurst() {
        return samplesPerBurst;
    }

    public void setSamplesPerBurst(int samplesPerBurst) {
        this.samplesPerBurst = samplesPerBurst;
    }
    public int getTimeBetweenSamples() {
        return timeBetweenSamples;
    }

    public void setTimeBetweenSamples(int timeBetweenSamples) {
        this.timeBetweenSamples = timeBetweenSamples;
    }
    public int getTimeBetweenBurstsSec() {
        return timeBetweenBurstsSec;
    }

    public void setTimeBetweenBurstsSec(int timeBetweenBurstsSec) {
        this.timeBetweenBurstsSec = timeBetweenBurstsSec;
    }
    public int getBinSize() {
        return binSize;
    }

    public void setBinSize(int binSize) {
        this.binSize = binSize;
    }
    public int getBin1Middle() {
        return bin1Middle;
    }

    public void setBin1Middle(int bin1Middle) {
        this.bin1Middle = bin1Middle;
    }
    public int getNumRangeBins() {
        return numRangeBins;
    }

    public void setNumRangeBins(int numRangeBins) {
        this.numRangeBins = numRangeBins;
    }
    public int getNumVelBins() {
        return numVelBins;
    }

    public void setNumVelBins(int numVelBins) {
        this.numVelBins = numVelBins;
    }
    public int getNumIntBins() {
        return numIntBins;
    }

    public void setNumIntBins(int numIntBins) {
        this.numIntBins = numIntBins;
    }
    public int getNumBeams() {
        return numBeams;
    }

    public void setNumBeams(int numBeams) {
        this.numBeams = numBeams;
    }
    public int getBeamConf() {
        return beamConf;
    }

    public void setBeamConf(int beamConf) {
        this.beamConf = beamConf;
    }
    public int getWaveParamSource() {
        return waveParamSource;
    }

    public void setWaveParamSource(int waveParamSource) {
        this.waveParamSource = waveParamSource;
    }
    public int getNfftSamples() {
        return nfftSamples;
    }

    public void setNfftSamples(int nfftSamples) {
        this.nfftSamples = nfftSamples;
    }
    public int getNumDirectionalSlices() {
        return numDirectionalSlices;
    }

    public void setNumDirectionalSlices(int numDirectionalSlices) {
        this.numDirectionalSlices = numDirectionalSlices;
    }
    public int getNumFreqBins() {
        return numFreqBins;
    }

    public void setNumFreqBins(int numFreqBins) {
        this.numFreqBins = numFreqBins;
    }
    public int getWindowType() {
        return windowType;
    }

    public void setWindowType(int windowType) {
        this.windowType = windowType;
    }
    public int getUsePress4Depth() {
        return usePress4Depth;
    }

    public void setUsePress4Depth(int usePress4Depth) {
        this.usePress4Depth = usePress4Depth;
    }
    public int getUseStrack4Depth() {
        return useStrack4Depth;
    }

    public void setUseStrack4Depth(int useStrack4Depth) {
        this.useStrack4Depth = useStrack4Depth;
    }
    public int getStrackSpec() {
        return strackSpec;
    }

    public void setStrackSpec(int strackSpec) {
        this.strackSpec = strackSpec;
    }
    public int getPressSpec() {
        return pressSpec;
    }

    public void setPressSpec(int pressSpec) {
        this.pressSpec = pressSpec;
    }
    public int getVelMin() {
        return velMin;
    }

    public void setVelMin(int velMin) {
        this.velMin = velMin;
    }
    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}