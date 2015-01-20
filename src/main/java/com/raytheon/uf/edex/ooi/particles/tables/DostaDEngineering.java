package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "dosta_d_engineering")
public class DostaDEngineering extends CassandraParticle {

    @Column(value = "product_name")
    private String productName;

    @Column(value = "product_number")
    private int productNumber;

    @Column(value = "serial_number")
    private int serialNumber;

    @Column(value = "software_id")
    private long softwareId;

    @Column(value = "software_version")
    private List<Integer> softwareVersion;

    @Column(value = "software_version_dims")
    private int softwareVersionDims;

    @Column(value = "software_version_sizes")
    private List<Long> softwareVersionSizes;

    @Column(value = "node_description")
    private String nodeDescription;

    @Column(value = "owner_description")
    private String ownerDescription;

    @Column(value = "salinity_comp")
    private float salinityComp;

    @Column(value = "phase_coef")
    private List<Float> phaseCoef;

    @Column(value = "phase_coef_dims")
    private int phaseCoefDims;

    @Column(value = "phase_coef_sizes")
    private List<Long> phaseCoefSizes;

    @Column(value = "foil_id")
    private String foilId;

    @Column(value = "foil_coef_a")
    private List<Float> foilCoefA;

    @Column(value = "foil_coef_a_dims")
    private int foilCoefADims;

    @Column(value = "foil_coef_a_sizes")
    private List<Long> foilCoefASizes;

    @Column(value = "foil_coef_b")
    private List<Float> foilCoefB;

    @Column(value = "foil_coef_b_dims")
    private int foilCoefBDims;

    @Column(value = "foil_coef_b_sizes")
    private List<Long> foilCoefBSizes;

    @Column(value = "foil_poly_deg_t")
    private List<Integer> foilPolyDegT;

    @Column(value = "foil_poly_deg_t_dims")
    private int foilPolyDegTDims;

    @Column(value = "foil_poly_deg_t_sizes")
    private List<Long> foilPolyDegTSizes;

    @Column(value = "foil_poly_deg_o")
    private List<Integer> foilPolyDegO;

    @Column(value = "foil_poly_deg_o_dims")
    private int foilPolyDegODims;

    @Column(value = "foil_poly_deg_o_sizes")
    private List<Long> foilPolyDegOSizes;

    @Column(value = "svu_cal_coefs")
    private List<Float> svuCalCoefs;

    @Column(value = "svu_cal_coefs_dims")
    private int svuCalCoefsDims;

    @Column(value = "svu_cal_coefs_sizes")
    private List<Long> svuCalCoefsSizes;

    @Column(value = "conc_coefs")
    private List<Float> concCoefs;

    @Column(value = "conc_coefs_dims")
    private int concCoefsDims;

    @Column(value = "conc_coefs_sizes")
    private List<Long> concCoefsSizes;

    @Column(value = "nom_air_press")
    private float nomAirPress;

    @Column(value = "nom_air_mix")
    private float nomAirMix;

    @Column(value = "cal_data_sat")
    private List<Float> calDataSat;

    @Column(value = "cal_data_sat_dims")
    private int calDataSatDims;

    @Column(value = "cal_data_sat_sizes")
    private List<Long> calDataSatSizes;

    @Column(value = "cal_data_air_press")
    private float calDataAirPress;

    @Column(value = "cal_data_zero")
    private List<Float> calDataZero;

    @Column(value = "cal_data_zero_dims")
    private int calDataZeroDims;

    @Column(value = "cal_data_zero_sizes")
    private List<Long> calDataZeroSizes;

    @Column(value = "red_reference")
    private int redReference;

    @Column(value = "red_ref_interval")
    private int redRefInterval;

    @Column(value = "operation_mode")
    private String operationMode;

    @Column(value = "sleep_mode")
    private int sleepMode;

    @Column(value = "polled_mode")
    private int polledMode;

    @Column(value = "enable_text")
    private int enableText;

    @Column(value = "decimal_format")
    private int decimalFormat;

    @Column(value = "temp_limits")
    private List<Float> tempLimits;

