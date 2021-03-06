package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_no_sample")
public class CtdbpNoSample extends CassandraParticle {

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "conductivity")
    private int conductivity;

    @Column(value = "pressure")
    private int pressure;

    @Column(value = "pressure_temp")
    private int pressureTemp;

    @Column(value = "oxy_calphase")
    private int oxyCalphase;

    @Column(value = "oxy_temp")
    private int oxyTemp;

    @Column(value = "oxygen")
    private int oxygen;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTemperature((int) particle.get("temperature"));
        setConductivity((int) particle.get("conductivity"));
        setPressure((int) particle.get("pressure"));
        setPressureTemp((int) particle.get("pressure_temp"));
        setOxyCalphase((int) particle.get("oxy_calphase"));
        setOxyTemp((int) particle.get("oxy_temp"));
        setOxygen((int) particle.get("oxygen"));
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
    public int getOxyCalphase() {
        return oxyCalphase;
    }

    public void setOxyCalphase(int oxyCalphase) {
        this.oxyCalphase = oxyCalphase;
    }
    public int getOxyTemp() {
        return oxyTemp;
    }

    public void setOxyTemp(int oxyTemp) {
        this.oxyTemp = oxyTemp;
    }
    public int getOxygen() {
        return oxygen;
    }

    public void setOxygen(int oxygen) {
        this.oxygen = oxygen;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}