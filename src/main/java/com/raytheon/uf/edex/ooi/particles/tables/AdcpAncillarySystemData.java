package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcp_ancillary_system_data")
public class AdcpAncillarySystemData extends CassandraParticle {

    @Column(value = "adcp_ambient_temp")
    private float adcpAmbientTemp;

    @Column(value = "adcp_attitude_temp")
    private float adcpAttitudeTemp;

    @Column(value = "adcp_internal_moisture")
    private String adcpInternalMoisture;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setAdcpAmbientTemp((float) particle.get("adcp_ambient_temp"));
        setAdcpAttitudeTemp((float) particle.get("adcp_attitude_temp"));
        setAdcpInternalMoisture((String) particle.get("adcp_internal_moisture"));
    }

    public float getAdcpAmbientTemp() {
        return adcpAmbientTemp;
    }

    public void setAdcpAmbientTemp(float adcpAmbientTemp) {
        this.adcpAmbientTemp = adcpAmbientTemp;
    }
    public float getAdcpAttitudeTemp() {
        return adcpAttitudeTemp;
    }

    public void setAdcpAttitudeTemp(float adcpAttitudeTemp) {
        this.adcpAttitudeTemp = adcpAttitudeTemp;
    }
    public String getAdcpInternalMoisture() {
        return adcpInternalMoisture;
    }

    public void setAdcpInternalMoisture(String adcpInternalMoisture) {
        this.adcpInternalMoisture = adcpInternalMoisture;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}