    @Column(value = "temp_limits_dims")
    private int tempLimitsDims;

    @Column(value = "temp_limits_sizes")
    private List<Long> tempLimitsSizes;

    @Column(value = "conc_limits")
    private List<Float> concLimits;

    @Column(value = "conc_limits_dims")
    private int concLimitsDims;

    @Column(value = "conc_limits_sizes")
    private List<Long> concLimitsSizes;

    @Column(value = "sat_limits")
    private List<Float> satLimits;

    @Column(value = "sat_limits_dims")
    private int satLimitsDims;

    @Column(value = "sat_limits_sizes")
    private List<Long> satLimitsSizes;

    @Column(value = "phase_limits")
    private List<Float> phaseLimits;

    @Column(value = "phase_limits_dims")
    private int phaseLimitsDims;

    @Column(value = "phase_limits_sizes")
    private List<Long> phaseLimitsSizes;

    @Column(value = "analog_output")
    private String analogOutput;

    @Column(value = "analog_1_coefs")
    private List<Float> analog1Coefs;

    @Column(value = "analog_1_coefs_dims")
    private int analog1CoefsDims;

    @Column(value = "analog_1_coefs_sizes")
    private List<Long> analog1CoefsSizes;

    @Column(value = "analog_2_coefs")
    private List<Float> analog2Coefs;

    @Column(value = "analog_2_coefs_dims")
    private int analog2CoefsDims;

    @Column(value = "analog_2_coefs_sizes")
    private List<Long> analog2CoefsSizes;

    @Column(value = "air_saturation")
    private int airSaturation;

    @Column(value = "enable_raw_data")
    private int enableRawData;

    @Column(value = "enable_temp")
    private int enableTemp;

    @Column(value = "humidity_comp")
    private int humidityComp;

    @Column(value = "enable_svu")
    private int enableSvu;

    @Column(value = "sampling_interval")
    private float samplingInterval;

    @Column(value = "location_description")
    private String locationDescription;

    @Column(value = "geographic_position_description")
    private String geographicPositionDescription;

    @Column(value = "vertical_position_description")
    private float verticalPositionDescription;

