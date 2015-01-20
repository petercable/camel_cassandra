package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_no_calibration_coefficients")
public class CtdbpNoCalibrationCoefficients extends CassandraParticle {

    @Column(value = "serial_number")
    private int serialNumber;

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

    @Column(value = "temp_coeff_offset")
    private float tempCoeffOffset;

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

    @Column(value = "cond_coeff_cpcor")
    private float condCoeffCpcor;

    @Column(value = "cond_coeff_ctcor")
    private float condCoeffCtcor;

    @Column(value = "cond_coeff_cslope")
    private float condCoeffCslope;

    @Column(value = "press_serial_number")
    private int pressSerialNumber;

    @Column(value = "calibration_date_pressure")
    private String calibrationDatePressure;

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

    @Column(value = "press_coeff_pslope")
    private float pressCoeffPslope;

    @Column(value = "press_coeff_poffset")
    private float pressCoeffPoffset;

    @Column(value = "pressure_sensor_range")
    private int pressureSensorRange;

    @Column(value = "ext_volt0_offset")
    private float extVolt0Offset;

    @Column(value = "ext_volt0_slope")
    private float extVolt0Slope;

    @Column(value = "ext_volt1_offset")
    private float extVolt1Offset;

    @Column(value = "ext_volt1_slope")
    private float extVolt1Slope;

    @Column(value = "ext_volt2_offset")
    private float extVolt2Offset;

    @Column(value = "ext_volt2_slope")
    private float extVolt2Slope;

    @Column(value = "ext_volt3_offset")
    private float extVolt3Offset;

    @Column(value = "ext_volt3_slope")
    private float extVolt3Slope;

    @Column(value = "ext_volt4_offset")
    private float extVolt4Offset;

    @Column(value = "ext_volt4_slope")
    private float extVolt4Slope;

    @Column(value = "ext_volt5_offset")
    private float extVolt5Offset;

    @Column(value = "ext_volt5_slope")
    private float extVolt5Slope;

    @Column(value = "ext_freq_sf")
    private float extFreqSf;

    @Column(value = "temp_sensor_serial_number")
    private int tempSensorSerialNumber;

    @Column(value = "cond_sensor_serial_number")
    private int condSensorSerialNumber;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((int) particle.get("serial_number"));
        setCalibrationDateTemperature((String) particle.get("calibration_date_temperature"));
        setTempCoeffTa0((float) particle.get("temp_coeff_ta0"));
        setTempCoeffTa1((float) particle.get("temp_coeff_ta1"));
        setTempCoeffTa2((float) particle.get("temp_coeff_ta2"));
        setTempCoeffTa3((float) particle.get("temp_coeff_ta3"));
        setTempCoeffOffset((float) particle.get("temp_coeff_offset"));
        setCalibrationDateConductivity((String) particle.get("calibration_date_conductivity"));
        setCondCoeffCg((float) particle.get("cond_coeff_cg"));
        setCondCoeffCh((float) particle.get("cond_coeff_ch"));
        setCondCoeffCi((float) particle.get("cond_coeff_ci"));
        setCondCoeffCj((float) particle.get("cond_coeff_cj"));
        setCondCoeffCpcor((float) particle.get("cond_coeff_cpcor"));
        setCondCoeffCtcor((float) particle.get("cond_coeff_ctcor"));
        setCondCoeffCslope((float) particle.get("cond_coeff_cslope"));
        setPressSerialNumber((int) particle.get("press_serial_number"));
        setCalibrationDatePressure((String) particle.get("calibration_date_pressure"));
        setPressCoeffPc1((float) particle.get("press_coeff_pc1"));
        setPressCoeffPc2((float) particle.get("press_coeff_pc2"));
        setPressCoeffPc3((float) particle.get("press_coeff_pc3"));
        setPressCoeffPd1((float) particle.get("press_coeff_pd1"));
        setPressCoeffPd2((float) particle.get("press_coeff_pd2"));
        setPressCoeffPt1((float) particle.get("press_coeff_pt1"));
        setPressCoeffPt2((float) particle.get("press_coeff_pt2"));
        setPressCoeffPt3((float) particle.get("press_coeff_pt3"));
        setPressCoeffPt4((float) particle.get("press_coeff_pt4"));
        setPressCoeffPslope((float) particle.get("press_coeff_pslope"));
        setPressCoeffPoffset((float) particle.get("press_coeff_poffset"));
        setPressureSensorRange((int) particle.get("pressure_sensor_range"));
        setExtVolt0Offset((float) particle.get("ext_volt0_offset"));
        setExtVolt0Slope((float) particle.get("ext_volt0_slope"));
        setExtVolt1Offset((float) particle.get("ext_volt1_offset"));
        setExtVolt1Slope((float) particle.get("ext_volt1_slope"));
        setExtVolt2Offset((float) particle.get("ext_volt2_offset"));
        setExtVolt2Slope((float) particle.get("ext_volt2_slope"));
        setExtVolt3Offset((float) particle.get("ext_volt3_offset"));
        setExtVolt3Slope((float) particle.get("ext_volt3_slope"));
        setExtVolt4Offset((float) particle.get("ext_volt4_offset"));
        setExtVolt4Slope((float) particle.get("ext_volt4_slope"));
        setExtVolt5Offset((float) particle.get("ext_volt5_offset"));
        setExtVolt5Slope((float) particle.get("ext_volt5_slope"));
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
    public float getTempCoeffOffset() {
        return tempCoeffOffset;
    }

