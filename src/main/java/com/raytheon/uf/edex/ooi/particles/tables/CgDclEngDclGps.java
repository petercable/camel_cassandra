package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_gps")
public class CgDclEngDclGps extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "message_sent_timestamp")
    private String messageSentTimestamp;

    @Column(value = "latitude")
    private float latitude;

    @Column(value = "longitude")
    private float longitude;

    @Column(value = "gps_speed")
    private float gpsSpeed;

    @Column(value = "gps_true_course")
    private float gpsTrueCourse;

    @Column(value = "gps_quality")
    private int gpsQuality;

    @Column(value = "gps_num_satellites")
    private int gpsNumSatellites;

    @Column(value = "gps_hdop")
    private float gpsHdop;

    @Column(value = "gps_altitude")
    private float gpsAltitude;

    @Column(value = "date_of_fix")
    private String dateOfFix;

    @Column(value = "time_of_fix")
    private String timeOfFix;

    @Column(value = "latitude_alt_format")
    private String latitudeAltFormat;

    @Column(value = "longitude_alt_format")
    private String longitudeAltFormat;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setMessageSentTimestamp((String) particle.get("message_sent_timestamp"));
        setLatitude((float) particle.get("latitude"));
        setLongitude((float) particle.get("longitude"));
        setGpsSpeed((float) particle.get("gps_speed"));
        setGpsTrueCourse((float) particle.get("gps_true_course"));
        setGpsQuality((int) particle.get("gps_quality"));
        setGpsNumSatellites((int) particle.get("gps_num_satellites"));
        setGpsHdop((float) particle.get("gps_hdop"));
        setGpsAltitude((float) particle.get("gps_altitude"));
        setDateOfFix((String) particle.get("date_of_fix"));
        setTimeOfFix((String) particle.get("time_of_fix"));
        setLatitudeAltFormat((String) particle.get("latitude_alt_format"));
        setLongitudeAltFormat((String) particle.get("longitude_alt_format"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public String getMessageSentTimestamp() {
        return messageSentTimestamp;
    }

    public void setMessageSentTimestamp(String messageSentTimestamp) {
        this.messageSentTimestamp = messageSentTimestamp;
    }
    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    public float getGpsSpeed() {
        return gpsSpeed;
    }

    public void setGpsSpeed(float gpsSpeed) {
        this.gpsSpeed = gpsSpeed;
    }
    public float getGpsTrueCourse() {
        return gpsTrueCourse;
    }

    public void setGpsTrueCourse(float gpsTrueCourse) {
        this.gpsTrueCourse = gpsTrueCourse;
    }
    public int getGpsQuality() {
        return gpsQuality;
    }

    public void setGpsQuality(int gpsQuality) {
        this.gpsQuality = gpsQuality;
    }
    public int getGpsNumSatellites() {
        return gpsNumSatellites;
    }

    public void setGpsNumSatellites(int gpsNumSatellites) {
        this.gpsNumSatellites = gpsNumSatellites;
    }
    public float getGpsHdop() {
        return gpsHdop;
    }

    public void setGpsHdop(float gpsHdop) {
        this.gpsHdop = gpsHdop;
    }
    public float getGpsAltitude() {
        return gpsAltitude;
    }

    public void setGpsAltitude(float gpsAltitude) {
        this.gpsAltitude = gpsAltitude;
    }
    public String getDateOfFix() {
        return dateOfFix;
    }

    public void setDateOfFix(String dateOfFix) {
        this.dateOfFix = dateOfFix;
    }
    public String getTimeOfFix() {
        return timeOfFix;
    }

    public void setTimeOfFix(String timeOfFix) {
        this.timeOfFix = timeOfFix;
    }
    public String getLatitudeAltFormat() {
        return latitudeAltFormat;
    }

    public void setLatitudeAltFormat(String latitudeAltFormat) {
        this.latitudeAltFormat = latitudeAltFormat;
    }
    public String getLongitudeAltFormat() {
        return longitudeAltFormat;
    }

    public void setLongitudeAltFormat(String longitudeAltFormat) {
        this.longitudeAltFormat = longitudeAltFormat;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}