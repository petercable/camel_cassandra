package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_data_header")
public class VelptDataHeader extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "number_velocity_records")
    private int numberVelocityRecords;

    @Column(value = "noise_amp_beam1")
    private int noiseAmpBeam1;

    @Column(value = "noise_amp_beam2")
    private int noiseAmpBeam2;

    @Column(value = "noise_amp_beam3")
    private int noiseAmpBeam3;

    @Column(value = "noise_correlation_beam1")
    private int noiseCorrelationBeam1;

    @Column(value = "noise_correlation_beam2")
    private int noiseCorrelationBeam2;

    @Column(value = "noise_correlation_beam3")
    private int noiseCorrelationBeam3;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setNumberVelocityRecords((int) particle.get("number_velocity_records"));
        setNoiseAmpBeam1((int) particle.get("noise_amp_beam1"));
        setNoiseAmpBeam2((int) particle.get("noise_amp_beam2"));
        setNoiseAmpBeam3((int) particle.get("noise_amp_beam3"));
        setNoiseCorrelationBeam1((int) particle.get("noise_correlation_beam1"));
        setNoiseCorrelationBeam2((int) particle.get("noise_correlation_beam2"));
        setNoiseCorrelationBeam3((int) particle.get("noise_correlation_beam3"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public int getNumberVelocityRecords() {
        return numberVelocityRecords;
    }

    public void setNumberVelocityRecords(int numberVelocityRecords) {
        this.numberVelocityRecords = numberVelocityRecords;
    }
    public int getNoiseAmpBeam1() {
        return noiseAmpBeam1;
    }

    public void setNoiseAmpBeam1(int noiseAmpBeam1) {
        this.noiseAmpBeam1 = noiseAmpBeam1;
    }
    public int getNoiseAmpBeam2() {
        return noiseAmpBeam2;
    }

    public void setNoiseAmpBeam2(int noiseAmpBeam2) {
        this.noiseAmpBeam2 = noiseAmpBeam2;
    }
    public int getNoiseAmpBeam3() {
        return noiseAmpBeam3;
    }

    public void setNoiseAmpBeam3(int noiseAmpBeam3) {
        this.noiseAmpBeam3 = noiseAmpBeam3;
    }
    public int getNoiseCorrelationBeam1() {
        return noiseCorrelationBeam1;
    }

    public void setNoiseCorrelationBeam1(int noiseCorrelationBeam1) {
        this.noiseCorrelationBeam1 = noiseCorrelationBeam1;
    }
    public int getNoiseCorrelationBeam2() {
        return noiseCorrelationBeam2;
    }

    public void setNoiseCorrelationBeam2(int noiseCorrelationBeam2) {
        this.noiseCorrelationBeam2 = noiseCorrelationBeam2;
    }
    public int getNoiseCorrelationBeam3() {
        return noiseCorrelationBeam3;
    }

    public void setNoiseCorrelationBeam3(int noiseCorrelationBeam3) {
        this.noiseCorrelationBeam3 = noiseCorrelationBeam3;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}