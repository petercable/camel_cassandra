package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dpc_acm_instrument")
public class DpcAcmInstrument extends CassandraParticle {

    @Column(value = "raw_time_seconds")
    private long rawTimeSeconds;

    @Column(value = "raw_time_microseconds")
    private long rawTimeMicroseconds;

    @Column(value = "vel3d_a_va")
    private double vel3dAVa;

    @Column(value = "vel3d_a_vb")
    private double vel3dAVb;

    @Column(value = "vel3d_a_vc")
    private double vel3dAVc;

    @Column(value = "vel3d_a_vd")
    private double vel3dAVd;

    @Column(value = "vel3d_a_hx")
    private double vel3dAHx;

    @Column(value = "vel3d_a_hy")
    private double vel3dAHy;

    @Column(value = "vel3d_a_hz")
    private double vel3dAHz;

    @Column(value = "vel3d_a_tx")
    private double vel3dATx;

    @Column(value = "vel3d_a_ty")
    private double vel3dATy;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setRawTimeSeconds((long) particle.get("raw_time_seconds"));
        setRawTimeMicroseconds((long) particle.get("raw_time_microseconds"));
        setVel3dAVa((double) particle.get("vel3d_a_va"));
        setVel3dAVb((double) particle.get("vel3d_a_vb"));
        setVel3dAVc((double) particle.get("vel3d_a_vc"));
        setVel3dAVd((double) particle.get("vel3d_a_vd"));
        setVel3dAHx((double) particle.get("vel3d_a_hx"));
        setVel3dAHy((double) particle.get("vel3d_a_hy"));
        setVel3dAHz((double) particle.get("vel3d_a_hz"));
        setVel3dATx((double) particle.get("vel3d_a_tx"));
        setVel3dATy((double) particle.get("vel3d_a_ty"));
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
    public double getVel3dAVa() {
        return vel3dAVa;
    }

    public void setVel3dAVa(double vel3dAVa) {
        this.vel3dAVa = vel3dAVa;
    }
    public double getVel3dAVb() {
        return vel3dAVb;
    }

    public void setVel3dAVb(double vel3dAVb) {
        this.vel3dAVb = vel3dAVb;
    }
    public double getVel3dAVc() {
        return vel3dAVc;
    }

    public void setVel3dAVc(double vel3dAVc) {
        this.vel3dAVc = vel3dAVc;
    }
    public double getVel3dAVd() {
        return vel3dAVd;
    }

    public void setVel3dAVd(double vel3dAVd) {
        this.vel3dAVd = vel3dAVd;
    }
    public double getVel3dAHx() {
        return vel3dAHx;
    }

    public void setVel3dAHx(double vel3dAHx) {
        this.vel3dAHx = vel3dAHx;
    }
    public double getVel3dAHy() {
        return vel3dAHy;
    }

    public void setVel3dAHy(double vel3dAHy) {
        this.vel3dAHy = vel3dAHy;
    }
    public double getVel3dAHz() {
        return vel3dAHz;
    }

    public void setVel3dAHz(double vel3dAHz) {
        this.vel3dAHz = vel3dAHz;
    }
    public double getVel3dATx() {
        return vel3dATx;
    }

    public void setVel3dATx(double vel3dATx) {
        this.vel3dATx = vel3dATx;
    }
    public double getVel3dATy() {
        return vel3dATy;
    }

    public void setVel3dATy(double vel3dATy) {
        this.vel3dATy = vel3dATy;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}