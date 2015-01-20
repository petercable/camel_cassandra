package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "velpt_ab_instrument_metadata_recovered")
public class VelptAbInstrumentMetadataRecovered extends CassandraParticle {

    @Column(value = "date_time_string")
    private String dateTimeString;

    @Column(value = "instrmt_type_serial_number")
    private String instrmtTypeSerialNumber;

    @Column(value = "pic_version")
    private int picVersion;

    @Column(value = "hardware_revision")
    private int hardwareRevision;

    @Column(value = "recorder_size")
    private int recorderSize;

    @Column(value = "velocity_range")
    private int velocityRange;

    @Column(value = "firmware_version")
    private String firmwareVersion;

    @Column(value = "pressure_sensor")
    private int pressureSensor;

    @Column(value = "magnetometer_sensor")
    private int magnetometerSensor;

    @Column(value = "tilt_sensor")
    private int tiltSensor;

    @Column(value = "tilt_sensor_mounting")
    private int tiltSensorMounting;

    @Column(value = "head_frequency")
    private int headFrequency;

    @Column(value = "head_type")
    private String headType;

    @Column(value = "head_serial_number")
    private String headSerialNumber;

    @Column(value = "number_beams")
    private int numberBeams;

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

    @Column(value = "number_of_beam_sequences")
    private int numberOfBeamSequences;

    @Column(value = "average_interval")
    private int averageInterval;

    @Column(value = "compass_update_rate")
    private int compassUpdateRate;

    @Column(value = "coordinate_system")
    private int coordinateSystem;

    @Column(value = "number_cells")
    private int numberCells;

    @Column(value = "measurement_interval")
    private int measurementInterval;

    @Column(value = "deployment_name")
    private String deploymentName;

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

    @Column(value = "reserved_bit_easyq")
    private int reservedBitEasyq;

    @Column(value = "stage_enable")
    private int stageEnable;

    @Column(value = "analog_power_output")
    private int analogPowerOutput;

    @Column(value = "sound_speed_adjust_factor")
    private int soundSpeedAdjustFactor;

    @Column(value = "number_diagnostics_samples")
    private int numberDiagnosticsSamples;

    @Column(value = "number_of_beams_in_diagnostics_mode")
    private int numberOfBeamsInDiagnosticsMode;

    @Column(value = "number_pings_diagnostic")
    private int numberPingsDiagnostic;

    @Column(value = "software_version")
    private int softwareVersion;

