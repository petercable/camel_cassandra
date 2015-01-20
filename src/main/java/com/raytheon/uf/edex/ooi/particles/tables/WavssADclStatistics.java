package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wavss_a_dcl_statistics")
public class WavssADclStatistics extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "date_string")
    private String dateString;

    @Column(value = "time_string")
    private String timeString;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "number_zero_crossings")
    private int numberZeroCrossings;

    @Column(value = "average_wave_height")
    private float averageWaveHeight;

    @Column(value = "mean_spectral_period")
    private float meanSpectralPeriod;

    @Column(value = "max_wave_height")
    private float maxWaveHeight;

    @Column(value = "significant_wave_height")
    private float significantWaveHeight;

    @Column(value = "significant_period")
    private float significantPeriod;

    @Column(value = "wave_height_10")
    private float waveHeight10;

    @Column(value = "wave_period_10")
    private float wavePeriod10;

    @Column(value = "mean_wave_period")
    private float meanWavePeriod;

    @Column(value = "peak_wave_period")
    private float peakWavePeriod;

    @Column(value = "wave_period_tp5")
    private float wavePeriodTp5;

    @Column(value = "wave_height_hmo")
    private float waveHeightHmo;

    @Column(value = "mean_direction")
    private float meanDirection;

    @Column(value = "mean_spread")
    private float meanSpread;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setDateString((String) particle.get("date_string"));
        setTimeString((String) particle.get("time_string"));
        setSerialNumber((int) particle.get("serial_number"));
        setNumberZeroCrossings((int) particle.get("number_zero_crossings"));
        setAverageWaveHeight((float) particle.get("average_wave_height"));
        setMeanSpectralPeriod((float) particle.get("mean_spectral_period"));
        setMaxWaveHeight((float) particle.get("max_wave_height"));
        setSignificantWaveHeight((float) particle.get("significant_wave_height"));
        setSignificantPeriod((float) particle.get("significant_period"));
        setWaveHeight10((float) particle.get("wave_height_10"));
        setWavePeriod10((float) particle.get("wave_period_10"));
        setMeanWavePeriod((float) particle.get("mean_wave_period"));
        setPeakWavePeriod((float) particle.get("peak_wave_period"));
        setWavePeriodTp5((float) particle.get("wave_period_tp5"));
        setWaveHeightHmo((float) particle.get("wave_height_hmo"));
        setMeanDirection((float) particle.get("mean_direction"));
        setMeanSpread((float) particle.get("mean_spread"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getNumberZeroCrossings() {
        return numberZeroCrossings;
    }

    public void setNumberZeroCrossings(int numberZeroCrossings) {
        this.numberZeroCrossings = numberZeroCrossings;
    }
    public float getAverageWaveHeight() {
        return averageWaveHeight;
    }

    public void setAverageWaveHeight(float averageWaveHeight) {
        this.averageWaveHeight = averageWaveHeight;
    }
    public float getMeanSpectralPeriod() {
        return meanSpectralPeriod;
    }

    public void setMeanSpectralPeriod(float meanSpectralPeriod) {
        this.meanSpectralPeriod = meanSpectralPeriod;
    }
    public float getMaxWaveHeight() {
        return maxWaveHeight;
    }

    public void setMaxWaveHeight(float maxWaveHeight) {
        this.maxWaveHeight = maxWaveHeight;
    }
    public float getSignificantWaveHeight() {
        return significantWaveHeight;
    }

    public void setSignificantWaveHeight(float significantWaveHeight) {
        this.significantWaveHeight = significantWaveHeight;
    }
    public float getSignificantPeriod() {
        return significantPeriod;
    }

    public void setSignificantPeriod(float significantPeriod) {
        this.significantPeriod = significantPeriod;
    }
    public float getWaveHeight10() {
        return waveHeight10;
    }

    public void setWaveHeight10(float waveHeight10) {
        this.waveHeight10 = waveHeight10;
    }
    public float getWavePeriod10() {
        return wavePeriod10;
    }

    public void setWavePeriod10(float wavePeriod10) {
        this.wavePeriod10 = wavePeriod10;
    }
    public float getMeanWavePeriod() {
        return meanWavePeriod;
    }

    public void setMeanWavePeriod(float meanWavePeriod) {
        this.meanWavePeriod = meanWavePeriod;
    }
    public float getPeakWavePeriod() {
        return peakWavePeriod;
    }

    public void setPeakWavePeriod(float peakWavePeriod) {
        this.peakWavePeriod = peakWavePeriod;
    }
    public float getWavePeriodTp5() {
        return wavePeriodTp5;
    }

    public void setWavePeriodTp5(float wavePeriodTp5) {
        this.wavePeriodTp5 = wavePeriodTp5;
    }
    public float getWaveHeightHmo() {
        return waveHeightHmo;
    }

    public void setWaveHeightHmo(float waveHeightHmo) {
        this.waveHeightHmo = waveHeightHmo;
    }
    public float getMeanDirection() {
        return meanDirection;
    }

    public void setMeanDirection(float meanDirection) {
        this.meanDirection = meanDirection;
    }
    public float getMeanSpread() {
        return meanSpread;
    }

    public void setMeanSpread(float meanSpread) {
        this.meanSpread = meanSpread;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}