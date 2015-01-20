package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "hpies_status")
public class HpiesStatus extends CassandraParticle {

    @Column(value = "hpies_data_valid")
    private int hpiesDataValid;

    @Column(value = "hpies_secs")
    private BigInteger hpiesSecs;

    @Column(value = "hpies_hcno")
    private int hpiesHcno;

    @Column(value = "hpies_hcno_last_cal")
    private int hpiesHcnoLastCal;

    @Column(value = "hpies_hcno_last_comp")
    private int hpiesHcnoLastComp;

    @Column(value = "hpies_ofile")
    private String hpiesOfile;

    @Column(value = "hpies_ifok")
    private String hpiesIfok;

    @Column(value = "hpies_compass_fwrite_attempted")
    private int hpiesCompassFwriteAttempted;

    @Column(value = "hpies_compass_fwrite_ofp_null")
    private int hpiesCompassFwriteOfpNull;

    @Column(value = "hpies_mot_pwr_count")
    private int hpiesMotPwrCount;

    @Column(value = "hpies_start_motor_count")
    private long hpiesStartMotorCount;

    @Column(value = "hpies_compass_port_open_errs")
    private int hpiesCompassPortOpenErrs;

    @Column(value = "hpies_compass_port_nerr")
    private int hpiesCompassPortNerr;

    @Column(value = "hpies_tuport_compass_null_count")
    private int hpiesTuportCompassNullCount;

    @Column(value = "hpies_irq2_count")
    private int hpiesIrq2Count;

    @Column(value = "hpies_spurious_count")
    private int hpiesSpuriousCount;

    @Column(value = "hpies_spsr_unknown_count")
    private int hpiesSpsrUnknownCount;

    @Column(value = "hpies_pitperiod_zero_count")
    private int hpiesPitperiodZeroCount;

    @Column(value = "hpies_adc_raw_overflow_count")
    private int hpiesAdcRawOverflowCount;

    @Column(value = "hpies_max7317_add_queue_errs")
    private int hpiesMax7317AddQueueErrs;