    @Column(value = "correlation_threshold")
    private int correlationThreshold;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setDateTimeString((String) particle.get("date_time_string"));
        setInstrmtTypeSerialNumber((String) particle.get("instrmt_type_serial_number"));
        setPicVersion((int) particle.get("pic_version"));
        setHardwareRevision((int) particle.get("hardware_revision"));
        setRecorderSize((int) particle.get("recorder_size"));
        setVelocityRange((int) particle.get("velocity_range"));
        setFirmwareVersion((String) particle.get("firmware_version"));
        setPressureSensor((int) particle.get("pressure_sensor"));
        setMagnetometerSensor((int) particle.get("magnetometer_sensor"));
        setTiltSensor((int) particle.get("tilt_sensor"));
        setTiltSensorMounting((int) particle.get("tilt_sensor_mounting"));
        setHeadFrequency((int) particle.get("head_frequency"));
        setHeadType((String) particle.get("head_type"));
        setHeadSerialNumber((String) particle.get("head_serial_number"));
        setNumberBeams((int) particle.get("number_beams"));
        setTransmitPulseLength((int) particle.get("transmit_pulse_length"));
        setBlankingDistance((int) particle.get("blanking_distance"));
        setReceiveLength((int) particle.get("receive_length"));
        setTimeBetweenPings((int) particle.get("time_between_pings"));
        setTimeBetweenBursts((int) particle.get("time_between_bursts"));
        setNumberOfBeamSequences((int) particle.get("number_of_beam_sequences"));
        setAverageInterval((int) particle.get("average_interval"));
        setCompassUpdateRate((int) particle.get("compass_update_rate"));
        setCoordinateSystem((int) particle.get("coordinate_system"));
        setNumberCells((int) particle.get("number_cells"));
        setMeasurementInterval((int) particle.get("measurement_interval"));
        setDeploymentName((String) particle.get("deployment_name"));
        setDiagnosticsInterval((int) particle.get("diagnostics_interval"));
        setUseSpecifiedSoundSpeed((int) particle.get("use_specified_sound_speed"));
        setDiagnosticsModeEnable((int) particle.get("diagnostics_mode_enable"));
        setAnalogOutputEnable((int) particle.get("analog_output_enable"));
        setOutputFormatNortek((int) particle.get("output_format_nortek"));
        setScaling((int) particle.get("scaling"));
        setSerialOutputEnable((int) particle.get("serial_output_enable"));
        setReservedBitEasyq((int) particle.get("reserved_bit_easyq"));
        setStageEnable((int) particle.get("stage_enable"));
        setAnalogPowerOutput((int) particle.get("analog_power_output"));
        setSoundSpeedAdjustFactor((int) particle.get("sound_speed_adjust_factor"));
        setNumberDiagnosticsSamples((int) particle.get("number_diagnostics_samples"));
        setNumberOfBeamsInDiagnosticsMode((int) particle.get("number_of_beams_in_diagnostics_mode"));
        setNumberPingsDiagnostic((int) particle.get("number_pings_diagnostic"));
        setSoftwareVersion((int) particle.get("software_version"));
        setCorrelationThreshold((int) particle.get("correlation_threshold"));
    }

    public String getDateTimeString() {
        return dateTimeString;
    }

    public void setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }
    public String getInstrmtTypeSerialNumber() {
        return instrmtTypeSerialNumber;
    }

    public void setInstrmtTypeSerialNumber(String instrmtTypeSerialNumber) {
        this.instrmtTypeSerialNumber = instrmtTypeSerialNumber;
    }
    public int getPicVersion() {
        return picVersion;
    }

    public void setPicVersion(int picVersion) {
        this.picVersion = picVersion;
    }
    public int getHardwareRevision() {
        return hardwareRevision;
    }

    public void setHardwareRevision(int hardwareRevision) {
        this.hardwareRevision = hardwareRevision;
    }
    public int getRecorderSize() {
        return recorderSize;
    }

    public void setRecorderSize(int recorderSize) {
        this.recorderSize = recorderSize;
    }
    public int getVelocityRange() {
        return velocityRange;
    }

    public void setVelocityRange(int velocityRange) {
        this.velocityRange = velocityRange;
    }
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public int getPressureSensor() {
        return pressureSensor;
    }

    public void setPressureSensor(int pressureSensor) {
        this.pressureSensor = pressureSensor;
    }
    public int getMagnetometerSensor() {
        return magnetometerSensor;
    }

    public void setMagnetometerSensor(int magnetometerSensor) {
        this.magnetometerSensor = magnetometerSensor;
    }
    public int getTiltSensor() {
        return tiltSensor;
    }

    public void setTiltSensor(int tiltSensor) {
        this.tiltSensor = tiltSensor;
    }
    public int getTiltSensorMounting() {
        return tiltSensorMounting;
    }

    public void setTiltSensorMounting(int tiltSensorMounting) {
        this.tiltSensorMounting = tiltSensorMounting;
    }
    public int getHeadFrequency() {
        return headFrequency;
    }

    public void setHeadFrequency(int headFrequency) {
        this.headFrequency = headFrequency;
    }
    public String getHeadType() {
        return headType;
    }

    public void setHeadType(String headType) {
        this.headType = headType;
    }
    public String getHeadSerialNumber() {
        return headSerialNumber;
    }

    public void setHeadSerialNumber(String headSerialNumber) {
        this.headSerialNumber = headSerialNumber;
    }
    public int getNumberBeams() {
        return numberBeams;
    }

    public void setNumberBeams(int numberBeams) {
        this.numberBeams = numberBeams;
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
    public int getNumberOfBeamSequences() {
        return numberOfBeamSequences;
    }

    public void setNumberOfBeamSequences(int numberOfBeamSequences) {
        this.numberOfBeamSequences = numberOfBeamSequences;
    }
    public int getAverageInterval() {
        return averageInterval;
    }

    public void setAverageInterval(int averageInterval) {
        this.averageInterval = averageInterval;
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
    public int getReservedBitEasyq() {
        return reservedBitEasyq;
    }

    public void setReservedBitEasyq(int reservedBitEasyq) {
        this.reservedBitEasyq = reservedBitEasyq;
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
    public int getNumberOfBeamsInDiagnosticsMode() {
        return numberOfBeamsInDiagnosticsMode;
    }

    public void setNumberOfBeamsInDiagnosticsMode(int numberOfBeamsInDiagnosticsMode) {
        this.numberOfBeamsInDiagnosticsMode = numberOfBeamsInDiagnosticsMode;
    }
    public int getNumberPingsDiagnostic() {
        return numberPingsDiagnostic;
    }

    public void setNumberPingsDiagnostic(int numberPingsDiagnostic) {
        this.numberPingsDiagnostic = numberPingsDiagnostic;
    }
    public int getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(int softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
    public int getCorrelationThreshold() {
        return correlationThreshold;
    }

    public void setCorrelationThreshold(int correlationThreshold) {
        this.correlationThreshold = correlationThreshold;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}