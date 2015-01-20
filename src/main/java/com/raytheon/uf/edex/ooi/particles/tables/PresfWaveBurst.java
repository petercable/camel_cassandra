package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "presf_wave_burst")
public class PresfWaveBurst extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "ptemp_frequency")
    private float ptempFrequency;

    @Column(value = "absolute_pressure_burst")
    private List<Float> absolutePressureBurst;

    @Column(value = "absolute_pressure_burst_dims")
    private int absolutePressureBurstDims;

    @Column(value = "absolute_pressure_burst_sizes")
    private List<Long> absolutePressureBurstSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setPtempFrequency((float) particle.get("ptemp_frequency"));
        setAbsolutePressureBurst((List<Float>) particle.get("absolute_pressure_burst"));
        setAbsolutePressureBurstDims((int) particle.get("absolute_pressure_burst_dims"));
        setAbsolutePressureBurstSizes((List<Long>) particle.get("absolute_pressure_burst_sizes"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public float getPtempFrequency() {
        return ptempFrequency;
    }

    public void setPtempFrequency(float ptempFrequency) {
        this.ptempFrequency = ptempFrequency;
    }
    public List<Float> getAbsolutePressureBurst() {
        // TODO - restore original dimensions, (remove fill values?)
        return absolutePressureBurst;
    }

    public void setAbsolutePressureBurst(List<Float> absolutePressureBurst) {
        // TODO - flatten for storage, insert fill values
        this.absolutePressureBurst = absolutePressureBurst;
    }
    public int getAbsolutePressureBurstDims() {
        return absolutePressureBurstDims;
    }

    public void setAbsolutePressureBurstDims(int absolutePressureBurstDims) {
        this.absolutePressureBurstDims = absolutePressureBurstDims;
    }
    public List<Long> getAbsolutePressureBurstSizes() {
        return absolutePressureBurstSizes;
    }

    public void setAbsolutePressureBurstSizes(List<Long> absolutePressureBurstSizes) {
        this.absolutePressureBurstSizes = absolutePressureBurstSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}