package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "camds_image_metadata")
public class CamdsImageMetadata extends CassandraParticle {

    @Column(value = "camds_pan_position")
    private int camdsPanPosition;

    @Column(value = "camds_tilt_position")
    private int camdsTiltPosition;

    @Column(value = "camds_focus_position")
    private int camdsFocusPosition;

    @Column(value = "camds_zoom_position")
    private int camdsZoomPosition;

    @Column(value = "camds_iris_position")
    private int camdsIrisPosition;

    @Column(value = "camds_gain")
    private int camdsGain;

    @Column(value = "camds_resolution")
    private int camdsResolution;

    @Column(value = "camds_brightness")
    private int camdsBrightness;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setCamdsPanPosition((int) particle.get("camds_pan_position"));
        setCamdsTiltPosition((int) particle.get("camds_tilt_position"));
        setCamdsFocusPosition((int) particle.get("camds_focus_position"));
        setCamdsZoomPosition((int) particle.get("camds_zoom_position"));
        setCamdsIrisPosition((int) particle.get("camds_iris_position"));
        setCamdsGain((int) particle.get("camds_gain"));
        setCamdsResolution((int) particle.get("camds_resolution"));
        setCamdsBrightness((int) particle.get("camds_brightness"));
    }

    public int getCamdsPanPosition() {
        return camdsPanPosition;
    }

    public void setCamdsPanPosition(int camdsPanPosition) {
        this.camdsPanPosition = camdsPanPosition;
    }
    public int getCamdsTiltPosition() {
        return camdsTiltPosition;
    }

    public void setCamdsTiltPosition(int camdsTiltPosition) {
        this.camdsTiltPosition = camdsTiltPosition;
    }
    public int getCamdsFocusPosition() {
        return camdsFocusPosition;
    }

    public void setCamdsFocusPosition(int camdsFocusPosition) {
        this.camdsFocusPosition = camdsFocusPosition;
    }
    public int getCamdsZoomPosition() {
        return camdsZoomPosition;
    }

    public void setCamdsZoomPosition(int camdsZoomPosition) {
        this.camdsZoomPosition = camdsZoomPosition;
    }
    public int getCamdsIrisPosition() {
        return camdsIrisPosition;
    }

    public void setCamdsIrisPosition(int camdsIrisPosition) {
        this.camdsIrisPosition = camdsIrisPosition;
    }
    public int getCamdsGain() {
        return camdsGain;
    }

    public void setCamdsGain(int camdsGain) {
        this.camdsGain = camdsGain;
    }
    public int getCamdsResolution() {
        return camdsResolution;
    }

    public void setCamdsResolution(int camdsResolution) {
        this.camdsResolution = camdsResolution;
    }
    public int getCamdsBrightness() {
        return camdsBrightness;
    }

    public void setCamdsBrightness(int camdsBrightness) {
        this.camdsBrightness = camdsBrightness;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}