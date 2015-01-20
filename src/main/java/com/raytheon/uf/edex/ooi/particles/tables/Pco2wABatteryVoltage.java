package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "pco2w_a_battery_voltage")
public class Pco2wABatteryVoltage extends CassandraParticle {

    @Column(value = "pco2w_battery_voltage")
    private int pco2wBatteryVoltage;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setPco2wBatteryVoltage((int) particle.get("pco2w_battery_voltage"));
    }

    public int getPco2wBatteryVoltage() {
        return pco2wBatteryVoltage;
    }

    public void setPco2wBatteryVoltage(int pco2wBatteryVoltage) {
        this.pco2wBatteryVoltage = pco2wBatteryVoltage;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}