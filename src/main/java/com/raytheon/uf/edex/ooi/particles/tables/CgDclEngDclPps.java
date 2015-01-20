package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_pps")
public class CgDclEngDclPps extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "nmea_lock")
    private int nmeaLock;

    @Column(value = "delta")
    private int delta;

    @Column(value = "delta_min")
    private int deltaMin;

    @Column(value = "delta_max")
    private int deltaMax;

    @Column(value = "bad_pulses")
    private int badPulses;

    @Column(value = "message_sent_timestamp")
    private String messageSentTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setNmeaLock((int) particle.get("nmea_lock"));
        setDelta((int) particle.get("delta"));
        setDeltaMin((int) particle.get("delta_min"));
        setDeltaMax((int) particle.get("delta_max"));
        setBadPulses((int) particle.get("bad_pulses"));
        setMessageSentTimestamp((String) particle.get("message_sent_timestamp"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public int getNmeaLock() {
        return nmeaLock;
    }

    public void setNmeaLock(int nmeaLock) {
        this.nmeaLock = nmeaLock;
    }
    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
    public int getDeltaMin() {
        return deltaMin;
    }

    public void setDeltaMin(int deltaMin) {
        this.deltaMin = deltaMin;
    }
    public int getDeltaMax() {
        return deltaMax;
    }

    public void setDeltaMax(int deltaMax) {
        this.deltaMax = deltaMax;
    }
    public int getBadPulses() {
        return badPulses;
    }

    public void setBadPulses(int badPulses) {
        this.badPulses = badPulses;
    }
    public String getMessageSentTimestamp() {
        return messageSentTimestamp;
    }

    public void setMessageSentTimestamp(String messageSentTimestamp) {
        this.messageSentTimestamp = messageSentTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}