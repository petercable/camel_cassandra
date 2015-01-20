package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "rasfl_sample_result")
public class RasflSampleResult extends CassandraParticle {

    @Column(value = "port_number")
    private int portNumber;

    @Column(value = "commanded_volume")
    private int commandedVolume;

    @Column(value = "commanded_flowrate")
    private int commandedFlowrate;

    @Column(value = "commanded_min_flowrate")
    private int commandedMinFlowrate;

    @Column(value = "commanded_timelimit")
    private int commandedTimelimit;

    @Column(value = "cumulative_volume")
    private float cumulativeVolume;

    @Column(value = "flowrate")
    private float flowrate;

    @Column(value = "minimum_flowrate")
    private float minimumFlowrate;

    @Column(value = "elapsed_time")
    private int elapsedTime;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "battery_voltage")
    private float batteryVoltage;

    @Column(value = "sampling_status_code")
    private int samplingStatusCode;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setPortNumber((int) particle.get("port_number"));
        setCommandedVolume((int) particle.get("commanded_volume"));
        setCommandedFlowrate((int) particle.get("commanded_flowrate"));
        setCommandedMinFlowrate((int) particle.get("commanded_min_flowrate"));
        setCommandedTimelimit((int) particle.get("commanded_timelimit"));
        setCumulativeVolume((float) particle.get("cumulative_volume"));
        setFlowrate((float) particle.get("flowrate"));
        setMinimumFlowrate((float) particle.get("minimum_flowrate"));
        setElapsedTime((int) particle.get("elapsed_time"));
        setDateTimeString((String) particle.get("date_time_string"));
        setBatteryVoltage((float) particle.get("battery_voltage"));
        setSamplingStatusCode((int) particle.get("sampling_status_code"));
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }
    public int getCommandedVolume() {
        return commandedVolume;
    }

    public void setCommandedVolume(int commandedVolume) {
        this.commandedVolume = commandedVolume;
    }
    public int getCommandedFlowrate() {
        return commandedFlowrate;
    }

    public void setCommandedFlowrate(int commandedFlowrate) {
        this.commandedFlowrate = commandedFlowrate;
    }
    public int getCommandedMinFlowrate() {
        return commandedMinFlowrate;
    }

    public void setCommandedMinFlowrate(int commandedMinFlowrate) {
        this.commandedMinFlowrate = commandedMinFlowrate;
    }
    public int getCommandedTimelimit() {
        return commandedTimelimit;
    }

    public void setCommandedTimelimit(int commandedTimelimit) {
        this.commandedTimelimit = commandedTimelimit;
    }
    public float getCumulativeVolume() {
        return cumulativeVolume;
    }

    public void setCumulativeVolume(float cumulativeVolume) {
        this.cumulativeVolume = cumulativeVolume;
    }
    public float getFlowrate() {
        return flowrate;
    }

    public void setFlowrate(float flowrate) {
        this.flowrate = flowrate;
    }
    public float getMinimumFlowrate() {
        return minimumFlowrate;
    }

    public void setMinimumFlowrate(float minimumFlowrate) {
        this.minimumFlowrate = minimumFlowrate;
    }
    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public float getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }
    public int getSamplingStatusCode() {
        return samplingStatusCode;
    }

    public void setSamplingStatusCode(int samplingStatusCode) {
        this.samplingStatusCode = samplingStatusCode;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}