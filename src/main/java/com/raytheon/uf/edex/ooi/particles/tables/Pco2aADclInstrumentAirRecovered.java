package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "pco2a_a_dcl_instrument_air_recovered")
public class Pco2aADclInstrumentAirRecovered extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "zero_a2d")
    private int zeroA2d;

    @Column(value = "current_a2d")
    private int currentA2d;

    @Column(value = "measured_air_co2")
    private float measuredAirCo2;

    @Column(value = "avg_irga_temperature")
    private float avgIrgaTemperature;

    @Column(value = "humidity")
    private float humidity;

    @Column(value = "humidity_temperature")
    private float humidityTemperature;

    @Column(value = "gas_stream_pressure")
    private int gasStreamPressure;

    @Column(value = "irga_detector_temperature")
    private float irgaDetectorTemperature;

    @Column(value = "irga_source_temperature")
    private float irgaSourceTemperature;

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setZeroA2d((int) particle.get("zero_a2d"));
        setCurrentA2d((int) particle.get("current_a2d"));
        setMeasuredAirCo2((float) particle.get("measured_air_co2"));
        setAvgIrgaTemperature((float) particle.get("avg_irga_temperature"));
        setHumidity((float) particle.get("humidity"));
        setHumidityTemperature((float) particle.get("humidity_temperature"));
        setGasStreamPressure((int) particle.get("gas_stream_pressure"));
        setIrgaDetectorTemperature((float) particle.get("irga_detector_temperature"));
        setIrgaSourceTemperature((float) particle.get("irga_source_temperature"));
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public int getZeroA2d() {
        return zeroA2d;
    }

    public void setZeroA2d(int zeroA2d) {
        this.zeroA2d = zeroA2d;
    }
    public int getCurrentA2d() {
        return currentA2d;
    }

    public void setCurrentA2d(int currentA2d) {
        this.currentA2d = currentA2d;
    }
    public float getMeasuredAirCo2() {
        return measuredAirCo2;
    }

    public void setMeasuredAirCo2(float measuredAirCo2) {
        this.measuredAirCo2 = measuredAirCo2;
    }
    public float getAvgIrgaTemperature() {
        return avgIrgaTemperature;
    }

    public void setAvgIrgaTemperature(float avgIrgaTemperature) {
        this.avgIrgaTemperature = avgIrgaTemperature;
    }
    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public float getHumidityTemperature() {
        return humidityTemperature;
    }

    public void setHumidityTemperature(float humidityTemperature) {
        this.humidityTemperature = humidityTemperature;
    }
    public int getGasStreamPressure() {
        return gasStreamPressure;
    }

    public void setGasStreamPressure(int gasStreamPressure) {
        this.gasStreamPressure = gasStreamPressure;
    }
    public float getIrgaDetectorTemperature() {
        return irgaDetectorTemperature;
    }

    public void setIrgaDetectorTemperature(float irgaDetectorTemperature) {
        this.irgaDetectorTemperature = irgaDetectorTemperature;
    }
    public float getIrgaSourceTemperature() {
        return irgaSourceTemperature;
    }

    public void setIrgaSourceTemperature(float irgaSourceTemperature) {
        this.irgaSourceTemperature = irgaSourceTemperature;
    }
    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}