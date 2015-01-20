package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_k_wfp_instrument")
public class Vel3dKWfpInstrument extends CassandraParticle {

    @Column(value = "vel3d_k_id")
    private int vel3dKId;

    @Column(value = "vel3d_k_version")
    private int vel3dKVersion;

    @Column(value = "vel3d_k_serial")
    private long vel3dKSerial;

    @Column(value = "vel3d_k_configuration")
    private int vel3dKConfiguration;

    @Column(value = "date_time_array")
    private List<Integer> dateTimeArray;

    @Column(value = "date_time_array_dims")
    private int dateTimeArrayDims;

    @Column(value = "date_time_array_sizes")
    private List<Long> dateTimeArraySizes;

    @Column(value = "vel3d_k_micro_second")
    private int vel3dKMicroSecond;

    @Column(value = "vel3d_k_speed_sound")
    private int vel3dKSpeedSound;

    @Column(value = "vel3d_k_temp_c")
    private int vel3dKTempC;

    @Column(value = "vel3d_k_pressure")
    private long vel3dKPressure;

    @Column(value = "vel3d_k_heading")
    private int vel3dKHeading;

    @Column(value = "vel3d_k_pitch")
    private int vel3dKPitch;

    @Column(value = "vel3d_k_roll")
    private int vel3dKRoll;

    @Column(value = "vel3d_k_error")
    private int vel3dKError;

    @Column(value = "vel3d_k_status")
    private int vel3dKStatus;

    @Column(value = "vel3d_k_beams_coordinate")
    private int vel3dKBeamsCoordinate;

    @Column(value = "vel3d_k_cell_size")
    private int vel3dKCellSize;

    @Column(value = "vel3d_k_blanking")
    private int vel3dKBlanking;

    @Column(value = "vel3d_k_velocity_range")
    private int vel3dKVelocityRange;

    @Column(value = "vel3d_k_battery_voltage")
    private int vel3dKBatteryVoltage;

    @Column(value = "vel3d_k_mag_x")
    private int vel3dKMagX;

    @Column(value = "vel3d_k_mag_y")
    private int vel3dKMagY;

    @Column(value = "vel3d_k_mag_z")
    private int vel3dKMagZ;

    @Column(value = "vel3d_k_acc_x")
    private int vel3dKAccX;

    @Column(value = "vel3d_k_acc_y")
    private int vel3dKAccY;

    @Column(value = "vel3d_k_acc_z")
    private int vel3dKAccZ;

    @Column(value = "vel3d_k_ambiguity")
    private int vel3dKAmbiguity;

    @Column(value = "vel3d_k_data_set_description")
    private List<Integer> vel3dKDataSetDescription;

    @Column(value = "vel3d_k_data_set_description_dims")
    private int vel3dKDataSetDescriptionDims;

    @Column(value = "vel3d_k_data_set_description_sizes")
    private List<Long> vel3dKDataSetDescriptionSizes;

    @Column(value = "vel3d_k_transmit_energy")
    private int vel3dKTransmitEnergy;

    @Column(value = "vel3d_k_v_scale")
    private int vel3dKVScale;

    @Column(value = "vel3d_k_power_level")
    private int vel3dKPowerLevel;

    @Column(value = "vel3d_k_vel0")
    private int vel3dKVel0;

    @Column(value = "vel3d_k_vel1")
    private int vel3dKVel1;

    @Column(value = "vel3d_k_vel2")
    private int vel3dKVel2;

    @Column(value = "vel3d_k_amp0")
    private int vel3dKAmp0;

    @Column(value = "vel3d_k_amp1")
    private int vel3dKAmp1;

    @Column(value = "vel3d_k_amp2")
    private int vel3dKAmp2;

    @Column(value = "vel3d_k_corr0")
    private int vel3dKCorr0;

    @Column(value = "vel3d_k_corr1")
    private int vel3dKCorr1;

