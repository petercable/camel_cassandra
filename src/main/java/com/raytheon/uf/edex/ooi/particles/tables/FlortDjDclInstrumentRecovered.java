package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flort_dj_dcl_instrument_recovered")
public class FlortDjDclInstrumentRecovered extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "date_string")
    private String dateString;

    @Column(value = "time_string")
    private String timeString;

    @Column(value = "measurement_wavelength_beta")
    private int measurementWavelengthBeta;

    @Column(value = "raw_signal_beta")
    private int rawSignalBeta;

    @Column(value = "measurement_wavelength_chl")
    private int measurementWavelengthChl;

    @Column(value = "raw_signal_chl")
    private int rawSignalChl;

    @Column(value = "measurement_wavelength_cdom")
    private int measurementWavelengthCdom;

    @Column(value = "raw_signal_cdom")
    private int rawSignalCdom;

    @Column(value = "raw_internal_temp")
    private int rawInternalTemp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setDateString((String) particle.get("date_string"));
        setTimeString((String) particle.get("time_string"));
        setMeasurementWavelengthBeta((int) particle.get("measurement_wavelength_beta"));
        setRawSignalBeta((int) particle.get("raw_signal_beta"));
        setMeasurementWavelengthChl((int) particle.get("measurement_wavelength_chl"));
        setRawSignalChl((int) particle.get("raw_signal_chl"));
        setMeasurementWavelengthCdom((int) particle.get("measurement_wavelength_cdom"));
        setRawSignalCdom((int) particle.get("raw_signal_cdom"));
        setRawInternalTemp((int) particle.get("raw_internal_temp"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }
    public int getMeasurementWavelengthBeta() {
        return measurementWavelengthBeta;
    }

    public void setMeasurementWavelengthBeta(int measurementWavelengthBeta) {
        this.measurementWavelengthBeta = measurementWavelengthBeta;
    }
    public int getRawSignalBeta() {
        return rawSignalBeta;
    }

    public void setRawSignalBeta(int rawSignalBeta) {
        this.rawSignalBeta = rawSignalBeta;
    }
    public int getMeasurementWavelengthChl() {
        return measurementWavelengthChl;
    }

    public void setMeasurementWavelengthChl(int measurementWavelengthChl) {
        this.measurementWavelengthChl = measurementWavelengthChl;
    }
    public int getRawSignalChl() {
        return rawSignalChl;
    }

    public void setRawSignalChl(int rawSignalChl) {
        this.rawSignalChl = rawSignalChl;
    }
    public int getMeasurementWavelengthCdom() {
        return measurementWavelengthCdom;
    }

    public void setMeasurementWavelengthCdom(int measurementWavelengthCdom) {
        this.measurementWavelengthCdom = measurementWavelengthCdom;
    }
    public int getRawSignalCdom() {
        return rawSignalCdom;
    }

    public void setRawSignalCdom(int rawSignalCdom) {
        this.rawSignalCdom = rawSignalCdom;
    }
    public int getRawInternalTemp() {
        return rawInternalTemp;
    }

    public void setRawInternalTemp(int rawInternalTemp) {
        this.rawInternalTemp = rawInternalTemp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}