package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "prest_configuration_data")
public class PrestConfigurationData extends CassandraParticle {

    @Column(value = "device_type")
    private String deviceType;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "calibration_date_acq_crystal")
    private String calibrationDateAcqCrystal;

    @Column(value = "acq_crystal_coeff_fra0")
    private float acqCrystalCoeffFra0;

    @Column(value = "acq_crystal_coeff_fra1")
    private float acqCrystalCoeffFra1;

    @Column(value = "acq_crystal_coeff_fra2")
    private float acqCrystalCoeffFra2;

    @Column(value = "acq_crystal_coeff_fra3")
    private float acqCrystalCoeffFra3;

    @Column(value = "pressure_sensor_serial_number")
    private int pressureSensorSerialNumber;

    @Column(value = "calibration_date_pressure")
    private String calibrationDatePressure;

    @Column(value = "press_coeff_pu0")
    private float pressCoeffPu0;

    @Column(value = "press_coeff_py1")
    private float pressCoeffPy1;

    @Column(value = "press_coeff_py2")
    private float pressCoeffPy2;

    @Column(value = "press_coeff_py3")
    private float pressCoeffPy3;

    @Column(value = "press_coeff_pc1")
    private float pressCoeffPc1;

    @Column(value = "press_coeff_pc2")
    private float pressCoeffPc2;

    @Column(value = "press_coeff_pc3")
    private float pressCoeffPc3;

    @Column(value = "press_coeff_pd1")
    private float pressCoeffPd1;

    @Column(value = "press_coeff_pd2")
    private float pressCoeffPd2;

    @Column(value = "press_coeff_pt1")
    private float pressCoeffPt1;

    @Column(value = "press_coeff_pt2")
    private float pressCoeffPt2;

    @Column(value = "press_coeff_pt3")
    private float pressCoeffPt3;

    @Column(value = "press_coeff_pt4")
    private float pressCoeffPt4;

    @Column(value = "press_coeff_poffset")
    private float pressCoeffPoffset;

    @Column(value = "pressure_sensor_range")
    private int pressureSensorRange;

    @Column(value = "battery_type")
    private int batteryType;

    @Column(value = "baud_rate")
    private int baudRate;

    @Column(value = "enable_alerts")
    private int enableAlerts;

    @Column(value = "upload_type")
    private int uploadType;

    @Column(value = "sample_period")
    private int samplePeriod;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDeviceType((String) particle.get("device_type"));
        setSerialNumber((int) particle.get("serial_number"));
        setCalibrationDateAcqCrystal((String) particle.get("calibration_date_acq_crystal"));
        setAcqCrystalCoeffFra0((float) particle.get("acq_crystal_coeff_fra0"));
        setAcqCrystalCoeffFra1((float) particle.get("acq_crystal_coeff_fra1"));
        setAcqCrystalCoeffFra2((float) particle.get("acq_crystal_coeff_fra2"));
        setAcqCrystalCoeffFra3((float) particle.get("acq_crystal_coeff_fra3"));
        setPressureSensorSerialNumber((int) particle.get("pressure_sensor_serial_number"));
        setCalibrationDatePressure((String) particle.get("calibration_date_pressure"));
        setPressCoeffPu0((float) particle.get("press_coeff_pu0"));
        setPressCoeffPy1((float) particle.get("press_coeff_py1"));
        setPressCoeffPy2((float) particle.get("press_coeff_py2"));
        setPressCoeffPy3((float) particle.get("press_coeff_py3"));
        setPressCoeffPc1((float) particle.get("press_coeff_pc1"));
        setPressCoeffPc2((float) particle.get("press_coeff_pc2"));
        setPressCoeffPc3((float) particle.get("press_coeff_pc3"));
        setPressCoeffPd1((float) particle.get("press_coeff_pd1"));
        setPressCoeffPd2((float) particle.get("press_coeff_pd2"));
        setPressCoeffPt1((float) particle.get("press_coeff_pt1"));
        setPressCoeffPt2((float) particle.get("press_coeff_pt2"));
        setPressCoeffPt3((float) particle.get("press_coeff_pt3"));
        setPressCoeffPt4((float) particle.get("press_coeff_pt4"));
        setPressCoeffPoffset((float) particle.get("press_coeff_poffset"));
        setPressureSensorRange((int) particle.get("pressure_sensor_range"));
        setBatteryType((int) particle.get("battery_type"));
        setBaudRate((int) particle.get("baud_rate"));
        setEnableAlerts((int) particle.get("enable_alerts"));
        setUploadType((int) particle.get("upload_type"));
        setSamplePeriod((int) particle.get("sample_period"));
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getCalibrationDateAcqCrystal() {
        return calibrationDateAcqCrystal;
    }

    public void setCalibrationDateAcqCrystal(String calibrationDateAcqCrystal) {
        this.calibrationDateAcqCrystal = calibrationDateAcqCrystal;
    }
    public float getAcqCrystalCoeffFra0() {
        return acqCrystalCoeffFra0;
    }

    public void setAcqCrystalCoeffFra0(float acqCrystalCoeffFra0) {
        this.acqCrystalCoeffFra0 = acqCrystalCoeffFra0;
    }
    public float getAcqCrystalCoeffFra1() {
        return acqCrystalCoeffFra1;
    }

    public void setAcqCrystalCoeffFra1(float acqCrystalCoeffFra1) {
        this.acqCrystalCoeffFra1 = acqCrystalCoeffFra1;
    }
    public float getAcqCrystalCoeffFra2() {
        return acqCrystalCoeffFra2;
    }

    public void setAcqCrystalCoeffFra2(float acqCrystalCoeffFra2) {
        this.acqCrystalCoeffFra2 = acqCrystalCoeffFra2;
    }
    public float getAcqCrystalCoeffFra3() {
        return acqCrystalCoeffFra3;
    }

    public void setAcqCrystalCoeffFra3(float acqCrystalCoeffFra3) {
        this.acqCrystalCoeffFra3 = acqCrystalCoeffFra3;
    }
    public int getPressureSensorSerialNumber() {
        return pressureSensorSerialNumber;
    }

    public void setPressureSensorSerialNumber(int pressureSensorSerialNumber) {
        this.pressureSensorSerialNumber = pressureSensorSerialNumber;
    }
    public String getCalibrationDatePressure() {
        return calibrationDatePressure;
    }

    public void setCalibrationDatePressure(String calibrationDatePressure) {
        this.calibrationDatePressure = calibrationDatePressure;
    }
    public float getPressCoeffPu0() {
        return pressCoeffPu0;
    }

    public void setPressCoeffPu0(float pressCoeffPu0) {
        this.pressCoeffPu0 = pressCoeffPu0;
    }
    public float getPressCoeffPy1() {
        return pressCoeffPy1;
    }

    public void setPressCoeffPy1(float pressCoeffPy1) {
        this.pressCoeffPy1 = pressCoeffPy1;
    }
    public float getPressCoeffPy2() {
        return pressCoeffPy2;
    }

    public void setPressCoeffPy2(float pressCoeffPy2) {
        this.pressCoeffPy2 = pressCoeffPy2;
    }
    public float getPressCoeffPy3() {
        return pressCoeffPy3;
    }

    public void setPressCoeffPy3(float pressCoeffPy3) {
        this.pressCoeffPy3 = pressCoeffPy3;
    }
    public float getPressCoeffPc1() {
        return pressCoeffPc1;
    }

    public void setPressCoeffPc1(float pressCoeffPc1) {
        this.pressCoeffPc1 = pressCoeffPc1;
    }
    public float getPressCoeffPc2() {
        return pressCoeffPc2;
    }

    public void setPressCoeffPc2(float pressCoeffPc2) {
        this.pressCoeffPc2 = pressCoeffPc2;
    }
    public float getPressCoeffPc3() {
        return pressCoeffPc3;
    }

    public void setPressCoeffPc3(float pressCoeffPc3) {
        this.pressCoeffPc3 = pressCoeffPc3;
    }
    public float getPressCoeffPd1() {
        return pressCoeffPd1;
    }

    public void setPressCoeffPd1(float pressCoeffPd1) {
        this.pressCoeffPd1 = pressCoeffPd1;
    }
    public float getPressCoeffPd2() {
        return pressCoeffPd2;
    }

    public void setPressCoeffPd2(float pressCoeffPd2) {
        this.pressCoeffPd2 = pressCoeffPd2;
    }
    public float getPressCoeffPt1() {
        return pressCoeffPt1;
    }

    public void setPressCoeffPt1(float pressCoeffPt1) {
        this.pressCoeffPt1 = pressCoeffPt1;
    }
    public float getPressCoeffPt2() {
        return pressCoeffPt2;
    }

    public void setPressCoeffPt2(float pressCoeffPt2) {
        this.pressCoeffPt2 = pressCoeffPt2;
    }
    public float getPressCoeffPt3() {
        return pressCoeffPt3;
    }

    public void setPressCoeffPt3(float pressCoeffPt3) {
        this.pressCoeffPt3 = pressCoeffPt3;
    }
    public float getPressCoeffPt4() {
        return pressCoeffPt4;
    }

    public void setPressCoeffPt4(float pressCoeffPt4) {
        this.pressCoeffPt4 = pressCoeffPt4;
    }
    public float getPressCoeffPoffset() {
        return pressCoeffPoffset;
    }

    public void setPressCoeffPoffset(float pressCoeffPoffset) {
        this.pressCoeffPoffset = pressCoeffPoffset;
    }
    public int getPressureSensorRange() {
        return pressureSensorRange;
    }

    public void setPressureSensorRange(int pressureSensorRange) {
        this.pressureSensorRange = pressureSensorRange;
    }
    public int getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(int batteryType) {
        this.batteryType = batteryType;
    }
    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }
    public int getEnableAlerts() {
        return enableAlerts;
    }

    public void setEnableAlerts(int enableAlerts) {
        this.enableAlerts = enableAlerts;
    }
    public int getUploadType() {
        return uploadType;
    }

    public void setUploadType(int uploadType) {
        this.uploadType = uploadType;
    }
    public int getSamplePeriod() {
        return samplePeriod;
    }

    public void setSamplePeriod(int samplePeriod) {
        this.samplePeriod = samplePeriod;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}