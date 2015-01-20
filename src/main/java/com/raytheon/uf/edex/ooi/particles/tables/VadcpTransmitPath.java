package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vadcp_transmit_path")
public class VadcpTransmitPath extends CassandraParticle {

    @Column(value = "adcp_transmit_current")
    private float adcpTransmitCurrent;

    @Column(value = "adcp_transmit_voltage")
    private float adcpTransmitVoltage;

    @Column(value = "adcp_transmit_impedance")
    private float adcpTransmitImpedance;

    @Column(value = "adcp_transmit_test_results")
    private String adcpTransmitTestResults;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setAdcpTransmitCurrent((float) particle.get("adcp_transmit_current"));
        setAdcpTransmitVoltage((float) particle.get("adcp_transmit_voltage"));
        setAdcpTransmitImpedance((float) particle.get("adcp_transmit_impedance"));
        setAdcpTransmitTestResults((String) particle.get("adcp_transmit_test_results"));
    }

    public float getAdcpTransmitCurrent() {
        return adcpTransmitCurrent;
    }

    public void setAdcpTransmitCurrent(float adcpTransmitCurrent) {
        this.adcpTransmitCurrent = adcpTransmitCurrent;
    }
    public float getAdcpTransmitVoltage() {
        return adcpTransmitVoltage;
    }

    public void setAdcpTransmitVoltage(float adcpTransmitVoltage) {
        this.adcpTransmitVoltage = adcpTransmitVoltage;
    }
    public float getAdcpTransmitImpedance() {
        return adcpTransmitImpedance;
    }

    public void setAdcpTransmitImpedance(float adcpTransmitImpedance) {
        this.adcpTransmitImpedance = adcpTransmitImpedance;
    }
    public String getAdcpTransmitTestResults() {
        return adcpTransmitTestResults;
    }

    public void setAdcpTransmitTestResults(String adcpTransmitTestResults) {
        this.adcpTransmitTestResults = adcpTransmitTestResults;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}