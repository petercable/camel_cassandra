package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcpt_m_instrument_log9_recovered")
public class AdcptMInstrumentLog9Recovered extends CassandraParticle {

    @Column(value = "burst_number")
    private long burstNumber;

    @Column(value = "burst_start_time")
    private List<Integer> burstStartTime;

    @Column(value = "burst_start_time_dims")
    private int burstStartTimeDims;

    @Column(value = "burst_start_time_sizes")
    private List<Long> burstStartTimeSizes;

    @Column(value = "significant_wave_height")
    private float significantWaveHeight;

    @Column(value = "peak_wave_period")
    private float peakWavePeriod;

    @Column(value = "peak_wave_direction")
    private float peakWaveDirection;

    @Column(value = "tp_sea")
    private float tpSea;

    @Column(value = "dp_sea")
    private float dpSea;

    @Column(value = "hs_sea")
    private float hsSea;

    @Column(value = "tp_swell")
    private float tpSwell;

    @Column(value = "dp_swell")
    private float dpSwell;

    @Column(value = "hs_swell")
    private float hsSwell;

    @Column(value = "depth_water_level")
    private float depthWaterLevel;

    @Column(value = "h_max")
    private float hMax;

    @Column(value = "t_max")
    private float tMax;

    @Column(value = "h_1_3")
    private float h13;

    @Column(value = "t_1_3")
    private float t13;

    @Column(value = "h_mean")
    private float hMean;

    @Column(value = "t_mean")
    private float tMean;

    @Column(value = "h_1_10")
    private float h110;

    @Column(value = "t_1_10")
    private float t110;

    @Column(value = "d_mean")
    private float dMean;

    @Column(value = "num_bins")
    private int numBins;

    @Column(value = "depth_level_magnitude")
    private List<Float> depthLevelMagnitude;

    @Column(value = "depth_level_magnitude_dims")
    private int depthLevelMagnitudeDims;

    @Column(value = "depth_level_magnitude_sizes")
    private List<Long> depthLevelMagnitudeSizes;

    @Column(value = "depth_level_direction")
    private List<Integer> depthLevelDirection;

    @Column(value = "depth_level_direction_dims")
    private int depthLevelDirectionDims;

