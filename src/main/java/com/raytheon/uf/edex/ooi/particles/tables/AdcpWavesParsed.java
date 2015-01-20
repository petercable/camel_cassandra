package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcp_waves_parsed")
public class AdcpWavesParsed extends CassandraParticle {

    @Column(value = "wave_header_id")
    private int waveHeaderId;

    @Column(value = "checksum_offset")
    private int checksumOffset;

    @Column(value = "num_data_types")
    private int numDataTypes;

    @Column(value = "offset_data_types")
    private int offsetDataTypes;

    @Column(value = "first_leader_id")
    private int firstLeaderId;

    @Column(value = "firmware_version")
    private int firmwareVersion;

    @Column(value = "configuration")
    private int configuration;

    @Column(value = "num_bins")
    private int numBins;

    @Column(value = "samples_per_burst")
    private int samplesPerBurst;

    @Column(value = "bin_length")
    private int binLength;

    @Column(value = "time_between_pings")
    private int timeBetweenPings;

    @Column(value = "time_between_bursts")
    private int timeBetweenBursts;

    @Column(value = "bin_1_distance")
    private int bin1Distance;

    @Column(value = "num_bins_out")
    private int numBinsOut;

    @Column(value = "dws_bitmap")
    private List<Integer> dwsBitmap;

    @Column(value = "dws_bitmap_dims")
    private int dwsBitmapDims;

    @Column(value = "dws_bitmap_sizes")
    private List<Long> dwsBitmapSizes;

    @Column(value = "velocity_bitmap")
    private List<Integer> velocityBitmap;

    @Column(value = "velocity_bitmap_dims")
    private int velocityBitmapDims;

    @Column(value = "velocity_bitmap_sizes")
    private List<Long> velocityBitmapSizes;

    @Column(value = "real_time_clock")
    private List<Integer> realTimeClock;

    @Column(value = "real_time_clock_dims")
    private int realTimeClockDims;

    @Column(value = "real_time_clock_sizes")
    private List<Long> realTimeClockSizes;

    @Column(value = "burst_start_time")
    private double burstStartTime;

    @Column(value = "burst_number")
    private long burstNumber;

