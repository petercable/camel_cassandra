package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdpf_sbe43_calibration_coefficients")
public class CtdpfSbe43CalibrationCoefficients extends CassandraParticle {

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "pressure_sensor_range")
    private int pressureSensorRange;

    @Column(value = "calibration_date_pressure")
    private String calibrationDatePressure;

    @Column(value = "press_coeff_poffset")
    private float pressCoeffPoffset;

    @Column(value = "calibration_date_temperature")
    private String calibrationDateTemperature;

    @Column(value = "temp_coeff_ta0")
    private float tempCoeffTa0;

    @Column(value = "temp_coeff_ta1")
    private float tempCoeffTa1;

    @Column(value = "temp_coeff_ta2")
    private float tempCoeffTa2;

    @Column(value = "temp_coeff_ta3")
    private float tempCoeffTa3;

    @Column(value = "calibration_date_conductivity")
    private String calibrationDateConductivity;

    @Column(value = "cond_coeff_cg")
    private float condCoeffCg;

    @Column(value = "cond_coeff_ch")
    private float condCoeffCh;

    @Column(value = "cond_coeff_ci")
    private float condCoeffCi;

    @Column(value = "cond_coeff_cj")
    private float condCoeffCj;

    @Column(value = "cond_coeff_ctcor")
    private float condCoeffCtcor;

    @Column(value = "cond_coeff_cpcor")
    private float condCoeffCpcor;

    @Column(value = "cond_coeff_cslope")
    private float condCoeffCslope;

    @Column(value = "temp_coeff_offset")
    private float tempCoeffOffset;

    @Column(value = "press_serial_number")
    private int pressSerialNumber;

    @Column(value = "press_coeff_pa0")
    private float pressCoeffPa0;

    @Column(value = "press_coeff_pa1")
    private float pressCoeffPa1;

    @Column(value = "press_coeff_pa2")
    private float pressCoeffPa2;

    @Column(value = "press_coeff_ptempa0")
    private float pressCoeffPtempa0;

    @Column(value = "press_coeff_ptempa1")
    private float pressCoeffPtempa1;

    @Column(value = "press_coeff_ptempa2")
    private float pressCoeffPtempa2;

    @Column(value = "press_coeff_ptca0")
    private float pressCoeffPtca0;

    @Column(value = "press_coeff_ptca1")
    private float pressCoeffPtca1;

    @Column(value = "press_coeff_ptca2")
    private float pressCoeffPtca2;

    @Column(value = "press_coeff_ptcb0")
    private float pressCoeffPtcb0;

    @Column(value = "press_coeff_ptcb1")
    private float pressCoeffPtcb1;

    @Column(value = "press_coeff_ptcb2")
    private float pressCoeffPtcb2;

    @Column(value = "ext_volt0_slope")
    private float extVolt0Slope;

    @Column(value = "ext_volt0_offset")
    private float extVolt0Offset;

    @Column(value = "ext_volt1_slope")
    private float extVolt1Slope;

    @Column(value = "ext_volt1_offset")
    private float extVolt1Offset;

    @Column(value = "ext_volt2_slope")
    private float extVolt2Slope;

    @Column(value = "ext_volt2_offset")
    private float extVolt2Offset;

    @Column(value = "ext_volt3_slope")
    private float extVolt3Slope;

    @Column(value = "ext_volt3_offset")
    private float extVolt3Offset;

    @Column(value = "ext_volt4_slope")
    private float extVolt4Slope;

    @Column(value = "ext_volt4_offset")
    private float extVolt4Offset;

    @Column(value = "ext_volt5_slope")
    private float extVolt5Slope;

    @Column(value = "ext_volt5_offset")
    private float extVolt5Offset;

    @Column(value = "ext_freq_sf")
    private float extFreqSf;

    @Column(value = "temp_sensor_serial_number")
    private int tempSensorSerialNumber;

    @Column(value = "cond_sensor_serial_number")
    private int condSensorSerialNumber;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((int) particle.get("serial_number"));
        setPressureSensorRange((int) particle.get("pressure_sensor_range"));
        setCalibrationDatePressure((String) particle.get("calibration_date_pressure"));
        setPressCoeffPoffset((float) particle.get("press_coeff_poffset"));
        setCalibrationDateTemperature((String) particle.get("calibration_date_temperature"));
        setTempCoeffTa0((float) particle.get("temp_coeff_ta0"));
        setTempCoeffTa1((float) particle.get("temp_coeff_ta1"));
        setTempCoeffTa2((float) particle.get("temp_coeff_ta2"));
        setTempCoeffTa3((float) particle.get("temp_coeff_ta3"));
        setCalibrationDateConductivity((String) particle.get("calibration_date_conductivity"));
        setCondCoeffCg((float) particle.get("cond_coeff_cg"));
        setCondCoeffCh((float) particle.get("cond_coeff_ch"));
        setCondCoeffCi((float) particle.get("cond_coeff_ci"));
        setCondCoeffCj((float) particle.get("cond_coeff_cj"));
        setCondCoeffCtcor((float) particle.get("cond_coeff_ctcor"));
        setCondCoeffCpcor((float) particle.get("cond_coeff_cpcor"));
        setCondCoeffCslope((float) particle.get("cond_coeff_cslope"));
        setTempCoeffOffset((float) particle.get("temp_coeff_offset"));
        setPressSerialNumber((int) particle.get("press_serial_number"));
        setPressCoeffPa0((float) particle.get("press_coeff_pa0"));
        setPressCoeffPa1((float) particle.get("press_coeff_pa1"));
        setPressCoeffPa2((float) particle.get("press_coeff_pa2"));
        setPressCoeffPtempa0((float) particle.get("press_coeff_ptempa0"));
        setPressCoeffPtempa1((float) particle.get("press_coeff_ptempa1"));
        setPressCoeffPtempa2((float) particle.get("press_coeff_ptempa2"));
        setPressCoeffPtca0((float) particle.get("press_coeff_ptca0"));
        setPressCoeffPtca1((float) particle.get("press_coeff_ptca1"));
        setPressCoeffPtca2((float) particle.get("press_coeff_ptca2"));
        setPressCoeffPtcb0((float) particle.get("press_coeff_ptcb0"));
        setPressCoeffPtcb1((float) particle.get("press_coeff_ptcb1"));
        setPressCoeffPtcb2((float) particle.get("press_coeff_ptcb2"));
        setExtVolt0Slope((float) particle.get("ext_volt0_slope"));
        setExtVolt0Offset((float) particle.get("ext_volt0_offset"));
        setExtVolt1Slope((float) particle.get("ext_volt1_slope"));
        setExtVolt1Offset((float) particle.get("ext_volt1_offset"));
        setExtVolt2Slope((float) particle.get("ext_volt2_slope"));
        setExtVolt2Offset((float) particle.get("ext_volt2_offset"));
        setExtVolt3Slope((float) particle.get("ext_volt3_slope"));
        setExtVolt3Offset((float) particle.get("ext_volt3_offset"));
        setExtVolt4Slope((float) particle.get("ext_volt4_slope"));
        setExtVolt4Offset((float) particle.get("ext_volt4_offset"));
        setExtVolt5Slope((float) particle.get("ext_volt5_slope"));
        setExtVolt5Offset((float) particle.get("ext_volt5_offset"));
        setExtFreqSf((float) particle.get("ext_freq_sf"));
        setTempSensorSerialNumber((int) particle.get("temp_sensor_serial_number"));
        setCondSensorSerialNumber((int) particle.get("cond_sensor_serial_number"));
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getPressureSensorRange() {
        return pressureSensorRange;
    }

    public void setPressureSensorRange(int pressureSensorRange) {
        this.pressureSensorRange = pressureSensorRange;
    }
    public String getCalibrationDatePressure() {
        return calibrationDatePressure;
    }

    public void setCalibrationDatePressure(String calibrationDatePressure) {
        this.calibrationDatePressure = calibrationDatePressure;
    }
    public float getPressCoeffPoffset() {
        return pressCoeffPoffset;
    }

    public void setPressCoeffPoffset(float pressCoeffPoffset) {
        this.pressCoeffPoffset = pressCoeffPoffset;
    }
    public String getCalibrationDateTemperature() {
        return calibrationDateTemperature;
    }

    public void setCalibrationDateTemperature(String calibrationDateTemperature) {
        this.calibrationDateTemperature = calibrationDateTemperature;
    }
    public float getTempCoeffTa0() {
        return tempCoeffTa0;
    }

    public void setTempCoeffTa0(float tempCoeffTa0) {
        this.tempCoeffTa0 = tempCoeffTa0;
    }
    public float getTempCoeffTa1() {
        return tempCoeffTa1;
    }

    public void setTempCoeffTa1(float tempCoeffTa1) {
        this.tempCoeffTa1 = tempCoeffTa1;
    }
    public float getTempCoeffTa2() {
        return tempCoeffTa2;
    }

    public void setTempCoeffTa2(float tempCoeffTa2) {
        this.tempCoeffTa2 = tempCoeffTa2;
    }
    public float getTempCoeffTa3() {
        return tempCoeffTa3;
    }

    public void setTempCoeffTa3(float tempCoeffTa3) {
        this.tempCoeffTa3 = tempCoeffTa3;
    }
    public String getCalibrationDateConductivity() {
        return calibrationDateConductivity;
    }

    public void setCalibrationDateConductivity(String calibrationDateConductivity) {
        this.calibrationDateConductivity = calibrationDateConductivity;
    }
    public float getCondCoeffCg() {
        return condCoeffCg;
    }

    public void setCondCoeffCg(float condCoeffCg) {
        this.condCoeffCg = condCoeffCg;
    }
    public float getCondCoeffCh() {
        return condCoeffCh;
    }

    public void setCondCoeffCh(float condCoeffCh) {
        this.condCoeffCh = condCoeffCh;
    }
    public float getCondCoeffCi() {
        return condCoeffCi;
    }

    public void setCondCoeffCi(float condCoeffCi) {
        this.condCoeffCi = condCoeffCi;
    }
    public float getCondCoeffCj() {
        return condCoeffCj;
    }

    public void setCondCoeffCj(float condCoeffCj) {
        this.condCoeffCj = condCoeffCj;
    }
    public float getCondCoeffCtcor() {
        return condCoeffCtcor;
    }

    public void setCondCoeffCtcor(float condCoeffCtcor) {
        this.condCoeffCtcor = condCoeffCtcor;
    }
    public float getCondCoeffCpcor() {
        return condCoeffCpcor;
    }

    public void setCondCoeffCpcor(float condCoeffCpcor) {
        this.condCoeffCpcor = condCoeffCpcor;
    }
    public float getCondCoeffCslope() {
        return condCoeffCslope;
    }

    public void setCondCoeffCslope(float condCoeffCslope) {
        this.condCoeffCslope = condCoeffCslope;
    }
    public float getTempCoeffOffset() {
        return tempCoeffOffset;
    }

    public void setTempCoeffOffset(float tempCoeffOffset) {
        this.tempCoeffOffset = tempCoeffOffset;
    }
    public int getPressSerialNumber() {
        return pressSerialNumber;
    }

    public void setPressSerialNumber(int pressSerialNumber) {
        this.pressSerialNumber = pressSerialNumber;
    }
    public float getPressCoeffPa0() {
        return pressCoeffPa0;
    }

    public void setPressCoeffPa0(float pressCoeffPa0) {
        this.pressCoeffPa0 = pressCoeffPa0;
    }
    public float getPressCoeffPa1() {
        return pressCoeffPa1;
    }

    public void setPressCoeffPa1(float pressCoeffPa1) {
        this.pressCoeffPa1 = pressCoeffPa1;
    }
    public float getPressCoeffPa2() {
        return pressCoeffPa2;
    }

    public void setPressCoeffPa2(float pressCoeffPa2) {
        this.pressCoeffPa2 = pressCoeffPa2;
    }
    public float getPressCoeffPtempa0() {
        return pressCoeffPtempa0;
    }

    public void setPressCoeffPtempa0(float pressCoeffPtempa0) {
        this.pressCoeffPtempa0 = pressCoeffPtempa0;
    }
    public float getPressCoeffPtempa1() {
        return pressCoeffPtempa1;
    }

    public void setPressCoeffPtempa1(float pressCoeffPtempa1) {
        this.pressCoeffPtempa1 = pressCoeffPtempa1;
    }
    public float getPressCoeffPtempa2() {
        return pressCoeffPtempa2;
    }

    public void setPressCoeffPtempa2(float pressCoeffPtempa2) {
        this.pressCoeffPtempa2 = pressCoeffPtempa2;
    }
    public float getPressCoeffPtca0() {
        return pressCoeffPtca0;
    }

    public void setPressCoeffPtca0(float pressCoeffPtca0) {
        this.pressCoeffPtca0 = pressCoeffPtca0;
    }
    public float getPressCoeffPtca1() {
        return pressCoeffPtca1;
    }

    public void setPressCoeffPtca1(float pressCoeffPtca1) {
        this.pressCoeffPtca1 = pressCoeffPtca1;
    }
    public float getPressCoeffPtca2() {
        return pressCoeffPtca2;
    }

    public void setPressCoeffPtca2(float pressCoeffPtca2) {
        this.pressCoeffPtca2 = pressCoeffPtca2;
    }
    public float getPressCoeffPtcb0() {
        return pressCoeffPtcb0;
    }

    public void setPressCoeffPtcb0(float pressCoeffPtcb0) {
        this.pressCoeffPtcb0 = pressCoeffPtcb0;
    }
    public float getPressCoeffPtcb1() {
        return pressCoeffPtcb1;
    }

    public void setPressCoeffPtcb1(float pressCoeffPtcb1) {
        this.pressCoeffPtcb1 = pressCoeffPtcb1;
    }
    public float getPressCoeffPtcb2() {
        return pressCoeffPtcb2;
    }

    public void setPressCoeffPtcb2(float pressCoeffPtcb2) {
        this.pressCoeffPtcb2 = pressCoeffPtcb2;
    }
    public float getExtVolt0Slope() {
        return extVolt0Slope;
    }

    public void setExtVolt0Slope(float extVolt0Slope) {
        this.extVolt0Slope = extVolt0Slope;
    }
    public float getExtVolt0Offset() {
        return extVolt0Offset;
    }

    public void setExtVolt0Offset(float extVolt0Offset) {
        this.extVolt0Offset = extVolt0Offset;
    }
    public float getExtVolt1Slope() {
        return extVolt1Slope;
    }

    public void setExtVolt1Slope(float extVolt1Slope) {
        this.extVolt1Slope = extVolt1Slope;
    }
    public float getExtVolt1Offset() {
        return extVolt1Offset;
    }

    public void setExtVolt1Offset(float extVolt1Offset) {
        this.extVolt1Offset = extVolt1Offset;
    }
    public float getExtVolt2Slope() {
        return extVolt2Slope;
    }

    public void setExtVolt2Slope(float extVolt2Slope) {
        this.extVolt2Slope = extVolt2Slope;
    }
    public float getExtVolt2Offset() {
        return extVolt2Offset;
    }

    public void setExtVolt2Offset(float extVolt2Offset) {
        this.extVolt2Offset = extVolt2Offset;
    }
    public float getExtVolt3Slope() {
        return extVolt3Slope;
    }

    public void setExtVolt3Slope(float extVolt3Slope) {
        this.extVolt3Slope = extVolt3Slope;
    }
    public float getExtVolt3Offset() {
        return extVolt3Offset;
    }

    public void setExtVolt3Offset(float extVolt3Offset) {
        this.extVolt3Offset = extVolt3Offset;
    }
    public float getExtVolt4Slope() {
        return extVolt4Slope;
    }

    public void setExtVolt4Slope(float extVolt4Slope) {
        this.extVolt4Slope = extVolt4Slope;
    }
    public float getExtVolt4Offset() {
        return extVolt4Offset;
    }

    public void setExtVolt4Offset(float extVolt4Offset) {
        this.extVolt4Offset = extVolt4Offset;
    }
    public float getExtVolt5Slope() {
        return extVolt5Slope;
    }

    public void setExtVolt5Slope(float extVolt5Slope) {
        this.extVolt5Slope = extVolt5Slope;
    }
    public float getExtVolt5Offset() {
        return extVolt5Offset;
    }

    public void setExtVolt5Offset(float extVolt5Offset) {
        this.extVolt5Offset = extVolt5Offset;
    }
    public float getExtFreqSf() {
        return extFreqSf;
    }

    public void setExtFreqSf(float extFreqSf) {
        this.extFreqSf = extFreqSf;
    }
    public int getTempSensorSerialNumber() {
        return tempSensorSerialNumber;
    }

    public void setTempSensorSerialNumber(int tempSensorSerialNumber) {
        this.tempSensorSerialNumber = tempSensorSerialNumber;
    }
    public int getCondSensorSerialNumber() {
        return condSensorSerialNumber;
    }

    public void setCondSensorSerialNumber(int condSensorSerialNumber) {
        this.condSensorSerialNumber = condSensorSerialNumber;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}