    @Column(value = "vel3d_k_corr2")
    private int vel3dKCorr2;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setVel3dKId((int) particle.get("vel3d_k_id"));
        setVel3dKVersion((int) particle.get("vel3d_k_version"));
        setVel3dKSerial((long) particle.get("vel3d_k_serial"));
        setVel3dKConfiguration((int) particle.get("vel3d_k_configuration"));
        setDateTimeArray((List<Integer>) particle.get("date_time_array"));
        setDateTimeArrayDims((int) particle.get("date_time_array_dims"));
        setDateTimeArraySizes((List<Long>) particle.get("date_time_array_sizes"));
        setVel3dKMicroSecond((int) particle.get("vel3d_k_micro_second"));
        setVel3dKSpeedSound((int) particle.get("vel3d_k_speed_sound"));
        setVel3dKTempC((int) particle.get("vel3d_k_temp_c"));
        setVel3dKPressure((long) particle.get("vel3d_k_pressure"));
        setVel3dKHeading((int) particle.get("vel3d_k_heading"));
        setVel3dKPitch((int) particle.get("vel3d_k_pitch"));
        setVel3dKRoll((int) particle.get("vel3d_k_roll"));
        setVel3dKError((int) particle.get("vel3d_k_error"));
        setVel3dKStatus((int) particle.get("vel3d_k_status"));
        setVel3dKBeamsCoordinate((int) particle.get("vel3d_k_beams_coordinate"));
        setVel3dKCellSize((int) particle.get("vel3d_k_cell_size"));
        setVel3dKBlanking((int) particle.get("vel3d_k_blanking"));
        setVel3dKVelocityRange((int) particle.get("vel3d_k_velocity_range"));
        setVel3dKBatteryVoltage((int) particle.get("vel3d_k_battery_voltage"));
        setVel3dKMagX((int) particle.get("vel3d_k_mag_x"));
        setVel3dKMagY((int) particle.get("vel3d_k_mag_y"));
        setVel3dKMagZ((int) particle.get("vel3d_k_mag_z"));
        setVel3dKAccX((int) particle.get("vel3d_k_acc_x"));
        setVel3dKAccY((int) particle.get("vel3d_k_acc_y"));
        setVel3dKAccZ((int) particle.get("vel3d_k_acc_z"));
        setVel3dKAmbiguity((int) particle.get("vel3d_k_ambiguity"));
        setVel3dKDataSetDescription((List<Integer>) particle.get("vel3d_k_data_set_description"));
        setVel3dKDataSetDescriptionDims((int) particle.get("vel3d_k_data_set_description_dims"));
        setVel3dKDataSetDescriptionSizes((List<Long>) particle.get("vel3d_k_data_set_description_sizes"));
        setVel3dKTransmitEnergy((int) particle.get("vel3d_k_transmit_energy"));
        setVel3dKVScale((int) particle.get("vel3d_k_v_scale"));
        setVel3dKPowerLevel((int) particle.get("vel3d_k_power_level"));
        setVel3dKVel0((int) particle.get("vel3d_k_vel0"));
        setVel3dKVel1((int) particle.get("vel3d_k_vel1"));
        setVel3dKVel2((int) particle.get("vel3d_k_vel2"));
        setVel3dKAmp0((int) particle.get("vel3d_k_amp0"));
        setVel3dKAmp1((int) particle.get("vel3d_k_amp1"));
        setVel3dKAmp2((int) particle.get("vel3d_k_amp2"));
        setVel3dKCorr0((int) particle.get("vel3d_k_corr0"));
        setVel3dKCorr1((int) particle.get("vel3d_k_corr1"));
        setVel3dKCorr2((int) particle.get("vel3d_k_corr2"));
    }

    public int getVel3dKId() {
        return vel3dKId;
    }

    public void setVel3dKId(int vel3dKId) {
        this.vel3dKId = vel3dKId;
    }
    public int getVel3dKVersion() {
        return vel3dKVersion;
    }

    public void setVel3dKVersion(int vel3dKVersion) {
        this.vel3dKVersion = vel3dKVersion;
    }
    public long getVel3dKSerial() {
        return vel3dKSerial;
    }

    public void setVel3dKSerial(long vel3dKSerial) {
        this.vel3dKSerial = vel3dKSerial;
    }
    public int getVel3dKConfiguration() {
        return vel3dKConfiguration;
    }

    public void setVel3dKConfiguration(int vel3dKConfiguration) {
        this.vel3dKConfiguration = vel3dKConfiguration;
    }
    public List<Integer> getDateTimeArray() {
        // TODO - restore original dimensions, (remove fill values?)
        return dateTimeArray;
    }

    public void setDateTimeArray(List<Integer> dateTimeArray) {
        // TODO - flatten for storage, insert fill values
        this.dateTimeArray = dateTimeArray;
    }
    public int getDateTimeArrayDims() {
        return dateTimeArrayDims;
    }

    public void setDateTimeArrayDims(int dateTimeArrayDims) {
        this.dateTimeArrayDims = dateTimeArrayDims;
    }
    public List<Long> getDateTimeArraySizes() {
        return dateTimeArraySizes;
    }

    public void setDateTimeArraySizes(List<Long> dateTimeArraySizes) {
        this.dateTimeArraySizes = dateTimeArraySizes;
    }
    public int getVel3dKMicroSecond() {
        return vel3dKMicroSecond;
    }

    public void setVel3dKMicroSecond(int vel3dKMicroSecond) {
        this.vel3dKMicroSecond = vel3dKMicroSecond;
    }
    public int getVel3dKSpeedSound() {
        return vel3dKSpeedSound;
    }

    public void setVel3dKSpeedSound(int vel3dKSpeedSound) {
        this.vel3dKSpeedSound = vel3dKSpeedSound;
    }
    public int getVel3dKTempC() {
        return vel3dKTempC;
    }

    public void setVel3dKTempC(int vel3dKTempC) {
        this.vel3dKTempC = vel3dKTempC;
    }
    public long getVel3dKPressure() {
        return vel3dKPressure;
    }

    public void setVel3dKPressure(long vel3dKPressure) {
        this.vel3dKPressure = vel3dKPressure;
    }
    public int getVel3dKHeading() {
        return vel3dKHeading;
    }

    public void setVel3dKHeading(int vel3dKHeading) {
        this.vel3dKHeading = vel3dKHeading;
    }
    public int getVel3dKPitch() {
        return vel3dKPitch;
    }

    public void setVel3dKPitch(int vel3dKPitch) {
        this.vel3dKPitch = vel3dKPitch;
    }
    public int getVel3dKRoll() {
        return vel3dKRoll;
    }

    public void setVel3dKRoll(int vel3dKRoll) {
        this.vel3dKRoll = vel3dKRoll;
    }
    public int getVel3dKError() {
        return vel3dKError;
    }

    public void setVel3dKError(int vel3dKError) {
        this.vel3dKError = vel3dKError;
    }
    public int getVel3dKStatus() {
        return vel3dKStatus;
    }

    public void setVel3dKStatus(int vel3dKStatus) {
        this.vel3dKStatus = vel3dKStatus;
    }
    public int getVel3dKBeamsCoordinate() {
        return vel3dKBeamsCoordinate;
    }

    public void setVel3dKBeamsCoordinate(int vel3dKBeamsCoordinate) {
        this.vel3dKBeamsCoordinate = vel3dKBeamsCoordinate;
    }
    public int getVel3dKCellSize() {
        return vel3dKCellSize;
    }

    public void setVel3dKCellSize(int vel3dKCellSize) {
        this.vel3dKCellSize = vel3dKCellSize;
    }
    public int getVel3dKBlanking() {
        return vel3dKBlanking;
    }

    public void setVel3dKBlanking(int vel3dKBlanking) {
        this.vel3dKBlanking = vel3dKBlanking;
    }
    public int getVel3dKVelocityRange() {
        return vel3dKVelocityRange;
    }

    public void setVel3dKVelocityRange(int vel3dKVelocityRange) {
        this.vel3dKVelocityRange = vel3dKVelocityRange;
    }
    public int getVel3dKBatteryVoltage() {
        return vel3dKBatteryVoltage;
    }

    public void setVel3dKBatteryVoltage(int vel3dKBatteryVoltage) {
        this.vel3dKBatteryVoltage = vel3dKBatteryVoltage;
    }
    public int getVel3dKMagX() {
        return vel3dKMagX;
    }

    public void setVel3dKMagX(int vel3dKMagX) {
        this.vel3dKMagX = vel3dKMagX;
    }
    public int getVel3dKMagY() {
        return vel3dKMagY;
    }

    public void setVel3dKMagY(int vel3dKMagY) {
        this.vel3dKMagY = vel3dKMagY;
    }
    public int getVel3dKMagZ() {
        return vel3dKMagZ;
    }

    public void setVel3dKMagZ(int vel3dKMagZ) {
        this.vel3dKMagZ = vel3dKMagZ;
    }
    public int getVel3dKAccX() {
        return vel3dKAccX;
    }

    public void setVel3dKAccX(int vel3dKAccX) {
        this.vel3dKAccX = vel3dKAccX;
    }
    public int getVel3dKAccY() {
        return vel3dKAccY;
    }

    public void setVel3dKAccY(int vel3dKAccY) {
        this.vel3dKAccY = vel3dKAccY;
    }
    public int getVel3dKAccZ() {
        return vel3dKAccZ;
    }

    public void setVel3dKAccZ(int vel3dKAccZ) {
        this.vel3dKAccZ = vel3dKAccZ;
    }
    public int getVel3dKAmbiguity() {
        return vel3dKAmbiguity;
    }

    public void setVel3dKAmbiguity(int vel3dKAmbiguity) {
        this.vel3dKAmbiguity = vel3dKAmbiguity;
    }
    public List<Integer> getVel3dKDataSetDescription() {
        // TODO - restore original dimensions, (remove fill values?)
        return vel3dKDataSetDescription;
    }

    public void setVel3dKDataSetDescription(List<Integer> vel3dKDataSetDescription) {
        // TODO - flatten for storage, insert fill values
        this.vel3dKDataSetDescription = vel3dKDataSetDescription;
    }
    public int getVel3dKDataSetDescriptionDims() {
        return vel3dKDataSetDescriptionDims;
    }

    public void setVel3dKDataSetDescriptionDims(int vel3dKDataSetDescriptionDims) {
        this.vel3dKDataSetDescriptionDims = vel3dKDataSetDescriptionDims;
    }
    public List<Long> getVel3dKDataSetDescriptionSizes() {
        return vel3dKDataSetDescriptionSizes;
    }

    public void setVel3dKDataSetDescriptionSizes(List<Long> vel3dKDataSetDescriptionSizes) {
        this.vel3dKDataSetDescriptionSizes = vel3dKDataSetDescriptionSizes;
    }
    public int getVel3dKTransmitEnergy() {
        return vel3dKTransmitEnergy;
    }

    public void setVel3dKTransmitEnergy(int vel3dKTransmitEnergy) {
        this.vel3dKTransmitEnergy = vel3dKTransmitEnergy;
    }
    public int getVel3dKVScale() {
        return vel3dKVScale;
    }

    public void setVel3dKVScale(int vel3dKVScale) {
        this.vel3dKVScale = vel3dKVScale;
    }
    public int getVel3dKPowerLevel() {
        return vel3dKPowerLevel;
    }

    public void setVel3dKPowerLevel(int vel3dKPowerLevel) {
        this.vel3dKPowerLevel = vel3dKPowerLevel;
    }
    public int getVel3dKVel0() {
        return vel3dKVel0;
    }

    public void setVel3dKVel0(int vel3dKVel0) {
        this.vel3dKVel0 = vel3dKVel0;
    }
    public int getVel3dKVel1() {
        return vel3dKVel1;
    }

    public void setVel3dKVel1(int vel3dKVel1) {
        this.vel3dKVel1 = vel3dKVel1;
    }
    public int getVel3dKVel2() {
        return vel3dKVel2;
    }

    public void setVel3dKVel2(int vel3dKVel2) {
        this.vel3dKVel2 = vel3dKVel2;
    }
    public int getVel3dKAmp0() {
        return vel3dKAmp0;
    }

    public void setVel3dKAmp0(int vel3dKAmp0) {
        this.vel3dKAmp0 = vel3dKAmp0;
    }
    public int getVel3dKAmp1() {
        return vel3dKAmp1;
    }

    public void setVel3dKAmp1(int vel3dKAmp1) {
        this.vel3dKAmp1 = vel3dKAmp1;
    }
    public int getVel3dKAmp2() {
        return vel3dKAmp2;
    }

    public void setVel3dKAmp2(int vel3dKAmp2) {
        this.vel3dKAmp2 = vel3dKAmp2;
    }
    public int getVel3dKCorr0() {
        return vel3dKCorr0;
    }

    public void setVel3dKCorr0(int vel3dKCorr0) {
        this.vel3dKCorr0 = vel3dKCorr0;
    }
    public int getVel3dKCorr1() {
        return vel3dKCorr1;
    }

    public void setVel3dKCorr1(int vel3dKCorr1) {
        this.vel3dKCorr1 = vel3dKCorr1;
    }
    public int getVel3dKCorr2() {
        return vel3dKCorr2;
    }

    public void setVel3dKCorr2(int vel3dKCorr2) {
        this.vel3dKCorr2 = vel3dKCorr2;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}