package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "wfp_eng_stc_imodem_status")
public class WfpEngStcImodemStatus extends CassandraParticle {

    @Column(value = "wfp_indicator")
    private int wfpIndicator;

    @Column(value = "wfp_ramp_status")
    private int wfpRampStatus;

    @Column(value = "wfp_profile_status")
    private int wfpProfileStatus;

    @Column(value = "wfp_sensor_stop")
    private long wfpSensorStop;

    @Column(value = "wfp_profile_stop")
    private long wfpProfileStop;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setWfpIndicator((int) particle.get("wfp_indicator"));
        setWfpRampStatus((int) particle.get("wfp_ramp_status"));
        setWfpProfileStatus((int) particle.get("wfp_profile_status"));
        setWfpSensorStop((long) particle.get("wfp_sensor_stop"));
        setWfpProfileStop((long) particle.get("wfp_profile_stop"));
    }

    public int getWfpIndicator() {
        return wfpIndicator;
    }

    public void setWfpIndicator(int wfpIndicator) {
        this.wfpIndicator = wfpIndicator;
    }
    public int getWfpRampStatus() {
        return wfpRampStatus;
    }

    public void setWfpRampStatus(int wfpRampStatus) {
        this.wfpRampStatus = wfpRampStatus;
    }
    public int getWfpProfileStatus() {
        return wfpProfileStatus;
    }

    public void setWfpProfileStatus(int wfpProfileStatus) {
        this.wfpProfileStatus = wfpProfileStatus;
    }
    public long getWfpSensorStop() {
        return wfpSensorStop;
    }

    public void setWfpSensorStop(long wfpSensorStop) {
        this.wfpSensorStop = wfpSensorStop;
    }
    public long getWfpProfileStop() {
        return wfpProfileStop;
    }

    public void setWfpProfileStop(long wfpProfileStop) {
        this.wfpProfileStop = wfpProfileStop;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}