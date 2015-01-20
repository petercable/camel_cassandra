package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_identification_string")
public class VelptIdentificationString extends CassandraParticle {

    @Column(value = "identification_string")
    private String identificationString;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setIdentificationString((String) particle.get("identification_string"));
    }

    public String getIdentificationString() {
        return identificationString;
    }

    public void setIdentificationString(String identificationString) {
        this.identificationString = identificationString;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}