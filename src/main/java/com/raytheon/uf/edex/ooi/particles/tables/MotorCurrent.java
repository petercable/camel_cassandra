package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "motor_current")
public class MotorCurrent extends CassandraParticle {

    @Column(value = "hpies_data_valid")
    private int hpiesDataValid;

    @Column(value = "hpies_mindex")
    private int hpiesMindex;

    @Column(value = "hpies_motor_current")
    private int hpiesMotorCurrent;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHpiesDataValid((int) particle.get("hpies_data_valid"));
        setHpiesMindex((int) particle.get("hpies_mindex"));
        setHpiesMotorCurrent((int) particle.get("hpies_motor_current"));
    }

    public int getHpiesDataValid() {
        return hpiesDataValid;
    }

    public void setHpiesDataValid(int hpiesDataValid) {
        this.hpiesDataValid = hpiesDataValid;
    }
    public int getHpiesMindex() {
        return hpiesMindex;
    }

    public void setHpiesMindex(int hpiesMindex) {
        this.hpiesMindex = hpiesMindex;
    }
    public int getHpiesMotorCurrent() {
        return hpiesMotorCurrent;
    }

    public void setHpiesMotorCurrent(int hpiesMotorCurrent) {
        this.hpiesMotorCurrent = hpiesMotorCurrent;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}