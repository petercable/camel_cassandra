package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "massp_turbo_status")
public class MasspTurboStatus extends CassandraParticle {

    @Column(value = "massp_turbo_drive_current")
    private int masspTurboDriveCurrent;

    @Column(value = "massp_turbo_drive_voltage")
    private int masspTurboDriveVoltage;

    @Column(value = "massp_turbo_bearing_temperature")
    private int masspTurboBearingTemperature;

    @Column(value = "massp_turbo_motor_temperature")
    private int masspTurboMotorTemperature;

    @Column(value = "massp_turbo_rotation_speed")
    private int masspTurboRotationSpeed;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMasspTurboDriveCurrent((int) particle.get("massp_turbo_drive_current"));
        setMasspTurboDriveVoltage((int) particle.get("massp_turbo_drive_voltage"));
        setMasspTurboBearingTemperature((int) particle.get("massp_turbo_bearing_temperature"));
        setMasspTurboMotorTemperature((int) particle.get("massp_turbo_motor_temperature"));
        setMasspTurboRotationSpeed((int) particle.get("massp_turbo_rotation_speed"));
    }

    public int getMasspTurboDriveCurrent() {
        return masspTurboDriveCurrent;
    }

    public void setMasspTurboDriveCurrent(int masspTurboDriveCurrent) {
        this.masspTurboDriveCurrent = masspTurboDriveCurrent;
    }
    public int getMasspTurboDriveVoltage() {
        return masspTurboDriveVoltage;
    }

    public void setMasspTurboDriveVoltage(int masspTurboDriveVoltage) {
        this.masspTurboDriveVoltage = masspTurboDriveVoltage;
    }
    public int getMasspTurboBearingTemperature() {
        return masspTurboBearingTemperature;
    }

    public void setMasspTurboBearingTemperature(int masspTurboBearingTemperature) {
        this.masspTurboBearingTemperature = masspTurboBearingTemperature;
    }
    public int getMasspTurboMotorTemperature() {
        return masspTurboMotorTemperature;
    }

    public void setMasspTurboMotorTemperature(int masspTurboMotorTemperature) {
        this.masspTurboMotorTemperature = masspTurboMotorTemperature;
    }
    public int getMasspTurboRotationSpeed() {
        return masspTurboRotationSpeed;
    }

    public void setMasspTurboRotationSpeed(int masspTurboRotationSpeed) {
        this.masspTurboRotationSpeed = masspTurboRotationSpeed;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}