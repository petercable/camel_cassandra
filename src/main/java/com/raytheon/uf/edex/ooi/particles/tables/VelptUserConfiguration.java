package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_user_configuration")
public class VelptUserConfiguration extends CassandraParticle {

    @Column(value = "transmit_pulse_length")
    private int transmitPulseLength;

    @Column(value = "blanking_distance")
    private int blankingDistance;

    @Column(value = "receive_length")
    private int receiveLength;

    @Column(value = "time_between_pings")
    private int timeBetweenPings;

    @Column(value = "time_between_bursts")
    private int timeBetweenBursts;

    @Column(value = "number_pings")
    private int numberPings;

    @Column(value = "average_interval")
    private int averageInterval;

    @Column(value = "number_beams")
    private int numberBeams;

    @Column(value = "profile_type")
    private int profileType;

    @Column(value = "mode_type")
    private int modeType;

    @Column(value = "power_level_tcm1")
    private int powerLevelTcm1;

    @Column(value = "power_level_tcm2")
    private int powerLevelTcm2;

    @Column(value = "sync_out_position")
    private int syncOutPosition;

    @Column(value = "sample_on_sync")
    private int sampleOnSync;

    @Column(value = "start_on_sync")
    private int startOnSync;

    @Column(value = "power_level_pcr1")
    private int powerLevelPcr1;

    @Column(value = "power_level_pcr2")
    private int powerLevelPcr2;

    @Column(value = "compass_update_rate")
    private int compassUpdateRate;

    @Column(value = "coordinate_system")
    private int coordinateSystem;

    @Column(value = "number_cells")
    private int numberCells;

    @Column(value = "cell_size")
    private int cellSize;

    @Column(value = "measurement_interval")
    private int measurementInterval;

    @Column(value = "deployment_name")
    private String deploymentName;

    @Column(value = "wrap_mode")
    private int wrapMode;

    @Column(value = "deployment_start_time")
    private List<Integer> deploymentStartTime;

    @Column(value = "deployment_start_time_dims")
    private int deploymentStartTimeDims;

    @Column(value = "deployment_start_time_sizes")
    private List<Long> deploymentStartTimeSizes;

    @Column(value = "diagnostics_interval")
    private int diagnosticsInterval;

    @Column(value = "use_specified_sound_speed")
    private int useSpecifiedSoundSpeed;

    @Column(value = "diagnostics_mode_enable")
    private int diagnosticsModeEnable;

    @Column(value = "analog_output_enable")
    private int analogOutputEnable;

    @Column(value = "output_format_nortek")
    private int outputFormatNortek;

    @Column(value = "scaling")
    private int scaling;

    @Column(value = "serial_output_enable")
    private int serialOutputEnable;

    @Column(value = "stage_enable")
    private int stageEnable;

    @Column(value = "analog_power_output")
    private int analogPowerOutput;

    @Column(value = "sound_speed_adjust_factor")
    private int soundSpeedAdjustFactor;

    @Column(value = "number_diagnostics_samples")
    private int numberDiagnosticsSamples;

    @Column(value = "number_beams_per_cell")
    private int numberBeamsPerCell;

    @Column(value = "number_pings_diagnostic")
    private int numberPingsDiagnostic;

    @Column(value = "use_dsp_filter")
    private int useDspFilter;

    @Column(value = "filter_data_output")
    private int filterDataOutput;

    @Column(value = "analog_input_address")
    private int analogInputAddress;

    @Column(value = "software_version")
    private int softwareVersion;

    @Column(value = "velocity_adjustment_factor")
    private String velocityAdjustmentFactor;

    @Column(value = "file_comments")
    private String fileComments;

    @Column(value = "wave_data_rate")
    private int waveDataRate;

    @Column(value = "wave_cell_position")
    private int waveCellPosition;

    @Column(value = "percent_wave_cell_position")
    private int percentWaveCellPosition;

    @Column(value = "dynamic_position_type")
    private int dynamicPositionType;

    @Column(value = "wave_transmit_pulse")
    private int waveTransmitPulse;

    @Column(value = "fixed_wave_blanking_distance")
    private int fixedWaveBlankingDistance;

    @Column(value = "wave_measurement_cell_size")
    private int waveMeasurementCellSize;