    @Column(value = "reference_description")
    private String referenceDescription;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setProductName((String) particle.get("product_name"));
        setProductNumber((int) particle.get("product_number"));
        setSerialNumber((int) particle.get("serial_number"));
        setSoftwareId((long) particle.get("software_id"));
        setSoftwareVersion((List<Integer>) particle.get("software_version"));
        setSoftwareVersionDims((int) particle.get("software_version_dims"));
        setSoftwareVersionSizes((List<Long>) particle.get("software_version_sizes"));
        setNodeDescription((String) particle.get("node_description"));
        setOwnerDescription((String) particle.get("owner_description"));
        setSalinityComp((float) particle.get("salinity_comp"));
        setPhaseCoef((List<Float>) particle.get("phase_coef"));
        setPhaseCoefDims((int) particle.get("phase_coef_dims"));
        setPhaseCoefSizes((List<Long>) particle.get("phase_coef_sizes"));
        setFoilId((String) particle.get("foil_id"));
        setFoilCoefA((List<Float>) particle.get("foil_coef_a"));
        setFoilCoefADims((int) particle.get("foil_coef_a_dims"));
        setFoilCoefASizes((List<Long>) particle.get("foil_coef_a_sizes"));
        setFoilCoefB((List<Float>) particle.get("foil_coef_b"));
        setFoilCoefBDims((int) particle.get("foil_coef_b_dims"));
        setFoilCoefBSizes((List<Long>) particle.get("foil_coef_b_sizes"));
        setFoilPolyDegT((List<Integer>) particle.get("foil_poly_deg_t"));
        setFoilPolyDegTDims((int) particle.get("foil_poly_deg_t_dims"));
        setFoilPolyDegTSizes((List<Long>) particle.get("foil_poly_deg_t_sizes"));
        setFoilPolyDegO((List<Integer>) particle.get("foil_poly_deg_o"));
        setFoilPolyDegODims((int) particle.get("foil_poly_deg_o_dims"));
        setFoilPolyDegOSizes((List<Long>) particle.get("foil_poly_deg_o_sizes"));
        setSvuCalCoefs((List<Float>) particle.get("svu_cal_coefs"));
        setSvuCalCoefsDims((int) particle.get("svu_cal_coefs_dims"));
        setSvuCalCoefsSizes((List<Long>) particle.get("svu_cal_coefs_sizes"));
        setConcCoefs((List<Float>) particle.get("conc_coefs"));
        setConcCoefsDims((int) particle.get("conc_coefs_dims"));
        setConcCoefsSizes((List<Long>) particle.get("conc_coefs_sizes"));
        setNomAirPress((float) particle.get("nom_air_press"));
        setNomAirMix((float) particle.get("nom_air_mix"));
        setCalDataSat((List<Float>) particle.get("cal_data_sat"));
        setCalDataSatDims((int) particle.get("cal_data_sat_dims"));
        setCalDataSatSizes((List<Long>) particle.get("cal_data_sat_sizes"));
        setCalDataAirPress((float) particle.get("cal_data_air_press"));
        setCalDataZero((List<Float>) particle.get("cal_data_zero"));
        setCalDataZeroDims((int) particle.get("cal_data_zero_dims"));
        setCalDataZeroSizes((List<Long>) particle.get("cal_data_zero_sizes"));
        setRedReference((int) particle.get("red_reference"));
        setRedRefInterval((int) particle.get("red_ref_interval"));
        setOperationMode((String) particle.get("operation_mode"));
        setSleepMode((int) particle.get("sleep_mode"));
        setPolledMode((int) particle.get("polled_mode"));
        setEnableText((int) particle.get("enable_text"));
        setDecimalFormat((int) particle.get("decimal_format"));
        setTempLimits((List<Float>) particle.get("temp_limits"));
        setTempLimitsDims((int) particle.get("temp_limits_dims"));
        setTempLimitsSizes((List<Long>) particle.get("temp_limits_sizes"));
        setConcLimits((List<Float>) particle.get("conc_limits"));
        setConcLimitsDims((int) particle.get("conc_limits_dims"));
        setConcLimitsSizes((List<Long>) particle.get("conc_limits_sizes"));
        setSatLimits((List<Float>) particle.get("sat_limits"));
        setSatLimitsDims((int) particle.get("sat_limits_dims"));
        setSatLimitsSizes((List<Long>) particle.get("sat_limits_sizes"));
        setPhaseLimits((List<Float>) particle.get("phase_limits"));
        setPhaseLimitsDims((int) particle.get("phase_limits_dims"));
        setPhaseLimitsSizes((List<Long>) particle.get("phase_limits_sizes"));
        setAnalogOutput((String) particle.get("analog_output"));
        setAnalog1Coefs((List<Float>) particle.get("analog_1_coefs"));
        setAnalog1CoefsDims((int) particle.get("analog_1_coefs_dims"));
        setAnalog1CoefsSizes((List<Long>) particle.get("analog_1_coefs_sizes"));
        setAnalog2Coefs((List<Float>) particle.get("analog_2_coefs"));
        setAnalog2CoefsDims((int) particle.get("analog_2_coefs_dims"));
        setAnalog2CoefsSizes((List<Long>) particle.get("analog_2_coefs_sizes"));
        setAirSaturation((int) particle.get("air_saturation"));
        setEnableRawData((int) particle.get("enable_raw_data"));
        setEnableTemp((int) particle.get("enable_temp"));
        setHumidityComp((int) particle.get("humidity_comp"));
        setEnableSvu((int) particle.get("enable_svu"));
        setSamplingInterval((float) particle.get("sampling_interval"));
        setLocationDescription((String) particle.get("location_description"));
        setGeographicPositionDescription((String) particle.get("geographic_position_description"));
        setVerticalPositionDescription((float) particle.get("vertical_position_description"));
        setReferenceDescription((String) particle.get("reference_description"));
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public long getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(long softwareId) {
        this.softwareId = softwareId;
    }
    public List<Integer> getSoftwareVersion() {
        // TODO - restore original dimensions, (remove fill values?)
        return softwareVersion;
    }

