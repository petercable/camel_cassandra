package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wavss_a_dcl_non_directional_recovered")
public class WavssADclNonDirectionalRecovered extends CassandraParticle {

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

    @Column(value = "psd_non_directional")
    private List<Float> psdNonDirectional;

    @Column(value = "psd_non_directional_dims")
    private int psdNonDirectionalDims;

    @Column(value = "psd_non_directional_sizes")
    private List<Long> psdNonDirectionalSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setDateString((String) particle.get("date_string"));
        setTimeString((String) particle.get("time_string"));
        setSerialNumber((int) particle.get("serial_number"));
        setNumberBands((int) particle.get("number_bands"));
        setInitialFrequency((float) particle.get("initial_frequency"));
        setFrequencySpacing((float) particle.get("frequency_spacing"));
        setPsdNonDirectional((List<Float>) particle.get("psd_non_directional"));
        setPsdNonDirectionalDims((int) particle.get("psd_non_directional_dims"));
        setPsdNonDirectionalSizes((List<Long>) particle.get("psd_non_directional_sizes"));
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
    public List<Float> getPsdNonDirectional() {
        // TODO - restore original dimensions, (remove fill values?)
        return psdNonDirectional;
    }

    public void setPsdNonDirectional(List<Float> psdNonDirectional) {
        // TODO - flatten for storage, insert fill values
        this.psdNonDirectional = psdNonDirectional;
    }
    public int getPsdNonDirectionalDims() {
        return psdNonDirectionalDims;
    }

    public void setPsdNonDirectionalDims(int psdNonDirectionalDims) {
        this.psdNonDirectionalDims = psdNonDirectionalDims;
    }
    public List<Long> getPsdNonDirectionalSizes() {
        return psdNonDirectionalSizes;
    }

    public void setPsdNonDirectionalSizes(List<Long> psdNonDirectionalSizes) {
        this.psdNonDirectionalSizes = psdNonDirectionalSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}