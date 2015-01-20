package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcps_jln_stc_instrument")
public class AdcpsJlnStcInstrument extends CassandraParticle {

    @Column(value = "adcps_jln_record")
    private BigInteger adcpsJlnRecord;

    @Column(value = "adcps_jln_number")
    private long adcpsJlnNumber;

    @Column(value = "adcps_jln_unit_id")
    private int adcpsJlnUnitId;

    @Column(value = "adcps_jln_fw_vers")
    private int adcpsJlnFwVers;

    @Column(value = "adcps_jln_fw_rev")
    private int adcpsJlnFwRev;

    @Column(value = "adcps_jln_year")
    private int adcpsJlnYear;

    @Column(value = "adcps_jln_month")
    private int adcpsJlnMonth;

    @Column(value = "adcps_jln_day")
    private int adcpsJlnDay;

    @Column(value = "adcps_jln_hour")
    private int adcpsJlnHour;

    @Column(value = "adcps_jln_minute")
    private int adcpsJlnMinute;

    @Column(value = "adcps_jln_second")
    private int adcpsJlnSecond;

    @Column(value = "adcps_jln_hsec")
    private int adcpsJlnHsec;

    @Column(value = "adcps_jln_heading")
    private int adcpsJlnHeading;

    @Column(value = "adcps_jln_pitch")
    private int adcpsJlnPitch;

    @Column(value = "adcps_jln_roll")
    private int adcpsJlnRoll;

    @Column(value = "adcps_jln_temp")
    private int adcpsJlnTemp;

    @Column(value = "adcps_jln_pressure")
    private int adcpsJlnPressure;

    @Column(value = "adcps_jln_startbin")
    private int adcpsJlnStartbin;

    @Column(value = "adcps_jln_bins")
    private int adcpsJlnBins;

    @Column(value = "error_velocity")
    private List<Integer> errorVelocity;

    @Column(value = "error_velocity_dims")
    private int errorVelocityDims;

    @Column(value = "error_velocity_sizes")
    private List<Long> errorVelocitySizes;

    @Column(value = "water_velocity_up")
    private List<Integer> waterVelocityUp;

    @Column(value = "water_velocity_up_dims")
    private int waterVelocityUpDims;

    @Column(value = "water_velocity_up_sizes")
    private List<Long> waterVelocityUpSizes;

    @Column(value = "water_velocity_north")
    private List<Integer> waterVelocityNorth;

    @Column(value = "water_velocity_north_dims")
    private int waterVelocityNorthDims;

    @Column(value = "water_velocity_north_sizes")
    private List<Long> waterVelocityNorthSizes;

    @Column(value = "water_velocity_east")
    private List<Integer> waterVelocityEast;

    @Column(value = "water_velocity_east_dims")
    private int waterVelocityEastDims;

