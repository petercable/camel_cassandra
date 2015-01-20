package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wavss_a_dcl_motion")
public class WavssADclMotion extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "date_string")
    private String dateString;

    @Column(value = "time_string")
    private String timeString;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "number_time_samples")
    private int numberTimeSamples;

    @Column(value = "initial_time")
    private float initialTime;

    @Column(value = "time_spacing")
    private float timeSpacing;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setDateString((String) particle.get("date_string"));
        setTimeString((String) particle.get("time_string"));
        setSerialNumber((int) particle.get("serial_number"));
        setNumberTimeSamples((int) particle.get("number_time_samples"));
        setInitialTime((float) particle.get("initial_time"));
        setTimeSpacing((float) particle.get("time_spacing"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getNumberTimeSamples() {
        return numberTimeSamples;
    }

    public void setNumberTimeSamples(int numberTimeSamples) {
        this.numberTimeSamples = numberTimeSamples;
    }
    public float getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(float initialTime) {
        this.initialTime = initialTime;
    }
    public float getTimeSpacing() {
        return timeSpacing;
    }

    public void setTimeSpacing(float timeSpacing) {
        this.timeSpacing = timeSpacing;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}