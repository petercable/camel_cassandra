package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_msg_counts_recovered")
public class CgDclEngDclMsgCountsRecovered extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "gps_counts")
    private int gpsCounts;

    @Column(value = "ntp_counts")
    private int ntpCounts;

    @Column(value = "pps_counts")
    private int ppsCounts;

    @Column(value = "superv_counts")
    private int supervCounts;

    @Column(value = "dlog_mgr_counts")
    private int dlogMgrCounts;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setGpsCounts((int) particle.get("gps_counts"));
        setNtpCounts((int) particle.get("ntp_counts"));
        setPpsCounts((int) particle.get("pps_counts"));
        setSupervCounts((int) particle.get("superv_counts"));
        setDlogMgrCounts((int) particle.get("dlog_mgr_counts"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public int getGpsCounts() {
        return gpsCounts;
    }

    public void setGpsCounts(int gpsCounts) {
        this.gpsCounts = gpsCounts;
    }
    public int getNtpCounts() {
        return ntpCounts;
    }

    public void setNtpCounts(int ntpCounts) {
        this.ntpCounts = ntpCounts;
    }
    public int getPpsCounts() {
        return ppsCounts;
    }

    public void setPpsCounts(int ppsCounts) {
        this.ppsCounts = ppsCounts;
    }
    public int getSupervCounts() {
        return supervCounts;
    }

    public void setSupervCounts(int supervCounts) {
        this.supervCounts = supervCounts;
    }
    public int getDlogMgrCounts() {
        return dlogMgrCounts;
    }

    public void setDlogMgrCounts(int dlogMgrCounts) {
        this.dlogMgrCounts = dlogMgrCounts;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}