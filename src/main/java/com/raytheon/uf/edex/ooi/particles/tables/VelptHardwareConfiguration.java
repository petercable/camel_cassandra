package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_hardware_configuration")
public class VelptHardwareConfiguration extends CassandraParticle {

    @Column(value = "instrmt_type_serial_number")
    private String instrmtTypeSerialNumber;

    @Column(value = "recorder_installed")
    private int recorderInstalled;

    @Column(value = "compass_installed")
    private int compassInstalled;

    @Column(value = "board_frequency")
    private int boardFrequency;

    @Column(value = "pic_version")
    private int picVersion;

    @Column(value = "hardware_revision")
    private int hardwareRevision;

    @Column(value = "recorder_size")
    private int recorderSize;

    @Column(value = "velocity_range")
    private int velocityRange;

    @Column(value = "firmware_version")
    private String firmwareVersion;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setInstrmtTypeSerialNumber((String) particle.get("instrmt_type_serial_number"));
        setRecorderInstalled((int) particle.get("recorder_installed"));
        setCompassInstalled((int) particle.get("compass_installed"));
        setBoardFrequency((int) particle.get("board_frequency"));
        setPicVersion((int) particle.get("pic_version"));
        setHardwareRevision((int) particle.get("hardware_revision"));
        setRecorderSize((int) particle.get("recorder_size"));
        setVelocityRange((int) particle.get("velocity_range"));
        setFirmwareVersion((String) particle.get("firmware_version"));
    }

    public String getInstrmtTypeSerialNumber() {
        return instrmtTypeSerialNumber;
    }

    public void setInstrmtTypeSerialNumber(String instrmtTypeSerialNumber) {
        this.instrmtTypeSerialNumber = instrmtTypeSerialNumber;
    }
    public int getRecorderInstalled() {
        return recorderInstalled;
    }

    public void setRecorderInstalled(int recorderInstalled) {
        this.recorderInstalled = recorderInstalled;
    }
    public int getCompassInstalled() {
        return compassInstalled;
    }

    public void setCompassInstalled(int compassInstalled) {
        this.compassInstalled = compassInstalled;
    }
    public int getBoardFrequency() {
        return boardFrequency;
    }

    public void setBoardFrequency(int boardFrequency) {
        this.boardFrequency = boardFrequency;
    }
    public int getPicVersion() {
        return picVersion;
    }

    public void setPicVersion(int picVersion) {
        this.picVersion = picVersion;
    }
    public int getHardwareRevision() {
        return hardwareRevision;
    }

    public void setHardwareRevision(int hardwareRevision) {
        this.hardwareRevision = hardwareRevision;
    }
    public int getRecorderSize() {
        return recorderSize;
    }

    public void setRecorderSize(int recorderSize) {
        this.recorderSize = recorderSize;
    }
    public int getVelocityRange() {
        return velocityRange;
    }

    public void setVelocityRange(int velocityRange) {
        this.velocityRange = velocityRange;
    }
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}