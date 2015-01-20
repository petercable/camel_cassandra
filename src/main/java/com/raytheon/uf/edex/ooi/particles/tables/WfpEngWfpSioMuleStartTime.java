package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wfp_eng_wfp_sio_mule_start_time")
public class WfpEngWfpSioMuleStartTime extends CassandraParticle {

    @Column(value = "sio_controller_timestamp")
    private long sioControllerTimestamp;

    @Column(value = "wfp_sensor_start")
    private long wfpSensorStart;

    @Column(value = "wfp_profile_start")
    private long wfpProfileStart;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSioControllerTimestamp((long) particle.get("sio_controller_timestamp"));
        setWfpSensorStart((long) particle.get("wfp_sensor_start"));
        setWfpProfileStart((long) particle.get("wfp_profile_start"));
    }

    public long getSioControllerTimestamp() {
        return sioControllerTimestamp;
    }

    public void setSioControllerTimestamp(long sioControllerTimestamp) {
        this.sioControllerTimestamp = sioControllerTimestamp;
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