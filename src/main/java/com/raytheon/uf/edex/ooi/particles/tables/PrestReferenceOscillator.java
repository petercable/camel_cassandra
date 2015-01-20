package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "prest_reference_oscillator")
public class PrestReferenceOscillator extends CassandraParticle {

    @Column(value = "set_timeout")
    private int setTimeout;

    @Column(value = "set_timeout_max")
    private int setTimeoutMax;

    @Column(value = "sample_number")
    private int sampleNumber;

    @Column(value = "sample_type")
    private String sampleType;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "reference_oscillator_freq")
    private double referenceOscillatorFreq;

    @Column(value = "pcb_thermistor_value")
    private int pcbThermistorValue;

    @Column(value = "reference_error")
    private float referenceError;

    @Column(value = "set_timeout_icd")
    private int setTimeoutIcd;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSetTimeout((int) particle.get("set_timeout"));
        setSetTimeoutMax((int) particle.get("set_timeout_max"));
        setSampleNumber((int) particle.get("sample_number"));
        setSampleType((String) particle.get("sample_type"));
        setDateTimeString((String) particle.get("date_time_string"));
        setReferenceOscillatorFreq((double) particle.get("reference_oscillator_freq"));
        setPcbThermistorValue((int) particle.get("pcb_thermistor_value"));
        setReferenceError((float) particle.get("reference_error"));
        setSetTimeoutIcd((int) particle.get("set_timeout_icd"));
    }

    public int getSetTimeout() {
        return setTimeout;
    }

    public void setSetTimeout(int setTimeout) {
        this.setTimeout = setTimeout;
    }
    public int getSetTimeoutMax() {
        return setTimeoutMax;
    }

    public void setSetTimeoutMax(int setTimeoutMax) {
        this.setTimeoutMax = setTimeoutMax;
    }
    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }
    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }
    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public double getReferenceOscillatorFreq() {
        return referenceOscillatorFreq;
    }

    public void setReferenceOscillatorFreq(double referenceOscillatorFreq) {
        this.referenceOscillatorFreq = referenceOscillatorFreq;
    }
    public int getPcbThermistorValue() {
        return pcbThermistorValue;
    }

    public void setPcbThermistorValue(int pcbThermistorValue) {
        this.pcbThermistorValue = pcbThermistorValue;
    }
    public float getReferenceError() {
        return referenceError;
    }

    public void setReferenceError(float referenceError) {
        this.referenceError = referenceError;
    }
    public int getSetTimeoutIcd() {
        return setTimeoutIcd;
    }

    public void setSetTimeoutIcd(int setTimeoutIcd) {
        this.setTimeoutIcd = setTimeoutIcd;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}