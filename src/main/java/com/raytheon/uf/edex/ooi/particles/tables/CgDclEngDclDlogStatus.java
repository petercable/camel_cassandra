package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_dlog_status")
public class CgDclEngDclDlogStatus extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "message_sent_timestamp")
    private String messageSentTimestamp;

    @Column(value = "instrument_identifier")
    private String instrumentIdentifier;

    @Column(value = "datalogger_state")
    private String dataloggerState;

    @Column(value = "bytes_sent")
    private int bytesSent;

    @Column(value = "bytes_received")
    private int bytesReceived;

    @Column(value = "bytes_logged")
    private int bytesLogged;

    @Column(value = "good_records")
    private int goodRecords;

    @Column(value = "bad_records")
    private int badRecords;

    @Column(value = "bad_bytes")
    private int badBytes;

    @Column(value = "time_received_last_data")
    private long timeReceivedLastData;

    @Column(value = "time_last_communicated")
    private long timeLastCommunicated;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setMessageSentTimestamp((String) particle.get("message_sent_timestamp"));
        setInstrumentIdentifier((String) particle.get("instrument_identifier"));
        setDataloggerState((String) particle.get("datalogger_state"));
        setBytesSent((int) particle.get("bytes_sent"));
        setBytesReceived((int) particle.get("bytes_received"));
        setBytesLogged((int) particle.get("bytes_logged"));
        setGoodRecords((int) particle.get("good_records"));
        setBadRecords((int) particle.get("bad_records"));
        setBadBytes((int) particle.get("bad_bytes"));
        setTimeReceivedLastData((long) particle.get("time_received_last_data"));
        setTimeLastCommunicated((long) particle.get("time_last_communicated"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public String getMessageSentTimestamp() {
        return messageSentTimestamp;
    }

    public void setMessageSentTimestamp(String messageSentTimestamp) {
        this.messageSentTimestamp = messageSentTimestamp;
    }
    public String getInstrumentIdentifier() {
        return instrumentIdentifier;
    }

    public void setInstrumentIdentifier(String instrumentIdentifier) {
        this.instrumentIdentifier = instrumentIdentifier;
    }
    public String getDataloggerState() {
        return dataloggerState;
    }

    public void setDataloggerState(String dataloggerState) {
        this.dataloggerState = dataloggerState;
    }
    public int getBytesSent() {
        return bytesSent;
    }

    public void setBytesSent(int bytesSent) {
        this.bytesSent = bytesSent;
    }
    public int getBytesReceived() {
        return bytesReceived;
    }

    public void setBytesReceived(int bytesReceived) {
        this.bytesReceived = bytesReceived;
    }
    public int getBytesLogged() {
        return bytesLogged;
    }

    public void setBytesLogged(int bytesLogged) {
        this.bytesLogged = bytesLogged;
    }
    public int getGoodRecords() {
        return goodRecords;
    }

    public void setGoodRecords(int goodRecords) {
        this.goodRecords = goodRecords;
    }
    public int getBadRecords() {
        return badRecords;
    }

    public void setBadRecords(int badRecords) {
        this.badRecords = badRecords;
    }
    public int getBadBytes() {
        return badBytes;
    }

    public void setBadBytes(int badBytes) {
        this.badBytes = badBytes;
    }
    public long getTimeReceivedLastData() {
        return timeReceivedLastData;
    }

    public void setTimeReceivedLastData(long timeReceivedLastData) {
        this.timeReceivedLastData = timeReceivedLastData;
    }
    public long getTimeLastCommunicated() {
        return timeLastCommunicated;
    }

    public void setTimeLastCommunicated(long timeLastCommunicated) {
        this.timeLastCommunicated = timeLastCommunicated;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}