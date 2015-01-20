package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "stm_timestamp")
public class StmTimestamp extends CassandraParticle {

    @Column(value = "hpies_data_valid")
    private int hpiesDataValid;

    @Column(value = "hpies_stm_timestamp")
    private BigInteger hpiesStmTimestamp;

    @Column(value = "hpies_rsn_timestamp")
    private BigInteger hpiesRsnTimestamp;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHpiesDataValid((int) particle.get("hpies_data_valid"));
        setHpiesStmTimestamp((BigInteger) particle.get("hpies_stm_timestamp"));
        setHpiesRsnTimestamp((BigInteger) particle.get("hpies_rsn_timestamp"));
    }

    public int getHpiesDataValid() {
        return hpiesDataValid;
    }

    public void setHpiesDataValid(int hpiesDataValid) {
        this.hpiesDataValid = hpiesDataValid;
    }
    public BigInteger getHpiesStmTimestamp() {
        return hpiesStmTimestamp;
    }

    public void setHpiesStmTimestamp(BigInteger hpiesStmTimestamp) {
        this.hpiesStmTimestamp = hpiesStmTimestamp;
    }
    public BigInteger getHpiesRsnTimestamp() {
        return hpiesRsnTimestamp;
    }

    public void setHpiesRsnTimestamp(BigInteger hpiesRsnTimestamp) {
        this.hpiesRsnTimestamp = hpiesRsnTimestamp;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}