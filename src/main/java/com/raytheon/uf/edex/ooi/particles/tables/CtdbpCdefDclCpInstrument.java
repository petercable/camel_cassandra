package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "ctdbp_cdef_dcl_cp_instrument")
public class CtdbpCdefDclCpInstrument extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "temp")
    private float temp;

    @Column(value = "conductivity")
    private float conductivity;

    @Column(value = "pressure")
    private float pressure;

    @Column(value = "date_time_string")
    private String dateTimeString;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setTemp((float) particle.get("temp"));
        setConductivity((float) particle.get("conductivity"));
        setPressure((float) particle.get("pressure"));
        setDateTimeString((String) particle.get("date_time_string"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    public float getConductivity() {
        return conductivity;
    }

    public void setConductivity(float conductivity) {
        this.conductivity = conductivity;
    }
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}