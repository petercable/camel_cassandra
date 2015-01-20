package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wavss_a_dcl_mean_directional_recovered")
public class WavssADclMeanDirectionalRecovered extends CassandraParticle {

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

    @Column(value = "mean_direction")
    private float meanDirection;

    @Column(value = "spread_direction")
    private float spreadDirection;

    @Column(value = "psd_mean_directional")
    private List<Float> psdMeanDirectional;

    @Column(value = "psd_mean_directional_dims")
    private int psdMeanDirectionalDims;

    @Column(value = "psd_mean_directional_sizes")
    private List<Long> psdMeanDirectionalSizes;

    @Column(value = "mean_direction_array")
    private List<Float> meanDirectionArray;

    @Column(value = "mean_direction_array_dims")
    private int meanDirectionArrayDims;

    @Column(value = "mean_direction_array_sizes")
    private List<Long> meanDirectionArraySizes;

    @Column(value = "directional_spread_array")
    private List<Float> directionalSpreadArray;

    @Column(value = "directional_spread_array_dims")
    private int directionalSpreadArrayDims;

    @Column(value = "directional_spread_array_sizes")
    private List<Long> directionalSpreadArraySizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setDateString((String) particle.get("date_string"));
        setTimeString((String) particle.get("time_string"));
        setSerialNumber((int) particle.get("serial_number"));
        setNumberBands((int) particle.get("number_bands"));
        setInitialFrequency((float) particle.get("initial_frequency"));
        setFrequencySpacing((float) particle.get("frequency_spacing"));
        setMeanDirection((float) particle.get("mean_direction"));
        setSpreadDirection((float) particle.get("spread_direction"));
        setPsdMeanDirectional((List<Float>) particle.get("psd_mean_directional"));
        setPsdMeanDirectionalDims((int) particle.get("psd_mean_directional_dims"));
        setPsdMeanDirectionalSizes((List<Long>) particle.get("psd_mean_directional_sizes"));
        setMeanDirectionArray((List<Float>) particle.get("mean_direction_array"));
        setMeanDirectionArrayDims((int) particle.get("mean_direction_array_dims"));
        setMeanDirectionArraySizes((List<Long>) particle.get("mean_direction_array_sizes"));
        setDirectionalSpreadArray((List<Float>) particle.get("directional_spread_array"));
        setDirectionalSpreadArrayDims((int) particle.get("directional_spread_array_dims"));
        setDirectionalSpreadArraySizes((List<Long>) particle.get("directional_spread_array_sizes"));
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
    public float getMeanDirection() {
        return meanDirection;
    }

    public void setMeanDirection(float meanDirection) {
        this.meanDirection = meanDirection;
    }
    public float getSpreadDirection() {
        return spreadDirection;
    }

    public void setSpreadDirection(float spreadDirection) {
        this.spreadDirection = spreadDirection;
    }
    public List<Float> getPsdMeanDirectional() {
        // TODO - restore original dimensions, (remove fill values?)
        return psdMeanDirectional;
    }

    public void setPsdMeanDirectional(List<Float> psdMeanDirectional) {
        // TODO - flatten for storage, insert fill values
        this.psdMeanDirectional = psdMeanDirectional;
    }
    public int getPsdMeanDirectionalDims() {
        return psdMeanDirectionalDims;
    }

    public void setPsdMeanDirectionalDims(int psdMeanDirectionalDims) {
        this.psdMeanDirectionalDims = psdMeanDirectionalDims;
    }
    public List<Long> getPsdMeanDirectionalSizes() {
        return psdMeanDirectionalSizes;
    }

    public void setPsdMeanDirectionalSizes(List<Long> psdMeanDirectionalSizes) {
        this.psdMeanDirectionalSizes = psdMeanDirectionalSizes;
    }
    public List<Float> getMeanDirectionArray() {
        // TODO - restore original dimensions, (remove fill values?)
        return meanDirectionArray;
    }

    public void setMeanDirectionArray(List<Float> meanDirectionArray) {
        // TODO - flatten for storage, insert fill values
        this.meanDirectionArray = meanDirectionArray;
    }
    public int getMeanDirectionArrayDims() {
        return meanDirectionArrayDims;
    }

    public void setMeanDirectionArrayDims(int meanDirectionArrayDims) {
        this.meanDirectionArrayDims = meanDirectionArrayDims;
    }
    public List<Long> getMeanDirectionArraySizes() {
        return meanDirectionArraySizes;
    }

    public void setMeanDirectionArraySizes(List<Long> meanDirectionArraySizes) {
        this.meanDirectionArraySizes = meanDirectionArraySizes;
    }
    public List<Float> getDirectionalSpreadArray() {
        // TODO - restore original dimensions, (remove fill values?)
        return directionalSpreadArray;
    }

    public void setDirectionalSpreadArray(List<Float> directionalSpreadArray) {
        // TODO - flatten for storage, insert fill values
        this.directionalSpreadArray = directionalSpreadArray;
    }
    public int getDirectionalSpreadArrayDims() {
        return directionalSpreadArrayDims;
    }

    public void setDirectionalSpreadArrayDims(int directionalSpreadArrayDims) {
        this.directionalSpreadArrayDims = directionalSpreadArrayDims;
    }
    public List<Long> getDirectionalSpreadArraySizes() {
        return directionalSpreadArraySizes;
    }

    public void setDirectionalSpreadArraySizes(List<Long> directionalSpreadArraySizes) {
        this.directionalSpreadArraySizes = directionalSpreadArraySizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}