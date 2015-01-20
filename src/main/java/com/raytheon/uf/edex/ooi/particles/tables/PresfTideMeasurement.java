package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "presf_tide_measurement")
public class PresfTideMeasurement extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "absolute_pressure")
    private float absolutePressure;

    @Column(value = "pressure_temp")
    private float pressureTemp;

    @Column(value = "seawater_temperature")
    private float seawaterTemperature;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setAbsolutePressure((float) particle.get("absolute_pressure"));
        setPressureTemp((float) particle.get("pressure_temp"));
        setSeawaterTemperature((float) particle.get("seawater_temperature"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public float getAbsolutePressure() {
        return absolutePressure;
    }

    public void setAbsolutePressure(float absolutePressure) {
        this.absolutePressure = absolutePressure;
    }
    public float getPressureTemp() {
        return pressureTemp;
    }

    public void setPressureTemp(float pressureTemp) {
        this.pressureTemp = pressureTemp;
    }
    public float getSeawaterTemperature() {
        return seawaterTemperature;
    }

    public void setSeawaterTemperature(float seawaterTemperature) {
        this.seawaterTemperature = seawaterTemperature;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}