    @Column(value = "depth_level_direction_sizes")
    private List<Long> depthLevelDirectionSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setBurstNumber((long) particle.get("burst_number"));
        setBurstStartTime((List<Integer>) particle.get("burst_start_time"));
        setBurstStartTimeDims((int) particle.get("burst_start_time_dims"));
        setBurstStartTimeSizes((List<Long>) particle.get("burst_start_time_sizes"));
        setSignificantWaveHeight((float) particle.get("significant_wave_height"));
        setPeakWavePeriod((float) particle.get("peak_wave_period"));
        setPeakWaveDirection((float) particle.get("peak_wave_direction"));
        setTpSea((float) particle.get("tp_sea"));
        setDpSea((float) particle.get("dp_sea"));
        setHsSea((float) particle.get("hs_sea"));
        setTpSwell((float) particle.get("tp_swell"));
        setDpSwell((float) particle.get("dp_swell"));
        setHsSwell((float) particle.get("hs_swell"));
        setDepthWaterLevel((float) particle.get("depth_water_level"));
        setHMax((float) particle.get("h_max"));
        setTMax((float) particle.get("t_max"));
        setH13((float) particle.get("h_1_3"));
        setT13((float) particle.get("t_1_3"));
        setHMean((float) particle.get("h_mean"));
        setTMean((float) particle.get("t_mean"));
        setH110((float) particle.get("h_1_10"));
        setT110((float) particle.get("t_1_10"));
        setDMean((float) particle.get("d_mean"));
        setNumBins((int) particle.get("num_bins"));
        setDepthLevelMagnitude((List<Float>) particle.get("depth_level_magnitude"));
        setDepthLevelMagnitudeDims((int) particle.get("depth_level_magnitude_dims"));
        setDepthLevelMagnitudeSizes((List<Long>) particle.get("depth_level_magnitude_sizes"));
        setDepthLevelDirection((List<Integer>) particle.get("depth_level_direction"));
        setDepthLevelDirectionDims((int) particle.get("depth_level_direction_dims"));
        setDepthLevelDirectionSizes((List<Long>) particle.get("depth_level_direction_sizes"));
    }

    public long getBurstNumber() {
        return burstNumber;
    }

    public void setBurstNumber(long burstNumber) {
        this.burstNumber = burstNumber;
    }
    public List<Integer> getBurstStartTime() {
        // TODO - restore original dimensions, (remove fill values?)
        return burstStartTime;
    }

    public void setBurstStartTime(List<Integer> burstStartTime) {
        // TODO - flatten for storage, insert fill values
        this.burstStartTime = burstStartTime;
    }
    public int getBurstStartTimeDims() {
        return burstStartTimeDims;
    }

    public void setBurstStartTimeDims(int burstStartTimeDims) {
        this.burstStartTimeDims = burstStartTimeDims;
    }
    public List<Long> getBurstStartTimeSizes() {
        return burstStartTimeSizes;
    }

    public void setBurstStartTimeSizes(List<Long> burstStartTimeSizes) {
        this.burstStartTimeSizes = burstStartTimeSizes;
    }
    public float getSignificantWaveHeight() {
        return significantWaveHeight;
    }

    public void setSignificantWaveHeight(float significantWaveHeight) {
        this.significantWaveHeight = significantWaveHeight;
    }
    public float getPeakWavePeriod() {
        return peakWavePeriod;
    }

    public void setPeakWavePeriod(float peakWavePeriod) {
        this.peakWavePeriod = peakWavePeriod;
    }
    public float getPeakWaveDirection() {
        return peakWaveDirection;
    }

    public void setPeakWaveDirection(float peakWaveDirection) {
        this.peakWaveDirection = peakWaveDirection;
    }
    public float getTpSea() {
        return tpSea;
    }

    public void setTpSea(float tpSea) {
        this.tpSea = tpSea;
    }
    public float getDpSea() {
        return dpSea;
    }

    public void setDpSea(float dpSea) {
        this.dpSea = dpSea;
    }
    public float getHsSea() {
        return hsSea;
    }

    public void setHsSea(float hsSea) {
        this.hsSea = hsSea;
    }
    public float getTpSwell() {
        return tpSwell;
    }

    public void setTpSwell(float tpSwell) {
        this.tpSwell = tpSwell;
    }
    public float getDpSwell() {
        return dpSwell;
    }

    public void setDpSwell(float dpSwell) {
        this.dpSwell = dpSwell;
    }
    public float getHsSwell() {
        return hsSwell;
    }

    public void setHsSwell(float hsSwell) {
        this.hsSwell = hsSwell;
    }
    public float getDepthWaterLevel() {
        return depthWaterLevel;
    }

    public void setDepthWaterLevel(float depthWaterLevel) {
        this.depthWaterLevel = depthWaterLevel;
    }
    public float getHMax() {
        return hMax;
    }

    public void setHMax(float hMax) {
        this.hMax = hMax;
    }
    public float getTMax() {
        return tMax;
    }

    public void setTMax(float tMax) {
        this.tMax = tMax;
    }
    public float getH13() {
        return h13;
    }

    public void setH13(float h13) {
        this.h13 = h13;
    }
    public float getT13() {
        return t13;
    }

    public void setT13(float t13) {
        this.t13 = t13;
    }
    public float getHMean() {
        return hMean;
    }

    public void setHMean(float hMean) {
        this.hMean = hMean;
    }
    public float getTMean() {
        return tMean;
    }

    public void setTMean(float tMean) {
        this.tMean = tMean;
    }
    public float getH110() {
        return h110;
    }

    public void setH110(float h110) {
        this.h110 = h110;
    }
    public float getT110() {
        return t110;
    }

    public void setT110(float t110) {
        this.t110 = t110;
    }
    public float getDMean() {
        return dMean;
    }

    public void setDMean(float dMean) {
        this.dMean = dMean;
    }
    public int getNumBins() {
        return numBins;
    }

    public void setNumBins(int numBins) {
        this.numBins = numBins;
    }
    public List<Float> getDepthLevelMagnitude() {
        // TODO - restore original dimensions, (remove fill values?)
        return depthLevelMagnitude;
    }

    public void setDepthLevelMagnitude(List<Float> depthLevelMagnitude) {
        // TODO - flatten for storage, insert fill values
        this.depthLevelMagnitude = depthLevelMagnitude;
    }
    public int getDepthLevelMagnitudeDims() {
        return depthLevelMagnitudeDims;
    }

    public void setDepthLevelMagnitudeDims(int depthLevelMagnitudeDims) {
        this.depthLevelMagnitudeDims = depthLevelMagnitudeDims;
    }
    public List<Long> getDepthLevelMagnitudeSizes() {
        return depthLevelMagnitudeSizes;
    }

    public void setDepthLevelMagnitudeSizes(List<Long> depthLevelMagnitudeSizes) {
        this.depthLevelMagnitudeSizes = depthLevelMagnitudeSizes;
    }
    public List<Integer> getDepthLevelDirection() {
        // TODO - restore original dimensions, (remove fill values?)
        return depthLevelDirection;
    }

    public void setDepthLevelDirection(List<Integer> depthLevelDirection) {
        // TODO - flatten for storage, insert fill values
        this.depthLevelDirection = depthLevelDirection;
    }
    public int getDepthLevelDirectionDims() {
        return depthLevelDirectionDims;
    }

    public void setDepthLevelDirectionDims(int depthLevelDirectionDims) {
        this.depthLevelDirectionDims = depthLevelDirectionDims;
    }
    public List<Long> getDepthLevelDirectionSizes() {
        return depthLevelDirectionSizes;
    }

    public void setDepthLevelDirectionSizes(List<Long> depthLevelDirectionSizes) {
        this.depthLevelDirectionSizes = depthLevelDirectionSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}