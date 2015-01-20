package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_cpu_uptime")
public class CgDclEngDclCpuUptime extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "uptime_string")
    private String uptimeString;

    @Column(value = "load_val_1")
    private float loadVal1;

    @Column(value = "load_val_2")
    private float loadVal2;

    @Column(value = "load_val_3")
    private float loadVal3;

    @Column(value = "mem_free")
    private int memFree;

    @Column(value = "num_processes")
    private int numProcesses;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setUptimeString((String) particle.get("uptime_string"));
        setLoadVal1((float) particle.get("load_val_1"));
        setLoadVal2((float) particle.get("load_val_2"));
        setLoadVal3((float) particle.get("load_val_3"));
        setMemFree((int) particle.get("mem_free"));
        setNumProcesses((int) particle.get("num_processes"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public String getUptimeString() {
        return uptimeString;
    }

    public void setUptimeString(String uptimeString) {
        this.uptimeString = uptimeString;
    }
    public float getLoadVal1() {
        return loadVal1;
    }

    public void setLoadVal1(float loadVal1) {
        this.loadVal1 = loadVal1;
    }
    public float getLoadVal2() {
        return loadVal2;
    }

    public void setLoadVal2(float loadVal2) {
        this.loadVal2 = loadVal2;
    }
    public float getLoadVal3() {
        return loadVal3;
    }

    public void setLoadVal3(float loadVal3) {
        this.loadVal3 = loadVal3;
    }
    public int getMemFree() {
        return memFree;
    }

    public void setMemFree(int memFree) {
        this.memFree = memFree;
    }
    public int getNumProcesses() {
        return numProcesses;
    }

    public void setNumProcesses(int numProcesses) {
        this.numProcesses = numProcesses;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}