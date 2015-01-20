package com.raytheon.uf.edex.ooi.particles;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.io.IOException;

@Table(value = "BASE")
public class CassandraParticle {
    private static final Logger LOG = LoggerFactory.getLogger(CassandraParticle.class);
    @PrimaryKey
    protected ParticleKey pk;

    @Column(value = "driver_timestamp")
    protected double driver_timestamp;

    @Column(value = "ingestion_timestamp")
    protected double ingestion_timestamp;

    @Column(value = "internal_timestamp")
    protected double internal_timestamp;

    @Column(value = "preferred_timestamp")
    protected String preferred_timestamp;

    @Column(value = "quality_flag")
    protected String quality_flag;

    public CassandraParticle() {}

    public void fill(DataParticleJson particle, String sensor, String method) {
        pk = new ParticleKey(sensor, method, particle.getTime());
        driver_timestamp = particle.getDriver_timestamp();
        ingestion_timestamp = particle.getIngestion_timestamp();
        internal_timestamp = particle.getInternal_timestamp();
        preferred_timestamp = particle.getPreferred_timestamp();
        quality_flag = particle.getQuality_flag();
    }

    public double getDriver_timestamp() {
        return driver_timestamp;
    }

    public void setDriver_timestamp(double driver_timestamp) {
        this.driver_timestamp = driver_timestamp;
    }

    public double getIngestion_timestamp() {
        return ingestion_timestamp;
    }

    public void setIngestion_timestamp(double ingestion_timestamp) {
        this.ingestion_timestamp = ingestion_timestamp;
    }

    public double getInternal_timestamp() {
        return internal_timestamp;
    }

    public void setInternal_timestamp(double internal_timestamp) {
        this.internal_timestamp = internal_timestamp;
    }

    public String getPreferred_timestamp() {
        return preferred_timestamp;
    }

    public void setPreferred_timestamp(String preferred_timestamp) {
        this.preferred_timestamp = preferred_timestamp;
    }

    public ParticleKey getPk() {
    
        return pk;
    }

    public void setPk(ParticleKey pk) {
        this.pk = pk;
    }

    public String getQuality_flag() {
        return quality_flag;
    }

    public void setQuality_flag(String quality_flag) {
        this.quality_flag = quality_flag;
    }


    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
