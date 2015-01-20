package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "presf_wave_statistics")
public class PresfWaveStatistics extends CassandraParticle {

    @Column(value = "n_avg_band")
    private int nAvgBand;

    @Column(value = "ass_total_variance")
    private float assTotalVariance;

    @Column(value = "ass_total_energy")
    private float assTotalEnergy;

    @Column(value = "ass_sig_wave_period")
    private float assSigWavePeriod;

    @Column(value = "ass_sig_wave_height")
    private float assSigWaveHeight;

    @Column(value = "tss_wave_integration_time")
    private int tssWaveIntegrationTime;

    @Column(value = "tss_number_of_waves")
    private int tssNumberOfWaves;

    @Column(value = "tss_total_variance")
    private float tssTotalVariance;

    @Column(value = "tss_total_energy")
    private float tssTotalEnergy;

    @Column(value = "tss_avg_wave_height")
    private float tssAvgWaveHeight;

    @Column(value = "tss_avg_wave_period")
    private float tssAvgWavePeriod;

    @Column(value = "tss_max_wave_height")
    private float tssMaxWaveHeight;

    @Column(value = "tss_sig_wave_height")
    private float tssSigWaveHeight;

    @Column(value = "tss_sig_wave_period")
    private float tssSigWavePeriod;

    @Column(value = "tss_10_wave_height")
    private float tss10WaveHeight;

    @Column(value = "tss_1_wave_height")
    private float tss1WaveHeight;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setNAvgBand((int) particle.get("n_avg_band"));
        setAssTotalVariance((float) particle.get("ass_total_variance"));
        setAssTotalEnergy((float) particle.get("ass_total_energy"));
        setAssSigWavePeriod((float) particle.get("ass_sig_wave_period"));
        setAssSigWaveHeight((float) particle.get("ass_sig_wave_height"));
        setTssWaveIntegrationTime((int) particle.get("tss_wave_integration_time"));
        setTssNumberOfWaves((int) particle.get("tss_number_of_waves"));
        setTssTotalVariance((float) particle.get("tss_total_variance"));
        setTssTotalEnergy((float) particle.get("tss_total_energy"));
        setTssAvgWaveHeight((float) particle.get("tss_avg_wave_height"));
        setTssAvgWavePeriod((float) particle.get("tss_avg_wave_period"));
        setTssMaxWaveHeight((float) particle.get("tss_max_wave_height"));
        setTssSigWaveHeight((float) particle.get("tss_sig_wave_height"));
        setTssSigWavePeriod((float) particle.get("tss_sig_wave_period"));
        setTss10WaveHeight((float) particle.get("tss_10_wave_height"));
        setTss1WaveHeight((float) particle.get("tss_1_wave_height"));
    }

    public int getNAvgBand() {
        return nAvgBand;
    }

    public void setNAvgBand(int nAvgBand) {
        this.nAvgBand = nAvgBand;
    }
    public float getAssTotalVariance() {
        return assTotalVariance;
    }

    public void setAssTotalVariance(float assTotalVariance) {
        this.assTotalVariance = assTotalVariance;
    }
    public float getAssTotalEnergy() {
        return assTotalEnergy;
    }

    public void setAssTotalEnergy(float assTotalEnergy) {
        this.assTotalEnergy = assTotalEnergy;
    }
    public float getAssSigWavePeriod() {
        return assSigWavePeriod;
    }

    public void setAssSigWavePeriod(float assSigWavePeriod) {
        this.assSigWavePeriod = assSigWavePeriod;
    }
    public float getAssSigWaveHeight() {
        return assSigWaveHeight;
    }

    public void setAssSigWaveHeight(float assSigWaveHeight) {
        this.assSigWaveHeight = assSigWaveHeight;
    }
    public int getTssWaveIntegrationTime() {
        return tssWaveIntegrationTime;
    }

    public void setTssWaveIntegrationTime(int tssWaveIntegrationTime) {
        this.tssWaveIntegrationTime = tssWaveIntegrationTime;
    }
    public int getTssNumberOfWaves() {
        return tssNumberOfWaves;
    }

    public void setTssNumberOfWaves(int tssNumberOfWaves) {
        this.tssNumberOfWaves = tssNumberOfWaves;
    }
    public float getTssTotalVariance() {
        return tssTotalVariance;
    }

    public void setTssTotalVariance(float tssTotalVariance) {
        this.tssTotalVariance = tssTotalVariance;
    }
    public float getTssTotalEnergy() {
        return tssTotalEnergy;
    }

    public void setTssTotalEnergy(float tssTotalEnergy) {
        this.tssTotalEnergy = tssTotalEnergy;
    }
    public float getTssAvgWaveHeight() {
        return tssAvgWaveHeight;
    }

    public void setTssAvgWaveHeight(float tssAvgWaveHeight) {
        this.tssAvgWaveHeight = tssAvgWaveHeight;
    }
    public float getTssAvgWavePeriod() {
        return tssAvgWavePeriod;
    }

    public void setTssAvgWavePeriod(float tssAvgWavePeriod) {
        this.tssAvgWavePeriod = tssAvgWavePeriod;
    }
    public float getTssMaxWaveHeight() {
        return tssMaxWaveHeight;
    }

    public void setTssMaxWaveHeight(float tssMaxWaveHeight) {
        this.tssMaxWaveHeight = tssMaxWaveHeight;
    }
    public float getTssSigWaveHeight() {
        return tssSigWaveHeight;
    }

    public void setTssSigWaveHeight(float tssSigWaveHeight) {
        this.tssSigWaveHeight = tssSigWaveHeight;
    }
    public float getTssSigWavePeriod() {
        return tssSigWavePeriod;
    }

    public void setTssSigWavePeriod(float tssSigWavePeriod) {
        this.tssSigWavePeriod = tssSigWavePeriod;
    }
    public float getTss10WaveHeight() {
        return tss10WaveHeight;
    }

    public void setTss10WaveHeight(float tss10WaveHeight) {
        this.tss10WaveHeight = tss10WaveHeight;
    }
    public float getTss1WaveHeight() {
        return tss1WaveHeight;
    }

    public void setTss1WaveHeight(float tss1WaveHeight) {
        this.tss1WaveHeight = tss1WaveHeight;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}