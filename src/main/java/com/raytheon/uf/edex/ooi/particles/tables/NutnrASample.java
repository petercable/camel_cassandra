package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "nutnr_a_sample")
public class NutnrASample extends CassandraParticle {

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
        setFrameType((String) particle.get("frame_type"));
        setSerialNumber((String) particle.get("serial_number"));
        setDateOfSample((int) particle.get("date_of_sample"));
        setTimeOfSample((double) particle.get("time_of_sample"));
        setNitrateConcentration((float) particle.get("nitrate_concentration"));
        setNutnrNitrogenInNitrate((float) particle.get("nutnr_nitrogen_in_nitrate"));
        setNutnrAbsorbanceAt254Nm((float) particle.get("nutnr_absorbance_at_254_nm"));
        setNutnrAbsorbanceAt350Nm((float) particle.get("nutnr_absorbance_at_350_nm"));
        setNutnrBromideTrace((float) particle.get("nutnr_bromide_trace"));
        setNutnrSpectrumAverage((int) particle.get("nutnr_spectrum_average"));
        setNutnrDarkValueUsedForFit((int) particle.get("nutnr_dark_value_used_for_fit"));
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