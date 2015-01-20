package com.raytheon.uf.edex.ooi.particles;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

import java.io.Serializable;

@PrimaryKeyClass
public class ParticleKey implements Serializable {

    @PrimaryKeyColumn(name = "subsite", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String subsite;

    @PrimaryKeyColumn(name = "node", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private String node;

    @PrimaryKeyColumn(name = "sensor", ordinal = 2, type = PrimaryKeyType.PARTITIONED)
    private String sensor;

    @PrimaryKeyColumn(name = "method", ordinal = 3, type = PrimaryKeyType.PARTITIONED)
    private String method;

    @PrimaryKeyColumn(name = "time", ordinal = 4, type = PrimaryKeyType.CLUSTERED)
    private double time;

    public ParticleKey() {}

    public ParticleKey(String sensor, String method, double time) {
        String[] parts = sensor.split("-", 3);

        if (parts.length != 3)
        {
            throw new IllegalArgumentException("Input did not contain three parts.");
        }

        this.subsite = parts[0];
        this.node = parts[1];
        this.sensor = parts[2];
        this.method = method;
        this.time = time;
    }

    @Override
    public String toString() {
        return "ParticleKey{" +
                "subsite='" + subsite + '\'' +
                ", node='" + node + '\'' +
                ", sensor='" + sensor + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParticleKey that = (ParticleKey) o;

        if (Double.compare(that.time, time) != 0) return false;
        if (!node.equals(that.node)) return false;
        if (!sensor.equals(that.sensor)) return false;
        if (!subsite.equals(that.subsite)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = subsite.hashCode();
        result = 31 * result + node.hashCode();
        result = 31 * result + sensor.hashCode();
        temp = Double.doubleToLongBits(time);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getSubsite() {

        return subsite;
    }

    public void setSubsite(String subsite) {
        this.subsite = subsite;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
