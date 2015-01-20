package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "xadcps_jln_stc_instrument")
public class XadcpsJlnStcInstrument extends CassandraParticle {

    @Column(value = "adcps_jln_record")
    private BigInteger adcpsJlnRecord;

    @Column(value = "adcps_jln_number")
    private long adcpsJlnNumber;

    @Column(value = "adcps_jln_unit_id")
    private int adcpsJlnUnitId;

    @Column(value = "adcps_jln_fw_vers")
    private int adcpsJlnFwVers;

    @Column(value = "adcps_jln_fw_rev")
    private int adcpsJlnFwRev;

    @Column(value = "adcps_jln_year")
    private int adcpsJlnYear;

    @Column(value = "adcps_jln_month")
    private int adcpsJlnMonth;

    @Column(value = "adcps_jln_day")
    private int adcpsJlnDay;

    @Column(value = "adcps_jln_hour")
    private int adcpsJlnHour;

    @Column(value = "adcps_jln_minute")
    private int adcpsJlnMinute;

    @Column(value = "adcps_jln_second")
    private int adcpsJlnSecond;

    @Column(value = "adcps_jln_hsec")
    private int adcpsJlnHsec;

    @Column(value = "adcps_jln_heading")
    private int adcpsJlnHeading;

    @Column(value = "adcps_jln_pitch")
    private int adcpsJlnPitch;

    @Column(value = "adcps_jln_roll")
    private int adcpsJlnRoll;

    @Column(value = "adcps_jln_temp")
    private int adcpsJlnTemp;

    @Column(value = "adcps_jln_pressure")
    private int adcpsJlnPressure;

    @Column(value = "adcps_jln_startbin")
    private int adcpsJlnStartbin;

    @Column(value = "adcps_jln_bins")
    private int adcpsJlnBins;

    @Column(value = "adcps_jln_component1")
    private List<Integer> adcpsJlnComponent1;

    @Column(value = "adcps_jln_component1_dims")
    private int adcpsJlnComponent1Dims;

    @Column(value = "adcps_jln_component1_sizes")
    private List<Long> adcpsJlnComponent1Sizes;

    @Column(value = "adcps_jln_component2")
    private List<Integer> adcpsJlnComponent2;

    @Column(value = "adcps_jln_component2_dims")
    private int adcpsJlnComponent2Dims;

    @Column(value = "adcps_jln_component2_sizes")
    private List<Long> adcpsJlnComponent2Sizes;

    @Column(value = "adcps_jln_component3")
    private List<Integer> adcpsJlnComponent3;

    @Column(value = "adcps_jln_component3_dims")
    private int adcpsJlnComponent3Dims;

    @Column(value = "adcps_jln_component3_sizes")
    private List<Long> adcpsJlnComponent3Sizes;

    @Column(value = "adcps_jln_component4")
    private List<Integer> adcpsJlnComponent4;

    @Column(value = "adcps_jln_component4_dims")
    private int adcpsJlnComponent4Dims;

