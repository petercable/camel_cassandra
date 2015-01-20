package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_ab_dcl_diagnostics_metadata")
public class VelptAbDclDiagnosticsMetadata extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "records_to_follow")
    private int recordsToFollow;

    @Column(value = "cell_number_diagnostics")
    private int cellNumberDiagnostics;

    @Column(value = "noise_amplitude_beam1")
    private int noiseAmplitudeBeam1;

    @Column(value = "noise_amplitude_beam2")
    private int noiseAmplitudeBeam2;

    @Column(value = "noise_amplitude_beam3")
    private int noiseAmplitudeBeam3;

    @Column(value = "noise_amplitude_beam4")
    private int noiseAmplitudeBeam4;

    @Column(value = "processing_magnitude_beam1")
    private int processingMagnitudeBeam1;

    @Column(value = "processing_magnitude_beam2")
    private int processingMagnitudeBeam2;

    @Column(value = "processing_magnitude_beam3")
    private int processingMagnitudeBeam3;

    @Column(value = "processing_magnitude_beam4")
    private int processingMagnitudeBeam4;

    @Column(value = "distance_beam1")
    private int distanceBeam1;

    @Column(value = "distance_beam2")
    private int distanceBeam2;

    @Column(value = "distance_beam3")
    private int distanceBeam3;

    @Column(value = "distance_beam4")
    private int distanceBeam4;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setRecordsToFollow((int) particle.get("records_to_follow"));
        setCellNumberDiagnostics((int) particle.get("cell_number_diagnostics"));
        setNoiseAmplitudeBeam1((int) particle.get("noise_amplitude_beam1"));
        setNoiseAmplitudeBeam2((int) particle.get("noise_amplitude_beam2"));
        setNoiseAmplitudeBeam3((int) particle.get("noise_amplitude_beam3"));
        setNoiseAmplitudeBeam4((int) particle.get("noise_amplitude_beam4"));
        setProcessingMagnitudeBeam1((int) particle.get("processing_magnitude_beam1"));
        setProcessingMagnitudeBeam2((int) particle.get("processing_magnitude_beam2"));
        setProcessingMagnitudeBeam3((int) particle.get("processing_magnitude_beam3"));
        setProcessingMagnitudeBeam4((int) particle.get("processing_magnitude_beam4"));
        setDistanceBeam1((int) particle.get("distance_beam1"));
        setDistanceBeam2((int) particle.get("distance_beam2"));
        setDistanceBeam3((int) particle.get("distance_beam3"));
        setDistanceBeam4((int) particle.get("distance_beam4"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public int getRecordsToFollow() {
        return recordsToFollow;
    }

    public void setRecordsToFollow(int recordsToFollow) {
        this.recordsToFollow = recordsToFollow;
    }
    public int getCellNumberDiagnostics() {
        return cellNumberDiagnostics;
    }

    public void setCellNumberDiagnostics(int cellNumberDiagnostics) {
        this.cellNumberDiagnostics = cellNumberDiagnostics;
    }
    public int getNoiseAmplitudeBeam1() {
        return noiseAmplitudeBeam1;
    }

    public void setNoiseAmplitudeBeam1(int noiseAmplitudeBeam1) {
        this.noiseAmplitudeBeam1 = noiseAmplitudeBeam1;
    }
    public int getNoiseAmplitudeBeam2() {
        return noiseAmplitudeBeam2;
    }

    public void setNoiseAmplitudeBeam2(int noiseAmplitudeBeam2) {
        this.noiseAmplitudeBeam2 = noiseAmplitudeBeam2;
    }
    public int getNoiseAmplitudeBeam3() {
        return noiseAmplitudeBeam3;
    }

    public void setNoiseAmplitudeBeam3(int noiseAmplitudeBeam3) {
        this.noiseAmplitudeBeam3 = noiseAmplitudeBeam3;
    }
    public int getNoiseAmplitudeBeam4() {
        return noiseAmplitudeBeam4;
    }

    public void setNoiseAmplitudeBeam4(int noiseAmplitudeBeam4) {
        this.noiseAmplitudeBeam4 = noiseAmplitudeBeam4;
    }
    public int getProcessingMagnitudeBeam1() {
        return processingMagnitudeBeam1;
    }

    public void setProcessingMagnitudeBeam1(int processingMagnitudeBeam1) {
        this.processingMagnitudeBeam1 = processingMagnitudeBeam1;
    }
    public int getProcessingMagnitudeBeam2() {
        return processingMagnitudeBeam2;
    }

    public void setProcessingMagnitudeBeam2(int processingMagnitudeBeam2) {
        this.processingMagnitudeBeam2 = processingMagnitudeBeam2;
    }
    public int getProcessingMagnitudeBeam3() {
        return processingMagnitudeBeam3;
    }

    public void setProcessingMagnitudeBeam3(int processingMagnitudeBeam3) {
        this.processingMagnitudeBeam3 = processingMagnitudeBeam3;
    }
    public int getProcessingMagnitudeBeam4() {
        return processingMagnitudeBeam4;
    }

    public void setProcessingMagnitudeBeam4(int processingMagnitudeBeam4) {
        this.processingMagnitudeBeam4 = processingMagnitudeBeam4;
    }
    public int getDistanceBeam1() {
        return distanceBeam1;
    }

    public void setDistanceBeam1(int distanceBeam1) {
        this.distanceBeam1 = distanceBeam1;
    }
    public int getDistanceBeam2() {
        return distanceBeam2;
    }

    public void setDistanceBeam2(int distanceBeam2) {
        this.distanceBeam2 = distanceBeam2;
    }
    public int getDistanceBeam3() {
        return distanceBeam3;
    }

    public void setDistanceBeam3(int distanceBeam3) {
        this.distanceBeam3 = distanceBeam3;
    }
    public int getDistanceBeam4() {
        return distanceBeam4;
    }

    public void setDistanceBeam4(int distanceBeam4) {
        this.distanceBeam4 = distanceBeam4;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}