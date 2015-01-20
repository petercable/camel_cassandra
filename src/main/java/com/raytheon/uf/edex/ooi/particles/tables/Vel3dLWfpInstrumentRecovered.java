package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vel3d_l_wfp_instrument_recovered")
public class Vel3dLWfpInstrumentRecovered extends CassandraParticle {

    @Column(value = "vel3d_l_date_time_array")
    private List<Integer> vel3dLDateTimeArray;

    @Column(value = "vel3d_l_date_time_array_dims")
    private int vel3dLDateTimeArrayDims;

    @Column(value = "vel3d_l_date_time_array_sizes")
    private List<Long> vel3dLDateTimeArraySizes;

    @Column(value = "vel3d_l_heading")
    private float vel3dLHeading;

    @Column(value = "vel3d_l_tx")
    private float vel3dLTx;

    @Column(value = "vel3d_l_ty")
    private float vel3dLTy;

    @Column(value = "vel3d_l_hx")
    private float vel3dLHx;

    @Column(value = "vel3d_l_hy")
    private float vel3dLHy;

    @Column(value = "vel3d_l_hz")
    private float vel3dLHz;

    @Column(value = "vel3d_l_vp1")
    private float vel3dLVp1;

    @Column(value = "vel3d_l_vp2")
    private float vel3dLVp2;

    @Column(value = "vel3d_l_vp3")
    private float vel3dLVp3;

    @Column(value = "vel3d_l_vp4")
    private float vel3dLVp4;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setVel3dLDateTimeArray((List<Integer>) particle.get("vel3d_l_date_time_array"));
        setVel3dLDateTimeArrayDims((int) particle.get("vel3d_l_date_time_array_dims"));
        setVel3dLDateTimeArraySizes((List<Long>) particle.get("vel3d_l_date_time_array_sizes"));
        setVel3dLHeading((float) particle.get("vel3d_l_heading"));
        setVel3dLTx((float) particle.get("vel3d_l_tx"));
        setVel3dLTy((float) particle.get("vel3d_l_ty"));
        setVel3dLHx((float) particle.get("vel3d_l_hx"));
        setVel3dLHy((float) particle.get("vel3d_l_hy"));
        setVel3dLHz((float) particle.get("vel3d_l_hz"));
        setVel3dLVp1((float) particle.get("vel3d_l_vp1"));
        setVel3dLVp2((float) particle.get("vel3d_l_vp2"));
        setVel3dLVp3((float) particle.get("vel3d_l_vp3"));
        setVel3dLVp4((float) particle.get("vel3d_l_vp4"));
    }

    public List<Integer> getVel3dLDateTimeArray() {
        // TODO - restore original dimensions, (remove fill values?)
        return vel3dLDateTimeArray;
    }

    public void setVel3dLDateTimeArray(List<Integer> vel3dLDateTimeArray) {
        // TODO - flatten for storage, insert fill values
        this.vel3dLDateTimeArray = vel3dLDateTimeArray;
    }
    public int getVel3dLDateTimeArrayDims() {
        return vel3dLDateTimeArrayDims;
    }

    public void setVel3dLDateTimeArrayDims(int vel3dLDateTimeArrayDims) {
        this.vel3dLDateTimeArrayDims = vel3dLDateTimeArrayDims;
    }
    public List<Long> getVel3dLDateTimeArraySizes() {
        return vel3dLDateTimeArraySizes;
    }

    public void setVel3dLDateTimeArraySizes(List<Long> vel3dLDateTimeArraySizes) {
        this.vel3dLDateTimeArraySizes = vel3dLDateTimeArraySizes;
    }
    public float getVel3dLHeading() {
        return vel3dLHeading;
    }

    public void setVel3dLHeading(float vel3dLHeading) {
        this.vel3dLHeading = vel3dLHeading;
    }
    public float getVel3dLTx() {
        return vel3dLTx;
    }

    public void setVel3dLTx(float vel3dLTx) {
        this.vel3dLTx = vel3dLTx;
    }
    public float getVel3dLTy() {
        return vel3dLTy;
    }

    public void setVel3dLTy(float vel3dLTy) {
        this.vel3dLTy = vel3dLTy;
    }
    public float getVel3dLHx() {
        return vel3dLHx;
    }

    public void setVel3dLHx(float vel3dLHx) {
        this.vel3dLHx = vel3dLHx;
    }
    public float getVel3dLHy() {
        return vel3dLHy;
    }

    public void setVel3dLHy(float vel3dLHy) {
        this.vel3dLHy = vel3dLHy;
    }
    public float getVel3dLHz() {
        return vel3dLHz;
    }

    public void setVel3dLHz(float vel3dLHz) {
        this.vel3dLHz = vel3dLHz;
    }
    public float getVel3dLVp1() {
        return vel3dLVp1;
    }

    public void setVel3dLVp1(float vel3dLVp1) {
        this.vel3dLVp1 = vel3dLVp1;
    }
    public float getVel3dLVp2() {
        return vel3dLVp2;
    }

    public void setVel3dLVp2(float vel3dLVp2) {
        this.vel3dLVp2 = vel3dLVp2;
    }
    public float getVel3dLVp3() {
        return vel3dLVp3;
    }

    public void setVel3dLVp3(float vel3dLVp3) {
        this.vel3dLVp3 = vel3dLVp3;
    }
    public float getVel3dLVp4() {
        return vel3dLVp4;
    }

    public void setVel3dLVp4(float vel3dLVp4) {
        this.vel3dLVp4 = vel3dLVp4;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}