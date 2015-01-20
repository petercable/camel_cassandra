package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "thsph_sample")
public class ThsphSample extends CassandraParticle {

    @Column(value = "thsph_hie1")
    private int thsphHie1;

    @Column(value = "thsph_hie2")
    private int thsphHie2;

    @Column(value = "thsph_h2electrode")
    private int thsphH2electrode;

    @Column(value = "thsph_s2electrode")
    private int thsphS2electrode;

    @Column(value = "thsph_thermocouple1")
    private int thsphThermocouple1;

    @Column(value = "thsph_thermocouple2")
    private int thsphThermocouple2;

    @Column(value = "thsph_rthermistor")
    private int thsphRthermistor;

    @Column(value = "thsph_bthermistor")
    private int thsphBthermistor;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setThsphHie1((int) particle.get("thsph_hie1"));
        setThsphHie2((int) particle.get("thsph_hie2"));
        setThsphH2electrode((int) particle.get("thsph_h2electrode"));
        setThsphS2electrode((int) particle.get("thsph_s2electrode"));
        setThsphThermocouple1((int) particle.get("thsph_thermocouple1"));
        setThsphThermocouple2((int) particle.get("thsph_thermocouple2"));
        setThsphRthermistor((int) particle.get("thsph_rthermistor"));
        setThsphBthermistor((int) particle.get("thsph_bthermistor"));
    }

    public int getThsphHie1() {
        return thsphHie1;
    }

    public void setThsphHie1(int thsphHie1) {
        this.thsphHie1 = thsphHie1;
    }
    public int getThsphHie2() {
        return thsphHie2;
    }

    public void setThsphHie2(int thsphHie2) {
        this.thsphHie2 = thsphHie2;
    }
    public int getThsphH2electrode() {
        return thsphH2electrode;
    }

    public void setThsphH2electrode(int thsphH2electrode) {
        this.thsphH2electrode = thsphH2electrode;
    }
    public int getThsphS2electrode() {
        return thsphS2electrode;
    }

    public void setThsphS2electrode(int thsphS2electrode) {
        this.thsphS2electrode = thsphS2electrode;
    }
    public int getThsphThermocouple1() {
        return thsphThermocouple1;
    }

    public void setThsphThermocouple1(int thsphThermocouple1) {
        this.thsphThermocouple1 = thsphThermocouple1;
    }
    public int getThsphThermocouple2() {
        return thsphThermocouple2;
    }

    public void setThsphThermocouple2(int thsphThermocouple2) {
        this.thsphThermocouple2 = thsphThermocouple2;
    }
    public int getThsphRthermistor() {
        return thsphRthermistor;
    }

    public void setThsphRthermistor(int thsphRthermistor) {
        this.thsphRthermistor = thsphRthermistor;
    }
    public int getThsphBthermistor() {
        return thsphBthermistor;
    }

    public void setThsphBthermistor(int thsphBthermistor) {
        this.thsphBthermistor = thsphBthermistor;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}