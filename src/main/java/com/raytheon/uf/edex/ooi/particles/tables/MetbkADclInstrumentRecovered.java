package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "metbk_a_dcl_instrument_recovered")
public class MetbkADclInstrumentRecovered extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "barometric_pressure")
    private float barometricPressure;

    @Column(value = "relative_humidity")
    private float relativeHumidity;

    @Column(value = "air_temperature")
    private float airTemperature;

    @Column(value = "longwave_irradiance")
    private float longwaveIrradiance;

    @Column(value = "precipitation")
    private float precipitation;

    @Column(value = "sea_surface_temperature")
    private float seaSurfaceTemperature;

    @Column(value = "sea_surface_conductivity")
    private float seaSurfaceConductivity;

    @Column(value = "shortwave_irradiance")
    private float shortwaveIrradiance;

    @Column(value = "eastward_wind_velocity")
    private float eastwardWindVelocity;

    @Column(value = "northward_wind_velocity")
    private float northwardWindVelocity;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setBarometricPressure((float) particle.get("barometric_pressure"));
        setRelativeHumidity((float) particle.get("relative_humidity"));
        setAirTemperature((float) particle.get("air_temperature"));
        setLongwaveIrradiance((float) particle.get("longwave_irradiance"));
        setPrecipitation((float) particle.get("precipitation"));
        setSeaSurfaceTemperature((float) particle.get("sea_surface_temperature"));
        setSeaSurfaceConductivity((float) particle.get("sea_surface_conductivity"));
        setShortwaveIrradiance((float) particle.get("shortwave_irradiance"));
        setEastwardWindVelocity((float) particle.get("eastward_wind_velocity"));
        setNorthwardWindVelocity((float) particle.get("northward_wind_velocity"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public float getBarometricPressure() {
        return barometricPressure;
    }

    public void setBarometricPressure(float barometricPressure) {
        this.barometricPressure = barometricPressure;
    }
    public float getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(float relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }
    public float getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(float airTemperature) {
        this.airTemperature = airTemperature;
    }
    public float getLongwaveIrradiance() {
        return longwaveIrradiance;
    }

    public void setLongwaveIrradiance(float longwaveIrradiance) {
        this.longwaveIrradiance = longwaveIrradiance;
    }
    public float getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(float precipitation) {
        this.precipitation = precipitation;
    }
    public float getSeaSurfaceTemperature() {
        return seaSurfaceTemperature;
    }

    public void setSeaSurfaceTemperature(float seaSurfaceTemperature) {
        this.seaSurfaceTemperature = seaSurfaceTemperature;
    }
    public float getSeaSurfaceConductivity() {
        return seaSurfaceConductivity;
    }

    public void setSeaSurfaceConductivity(float seaSurfaceConductivity) {
        this.seaSurfaceConductivity = seaSurfaceConductivity;
    }
    public float getShortwaveIrradiance() {
        return shortwaveIrradiance;
    }

    public void setShortwaveIrradiance(float shortwaveIrradiance) {
        this.shortwaveIrradiance = shortwaveIrradiance;
    }
    public float getEastwardWindVelocity() {
        return eastwardWindVelocity;
    }

    public void setEastwardWindVelocity(float eastwardWindVelocity) {
        this.eastwardWindVelocity = eastwardWindVelocity;
    }
    public float getNorthwardWindVelocity() {
        return northwardWindVelocity;
    }

    public void setNorthwardWindVelocity(float northwardWindVelocity) {
        this.northwardWindVelocity = northwardWindVelocity;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}