    @Column(value = "water_velocity_east_sizes")
    private List<Long> waterVelocityEastSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setAdcpsJlnRecord((BigInteger) particle.get("adcps_jln_record"));
        setAdcpsJlnNumber((long) particle.get("adcps_jln_number"));
        setAdcpsJlnUnitId((int) particle.get("adcps_jln_unit_id"));
        setAdcpsJlnFwVers((int) particle.get("adcps_jln_fw_vers"));
        setAdcpsJlnFwRev((int) particle.get("adcps_jln_fw_rev"));
        setAdcpsJlnYear((int) particle.get("adcps_jln_year"));
        setAdcpsJlnMonth((int) particle.get("adcps_jln_month"));
        setAdcpsJlnDay((int) particle.get("adcps_jln_day"));
        setAdcpsJlnHour((int) particle.get("adcps_jln_hour"));
        setAdcpsJlnMinute((int) particle.get("adcps_jln_minute"));
        setAdcpsJlnSecond((int) particle.get("adcps_jln_second"));
        setAdcpsJlnHsec((int) particle.get("adcps_jln_hsec"));
        setAdcpsJlnHeading((int) particle.get("adcps_jln_heading"));
        setAdcpsJlnPitch((int) particle.get("adcps_jln_pitch"));
        setAdcpsJlnRoll((int) particle.get("adcps_jln_roll"));
        setAdcpsJlnTemp((int) particle.get("adcps_jln_temp"));
        setAdcpsJlnPressure((int) particle.get("adcps_jln_pressure"));
        setAdcpsJlnStartbin((int) particle.get("adcps_jln_startbin"));
        setAdcpsJlnBins((int) particle.get("adcps_jln_bins"));
        setErrorVelocity((List<Integer>) particle.get("error_velocity"));
        setErrorVelocityDims((int) particle.get("error_velocity_dims"));
        setErrorVelocitySizes((List<Long>) particle.get("error_velocity_sizes"));
        setWaterVelocityUp((List<Integer>) particle.get("water_velocity_up"));
        setWaterVelocityUpDims((int) particle.get("water_velocity_up_dims"));
        setWaterVelocityUpSizes((List<Long>) particle.get("water_velocity_up_sizes"));
        setWaterVelocityNorth((List<Integer>) particle.get("water_velocity_north"));
        setWaterVelocityNorthDims((int) particle.get("water_velocity_north_dims"));
        setWaterVelocityNorthSizes((List<Long>) particle.get("water_velocity_north_sizes"));
        setWaterVelocityEast((List<Integer>) particle.get("water_velocity_east"));
        setWaterVelocityEastDims((int) particle.get("water_velocity_east_dims"));
        setWaterVelocityEastSizes((List<Long>) particle.get("water_velocity_east_sizes"));
    }

    public BigInteger getAdcpsJlnRecord() {
        return adcpsJlnRecord;
    }

    public void setAdcpsJlnRecord(BigInteger adcpsJlnRecord) {
        this.adcpsJlnRecord = adcpsJlnRecord;
    }
    public long getAdcpsJlnNumber() {
        return adcpsJlnNumber;
    }

    public void setAdcpsJlnNumber(long adcpsJlnNumber) {
        this.adcpsJlnNumber = adcpsJlnNumber;
    }
    public int getAdcpsJlnUnitId() {
        return adcpsJlnUnitId;
    }

    public void setAdcpsJlnUnitId(int adcpsJlnUnitId) {
        this.adcpsJlnUnitId = adcpsJlnUnitId;
    }
    public int getAdcpsJlnFwVers() {
        return adcpsJlnFwVers;
    }

    public void setAdcpsJlnFwVers(int adcpsJlnFwVers) {
        this.adcpsJlnFwVers = adcpsJlnFwVers;
    }
    public int getAdcpsJlnFwRev() {
        return adcpsJlnFwRev;
    }

    public void setAdcpsJlnFwRev(int adcpsJlnFwRev) {
        this.adcpsJlnFwRev = adcpsJlnFwRev;
    }
    public int getAdcpsJlnYear() {
        return adcpsJlnYear;
    }

    public void setAdcpsJlnYear(int adcpsJlnYear) {
        this.adcpsJlnYear = adcpsJlnYear;
    }
    public int getAdcpsJlnMonth() {
        return adcpsJlnMonth;
    }

    public void setAdcpsJlnMonth(int adcpsJlnMonth) {
        this.adcpsJlnMonth = adcpsJlnMonth;
    }
    public int getAdcpsJlnDay() {
        return adcpsJlnDay;
    }

    public void setAdcpsJlnDay(int adcpsJlnDay) {
        this.adcpsJlnDay = adcpsJlnDay;
    }
    public int getAdcpsJlnHour() {
        return adcpsJlnHour;
    }

    public void setAdcpsJlnHour(int adcpsJlnHour) {
        this.adcpsJlnHour = adcpsJlnHour;
    }
    public int getAdcpsJlnMinute() {
        return adcpsJlnMinute;
    }

    public void setAdcpsJlnMinute(int adcpsJlnMinute) {
        this.adcpsJlnMinute = adcpsJlnMinute;
    }
    public int getAdcpsJlnSecond() {
        return adcpsJlnSecond;
    }

    public void setAdcpsJlnSecond(int adcpsJlnSecond) {
        this.adcpsJlnSecond = adcpsJlnSecond;
    }
    public int getAdcpsJlnHsec() {
        return adcpsJlnHsec;
    }

    public void setAdcpsJlnHsec(int adcpsJlnHsec) {
        this.adcpsJlnHsec = adcpsJlnHsec;
    }
    public int getAdcpsJlnHeading() {
        return adcpsJlnHeading;
    }

    public void setAdcpsJlnHeading(int adcpsJlnHeading) {
        this.adcpsJlnHeading = adcpsJlnHeading;
    }
    public int getAdcpsJlnPitch() {
        return adcpsJlnPitch;
    }

    public void setAdcpsJlnPitch(int adcpsJlnPitch) {
        this.adcpsJlnPitch = adcpsJlnPitch;
    }
    public int getAdcpsJlnRoll() {
        return adcpsJlnRoll;
    }

    public void setAdcpsJlnRoll(int adcpsJlnRoll) {
        this.adcpsJlnRoll = adcpsJlnRoll;
    }
    public int getAdcpsJlnTemp() {
        return adcpsJlnTemp;
    }

    public void setAdcpsJlnTemp(int adcpsJlnTemp) {
        this.adcpsJlnTemp = adcpsJlnTemp;
    }
    public int getAdcpsJlnPressure() {
        return adcpsJlnPressure;
    }

    public void setAdcpsJlnPressure(int adcpsJlnPressure) {
        this.adcpsJlnPressure = adcpsJlnPressure;
    }
    public int getAdcpsJlnStartbin() {
        return adcpsJlnStartbin;
    }

    public void setAdcpsJlnStartbin(int adcpsJlnStartbin) {
        this.adcpsJlnStartbin = adcpsJlnStartbin;
    }
    public int getAdcpsJlnBins() {
        return adcpsJlnBins;
    }

    public void setAdcpsJlnBins(int adcpsJlnBins) {
        this.adcpsJlnBins = adcpsJlnBins;
    }
    public List<Integer> getErrorVelocity() {
        // TODO - restore original dimensions, (remove fill values?)
        return errorVelocity;
    }

    public void setErrorVelocity(List<Integer> errorVelocity) {
        // TODO - flatten for storage, insert fill values
        this.errorVelocity = errorVelocity;
    }
    public int getErrorVelocityDims() {
        return errorVelocityDims;
    }

    public void setErrorVelocityDims(int errorVelocityDims) {
        this.errorVelocityDims = errorVelocityDims;
    }
    public List<Long> getErrorVelocitySizes() {
        return errorVelocitySizes;
    }

    public void setErrorVelocitySizes(List<Long> errorVelocitySizes) {
        this.errorVelocitySizes = errorVelocitySizes;
    }
    public List<Integer> getWaterVelocityUp() {
        // TODO - restore original dimensions, (remove fill values?)
        return waterVelocityUp;
    }

    public void setWaterVelocityUp(List<Integer> waterVelocityUp) {
        // TODO - flatten for storage, insert fill values
        this.waterVelocityUp = waterVelocityUp;
    }
    public int getWaterVelocityUpDims() {
        return waterVelocityUpDims;
    }

    public void setWaterVelocityUpDims(int waterVelocityUpDims) {
        this.waterVelocityUpDims = waterVelocityUpDims;
    }
    public List<Long> getWaterVelocityUpSizes() {
        return waterVelocityUpSizes;
    }

    public void setWaterVelocityUpSizes(List<Long> waterVelocityUpSizes) {
        this.waterVelocityUpSizes = waterVelocityUpSizes;
    }
    public List<Integer> getWaterVelocityNorth() {
        // TODO - restore original dimensions, (remove fill values?)
        return waterVelocityNorth;
    }

    public void setWaterVelocityNorth(List<Integer> waterVelocityNorth) {
        // TODO - flatten for storage, insert fill values
        this.waterVelocityNorth = waterVelocityNorth;
    }
    public int getWaterVelocityNorthDims() {
        return waterVelocityNorthDims;
    }

    public void setWaterVelocityNorthDims(int waterVelocityNorthDims) {
        this.waterVelocityNorthDims = waterVelocityNorthDims;
    }
    public List<Long> getWaterVelocityNorthSizes() {
        return waterVelocityNorthSizes;
    }

    public void setWaterVelocityNorthSizes(List<Long> waterVelocityNorthSizes) {
        this.waterVelocityNorthSizes = waterVelocityNorthSizes;
    }
    public List<Integer> getWaterVelocityEast() {
        // TODO - restore original dimensions, (remove fill values?)
        return waterVelocityEast;
    }

    public void setWaterVelocityEast(List<Integer> waterVelocityEast) {
        // TODO - flatten for storage, insert fill values
        this.waterVelocityEast = waterVelocityEast;
    }
    public int getWaterVelocityEastDims() {
        return waterVelocityEastDims;
    }

    public void setWaterVelocityEastDims(int waterVelocityEastDims) {
        this.waterVelocityEastDims = waterVelocityEastDims;
    }
    public List<Long> getWaterVelocityEastSizes() {
        return waterVelocityEastSizes;
    }

    public void setWaterVelocityEastSizes(List<Long> waterVelocityEastSizes) {
        this.waterVelocityEastSizes = waterVelocityEastSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}