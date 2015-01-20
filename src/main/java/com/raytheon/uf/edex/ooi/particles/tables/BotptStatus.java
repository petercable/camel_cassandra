package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "botpt_status")
public class BotptStatus extends CassandraParticle {

    @Column(value = "botpt_iris_status_01")
    private String botptIrisStatus01;

    @Column(value = "botpt_iris_status_02")
    private String botptIrisStatus02;

    @Column(value = "botpt_lily_status_01")
    private String botptLilyStatus01;

    @Column(value = "botpt_lily_status_02")
    private String botptLilyStatus02;

    @Column(value = "botpt_nano_status")
    private String botptNanoStatus;

    @Column(value = "botpt_syst_status")
    private String botptSystStatus;

    @Column(value = "sensor_id")
    private String sensorId;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setBotptIrisStatus01((String) particle.get("botpt_iris_status_01"));
        setBotptIrisStatus02((String) particle.get("botpt_iris_status_02"));
        setBotptLilyStatus01((String) particle.get("botpt_lily_status_01"));
        setBotptLilyStatus02((String) particle.get("botpt_lily_status_02"));
        setBotptNanoStatus((String) particle.get("botpt_nano_status"));
        setBotptSystStatus((String) particle.get("botpt_syst_status"));
        setSensorId((String) particle.get("sensor_id"));
    }

    public String getBotptIrisStatus01() {
        return botptIrisStatus01;
    }

    public void setBotptIrisStatus01(String botptIrisStatus01) {
        this.botptIrisStatus01 = botptIrisStatus01;
    }
    public String getBotptIrisStatus02() {
        return botptIrisStatus02;
    }

    public void setBotptIrisStatus02(String botptIrisStatus02) {
        this.botptIrisStatus02 = botptIrisStatus02;
    }
    public String getBotptLilyStatus01() {
        return botptLilyStatus01;
    }

    public void setBotptLilyStatus01(String botptLilyStatus01) {
        this.botptLilyStatus01 = botptLilyStatus01;
    }
    public String getBotptLilyStatus02() {
        return botptLilyStatus02;
    }

    public void setBotptLilyStatus02(String botptLilyStatus02) {
        this.botptLilyStatus02 = botptLilyStatus02;
    }
    public String getBotptNanoStatus() {
        return botptNanoStatus;
    }

    public void setBotptNanoStatus(String botptNanoStatus) {
        this.botptNanoStatus = botptNanoStatus;
    }
    public String getBotptSystStatus() {
        return botptSystStatus;
    }

    public void setBotptSystStatus(String botptSystStatus) {
        this.botptSystStatus = botptSystStatus;
    }
    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}