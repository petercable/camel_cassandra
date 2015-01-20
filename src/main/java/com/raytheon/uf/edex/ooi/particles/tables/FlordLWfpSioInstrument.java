package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flord_l_wfp_sio_instrument")
public class FlordLWfpSioInstrument extends CassandraParticle {

    @Column(value = "flord_wfp_chlorophyll")
    private int flordWfpChlorophyll;

    @Column(value = "flord_wfp_turbidity")
    private int flordWfpTurbidity;

    @Column(value = "flord_wfp_temperature")
    private int flordWfpTemperature;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFlordWfpChlorophyll((int) particle.get("flord_wfp_chlorophyll"));
        setFlordWfpTurbidity((int) particle.get("flord_wfp_turbidity"));
        setFlordWfpTemperature((int) particle.get("flord_wfp_temperature"));
    }

    public int getFlordWfpChlorophyll() {
        return flordWfpChlorophyll;
    }

    public void setFlordWfpChlorophyll(int flordWfpChlorophyll) {
        this.flordWfpChlorophyll = flordWfpChlorophyll;
    }
    public int getFlordWfpTurbidity() {
        return flordWfpTurbidity;
    }

    public void setFlordWfpTurbidity(int flordWfpTurbidity) {
        this.flordWfpTurbidity = flordWfpTurbidity;
    }
    public int getFlordWfpTemperature() {
        return flordWfpTemperature;
    }

    public void setFlordWfpTemperature(int flordWfpTemperature) {
        this.flordWfpTemperature = flordWfpTemperature;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}