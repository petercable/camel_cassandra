package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdpf_ckl_wfp_instrument_recovered")
public class CtdpfCklWfpInstrumentRecovered extends CassandraParticle {

    @Column(value = "conductivity")
    private int conductivity;

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "pressure")
    private int pressure;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setConductivity((int) particle.get("conductivity"));
        setTemperature((int) particle.get("temperature"));
        setPressure((int) particle.get("pressure"));
    }

    public int getConductivity() {
        return conductivity;
    }

    public void setConductivity(int conductivity) {
        this.conductivity = conductivity;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}