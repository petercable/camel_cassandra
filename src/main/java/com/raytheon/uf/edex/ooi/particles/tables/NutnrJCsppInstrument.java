package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "nutnr_j_cspp_instrument")
public class NutnrJCsppInstrument extends CassandraParticle {

    @Column(value = "profiler_timestamp")
    private double profilerTimestamp;

    @Column(value = "pressure_depth")
    private float pressureDepth;

    @Column(value = "suspect_timestamp")
    private int suspectTimestamp;

    @Column(value = "frame_type")
    private String frameType;

    @Column(value = "year")
    private int year;

    @Column(value = "day_of_year")
    private int dayOfYear;

    @Column(value = "time_of_sample")
    private double timeOfSample;

    @Column(value = "nitrate_concentration")
    private float nitrateConcentration;

    @Column(value = "nutnr_nitrogen_in_nitrate")
    private float nutnrNitrogenInNitrate;

    @Column(value = "nutnr_absorbance_at_254_nm")
    private float nutnrAbsorbanceAt254Nm;

    @Column(value = "nutnr_absorbance_at_350_nm")
    private float nutnrAbsorbanceAt350Nm;

    @Column(value = "nutnr_bromide_trace")
    private float nutnrBromideTrace;

    @Column(value = "nutnr_spectrum_average")
    private int nutnrSpectrumAverage;

    @Column(value = "nutnr_dark_value_used_for_fit")
    private int nutnrDarkValueUsedForFit;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProfilerTimestamp((double) particle.get("profiler_timestamp"));
        setPressureDepth((float) particle.get("pressure_depth"));
        setSuspectTimestamp((int) particle.get("suspect_timestamp"));
        setFrameType((String) particle.get("frame_type"));
        setYear((int) particle.get("year"));
        setDayOfYear((int) particle.get("day_of_year"));
        setTimeOfSample((double) particle.get("time_of_sample"));
        setNitrateConcentration((float) particle.get("nitrate_concentration"));
        setNutnrNitrogenInNitrate((float) particle.get("nutnr_nitrogen_in_nitrate"));
        setNutnrAbsorbanceAt254Nm((float) particle.get("nutnr_absorbance_at_254_nm"));
        setNutnrAbsorbanceAt350Nm((float) particle.get("nutnr_absorbance_at_350_nm"));
        setNutnrBromideTrace((float) particle.get("nutnr_bromide_trace"));
        setNutnrSpectrumAverage((int) particle.get("nutnr_spectrum_average"));
        setNutnrDarkValueUsedForFit((int) particle.get("nutnr_dark_value_used_for_fit"));
    }

    public double getProfilerTimestamp() {
        return profilerTimestamp;
    }

    public void setProfilerTimestamp(double profilerTimestamp) {
        this.profilerTimestamp = profilerTimestamp;
    }
    public float getPressureDepth() {
        return pressureDepth;
    }

    public void setPressureDepth(float pressureDepth) {
        this.pressureDepth = pressureDepth;
    }
    public int getSuspectTimestamp() {
        return suspectTimestamp;
    }

    public void setSuspectTimestamp(int suspectTimestamp) {
        this.suspectTimestamp = suspectTimestamp;
    }
    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
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
    public float getNutnrNitrogenInNitrate() {
        return nutnrNitrogenInNitrate;
    }

    public void setNutnrNitrogenInNitrate(float nutnrNitrogenInNitrate) {
        this.nutnrNitrogenInNitrate = nutnrNitrogenInNitrate;
    }
    public float getNutnrAbsorbanceAt254Nm() {
        return nutnrAbsorbanceAt254Nm;
    }

    public void setNutnrAbsorbanceAt254Nm(float nutnrAbsorbanceAt254Nm) {
        this.nutnrAbsorbanceAt254Nm = nutnrAbsorbanceAt254Nm;
    }
    public float getNutnrAbsorbanceAt350Nm() {
        return nutnrAbsorbanceAt350Nm;
    }

    public void setNutnrAbsorbanceAt350Nm(float nutnrAbsorbanceAt350Nm) {
        this.nutnrAbsorbanceAt350Nm = nutnrAbsorbanceAt350Nm;
    }
    public float getNutnrBromideTrace() {
        return nutnrBromideTrace;
    }

    public void setNutnrBromideTrace(float nutnrBromideTrace) {
        this.nutnrBromideTrace = nutnrBromideTrace;
    }
    public int getNutnrSpectrumAverage() {
        return nutnrSpectrumAverage;
    }

    public void setNutnrSpectrumAverage(int nutnrSpectrumAverage) {
        this.nutnrSpectrumAverage = nutnrSpectrumAverage;
    }
    public int getNutnrDarkValueUsedForFit() {
        return nutnrDarkValueUsedForFit;
    }

    public void setNutnrDarkValueUsedForFit(int nutnrDarkValueUsedForFit) {
        this.nutnrDarkValueUsedForFit = nutnrDarkValueUsedForFit;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}