package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dosta_ln_wfp_instrument_recovered")
public class DostaLnWfpInstrumentRecovered extends CassandraParticle {

    @Column(value = "estimated_oxygen_concentration")
    private float estimatedOxygenConcentration;

    @Column(value = "optode_temperature")
    private float optodeTemperature;

    @Column(value = "wfp_timestamp")
    private long wfpTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setEstimatedOxygenConcentration((float) particle.get("estimated_oxygen_concentration"));
        setOptodeTemperature((float) particle.get("optode_temperature"));
        setWfpTimestamp((long) particle.get("wfp_timestamp"));
    }

    public float getEstimatedOxygenConcentration() {
        return estimatedOxygenConcentration;
    }

    public void setEstimatedOxygenConcentration(float estimatedOxygenConcentration) {
        this.estimatedOxygenConcentration = estimatedOxygenConcentration;
    }
    public float getOptodeTemperature() {
        return optodeTemperature;
    }

    public void setOptodeTemperature(float optodeTemperature) {
        this.optodeTemperature = optodeTemperature;
    }
    public long getWfpTimestamp() {
        return wfpTimestamp;
    }

    public void setWfpTimestamp(long wfpTimestamp) {
        this.wfpTimestamp = wfpTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}