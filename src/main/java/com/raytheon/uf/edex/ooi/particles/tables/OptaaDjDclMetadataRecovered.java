package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "optaa_dj_dcl_metadata_recovered")
public class OptaaDjDclMetadataRecovered extends CassandraParticle {

    @Column(value = "start_date")
    private String startDate;

    @Column(value = "packet_type")
    private int packetType;

    @Column(value = "meter_type")
    private int meterType;

    @Column(value = "serial_number")
    private int serialNumber;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setStartDate((String) particle.get("start_date"));
        setPacketType((int) particle.get("packet_type"));
        setMeterType((int) particle.get("meter_type"));
        setSerialNumber((int) particle.get("serial_number"));
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public int getPacketType() {
        return packetType;
    }

    public void setPacketType(int packetType) {
        this.packetType = packetType;
    }
    public int getMeterType() {
        return meterType;
    }

    public void setMeterType(int meterType) {
        this.meterType = meterType;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}