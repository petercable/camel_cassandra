package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "nutnr_a_test")
public class NutnrATest extends CassandraParticle {

    @Column(value = "nutnr_external_disk_size")
    private long nutnrExternalDiskSize;

    @Column(value = "nutnr_external_disk_free")
    private long nutnrExternalDiskFree;

    @Column(value = "nutnr_internal_disk_size")
    private long nutnrInternalDiskSize;

    @Column(value = "nutnr_internal_disk_free")
    private long nutnrInternalDiskFree;

    @Column(value = "temp_interior")
    private float tempInterior;

    @Column(value = "temp_spectrometer")
    private float tempSpectrometer;

    @Column(value = "temp_lamp")
    private float tempLamp;

    @Column(value = "lamp_time")
    private int lampTime;

    @Column(value = "humidity")
    private float humidity;

    @Column(value = "nutnr_electrical_mn")
    private float nutnrElectricalMn;

    @Column(value = "nutnr_electrical_bd")
    private float nutnrElectricalBd;

    @Column(value = "nutnr_electrical_pr")
    private float nutnrElectricalPr;

    @Column(value = "nutnr_electrical_c")
    private float nutnrElectricalC;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setNutnrExternalDiskSize((long) particle.get("nutnr_external_disk_size"));
        setNutnrExternalDiskFree((long) particle.get("nutnr_external_disk_free"));
        setNutnrInternalDiskSize((long) particle.get("nutnr_internal_disk_size"));
        setNutnrInternalDiskFree((long) particle.get("nutnr_internal_disk_free"));
        setTempInterior((float) particle.get("temp_interior"));
        setTempSpectrometer((float) particle.get("temp_spectrometer"));
        setTempLamp((float) particle.get("temp_lamp"));
        setLampTime((int) particle.get("lamp_time"));
        setHumidity((float) particle.get("humidity"));
        setNutnrElectricalMn((float) particle.get("nutnr_electrical_mn"));
        setNutnrElectricalBd((float) particle.get("nutnr_electrical_bd"));
        setNutnrElectricalPr((float) particle.get("nutnr_electrical_pr"));
        setNutnrElectricalC((float) particle.get("nutnr_electrical_c"));
    }

    public long getNutnrExternalDiskSize() {
        return nutnrExternalDiskSize;
    }

    public void setNutnrExternalDiskSize(long nutnrExternalDiskSize) {
        this.nutnrExternalDiskSize = nutnrExternalDiskSize;
    }
    public long getNutnrExternalDiskFree() {
        return nutnrExternalDiskFree;
    }

    public void setNutnrExternalDiskFree(long nutnrExternalDiskFree) {
        this.nutnrExternalDiskFree = nutnrExternalDiskFree;
    }
    public long getNutnrInternalDiskSize() {
        return nutnrInternalDiskSize;
    }

    public void setNutnrInternalDiskSize(long nutnrInternalDiskSize) {
        this.nutnrInternalDiskSize = nutnrInternalDiskSize;
    }
    public long getNutnrInternalDiskFree() {
        return nutnrInternalDiskFree;
    }

    public void setNutnrInternalDiskFree(long nutnrInternalDiskFree) {
        this.nutnrInternalDiskFree = nutnrInternalDiskFree;
    }
    public float getTempInterior() {
        return tempInterior;
    }

    public void setTempInterior(float tempInterior) {
        this.tempInterior = tempInterior;
    }
    public float getTempSpectrometer() {
        return tempSpectrometer;
    }

    public void setTempSpectrometer(float tempSpectrometer) {
        this.tempSpectrometer = tempSpectrometer;
    }
    public float getTempLamp() {
        return tempLamp;
    }

    public void setTempLamp(float tempLamp) {
        this.tempLamp = tempLamp;
    }
    public int getLampTime() {
        return lampTime;
    }

    public void setLampTime(int lampTime) {
        this.lampTime = lampTime;
    }
    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public float getNutnrElectricalMn() {
        return nutnrElectricalMn;
    }

    public void setNutnrElectricalMn(float nutnrElectricalMn) {
        this.nutnrElectricalMn = nutnrElectricalMn;
    }
    public float getNutnrElectricalBd() {
        return nutnrElectricalBd;
    }

    public void setNutnrElectricalBd(float nutnrElectricalBd) {
        this.nutnrElectricalBd = nutnrElectricalBd;
    }
    public float getNutnrElectricalPr() {
        return nutnrElectricalPr;
    }

    public void setNutnrElectricalPr(float nutnrElectricalPr) {
        this.nutnrElectricalPr = nutnrElectricalPr;
    }
    public float getNutnrElectricalC() {
        return nutnrElectricalC;
    }

    public void setNutnrElectricalC(float nutnrElectricalC) {
        this.nutnrElectricalC = nutnrElectricalC;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}