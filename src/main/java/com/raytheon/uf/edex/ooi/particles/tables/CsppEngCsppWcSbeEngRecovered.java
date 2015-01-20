package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cspp_eng_cspp_wc_sbe_eng_recovered")
public class CsppEngCsppWcSbeEngRecovered extends CassandraParticle {

    @Column(value = "profiler_timestamp")
    private double profilerTimestamp;

    @Column(value = "suspect_timestamp")
    private int suspectTimestamp;

    @Column(value = "pressure_depth")
    private float pressureDepth;

    @Column(value = "velocity_flt32")
    private float velocityFlt32;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProfilerTimestamp((double) particle.get("profiler_timestamp"));
        setSuspectTimestamp((int) particle.get("suspect_timestamp"));
        setPressureDepth((float) particle.get("pressure_depth"));
        setVelocityFlt32((float) particle.get("velocity_flt32"));
    }

    public double getProfilerTimestamp() {
        return profilerTimestamp;
    }

    public void setProfilerTimestamp(double profilerTimestamp) {
        this.profilerTimestamp = profilerTimestamp;
    }
    public int getSuspectTimestamp() {
        return suspectTimestamp;
    }

    public void setSuspectTimestamp(int suspectTimestamp) {
        this.suspectTimestamp = suspectTimestamp;
    }
    public float getPressureDepth() {
        return pressureDepth;
    }

    public void setPressureDepth(float pressureDepth) {
        this.pressureDepth = pressureDepth;
    }
    public float getVelocityFlt32() {
        return velocityFlt32;
    }

    public void setVelocityFlt32(float velocityFlt32) {
        this.velocityFlt32 = velocityFlt32;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}