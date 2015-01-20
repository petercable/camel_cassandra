package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "camds_health_status")
public class CamdsHealthStatus extends CassandraParticle {

    @Column(value = "camds_temp")
    private int camdsTemp;

    @Column(value = "camds_humidity")
    private int camdsHumidity;

    @Column(value = "camds_error")
    private int camdsError;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setCamdsTemp((int) particle.get("camds_temp"));
        setCamdsHumidity((int) particle.get("camds_humidity"));
        setCamdsError((int) particle.get("camds_error"));
    }

    public int getCamdsTemp() {
        return camdsTemp;
    }

    public void setCamdsTemp(int camdsTemp) {
        this.camdsTemp = camdsTemp;
    }
    public int getCamdsHumidity() {
        return camdsHumidity;
    }

    public void setCamdsHumidity(int camdsHumidity) {
        this.camdsHumidity = camdsHumidity;
    }
    public int getCamdsError() {
        return camdsError;
    }

    public void setCamdsError(int camdsError) {
        this.camdsError = camdsError;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}