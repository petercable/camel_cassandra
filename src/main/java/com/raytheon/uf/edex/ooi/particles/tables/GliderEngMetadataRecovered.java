package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "glider_eng_metadata_recovered")
public class GliderEngMetadataRecovered extends CassandraParticle {

    @Column(value = "glider_eng_filename")
    private String gliderEngFilename;

    @Column(value = "glider_mission_name")
    private String gliderMissionName;

    @Column(value = "glider_eng_fileopen_time")
    private String gliderEngFileopenTime;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setGliderEngFilename((String) particle.get("glider_eng_filename"));
        setGliderMissionName((String) particle.get("glider_mission_name"));
        setGliderEngFileopenTime((String) particle.get("glider_eng_fileopen_time"));
    }

    public String getGliderEngFilename() {
        return gliderEngFilename;
    }

    public void setGliderEngFilename(String gliderEngFilename) {
        this.gliderEngFilename = gliderEngFilename;
    }
    public String getGliderMissionName() {
        return gliderMissionName;
    }

    public void setGliderMissionName(String gliderMissionName) {
        this.gliderMissionName = gliderMissionName;
    }
    public String getGliderEngFileopenTime() {
        return gliderEngFileopenTime;
    }

    public void setGliderEngFileopenTime(String gliderEngFileopenTime) {
        this.gliderEngFileopenTime = gliderEngFileopenTime;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}