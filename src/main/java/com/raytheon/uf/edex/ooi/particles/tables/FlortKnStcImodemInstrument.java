package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flort_kn_stc_imodem_instrument")
public class FlortKnStcImodemInstrument extends CassandraParticle {

    @Column(value = "wfp_timestamp")
    private long wfpTimestamp;

    @Column(value = "raw_signal_beta")
    private int rawSignalBeta;

    @Column(value = "raw_signal_chl")
    private int rawSignalChl;

    @Column(value = "raw_signal_cdom")
    private int rawSignalCdom;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setWfpTimestamp((long) particle.get("wfp_timestamp"));
        setRawSignalBeta((int) particle.get("raw_signal_beta"));
        setRawSignalChl((int) particle.get("raw_signal_chl"));
        setRawSignalCdom((int) particle.get("raw_signal_cdom"));
    }

    public long getWfpTimestamp() {
        return wfpTimestamp;
    }

    public void setWfpTimestamp(long wfpTimestamp) {
        this.wfpTimestamp = wfpTimestamp;
    }
    public int getRawSignalBeta() {
        return rawSignalBeta;
    }

    public void setRawSignalBeta(int rawSignalBeta) {
        this.rawSignalBeta = rawSignalBeta;
    }
    public int getRawSignalChl() {
        return rawSignalChl;
    }

    public void setRawSignalChl(int rawSignalChl) {
        this.rawSignalChl = rawSignalChl;
    }
    public int getRawSignalCdom() {
        return rawSignalCdom;
    }

    public void setRawSignalCdom(int rawSignalCdom) {
        this.rawSignalCdom = rawSignalCdom;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}