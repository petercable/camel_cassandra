package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "prest_event_counter")
public class PrestEventCounter extends CassandraParticle {

    @Column(value = "device_type")
    private String deviceType;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "power_on_reset")
    private int powerOnReset;

    @Column(value = "power_fail_reset")
    private int powerFailReset;

    @Column(value = "watchdog_reset")
    private int watchdogReset;

    @Column(value = "serial_byte_error")
    private int serialByteError;

    @Column(value = "command_buffer_overflow")
    private int commandBufferOverflow;

    @Column(value = "serial_receive_overflow")
    private int serialReceiveOverflow;

    @Column(value = "low_battery")
    private int lowBattery;

    @Column(value = "out_of_memory")
    private int outOfMemory;

    @Column(value = "signal_error")
    private int signalError;

    @Column(value = "error_10")
    private int error10;

    @Column(value = "error_12")
    private int error12;

    @Column(value = "number_events")
    private int numberEvents;

    @Column(value = "max_stack")
    private float maxStack;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDeviceType((String) particle.get("device_type"));
        setSerialNumber((int) particle.get("serial_number"));
        setPowerOnReset((int) particle.get("power_on_reset"));
        setPowerFailReset((int) particle.get("power_fail_reset"));
        setWatchdogReset((int) particle.get("watchdog_reset"));
        setSerialByteError((int) particle.get("serial_byte_error"));
        setCommandBufferOverflow((int) particle.get("command_buffer_overflow"));
        setSerialReceiveOverflow((int) particle.get("serial_receive_overflow"));
        setLowBattery((int) particle.get("low_battery"));
        setOutOfMemory((int) particle.get("out_of_memory"));
        setSignalError((int) particle.get("signal_error"));
        setError10((int) particle.get("error_10"));
        setError12((int) particle.get("error_12"));
        setNumberEvents((int) particle.get("number_events"));
        setMaxStack((float) particle.get("max_stack"));
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
    public int getPowerOnReset() {
        return powerOnReset;
    }

    public void setPowerOnReset(int powerOnReset) {
        this.powerOnReset = powerOnReset;
    }
    public int getPowerFailReset() {
        return powerFailReset;
    }

    public void setPowerFailReset(int powerFailReset) {
        this.powerFailReset = powerFailReset;
    }
    public int getWatchdogReset() {
        return watchdogReset;
    }

    public void setWatchdogReset(int watchdogReset) {
        this.watchdogReset = watchdogReset;
    }
    public int getSerialByteError() {
        return serialByteError;
    }

    public void setSerialByteError(int serialByteError) {
        this.serialByteError = serialByteError;
    }
    public int getCommandBufferOverflow() {
        return commandBufferOverflow;
    }

    public void setCommandBufferOverflow(int commandBufferOverflow) {
        this.commandBufferOverflow = commandBufferOverflow;
    }
    public int getSerialReceiveOverflow() {
        return serialReceiveOverflow;
    }

    public void setSerialReceiveOverflow(int serialReceiveOverflow) {
        this.serialReceiveOverflow = serialReceiveOverflow;
    }
    public int getLowBattery() {
        return lowBattery;
    }

    public void setLowBattery(int lowBattery) {
        this.lowBattery = lowBattery;
    }
    public int getOutOfMemory() {
        return outOfMemory;
    }

    public void setOutOfMemory(int outOfMemory) {
        this.outOfMemory = outOfMemory;
    }
    public int getSignalError() {
        return signalError;
    }

    public void setSignalError(int signalError) {
        this.signalError = signalError;
    }
    public int getError10() {
        return error10;
    }

    public void setError10(int error10) {
        this.error10 = error10;
    }
    public int getError12() {
        return error12;
    }

    public void setError12(int error12) {
        this.error12 = error12;
    }
    public int getNumberEvents() {
        return numberEvents;
    }

    public void setNumberEvents(int numberEvents) {
        this.numberEvents = numberEvents;
    }
    public float getMaxStack() {
        return maxStack;
    }

    public void setMaxStack(float maxStack) {
        this.maxStack = maxStack;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}