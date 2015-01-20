package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "parad_sa_sample")
public class ParadSaSample extends CassandraParticle {

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "elapsed_time")
    private double elapsedTime;

    @Column(value = "par")
    private long par;

    @Column(value = "checksum")
    private int checksum;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((int) particle.get("serial_number"));
        setElapsedTime((double) particle.get("elapsed_time"));
        setPar((long) particle.get("par"));
        setChecksum((int) particle.get("checksum"));
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public double getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public long getPar() {
        return par;
    }

    public void setPar(long par) {
        this.par = par;
    }
    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}