package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ppsdn_status")
public class PpsdnStatus extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "identification_string")
    private String identificationString;

    @Column(value = "serial_number")
    private String serialNumber;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setIdentificationString((String) particle.get("identification_string"));
        setSerialNumber((String) particle.get("serial_number"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public String getIdentificationString() {
        return identificationString;
    }

    public void setIdentificationString(String identificationString) {
        this.identificationString = identificationString;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}