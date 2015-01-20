package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "botpt_heat_sample")
public class BotptHeatSample extends CassandraParticle {

    @Column(value = "sensor_id")
    private String sensorId;

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "heat_x_tilt")
    private int heatXTilt;

    @Column(value = "heat_y_tilt")
    private int heatYTilt;

    @Column(value = "heat_temp")
    private int heatTemp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setSensorId((String) particle.get("sensor_id"));
        setDateTimeString((String) particle.get("date_time_string"));
        setHeatXTilt((int) particle.get("heat_x_tilt"));
        setHeatYTilt((int) particle.get("heat_y_tilt"));
        setHeatTemp((int) particle.get("heat_temp"));
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }
    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public int getHeatXTilt() {
        return heatXTilt;
    }

    public void setHeatXTilt(int heatXTilt) {
        this.heatXTilt = heatXTilt;
    }
    public int getHeatYTilt() {
        return heatYTilt;
    }

    public void setHeatYTilt(int heatYTilt) {
        this.heatYTilt = heatYTilt;
    }
    public int getHeatTemp() {
        return heatTemp;
    }

    public void setHeatTemp(int heatTemp) {
        this.heatTemp = heatTemp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}