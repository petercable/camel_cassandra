package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "botpt_lily_leveling")
public class BotptLilyLeveling extends CassandraParticle {

    @Column(value = "lily_x_tilt")
    private float lilyXTilt;

    @Column(value = "lily_y_tilt")
    private float lilyYTilt;

    @Column(value = "compass_direction")
    private float compassDirection;

    @Column(value = "lily_temp")
    private float lilyTemp;

    @Column(value = "supply_voltage")
    private float supplyVoltage;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "lily_leveling_status")
    private String lilyLevelingStatus;

    @Column(value = "sensor_id")
    private String sensorId;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setLilyXTilt((float) particle.get("lily_x_tilt"));
        setLilyYTilt((float) particle.get("lily_y_tilt"));
        setCompassDirection((float) particle.get("compass_direction"));
        setLilyTemp((float) particle.get("lily_temp"));
        setSupplyVoltage((float) particle.get("supply_voltage"));
        setSerialNumber((String) particle.get("serial_number"));
        setLilyLevelingStatus((String) particle.get("lily_leveling_status"));
        setSensorId((String) particle.get("sensor_id"));
    }

    public float getLilyXTilt() {
        return lilyXTilt;
    }

    public void setLilyXTilt(float lilyXTilt) {
        this.lilyXTilt = lilyXTilt;
    }
    public float getLilyYTilt() {
        return lilyYTilt;
    }

    public void setLilyYTilt(float lilyYTilt) {
        this.lilyYTilt = lilyYTilt;
    }
    public float getCompassDirection() {
        return compassDirection;
    }

    public void setCompassDirection(float compassDirection) {
        this.compassDirection = compassDirection;
    }
    public float getLilyTemp() {
        return lilyTemp;
    }

    public void setLilyTemp(float lilyTemp) {
        this.lilyTemp = lilyTemp;
    }
    public float getSupplyVoltage() {
        return supplyVoltage;
    }

    public void setSupplyVoltage(float supplyVoltage) {
        this.supplyVoltage = supplyVoltage;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getLilyLevelingStatus() {
        return lilyLevelingStatus;
    }

    public void setLilyLevelingStatus(String lilyLevelingStatus) {
        this.lilyLevelingStatus = lilyLevelingStatus;
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