package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "hpies_data_header")
public class HpiesDataHeader extends CassandraParticle {

    @Column(value = "hpies_data_valid")
    private int hpiesDataValid;

    @Column(value = "hpies_ver")
    private int hpiesVer;

    @Column(value = "hpies_type")
    private String hpiesType;

    @Column(value = "hpies_dest")
    private String hpiesDest;

    @Column(value = "hpies_ibeg")
    private int hpiesIbeg;

    @Column(value = "hpies_iend")
    private int hpiesIend;

    @Column(value = "hpies_hcno")
    private int hpiesHcno;

    @Column(value = "hpies_secs")
    private BigInteger hpiesSecs;

    @Column(value = "hpies_tics")
    private int hpiesTics;

    @Column(value = "hpies_navg_mot")
    private int hpiesNavgMot;

    @Column(value = "hpies_navg_ef")
    private int hpiesNavgEf;

    @Column(value = "hpies_navg_cal")
    private int hpiesNavgCal;

    @Column(value = "hpies_stm_timestamp")
    private BigInteger hpiesStmTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHpiesDataValid((int) particle.get("hpies_data_valid"));
        setHpiesVer((int) particle.get("hpies_ver"));
        setHpiesType((String) particle.get("hpies_type"));
        setHpiesDest((String) particle.get("hpies_dest"));
        setHpiesIbeg((int) particle.get("hpies_ibeg"));
        setHpiesIend((int) particle.get("hpies_iend"));
        setHpiesHcno((int) particle.get("hpies_hcno"));
        setHpiesSecs((BigInteger) particle.get("hpies_secs"));
        setHpiesTics((int) particle.get("hpies_tics"));
        setHpiesNavgMot((int) particle.get("hpies_navg_mot"));
        setHpiesNavgEf((int) particle.get("hpies_navg_ef"));
        setHpiesNavgCal((int) particle.get("hpies_navg_cal"));
        setHpiesStmTimestamp((BigInteger) particle.get("hpies_stm_timestamp"));
    }

    public int getHpiesDataValid() {
        return hpiesDataValid;
    }

    public void setHpiesDataValid(int hpiesDataValid) {
        this.hpiesDataValid = hpiesDataValid;
    }
    public int getHpiesVer() {
        return hpiesVer;
    }

    public void setHpiesVer(int hpiesVer) {
        this.hpiesVer = hpiesVer;
    }
    public String getHpiesType() {
        return hpiesType;
    }

    public void setHpiesType(String hpiesType) {
        this.hpiesType = hpiesType;
    }
    public String getHpiesDest() {
        return hpiesDest;
    }

    public void setHpiesDest(String hpiesDest) {
        this.hpiesDest = hpiesDest;
    }
    public int getHpiesIbeg() {
        return hpiesIbeg;
    }

    public void setHpiesIbeg(int hpiesIbeg) {
        this.hpiesIbeg = hpiesIbeg;
    }
    public int getHpiesIend() {
        return hpiesIend;
    }

    public void setHpiesIend(int hpiesIend) {
        this.hpiesIend = hpiesIend;
    }
    public int getHpiesHcno() {
        return hpiesHcno;
    }

    public void setHpiesHcno(int hpiesHcno) {
        this.hpiesHcno = hpiesHcno;
    }
    public BigInteger getHpiesSecs() {
        return hpiesSecs;
    }

    public void setHpiesSecs(BigInteger hpiesSecs) {
        this.hpiesSecs = hpiesSecs;
    }
    public int getHpiesTics() {
        return hpiesTics;
    }

    public void setHpiesTics(int hpiesTics) {
        this.hpiesTics = hpiesTics;
    }
    public int getHpiesNavgMot() {
        return hpiesNavgMot;
    }

    public void setHpiesNavgMot(int hpiesNavgMot) {
        this.hpiesNavgMot = hpiesNavgMot;
    }
    public int getHpiesNavgEf() {
        return hpiesNavgEf;
    }

    public void setHpiesNavgEf(int hpiesNavgEf) {
        this.hpiesNavgEf = hpiesNavgEf;
    }
    public int getHpiesNavgCal() {
        return hpiesNavgCal;
    }

    public void setHpiesNavgCal(int hpiesNavgCal) {
        this.hpiesNavgCal = hpiesNavgCal;
    }
    public BigInteger getHpiesStmTimestamp() {
        return hpiesStmTimestamp;
    }

    public void setHpiesStmTimestamp(BigInteger hpiesStmTimestamp) {
        this.hpiesStmTimestamp = hpiesStmTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}