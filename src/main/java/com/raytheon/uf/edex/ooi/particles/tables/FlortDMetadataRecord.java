package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flort_d_metadata_record")
public class FlortDMetadataRecord extends CassandraParticle {

    @Column(value = "signal_1_scale_factor")
    private float signal1ScaleFactor;

    @Column(value = "signal_1_offset")
    private int signal1Offset;

    @Column(value = "signal_2_scale_factor")
    private float signal2ScaleFactor;

    @Column(value = "signal_2_offset")
    private int signal2Offset;

    @Column(value = "signal_3_scale_factor")
    private float signal3ScaleFactor;

    @Column(value = "signal_3_offset")
    private int signal3Offset;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSignal1ScaleFactor((float) particle.get("signal_1_scale_factor"));
        setSignal1Offset((int) particle.get("signal_1_offset"));
        setSignal2ScaleFactor((float) particle.get("signal_2_scale_factor"));
        setSignal2Offset((int) particle.get("signal_2_offset"));
        setSignal3ScaleFactor((float) particle.get("signal_3_scale_factor"));
        setSignal3Offset((int) particle.get("signal_3_offset"));
    }

    public float getSignal1ScaleFactor() {
        return signal1ScaleFactor;
    }

    public void setSignal1ScaleFactor(float signal1ScaleFactor) {
        this.signal1ScaleFactor = signal1ScaleFactor;
    }
    public int getSignal1Offset() {
        return signal1Offset;
    }

    public void setSignal1Offset(int signal1Offset) {
        this.signal1Offset = signal1Offset;
    }
    public float getSignal2ScaleFactor() {
        return signal2ScaleFactor;
    }

    public void setSignal2ScaleFactor(float signal2ScaleFactor) {
        this.signal2ScaleFactor = signal2ScaleFactor;
    }
    public int getSignal2Offset() {
        return signal2Offset;
    }

    public void setSignal2Offset(int signal2Offset) {
        this.signal2Offset = signal2Offset;
    }
    public float getSignal3ScaleFactor() {
        return signal3ScaleFactor;
    }

    public void setSignal3ScaleFactor(float signal3ScaleFactor) {
        this.signal3ScaleFactor = signal3ScaleFactor;
    }
    public int getSignal3Offset() {
        return signal3Offset;
    }

    public void setSignal3Offset(int signal3Offset) {
        this.signal3Offset = signal3Offset;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}