    public void setSoftwareVersion(List<Integer> softwareVersion) {
        // TODO - flatten for storage, insert fill values
        this.softwareVersion = softwareVersion;
    }
    public int getSoftwareVersionDims() {
        return softwareVersionDims;
    }

    public void setSoftwareVersionDims(int softwareVersionDims) {
        this.softwareVersionDims = softwareVersionDims;
    }
    public List<Long> getSoftwareVersionSizes() {
        return softwareVersionSizes;
    }

    public void setSoftwareVersionSizes(List<Long> softwareVersionSizes) {
        this.softwareVersionSizes = softwareVersionSizes;
    }
    public String getNodeDescription() {
        return nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }
    public String getOwnerDescription() {
        return ownerDescription;
    }

    public void setOwnerDescription(String ownerDescription) {
        this.ownerDescription = ownerDescription;
    }
    public float getSalinityComp() {
        return salinityComp;
    }

    public void setSalinityComp(float salinityComp) {
        this.salinityComp = salinityComp;
    }
    public List<Float> getPhaseCoef() {
        // TODO - restore original dimensions, (remove fill values?)
        return phaseCoef;
    }

    public void setPhaseCoef(List<Float> phaseCoef) {
        // TODO - flatten for storage, insert fill values
        this.phaseCoef = phaseCoef;
    }
    public int getPhaseCoefDims() {
        return phaseCoefDims;
    }

    public void setPhaseCoefDims(int phaseCoefDims) {
        this.phaseCoefDims = phaseCoefDims;
    }
    public List<Long> getPhaseCoefSizes() {
        return phaseCoefSizes;
    }

    public void setPhaseCoefSizes(List<Long> phaseCoefSizes) {
        this.phaseCoefSizes = phaseCoefSizes;
    }
    public String getFoilId() {
        return foilId;
    }

    public void setFoilId(String foilId) {
        this.foilId = foilId;
    }
    public List<Float> getFoilCoefA() {
        // TODO - restore original dimensions, (remove fill values?)
        return foilCoefA;
    }

    public void setFoilCoefA(List<Float> foilCoefA) {
        // TODO - flatten for storage, insert fill values
        this.foilCoefA = foilCoefA;
    }
    public int getFoilCoefADims() {
        return foilCoefADims;
    }

    public void setFoilCoefADims(int foilCoefADims) {
        this.foilCoefADims = foilCoefADims;
    }
    public List<Long> getFoilCoefASizes() {
        return foilCoefASizes;
    }

    public void setFoilCoefASizes(List<Long> foilCoefASizes) {
        this.foilCoefASizes = foilCoefASizes;
    }
    public List<Float> getFoilCoefB() {
        // TODO - restore original dimensions, (remove fill values?)
        return foilCoefB;
    }

    public void setFoilCoefB(List<Float> foilCoefB) {
        // TODO - flatten for storage, insert fill values
        this.foilCoefB = foilCoefB;
    }
    public int getFoilCoefBDims() {
        return foilCoefBDims;
    }

    public void setFoilCoefBDims(int foilCoefBDims) {
        this.foilCoefBDims = foilCoefBDims;
    }
    public List<Long> getFoilCoefBSizes() {
        return foilCoefBSizes;
    }

    public void setFoilCoefBSizes(List<Long> foilCoefBSizes) {
        this.foilCoefBSizes = foilCoefBSizes;
    }
    public List<Integer> getFoilPolyDegT() {
        // TODO - restore original dimensions, (remove fill values?)
        return foilPolyDegT;
    }

    public void setFoilPolyDegT(List<Integer> foilPolyDegT) {
        // TODO - flatten for storage, insert fill values
        this.foilPolyDegT = foilPolyDegT;
    }
    public int getFoilPolyDegTDims() {
        return foilPolyDegTDims;
    }

