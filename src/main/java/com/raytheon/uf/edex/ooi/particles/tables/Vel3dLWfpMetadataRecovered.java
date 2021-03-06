package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_l_wfp_metadata_recovered")
public class Vel3dLWfpMetadataRecovered extends CassandraParticle {

    @Column(value = "vel3d_l_serial_number")
    private long vel3dLSerialNumber;

    @Column(value = "vel3d_l_number_of_records")
    private int vel3dLNumberOfRecords;

    @Column(value = "vel3d_l_time_on")
    private long vel3dLTimeOn;

    @Column(value = "vel3d_l_time_off")
    private long vel3dLTimeOff;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setVel3dLSerialNumber((long) particle.get("vel3d_l_serial_number"));
        setVel3dLNumberOfRecords((int) particle.get("vel3d_l_number_of_records"));
        setVel3dLTimeOn((long) particle.get("vel3d_l_time_on"));
        setVel3dLTimeOff((long) particle.get("vel3d_l_time_off"));
    }

    public long getVel3dLSerialNumber() {
        return vel3dLSerialNumber;
    }

    public void setVel3dLSerialNumber(long vel3dLSerialNumber) {
        this.vel3dLSerialNumber = vel3dLSerialNumber;
    }
    public int getVel3dLNumberOfRecords() {
        return vel3dLNumberOfRecords;
    }

    public void setVel3dLNumberOfRecords(int vel3dLNumberOfRecords) {
        this.vel3dLNumberOfRecords = vel3dLNumberOfRecords;
    }
    public long getVel3dLTimeOn() {
        return vel3dLTimeOn;
    }

    public void setVel3dLTimeOn(long vel3dLTimeOn) {
        this.vel3dLTimeOn = vel3dLTimeOn;
    }
    public long getVel3dLTimeOff() {
        return vel3dLTimeOff;
    }

    public void setVel3dLTimeOff(long vel3dLTimeOff) {
        this.vel3dLTimeOff = vel3dLTimeOff;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}