    @Column(value = "hpies_wsrun_rtc_pinch_end_nerr")
    private int hpiesWsrunRtcPinchEndNerr;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHpiesDataValid((int) particle.get("hpies_data_valid"));
        setHpiesSecs((BigInteger) particle.get("hpies_secs"));
        setHpiesHcno((int) particle.get("hpies_hcno"));
        setHpiesHcnoLastCal((int) particle.get("hpies_hcno_last_cal"));
        setHpiesHcnoLastComp((int) particle.get("hpies_hcno_last_comp"));
        setHpiesOfile((String) particle.get("hpies_ofile"));
        setHpiesIfok((String) particle.get("hpies_ifok"));
        setHpiesCompassFwriteAttempted((int) particle.get("hpies_compass_fwrite_attempted"));
        setHpiesCompassFwriteOfpNull((int) particle.get("hpies_compass_fwrite_ofp_null"));
        setHpiesMotPwrCount((int) particle.get("hpies_mot_pwr_count"));
        setHpiesStartMotorCount((long) particle.get("hpies_start_motor_count"));
        setHpiesCompassPortOpenErrs((int) particle.get("hpies_compass_port_open_errs"));
        setHpiesCompassPortNerr((int) particle.get("hpies_compass_port_nerr"));
        setHpiesTuportCompassNullCount((int) particle.get("hpies_tuport_compass_null_count"));
        setHpiesIrq2Count((int) particle.get("hpies_irq2_count"));
        setHpiesSpuriousCount((int) particle.get("hpies_spurious_count"));
        setHpiesSpsrUnknownCount((int) particle.get("hpies_spsr_unknown_count"));
        setHpiesPitperiodZeroCount((int) particle.get("hpies_pitperiod_zero_count"));
        setHpiesAdcRawOverflowCount((int) particle.get("hpies_adc_raw_overflow_count"));
        setHpiesMax7317AddQueueErrs((int) particle.get("hpies_max7317_add_queue_errs"));
        setHpiesWsrunRtcPinchEndNerr((int) particle.get("hpies_wsrun_rtc_pinch_end_nerr"));
    }

    public int getHpiesDataValid() {
        return hpiesDataValid;
    }

    public void setHpiesDataValid(int hpiesDataValid) {
        this.hpiesDataValid = hpiesDataValid;
    }
    public BigInteger getHpiesSecs() {
        return hpiesSecs;
    }

    public void setHpiesSecs(BigInteger hpiesSecs) {
        this.hpiesSecs = hpiesSecs;
    }
    public int getHpiesHcno() {
        return hpiesHcno;
    }

    public void setHpiesHcno(int hpiesHcno) {
        this.hpiesHcno = hpiesHcno;
    }
    public int getHpiesHcnoLastCal() {
        return hpiesHcnoLastCal;
    }

    public void setHpiesHcnoLastCal(int hpiesHcnoLastCal) {
        this.hpiesHcnoLastCal = hpiesHcnoLastCal;
    }
    public int getHpiesHcnoLastComp() {
        return hpiesHcnoLastComp;
    }

    public void setHpiesHcnoLastComp(int hpiesHcnoLastComp) {
        this.hpiesHcnoLastComp = hpiesHcnoLastComp;
    }
    public String getHpiesOfile() {
        return hpiesOfile;
    }

    public void setHpiesOfile(String hpiesOfile) {
        this.hpiesOfile = hpiesOfile;
    }
    public String getHpiesIfok() {
        return hpiesIfok;
    }

    public void setHpiesIfok(String hpiesIfok) {
        this.hpiesIfok = hpiesIfok;
    }
    public int getHpiesCompassFwriteAttempted() {
        return hpiesCompassFwriteAttempted;
    }

    public void setHpiesCompassFwriteAttempted(int hpiesCompassFwriteAttempted) {
        this.hpiesCompassFwriteAttempted = hpiesCompassFwriteAttempted;
    }
    public int getHpiesCompassFwriteOfpNull() {
        return hpiesCompassFwriteOfpNull;
    }

    public void setHpiesCompassFwriteOfpNull(int hpiesCompassFwriteOfpNull) {
        this.hpiesCompassFwriteOfpNull = hpiesCompassFwriteOfpNull;
    }
    public int getHpiesMotPwrCount() {
        return hpiesMotPwrCount;
    }

    public void setHpiesMotPwrCount(int hpiesMotPwrCount) {
        this.hpiesMotPwrCount = hpiesMotPwrCount;
    }
    public long getHpiesStartMotorCount() {
        return hpiesStartMotorCount;
    }

    public void setHpiesStartMotorCount(long hpiesStartMotorCount) {
        this.hpiesStartMotorCount = hpiesStartMotorCount;
    }
    public int getHpiesCompassPortOpenErrs() {
        return hpiesCompassPortOpenErrs;
    }

    public void setHpiesCompassPortOpenErrs(int hpiesCompassPortOpenErrs) {
        this.hpiesCompassPortOpenErrs = hpiesCompassPortOpenErrs;
    }
    public int getHpiesCompassPortNerr() {
        return hpiesCompassPortNerr;
    }

    public void setHpiesCompassPortNerr(int hpiesCompassPortNerr) {
        this.hpiesCompassPortNerr = hpiesCompassPortNerr;
    }
    public int getHpiesTuportCompassNullCount() {
        return hpiesTuportCompassNullCount;
    }

    public void setHpiesTuportCompassNullCount(int hpiesTuportCompassNullCount) {
        this.hpiesTuportCompassNullCount = hpiesTuportCompassNullCount;
    }
    public int getHpiesIrq2Count() {
        return hpiesIrq2Count;
    }

    public void setHpiesIrq2Count(int hpiesIrq2Count) {
        this.hpiesIrq2Count = hpiesIrq2Count;
    }
    public int getHpiesSpuriousCount() {
        return hpiesSpuriousCount;
    }

    public void setHpiesSpuriousCount(int hpiesSpuriousCount) {
        this.hpiesSpuriousCount = hpiesSpuriousCount;
    }
    public int getHpiesSpsrUnknownCount() {
        return hpiesSpsrUnknownCount;
    }

    public void setHpiesSpsrUnknownCount(int hpiesSpsrUnknownCount) {
        this.hpiesSpsrUnknownCount = hpiesSpsrUnknownCount;
    }
    public int getHpiesPitperiodZeroCount() {
        return hpiesPitperiodZeroCount;
    }

    public void setHpiesPitperiodZeroCount(int hpiesPitperiodZeroCount) {
        this.hpiesPitperiodZeroCount = hpiesPitperiodZeroCount;
    }
    public int getHpiesAdcRawOverflowCount() {
        return hpiesAdcRawOverflowCount;
    }

    public void setHpiesAdcRawOverflowCount(int hpiesAdcRawOverflowCount) {
        this.hpiesAdcRawOverflowCount = hpiesAdcRawOverflowCount;
    }
    public int getHpiesMax7317AddQueueErrs() {
        return hpiesMax7317AddQueueErrs;
    }

    public void setHpiesMax7317AddQueueErrs(int hpiesMax7317AddQueueErrs) {
        this.hpiesMax7317AddQueueErrs = hpiesMax7317AddQueueErrs;
    }
    public int getHpiesWsrunRtcPinchEndNerr() {
        return hpiesWsrunRtcPinchEndNerr;
    }

    public void setHpiesWsrunRtcPinchEndNerr(int hpiesWsrunRtcPinchEndNerr) {
        this.hpiesWsrunRtcPinchEndNerr = hpiesWsrunRtcPinchEndNerr;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}