    public void setFoilPolyDegTDims(int foilPolyDegTDims) {
        this.foilPolyDegTDims = foilPolyDegTDims;
    }
    public List<Long> getFoilPolyDegTSizes() {
        return foilPolyDegTSizes;
    }

    public void setFoilPolyDegTSizes(List<Long> foilPolyDegTSizes) {
        this.foilPolyDegTSizes = foilPolyDegTSizes;
    }
    public List<Integer> getFoilPolyDegO() {
        // TODO - restore original dimensions, (remove fill values?)
        return foilPolyDegO;
    }

    public void setFoilPolyDegO(List<Integer> foilPolyDegO) {
        // TODO - flatten for storage, insert fill values
        this.foilPolyDegO = foilPolyDegO;
    }
    public int getFoilPolyDegODims() {
        return foilPolyDegODims;
    }

    public void setFoilPolyDegODims(int foilPolyDegODims) {
        this.foilPolyDegODims = foilPolyDegODims;
    }
    public List<Long> getFoilPolyDegOSizes() {
        return foilPolyDegOSizes;
    }

    public void setFoilPolyDegOSizes(List<Long> foilPolyDegOSizes) {
        this.foilPolyDegOSizes = foilPolyDegOSizes;
    }
    public List<Float> getSvuCalCoefs() {
        // TODO - restore original dimensions, (remove fill values?)
        return svuCalCoefs;
    }

    public void setSvuCalCoefs(List<Float> svuCalCoefs) {
        // TODO - flatten for storage, insert fill values
        this.svuCalCoefs = svuCalCoefs;
    }
    public int getSvuCalCoefsDims() {
        return svuCalCoefsDims;
    }

    public void setSvuCalCoefsDims(int svuCalCoefsDims) {
        this.svuCalCoefsDims = svuCalCoefsDims;
    }
    public List<Long> getSvuCalCoefsSizes() {
        return svuCalCoefsSizes;
    }

    public void setSvuCalCoefsSizes(List<Long> svuCalCoefsSizes) {
        this.svuCalCoefsSizes = svuCalCoefsSizes;
    }
    public List<Float> getConcCoefs() {
        // TODO - restore original dimensions, (remove fill values?)
        return concCoefs;
    }

    public void setConcCoefs(List<Float> concCoefs) {
        // TODO - flatten for storage, insert fill values
        this.concCoefs = concCoefs;
    }
    public int getConcCoefsDims() {
        return concCoefsDims;
    }

    public void setConcCoefsDims(int concCoefsDims) {
        this.concCoefsDims = concCoefsDims;
    }
    public List<Long> getConcCoefsSizes() {
        return concCoefsSizes;
    }

    public void setConcCoefsSizes(List<Long> concCoefsSizes) {
        this.concCoefsSizes = concCoefsSizes;
    }
    public float getNomAirPress() {
        return nomAirPress;
    }

    public void setNomAirPress(float nomAirPress) {
        this.nomAirPress = nomAirPress;
    }
    public float getNomAirMix() {
        return nomAirMix;
    }

    public void setNomAirMix(float nomAirMix) {
        this.nomAirMix = nomAirMix;
    }
    public List<Float> getCalDataSat() {
        // TODO - restore original dimensions, (remove fill values?)
        return calDataSat;
    }

    public void setCalDataSat(List<Float> calDataSat) {
        // TODO - flatten for storage, insert fill values
        this.calDataSat = calDataSat;
    }
    public int getCalDataSatDims() {
        return calDataSatDims;
    }

    public void setCalDataSatDims(int calDataSatDims) {
        this.calDataSatDims = calDataSatDims;
    }
    public List<Long> getCalDataSatSizes() {
        return calDataSatSizes;
    }

    public void setCalDataSatSizes(List<Long> calDataSatSizes) {
        this.calDataSatSizes = calDataSatSizes;
    }
    public float getCalDataAirPress() {
        return calDataAirPress;
    }

    public void setCalDataAirPress(float calDataAirPress) {
        this.calDataAirPress = calDataAirPress;
    }
    public List<Float> getCalDataZero() {
        // TODO - restore original dimensions, (remove fill values?)
        return calDataZero;
    }

