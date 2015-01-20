package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcps_parsed")
public class AdcpsParsed extends CassandraParticle {

    @Column(value = "pd12_packet_id")
    private int pd12PacketId;

    @Column(value = "num_bytes")
    private int numBytes;

    @Column(value = "ensemble_number")
    private long ensembleNumber;

    @Column(value = "unit_id")
    private int unitId;

    @Column(value = "firmware_version")
    private int firmwareVersion;

    @Column(value = "firmware_revision")
    private int firmwareRevision;

    @Column(value = "real_time_clock")
    private List<Integer> realTimeClock;

    @Column(value = "real_time_clock_dims")
    private int realTimeClockDims;

    @Column(value = "real_time_clock_sizes")
    private List<Long> realTimeClockSizes;

    @Column(value = "ensemble_start_time")
    private double ensembleStartTime;

    @Column(value = "heading")
    private int heading;

    @Column(value = "pitch")
    private int pitch;

    @Column(value = "roll")
    private int roll;

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "pressure")
    private long pressure;

    @Column(value = "velocity_po_error_flag")
    private int velocityPoErrorFlag;

    @Column(value = "velocity_po_up_flag")
    private int velocityPoUpFlag;

    @Column(value = "velocity_po_north_flag")
    private int velocityPoNorthFlag;

    @Column(value = "velocity_po_east_flag")
    private int velocityPoEastFlag;

    @Column(value = "subsampling_parameter")
    private int subsamplingParameter;

    @Column(value = "start_bin")
    private int startBin;

    @Column(value = "num_bins")
    private int numBins;

    @Column(value = "water_velocity_east")
    private List<Integer> waterVelocityEast;

    @Column(value = "water_velocity_east_dims")
    private int waterVelocityEastDims;

    @Column(value = "water_velocity_east_sizes")
    private List<Long> waterVelocityEastSizes;

    @Column(value = "water_velocity_north")
    private List<Integer> waterVelocityNorth;

    @Column(value = "water_velocity_north_dims")
    private int waterVelocityNorthDims;

    @Column(value = "water_velocity_north_sizes")
    private List<Long> waterVelocityNorthSizes;

    @Column(value = "water_velocity_up")
    private List<Integer> waterVelocityUp;

    @Column(value = "water_velocity_up_dims")
    private int waterVelocityUpDims;

    @Column(value = "water_velocity_up_sizes")
    private List<Long> waterVelocityUpSizes;

    @Column(value = "error_velocity")
    private List<Integer> errorVelocity;

    @Column(value = "error_velocity_dims")
    private int errorVelocityDims;

    @Column(value = "error_velocity_sizes")
    private List<Long> errorVelocitySizes;

    @Column(value = "checksum")
    private int checksum;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setPd12PacketId((int) particle.get("pd12_packet_id"));
        setNumBytes((int) particle.get("num_bytes"));
        setEnsembleNumber((long) particle.get("ensemble_number"));
        setUnitId((int) particle.get("unit_id"));
        setFirmwareVersion((int) particle.get("firmware_version"));
        setFirmwareRevision((int) particle.get("firmware_revision"));
        setRealTimeClock((List<Integer>) particle.get("real_time_clock"));
        setRealTimeClockDims((int) particle.get("real_time_clock_dims"));
        setRealTimeClockSizes((List<Long>) particle.get("real_time_clock_sizes"));
        setEnsembleStartTime((double) particle.get("ensemble_start_time"));
        setHeading((int) particle.get("heading"));
        setPitch((int) particle.get("pitch"));
        setRoll((int) particle.get("roll"));
        setTemperature((int) particle.get("temperature"));
        setPressure((long) particle.get("pressure"));
        setVelocityPoErrorFlag((int) particle.get("velocity_po_error_flag"));
        setVelocityPoUpFlag((int) particle.get("velocity_po_up_flag"));
        setVelocityPoNorthFlag((int) particle.get("velocity_po_north_flag"));
        setVelocityPoEastFlag((int) particle.get("velocity_po_east_flag"));
        setSubsamplingParameter((int) particle.get("subsampling_parameter"));
        setStartBin((int) particle.get("start_bin"));
        setNumBins((int) particle.get("num_bins"));
        setWaterVelocityEast((List<Integer>) particle.get("water_velocity_east"));
        setWaterVelocityEastDims((int) particle.get("water_velocity_east_dims"));
        setWaterVelocityEastSizes((List<Long>) particle.get("water_velocity_east_sizes"));
        setWaterVelocityNorth((List<Integer>) particle.get("water_velocity_north"));
        setWaterVelocityNorthDims((int) particle.get("water_velocity_north_dims"));
        setWaterVelocityNorthSizes((List<Long>) particle.get("water_velocity_north_sizes"));
        setWaterVelocityUp((List<Integer>) particle.get("water_velocity_up"));
        setWaterVelocityUpDims((int) particle.get("water_velocity_up_dims"));
        setWaterVelocityUpSizes((List<Long>) particle.get("water_velocity_up_sizes"));
        setErrorVelocity((List<Integer>) particle.get("error_velocity"));
        setErrorVelocityDims((int) particle.get("error_velocity_dims"));
        setErrorVelocitySizes((List<Long>) particle.get("error_velocity_sizes"));
        setChecksum((int) particle.get("checksum"));
    }

    public int getPd12PacketId() {
        return pd12PacketId;
    }

    public void setPd12PacketId(int pd12PacketId) {
        this.pd12PacketId = pd12PacketId;
    }
    public int getNumBytes() {
        return numBytes;
    }

    public void setNumBytes(int numBytes) {
        this.numBytes = numBytes;
    }
    public long getEnsembleNumber() {
        return ensembleNumber;
    }

    public void setEnsembleNumber(long ensembleNumber) {
        this.ensembleNumber = ensembleNumber;
    }
    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }
    public int getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(int firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public int getFirmwareRevision() {
        return firmwareRevision;
    }

    public void setFirmwareRevision(int firmwareRevision) {
        this.firmwareRevision = firmwareRevision;
    }
    public List<Integer> getRealTimeClock() {
        // TODO - restore original dimensions, (remove fill values?)
        return realTimeClock;
    }

    public void setRealTimeClock(List<Integer> realTimeClock) {
        // TODO - flatten for storage, insert fill values
        this.realTimeClock = realTimeClock;
    }
    public int getRealTimeClockDims() {
        return realTimeClockDims;
    }

    public void setRealTimeClockDims(int realTimeClockDims) {
        this.realTimeClockDims = realTimeClockDims;
    }
    public List<Long> getRealTimeClockSizes() {
        return realTimeClockSizes;
    }

    public void setRealTimeClockSizes(List<Long> realTimeClockSizes) {
        this.realTimeClockSizes = realTimeClockSizes;
    }
    public double getEnsembleStartTime() {
        return ensembleStartTime;
    }

    public void setEnsembleStartTime(double ensembleStartTime) {
        this.ensembleStartTime = ensembleStartTime;
    }
    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }
    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }
    public int getVelocityPoErrorFlag() {
        return velocityPoErrorFlag;
    }

    public void setVelocityPoErrorFlag(int velocityPoErrorFlag) {
        this.velocityPoErrorFlag = velocityPoErrorFlag;
    }
    public int getVelocityPoUpFlag() {
        return velocityPoUpFlag;
    }

    public void setVelocityPoUpFlag(int velocityPoUpFlag) {
        this.velocityPoUpFlag = velocityPoUpFlag;
    }
    public int getVelocityPoNorthFlag() {
        return velocityPoNorthFlag;
    }

    public void setVelocityPoNorthFlag(int velocityPoNorthFlag) {
        this.velocityPoNorthFlag = velocityPoNorthFlag;
    }
    public int getVelocityPoEastFlag() {
        return velocityPoEastFlag;
    }

    public void setVelocityPoEastFlag(int velocityPoEastFlag) {
        this.velocityPoEastFlag = velocityPoEastFlag;
    }
    public int getSubsamplingParameter() {
        return subsamplingParameter;
    }

    public void setSubsamplingParameter(int subsamplingParameter) {
        this.subsamplingParameter = subsamplingParameter;
    }
    public int getStartBin() {
        return startBin;
    }

    public void setStartBin(int startBin) {
        this.startBin = startBin;
    }
    public int getNumBins() {
        return numBins;
    }

    public void setNumBins(int numBins) {
        this.numBins = numBins;
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
    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}