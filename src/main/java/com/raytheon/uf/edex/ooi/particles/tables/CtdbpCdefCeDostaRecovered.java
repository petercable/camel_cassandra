package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_cdef_ce_dosta_recovered")
public class CtdbpCdefCeDostaRecovered extends CassandraParticle {

    @Column(value = "oxygen")
    private int oxygen;

    @Column(value = "ctd_time")
    private int ctdTime;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setOxygen((int) particle.get("oxygen"));
        setCtdTime((int) particle.get("ctd_time"));
    }

    public int getOxygen() {
        return oxygen;
    }

    public void setOxygen(int oxygen) {
        this.oxygen = oxygen;
    }
    public int getCtdTime() {
        return ctdTime;
    }

    public void setCtdTime(int ctdTime) {
        this.ctdTime = ctdTime;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}