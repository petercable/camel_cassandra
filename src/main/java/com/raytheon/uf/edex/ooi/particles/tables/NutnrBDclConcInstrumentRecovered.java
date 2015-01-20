package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "nutnr_b_dcl_conc_instrument_recovered")
public class NutnrBDclConcInstrumentRecovered extends CassandraParticle {

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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}