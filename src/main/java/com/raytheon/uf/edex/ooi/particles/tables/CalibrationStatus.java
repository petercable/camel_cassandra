package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "calibration_status")
public class CalibrationStatus extends CassandraParticle {

    @Column(value = "hpies_data_valid")
    private int hpiesDataValid;

    @Column(value = "hpies_cindex")
    private int hpiesCindex;

    @Column(value = "hpies_c1c")
    private int hpiesC1c;

    @Column(value = "hpies_c1a")
    private int hpiesC1a;

    @Column(value = "hpies_c1b")
    private int hpiesC1b;

    @Column(value = "hpies_c2c")
    private int hpiesC2c;

    @Column(value = "hpies_c2a")
    private int hpiesC2a;

    @Column(value = "hpies_c2b")
    private int hpiesC2b;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHpiesDataValid((int) particle.get("hpies_data_valid"));
        setHpiesCindex((int) particle.get("hpies_cindex"));
        setHpiesC1c((int) particle.get("hpies_c1c"));
        setHpiesC1a((int) particle.get("hpies_c1a"));
        setHpiesC1b((int) particle.get("hpies_c1b"));
        setHpiesC2c((int) particle.get("hpies_c2c"));
        setHpiesC2a((int) particle.get("hpies_c2a"));
        setHpiesC2b((int) particle.get("hpies_c2b"));
    }

    public int getHpiesDataValid() {
        return hpiesDataValid;
    }

    public void setHpiesDataValid(int hpiesDataValid) {
        this.hpiesDataValid = hpiesDataValid;
    }
    public int getHpiesCindex() {
        return hpiesCindex;
    }

    public void setHpiesCindex(int hpiesCindex) {
        this.hpiesCindex = hpiesCindex;
    }
    public int getHpiesC1c() {
        return hpiesC1c;
    }

    public void setHpiesC1c(int hpiesC1c) {
        this.hpiesC1c = hpiesC1c;
    }
    public int getHpiesC1a() {
        return hpiesC1a;
    }

    public void setHpiesC1a(int hpiesC1a) {
        this.hpiesC1a = hpiesC1a;
    }
    public int getHpiesC1b() {
        return hpiesC1b;
    }

    public void setHpiesC1b(int hpiesC1b) {
        this.hpiesC1b = hpiesC1b;
    }
    public int getHpiesC2c() {
        return hpiesC2c;
    }

    public void setHpiesC2c(int hpiesC2c) {
        this.hpiesC2c = hpiesC2c;
    }
    public int getHpiesC2a() {
        return hpiesC2a;
    }

    public void setHpiesC2a(int hpiesC2a) {
        this.hpiesC2a = hpiesC2a;
    }
    public int getHpiesC2b() {
        return hpiesC2b;
    }

    public void setHpiesC2b(int hpiesC2b) {
        this.hpiesC2b = hpiesC2b;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}