package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dosta_d_sample")
public class DostaDSample extends CassandraParticle {

    @Column(value = "product_number")
    private int productNumber;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "estimated_oxygen_concentration")
    private float estimatedOxygenConcentration;

    @Column(value = "estimated_oxygen_saturation")
    private float estimatedOxygenSaturation;

    @Column(value = "optode_temperature")
    private float optodeTemperature;

    @Column(value = "calibrated_phase")
    private float calibratedPhase;

    @Column(value = "temp_compensated_phase")
    private float tempCompensatedPhase;

    @Column(value = "blue_phase")
    private float bluePhase;

    @Column(value = "red_phase")
    private float redPhase;

    @Column(value = "blue_amplitude")
    private float blueAmplitude;

    @Column(value = "red_amplitude")
    private float redAmplitude;

    @Column(value = "raw_temperature")
    private float rawTemperature;

    @Column(value = "svu_cal_coefs")
    private List<Float> svuCalCoefs;

    @Column(value = "svu_cal_coefs_dims")
    private int svuCalCoefsDims;

    @Column(value = "svu_cal_coefs_sizes")
    private List<Long> svuCalCoefsSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProductNumber((int) particle.get("product_number"));
        setSerialNumber((int) particle.get("serial_number"));
        setEstimatedOxygenConcentration((float) particle.get("estimated_oxygen_concentration"));
        setEstimatedOxygenSaturation((float) particle.get("estimated_oxygen_saturation"));
        setOptodeTemperature((float) particle.get("optode_temperature"));
        setCalibratedPhase((float) particle.get("calibrated_phase"));
        setTempCompensatedPhase((float) particle.get("temp_compensated_phase"));
        setBluePhase((float) particle.get("blue_phase"));
        setRedPhase((float) particle.get("red_phase"));
        setBlueAmplitude((float) particle.get("blue_amplitude"));
        setRedAmplitude((float) particle.get("red_amplitude"));
        setRawTemperature((float) particle.get("raw_temperature"));
        setSvuCalCoefs((List<Float>) particle.get("svu_cal_coefs"));
        setSvuCalCoefsDims((int) particle.get("svu_cal_coefs_dims"));
        setSvuCalCoefsSizes((List<Long>) particle.get("svu_cal_coefs_sizes"));
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public float getEstimatedOxygenConcentration() {
        return estimatedOxygenConcentration;
    }

    public void setEstimatedOxygenConcentration(float estimatedOxygenConcentration) {
        this.estimatedOxygenConcentration = estimatedOxygenConcentration;
    }
    public float getEstimatedOxygenSaturation() {
        return estimatedOxygenSaturation;
    }

    public void setEstimatedOxygenSaturation(float estimatedOxygenSaturation) {
        this.estimatedOxygenSaturation = estimatedOxygenSaturation;
    }
    public float getOptodeTemperature() {
        return optodeTemperature;
    }

    public void setOptodeTemperature(float optodeTemperature) {
        this.optodeTemperature = optodeTemperature;
    }
    public float getCalibratedPhase() {
        return calibratedPhase;
    }

    public void setCalibratedPhase(float calibratedPhase) {
        this.calibratedPhase = calibratedPhase;
    }
    public float getTempCompensatedPhase() {
        return tempCompensatedPhase;
    }

    public void setTempCompensatedPhase(float tempCompensatedPhase) {
        this.tempCompensatedPhase = tempCompensatedPhase;
    }
    public float getBluePhase() {
        return bluePhase;
    }

    public void setBluePhase(float bluePhase) {
        this.bluePhase = bluePhase;
    }
    public float getRedPhase() {
        return redPhase;
    }

    public void setRedPhase(float redPhase) {
        this.redPhase = redPhase;
    }
    public float getBlueAmplitude() {
        return blueAmplitude;
    }

    public void setBlueAmplitude(float blueAmplitude) {
        this.blueAmplitude = blueAmplitude;
    }
    public float getRedAmplitude() {
        return redAmplitude;
    }

    public void setRedAmplitude(float redAmplitude) {
        this.redAmplitude = redAmplitude;
    }
    public float getRawTemperature() {
        return rawTemperature;
    }

    public void setRawTemperature(float rawTemperature) {
        this.rawTemperature = rawTemperature;
    }
    public List<Float> getSvuCalCoefs() {
        // TODO - restore original dimensions, (remove fill values?)
        return svuCalCoefs;
    }

    public void setSvuCalCoefs(List<Float> svuCalCoefs) {
        // TODO - flatten for storage, insert fill values
        this.svuCalCoefs = svuCalCoefs;
    }
    public int getSvuCalCoefsDims() {
        return svuCalCoefsDims;
    }

    public void setSvuCalCoefsDims(int svuCalCoefsDims) {
        this.svuCalCoefsDims = svuCalCoefsDims;
    }
    public List<Long> getSvuCalCoefsSizes() {
        return svuCalCoefsSizes;
    }

    public void setSvuCalCoefsSizes(List<Long> svuCalCoefsSizes) {
        this.svuCalCoefsSizes = svuCalCoefsSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}