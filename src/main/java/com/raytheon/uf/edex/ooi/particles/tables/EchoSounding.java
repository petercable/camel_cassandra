package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "echo_sounding")
public class EchoSounding extends CassandraParticle {

    @Column(value = "hpies_data_valid")
    private int hpiesDataValid;

    @Column(value = "hpies_ies_timestamp")
    private BigInteger hpiesIesTimestamp;

    @Column(value = "hpies_n_travel_times")
    private int hpiesNTravelTimes;

    @Column(value = "hpies_travel_time1")
    private long hpiesTravelTime1;

    @Column(value = "hpies_travel_time2")
    private long hpiesTravelTime2;

    @Column(value = "hpies_travel_time3")
    private long hpiesTravelTime3;

    @Column(value = "hpies_travel_time4")
    private long hpiesTravelTime4;

    @Column(value = "hpies_pressure")
    private long hpiesPressure;

    @Column(value = "hpies_temperature")
    private long hpiesTemperature;

    @Column(value = "hpies_bliley_temperature")
    private long hpiesBlileyTemperature;

    @Column(value = "hpies_bliley_frequency")
    private float hpiesBlileyFrequency;

    @Column(value = "hpies_stm_timestamp")
    private BigInteger hpiesStmTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHpiesDataValid((int) particle.get("hpies_data_valid"));
        setHpiesIesTimestamp((BigInteger) particle.get("hpies_ies_timestamp"));
        setHpiesNTravelTimes((int) particle.get("hpies_n_travel_times"));
        setHpiesTravelTime1((long) particle.get("hpies_travel_time1"));
        setHpiesTravelTime2((long) particle.get("hpies_travel_time2"));
        setHpiesTravelTime3((long) particle.get("hpies_travel_time3"));
        setHpiesTravelTime4((long) particle.get("hpies_travel_time4"));
        setHpiesPressure((long) particle.get("hpies_pressure"));
        setHpiesTemperature((long) particle.get("hpies_temperature"));
        setHpiesBlileyTemperature((long) particle.get("hpies_bliley_temperature"));
        setHpiesBlileyFrequency((float) particle.get("hpies_bliley_frequency"));
        setHpiesStmTimestamp((BigInteger) particle.get("hpies_stm_timestamp"));
    }

    public int getHpiesDataValid() {
        return hpiesDataValid;
    }

    public void setHpiesDataValid(int hpiesDataValid) {
        this.hpiesDataValid = hpiesDataValid;
    }
    public BigInteger getHpiesIesTimestamp() {
        return hpiesIesTimestamp;
    }

    public void setHpiesIesTimestamp(BigInteger hpiesIesTimestamp) {
        this.hpiesIesTimestamp = hpiesIesTimestamp;
    }
    public int getHpiesNTravelTimes() {
        return hpiesNTravelTimes;
    }

    public void setHpiesNTravelTimes(int hpiesNTravelTimes) {
        this.hpiesNTravelTimes = hpiesNTravelTimes;
    }
    public long getHpiesTravelTime1() {
        return hpiesTravelTime1;
    }

    public void setHpiesTravelTime1(long hpiesTravelTime1) {
        this.hpiesTravelTime1 = hpiesTravelTime1;
    }
    public long getHpiesTravelTime2() {
        return hpiesTravelTime2;
    }

    public void setHpiesTravelTime2(long hpiesTravelTime2) {
        this.hpiesTravelTime2 = hpiesTravelTime2;
    }
    public long getHpiesTravelTime3() {
        return hpiesTravelTime3;
    }

    public void setHpiesTravelTime3(long hpiesTravelTime3) {
        this.hpiesTravelTime3 = hpiesTravelTime3;
    }
    public long getHpiesTravelTime4() {
        return hpiesTravelTime4;
    }

    public void setHpiesTravelTime4(long hpiesTravelTime4) {
        this.hpiesTravelTime4 = hpiesTravelTime4;
    }
    public long getHpiesPressure() {
        return hpiesPressure;
    }

    public void setHpiesPressure(long hpiesPressure) {
        this.hpiesPressure = hpiesPressure;
    }
    public long getHpiesTemperature() {
        return hpiesTemperature;
    }

    public void setHpiesTemperature(long hpiesTemperature) {
        this.hpiesTemperature = hpiesTemperature;
    }
    public long getHpiesBlileyTemperature() {
        return hpiesBlileyTemperature;
    }

    public void setHpiesBlileyTemperature(long hpiesBlileyTemperature) {
        this.hpiesBlileyTemperature = hpiesBlileyTemperature;
    }
    public float getHpiesBlileyFrequency() {
        return hpiesBlileyFrequency;
    }

    public void setHpiesBlileyFrequency(float hpiesBlileyFrequency) {
        this.hpiesBlileyFrequency = hpiesBlileyFrequency;
    }
    public BigInteger getHpiesStmTimestamp() {
        return hpiesStmTimestamp;
    }

    public void setHpiesStmTimestamp(BigInteger hpiesStmTimestamp) {
        this.hpiesStmTimestamp = hpiesStmTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}