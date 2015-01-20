package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "parad_k__stc_imodem_instrument")
public class ParadKStcImodemInstrument extends CassandraParticle {

    @Column(value = "wfp_timestamp")
    private long wfpTimestamp;

    @Column(value = "par_val_v")
    private float parValV;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setWfpTimestamp((long) particle.get("wfp_timestamp"));
        setParValV((float) particle.get("par_val_v"));
    }

    public long getWfpTimestamp() {
        return wfpTimestamp;
    }

    public void setWfpTimestamp(long wfpTimestamp) {
        this.wfpTimestamp = wfpTimestamp;
    }
    public float getParValV() {
        return parValV;
    }

    public void setParValV(float parValV) {
        this.parValV = parValV;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}