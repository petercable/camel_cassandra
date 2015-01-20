package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_k_wfp_metadata")
public class Vel3dKWfpMetadata extends CassandraParticle {

    @Column(value = "vel3d_k_time_on")
    private long vel3dKTimeOn;

    @Column(value = "vel3d_k_time_off")
    private long vel3dKTimeOff;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setVel3dKTimeOn((long) particle.get("vel3d_k_time_on"));
        setVel3dKTimeOff((long) particle.get("vel3d_k_time_off"));
    }

    public long getVel3dKTimeOn() {
        return vel3dKTimeOn;
    }

    public void setVel3dKTimeOn(long vel3dKTimeOn) {
        this.vel3dKTimeOn = vel3dKTimeOn;
    }
    public long getVel3dKTimeOff() {
        return vel3dKTimeOff;
    }

    public void setVel3dKTimeOff(long vel3dKTimeOff) {
        this.vel3dKTimeOff = vel3dKTimeOff;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}