    public void setCalDataZero(List<Float> calDataZero) {
        // TODO - flatten for storage, insert fill values
        this.calDataZero = calDataZero;
    }
    public int getCalDataZeroDims() {
        return calDataZeroDims;
    }

    public void setCalDataZeroDims(int calDataZeroDims) {
        this.calDataZeroDims = calDataZeroDims;
    }
    public List<Long> getCalDataZeroSizes() {
        return calDataZeroSizes;
    }

    public void setCalDataZeroSizes(List<Long> calDataZeroSizes) {
        this.calDataZeroSizes = calDataZeroSizes;
    }
    public int getRedReference() {
        return redReference;
    }

    public void setRedReference(int redReference) {
        this.redReference = redReference;
    }
    public int getRedRefInterval() {
        return redRefInterval;
    }

    public void setRedRefInterval(int redRefInterval) {
        this.redRefInterval = redRefInterval;
    }
    public String getOperationMode() {
        return operationMode;
    }

    public void setOperationMode(String operationMode) {
        this.operationMode = operationMode;
    }
    public int getSleepMode() {
        return sleepMode;
    }

    public void setSleepMode(int sleepMode) {
        this.sleepMode = sleepMode;
    }
    public int getPolledMode() {
        return polledMode;
    }

    public void setPolledMode(int polledMode) {
        this.polledMode = polledMode;
    }
    public int getEnableText() {
        return enableText;
    }

    public void setEnableText(int enableText) {
        this.enableText = enableText;
    }
    public int getDecimalFormat() {
        return decimalFormat;
    }

    public void setDecimalFormat(int decimalFormat) {
        this.decimalFormat = decimalFormat;
    }
    public List<Float> getTempLimits() {
        // TODO - restore original dimensions, (remove fill values?)
        return tempLimits;
    }

    public void setTempLimits(List<Float> tempLimits) {
        // TODO - flatten for storage, insert fill values
        this.tempLimits = tempLimits;
    }
    public int getTempLimitsDims() {
        return tempLimitsDims;
    }

    public void setTempLimitsDims(int tempLimitsDims) {
        this.tempLimitsDims = tempLimitsDims;
    }
    public List<Long> getTempLimitsSizes() {
        return tempLimitsSizes;
    }

    public void setTempLimitsSizes(List<Long> tempLimitsSizes) {
        this.tempLimitsSizes = tempLimitsSizes;
    }
    public List<Float> getConcLimits() {
        // TODO - restore original dimensions, (remove fill values?)
        return concLimits;
    }

    public void setConcLimits(List<Float> concLimits) {
        // TODO - flatten for storage, insert fill values
        this.concLimits = concLimits;
    }
    public int getConcLimitsDims() {
        return concLimitsDims;
    }

    public void setConcLimitsDims(int concLimitsDims) {
        this.concLimitsDims = concLimitsDims;
    }
    public List<Long> getConcLimitsSizes() {
        return concLimitsSizes;
    }

    public void setConcLimitsSizes(List<Long> concLimitsSizes) {
        this.concLimitsSizes = concLimitsSizes;
    }
    public List<Float> getSatLimits() {
        // TODO - restore original dimensions, (remove fill values?)
        return satLimits;
    }

    public void setSatLimits(List<Float> satLimits) {
        // TODO - flatten for storage, insert fill values
        this.satLimits = satLimits;
    }
    public int getSatLimitsDims() {
        return satLimitsDims;
    }

    public void setSatLimitsDims(int satLimitsDims) {
        this.satLimitsDims = satLimitsDims;
    }
    public List<Long> getSatLimitsSizes() {
        return satLimitsSizes;
    }

    public void setSatLimitsSizes(List<Long> satLimitsSizes) {
        this.satLimitsSizes = satLimitsSizes;
    }
    public List<Float> getPhaseLimits() {
        // TODO - restore original dimensions, (remove fill values?)
        return phaseLimits;
    }