    public void setTempCoeffOffset(float tempCoeffOffset) {
        this.tempCoeffOffset = tempCoeffOffset;
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
    public float getCondCoeffCpcor() {
        return condCoeffCpcor;
    }

    public void setCondCoeffCpcor(float condCoeffCpcor) {
        this.condCoeffCpcor = condCoeffCpcor;
    }
    public float getCondCoeffCtcor() {
        return condCoeffCtcor;
    }

    public void setCondCoeffCtcor(float condCoeffCtcor) {
        this.condCoeffCtcor = condCoeffCtcor;
    }
    public float getCondCoeffCslope() {
        return condCoeffCslope;
    }

    public void setCondCoeffCslope(float condCoeffCslope) {
        this.condCoeffCslope = condCoeffCslope;
    }
    public int getPressSerialNumber() {
        return pressSerialNumber;
    }

    public void setPressSerialNumber(int pressSerialNumber) {
        this.pressSerialNumber = pressSerialNumber;
    }
    public String getCalibrationDatePressure() {
        return calibrationDatePressure;
    }

    public void setCalibrationDatePressure(String calibrationDatePressure) {
        this.calibrationDatePressure = calibrationDatePressure;
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
    public float getPressCoeffPslope() {
        return pressCoeffPslope;
    }

    public void setPressCoeffPslope(float pressCoeffPslope) {
        this.pressCoeffPslope = pressCoeffPslope;
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
    public float getExtVolt0Offset() {
        return extVolt0Offset;
    }

    public void setExtVolt0Offset(float extVolt0Offset) {
        this.extVolt0Offset = extVolt0Offset;
    }
    public float getExtVolt0Slope() {
        return extVolt0Slope;
    }

    public void setExtVolt0Slope(float extVolt0Slope) {
        this.extVolt0Slope = extVolt0Slope;
    }
    public float getExtVolt1Offset() {
        return extVolt1Offset;
    }

    public void setExtVolt1Offset(float extVolt1Offset) {
        this.extVolt1Offset = extVolt1Offset;
    }
    public float getExtVolt1Slope() {
        return extVolt1Slope;
    }

    public void setExtVolt1Slope(float extVolt1Slope) {
        this.extVolt1Slope = extVolt1Slope;
    }
    public float getExtVolt2Offset() {
        return extVolt2Offset;
    }

    public void setExtVolt2Offset(float extVolt2Offset) {
        this.extVolt2Offset = extVolt2Offset;
    }
    public float getExtVolt2Slope() {
        return extVolt2Slope;
    }

    public void setExtVolt2Slope(float extVolt2Slope) {
        this.extVolt2Slope = extVolt2Slope;
    }
    public float getExtVolt3Offset() {
        return extVolt3Offset;
    }

    public void setExtVolt3Offset(float extVolt3Offset) {
        this.extVolt3Offset = extVolt3Offset;
    }
    public float getExtVolt3Slope() {
        return extVolt3Slope;
    }

    public void setExtVolt3Slope(float extVolt3Slope) {
        this.extVolt3Slope = extVolt3Slope;
    }
    public float getExtVolt4Offset() {
        return extVolt4Offset;
    }

    public void setExtVolt4Offset(float extVolt4Offset) {
        this.extVolt4Offset = extVolt4Offset;
    }
    public float getExtVolt4Slope() {
        return extVolt4Slope;
    }

    public void setExtVolt4Slope(float extVolt4Slope) {
        this.extVolt4Slope = extVolt4Slope;
    }
    public float getExtVolt5Offset() {
        return extVolt5Offset;
    }

    public void setExtVolt5Offset(float extVolt5Offset) {
        this.extVolt5Offset = extVolt5Offset;
    }
    public float getExtVolt5Slope() {
        return extVolt5Slope;
    }

    public void setExtVolt5Slope(float extVolt5Slope) {
        this.extVolt5Slope = extVolt5Slope;
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