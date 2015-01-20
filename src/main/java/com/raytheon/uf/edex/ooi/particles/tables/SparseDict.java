package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "sparse_dict")
public class SparseDict extends CassandraParticle {

    @Column(value = "sparse_float")
    private float sparseFloat;

    @Column(value = "sparse_double")
    private double sparseDouble;

    @Column(value = "sparse_int")
    private long sparseInt;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSparseFloat((float) particle.get("sparse_float"));
        setSparseDouble((double) particle.get("sparse_double"));
        setSparseInt((long) particle.get("sparse_int"));
    }

    public float getSparseFloat() {
        return sparseFloat;
    }

    public void setSparseFloat(float sparseFloat) {
        this.sparseFloat = sparseFloat;
    }
    public double getSparseDouble() {
        return sparseDouble;
    }

    public void setSparseDouble(double sparseDouble) {
        this.sparseDouble = sparseDouble;
    }
    public long getSparseInt() {
        return sparseInt;
    }

    public void setSparseInt(long sparseInt) {
        this.sparseInt = sparseInt;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}