    @Column(value = "adcps_jln_component4_sizes")
    private List<Long> adcpsJlnComponent4Sizes;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setAdcpsJlnRecord((BigInteger) particle.get("adcps_jln_record"));
        setAdcpsJlnNumber((long) particle.get("adcps_jln_number"));
        setAdcpsJlnUnitId((int) particle.get("adcps_jln_unit_id"));
        setAdcpsJlnFwVers((int) particle.get("adcps_jln_fw_vers"));
        setAdcpsJlnFwRev((int) particle.get("adcps_jln_fw_rev"));
        setAdcpsJlnYear((int) particle.get("adcps_jln_year"));
        setAdcpsJlnMonth((int) particle.get("adcps_jln_month"));
        setAdcpsJlnDay((int) particle.get("adcps_jln_day"));
        setAdcpsJlnHour((int) particle.get("adcps_jln_hour"));
        setAdcpsJlnMinute((int) particle.get("adcps_jln_minute"));
        setAdcpsJlnSecond((int) particle.get("adcps_jln_second"));
        setAdcpsJlnHsec((int) particle.get("adcps_jln_hsec"));
        setAdcpsJlnHeading((int) particle.get("adcps_jln_heading"));
        setAdcpsJlnPitch((int) particle.get("adcps_jln_pitch"));
        setAdcpsJlnRoll((int) particle.get("adcps_jln_roll"));
        setAdcpsJlnTemp((int) particle.get("adcps_jln_temp"));
        setAdcpsJlnPressure((int) particle.get("adcps_jln_pressure"));
        setAdcpsJlnStartbin((int) particle.get("adcps_jln_startbin"));
        setAdcpsJlnBins((int) particle.get("adcps_jln_bins"));
        setAdcpsJlnComponent1((List<Integer>) particle.get("adcps_jln_component1"));
        setAdcpsJlnComponent1Dims((int) particle.get("adcps_jln_component1_dims"));
        setAdcpsJlnComponent1Sizes((List<Long>) particle.get("adcps_jln_component1_sizes"));
        setAdcpsJlnComponent2((List<Integer>) particle.get("adcps_jln_component2"));
        setAdcpsJlnComponent2Dims((int) particle.get("adcps_jln_component2_dims"));
        setAdcpsJlnComponent2Sizes((List<Long>) particle.get("adcps_jln_component2_sizes"));
        setAdcpsJlnComponent3((List<Integer>) particle.get("adcps_jln_component3"));
        setAdcpsJlnComponent3Dims((int) particle.get("adcps_jln_component3_dims"));
        setAdcpsJlnComponent3Sizes((List<Long>) particle.get("adcps_jln_component3_sizes"));
        setAdcpsJlnComponent4((List<Integer>) particle.get("adcps_jln_component4"));
        setAdcpsJlnComponent4Dims((int) particle.get("adcps_jln_component4_dims"));
        setAdcpsJlnComponent4Sizes((List<Long>) particle.get("adcps_jln_component4_sizes"));
    }

    public BigInteger getAdcpsJlnRecord() {
        return adcpsJlnRecord;
    }

    public void setAdcpsJlnRecord(BigInteger adcpsJlnRecord) {
        this.adcpsJlnRecord = adcpsJlnRecord;
    }
    public long getAdcpsJlnNumber() {
        return adcpsJlnNumber;
    }

    public void setAdcpsJlnNumber(long adcpsJlnNumber) {
        this.adcpsJlnNumber = adcpsJlnNumber;
    }
    public int getAdcpsJlnUnitId() {
        return adcpsJlnUnitId;
    }

    public void setAdcpsJlnUnitId(int adcpsJlnUnitId) {
        this.adcpsJlnUnitId = adcpsJlnUnitId;
    }
    public int getAdcpsJlnFwVers() {
        return adcpsJlnFwVers;
    }

    public void setAdcpsJlnFwVers(int adcpsJlnFwVers) {
        this.adcpsJlnFwVers = adcpsJlnFwVers;
    }
    public int getAdcpsJlnFwRev() {
        return adcpsJlnFwRev;
    }

    public void setAdcpsJlnFwRev(int adcpsJlnFwRev) {
        this.adcpsJlnFwRev = adcpsJlnFwRev;
    }
    public int getAdcpsJlnYear() {
        return adcpsJlnYear;
    }

    public void setAdcpsJlnYear(int adcpsJlnYear) {
        this.adcpsJlnYear = adcpsJlnYear;
    }
    public int getAdcpsJlnMonth() {
        return adcpsJlnMonth;
    }

    public void setAdcpsJlnMonth(int adcpsJlnMonth) {
        this.adcpsJlnMonth = adcpsJlnMonth;
    }
    public int getAdcpsJlnDay() {
        return adcpsJlnDay;
    }

    public void setAdcpsJlnDay(int adcpsJlnDay) {
        this.adcpsJlnDay = adcpsJlnDay;
    }
    public int getAdcpsJlnHour() {
        return adcpsJlnHour;
    }

    public void setAdcpsJlnHour(int adcpsJlnHour) {
        this.adcpsJlnHour = adcpsJlnHour;
    }
    public int getAdcpsJlnMinute() {
        return adcpsJlnMinute;
    }

    public void setAdcpsJlnMinute(int adcpsJlnMinute) {
        this.adcpsJlnMinute = adcpsJlnMinute;
    }
    public int getAdcpsJlnSecond() {
        return adcpsJlnSecond;
    }

    public void setAdcpsJlnSecond(int adcpsJlnSecond) {
        this.adcpsJlnSecond = adcpsJlnSecond;
    }
    public int getAdcpsJlnHsec() {
        return adcpsJlnHsec;
    }

    public void setAdcpsJlnHsec(int adcpsJlnHsec) {
        this.adcpsJlnHsec = adcpsJlnHsec;
    }
    public int getAdcpsJlnHeading() {
        return adcpsJlnHeading;
    }

    public void setAdcpsJlnHeading(int adcpsJlnHeading) {
        this.adcpsJlnHeading = adcpsJlnHeading;
    }
    public int getAdcpsJlnPitch() {
        return adcpsJlnPitch;
    }

    public void setAdcpsJlnPitch(int adcpsJlnPitch) {
        this.adcpsJlnPitch = adcpsJlnPitch;
    }
    public int getAdcpsJlnRoll() {
        return adcpsJlnRoll;
    }

    public void setAdcpsJlnRoll(int adcpsJlnRoll) {
        this.adcpsJlnRoll = adcpsJlnRoll;
    }
    public int getAdcpsJlnTemp() {
        return adcpsJlnTemp;
    }

    public void setAdcpsJlnTemp(int adcpsJlnTemp) {
        this.adcpsJlnTemp = adcpsJlnTemp;
    }
    public int getAdcpsJlnPressure() {
        return adcpsJlnPressure;
    }

    public void setAdcpsJlnPressure(int adcpsJlnPressure) {
        this.adcpsJlnPressure = adcpsJlnPressure;
    }
    public int getAdcpsJlnStartbin() {
        return adcpsJlnStartbin;
    }

    public void setAdcpsJlnStartbin(int adcpsJlnStartbin) {
        this.adcpsJlnStartbin = adcpsJlnStartbin;
    }
    public int getAdcpsJlnBins() {
        return adcpsJlnBins;
    }

    public void setAdcpsJlnBins(int adcpsJlnBins) {
        this.adcpsJlnBins = adcpsJlnBins;
    }
    public List<Integer> getAdcpsJlnComponent1() {
        // TODO - restore original dimensions, (remove fill values?)
        return adcpsJlnComponent1;
    }

    public void setAdcpsJlnComponent1(List<Integer> adcpsJlnComponent1) {
        // TODO - flatten for storage, insert fill values
        this.adcpsJlnComponent1 = adcpsJlnComponent1;
    }
    public int getAdcpsJlnComponent1Dims() {
        return adcpsJlnComponent1Dims;
    }

    public void setAdcpsJlnComponent1Dims(int adcpsJlnComponent1Dims) {
        this.adcpsJlnComponent1Dims = adcpsJlnComponent1Dims;
    }
    public List<Long> getAdcpsJlnComponent1Sizes() {
        return adcpsJlnComponent1Sizes;
    }

    public void setAdcpsJlnComponent1Sizes(List<Long> adcpsJlnComponent1Sizes) {
        this.adcpsJlnComponent1Sizes = adcpsJlnComponent1Sizes;
    }
    public List<Integer> getAdcpsJlnComponent2() {
        // TODO - restore original dimensions, (remove fill values?)
        return adcpsJlnComponent2;
    }

    public void setAdcpsJlnComponent2(List<Integer> adcpsJlnComponent2) {
        // TODO - flatten for storage, insert fill values
        this.adcpsJlnComponent2 = adcpsJlnComponent2;
    }
    public int getAdcpsJlnComponent2Dims() {
        return adcpsJlnComponent2Dims;
    }

    public void setAdcpsJlnComponent2Dims(int adcpsJlnComponent2Dims) {
        this.adcpsJlnComponent2Dims = adcpsJlnComponent2Dims;
    }
    public List<Long> getAdcpsJlnComponent2Sizes() {
        return adcpsJlnComponent2Sizes;
    }

    public void setAdcpsJlnComponent2Sizes(List<Long> adcpsJlnComponent2Sizes) {
        this.adcpsJlnComponent2Sizes = adcpsJlnComponent2Sizes;
    }
    public List<Integer> getAdcpsJlnComponent3() {
        // TODO - restore original dimensions, (remove fill values?)
        return adcpsJlnComponent3;
    }

    public void setAdcpsJlnComponent3(List<Integer> adcpsJlnComponent3) {
        // TODO - flatten for storage, insert fill values
        this.adcpsJlnComponent3 = adcpsJlnComponent3;
    }
    public int getAdcpsJlnComponent3Dims() {
        return adcpsJlnComponent3Dims;
    }

    public void setAdcpsJlnComponent3Dims(int adcpsJlnComponent3Dims) {
        this.adcpsJlnComponent3Dims = adcpsJlnComponent3Dims;
    }
    public List<Long> getAdcpsJlnComponent3Sizes() {
        return adcpsJlnComponent3Sizes;
    }

    public void setAdcpsJlnComponent3Sizes(List<Long> adcpsJlnComponent3Sizes) {
        this.adcpsJlnComponent3Sizes = adcpsJlnComponent3Sizes;
    }
    public List<Integer> getAdcpsJlnComponent4() {
        // TODO - restore original dimensions, (remove fill values?)
        return adcpsJlnComponent4;
    }

    public void setAdcpsJlnComponent4(List<Integer> adcpsJlnComponent4) {
        // TODO - flatten for storage, insert fill values
        this.adcpsJlnComponent4 = adcpsJlnComponent4;
    }
    public int getAdcpsJlnComponent4Dims() {
        return adcpsJlnComponent4Dims;
    }

    public void setAdcpsJlnComponent4Dims(int adcpsJlnComponent4Dims) {
        this.adcpsJlnComponent4Dims = adcpsJlnComponent4Dims;
    }
    public List<Long> getAdcpsJlnComponent4Sizes() {
        return adcpsJlnComponent4Sizes;
    }

    public void setAdcpsJlnComponent4Sizes(List<Long> adcpsJlnComponent4Sizes) {
        this.adcpsJlnComponent4Sizes = adcpsJlnComponent4Sizes;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}