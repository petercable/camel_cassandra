package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "camds_disk_status")
public class CamdsDiskStatus extends CassandraParticle {

    @Column(value = "camds_disk_size")
    private int camdsDiskSize;

    @Column(value = "camds_disk_remaining")
    private int camdsDiskRemaining;

    @Column(value = "camds_images_remaining")
    private int camdsImagesRemaining;

    @Column(value = "camds_images_on_disk")
    private int camdsImagesOnDisk;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setCamdsDiskSize((int) particle.get("camds_disk_size"));
        setCamdsDiskRemaining((int) particle.get("camds_disk_remaining"));
        setCamdsImagesRemaining((int) particle.get("camds_images_remaining"));
        setCamdsImagesOnDisk((int) particle.get("camds_images_on_disk"));
    }

    public int getCamdsDiskSize() {
        return camdsDiskSize;
    }

    public void setCamdsDiskSize(int camdsDiskSize) {
        this.camdsDiskSize = camdsDiskSize;
    }
    public int getCamdsDiskRemaining() {
        return camdsDiskRemaining;
    }

    public void setCamdsDiskRemaining(int camdsDiskRemaining) {
        this.camdsDiskRemaining = camdsDiskRemaining;
    }
    public int getCamdsImagesRemaining() {
        return camdsImagesRemaining;
    }

    public void setCamdsImagesRemaining(int camdsImagesRemaining) {
        this.camdsImagesRemaining = camdsImagesRemaining;
    }
    public int getCamdsImagesOnDisk() {
        return camdsImagesOnDisk;
    }

    public void setCamdsImagesOnDisk(int camdsImagesOnDisk) {
        this.camdsImagesOnDisk = camdsImagesOnDisk;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}