package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "parad_sa_config")
public class ParadSaConfig extends CassandraParticle {

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "parad_telbaud")
    private int paradTelbaud;

    @Column(value = "parad_maxrate")
    private float paradMaxrate;

    @Column(value = "parad_firmware")
    private String paradFirmware;

    @Column(value = "parad_type")
    private String paradType;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((int) particle.get("serial_number"));
        setParadTelbaud((int) particle.get("parad_telbaud"));
        setParadMaxrate((float) particle.get("parad_maxrate"));
        setParadFirmware((String) particle.get("parad_firmware"));
        setParadType((String) particle.get("parad_type"));
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getParadTelbaud() {
        return paradTelbaud;
    }

    public void setParadTelbaud(int paradTelbaud) {
        this.paradTelbaud = paradTelbaud;
    }
    public float getParadMaxrate() {
        return paradMaxrate;
    }

    public void setParadMaxrate(float paradMaxrate) {
        this.paradMaxrate = paradMaxrate;
    }
    public String getParadFirmware() {
        return paradFirmware;
    }

    public void setParadFirmware(String paradFirmware) {
        this.paradFirmware = paradFirmware;
    }
    public String getParadType() {
        return paradType;
    }

    public void setParadType(String paradType) {
        this.paradType = paradType;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}