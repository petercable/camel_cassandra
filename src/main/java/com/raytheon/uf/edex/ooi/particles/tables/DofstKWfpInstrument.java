package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dofst_k_wfp_instrument")
public class DofstKWfpInstrument extends CassandraParticle {

    @Column(value = "dofst_k_oxygen")
    private long dofstKOxygen;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDofstKOxygen((long) particle.get("dofst_k_oxygen"));
    }

    public long getDofstKOxygen() {
        return dofstKOxygen;
    }

    public void setDofstKOxygen(long dofstKOxygen) {
        this.dofstKOxygen = dofstKOxygen;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}