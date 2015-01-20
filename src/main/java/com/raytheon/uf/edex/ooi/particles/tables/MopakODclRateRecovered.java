package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "mopak_o_dcl_rate_recovered")
public class MopakODclRateRecovered extends CassandraParticle {

    @Column(value = "mopak_roll")
    private float mopakRoll;

    @Column(value = "mopak_pitch")
    private float mopakPitch;

    @Column(value = "mopak_ang_ratex")
    private float mopakAngRatex;

    @Column(value = "mopak_ang_ratey")
    private float mopakAngRatey;

    @Column(value = "mopak_ang_ratez")
    private float mopakAngRatez;

    @Column(value = "mopak_timer")
    private long mopakTimer;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMopakRoll((float) particle.get("mopak_roll"));
        setMopakPitch((float) particle.get("mopak_pitch"));
        setMopakAngRatex((float) particle.get("mopak_ang_ratex"));
        setMopakAngRatey((float) particle.get("mopak_ang_ratey"));
        setMopakAngRatez((float) particle.get("mopak_ang_ratez"));
        setMopakTimer((long) particle.get("mopak_timer"));
    }

    public float getMopakRoll() {
        return mopakRoll;
    }

    public void setMopakRoll(float mopakRoll) {
        this.mopakRoll = mopakRoll;
    }
    public float getMopakPitch() {
        return mopakPitch;
    }

    public void setMopakPitch(float mopakPitch) {
        this.mopakPitch = mopakPitch;
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