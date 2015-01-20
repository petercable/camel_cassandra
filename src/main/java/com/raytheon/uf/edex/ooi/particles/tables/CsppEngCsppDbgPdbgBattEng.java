package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cspp_eng_cspp_dbg_pdbg_batt_eng")
public class CsppEngCsppDbgPdbgBattEng extends CassandraParticle {

    @Column(value = "profiler_timestamp")
    private double profilerTimestamp;

    @Column(value = "pressure_depth")
    private float pressureDepth;

    @Column(value = "suspect_timestamp")
    private int suspectTimestamp;

    @Column(value = "battery_number_uint8")
    private int batteryNumberUint8;

    @Column(value = "battery_voltage_flt32")
    private float batteryVoltageFlt32;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProfilerTimestamp((double) particle.get("profiler_timestamp"));
        setPressureDepth((float) particle.get("pressure_depth"));
        setSuspectTimestamp((int) particle.get("suspect_timestamp"));
        setBatteryNumberUint8((int) particle.get("battery_number_uint8"));
        setBatteryVoltageFlt32((float) particle.get("battery_voltage_flt32"));
    }

    public double getProfilerTimestamp() {
        return profilerTimestamp;
    }

    public void setProfilerTimestamp(double profilerTimestamp) {
        this.profilerTimestamp = profilerTimestamp;
    }
    public float getPressureDepth() {
        return pressureDepth;
    }

    public void setPressureDepth(float pressureDepth) {
        this.pressureDepth = pressureDepth;
    }
    public int getSuspectTimestamp() {
        return suspectTimestamp;
    }

    public void setSuspectTimestamp(int suspectTimestamp) {
        this.suspectTimestamp = suspectTimestamp;
    }
    public int getBatteryNumberUint8() {
        return batteryNumberUint8;
    }

    public void setBatteryNumberUint8(int batteryNumberUint8) {
        this.batteryNumberUint8 = batteryNumberUint8;
    }
    public float getBatteryVoltageFlt32() {
        return batteryVoltageFlt32;
    }

    public void setBatteryVoltageFlt32(float batteryVoltageFlt32) {
        this.batteryVoltageFlt32 = batteryVoltageFlt32;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}