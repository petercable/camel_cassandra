package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_dlog_mgr_recovered")
public class CgDclEngDclDlogMgrRecovered extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "datalogger_timestamp")
    private String dataloggerTimestamp;

    @Column(value = "dlog_mgr_act")
    private int dlogMgrAct;

    @Column(value = "dlog_mgr_str")
    private int dlogMgrStr;

    @Column(value = "dlog_mgr_hlt")
    private int dlogMgrHlt;

    @Column(value = "dlog_mgr_fld")
    private int dlogMgrFld;

    @Column(value = "dlog_mgr_map")
    private String dlogMgrMap;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setDataloggerTimestamp((String) particle.get("datalogger_timestamp"));
        setDlogMgrAct((int) particle.get("dlog_mgr_act"));
        setDlogMgrStr((int) particle.get("dlog_mgr_str"));
        setDlogMgrHlt((int) particle.get("dlog_mgr_hlt"));
        setDlogMgrFld((int) particle.get("dlog_mgr_fld"));
        setDlogMgrMap((String) particle.get("dlog_mgr_map"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public String getDataloggerTimestamp() {
        return dataloggerTimestamp;
    }

    public void setDataloggerTimestamp(String dataloggerTimestamp) {
        this.dataloggerTimestamp = dataloggerTimestamp;
    }
    public int getDlogMgrAct() {
        return dlogMgrAct;
    }

    public void setDlogMgrAct(int dlogMgrAct) {
        this.dlogMgrAct = dlogMgrAct;
    }
    public int getDlogMgrStr() {
        return dlogMgrStr;
    }

    public void setDlogMgrStr(int dlogMgrStr) {
        this.dlogMgrStr = dlogMgrStr;
    }
    public int getDlogMgrHlt() {
        return dlogMgrHlt;
    }

    public void setDlogMgrHlt(int dlogMgrHlt) {
        this.dlogMgrHlt = dlogMgrHlt;
    }
    public int getDlogMgrFld() {
        return dlogMgrFld;
    }

    public void setDlogMgrFld(int dlogMgrFld) {
        this.dlogMgrFld = dlogMgrFld;
    }
    public String getDlogMgrMap() {
        return dlogMgrMap;
    }

    public void setDlogMgrMap(String dlogMgrMap) {
        this.dlogMgrMap = dlogMgrMap;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}