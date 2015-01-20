package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_status")
public class CgDclEngDclStatus extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "message_sent_type")
    private String messageSentType;

    @Column(value = "message_sent_timestamp")
    private String messageSentTimestamp;

    @Column(value = "sync_type")
    private String syncType;

    @Column(value = "ntp_offset")
    private float ntpOffset;

    @Column(value = "ntp_jitter")
    private float ntpJitter;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setMessageSentType((String) particle.get("message_sent_type"));
        setMessageSentTimestamp((String) particle.get("message_sent_timestamp"));
        setSyncType((String) particle.get("sync_type"));
        setNtpOffset((float) particle.get("ntp_offset"));
        setNtpJitter((float) particle.get("ntp_jitter"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public String getMessageSentType() {
        return messageSentType;
    }

    public void setMessageSentType(String messageSentType) {
        this.messageSentType = messageSentType;
    }
    public String getMessageSentTimestamp() {
        return messageSentTimestamp;
    }

    public void setMessageSentTimestamp(String messageSentTimestamp) {
        this.messageSentTimestamp = messageSentTimestamp;
    }
    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }
    public float getNtpOffset() {
        return ntpOffset;
    }

    public void setNtpOffset(float ntpOffset) {
        this.ntpOffset = ntpOffset;
    }
    public float getNtpJitter() {
        return ntpJitter;
    }

    public void setNtpJitter(float ntpJitter) {
        this.ntpJitter = ntpJitter;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}