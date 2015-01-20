package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dpc_acs_instrument_recovered")
public class DpcAcsInstrumentRecovered extends CassandraParticle {

    @Column(value = "raw_time_seconds")
    private long rawTimeSeconds;

    @Column(value = "raw_time_microseconds")
    private long rawTimeMicroseconds;

    @Column(value = "packet_type")
    private int packetType;

    @Column(value = "meter_type")
    private int meterType;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "a_reference_dark_counts")
    private int aReferenceDarkCounts;

    @Column(value = "pressure_counts")
    private int pressureCounts;

    @Column(value = "a_signal_dark_counts")
    private int aSignalDarkCounts;

    @Column(value = "external_temp_raw")
    private int externalTempRaw;

    @Column(value = "internal_temp_raw")
    private int internalTempRaw;

    @Column(value = "c_reference_dark_counts")
    private int cReferenceDarkCounts;

    @Column(value = "c_signal_dark_counts")
    private int cSignalDarkCounts;

    @Column(value = "elapsed_run_time")
    private long elapsedRunTime;

    @Column(value = "num_wavelengths")
    private int numWavelengths;

    @Column(value = "c_reference_counts")
    private List<Integer> cReferenceCounts;

    @Column(value = "c_reference_counts_dims")
    private int cReferenceCountsDims;

    @Column(value = "c_reference_counts_sizes")
    private List<Long> cReferenceCountsSizes;

    @Column(value = "a_reference_counts")
    private List<Integer> aReferenceCounts;

    @Column(value = "a_reference_counts_dims")
    private int aReferenceCountsDims;

    @Column(value = "a_reference_counts_sizes")
    private List<Long> aReferenceCountsSizes;

    @Column(value = "c_signal_counts")
    private List<Integer> cSignalCounts;

    @Column(value = "c_signal_counts_dims")
    private int cSignalCountsDims;

    @Column(value = "c_signal_counts_sizes")
    private List<Long> cSignalCountsSizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setRawTimeSeconds((long) particle.get("raw_time_seconds"));
        setRawTimeMicroseconds((long) particle.get("raw_time_microseconds"));
        setPacketType((int) particle.get("packet_type"));
        setMeterType((int) particle.get("meter_type"));
        setSerialNumber((int) particle.get("serial_number"));
        setAReferenceDarkCounts((int) particle.get("a_reference_dark_counts"));
        setPressureCounts((int) particle.get("pressure_counts"));
        setASignalDarkCounts((int) particle.get("a_signal_dark_counts"));
        setExternalTempRaw((int) particle.get("external_temp_raw"));
        setInternalTempRaw((int) particle.get("internal_temp_raw"));
        setCReferenceDarkCounts((int) particle.get("c_reference_dark_counts"));
        setCSignalDarkCounts((int) particle.get("c_signal_dark_counts"));
        setElapsedRunTime((long) particle.get("elapsed_run_time"));
        setNumWavelengths((int) particle.get("num_wavelengths"));
        setCReferenceCounts((List<Integer>) particle.get("c_reference_counts"));
        setCReferenceCountsDims((int) particle.get("c_reference_counts_dims"));
        setCReferenceCountsSizes((List<Long>) particle.get("c_reference_counts_sizes"));
        setAReferenceCounts((List<Integer>) particle.get("a_reference_counts"));
        setAReferenceCountsDims((int) particle.get("a_reference_counts_dims"));
        setAReferenceCountsSizes((List<Long>) particle.get("a_reference_counts_sizes"));
        setCSignalCounts((List<Integer>) particle.get("c_signal_counts"));
        setCSignalCountsDims((int) particle.get("c_signal_counts_dims"));
        setCSignalCountsSizes((List<Long>) particle.get("c_signal_counts_sizes"));
    }

    public long getRawTimeSeconds() {
        return rawTimeSeconds;
    }

    public void setRawTimeSeconds(long rawTimeSeconds) {
        this.rawTimeSeconds = rawTimeSeconds;
    }
    public long getRawTimeMicroseconds() {
        return rawTimeMicroseconds;
    }

    public void setRawTimeMicroseconds(long rawTimeMicroseconds) {
        this.rawTimeMicroseconds = rawTimeMicroseconds;
    }
    public int getPacketType() {
        return packetType;
    }

    public void setPacketType(int packetType) {
        this.packetType = packetType;
    }
    public int getMeterType() {
        return meterType;
    }

    public void setMeterType(int meterType) {
        this.meterType = meterType;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getAReferenceDarkCounts() {
        return aReferenceDarkCounts;
    }

    public void setAReferenceDarkCounts(int aReferenceDarkCounts) {
        this.aReferenceDarkCounts = aReferenceDarkCounts;
    }
    public int getPressureCounts() {
        return pressureCounts;
    }

    public void setPressureCounts(int pressureCounts) {
        this.pressureCounts = pressureCounts;
    }
    public int getASignalDarkCounts() {
        return aSignalDarkCounts;
    }

    public void setASignalDarkCounts(int aSignalDarkCounts) {
        this.aSignalDarkCounts = aSignalDarkCounts;
    }
    public int getExternalTempRaw() {
        return externalTempRaw;
    }

    public void setExternalTempRaw(int externalTempRaw) {
        this.externalTempRaw = externalTempRaw;
    }
    public int getInternalTempRaw() {
        return internalTempRaw;
    }

    public void setInternalTempRaw(int internalTempRaw) {
        this.internalTempRaw = internalTempRaw;
    }
    public int getCReferenceDarkCounts() {
        return cReferenceDarkCounts;
    }

    public void setCReferenceDarkCounts(int cReferenceDarkCounts) {
        this.cReferenceDarkCounts = cReferenceDarkCounts;
    }
    public int getCSignalDarkCounts() {
        return cSignalDarkCounts;
    }

    public void setCSignalDarkCounts(int cSignalDarkCounts) {
        this.cSignalDarkCounts = cSignalDarkCounts;
    }
    public long getElapsedRunTime() {
        return elapsedRunTime;
    }

    public void setElapsedRunTime(long elapsedRunTime) {
        this.elapsedRunTime = elapsedRunTime;
    }
    public int getNumWavelengths() {
        return numWavelengths;
    }

    public void setNumWavelengths(int numWavelengths) {
        this.numWavelengths = numWavelengths;
    }
    public List<Integer> getCReferenceCounts() {
        // TODO - restore original dimensions, (remove fill values?)
        return cReferenceCounts;
    }

    public void setCReferenceCounts(List<Integer> cReferenceCounts) {
        // TODO - flatten for storage, insert fill values
        this.cReferenceCounts = cReferenceCounts;
    }
    public int getCReferenceCountsDims() {
        return cReferenceCountsDims;
    }

    public void setCReferenceCountsDims(int cReferenceCountsDims) {
        this.cReferenceCountsDims = cReferenceCountsDims;
    }
    public List<Long> getCReferenceCountsSizes() {
        return cReferenceCountsSizes;
    }

    public void setCReferenceCountsSizes(List<Long> cReferenceCountsSizes) {
        this.cReferenceCountsSizes = cReferenceCountsSizes;
    }
    public List<Integer> getAReferenceCounts() {
        // TODO - restore original dimensions, (remove fill values?)
        return aReferenceCounts;
    }

    public void setAReferenceCounts(List<Integer> aReferenceCounts) {
        // TODO - flatten for storage, insert fill values
        this.aReferenceCounts = aReferenceCounts;
    }
    public int getAReferenceCountsDims() {
        return aReferenceCountsDims;
    }

    public void setAReferenceCountsDims(int aReferenceCountsDims) {
        this.aReferenceCountsDims = aReferenceCountsDims;
    }
    public List<Long> getAReferenceCountsSizes() {
        return aReferenceCountsSizes;
    }

    public void setAReferenceCountsSizes(List<Long> aReferenceCountsSizes) {
        this.aReferenceCountsSizes = aReferenceCountsSizes;
    }
    public List<Integer> getCSignalCounts() {
        // TODO - restore original dimensions, (remove fill values?)
        return cSignalCounts;
    }

    public void setCSignalCounts(List<Integer> cSignalCounts) {
        // TODO - flatten for storage, insert fill values
        this.cSignalCounts = cSignalCounts;
    }
    public int getCSignalCountsDims() {
        return cSignalCountsDims;
    }

    public void setCSignalCountsDims(int cSignalCountsDims) {
        this.cSignalCountsDims = cSignalCountsDims;
    }
    public List<Long> getCSignalCountsSizes() {
        return cSignalCountsSizes;
    }

    public void setCSignalCountsSizes(List<Long> cSignalCountsSizes) {
        this.cSignalCountsSizes = cSignalCountsSizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}