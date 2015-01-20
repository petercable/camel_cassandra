package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "lookup_value_static_test")
public class LookupValueStaticTest extends CassandraParticle {

    @Column(value = "test_lookup_val")
    private float testLookupVal;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTestLookupVal((float) particle.get("test_lookup_val"));
    }

    public float getTestLookupVal() {
        return testLookupVal;
    }

    public void setTestLookupVal(float testLookupVal) {
        this.testLookupVal = testLookupVal;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}