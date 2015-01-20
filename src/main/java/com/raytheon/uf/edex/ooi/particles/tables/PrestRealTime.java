package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "prest_real_time")
public class PrestRealTime extends CassandraParticle {

    @Column(value = "sample_number")
    private int sampleNumber;

    @Column(value = "sample_type")
    private String sampleType;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "absolute_pressure")
    private float absolutePressure;

    @Column(value = "pressure_temp")
    private float pressureTemp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSampleNumber((int) particle.get("sample_number"));
        setSampleType((String) particle.get("sample_type"));
        setDateTimeString((String) particle.get("date_time_string"));
        setAbsolutePressure((float) particle.get("absolute_pressure"));
        setPressureTemp((float) particle.get("pressure_temp"));
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }
    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}