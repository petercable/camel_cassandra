package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "trhph_parsed")
public class TrhphParsed extends CassandraParticle {

    @Column(value = "resistivity_5")
    private float resistivity5;

    @Column(value = "resistivity_x1")
    private float resistivityX1;

    @Column(value = "resistivity_x5")
    private float resistivityX5;

    @Column(value = "hydrogen_5")
    private float hydrogen5;

    @Column(value = "hydrogen_x1")
    private float hydrogenX1;

    @Column(value = "hydrogen_x5")
    private float hydrogenX5;

    @Column(value = "eh_sensor")
    private float ehSensor;

    @Column(value = "ref_temp_volts")
    private float refTempVolts;

    @Column(value = "ref_temp_degc")
    private float refTempDegc;

    @Column(value = "resistivity_temp_volts")
    private float resistivityTempVolts;

    @Column(value = "resistivity_temp_degc")
    private float resistivityTempDegc;

    @Column(value = "battery_voltage")
    private float batteryVoltage;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setResistivity5((float) particle.get("resistivity_5"));
        setResistivityX1((float) particle.get("resistivity_x1"));
        setResistivityX5((float) particle.get("resistivity_x5"));
        setHydrogen5((float) particle.get("hydrogen_5"));
        setHydrogenX1((float) particle.get("hydrogen_x1"));
        setHydrogenX5((float) particle.get("hydrogen_x5"));
        setEhSensor((float) particle.get("eh_sensor"));
        setRefTempVolts((float) particle.get("ref_temp_volts"));
        setRefTempDegc((float) particle.get("ref_temp_degc"));
        setResistivityTempVolts((float) particle.get("resistivity_temp_volts"));
        setResistivityTempDegc((float) particle.get("resistivity_temp_degc"));
        setBatteryVoltage((float) particle.get("battery_voltage"));
    }

    public float getResistivity5() {
        return resistivity5;
    }

    public void setResistivity5(float resistivity5) {
        this.resistivity5 = resistivity5;
    }
    public float getResistivityX1() {
        return resistivityX1;
    }

    public void setResistivityX1(float resistivityX1) {
        this.resistivityX1 = resistivityX1;
    }
    public float getResistivityX5() {
        return resistivityX5;
    }

    public void setResistivityX5(float resistivityX5) {
        this.resistivityX5 = resistivityX5;
    }
    public float getHydrogen5() {
        return hydrogen5;
    }

    public void setHydrogen5(float hydrogen5) {
        this.hydrogen5 = hydrogen5;
    }
    public float getHydrogenX1() {
        return hydrogenX1;
    }

    public void setHydrogenX1(float hydrogenX1) {
        this.hydrogenX1 = hydrogenX1;
    }
    public float getHydrogenX5() {
        return hydrogenX5;
    }

    public void setHydrogenX5(float hydrogenX5) {
        this.hydrogenX5 = hydrogenX5;
    }
    public float getEhSensor() {
        return ehSensor;
    }

    public void setEhSensor(float ehSensor) {
        this.ehSensor = ehSensor;
    }
    public float getRefTempVolts() {
        return refTempVolts;
    }

    public void setRefTempVolts(float refTempVolts) {
        this.refTempVolts = refTempVolts;
    }
    public float getRefTempDegc() {
        return refTempDegc;
    }

    public void setRefTempDegc(float refTempDegc) {
        this.refTempDegc = refTempDegc;
    }
    public float getResistivityTempVolts() {
        return resistivityTempVolts;
    }

    public void setResistivityTempVolts(float resistivityTempVolts) {
        this.resistivityTempVolts = resistivityTempVolts;
    }
    public float getResistivityTempDegc() {
        return resistivityTempDegc;
    }

    public void setResistivityTempDegc(float resistivityTempDegc) {
        this.resistivityTempDegc = resistivityTempDegc;
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