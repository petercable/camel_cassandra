package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wavss_a_dcl_fourier_recovered")
public class WavssADclFourierRecovered extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "date_string")
    private String dateString;

    @Column(value = "time_string")
    private String timeString;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "number_bands")
    private int numberBands;

    @Column(value = "initial_frequency")
    private float initialFrequency;

    @Column(value = "frequency_spacing")
    private float frequencySpacing;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setDateString((String) particle.get("date_string"));
        setTimeString((String) particle.get("time_string"));
        setSerialNumber((int) particle.get("serial_number"));
        setNumberBands((int) particle.get("number_bands"));
        setInitialFrequency((float) particle.get("initial_frequency"));
        setFrequencySpacing((float) particle.get("frequency_spacing"));
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
    public int getNumberBands() {
        return numberBands;
    }

    public void setNumberBands(int numberBands) {
        this.numberBands = numberBands;
    }
    public float getInitialFrequency() {
        return initialFrequency;
    }

    public void setInitialFrequency(float initialFrequency) {
        this.initialFrequency = initialFrequency;
    }
    public float getFrequencySpacing() {
        return frequencySpacing;
    }

    public void setFrequencySpacing(float frequencySpacing) {
        this.frequencySpacing = frequencySpacing;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}