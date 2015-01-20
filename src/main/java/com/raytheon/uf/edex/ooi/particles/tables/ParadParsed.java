package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "parad_parsed")
public class ParadParsed extends CassandraParticle {

    @Column(value = "serial_num")
    private List<Integer> serialNum;

    @Column(value = "serial_num_dims")
    private int serialNumDims;

    @Column(value = "serial_num_sizes")
    private List<Long> serialNumSizes;

    @Column(value = "elapsed_time")
    private double elapsedTime;

    @Column(value = "counts")
    private BigInteger counts;

    @Column(value = "checksum")
    private int checksum;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNum((List<Integer>) particle.get("serial_num"));
        setSerialNumDims((int) particle.get("serial_num_dims"));
        setSerialNumSizes((List<Long>) particle.get("serial_num_sizes"));
        setElapsedTime((double) particle.get("elapsed_time"));
        setCounts((BigInteger) particle.get("counts"));
        setChecksum((int) particle.get("checksum"));
    }

    public List<Integer> getSerialNum() {
        // TODO - restore original dimensions, (remove fill values?)
        return serialNum;
    }

    public void setSerialNum(List<Integer> serialNum) {
        // TODO - flatten for storage, insert fill values
        this.serialNum = serialNum;
    }
    public int getSerialNumDims() {
        return serialNumDims;
    }

    public void setSerialNumDims(int serialNumDims) {
        this.serialNumDims = serialNumDims;
    }
    public List<Long> getSerialNumSizes() {
        return serialNumSizes;
    }

    public void setSerialNumSizes(List<Long> serialNumSizes) {
        this.serialNumSizes = serialNumSizes;
    }
    public double getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public BigInteger getCounts() {
        return counts;
    }

    public void setCounts(BigInteger counts) {
        this.counts = counts;
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