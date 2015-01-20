package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flntu_x_mmp_cds_instrument")
public class FlntuXMmpCdsInstrument extends CassandraParticle {

    @Column(value = "raw_time_seconds")
    private long rawTimeSeconds;

    @Column(value = "raw_time_microseconds")
    private long rawTimeMicroseconds;

    @Column(value = "chlaflo")
    private long chlaflo;

    @Column(value = "ntuflo")
    private long ntuflo;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setRawTimeSeconds((long) particle.get("raw_time_seconds"));
        setRawTimeMicroseconds((long) particle.get("raw_time_microseconds"));
        setChlaflo((long) particle.get("chlaflo"));
        setNtuflo((long) particle.get("ntuflo"));
    }

    public long getRawTimeSeconds() {
        return rawTimeSeconds;
    }

    public void setRawTimeSeconds(long rawTimeSeconds) {
        this.rawTimeSeconds = rawTimeSeconds;
    }
    public long getRawTimeMicroseconds() {
        return rawTimeMicroseconds;
    }

    public void setRawTimeMicroseconds(long rawTimeMicroseconds) {
        this.rawTimeMicroseconds = rawTimeMicroseconds;
    }
    public long getChlaflo() {
        return chlaflo;
    }

    public void setChlaflo(long chlaflo) {
        this.chlaflo = chlaflo;
    }
    public long getNtuflo() {
        return ntuflo;
    }

    public void setNtuflo(long ntuflo) {
        this.ntuflo = ntuflo;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}