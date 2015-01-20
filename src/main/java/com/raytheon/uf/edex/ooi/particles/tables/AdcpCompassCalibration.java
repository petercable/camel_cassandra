package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcp_compass_calibration")
public class AdcpCompassCalibration extends CassandraParticle {

    @Column(value = "fluxgate_calibration_timestamp")
    private double fluxgateCalibrationTimestamp;

    @Column(value = "s_inverse_bx")
    private float sInverseBx;

    @Column(value = "s_inverse_by")
    private float sInverseBy;

    @Column(value = "s_inverse_bz")
    private float sInverseBz;

    @Column(value = "s_inverse_err")
    private float sInverseErr;

    @Column(value = "coil_offset")
    private float coilOffset;

    @Column(value = "electrical_null")
    private float electricalNull;

    @Column(value = "tilt_calibration_timestamp")
    private double tiltCalibrationTimestamp;

    @Column(value = "calibration_temp")
    private float calibrationTemp;

    @Column(value = "roll_up_down")
    private float rollUpDown;

    @Column(value = "pitch_up_down")
    private float pitchUpDown;

    @Column(value = "offset_up_down")
    private float offsetUpDown;

    @Column(value = "tilt_null")
    private float tiltNull;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFluxgateCalibrationTimestamp((double) particle.get("fluxgate_calibration_timestamp"));
        setSInverseBx((float) particle.get("s_inverse_bx"));
        setSInverseBy((float) particle.get("s_inverse_by"));
        setSInverseBz((float) particle.get("s_inverse_bz"));
        setSInverseErr((float) particle.get("s_inverse_err"));
        setCoilOffset((float) particle.get("coil_offset"));
        setElectricalNull((float) particle.get("electrical_null"));
        setTiltCalibrationTimestamp((double) particle.get("tilt_calibration_timestamp"));
        setCalibrationTemp((float) particle.get("calibration_temp"));
        setRollUpDown((float) particle.get("roll_up_down"));
        setPitchUpDown((float) particle.get("pitch_up_down"));
        setOffsetUpDown((float) particle.get("offset_up_down"));
        setTiltNull((float) particle.get("tilt_null"));
    }

    public double getFluxgateCalibrationTimestamp() {
        return fluxgateCalibrationTimestamp;
    }

    public void setFluxgateCalibrationTimestamp(double fluxgateCalibrationTimestamp) {
        this.fluxgateCalibrationTimestamp = fluxgateCalibrationTimestamp;
    }
    public float getSInverseBx() {
        return sInverseBx;
    }

    public void setSInverseBx(float sInverseBx) {
        this.sInverseBx = sInverseBx;
    }
    public float getSInverseBy() {
        return sInverseBy;
    }

    public void setSInverseBy(float sInverseBy) {
        this.sInverseBy = sInverseBy;
    }
    public float getSInverseBz() {
        return sInverseBz;
    }

    public void setSInverseBz(float sInverseBz) {
        this.sInverseBz = sInverseBz;
    }
    public float getSInverseErr() {
        return sInverseErr;
    }

    public void setSInverseErr(float sInverseErr) {
        this.sInverseErr = sInverseErr;
    }
    public float getCoilOffset() {
        return coilOffset;
    }

    public void setCoilOffset(float coilOffset) {
        this.coilOffset = coilOffset;
    }
    public float getElectricalNull() {
        return electricalNull;
    }

    public void setElectricalNull(float electricalNull) {
        this.electricalNull = electricalNull;
    }
    public double getTiltCalibrationTimestamp() {
        return tiltCalibrationTimestamp;
    }

    public void setTiltCalibrationTimestamp(double tiltCalibrationTimestamp) {
        this.tiltCalibrationTimestamp = tiltCalibrationTimestamp;
    }
    public float getCalibrationTemp() {
        return calibrationTemp;
    }

    public void setCalibrationTemp(float calibrationTemp) {
        this.calibrationTemp = calibrationTemp;
    }
    public float getRollUpDown() {
        return rollUpDown;
    }

    public void setRollUpDown(float rollUpDown) {
        this.rollUpDown = rollUpDown;
    }
    public float getPitchUpDown() {
        return pitchUpDown;
    }

    public void setPitchUpDown(float pitchUpDown) {
        this.pitchUpDown = pitchUpDown;
    }
    public float getOffsetUpDown() {
        return offsetUpDown;
    }

    public void setOffsetUpDown(float offsetUpDown) {
        this.offsetUpDown = offsetUpDown;
    }
    public float getTiltNull() {
        return tiltNull;
    }

    public void setTiltNull(float tiltNull) {
        this.tiltNull = tiltNull;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}