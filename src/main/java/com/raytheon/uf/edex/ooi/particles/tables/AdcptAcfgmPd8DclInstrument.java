package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "adcpt_acfgm_pd8_dcl_instrument")
public class AdcptAcfgmPd8DclInstrument extends CassandraParticle {

    @Column(value = "dcl_controller_timestamp")
    private String dclControllerTimestamp;

    @Column(value = "dcl_controller_starting_timestamp")
    private String dclControllerStartingTimestamp;

    @Column(value = "heading")
    private float heading;

    @Column(value = "pitch")
    private float pitch;

    @Column(value = "roll")
    private float roll;

    @Column(value = "temperature")
    private float temperature;

    @Column(value = "num_cells")
    private int numCells;

    @Column(value = "ensemble_number")
    private int ensembleNumber;

    @Column(value = "bit_result_demod_1")
    private int bitResultDemod1;

    @Column(value = "bit_result_demod_0")
    private int bitResultDemod0;

    @Column(value = "bit_result_timing")
    private int bitResultTiming;

    @Column(value = "speed_of_sound")
    private int speedOfSound;

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

    @Column(value = "echo_intensity_beam1")
    private List<Integer> echoIntensityBeam1;

    @Column(value = "echo_intensity_beam1_dims")
    private int echoIntensityBeam1Dims;

    @Column(value = "echo_intensity_beam1_sizes")
    private List<Long> echoIntensityBeam1Sizes;

    @Column(value = "echo_intensity_beam2")
    private List<Integer> echoIntensityBeam2;

    @Column(value = "echo_intensity_beam2_dims")
    private int echoIntensityBeam2Dims;

    @Column(value = "echo_intensity_beam2_sizes")
    private List<Long> echoIntensityBeam2Sizes;

    @Column(value = "echo_intensity_beam3")
    private List<Integer> echoIntensityBeam3;

    @Column(value = "echo_intensity_beam3_dims")
    private int echoIntensityBeam3Dims;

    @Column(value = "echo_intensity_beam3_sizes")
    private List<Long> echoIntensityBeam3Sizes;

    @Column(value = "echo_intensity_beam4")
    private List<Integer> echoIntensityBeam4;

    @Column(value = "echo_intensity_beam4_dims")
    private int echoIntensityBeam4Dims;

    @Column(value = "echo_intensity_beam4_sizes")
    private List<Long> echoIntensityBeam4Sizes;

    @Column(value = "instrument_timestamp")
    private String instrumentTimestamp;

    @Column(value = "water_direction")
    private List<Float> waterDirection;

    @Column(value = "water_direction_dims")
    private int waterDirectionDims;

    @Column(value = "water_direction_sizes")
    private List<Long> waterDirectionSizes;

    @Column(value = "water_velocity")
    private List<Float> waterVelocity;

    @Column(value = "water_velocity_dims")
    private int waterVelocityDims;

