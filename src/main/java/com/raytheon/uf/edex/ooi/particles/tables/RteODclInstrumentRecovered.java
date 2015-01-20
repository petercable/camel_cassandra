package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "rte_o_dcl_instrument_recovered")
public class RteODclInstrumentRecovered extends CassandraParticle {

    @Column(value = "rte_time")
    private String rteTime;

    @Column(value = "rte_coulombs")
    private float rteCoulombs;

    @Column(value = "rte_avg_q_current")
    private float rteAvgQCurrent;

    @Column(value = "rte_avg_voltage")
    private float rteAvgVoltage;

    @Column(value = "rte_avg_supply_voltage")
    private float rteAvgSupplyVoltage;

    @Column(value = "rte_hits")
    private int rteHits;

    @Column(value = "rte_state")
    private int rteState;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setRteTime((String) particle.get("rte_time"));
        setRteCoulombs((float) particle.get("rte_coulombs"));
        setRteAvgQCurrent((float) particle.get("rte_avg_q_current"));
        setRteAvgVoltage((float) particle.get("rte_avg_voltage"));
        setRteAvgSupplyVoltage((float) particle.get("rte_avg_supply_voltage"));
        setRteHits((int) particle.get("rte_hits"));
        setRteState((int) particle.get("rte_state"));
    }

    public String getRteTime() {
        return rteTime;
    }

    public void setRteTime(String rteTime) {
        this.rteTime = rteTime;
    }
    public float getRteCoulombs() {
        return rteCoulombs;
    }

    public void setRteCoulombs(float rteCoulombs) {
        this.rteCoulombs = rteCoulombs;
    }
    public float getRteAvgQCurrent() {
        return rteAvgQCurrent;
    }

    public void setRteAvgQCurrent(float rteAvgQCurrent) {
        this.rteAvgQCurrent = rteAvgQCurrent;
    }
    public float getRteAvgVoltage() {
        return rteAvgVoltage;
    }

    public void setRteAvgVoltage(float rteAvgVoltage) {
        this.rteAvgVoltage = rteAvgVoltage;
    }
    public float getRteAvgSupplyVoltage() {
        return rteAvgSupplyVoltage;
    }

    public void setRteAvgSupplyVoltage(float rteAvgSupplyVoltage) {
        this.rteAvgSupplyVoltage = rteAvgSupplyVoltage;
    }
    public int getRteHits() {
        return rteHits;
    }

    public void setRteHits(int rteHits) {
        this.rteHits = rteHits;
    }
    public int getRteState() {
        return rteState;
    }

    public void setRteState(int rteState) {
        this.rteState = rteState;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}