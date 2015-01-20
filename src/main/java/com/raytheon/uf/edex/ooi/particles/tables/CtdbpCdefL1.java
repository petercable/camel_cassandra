package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_cdef_L1")
public class CtdbpCdefL1 extends CassandraParticle {

    @Column(value = "temp")
    private float temp;

    @Column(value = "conductivity")
    private float conductivity;

    @Column(value = "pressure")
    private float pressure;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTemp((float) particle.get("temp"));
        setConductivity((float) particle.get("conductivity"));
        setPressure((float) particle.get("pressure"));
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    public float getConductivity() {
        return conductivity;
    }

    public void setConductivity(float conductivity) {
        this.conductivity = conductivity;
    }
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}