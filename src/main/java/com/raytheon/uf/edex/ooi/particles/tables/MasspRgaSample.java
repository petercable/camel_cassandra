package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "massp_rga_sample")
public class MasspRgaSample extends CassandraParticle {

    @Column(value = "massp_scan_data")
    private List<Integer> masspScanData;

    @Column(value = "massp_scan_data_dims")
    private int masspScanDataDims;

    @Column(value = "massp_scan_data_sizes")
    private List<Long> masspScanDataSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMasspScanData((List<Integer>) particle.get("massp_scan_data"));
        setMasspScanDataDims((int) particle.get("massp_scan_data_dims"));
        setMasspScanDataSizes((List<Long>) particle.get("massp_scan_data_sizes"));
    }

    public List<Integer> getMasspScanData() {
        // TODO - restore original dimensions, (remove fill values?)
        return masspScanData;
    }

    public void setMasspScanData(List<Integer> masspScanData) {
        // TODO - flatten for storage, insert fill values
        this.masspScanData = masspScanData;
    }
    public int getMasspScanDataDims() {
        return masspScanDataDims;
    }

    public void setMasspScanDataDims(int masspScanDataDims) {
        this.masspScanDataDims = masspScanDataDims;
    }
    public List<Long> getMasspScanDataSizes() {
        return masspScanDataSizes;
    }

    public void setMasspScanDataSizes(List<Long> masspScanDataSizes) {
        this.masspScanDataSizes = masspScanDataSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}