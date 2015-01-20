package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_battery_voltage")
public class VelptBatteryVoltage extends CassandraParticle {

    @Column(value = "battery_voltage_mv")
    private int batteryVoltageMv;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setBatteryVoltageMv((int) particle.get("battery_voltage_mv"));
    }

    public int getBatteryVoltageMv() {
        return batteryVoltageMv;
    }

    public void setBatteryVoltageMv(int batteryVoltageMv) {
        this.batteryVoltageMv = batteryVoltageMv;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}