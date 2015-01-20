package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "presf_calibration_coefficients")
public class PresfCalibrationCoefficients extends CassandraParticle {

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

    @Column(value = "press_coeff_m")
    private float pressCoeffM;

    @Column(value = "press_coeff_b")
    private float pressCoeffB;

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

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
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
        setPressCoeffM((float) particle.get("press_coeff_m"));
        setPressCoeffB((float) particle.get("press_coeff_b"));
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
    public float getPressCoeffM() {
        return pressCoeffM;
    }

    public void setPressCoeffM(float pressCoeffM) {
        this.pressCoeffM = pressCoeffM;
    }
    public float getPressCoeffB() {
        return pressCoeffB;
    }

    public void setPressCoeffB(float pressCoeffB) {
        this.pressCoeffB = pressCoeffB;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}