    @Column(value = "serial_number")
    private BigInteger serialNumber;

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "wave_ping_id")
    private int wavePingId;

    @Column(value = "sample_number")
    private int sampleNumber;

    @Column(value = "elapsed_time")
    private long elapsedTime;

    @Column(value = "pressure")
    private long pressure;

    @Column(value = "distance_surface")
    private List<Integer> distanceSurface;

    @Column(value = "distance_surface_dims")
    private int distanceSurfaceDims;

    @Column(value = "distance_surface_sizes")
    private List<Long> distanceSurfaceSizes;

    @Column(value = "beam_radial_velocity")
    private List<Integer> beamRadialVelocity;

    @Column(value = "beam_radial_velocity_dims")
    private int beamRadialVelocityDims;

    @Column(value = "beam_radial_velocity_sizes")
    private List<Long> beamRadialVelocitySizes;

    @Column(value = "hpr_ping_id")
    private int hprPingId;

    @Column(value = "heading")
    private int heading;

    @Column(value = "pitch")
    private int pitch;

    @Column(value = "roll")
    private int roll;

    @Column(value = "last_leader_id")
    private int lastLeaderId;

    @Column(value = "avg_depth")
    private int avgDepth;

    @Column(value = "avg_speed_of_sound")
    private int avgSpeedOfSound;

    @Column(value = "avg_temperature")
    private int avgTemperature;

    @Column(value = "avg_heading")
    private int avgHeading;

    @Column(value = "stdev_heading")
    private int stdevHeading;

    @Column(value = "avg_pitch")
    private int avgPitch;

    @Column(value = "stdev_pitch")
    private int stdevPitch;

    @Column(value = "avg_roll")
    private int avgRoll;

    @Column(value = "stdev_roll")
    private int stdevRoll;

    @Column(value = "checksum")
    private int checksum;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setWaveHeaderId((int) particle.get("wave_header_id"));
        setChecksumOffset((int) particle.get("checksum_offset"));
        setNumDataTypes((int) particle.get("num_data_types"));
        setOffsetDataTypes((int) particle.get("offset_data_types"));
        setFirstLeaderId((int) particle.get("first_leader_id"));
        setFirmwareVersion((int) particle.get("firmware_version"));
        setConfiguration((int) particle.get("configuration"));
        setNumBins((int) particle.get("num_bins"));
        setSamplesPerBurst((int) particle.get("samples_per_burst"));
        setBinLength((int) particle.get("bin_length"));
        setTimeBetweenPings((int) particle.get("time_between_pings"));
        setTimeBetweenBursts((int) particle.get("time_between_bursts"));
        setBin1Distance((int) particle.get("bin_1_distance"));
        setNumBinsOut((int) particle.get("num_bins_out"));
        setDwsBitmap((List<Integer>) particle.get("dws_bitmap"));
        setDwsBitmapDims((int) particle.get("dws_bitmap_dims"));
        setDwsBitmapSizes((List<Long>) particle.get("dws_bitmap_sizes"));
        setVelocityBitmap((List<Integer>) particle.get("velocity_bitmap"));
        setVelocityBitmapDims((int) particle.get("velocity_bitmap_dims"));
        setVelocityBitmapSizes((List<Long>) particle.get("velocity_bitmap_sizes"));
        setRealTimeClock((List<Integer>) particle.get("real_time_clock"));
        setRealTimeClockDims((int) particle.get("real_time_clock_dims"));
        setRealTimeClockSizes((List<Long>) particle.get("real_time_clock_sizes"));
        setBurstStartTime((double) particle.get("burst_start_time"));
        setBurstNumber((long) particle.get("burst_number"));
        setSerialNumber((BigInteger) particle.get("serial_number"));
        setTemperature((int) particle.get("temperature"));
        setWavePingId((int) particle.get("wave_ping_id"));
        setSampleNumber((int) particle.get("sample_number"));
        setElapsedTime((long) particle.get("elapsed_time"));
        setPressure((long) particle.get("pressure"));
        setDistanceSurface((List<Integer>) particle.get("distance_surface"));
        setDistanceSurfaceDims((int) particle.get("distance_surface_dims"));
        setDistanceSurfaceSizes((List<Long>) particle.get("distance_surface_sizes"));
        setBeamRadialVelocity((List<Integer>) particle.get("beam_radial_velocity"));
        setBeamRadialVelocityDims((int) particle.get("beam_radial_velocity_dims"));
        setBeamRadialVelocitySizes((List<Long>) particle.get("beam_radial_velocity_sizes"));
        setHprPingId((int) particle.get("hpr_ping_id"));
        setHeading((int) particle.get("heading"));
        setPitch((int) particle.get("pitch"));
        setRoll((int) particle.get("roll"));
        setLastLeaderId((int) particle.get("last_leader_id"));
        setAvgDepth((int) particle.get("avg_depth"));
        setAvgSpeedOfSound((int) particle.get("avg_speed_of_sound"));
        setAvgTemperature((int) particle.get("avg_temperature"));
        setAvgHeading((int) particle.get("avg_heading"));
        setStdevHeading((int) particle.get("stdev_heading"));
        setAvgPitch((int) particle.get("avg_pitch"));
        setStdevPitch((int) particle.get("stdev_pitch"));
        setAvgRoll((int) particle.get("avg_roll"));
        setStdevRoll((int) particle.get("stdev_roll"));
        setChecksum((int) particle.get("checksum"));
    }

    public int getWaveHeaderId() {
        return waveHeaderId;
    }

    public void setWaveHeaderId(int waveHeaderId) {
        this.waveHeaderId = waveHeaderId;
    }
    public int getChecksumOffset() {
        return checksumOffset;
    }

    public void setChecksumOffset(int checksumOffset) {
        this.checksumOffset = checksumOffset;
    }
    public int getNumDataTypes() {
        return numDataTypes;
    }

    public void setNumDataTypes(int numDataTypes) {
        this.numDataTypes = numDataTypes;
    }
    public int getOffsetDataTypes() {
        return offsetDataTypes;
    }

    public void setOffsetDataTypes(int offsetDataTypes) {
        this.offsetDataTypes = offsetDataTypes;
    }
    public int getFirstLeaderId() {
        return firstLeaderId;
    }

    public void setFirstLeaderId(int firstLeaderId) {
        this.firstLeaderId = firstLeaderId;
    }
    public int getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(int firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public int getConfiguration() {
        return configuration;
    }

    public void setConfiguration(int configuration) {
        this.configuration = configuration;
    }
    public int getNumBins() {
        return numBins;
    }

    public void setNumBins(int numBins) {
        this.numBins = numBins;
    }
    public int getSamplesPerBurst() {
        return samplesPerBurst;
    }

    public void setSamplesPerBurst(int samplesPerBurst) {
        this.samplesPerBurst = samplesPerBurst;
    }
    public int getBinLength() {
        return binLength;
    }

    public void setBinLength(int binLength) {
        this.binLength = binLength;
    }
    public int getTimeBetweenPings() {
        return timeBetweenPings;
    }

    public void setTimeBetweenPings(int timeBetweenPings) {
        this.timeBetweenPings = timeBetweenPings;
    }
    public int getTimeBetweenBursts() {
        return timeBetweenBursts;
    }

    public void setTimeBetweenBursts(int timeBetweenBursts) {
        this.timeBetweenBursts = timeBetweenBursts;
    }
    public int getBin1Distance() {
        return bin1Distance;
    }

    public void setBin1Distance(int bin1Distance) {
        this.bin1Distance = bin1Distance;
    }
    public int getNumBinsOut() {
        return numBinsOut;
    }

    public void setNumBinsOut(int numBinsOut) {
        this.numBinsOut = numBinsOut;
    }
    public List<Integer> getDwsBitmap() {
        // TODO - restore original dimensions, (remove fill values?)
        return dwsBitmap;
    }

    public void setDwsBitmap(List<Integer> dwsBitmap) {
        // TODO - flatten for storage, insert fill values
        this.dwsBitmap = dwsBitmap;
    }
    public int getDwsBitmapDims() {
        return dwsBitmapDims;
    }

    public void setDwsBitmapDims(int dwsBitmapDims) {
        this.dwsBitmapDims = dwsBitmapDims;
    }
    public List<Long> getDwsBitmapSizes() {
        return dwsBitmapSizes;
    }

    public void setDwsBitmapSizes(List<Long> dwsBitmapSizes) {
        this.dwsBitmapSizes = dwsBitmapSizes;
    }
    public List<Integer> getVelocityBitmap() {
        // TODO - restore original dimensions, (remove fill values?)
        return velocityBitmap;
    }

    public void setVelocityBitmap(List<Integer> velocityBitmap) {
        // TODO - flatten for storage, insert fill values
        this.velocityBitmap = velocityBitmap;
    }
    public int getVelocityBitmapDims() {
        return velocityBitmapDims;
    }

    public void setVelocityBitmapDims(int velocityBitmapDims) {
        this.velocityBitmapDims = velocityBitmapDims;
    }
    public List<Long> getVelocityBitmapSizes() {
        return velocityBitmapSizes;
    }

    public void setVelocityBitmapSizes(List<Long> velocityBitmapSizes) {
        this.velocityBitmapSizes = velocityBitmapSizes;
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
    public double getBurstStartTime() {
        return burstStartTime;
    }

    public void setBurstStartTime(double burstStartTime) {
        this.burstStartTime = burstStartTime;
    }
    public long getBurstNumber() {
        return burstNumber;
    }

    public void setBurstNumber(long burstNumber) {
        this.burstNumber = burstNumber;
    }
    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(BigInteger serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getWavePingId() {
        return wavePingId;
    }

    public void setWavePingId(int wavePingId) {
        this.wavePingId = wavePingId;
    }
    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }
    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }
    public List<Integer> getDistanceSurface() {
        // TODO - restore original dimensions, (remove fill values?)
        return distanceSurface;
    }

    public void setDistanceSurface(List<Integer> distanceSurface) {
        // TODO - flatten for storage, insert fill values
        this.distanceSurface = distanceSurface;
    }
    public int getDistanceSurfaceDims() {
        return distanceSurfaceDims;
    }

    public void setDistanceSurfaceDims(int distanceSurfaceDims) {
        this.distanceSurfaceDims = distanceSurfaceDims;
    }
    public List<Long> getDistanceSurfaceSizes() {
        return distanceSurfaceSizes;
    }

    public void setDistanceSurfaceSizes(List<Long> distanceSurfaceSizes) {
        this.distanceSurfaceSizes = distanceSurfaceSizes;
    }
    public List<Integer> getBeamRadialVelocity() {
        // TODO - restore original dimensions, (remove fill values?)
        return beamRadialVelocity;
    }

    public void setBeamRadialVelocity(List<Integer> beamRadialVelocity) {
        // TODO - flatten for storage, insert fill values
        this.beamRadialVelocity = beamRadialVelocity;
    }
    public int getBeamRadialVelocityDims() {
        return beamRadialVelocityDims;
    }

    public void setBeamRadialVelocityDims(int beamRadialVelocityDims) {
        this.beamRadialVelocityDims = beamRadialVelocityDims;
    }
    public List<Long> getBeamRadialVelocitySizes() {
        return beamRadialVelocitySizes;
    }

    public void setBeamRadialVelocitySizes(List<Long> beamRadialVelocitySizes) {
        this.beamRadialVelocitySizes = beamRadialVelocitySizes;
    }
    public int getHprPingId() {
        return hprPingId;
    }

    public void setHprPingId(int hprPingId) {
        this.hprPingId = hprPingId;
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
    public int getLastLeaderId() {
        return lastLeaderId;
    }

    public void setLastLeaderId(int lastLeaderId) {
        this.lastLeaderId = lastLeaderId;
    }
    public int getAvgDepth() {
        return avgDepth;
    }

    public void setAvgDepth(int avgDepth) {
        this.avgDepth = avgDepth;
    }
    public int getAvgSpeedOfSound() {
        return avgSpeedOfSound;
    }

    public void setAvgSpeedOfSound(int avgSpeedOfSound) {
        this.avgSpeedOfSound = avgSpeedOfSound;
    }
    public int getAvgTemperature() {
        return avgTemperature;
    }

    public void setAvgTemperature(int avgTemperature) {
        this.avgTemperature = avgTemperature;
    }
    public int getAvgHeading() {
        return avgHeading;
    }

    public void setAvgHeading(int avgHeading) {
        this.avgHeading = avgHeading;
    }
    public int getStdevHeading() {
        return stdevHeading;
    }

    public void setStdevHeading(int stdevHeading) {
        this.stdevHeading = stdevHeading;
    }
    public int getAvgPitch() {
        return avgPitch;
    }

    public void setAvgPitch(int avgPitch) {
        this.avgPitch = avgPitch;
    }
    public int getStdevPitch() {
        return stdevPitch;
    }

    public void setStdevPitch(int stdevPitch) {
        this.stdevPitch = stdevPitch;
    }
    public int getAvgRoll() {
        return avgRoll;
    }

    public void setAvgRoll(int avgRoll) {
        this.avgRoll = avgRoll;
    }
    public int getStdevRoll() {
        return stdevRoll;
    }

    public void setStdevRoll(int stdevRoll) {
        this.stdevRoll = stdevRoll;
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