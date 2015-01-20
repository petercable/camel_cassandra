package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dosta_ln_wfp_sio_instrument")
public class DostaLnWfpSioInstrument extends CassandraParticle {

    @Column(value = "dosta_ln_optode_oxygen")
    private float dostaLnOptodeOxygen;

    @Column(value = "dosta_ln_optode_temperature")
    private float dostaLnOptodeTemperature;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDostaLnOptodeOxygen((float) particle.get("dosta_ln_optode_oxygen"));
        setDostaLnOptodeTemperature((float) particle.get("dosta_ln_optode_temperature"));
    }

    public float getDostaLnOptodeOxygen() {
        return dostaLnOptodeOxygen;
    }

    public void setDostaLnOptodeOxygen(float dostaLnOptodeOxygen) {
        this.dostaLnOptodeOxygen = dostaLnOptodeOxygen;
    }
    public float getDostaLnOptodeTemperature() {
        return dostaLnOptodeTemperature;
    }

    public void setDostaLnOptodeTemperature(float dostaLnOptodeTemperature) {
        this.dostaLnOptodeTemperature = dostaLnOptodeTemperature;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}