package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "tmpsf_engineering")
public class TmpsfEngineering extends CassandraParticle {

    @Column(value = "tmpsf_cal_coeffs")
    private List<Double> tmpsfCalCoeffs;

    @Column(value = "tmpsf_cal_coeffs_dims")
    private int tmpsfCalCoeffsDims;

    @Column(value = "tmpsf_cal_coeffs_sizes")
    private List<Long> tmpsfCalCoeffsSizes;

    @Column(value = "battery_voltage")
    private float batteryVoltage;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTmpsfCalCoeffs((List<Double>) particle.get("tmpsf_cal_coeffs"));
        setTmpsfCalCoeffsDims((int) particle.get("tmpsf_cal_coeffs_dims"));
        setTmpsfCalCoeffsSizes((List<Long>) particle.get("tmpsf_cal_coeffs_sizes"));
        setBatteryVoltage((float) particle.get("battery_voltage"));
    }

    public List<Double> getTmpsfCalCoeffs() {
        // TODO - restore original dimensions, (remove fill values?)
        return tmpsfCalCoeffs;
    }

    public void setTmpsfCalCoeffs(List<Double> tmpsfCalCoeffs) {
        // TODO - flatten for storage, insert fill values
        this.tmpsfCalCoeffs = tmpsfCalCoeffs;
    }
    public int getTmpsfCalCoeffsDims() {
        return tmpsfCalCoeffsDims;
    }

    public void setTmpsfCalCoeffsDims(int tmpsfCalCoeffsDims) {
        this.tmpsfCalCoeffsDims = tmpsfCalCoeffsDims;
    }
    public List<Long> getTmpsfCalCoeffsSizes() {
        return tmpsfCalCoeffsSizes;
    }

    public void setTmpsfCalCoeffsSizes(List<Long> tmpsfCalCoeffsSizes) {
        this.tmpsfCalCoeffsSizes = tmpsfCalCoeffsSizes;
    }
    public float getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}