package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dpc_ctd_instrument_recovered")
public class DpcCtdInstrumentRecovered extends CassandraParticle {

    @Column(value = "raw_time_seconds")
    private long rawTimeSeconds;

    @Column(value = "raw_time_microseconds")
    private long rawTimeMicroseconds;

    @Column(value = "conductivity_millisiemens")
    private float conductivityMillisiemens;

    @Column(value = "temp")
    private float temp;

    @Column(value = "pressure")
    private float pressure;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setRawTimeSeconds((long) particle.get("raw_time_seconds"));
        setRawTimeMicroseconds((long) particle.get("raw_time_microseconds"));
        setConductivityMillisiemens((float) particle.get("conductivity_millisiemens"));
        setTemp((float) particle.get("temp"));
        setPressure((float) particle.get("pressure"));
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
    public float getConductivityMillisiemens() {
        return conductivityMillisiemens;
    }

    public void setConductivityMillisiemens(float conductivityMillisiemens) {
        this.conductivityMillisiemens = conductivityMillisiemens;
    }
    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}