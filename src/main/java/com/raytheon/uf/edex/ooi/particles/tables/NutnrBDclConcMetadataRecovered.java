package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "nutnr_b_dcl_conc_metadata_recovered")
public class NutnrBDclConcMetadataRecovered extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "startup_time")
    private int startupTime;

    @Column(value = "spec_on_time")
    private int specOnTime;

    @Column(value = "spec_powered_time")
    private int specPoweredTime;

    @Column(value = "lamp_on_time")
    private int lampOnTime;

    @Column(value = "lamp_powered_time")
    private int lampPoweredTime;

    @Column(value = "data_log_file")
    private String dataLogFile;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setSerialNumber((String) particle.get("serial_number"));
        setStartupTime((int) particle.get("startup_time"));
        setSpecOnTime((int) particle.get("spec_on_time"));
        setSpecPoweredTime((int) particle.get("spec_powered_time"));
        setLampOnTime((int) particle.get("lamp_on_time"));
        setLampPoweredTime((int) particle.get("lamp_powered_time"));
        setDataLogFile((String) particle.get("data_log_file"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getStartupTime() {
        return startupTime;
    }

    public void setStartupTime(int startupTime) {
        this.startupTime = startupTime;
    }
    public int getSpecOnTime() {
        return specOnTime;
    }

    public void setSpecOnTime(int specOnTime) {
        this.specOnTime = specOnTime;
    }
    public int getSpecPoweredTime() {
        return specPoweredTime;
    }

    public void setSpecPoweredTime(int specPoweredTime) {
        this.specPoweredTime = specPoweredTime;
    }
    public int getLampOnTime() {
        return lampOnTime;
    }

    public void setLampOnTime(int lampOnTime) {
        this.lampOnTime = lampOnTime;
    }
    public int getLampPoweredTime() {
        return lampPoweredTime;
    }

    public void setLampPoweredTime(int lampPoweredTime) {
        this.lampPoweredTime = lampPoweredTime;
    }
    public String getDataLogFile() {
        return dataLogFile;
    }

    public void setDataLogFile(String dataLogFile) {
        this.dataLogFile = dataLogFile;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}