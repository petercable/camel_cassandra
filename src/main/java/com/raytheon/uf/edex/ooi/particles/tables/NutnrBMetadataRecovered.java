package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "nutnr_b_metadata_recovered")
public class NutnrBMetadataRecovered extends CassandraParticle {

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "startup_time_string")
    private String startupTimeString;

    @Column(value = "firmware_version")
    private String firmwareVersion;

    @Column(value = "firmware_date")
    private String firmwareDate;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSerialNumber((String) particle.get("serial_number"));
        setStartupTimeString((String) particle.get("startup_time_string"));
        setFirmwareVersion((String) particle.get("firmware_version"));
        setFirmwareDate((String) particle.get("firmware_date"));
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getStartupTimeString() {
        return startupTimeString;
    }

    public void setStartupTimeString(String startupTimeString) {
        this.startupTimeString = startupTimeString;
    }
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public String getFirmwareDate() {
        return firmwareDate;
    }

    public void setFirmwareDate(String firmwareDate) {
        this.firmwareDate = firmwareDate;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}