    public void setPhaseLimits(List<Float> phaseLimits) {
        // TODO - flatten for storage, insert fill values
        this.phaseLimits = phaseLimits;
    }
    public int getPhaseLimitsDims() {
        return phaseLimitsDims;
    }

    public void setPhaseLimitsDims(int phaseLimitsDims) {
        this.phaseLimitsDims = phaseLimitsDims;
    }
    public List<Long> getPhaseLimitsSizes() {
        return phaseLimitsSizes;
    }

    public void setPhaseLimitsSizes(List<Long> phaseLimitsSizes) {
        this.phaseLimitsSizes = phaseLimitsSizes;
    }
    public String getAnalogOutput() {
        return analogOutput;
    }

    public void setAnalogOutput(String analogOutput) {
        this.analogOutput = analogOutput;
    }
    public List<Float> getAnalog1Coefs() {
        // TODO - restore original dimensions, (remove fill values?)
        return analog1Coefs;
    }

    public void setAnalog1Coefs(List<Float> analog1Coefs) {
        // TODO - flatten for storage, insert fill values
        this.analog1Coefs = analog1Coefs;
    }
    public int getAnalog1CoefsDims() {
        return analog1CoefsDims;
    }

    public void setAnalog1CoefsDims(int analog1CoefsDims) {
        this.analog1CoefsDims = analog1CoefsDims;
    }
    public List<Long> getAnalog1CoefsSizes() {
        return analog1CoefsSizes;
    }

    public void setAnalog1CoefsSizes(List<Long> analog1CoefsSizes) {
        this.analog1CoefsSizes = analog1CoefsSizes;
    }
    public List<Float> getAnalog2Coefs() {
        // TODO - restore original dimensions, (remove fill values?)
        return analog2Coefs;
    }

    public void setAnalog2Coefs(List<Float> analog2Coefs) {
        // TODO - flatten for storage, insert fill values
        this.analog2Coefs = analog2Coefs;
    }
    public int getAnalog2CoefsDims() {
        return analog2CoefsDims;
    }

    public void setAnalog2CoefsDims(int analog2CoefsDims) {
        this.analog2CoefsDims = analog2CoefsDims;
    }
    public List<Long> getAnalog2CoefsSizes() {
        return analog2CoefsSizes;
    }

    public void setAnalog2CoefsSizes(List<Long> analog2CoefsSizes) {
        this.analog2CoefsSizes = analog2CoefsSizes;
    }
    public int getAirSaturation() {
        return airSaturation;
    }

    public void setAirSaturation(int airSaturation) {
        this.airSaturation = airSaturation;
    }
    public int getEnableRawData() {
        return enableRawData;
    }

    public void setEnableRawData(int enableRawData) {
        this.enableRawData = enableRawData;
    }
    public int getEnableTemp() {
        return enableTemp;
    }

    public void setEnableTemp(int enableTemp) {
        this.enableTemp = enableTemp;
    }
    public int getHumidityComp() {
        return humidityComp;
    }

    public void setHumidityComp(int humidityComp) {
        this.humidityComp = humidityComp;
    }
    public int getEnableSvu() {
        return enableSvu;
    }

    public void setEnableSvu(int enableSvu) {
        this.enableSvu = enableSvu;
    }
    public float getSamplingInterval() {
        return samplingInterval;
    }

    public void setSamplingInterval(float samplingInterval) {
        this.samplingInterval = samplingInterval;
    }
    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
    public String getGeographicPositionDescription() {
        return geographicPositionDescription;
    }

    public void setGeographicPositionDescription(String geographicPositionDescription) {
        this.geographicPositionDescription = geographicPositionDescription;
    }
    public float getVerticalPositionDescription() {
        return verticalPositionDescription;
    }

    public void setVerticalPositionDescription(float verticalPositionDescription) {
        this.verticalPositionDescription = verticalPositionDescription;
    }
    public String getReferenceDescription() {
        return referenceDescription;
    }

    public void setReferenceDescription(String referenceDescription) {
        this.referenceDescription = referenceDescription;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}