    @Column(value = "water_velocity_sizes")
    private List<Long> waterVelocitySizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDclControllerTimestamp((String) particle.get("dcl_controller_timestamp"));
        setDclControllerStartingTimestamp((String) particle.get("dcl_controller_starting_timestamp"));
        setHeading((float) particle.get("heading"));
        setPitch((float) particle.get("pitch"));
        setRoll((float) particle.get("roll"));
        setTemperature((float) particle.get("temperature"));
        setNumCells((int) particle.get("num_cells"));
        setEnsembleNumber((int) particle.get("ensemble_number"));
        setBitResultDemod1((int) particle.get("bit_result_demod_1"));
        setBitResultDemod0((int) particle.get("bit_result_demod_0"));
        setBitResultTiming((int) particle.get("bit_result_timing"));
        setSpeedOfSound((int) particle.get("speed_of_sound"));
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
        setEchoIntensityBeam1((List<Integer>) particle.get("echo_intensity_beam1"));
        setEchoIntensityBeam1Dims((int) particle.get("echo_intensity_beam1_dims"));
        setEchoIntensityBeam1Sizes((List<Long>) particle.get("echo_intensity_beam1_sizes"));
        setEchoIntensityBeam2((List<Integer>) particle.get("echo_intensity_beam2"));
        setEchoIntensityBeam2Dims((int) particle.get("echo_intensity_beam2_dims"));
        setEchoIntensityBeam2Sizes((List<Long>) particle.get("echo_intensity_beam2_sizes"));
        setEchoIntensityBeam3((List<Integer>) particle.get("echo_intensity_beam3"));
        setEchoIntensityBeam3Dims((int) particle.get("echo_intensity_beam3_dims"));
        setEchoIntensityBeam3Sizes((List<Long>) particle.get("echo_intensity_beam3_sizes"));
        setEchoIntensityBeam4((List<Integer>) particle.get("echo_intensity_beam4"));
        setEchoIntensityBeam4Dims((int) particle.get("echo_intensity_beam4_dims"));
        setEchoIntensityBeam4Sizes((List<Long>) particle.get("echo_intensity_beam4_sizes"));
        setInstrumentTimestamp((String) particle.get("instrument_timestamp"));
        setWaterDirection((List<Float>) particle.get("water_direction"));
        setWaterDirectionDims((int) particle.get("water_direction_dims"));
        setWaterDirectionSizes((List<Long>) particle.get("water_direction_sizes"));
        setWaterVelocity((List<Float>) particle.get("water_velocity"));
        setWaterVelocityDims((int) particle.get("water_velocity_dims"));
        setWaterVelocitySizes((List<Long>) particle.get("water_velocity_sizes"));
    }

    public String getDclControllerTimestamp() {
        return dclControllerTimestamp;
    }

    public void setDclControllerTimestamp(String dclControllerTimestamp) {
        this.dclControllerTimestamp = dclControllerTimestamp;
    }
    public String getDclControllerStartingTimestamp() {
        return dclControllerStartingTimestamp;
    }

    public void setDclControllerStartingTimestamp(String dclControllerStartingTimestamp) {
        this.dclControllerStartingTimestamp = dclControllerStartingTimestamp;
    }
    public float getHeading() {
        return heading;
    }

    public void setHeading(float heading) {
        this.heading = heading;
    }
    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }
    public float getRoll() {
        return roll;
    }

    public void setRoll(float roll) {
        this.roll = roll;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public int getNumCells() {
        return numCells;
    }

    public void setNumCells(int numCells) {
        this.numCells = numCells;
    }
    public int getEnsembleNumber() {
        return ensembleNumber;
    }

    public void setEnsembleNumber(int ensembleNumber) {
        this.ensembleNumber = ensembleNumber;
    }
    public int getBitResultDemod1() {
        return bitResultDemod1;
    }

    public void setBitResultDemod1(int bitResultDemod1) {
        this.bitResultDemod1 = bitResultDemod1;
    }
    public int getBitResultDemod0() {
        return bitResultDemod0;
    }

    public void setBitResultDemod0(int bitResultDemod0) {
        this.bitResultDemod0 = bitResultDemod0;
    }
    public int getBitResultTiming() {
        return bitResultTiming;
    }

    public void setBitResultTiming(int bitResultTiming) {
        this.bitResultTiming = bitResultTiming;
    }
    public int getSpeedOfSound() {
        return speedOfSound;
    }

    public void setSpeedOfSound(int speedOfSound) {
        this.speedOfSound = speedOfSound;
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
    public List<Integer> getEchoIntensityBeam1() {
        // TODO - restore original dimensions, (remove fill values?)
        return echoIntensityBeam1;
    }

    public void setEchoIntensityBeam1(List<Integer> echoIntensityBeam1) {
        // TODO - flatten for storage, insert fill values
        this.echoIntensityBeam1 = echoIntensityBeam1;
    }
    public int getEchoIntensityBeam1Dims() {
        return echoIntensityBeam1Dims;
    }

    public void setEchoIntensityBeam1Dims(int echoIntensityBeam1Dims) {
        this.echoIntensityBeam1Dims = echoIntensityBeam1Dims;
    }
    public List<Long> getEchoIntensityBeam1Sizes() {
        return echoIntensityBeam1Sizes;
    }

    public void setEchoIntensityBeam1Sizes(List<Long> echoIntensityBeam1Sizes) {
        this.echoIntensityBeam1Sizes = echoIntensityBeam1Sizes;
    }
    public List<Integer> getEchoIntensityBeam2() {
        // TODO - restore original dimensions, (remove fill values?)
        return echoIntensityBeam2;
    }

    public void setEchoIntensityBeam2(List<Integer> echoIntensityBeam2) {
        // TODO - flatten for storage, insert fill values
        this.echoIntensityBeam2 = echoIntensityBeam2;
    }
    public int getEchoIntensityBeam2Dims() {
        return echoIntensityBeam2Dims;
    }

    public void setEchoIntensityBeam2Dims(int echoIntensityBeam2Dims) {
        this.echoIntensityBeam2Dims = echoIntensityBeam2Dims;
    }
    public List<Long> getEchoIntensityBeam2Sizes() {
        return echoIntensityBeam2Sizes;
    }

    public void setEchoIntensityBeam2Sizes(List<Long> echoIntensityBeam2Sizes) {
        this.echoIntensityBeam2Sizes = echoIntensityBeam2Sizes;
    }
    public List<Integer> getEchoIntensityBeam3() {
        // TODO - restore original dimensions, (remove fill values?)
        return echoIntensityBeam3;
    }

    public void setEchoIntensityBeam3(List<Integer> echoIntensityBeam3) {
        // TODO - flatten for storage, insert fill values
        this.echoIntensityBeam3 = echoIntensityBeam3;
    }
    public int getEchoIntensityBeam3Dims() {
        return echoIntensityBeam3Dims;
    }

    public void setEchoIntensityBeam3Dims(int echoIntensityBeam3Dims) {
        this.echoIntensityBeam3Dims = echoIntensityBeam3Dims;
    }
    public List<Long> getEchoIntensityBeam3Sizes() {
        return echoIntensityBeam3Sizes;
    }

    public void setEchoIntensityBeam3Sizes(List<Long> echoIntensityBeam3Sizes) {
        this.echoIntensityBeam3Sizes = echoIntensityBeam3Sizes;
    }
    public List<Integer> getEchoIntensityBeam4() {
        // TODO - restore original dimensions, (remove fill values?)
        return echoIntensityBeam4;
    }

    public void setEchoIntensityBeam4(List<Integer> echoIntensityBeam4) {
        // TODO - flatten for storage, insert fill values
        this.echoIntensityBeam4 = echoIntensityBeam4;
    }
    public int getEchoIntensityBeam4Dims() {
        return echoIntensityBeam4Dims;
    }

    public void setEchoIntensityBeam4Dims(int echoIntensityBeam4Dims) {
        this.echoIntensityBeam4Dims = echoIntensityBeam4Dims;
    }
    public List<Long> getEchoIntensityBeam4Sizes() {
        return echoIntensityBeam4Sizes;
    }

    public void setEchoIntensityBeam4Sizes(List<Long> echoIntensityBeam4Sizes) {
        this.echoIntensityBeam4Sizes = echoIntensityBeam4Sizes;
    }
    public String getInstrumentTimestamp() {
        return instrumentTimestamp;
    }

    public void setInstrumentTimestamp(String instrumentTimestamp) {
        this.instrumentTimestamp = instrumentTimestamp;
    }
    public List<Float> getWaterDirection() {
        // TODO - restore original dimensions, (remove fill values?)
        return waterDirection;
    }

    public void setWaterDirection(List<Float> waterDirection) {
        // TODO - flatten for storage, insert fill values
        this.waterDirection = waterDirection;
    }
    public int getWaterDirectionDims() {
        return waterDirectionDims;
    }

    public void setWaterDirectionDims(int waterDirectionDims) {
        this.waterDirectionDims = waterDirectionDims;
    }
    public List<Long> getWaterDirectionSizes() {
        return waterDirectionSizes;
    }

    public void setWaterDirectionSizes(List<Long> waterDirectionSizes) {
        this.waterDirectionSizes = waterDirectionSizes;
    }
    public List<Float> getWaterVelocity() {
        // TODO - restore original dimensions, (remove fill values?)
        return waterVelocity;
    }

    public void setWaterVelocity(List<Float> waterVelocity) {
        // TODO - flatten for storage, insert fill values
        this.waterVelocity = waterVelocity;
    }
    public int getWaterVelocityDims() {
        return waterVelocityDims;
    }

    public void setWaterVelocityDims(int waterVelocityDims) {
        this.waterVelocityDims = waterVelocityDims;
    }
    public List<Long> getWaterVelocitySizes() {
        return waterVelocitySizes;
    }

    public void setWaterVelocitySizes(List<Long> waterVelocitySizes) {
        this.waterVelocitySizes = waterVelocitySizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}