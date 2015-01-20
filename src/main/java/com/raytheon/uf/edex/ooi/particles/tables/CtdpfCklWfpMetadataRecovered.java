package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdpf_ckl_wfp_metadata_recovered")
public class CtdpfCklWfpMetadataRecovered extends CassandraParticle {

    @Column(value = "wfp_time_on")
    private long wfpTimeOn;

    @Column(value = "wfp_time_off")
    private long wfpTimeOff;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setWfpTimeOn((long) particle.get("wfp_time_on"));
        setWfpTimeOff((long) particle.get("wfp_time_off"));
    }

    public long getWfpTimeOn() {
        return wfpTimeOn;
    }

    public void setWfpTimeOn(long wfpTimeOn) {
        this.wfpTimeOn = wfpTimeOn;
    }
    public long getWfpTimeOff() {
        return wfpTimeOff;
    }

    public void setWfpTimeOff(long wfpTimeOff) {
        this.wfpTimeOff = wfpTimeOff;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}