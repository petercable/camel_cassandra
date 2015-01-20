package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "phsen_abcdef_sio_mule_metadata")
public class PhsenAbcdefSioMuleMetadata extends CassandraParticle {

    @Column(value = "sio_controller_timestamp")
    private long sioControllerTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSioControllerTimestamp((long) particle.get("sio_controller_timestamp"));
    }

    public long getSioControllerTimestamp() {
        return sioControllerTimestamp;
    }

    public void setSioControllerTimestamp(long sioControllerTimestamp) {
        this.sioControllerTimestamp = sioControllerTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}