package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcps_jln_stc_metadata_recovered")
public class AdcpsJlnStcMetadataRecovered extends CassandraParticle {

    @Column(value = "adcps_jln_timestamp")
    private String adcpsJlnTimestamp;

    @Column(value = "adcps_jln_id")
    private int adcpsJlnId;

    @Column(value = "adcps_jln_serial_number")
    private int adcpsJlnSerialNumber;

    @Column(value = "adcps_jln_volts")
    private float adcpsJlnVolts;

    @Column(value = "adcps_jln_records")
    private long adcpsJlnRecords;

    @Column(value = "adcps_jln_length")
    private long adcpsJlnLength;

    @Column(value = "adcps_jln_events")
    private long adcpsJlnEvents;

    @Column(value = "adcps_jln_samples_written")
    private long adcpsJlnSamplesWritten;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setAdcpsJlnTimestamp((String) particle.get("adcps_jln_timestamp"));
        setAdcpsJlnId((int) particle.get("adcps_jln_id"));
        setAdcpsJlnSerialNumber((int) particle.get("adcps_jln_serial_number"));
        setAdcpsJlnVolts((float) particle.get("adcps_jln_volts"));
        setAdcpsJlnRecords((long) particle.get("adcps_jln_records"));
        setAdcpsJlnLength((long) particle.get("adcps_jln_length"));
        setAdcpsJlnEvents((long) particle.get("adcps_jln_events"));
        setAdcpsJlnSamplesWritten((long) particle.get("adcps_jln_samples_written"));
    }

    public String getAdcpsJlnTimestamp() {
        return adcpsJlnTimestamp;
    }

    public void setAdcpsJlnTimestamp(String adcpsJlnTimestamp) {
        this.adcpsJlnTimestamp = adcpsJlnTimestamp;
    }
    public int getAdcpsJlnId() {
        return adcpsJlnId;
    }

    public void setAdcpsJlnId(int adcpsJlnId) {
        this.adcpsJlnId = adcpsJlnId;
    }
    public int getAdcpsJlnSerialNumber() {
        return adcpsJlnSerialNumber;
    }

    public void setAdcpsJlnSerialNumber(int adcpsJlnSerialNumber) {
        this.adcpsJlnSerialNumber = adcpsJlnSerialNumber;
    }
    public float getAdcpsJlnVolts() {
        return adcpsJlnVolts;
    }

    public void setAdcpsJlnVolts(float adcpsJlnVolts) {
        this.adcpsJlnVolts = adcpsJlnVolts;
    }
    public long getAdcpsJlnRecords() {
        return adcpsJlnRecords;
    }

    public void setAdcpsJlnRecords(long adcpsJlnRecords) {
        this.adcpsJlnRecords = adcpsJlnRecords;
    }
    public long getAdcpsJlnLength() {
        return adcpsJlnLength;
    }

    public void setAdcpsJlnLength(long adcpsJlnLength) {
        this.adcpsJlnLength = adcpsJlnLength;
    }
    public long getAdcpsJlnEvents() {
        return adcpsJlnEvents;
    }

    public void setAdcpsJlnEvents(long adcpsJlnEvents) {
        this.adcpsJlnEvents = adcpsJlnEvents;
    }
    public long getAdcpsJlnSamplesWritten() {
        return adcpsJlnSamplesWritten;
    }

    public void setAdcpsJlnSamplesWritten(long adcpsJlnSamplesWritten) {
        this.adcpsJlnSamplesWritten = adcpsJlnSamplesWritten;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}