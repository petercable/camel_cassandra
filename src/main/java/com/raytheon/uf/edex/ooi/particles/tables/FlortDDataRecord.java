package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "flort_d_data_record")
public class FlortDDataRecord extends CassandraParticle {

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

    @Column(value = "signal_1_scale_factor")
    private float signal1ScaleFactor;

    @Column(value = "signal_1_offset")
    private int signal1Offset;

    @Column(value = "signal_2_scale_factor")
    private float signal2ScaleFactor;

    @Column(value = "signal_2_offset")
    private int signal2Offset;

    @Column(value = "signal_3_scale_factor")
    private float signal3ScaleFactor;

    @Column(value = "signal_3_offset")
    private int signal3Offset;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateString((String) particle.get("date_string"));
        setTimeString((String) particle.get("time_string"));
        setMeasurementWavelengthBeta((int) particle.get("measurement_wavelength_beta"));
        setRawSignalBeta((int) particle.get("raw_signal_beta"));
        setMeasurementWavelengthChl((int) particle.get("measurement_wavelength_chl"));
        setRawSignalChl((int) particle.get("raw_signal_chl"));
        setMeasurementWavelengthCdom((int) particle.get("measurement_wavelength_cdom"));
        setRawSignalCdom((int) particle.get("raw_signal_cdom"));
        setRawInternalTemp((int) particle.get("raw_internal_temp"));
        setSignal1ScaleFactor((float) particle.get("signal_1_scale_factor"));
        setSignal1Offset((int) particle.get("signal_1_offset"));
        setSignal2ScaleFactor((float) particle.get("signal_2_scale_factor"));
        setSignal2Offset((int) particle.get("signal_2_offset"));
        setSignal3ScaleFactor((float) particle.get("signal_3_scale_factor"));
        setSignal3Offset((int) particle.get("signal_3_offset"));
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
    public float getSignal1ScaleFactor() {
        return signal1ScaleFactor;
    }

    public void setSignal1ScaleFactor(float signal1ScaleFactor) {
        this.signal1ScaleFactor = signal1ScaleFactor;
    }
    public int getSignal1Offset() {
        return signal1Offset;
    }

    public void setSignal1Offset(int signal1Offset) {
        this.signal1Offset = signal1Offset;
    }
    public float getSignal2ScaleFactor() {
        return signal2ScaleFactor;
    }

    public void setSignal2ScaleFactor(float signal2ScaleFactor) {
        this.signal2ScaleFactor = signal2ScaleFactor;
    }
    public int getSignal2Offset() {
        return signal2Offset;
    }

    public void setSignal2Offset(int signal2Offset) {
        this.signal2Offset = signal2Offset;
    }
    public float getSignal3ScaleFactor() {
        return signal3ScaleFactor;
    }

    public void setSignal3ScaleFactor(float signal3ScaleFactor) {
        this.signal3ScaleFactor = signal3ScaleFactor;
    }
    public int getSignal3Offset() {
        return signal3Offset;
    }

    public void setSignal3Offset(int signal3Offset) {
        this.signal3Offset = signal3Offset;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}