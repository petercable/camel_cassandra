package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "tmpsf_L1")
public class TmpsfL1 extends CassandraParticle {

    @Column(value = "temperature01")
    private float temperature01;

    @Column(value = "temperature02")
    private float temperature02;

    @Column(value = "temperature03")
    private float temperature03;

    @Column(value = "temperature04")
    private float temperature04;

    @Column(value = "temperature05")
    private float temperature05;

    @Column(value = "temperature06")
    private float temperature06;

    @Column(value = "temperature07")
    private float temperature07;

    @Column(value = "temperature08")
    private float temperature08;

    @Column(value = "temperature09")
    private float temperature09;

    @Column(value = "temperature10")
    private float temperature10;

    @Column(value = "temperature11")
    private float temperature11;

    @Column(value = "temperature12")
    private float temperature12;

    @Column(value = "temperature13")
    private float temperature13;

    @Column(value = "temperature14")
    private float temperature14;

    @Column(value = "temperature15")
    private float temperature15;

    @Column(value = "temperature16")
    private float temperature16;

    @Column(value = "temperature17")
    private float temperature17;

    @Column(value = "temperature18")
    private float temperature18;

    @Column(value = "temperature19")
    private float temperature19;

    @Column(value = "temperature20")
    private float temperature20;

    @Column(value = "temperature21")
    private float temperature21;

    @Column(value = "temperature22")
    private float temperature22;

    @Column(value = "temperature23")
    private float temperature23;

    @Column(value = "temperature24")
    private float temperature24;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTemperature01((float) particle.get("temperature01"));
        setTemperature02((float) particle.get("temperature02"));
        setTemperature03((float) particle.get("temperature03"));
        setTemperature04((float) particle.get("temperature04"));
        setTemperature05((float) particle.get("temperature05"));
        setTemperature06((float) particle.get("temperature06"));
        setTemperature07((float) particle.get("temperature07"));
        setTemperature08((float) particle.get("temperature08"));
        setTemperature09((float) particle.get("temperature09"));
        setTemperature10((float) particle.get("temperature10"));
        setTemperature11((float) particle.get("temperature11"));
        setTemperature12((float) particle.get("temperature12"));
        setTemperature13((float) particle.get("temperature13"));
        setTemperature14((float) particle.get("temperature14"));
        setTemperature15((float) particle.get("temperature15"));
        setTemperature16((float) particle.get("temperature16"));
        setTemperature17((float) particle.get("temperature17"));
        setTemperature18((float) particle.get("temperature18"));
        setTemperature19((float) particle.get("temperature19"));
        setTemperature20((float) particle.get("temperature20"));
        setTemperature21((float) particle.get("temperature21"));
        setTemperature22((float) particle.get("temperature22"));
        setTemperature23((float) particle.get("temperature23"));
        setTemperature24((float) particle.get("temperature24"));
    }

    public float getTemperature01() {
        return temperature01;
    }

    public void setTemperature01(float temperature01) {
        this.temperature01 = temperature01;
    }
    public float getTemperature02() {
        return temperature02;
    }

    public void setTemperature02(float temperature02) {
        this.temperature02 = temperature02;
    }
    public float getTemperature03() {
        return temperature03;
    }

    public void setTemperature03(float temperature03) {
        this.temperature03 = temperature03;
    }
    public float getTemperature04() {
        return temperature04;
    }

    public void setTemperature04(float temperature04) {
        this.temperature04 = temperature04;
    }
    public float getTemperature05() {
        return temperature05;
    }

    public void setTemperature05(float temperature05) {
        this.temperature05 = temperature05;
    }
    public float getTemperature06() {
        return temperature06;
    }

    public void setTemperature06(float temperature06) {
        this.temperature06 = temperature06;
    }
    public float getTemperature07() {
        return temperature07;
    }

    public void setTemperature07(float temperature07) {
        this.temperature07 = temperature07;
    }
    public float getTemperature08() {
        return temperature08;
    }

    public void setTemperature08(float temperature08) {
        this.temperature08 = temperature08;
    }
    public float getTemperature09() {
        return temperature09;
    }

    public void setTemperature09(float temperature09) {
        this.temperature09 = temperature09;
    }
    public float getTemperature10() {
        return temperature10;
    }

    public void setTemperature10(float temperature10) {
        this.temperature10 = temperature10;
    }
    public float getTemperature11() {
        return temperature11;
    }

    public void setTemperature11(float temperature11) {
        this.temperature11 = temperature11;
    }
    public float getTemperature12() {
        return temperature12;
    }

    public void setTemperature12(float temperature12) {
        this.temperature12 = temperature12;
    }
    public float getTemperature13() {
        return temperature13;
    }

    public void setTemperature13(float temperature13) {
        this.temperature13 = temperature13;
    }
    public float getTemperature14() {
        return temperature14;
    }

    public void setTemperature14(float temperature14) {
        this.temperature14 = temperature14;
    }
    public float getTemperature15() {
        return temperature15;
    }

    public void setTemperature15(float temperature15) {
        this.temperature15 = temperature15;
    }
    public float getTemperature16() {
        return temperature16;
    }

    public void setTemperature16(float temperature16) {
        this.temperature16 = temperature16;
    }
    public float getTemperature17() {
        return temperature17;
    }

    public void setTemperature17(float temperature17) {
        this.temperature17 = temperature17;
    }
    public float getTemperature18() {
        return temperature18;
    }

    public void setTemperature18(float temperature18) {
        this.temperature18 = temperature18;
    }
    public float getTemperature19() {
        return temperature19;
    }

    public void setTemperature19(float temperature19) {
        this.temperature19 = temperature19;
    }
    public float getTemperature20() {
        return temperature20;
    }

    public void setTemperature20(float temperature20) {
        this.temperature20 = temperature20;
    }
    public float getTemperature21() {
        return temperature21;
    }

    public void setTemperature21(float temperature21) {
        this.temperature21 = temperature21;
    }
    public float getTemperature22() {
        return temperature22;
    }

    public void setTemperature22(float temperature22) {
        this.temperature22 = temperature22;
    }
    public float getTemperature23() {
        return temperature23;
    }

    public void setTemperature23(float temperature23) {
        this.temperature23 = temperature23;
    }
    public float getTemperature24() {
        return temperature24;
    }

    public void setTemperature24(float temperature24) {
        this.temperature24 = temperature24;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}