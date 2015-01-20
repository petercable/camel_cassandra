package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wfp_eng_stc_imodem_start_time")
public class WfpEngStcImodemStartTime extends CassandraParticle {

    @Column(value = "wfp_sensor_start")
    private long wfpSensorStart;

    @Column(value = "wfp_profile_start")
    private long wfpProfileStart;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setWfpSensorStart((long) particle.get("wfp_sensor_start"));
        setWfpProfileStart((long) particle.get("wfp_profile_start"));
    }

    public long getWfpSensorStart() {
        return wfpSensorStart;
    }

    public void setWfpSensorStart(long wfpSensorStart) {
        this.wfpSensorStart = wfpSensorStart;
    }
    public long getWfpProfileStart() {
        return wfpProfileStart;
    }

    public void setWfpProfileStart(long wfpProfileStart) {
        this.wfpProfileStart = wfpProfileStart;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}