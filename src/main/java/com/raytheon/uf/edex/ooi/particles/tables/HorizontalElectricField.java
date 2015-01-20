package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "horizontal_electric_field")
public class HorizontalElectricField extends CassandraParticle {

    @Column(value = "hpies_data_valid")
    private int hpiesDataValid;

    @Column(value = "hpies_eindex")
    private int hpiesEindex;

    @Column(value = "hpies_e1c")
    private int hpiesE1c;

    @Column(value = "hpies_e1a")
    private int hpiesE1a;

    @Column(value = "hpies_e1b")
    private int hpiesE1b;

    @Column(value = "hpies_e2c")
    private int hpiesE2c;

    @Column(value = "hpies_e2a")
    private int hpiesE2a;

    @Column(value = "hpies_e2b")
    private int hpiesE2b;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHpiesDataValid((int) particle.get("hpies_data_valid"));
        setHpiesEindex((int) particle.get("hpies_eindex"));
        setHpiesE1c((int) particle.get("hpies_e1c"));
        setHpiesE1a((int) particle.get("hpies_e1a"));
        setHpiesE1b((int) particle.get("hpies_e1b"));
        setHpiesE2c((int) particle.get("hpies_e2c"));
        setHpiesE2a((int) particle.get("hpies_e2a"));
        setHpiesE2b((int) particle.get("hpies_e2b"));
    }

    public int getHpiesDataValid() {
        return hpiesDataValid;
    }

    public void setHpiesDataValid(int hpiesDataValid) {
        this.hpiesDataValid = hpiesDataValid;
    }
    public int getHpiesEindex() {
        return hpiesEindex;
    }

    public void setHpiesEindex(int hpiesEindex) {
        this.hpiesEindex = hpiesEindex;
    }
    public int getHpiesE1c() {
        return hpiesE1c;
    }

    public void setHpiesE1c(int hpiesE1c) {
        this.hpiesE1c = hpiesE1c;
    }
    public int getHpiesE1a() {
        return hpiesE1a;
    }

    public void setHpiesE1a(int hpiesE1a) {
        this.hpiesE1a = hpiesE1a;
    }
    public int getHpiesE1b() {
        return hpiesE1b;
    }

    public void setHpiesE1b(int hpiesE1b) {
        this.hpiesE1b = hpiesE1b;
    }
    public int getHpiesE2c() {
        return hpiesE2c;
    }

    public void setHpiesE2c(int hpiesE2c) {
        this.hpiesE2c = hpiesE2c;
    }
    public int getHpiesE2a() {
        return hpiesE2a;
    }

    public void setHpiesE2a(int hpiesE2a) {
        this.hpiesE2a = hpiesE2a;
    }
    public int getHpiesE2b() {
        return hpiesE2b;
    }

    public void setHpiesE2b(int hpiesE2b) {
        this.hpiesE2b = hpiesE2b;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}