package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdmo_ghqr_offset_recovered")
public class CtdmoGhqrOffsetRecovered extends CassandraParticle {

    @Column(value = "sio_controller_timestamp")
    private long sioControllerTimestamp;

    @Column(value = "inductive_id")
    private int inductiveId;

    @Column(value = "ctd_time_offset")
    private int ctdTimeOffset;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSioControllerTimestamp((long) particle.get("sio_controller_timestamp"));
        setInductiveId((int) particle.get("inductive_id"));
        setCtdTimeOffset((int) particle.get("ctd_time_offset"));
    }

    public long getSioControllerTimestamp() {
        return sioControllerTimestamp;
    }

    public void setSioControllerTimestamp(long sioControllerTimestamp) {
        this.sioControllerTimestamp = sioControllerTimestamp;
    }
    public int getInductiveId() {
        return inductiveId;
    }

    public void setInductiveId(int inductiveId) {
        this.inductiveId = inductiveId;
    }
    public int getCtdTimeOffset() {
        return ctdTimeOffset;
    }

    public void setCtdTimeOffset(int ctdTimeOffset) {
        this.ctdTimeOffset = ctdTimeOffset;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}