package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "mopak_o_dcl_accel_recovered")
public class MopakODclAccelRecovered extends CassandraParticle {

    @Column(value = "mopak_accelx")
    private float mopakAccelx;

    @Column(value = "mopak_accely")
    private float mopakAccely;

    @Column(value = "mopak_accelz")
    private float mopakAccelz;

    @Column(value = "mopak_ang_ratex")
    private float mopakAngRatex;

    @Column(value = "mopak_ang_ratey")
    private float mopakAngRatey;

    @Column(value = "mopak_ang_ratez")
    private float mopakAngRatez;

    @Column(value = "mopak_magx")
    private float mopakMagx;

    @Column(value = "mopak_magy")
    private float mopakMagy;

    @Column(value = "mopak_magz")
    private float mopakMagz;

    @Column(value = "mopak_timer")
    private long mopakTimer;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMopakAccelx((float) particle.get("mopak_accelx"));
        setMopakAccely((float) particle.get("mopak_accely"));
        setMopakAccelz((float) particle.get("mopak_accelz"));
        setMopakAngRatex((float) particle.get("mopak_ang_ratex"));
        setMopakAngRatey((float) particle.get("mopak_ang_ratey"));
        setMopakAngRatez((float) particle.get("mopak_ang_ratez"));
        setMopakMagx((float) particle.get("mopak_magx"));
        setMopakMagy((float) particle.get("mopak_magy"));
        setMopakMagz((float) particle.get("mopak_magz"));
        setMopakTimer((long) particle.get("mopak_timer"));
    }

    public float getMopakAccelx() {
        return mopakAccelx;
    }

    public void setMopakAccelx(float mopakAccelx) {
        this.mopakAccelx = mopakAccelx;
    }
    public float getMopakAccely() {
        return mopakAccely;
    }

    public void setMopakAccely(float mopakAccely) {
        this.mopakAccely = mopakAccely;
    }
    public float getMopakAccelz() {
        return mopakAccelz;
    }

    public void setMopakAccelz(float mopakAccelz) {
        this.mopakAccelz = mopakAccelz;
    }
    public float getMopakAngRatex() {
        return mopakAngRatex;
    }

    public void setMopakAngRatex(float mopakAngRatex) {
        this.mopakAngRatex = mopakAngRatex;
    }
    public float getMopakAngRatey() {
        return mopakAngRatey;
    }

    public void setMopakAngRatey(float mopakAngRatey) {
        this.mopakAngRatey = mopakAngRatey;
    }
    public float getMopakAngRatez() {
        return mopakAngRatez;
    }

    public void setMopakAngRatez(float mopakAngRatez) {
        this.mopakAngRatez = mopakAngRatez;
    }
    public float getMopakMagx() {
        return mopakMagx;
    }

    public void setMopakMagx(float mopakMagx) {
        this.mopakMagx = mopakMagx;
    }
    public float getMopakMagy() {
        return mopakMagy;
    }

    public void setMopakMagy(float mopakMagy) {
        this.mopakMagy = mopakMagy;
    }
    public float getMopakMagz() {
        return mopakMagz;
    }

    public void setMopakMagz(float mopakMagz) {
        this.mopakMagz = mopakMagz;
    }
    public long getMopakTimer() {
        return mopakTimer;
    }

    public void setMopakTimer(long mopakTimer) {
        this.mopakTimer = mopakTimer;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}