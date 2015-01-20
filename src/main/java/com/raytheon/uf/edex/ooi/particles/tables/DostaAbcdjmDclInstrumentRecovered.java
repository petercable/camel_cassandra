package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dosta_abcdjm_dcl_instrument_recovered")
public class DostaAbcdjmDclInstrumentRecovered extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

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

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
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
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}