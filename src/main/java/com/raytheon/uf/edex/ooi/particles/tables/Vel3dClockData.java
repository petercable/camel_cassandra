package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_clock_data")
public class Vel3dClockData extends CassandraParticle {

    @Column(value = "date_time_array")
    private List<Integer> dateTimeArray;

    @Column(value = "date_time_array_dims")
    private int dateTimeArrayDims;

    @Column(value = "date_time_array_sizes")
    private List<Long> dateTimeArraySizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeArray((List<Integer>) particle.get("date_time_array"));
        setDateTimeArrayDims((int) particle.get("date_time_array_dims"));
        setDateTimeArraySizes((List<Long>) particle.get("date_time_array_sizes"));
    }

    public List<Integer> getDateTimeArray() {
        // TODO - restore original dimensions, (remove fill values?)
        return dateTimeArray;
    }

    public void setDateTimeArray(List<Integer> dateTimeArray) {
        // TODO - flatten for storage, insert fill values
        this.dateTimeArray = dateTimeArray;
    }
    public int getDateTimeArrayDims() {
        return dateTimeArrayDims;
    }

    public void setDateTimeArrayDims(int dateTimeArrayDims) {
        this.dateTimeArrayDims = dateTimeArrayDims;
    }
    public List<Long> getDateTimeArraySizes() {
        return dateTimeArraySizes;
    }

    public void setDateTimeArraySizes(List<Long> dateTimeArraySizes) {
        this.dateTimeArraySizes = dateTimeArraySizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}