    @Column(value = "number_diagnostics_per_wave")
    private int numberDiagnosticsPerWave;

    @Column(value = "number_samples_per_burst")
    private int numberSamplesPerBurst;

    @Column(value = "analog_scale_factor")
    private int analogScaleFactor;

    @Column(value = "correlation_threshold")
    private int correlationThreshold;

    @Column(value = "transmit_pulse_length_2nd")
    private int transmitPulseLength2nd;

    @Column(value = "filter_constants")
    private String filterConstants;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setTransmitPulseLength((int) particle.get("transmit_pulse_length"));
        setBlankingDistance((int) particle.get("blanking_distance"));
        setReceiveLength((int) particle.get("receive_length"));
        setTimeBetweenPings((int) particle.get("time_between_pings"));
        setTimeBetweenBursts((int) particle.get("time_between_bursts"));
        setNumberPings((int) particle.get("number_pings"));
        setAverageInterval((int) particle.get("average_interval"));
        setNumberBeams((int) particle.get("number_beams"));
        setProfileType((int) particle.get("profile_type"));
        setModeType((int) particle.get("mode_type"));
        setPowerLevelTcm1((int) particle.get("power_level_tcm1"));
        setPowerLevelTcm2((int) particle.get("power_level_tcm2"));
        setSyncOutPosition((int) particle.get("sync_out_position"));
        setSampleOnSync((int) particle.get("sample_on_sync"));
        setStartOnSync((int) particle.get("start_on_sync"));
        setPowerLevelPcr1((int) particle.get("power_level_pcr1"));
        setPowerLevelPcr2((int) particle.get("power_level_pcr2"));
        setCompassUpdateRate((int) particle.get("compass_update_rate"));
        setCoordinateSystem((int) particle.get("coordinate_system"));
        setNumberCells((int) particle.get("number_cells"));
        setCellSize((int) particle.get("cell_size"));
        setMeasurementInterval((int) particle.get("measurement_interval"));
        setDeploymentName((String) particle.get("deployment_name"));
        setWrapMode((int) particle.get("wrap_mode"));
        setDeploymentStartTime((List<Integer>) particle.get("deployment_start_time"));
        setDeploymentStartTimeDims((int) particle.get("deployment_start_time_dims"));
        setDeploymentStartTimeSizes((List<Long>) particle.get("deployment_start_time_sizes"));
        setDiagnosticsInterval((int) particle.get("diagnostics_interval"));
        setUseSpecifiedSoundSpeed((int) particle.get("use_specified_sound_speed"));
        setDiagnosticsModeEnable((int) particle.get("diagnostics_mode_enable"));
        setAnalogOutputEnable((int) particle.get("analog_output_enable"));
        setOutputFormatNortek((int) particle.get("output_format_nortek"));
        setScaling((int) particle.get("scaling"));
        setSerialOutputEnable((int) particle.get("serial_output_enable"));
        setStageEnable((int) particle.get("stage_enable"));
        setAnalogPowerOutput((int) particle.get("analog_power_output"));
        setSoundSpeedAdjustFactor((int) particle.get("sound_speed_adjust_factor"));
        setNumberDiagnosticsSamples((int) particle.get("number_diagnostics_samples"));
        setNumberBeamsPerCell((int) particle.get("number_beams_per_cell"));
        setNumberPingsDiagnostic((int) particle.get("number_pings_diagnostic"));
        setUseDspFilter((int) particle.get("use_dsp_filter"));
        setFilterDataOutput((int) particle.get("filter_data_output"));
        setAnalogInputAddress((int) particle.get("analog_input_address"));
        setSoftwareVersion((int) particle.get("software_version"));
        setVelocityAdjustmentFactor((String) particle.get("velocity_adjustment_factor"));
        setFileComments((String) particle.get("file_comments"));
        setWaveDataRate((int) particle.get("wave_data_rate"));
        setWaveCellPosition((int) particle.get("wave_cell_position"));
        setPercentWaveCellPosition((int) particle.get("percent_wave_cell_position"));
        setDynamicPositionType((int) particle.get("dynamic_position_type"));
        setWaveTransmitPulse((int) particle.get("wave_transmit_pulse"));
        setFixedWaveBlankingDistance((int) particle.get("fixed_wave_blanking_distance"));
        setWaveMeasurementCellSize((int) particle.get("wave_measurement_cell_size"));
        setNumberDiagnosticsPerWave((int) particle.get("number_diagnostics_per_wave"));
        setNumberSamplesPerBurst((int) particle.get("number_samples_per_burst"));
        setAnalogScaleFactor((int) particle.get("analog_scale_factor"));
        setCorrelationThreshold((int) particle.get("correlation_threshold"));
        setTransmitPulseLength2nd((int) particle.get("transmit_pulse_length_2nd"));
        setFilterConstants((String) particle.get("filter_constants"));
    }

    public int getTransmitPulseLength() {
        return transmitPulseLength;
    }

    public void setTransmitPulseLength(int transmitPulseLength) {
        this.transmitPulseLength = transmitPulseLength;
    }
    public int getBlankingDistance() {
        return blankingDistance;
    }

    public void setBlankingDistance(int blankingDistance) {
        this.blankingDistance = blankingDistance;
    }
    public int getReceiveLength() {
        return receiveLength;
    }

    public void setReceiveLength(int receiveLength) {
        this.receiveLength = receiveLength;
    }
    public int getTimeBetweenPings() {
        return timeBetweenPings;
    }

    public void setTimeBetweenPings(int timeBetweenPings) {
        this.timeBetweenPings = timeBetweenPings;
    }
    public int getTimeBetweenBursts() {
        return timeBetweenBursts;
    }

    public void setTimeBetweenBursts(int timeBetweenBursts) {
        this.timeBetweenBursts = timeBetweenBursts;
    }
    public int getNumberPings() {
        return numberPings;
    }

    public void setNumberPings(int numberPings) {
        this.numberPings = numberPings;
    }
    public int getAverageInterval() {
        return averageInterval;
    }

    public void setAverageInterval(int averageInterval) {
        this.averageInterval = averageInterval;
    }
    public int getNumberBeams() {
        return numberBeams;
    }

    public void setNumberBeams(int numberBeams) {
        this.numberBeams = numberBeams;
    }
    public int getProfileType() {
        return profileType;
    }

    public void setProfileType(int profileType) {
        this.profileType = profileType;
    }
    public int getModeType() {
        return modeType;
    }

    public void setModeType(int modeType) {
        this.modeType = modeType;
    }
    public int getPowerLevelTcm1() {
        return powerLevelTcm1;
    }

    public void setPowerLevelTcm1(int powerLevelTcm1) {
        this.powerLevelTcm1 = powerLevelTcm1;
    }
    public int getPowerLevelTcm2() {
        return powerLevelTcm2;
    }

    public void setPowerLevelTcm2(int powerLevelTcm2) {
        this.powerLevelTcm2 = powerLevelTcm2;
    }
    public int getSyncOutPosition() {
        return syncOutPosition;
    }

    public void setSyncOutPosition(int syncOutPosition) {
        this.syncOutPosition = syncOutPosition;
    }
    public int getSampleOnSync() {
        return sampleOnSync;
    }

    public void setSampleOnSync(int sampleOnSync) {
        this.sampleOnSync = sampleOnSync;
    }
    public int getStartOnSync() {
        return startOnSync;
    }

    public void setStartOnSync(int startOnSync) {
        this.startOnSync = startOnSync;
    }
    public int getPowerLevelPcr1() {
        return powerLevelPcr1;
    }

    public void setPowerLevelPcr1(int powerLevelPcr1) {
        this.powerLevelPcr1 = powerLevelPcr1;
    }
    public int getPowerLevelPcr2() {
        return powerLevelPcr2;
    }

    public void setPowerLevelPcr2(int powerLevelPcr2) {
        this.powerLevelPcr2 = powerLevelPcr2;
    }
    public int getCompassUpdateRate() {
        return compassUpdateRate;
    }

    public void setCompassUpdateRate(int compassUpdateRate) {
        this.compassUpdateRate = compassUpdateRate;
    }
    public int getCoordinateSystem() {
        return coordinateSystem;
    }

    public void setCoordinateSystem(int coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }
    public int getNumberCells() {
        return numberCells;
    }

    public void setNumberCells(int numberCells) {
        this.numberCells = numberCells;
    }
    public int getCellSize() {
        return cellSize;
    }

    public void setCellSize(int cellSize) {
        this.cellSize = cellSize;
    }
    public int getMeasurementInterval() {
        return measurementInterval;
    }

    public void setMeasurementInterval(int measurementInterval) {
        this.measurementInterval = measurementInterval;
    }
    public String getDeploymentName() {
        return deploymentName;
    }

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }
    public int getWrapMode() {
        return wrapMode;
    }

    public void setWrapMode(int wrapMode) {
        this.wrapMode = wrapMode;
    }
    public List<Integer> getDeploymentStartTime() {
        // TODO - restore original dimensions, (remove fill values?)
        return deploymentStartTime;
    }

    public void setDeploymentStartTime(List<Integer> deploymentStartTime) {
        // TODO - flatten for storage, insert fill values
        this.deploymentStartTime = deploymentStartTime;
    }
    public int getDeploymentStartTimeDims() {
        return deploymentStartTimeDims;
    }

    public void setDeploymentStartTimeDims(int deploymentStartTimeDims) {
        this.deploymentStartTimeDims = deploymentStartTimeDims;
    }
    public List<Long> getDeploymentStartTimeSizes() {
        return deploymentStartTimeSizes;
    }

    public void setDeploymentStartTimeSizes(List<Long> deploymentStartTimeSizes) {
        this.deploymentStartTimeSizes = deploymentStartTimeSizes;
    }
    public int getDiagnosticsInterval() {
        return diagnosticsInterval;
    }

    public void setDiagnosticsInterval(int diagnosticsInterval) {
        this.diagnosticsInterval = diagnosticsInterval;
    }
    public int getUseSpecifiedSoundSpeed() {
        return useSpecifiedSoundSpeed;
    }

    public void setUseSpecifiedSoundSpeed(int useSpecifiedSoundSpeed) {
        this.useSpecifiedSoundSpeed = useSpecifiedSoundSpeed;
    }
    public int getDiagnosticsModeEnable() {
        return diagnosticsModeEnable;
    }

    public void setDiagnosticsModeEnable(int diagnosticsModeEnable) {
        this.diagnosticsModeEnable = diagnosticsModeEnable;
    }
    public int getAnalogOutputEnable() {
        return analogOutputEnable;
    }

    public void setAnalogOutputEnable(int analogOutputEnable) {
        this.analogOutputEnable = analogOutputEnable;
    }
    public int getOutputFormatNortek() {
        return outputFormatNortek;
    }

    public void setOutputFormatNortek(int outputFormatNortek) {
        this.outputFormatNortek = outputFormatNortek;
    }
    public int getScaling() {
        return scaling;
    }

    public void setScaling(int scaling) {
        this.scaling = scaling;
    }
    public int getSerialOutputEnable() {
        return serialOutputEnable;
    }

    public void setSerialOutputEnable(int serialOutputEnable) {
        this.serialOutputEnable = serialOutputEnable;
    }
    public int getStageEnable() {
        return stageEnable;
    }

    public void setStageEnable(int stageEnable) {
        this.stageEnable = stageEnable;
    }
    public int getAnalogPowerOutput() {
        return analogPowerOutput;
    }

    public void setAnalogPowerOutput(int analogPowerOutput) {
        this.analogPowerOutput = analogPowerOutput;
    }
    public int getSoundSpeedAdjustFactor() {
        return soundSpeedAdjustFactor;
    }

    public void setSoundSpeedAdjustFactor(int soundSpeedAdjustFactor) {
        this.soundSpeedAdjustFactor = soundSpeedAdjustFactor;
    }
    public int getNumberDiagnosticsSamples() {
        return numberDiagnosticsSamples;
    }

    public void setNumberDiagnosticsSamples(int numberDiagnosticsSamples) {
        this.numberDiagnosticsSamples = numberDiagnosticsSamples;
    }
    public int getNumberBeamsPerCell() {
        return numberBeamsPerCell;
    }

    public void setNumberBeamsPerCell(int numberBeamsPerCell) {
        this.numberBeamsPerCell = numberBeamsPerCell;
    }
    public int getNumberPingsDiagnostic() {
        return numberPingsDiagnostic;
    }

    public void setNumberPingsDiagnostic(int numberPingsDiagnostic) {
        this.numberPingsDiagnostic = numberPingsDiagnostic;
    }
    public int getUseDspFilter() {
        return useDspFilter;
    }

    public void setUseDspFilter(int useDspFilter) {
        this.useDspFilter = useDspFilter;
    }
    public int getFilterDataOutput() {
        return filterDataOutput;
    }

    public void setFilterDataOutput(int filterDataOutput) {
        this.filterDataOutput = filterDataOutput;
    }
    public int getAnalogInputAddress() {
        return analogInputAddress;
    }

    public void setAnalogInputAddress(int analogInputAddress) {
        this.analogInputAddress = analogInputAddress;
    }
    public int getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(int softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
    public String getVelocityAdjustmentFactor() {
        return velocityAdjustmentFactor;
    }

    public void setVelocityAdjustmentFactor(String velocityAdjustmentFactor) {
        this.velocityAdjustmentFactor = velocityAdjustmentFactor;
    }
    public String getFileComments() {
        return fileComments;
    }

    public void setFileComments(String fileComments) {
        this.fileComments = fileComments;
    }
    public int getWaveDataRate() {
        return waveDataRate;
    }

    public void setWaveDataRate(int waveDataRate) {
        this.waveDataRate = waveDataRate;
    }
    public int getWaveCellPosition() {
        return waveCellPosition;
    }

    public void setWaveCellPosition(int waveCellPosition) {
        this.waveCellPosition = waveCellPosition;
    }
    public int getPercentWaveCellPosition() {
        return percentWaveCellPosition;
    }

    public void setPercentWaveCellPosition(int percentWaveCellPosition) {
        this.percentWaveCellPosition = percentWaveCellPosition;
    }
    public int getDynamicPositionType() {
        return dynamicPositionType;
    }

    public void setDynamicPositionType(int dynamicPositionType) {
        this.dynamicPositionType = dynamicPositionType;
    }
    public int getWaveTransmitPulse() {
        return waveTransmitPulse;
    }

    public void setWaveTransmitPulse(int waveTransmitPulse) {
        this.waveTransmitPulse = waveTransmitPulse;
    }
    public int getFixedWaveBlankingDistance() {
        return fixedWaveBlankingDistance;
    }

    public void setFixedWaveBlankingDistance(int fixedWaveBlankingDistance) {
        this.fixedWaveBlankingDistance = fixedWaveBlankingDistance;
    }
    public int getWaveMeasurementCellSize() {
        return waveMeasurementCellSize;
    }

    public void setWaveMeasurementCellSize(int waveMeasurementCellSize) {
        this.waveMeasurementCellSize = waveMeasurementCellSize;
    }
    public int getNumberDiagnosticsPerWave() {
        return numberDiagnosticsPerWave;
    }

    public void setNumberDiagnosticsPerWave(int numberDiagnosticsPerWave) {
        this.numberDiagnosticsPerWave = numberDiagnosticsPerWave;
    }
    public int getNumberSamplesPerBurst() {
        return numberSamplesPerBurst;
    }

    public void setNumberSamplesPerBurst(int numberSamplesPerBurst) {
        this.numberSamplesPerBurst = numberSamplesPerBurst;
    }
    public int getAnalogScaleFactor() {
        return analogScaleFactor;
    }

    public void setAnalogScaleFactor(int analogScaleFactor) {
        this.analogScaleFactor = analogScaleFactor;
    }
    public int getCorrelationThreshold() {
        return correlationThreshold;
    }

    public void setCorrelationThreshold(int correlationThreshold) {
        this.correlationThreshold = correlationThreshold;
    }
    public int getTransmitPulseLength2nd() {
        return transmitPulseLength2nd;
    }

    public void setTransmitPulseLength2nd(int transmitPulseLength2nd) {
        this.transmitPulseLength2nd = transmitPulseLength2nd;
    }
    public String getFilterConstants() {
        return filterConstants;
    }

    public void setFilterConstants(String filterConstants) {
        this.filterConstants = filterConstants;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}