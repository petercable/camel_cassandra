package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flord_l_wfp_instrument")
public class FlordLWfpInstrument extends CassandraParticle {

    @Column(value = "raw_signal_chl")
    private int rawSignalChl;

    @Column(value = "raw_signal_beta")
    private int rawSignalBeta;

    @Column(value = "raw_internal_temp")
    private int rawInternalTemp;

    @Column(value = "wfp_timestamp")
    private long wfpTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setRawSignalChl((int) particle.get("raw_signal_chl"));
        setRawSignalBeta((int) particle.get("raw_signal_beta"));
        setRawInternalTemp((int) particle.get("raw_internal_temp"));
        setWfpTimestamp((long) particle.get("wfp_timestamp"));
    }

    public int getRawSignalChl() {
        return rawSignalChl;
    }

    public void setRawSignalChl(int rawSignalChl) {
        this.rawSignalChl = rawSignalChl;
    }
    public int getRawSignalBeta() {
        return rawSignalBeta;
    }

    public void setRawSignalBeta(int rawSignalBeta) {
        this.rawSignalBeta = rawSignalBeta;
    }
    public int getRawInternalTemp() {
        return rawInternalTemp;
    }

    public void setRawInternalTemp(int rawInternalTemp) {
        this.rawInternalTemp = rawInternalTemp;
    }
    public long getWfpTimestamp() {
        return wfpTimestamp;
    }

    public void setWfpTimestamp(long wfpTimestamp) {
        this.wfpTimestamp = wfpTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}