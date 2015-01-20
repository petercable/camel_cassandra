package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "phsen_thermistor_voltage")
public class PhsenThermistorVoltage extends CassandraParticle {

    @Column(value = "pco2w_thermistor_voltage")
    private int pco2wThermistorVoltage;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setPco2wThermistorVoltage((int) particle.get("pco2w_thermistor_voltage"));
    }

    public int getPco2wThermistorVoltage() {
        return pco2wThermistorVoltage;
    }

    public void setPco2wThermistorVoltage(int pco2wThermistorVoltage) {
        this.pco2wThermistorVoltage = pco2wThermistorVoltage;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}