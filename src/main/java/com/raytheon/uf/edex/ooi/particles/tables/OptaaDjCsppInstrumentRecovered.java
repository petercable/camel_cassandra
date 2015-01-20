package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "optaa_dj_cspp_instrument_recovered")
public class OptaaDjCsppInstrumentRecovered extends CassandraParticle {

    @Column(value = "profiler_timestamp")
    private double profilerTimestamp;

    @Column(value = "pressure_depth")
    private float pressureDepth;

    @Column(value = "suspect_timestamp")
    private int suspectTimestamp;

    @Column(value = "on_seconds")
    private float onSeconds;

    @Column(value = "num_wavelengths")
    private int numWavelengths;

    @Column(value = "c_reference_dark_counts")
    private int cReferenceDarkCounts;

    @Column(value = "c_reference_counts")
    private List<Integer> cReferenceCounts;

    @Column(value = "c_reference_counts_dims")
    private int cReferenceCountsDims;

    @Column(value = "c_reference_counts_sizes")
    private List<Long> cReferenceCountsSizes;

    @Column(value = "c_signal_dark_counts")
    private int cSignalDarkCounts;

    @Column(value = "c_signal_counts")
    private List<Integer> cSignalCounts;

    @Column(value = "c_signal_counts_dims")
    private int cSignalCountsDims;

    @Column(value = "c_signal_counts_sizes")
    private List<Long> cSignalCountsSizes;

    @Column(value = "a_reference_dark_counts")
    private int aReferenceDarkCounts;

    @Column(value = "a_reference_counts")
    private List<Integer> aReferenceCounts;

    @Column(value = "a_reference_counts_dims")
    private int aReferenceCountsDims;

    @Column(value = "a_reference_counts_sizes")
    private List<Long> aReferenceCountsSizes;

    @Column(value = "a_signal_dark_counts")
    private int aSignalDarkCounts;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProfilerTimestamp((double) particle.get("profiler_timestamp"));
        setPressureDepth((float) particle.get("pressure_depth"));
        setSuspectTimestamp((int) particle.get("suspect_timestamp"));
        setOnSeconds((float) particle.get("on_seconds"));
        setNumWavelengths((int) particle.get("num_wavelengths"));
        setCReferenceDarkCounts((int) particle.get("c_reference_dark_counts"));
        setCReferenceCounts((List<Integer>) particle.get("c_reference_counts"));
        setCReferenceCountsDims((int) particle.get("c_reference_counts_dims"));
        setCReferenceCountsSizes((List<Long>) particle.get("c_reference_counts_sizes"));
        setCSignalDarkCounts((int) particle.get("c_signal_dark_counts"));
        setCSignalCounts((List<Integer>) particle.get("c_signal_counts"));
        setCSignalCountsDims((int) particle.get("c_signal_counts_dims"));
        setCSignalCountsSizes((List<Long>) particle.get("c_signal_counts_sizes"));
        setAReferenceDarkCounts((int) particle.get("a_reference_dark_counts"));
        setAReferenceCounts((List<Integer>) particle.get("a_reference_counts"));
        setAReferenceCountsDims((int) particle.get("a_reference_counts_dims"));
        setAReferenceCountsSizes((List<Long>) particle.get("a_reference_counts_sizes"));
        setASignalDarkCounts((int) particle.get("a_signal_dark_counts"));
    }

    public double getProfilerTimestamp() {
        return profilerTimestamp;
    }

    public void setProfilerTimestamp(double profilerTimestamp) {
        this.profilerTimestamp = profilerTimestamp;
    }
    public float getPressureDepth() {
        return pressureDepth;
    }

    public void setPressureDepth(float pressureDepth) {
        this.pressureDepth = pressureDepth;
    }
    public int getSuspectTimestamp() {
        return suspectTimestamp;
    }

    public void setSuspectTimestamp(int suspectTimestamp) {
        this.suspectTimestamp = suspectTimestamp;
    }
    public float getOnSeconds() {
        return onSeconds;
    }

    public void setOnSeconds(float onSeconds) {
        this.onSeconds = onSeconds;
    }
    public int getNumWavelengths() {
        return numWavelengths;
    }

    public void setNumWavelengths(int numWavelengths) {
        this.numWavelengths = numWavelengths;
    }
    public int getCReferenceDarkCounts() {
        return cReferenceDarkCounts;
    }

    public void setCReferenceDarkCounts(int cReferenceDarkCounts) {
        this.cReferenceDarkCounts = cReferenceDarkCounts;
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
    public int getCSignalDarkCounts() {
        return cSignalDarkCounts;
    }

    public void setCSignalDarkCounts(int cSignalDarkCounts) {
        this.cSignalDarkCounts = cSignalDarkCounts;
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
    public int getAReferenceDarkCounts() {
        return aReferenceDarkCounts;
    }

    public void setAReferenceDarkCounts(int aReferenceDarkCounts) {
        this.aReferenceDarkCounts = aReferenceDarkCounts;
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
    public int getASignalDarkCounts() {
        return aSignalDarkCounts;
    }

    public void setASignalDarkCounts(int aSignalDarkCounts) {
        this.aSignalDarkCounts = aSignalDarkCounts;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}