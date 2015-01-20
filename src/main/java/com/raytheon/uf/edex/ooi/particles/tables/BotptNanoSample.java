package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "botpt_nano_sample")
public class BotptNanoSample extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "sensor_id")
    private String sensorId;

    @Column(value = "time_sync_flag")
    private String timeSyncFlag;

    @Column(value = "bottom_pressure")
    private float bottomPressure;

    @Column(value = "press_trans_temp")
    private double pressTransTemp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setSensorId((String) particle.get("sensor_id"));
        setTimeSyncFlag((String) particle.get("time_sync_flag"));
        setBottomPressure((float) particle.get("bottom_pressure"));
        setPressTransTemp((double) particle.get("press_trans_temp"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }
    public String getTimeSyncFlag() {
        return timeSyncFlag;
    }

    public void setTimeSyncFlag(String timeSyncFlag) {
        this.timeSyncFlag = timeSyncFlag;
    }
    public float getBottomPressure() {
        return bottomPressure;
    }

    public void setBottomPressure(float bottomPressure) {
        this.bottomPressure = bottomPressure;
    }
    public double getPressTransTemp() {
        return pressTransTemp;
    }

    public void setPressTransTemp(double pressTransTemp) {
        this.pressTransTemp = pressTransTemp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}