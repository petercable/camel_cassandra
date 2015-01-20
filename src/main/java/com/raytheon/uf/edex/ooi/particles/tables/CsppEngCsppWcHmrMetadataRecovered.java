package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cspp_eng_cspp_wc_hmr_metadata_recovered")
public class CsppEngCsppWcHmrMetadataRecovered extends CassandraParticle {

    @Column(value = "last_character_controller_id")
    private String lastCharacterControllerId;

    @Column(value = "day_of_year_number")
    private int dayOfYearNumber;

    @Column(value = "fraction_of_day")
    private int fractionOfDay;

    @Column(value = "source_file")
    private String sourceFile;

    @Column(value = "processing_time")
    private String processingTime;

    @Column(value = "preprocessing_software_version")
    private String preprocessingSoftwareVersion;

    @Column(value = "start_date")
    private String startDate;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setLastCharacterControllerId((String) particle.get("last_character_controller_id"));
        setDayOfYearNumber((int) particle.get("day_of_year_number"));
        setFractionOfDay((int) particle.get("fraction_of_day"));
        setSourceFile((String) particle.get("source_file"));
        setProcessingTime((String) particle.get("processing_time"));
        setPreprocessingSoftwareVersion((String) particle.get("preprocessing_software_version"));
        setStartDate((String) particle.get("start_date"));
    }

    public String getLastCharacterControllerId() {
        return lastCharacterControllerId;
    }

    public void setLastCharacterControllerId(String lastCharacterControllerId) {
        this.lastCharacterControllerId = lastCharacterControllerId;
    }
    public int getDayOfYearNumber() {
        return dayOfYearNumber;
    }

    public void setDayOfYearNumber(int dayOfYearNumber) {
        this.dayOfYearNumber = dayOfYearNumber;
    }
    public int getFractionOfDay() {
        return fractionOfDay;
    }

    public void setFractionOfDay(int fractionOfDay) {
        this.fractionOfDay = fractionOfDay;
    }
    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }
    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }
    public String getPreprocessingSoftwareVersion() {
        return preprocessingSoftwareVersion;
    }

    public void setPreprocessingSoftwareVersion(String preprocessingSoftwareVersion) {
        this.preprocessingSoftwareVersion = preprocessingSoftwareVersion;
    }
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}