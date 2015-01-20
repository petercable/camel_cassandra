package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wfp_eng_stc_imodem_engineering_recovered")
public class WfpEngStcImodemEngineeringRecovered extends CassandraParticle {

    @Column(value = "wfp_timestamp")
    private long wfpTimestamp;

    @Column(value = "wfp_prof_current")
    private float wfpProfCurrent;

    @Column(value = "wfp_prof_voltage")
    private float wfpProfVoltage;

    @Column(value = "wfp_prof_pressure")
    private float wfpProfPressure;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setWfpTimestamp((long) particle.get("wfp_timestamp"));
        setWfpProfCurrent((float) particle.get("wfp_prof_current"));
        setWfpProfVoltage((float) particle.get("wfp_prof_voltage"));
        setWfpProfPressure((float) particle.get("wfp_prof_pressure"));
    }

    public long getWfpTimestamp() {
        return wfpTimestamp;
    }

    public void setWfpTimestamp(long wfpTimestamp) {
        this.wfpTimestamp = wfpTimestamp;
    }
    public float getWfpProfCurrent() {
        return wfpProfCurrent;
    }

    public void setWfpProfCurrent(float wfpProfCurrent) {
        this.wfpProfCurrent = wfpProfCurrent;
    }
    public float getWfpProfVoltage() {
        return wfpProfVoltage;
    }

    public void setWfpProfVoltage(float wfpProfVoltage) {
        this.wfpProfVoltage = wfpProfVoltage;
    }
    public float getWfpProfPressure() {
        return wfpProfPressure;
    }

    public void setWfpProfPressure(float wfpProfPressure) {
        this.wfpProfPressure = wfpProfPressure;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}