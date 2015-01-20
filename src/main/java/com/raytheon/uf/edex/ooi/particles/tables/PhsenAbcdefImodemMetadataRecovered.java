package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "phsen_abcdef_imodem_metadata_recovered")
public class PhsenAbcdefImodemMetadataRecovered extends CassandraParticle {

    @Column(value = "file_time")
    private String fileTime;

    @Column(value = "instrument_id")
    private String instrumentId;

    @Column(value = "serial_number")
    private String serialNumber;

    @Column(value = "voltage_flt32")
    private float voltageFlt32;

    @Column(value = "num_data_records")
    private int numDataRecords;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFileTime((String) particle.get("file_time"));
        setInstrumentId((String) particle.get("instrument_id"));
        setSerialNumber((String) particle.get("serial_number"));
        setVoltageFlt32((float) particle.get("voltage_flt32"));
        setNumDataRecords((int) particle.get("num_data_records"));
    }

    public String getFileTime() {
        return fileTime;
    }

    public void setFileTime(String fileTime) {
        this.fileTime = fileTime;
    }
    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public float getVoltageFlt32() {
        return voltageFlt32;
    }

    public void setVoltageFlt32(float voltageFlt32) {
        this.voltageFlt32 = voltageFlt32;
    }
    public int getNumDataRecords() {
        return numDataRecords;
    }

    public void setNumDataRecords(int numDataRecords) {
        this.numDataRecords = numDataRecords;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}