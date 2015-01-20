package com.raytheon.uf.edex.ooi.particles;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "ctdbp")
public class CtdbpParticle extends CassandraParticle {

    @Column(value = "conductivity")
    private int conductivity;

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "pressure")
    private int pressure;

    @Column(value = "pressure_temp")
    private int pressure_temp;

    @Column(value = "ctd_time")
    private int ctd_time;

    public CtdbpParticle() {}

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        conductivity = (int) particle.get("conductivity");
        temperature = (int) particle.get("temperature");
        pressure = (int) particle.get("pressure");
        pressure_temp = (int) particle.get("pressure_temp");
        ctd_time = (int) particle.get("ctd_time");
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

    public int getPressure_temp() {
        return pressure_temp;
    }

    public void setPressure_temp(int pressure_temp) {
        this.pressure_temp = pressure_temp;
    }

    public int getCtd_time() {
        return ctd_time;
    }

    public void setCtd_time(int ctd_time) {
        this.ctd_time = ctd_time;
    }

    @Override
    public String toString() {
        return "CtdbpParticle{" +
                "pk=" + pk +
                ", conductivity=" + conductivity +
                ", pressure=" + pressure +
                ", pressure_temp=" + pressure_temp +
                ", ctd_time=" + ctd_time +
                '}';
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
