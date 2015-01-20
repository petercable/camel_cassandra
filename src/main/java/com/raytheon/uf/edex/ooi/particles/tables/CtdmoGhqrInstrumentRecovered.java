package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdmo_ghqr_instrument_recovered")
public class CtdmoGhqrInstrumentRecovered extends CassandraParticle {

    @Column(value = "inductive_id")
    private int inductiveId;

    @Column(value = "instrument_serial_number_u32")
    private long instrumentSerialNumberU32;

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "conductivity")
    private int conductivity;

    @Column(value = "pressure")
    private int pressure;

    @Column(value = "pressure_temp")
    private int pressureTemp;

    @Column(value = "ctd_time")
    private int ctdTime;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setInductiveId((int) particle.get("inductive_id"));
        setInstrumentSerialNumberU32((long) particle.get("instrument_serial_number_u32"));
        setTemperature((int) particle.get("temperature"));
        setConductivity((int) particle.get("conductivity"));
        setPressure((int) particle.get("pressure"));
        setPressureTemp((int) particle.get("pressure_temp"));
        setCtdTime((int) particle.get("ctd_time"));
    }

    public int getInductiveId() {
        return inductiveId;
    }

    public void setInductiveId(int inductiveId) {
        this.inductiveId = inductiveId;
    }
    public long getInstrumentSerialNumberU32() {
        return instrumentSerialNumberU32;
    }

    public void setInstrumentSerialNumberU32(long instrumentSerialNumberU32) {
        this.instrumentSerialNumberU32 = instrumentSerialNumberU32;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getConductivity() {
        return conductivity;
    }

    public void setConductivity(int conductivity) {
        this.conductivity = conductivity;
    }
    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public int getPressureTemp() {
        return pressureTemp;
    }

    public void setPressureTemp(int pressureTemp) {
        this.pressureTemp = pressureTemp;
    }
    public int getCtdTime() {
        return ctdTime;
    }

    public void setCtdTime(int ctdTime) {
        this.ctdTime = ctdTime;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}