package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_cdef_dcl_ce_dosta")
public class CtdbpCdefDclCeDosta extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "dosta_ln_optode_oxygen")
    private float dostaLnOptodeOxygen;

    @Column(value = "date_time_string")
    private String dateTimeString;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setDostaLnOptodeOxygen((float) particle.get("dosta_ln_optode_oxygen"));
        setDateTimeString((String) particle.get("date_time_string"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public float getDostaLnOptodeOxygen() {
        return dostaLnOptodeOxygen;
    }

    public void setDostaLnOptodeOxygen(float dostaLnOptodeOxygen) {
        this.dostaLnOptodeOxygen = dostaLnOptodeOxygen;
    }
    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}