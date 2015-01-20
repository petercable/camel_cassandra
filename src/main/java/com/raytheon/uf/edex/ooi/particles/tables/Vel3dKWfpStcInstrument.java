package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_k_wfp_stc_instrument")
public class Vel3dKWfpStcInstrument extends CassandraParticle {

    @Column(value = "date_time_array")
    private List<Integer> dateTimeArray;

    @Column(value = "date_time_array_dims")
    private int dateTimeArrayDims;

    @Column(value = "date_time_array_sizes")
    private List<Long> dateTimeArraySizes;

    @Column(value = "vel3d_k_temp_c")
    private int vel3dKTempC;

    @Column(value = "vel3d_k_heading")
    private int vel3dKHeading;

    @Column(value = "vel3d_k_pitch")
    private int vel3dKPitch;

    @Column(value = "vel3d_k_roll")
    private int vel3dKRoll;

    @Column(value = "vel3d_k_beams")
    private int vel3dKBeams;

    @Column(value = "vel3d_k_data_set_description")
    private List<Integer> vel3dKDataSetDescription;

    @Column(value = "vel3d_k_data_set_description_dims")
    private int vel3dKDataSetDescriptionDims;

    @Column(value = "vel3d_k_data_set_description_sizes")
    private List<Long> vel3dKDataSetDescriptionSizes;

    @Column(value = "vel3d_k_v_scale")
    private int vel3dKVScale;

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

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeArray((List<Integer>) particle.get("date_time_array"));
        setDateTimeArrayDims((int) particle.get("date_time_array_dims"));
        setDateTimeArraySizes((List<Long>) particle.get("date_time_array_sizes"));
        setVel3dKTempC((int) particle.get("vel3d_k_temp_c"));
        setVel3dKHeading((int) particle.get("vel3d_k_heading"));
        setVel3dKPitch((int) particle.get("vel3d_k_pitch"));
        setVel3dKRoll((int) particle.get("vel3d_k_roll"));
        setVel3dKBeams((int) particle.get("vel3d_k_beams"));
        setVel3dKDataSetDescription((List<Integer>) particle.get("vel3d_k_data_set_description"));
        setVel3dKDataSetDescriptionDims((int) particle.get("vel3d_k_data_set_description_dims"));
        setVel3dKDataSetDescriptionSizes((List<Long>) particle.get("vel3d_k_data_set_description_sizes"));
        setVel3dKVScale((int) particle.get("vel3d_k_v_scale"));
        setVel3dKVel0((int) particle.get("vel3d_k_vel0"));
        setVel3dKVel1((int) particle.get("vel3d_k_vel1"));
        setVel3dKVel2((int) particle.get("vel3d_k_vel2"));
        setVel3dKAmp0((int) particle.get("vel3d_k_amp0"));
        setVel3dKAmp1((int) particle.get("vel3d_k_amp1"));
        setVel3dKAmp2((int) particle.get("vel3d_k_amp2"));
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
    public int getVel3dKTempC() {
        return vel3dKTempC;
    }

    public void setVel3dKTempC(int vel3dKTempC) {
        this.vel3dKTempC = vel3dKTempC;
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
    public int getVel3dKBeams() {
        return vel3dKBeams;
    }

    public void setVel3dKBeams(int vel3dKBeams) {
        this.vel3dKBeams = vel3dKBeams;
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
    public int getVel3dKVScale() {
        return vel3dKVScale;
    }

    public void setVel3dKVScale(int vel3dKVScale) {
        this.vel3dKVScale = vel3dKVScale;
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

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}