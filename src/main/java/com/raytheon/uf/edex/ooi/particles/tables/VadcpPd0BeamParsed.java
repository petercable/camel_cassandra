package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "vadcp_pd0_beam_parsed")
public class VadcpPd0BeamParsed extends CassandraParticle {

    @Column(value = "pinging")
    private int pinging;

    @Column(value = "reference_layer_stop")
    private int referenceLayerStop;

    @Column(value = "false_target_threshold")
    private int falseTargetThreshold;

    @Column(value = "low_latency_trigger")
    private int lowLatencyTrigger;

    @Column(value = "transmit_lag_distance")
    private int transmitLagDistance;

    @Column(value = "sensor_available_temperature")
    private int sensorAvailableTemperature;

    @Column(value = "bin_1_distance")
    private int bin1Distance;

    @Column(value = "transmit_pulse_length")
    private int transmitPulseLength;

    @Column(value = "reference_layer_start")
    private int referenceLayerStart;

    @Column(value = "level_7_interrupt")
    private int level7Interrupt;

    @Column(value = "cpu_board_serial_number")
    private BigInteger cpuBoardSerialNumber;

    @Column(value = "system_bandwidth")
    private int systemBandwidth;

    @Column(value = "percent_good_id")
    private int percentGoodId;

    @Column(value = "echo_intensity_beam1")
    private List<Integer> echoIntensityBeam1;

    @Column(value = "echo_intensity_beam1_dims")
    private int echoIntensityBeam1Dims;

    @Column(value = "echo_intensity_beam1_sizes")
    private List<Long> echoIntensityBeam1Sizes;

    @Column(value = "echo_intensity_beam2")
    private List<Integer> echoIntensityBeam2;

    @Column(value = "echo_intensity_beam2_dims")
    private int echoIntensityBeam2Dims;

    @Column(value = "echo_intensity_beam2_sizes")
    private List<Long> echoIntensityBeam2Sizes;

    @Column(value = "echo_intensity_beam3")
    private List<Integer> echoIntensityBeam3;

    @Column(value = "echo_intensity_beam3_dims")
    private int echoIntensityBeam3Dims;

    @Column(value = "echo_intensity_beam3_sizes")
    private List<Long> echoIntensityBeam3Sizes;

    @Column(value = "echo_intensity_beam4")
    private List<Integer> echoIntensityBeam4;

    @Column(value = "echo_intensity_beam4_dims")
    private int echoIntensityBeam4Dims;

    @Column(value = "echo_intensity_beam4_sizes")
    private List<Long> echoIntensityBeam4Sizes;

    @Column(value = "correlation_magnitude_beam2")
    private List<Integer> correlationMagnitudeBeam2;

    @Column(value = "correlation_magnitude_beam2_dims")
    private int correlationMagnitudeBeam2Dims;

    @Column(value = "correlation_magnitude_beam2_sizes")
    private List<Long> correlationMagnitudeBeam2Sizes;

    @Column(value = "correlation_magnitude_beam3")
    private List<Integer> correlationMagnitudeBeam3;

    @Column(value = "correlation_magnitude_beam3_dims")
    private int correlationMagnitudeBeam3Dims;

    @Column(value = "correlation_magnitude_beam3_sizes")
    private List<Long> correlationMagnitudeBeam3Sizes;

    @Column(value = "correlation_magnitude_beam4")
    private List<Integer> correlationMagnitudeBeam4;

    @Column(value = "correlation_magnitude_beam4_dims")
    private int correlationMagnitudeBeam4Dims;

    @Column(value = "correlation_magnitude_beam4_sizes")
    private List<Long> correlationMagnitudeBeam4Sizes;

    @Column(value = "echo_intensity_id")
    private int echoIntensityId;

    @Column(value = "num_cells")
    private int numCells;

    @Column(value = "num_beams")
    private int numBeams;

    @Column(value = "cell_length")
    private int cellLength;

    @Column(value = "pings_per_ensemble")
    private int pingsPerEnsemble;

    @Column(value = "signal_processing_mode")
    private int signalProcessingMode;

    @Column(value = "blank_after_transmit")
    private int blankAfterTransmit;

    @Column(value = "num_code_repetitions")
    private int numCodeRepetitions;

    @Column(value = "low_corr_threshold")
    private int lowCorrThreshold;

    @Column(value = "error_vel_threshold")
    private int errorVelThreshold;

    @Column(value = "percent_good_min")
    private int percentGoodMin;

    @Column(value = "pressure")
    private long pressure;

    @Column(value = "correlation_magnitude_beam1")
    private List<Integer> correlationMagnitudeBeam1;

    @Column(value = "correlation_magnitude_beam1_dims")
    private int correlationMagnitudeBeam1Dims;

    @Column(value = "correlation_magnitude_beam1_sizes")
    private List<Long> correlationMagnitudeBeam1Sizes;

    @Column(value = "correlation_magnitude_id")
    private int correlationMagnitudeId;

    @Column(value = "coord_transform_type")
    private int coordTransformType;

    @Column(value = "coord_transform_tilts")
    private int coordTransformTilts;

    @Column(value = "time_per_ping_minutes")
    private int timePerPingMinutes;

    @Column(value = "time_per_ping_seconds")
    private float timePerPingSeconds;

    @Column(value = "heading_alignment")
    private int headingAlignment;

    @Column(value = "heading_bias")
    private int headingBias;

    @Column(value = "coord_transform_beams")
    private int coordTransformBeams;

    @Column(value = "coord_transform_mapping")
    private int coordTransformMapping;

    @Column(value = "sensor_source_speed")
    private int sensorSourceSpeed;

    @Column(value = "sensor_source_depth")
    private int sensorSourceDepth;

    @Column(value = "checksum")
    private int checksum;

    @Column(value = "clock_read_error")
    private int clockReadError;

    @Column(value = "offset_data_types")
    private List<Integer> offsetDataTypes;

    @Column(value = "offset_data_types_dims")
    private int offsetDataTypesDims;

    @Column(value = "offset_data_types_sizes")
    private List<Long> offsetDataTypesSizes;

    @Column(value = "num_data_types")
    private int numDataTypes;

    @Column(value = "num_bytes")
    private int numBytes;

    @Column(value = "data_source_id")
    private int dataSourceId;

    @Column(value = "header_id")
    private int headerId;

    @Column(value = "adc_attitude_temp")
    private int adcAttitudeTemp;

    @Column(value = "adc_pressure_minus")
    private int adcPressureMinus;

    @Column(value = "adc_pressure_plus")
    private int adcPressurePlus;

    @Column(value = "adc_ambient_temp")
    private int adcAmbientTemp;

    @Column(value = "adc_transmit_voltage")
    private int adcTransmitVoltage;

    @Column(value = "adc_transmit_current")
    private int adcTransmitCurrent;

    @Column(value = "roll_stdev")
    private int rollStdev;

    @Column(value = "pitch_stdev")
    private int pitchStdev;

    @Column(value = "adc_contamination_sensor")
    private int adcContaminationSensor;

    @Column(value = "adc_attitude")
    private int adcAttitude;

    @Column(value = "data_flag")
    private int dataFlag;

    @Column(value = "lag_length")
    private int lagLength;

    @Column(value = "pressure_variance")
    private long pressureVariance;

    @Column(value = "fixed_leader_id")
    private int fixedLeaderId;

    @Column(value = "firmware_version")
    private int firmwareVersion;

    @Column(value = "firmware_revision")
    private int firmwareRevision;

    @Column(value = "sysconfig_frequency")
    private int sysconfigFrequency;

    @Column(value = "sysconfig_beam_pattern")
    private int sysconfigBeamPattern;

    @Column(value = "sysconfig_sensor_config")
    private int sysconfigSensorConfig;

    @Column(value = "sysconfig_head_attached")
    private int sysconfigHeadAttached;

    @Column(value = "sysconfig_vertical_orientation")
    private int sysconfigVerticalOrientation;

    @Column(value = "bus_error_exception")
    private int busErrorException;

    @Column(value = "address_error_exception")
    private int addressErrorException;

    @Column(value = "illegal_instruction_exception")
    private int illegalInstructionException;

    @Column(value = "zero_divide_instruction")
    private int zeroDivideInstruction;

    @Column(value = "emulator_exception")
    private int emulatorException;

    @Column(value = "unassigned_exception")
    private int unassignedException;

    @Column(value = "watchdog_restart_occurred")
    private int watchdogRestartOccurred;

    @Column(value = "battery_saver_power")
    private int batterySaverPower;

    @Column(value = "cold_wakeup_occurred")
    private int coldWakeupOccurred;

    @Column(value = "percent_good_beam4")
    private List<Integer> percentGoodBeam4;

    @Column(value = "percent_good_beam4_dims")
    private int percentGoodBeam4Dims;

    @Column(value = "percent_good_beam4_sizes")
    private List<Long> percentGoodBeam4Sizes;

    @Column(value = "sensor_available_roll")
    private int sensorAvailableRoll;

    @Column(value = "beam_3_velocity")
    private List<Integer> beam3Velocity;

    @Column(value = "beam_3_velocity_dims")
    private int beam3VelocityDims;

    @Column(value = "beam_3_velocity_sizes")
    private List<Long> beam3VelocitySizes;

    @Column(value = "bit_result_timing")
    private int bitResultTiming;

    @Column(value = "bit_result_demod_0")
    private int bitResultDemod0;

    @Column(value = "velocity_data_id")
    private int velocityDataId;

    @Column(value = "ensemble_number")
    private int ensembleNumber;

    @Column(value = "bit_result_demod_1")
    private int bitResultDemod1;

    @Column(value = "ensemble_number_increment")
    private int ensembleNumberIncrement;

    @Column(value = "serial_number")
    private long serialNumber;

    @Column(value = "system_power")
    private int systemPower;

    @Column(value = "variable_leader_id")
    private int variableLeaderId;

    @Column(value = "beam_angle")
    private int beamAngle;

    @Column(value = "spurious_clock_interrupt")
    private int spuriousClockInterrupt;

    @Column(value = "ensemble_start_time")
    private double ensembleStartTime;

    @Column(value = "spurious_dsp_interrupt")
    private int spuriousDspInterrupt;

    @Column(value = "spurious_uart_interrupt")
    private int spuriousUartInterrupt;

    @Column(value = "clock_jump_backward")
    private int clockJumpBackward;

    @Column(value = "power_fail")
    private int powerFail;

    @Column(value = "unexpected_alarm")
    private int unexpectedAlarm;

    @Column(value = "clock_jump_forward")
    private int clockJumpForward;

    @Column(value = "mpt_seconds")
    private float mptSeconds;

    @Column(value = "heading_stdev")
    private int headingStdev;

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "mpt_minutes")
    private int mptMinutes;

    @Column(value = "roll")
    private int roll;

    @Column(value = "salinity")
    private int salinity;

    @Column(value = "heading")
    private int heading;

    @Column(value = "pitch")
    private int pitch;

    @Column(value = "speed_of_sound")
    private int speedOfSound;

    @Column(value = "transducer_depth")
    private int transducerDepth;

    @Column(value = "beam_1_velocity")
    private List<Integer> beam1Velocity;

    @Column(value = "beam_1_velocity_dims")
    private int beam1VelocityDims;

    @Column(value = "beam_1_velocity_sizes")
    private List<Long> beam1VelocitySizes;

    @Column(value = "percent_good_beam2")
    private List<Integer> percentGoodBeam2;

    @Column(value = "percent_good_beam2_dims")
    private int percentGoodBeam2Dims;

    @Column(value = "percent_good_beam2_sizes")
    private List<Long> percentGoodBeam2Sizes;

    @Column(value = "percent_good_beam3")
    private List<Integer> percentGoodBeam3;

    @Column(value = "percent_good_beam3_dims")
    private int percentGoodBeam3Dims;

    @Column(value = "percent_good_beam3_sizes")
    private List<Long> percentGoodBeam3Sizes;

    @Column(value = "sensor_available_conductivity")
    private int sensorAvailableConductivity;

    @Column(value = "real_time_clock")
    private List<Integer> realTimeClock;

    @Column(value = "real_time_clock_dims")
    private int realTimeClockDims;

    @Column(value = "real_time_clock_sizes")
    private List<Long> realTimeClockSizes;

    @Column(value = "beam_2_velocity")
    private List<Integer> beam2Velocity;

    @Column(value = "beam_2_velocity_dims")
    private int beam2VelocityDims;

    @Column(value = "beam_2_velocity_sizes")
    private List<Long> beam2VelocitySizes;

    @Column(value = "unknown_wakeup_occurred")
    private int unknownWakeupOccurred;

    @Column(value = "beam_4_velocity")
    private List<Integer> beam4Velocity;

    @Column(value = "beam_4_velocity_dims")
    private int beam4VelocityDims;

    @Column(value = "beam_4_velocity_sizes")
    private List<Long> beam4VelocitySizes;

    @Column(value = "percent_good_beam1")
    private List<Integer> percentGoodBeam1;

    @Column(value = "percent_good_beam1_dims")
    private int percentGoodBeam1Dims;

    @Column(value = "percent_good_beam1_sizes")
    private List<Long> percentGoodBeam1Sizes;

    @Column(value = "sensor_source_conductivity")
    private int sensorSourceConductivity;

    @Column(value = "sensor_source_roll")
    private int sensorSourceRoll;

    @Column(value = "sensor_source_pitch")
    private int sensorSourcePitch;

    @Column(value = "sensor_source_heading")
    private int sensorSourceHeading;

    @Column(value = "sensor_available_pitch")
    private int sensorAvailablePitch;

    @Column(value = "sensor_available_heading")
    private int sensorAvailableHeading;

    @Column(value = "sensor_available_depth")
    private int sensorAvailableDepth;

    @Column(value = "sensor_source_temperature")
    private int sensorSourceTemperature;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setPinging((int) particle.get("pinging"));
        setReferenceLayerStop((int) particle.get("reference_layer_stop"));
        setFalseTargetThreshold((int) particle.get("false_target_threshold"));
        setLowLatencyTrigger((int) particle.get("low_latency_trigger"));
        setTransmitLagDistance((int) particle.get("transmit_lag_distance"));
        setSensorAvailableTemperature((int) particle.get("sensor_available_temperature"));
        setBin1Distance((int) particle.get("bin_1_distance"));
        setTransmitPulseLength((int) particle.get("transmit_pulse_length"));
        setReferenceLayerStart((int) particle.get("reference_layer_start"));
        setLevel7Interrupt((int) particle.get("level_7_interrupt"));
        setCpuBoardSerialNumber((BigInteger) particle.get("cpu_board_serial_number"));
        setSystemBandwidth((int) particle.get("system_bandwidth"));
        setPercentGoodId((int) particle.get("percent_good_id"));
        setEchoIntensityBeam1((List<Integer>) particle.get("echo_intensity_beam1"));
        setEchoIntensityBeam1Dims((int) particle.get("echo_intensity_beam1_dims"));
        setEchoIntensityBeam1Sizes((List<Long>) particle.get("echo_intensity_beam1_sizes"));
        setEchoIntensityBeam2((List<Integer>) particle.get("echo_intensity_beam2"));
        setEchoIntensityBeam2Dims((int) particle.get("echo_intensity_beam2_dims"));
        setEchoIntensityBeam2Sizes((List<Long>) particle.get("echo_intensity_beam2_sizes"));
        setEchoIntensityBeam3((List<Integer>) particle.get("echo_intensity_beam3"));
        setEchoIntensityBeam3Dims((int) particle.get("echo_intensity_beam3_dims"));
        setEchoIntensityBeam3Sizes((List<Long>) particle.get("echo_intensity_beam3_sizes"));
        setEchoIntensityBeam4((List<Integer>) particle.get("echo_intensity_beam4"));
        setEchoIntensityBeam4Dims((int) particle.get("echo_intensity_beam4_dims"));
        setEchoIntensityBeam4Sizes((List<Long>) particle.get("echo_intensity_beam4_sizes"));
        setCorrelationMagnitudeBeam2((List<Integer>) particle.get("correlation_magnitude_beam2"));
        setCorrelationMagnitudeBeam2Dims((int) particle.get("correlation_magnitude_beam2_dims"));
        setCorrelationMagnitudeBeam2Sizes((List<Long>) particle.get("correlation_magnitude_beam2_sizes"));
        setCorrelationMagnitudeBeam3((List<Integer>) particle.get("correlation_magnitude_beam3"));
        setCorrelationMagnitudeBeam3Dims((int) particle.get("correlation_magnitude_beam3_dims"));
        setCorrelationMagnitudeBeam3Sizes((List<Long>) particle.get("correlation_magnitude_beam3_sizes"));
        setCorrelationMagnitudeBeam4((List<Integer>) particle.get("correlation_magnitude_beam4"));
        setCorrelationMagnitudeBeam4Dims((int) particle.get("correlation_magnitude_beam4_dims"));
        setCorrelationMagnitudeBeam4Sizes((List<Long>) particle.get("correlation_magnitude_beam4_sizes"));
        setEchoIntensityId((int) particle.get("echo_intensity_id"));
        setNumCells((int) particle.get("num_cells"));
        setNumBeams((int) particle.get("num_beams"));
        setCellLength((int) particle.get("cell_length"));
        setPingsPerEnsemble((int) particle.get("pings_per_ensemble"));
        setSignalProcessingMode((int) particle.get("signal_processing_mode"));
        setBlankAfterTransmit((int) particle.get("blank_after_transmit"));
        setNumCodeRepetitions((int) particle.get("num_code_repetitions"));
        setLowCorrThreshold((int) particle.get("low_corr_threshold"));
        setErrorVelThreshold((int) particle.get("error_vel_threshold"));
        setPercentGoodMin((int) particle.get("percent_good_min"));
        setPressure((long) particle.get("pressure"));
        setCorrelationMagnitudeBeam1((List<Integer>) particle.get("correlation_magnitude_beam1"));
        setCorrelationMagnitudeBeam1Dims((int) particle.get("correlation_magnitude_beam1_dims"));
        setCorrelationMagnitudeBeam1Sizes((List<Long>) particle.get("correlation_magnitude_beam1_sizes"));
        setCorrelationMagnitudeId((int) particle.get("correlation_magnitude_id"));
        setCoordTransformType((int) particle.get("coord_transform_type"));
        setCoordTransformTilts((int) particle.get("coord_transform_tilts"));
        setTimePerPingMinutes((int) particle.get("time_per_ping_minutes"));
        setTimePerPingSeconds((float) particle.get("time_per_ping_seconds"));
        setHeadingAlignment((int) particle.get("heading_alignment"));
        setHeadingBias((int) particle.get("heading_bias"));
        setCoordTransformBeams((int) particle.get("coord_transform_beams"));
        setCoordTransformMapping((int) particle.get("coord_transform_mapping"));
        setSensorSourceSpeed((int) particle.get("sensor_source_speed"));
        setSensorSourceDepth((int) particle.get("sensor_source_depth"));
        setChecksum((int) particle.get("checksum"));
        setClockReadError((int) particle.get("clock_read_error"));
        setOffsetDataTypes((List<Integer>) particle.get("offset_data_types"));
        setOffsetDataTypesDims((int) particle.get("offset_data_types_dims"));
        setOffsetDataTypesSizes((List<Long>) particle.get("offset_data_types_sizes"));
        setNumDataTypes((int) particle.get("num_data_types"));
        setNumBytes((int) particle.get("num_bytes"));
        setDataSourceId((int) particle.get("data_source_id"));
        setHeaderId((int) particle.get("header_id"));
        setAdcAttitudeTemp((int) particle.get("adc_attitude_temp"));
        setAdcPressureMinus((int) particle.get("adc_pressure_minus"));
        setAdcPressurePlus((int) particle.get("adc_pressure_plus"));
        setAdcAmbientTemp((int) particle.get("adc_ambient_temp"));
        setAdcTransmitVoltage((int) particle.get("adc_transmit_voltage"));
        setAdcTransmitCurrent((int) particle.get("adc_transmit_current"));
        setRollStdev((int) particle.get("roll_stdev"));
        setPitchStdev((int) particle.get("pitch_stdev"));
        setAdcContaminationSensor((int) particle.get("adc_contamination_sensor"));
        setAdcAttitude((int) particle.get("adc_attitude"));
        setDataFlag((int) particle.get("data_flag"));
        setLagLength((int) particle.get("lag_length"));
        setPressureVariance((long) particle.get("pressure_variance"));
        setFixedLeaderId((int) particle.get("fixed_leader_id"));
        setFirmwareVersion((int) particle.get("firmware_version"));
        setFirmwareRevision((int) particle.get("firmware_revision"));
        setSysconfigFrequency((int) particle.get("sysconfig_frequency"));
        setSysconfigBeamPattern((int) particle.get("sysconfig_beam_pattern"));
        setSysconfigSensorConfig((int) particle.get("sysconfig_sensor_config"));
        setSysconfigHeadAttached((int) particle.get("sysconfig_head_attached"));
        setSysconfigVerticalOrientation((int) particle.get("sysconfig_vertical_orientation"));
        setBusErrorException((int) particle.get("bus_error_exception"));
        setAddressErrorException((int) particle.get("address_error_exception"));
        setIllegalInstructionException((int) particle.get("illegal_instruction_exception"));
        setZeroDivideInstruction((int) particle.get("zero_divide_instruction"));
        setEmulatorException((int) particle.get("emulator_exception"));
        setUnassignedException((int) particle.get("unassigned_exception"));
        setWatchdogRestartOccurred((int) particle.get("watchdog_restart_occurred"));
        setBatterySaverPower((int) particle.get("battery_saver_power"));
        setColdWakeupOccurred((int) particle.get("cold_wakeup_occurred"));
        setPercentGoodBeam4((List<Integer>) particle.get("percent_good_beam4"));
        setPercentGoodBeam4Dims((int) particle.get("percent_good_beam4_dims"));
        setPercentGoodBeam4Sizes((List<Long>) particle.get("percent_good_beam4_sizes"));
        setSensorAvailableRoll((int) particle.get("sensor_available_roll"));
        setBeam3Velocity((List<Integer>) particle.get("beam_3_velocity"));
        setBeam3VelocityDims((int) particle.get("beam_3_velocity_dims"));
        setBeam3VelocitySizes((List<Long>) particle.get("beam_3_velocity_sizes"));
        setBitResultTiming((int) particle.get("bit_result_timing"));
        setBitResultDemod0((int) particle.get("bit_result_demod_0"));
        setVelocityDataId((int) particle.get("velocity_data_id"));
        setEnsembleNumber((int) particle.get("ensemble_number"));
        setBitResultDemod1((int) particle.get("bit_result_demod_1"));
        setEnsembleNumberIncrement((int) particle.get("ensemble_number_increment"));
        setSerialNumber((long) particle.get("serial_number"));
        setSystemPower((int) particle.get("system_power"));
        setVariableLeaderId((int) particle.get("variable_leader_id"));
        setBeamAngle((int) particle.get("beam_angle"));
        setSpuriousClockInterrupt((int) particle.get("spurious_clock_interrupt"));
        setEnsembleStartTime((double) particle.get("ensemble_start_time"));
        setSpuriousDspInterrupt((int) particle.get("spurious_dsp_interrupt"));
        setSpuriousUartInterrupt((int) particle.get("spurious_uart_interrupt"));
        setClockJumpBackward((int) particle.get("clock_jump_backward"));
        setPowerFail((int) particle.get("power_fail"));
        setUnexpectedAlarm((int) particle.get("unexpected_alarm"));
        setClockJumpForward((int) particle.get("clock_jump_forward"));
        setMptSeconds((float) particle.get("mpt_seconds"));
        setHeadingStdev((int) particle.get("heading_stdev"));
        setTemperature((int) particle.get("temperature"));
        setMptMinutes((int) particle.get("mpt_minutes"));
        setRoll((int) particle.get("roll"));
        setSalinity((int) particle.get("salinity"));
        setHeading((int) particle.get("heading"));
        setPitch((int) particle.get("pitch"));
        setSpeedOfSound((int) particle.get("speed_of_sound"));
        setTransducerDepth((int) particle.get("transducer_depth"));
        setBeam1Velocity((List<Integer>) particle.get("beam_1_velocity"));
        setBeam1VelocityDims((int) particle.get("beam_1_velocity_dims"));
        setBeam1VelocitySizes((List<Long>) particle.get("beam_1_velocity_sizes"));
        setPercentGoodBeam2((List<Integer>) particle.get("percent_good_beam2"));
        setPercentGoodBeam2Dims((int) particle.get("percent_good_beam2_dims"));
        setPercentGoodBeam2Sizes((List<Long>) particle.get("percent_good_beam2_sizes"));
        setPercentGoodBeam3((List<Integer>) particle.get("percent_good_beam3"));
        setPercentGoodBeam3Dims((int) particle.get("percent_good_beam3_dims"));
        setPercentGoodBeam3Sizes((List<Long>) particle.get("percent_good_beam3_sizes"));
        setSensorAvailableConductivity((int) particle.get("sensor_available_conductivity"));
        setRealTimeClock((List<Integer>) particle.get("real_time_clock"));
        setRealTimeClockDims((int) particle.get("real_time_clock_dims"));
        setRealTimeClockSizes((List<Long>) particle.get("real_time_clock_sizes"));
        setBeam2Velocity((List<Integer>) particle.get("beam_2_velocity"));
        setBeam2VelocityDims((int) particle.get("beam_2_velocity_dims"));
        setBeam2VelocitySizes((List<Long>) particle.get("beam_2_velocity_sizes"));
        setUnknownWakeupOccurred((int) particle.get("unknown_wakeup_occurred"));
        setBeam4Velocity((List<Integer>) particle.get("beam_4_velocity"));
        setBeam4VelocityDims((int) particle.get("beam_4_velocity_dims"));
        setBeam4VelocitySizes((List<Long>) particle.get("beam_4_velocity_sizes"));
        setPercentGoodBeam1((List<Integer>) particle.get("percent_good_beam1"));
        setPercentGoodBeam1Dims((int) particle.get("percent_good_beam1_dims"));
        setPercentGoodBeam1Sizes((List<Long>) particle.get("percent_good_beam1_sizes"));
        setSensorSourceConductivity((int) particle.get("sensor_source_conductivity"));
        setSensorSourceRoll((int) particle.get("sensor_source_roll"));
        setSensorSourcePitch((int) particle.get("sensor_source_pitch"));
        setSensorSourceHeading((int) particle.get("sensor_source_heading"));
        setSensorAvailablePitch((int) particle.get("sensor_available_pitch"));
        setSensorAvailableHeading((int) particle.get("sensor_available_heading"));
        setSensorAvailableDepth((int) particle.get("sensor_available_depth"));
        setSensorSourceTemperature((int) particle.get("sensor_source_temperature"));
    }

    public int getPinging() {
        return pinging;
    }

    public void setPinging(int pinging) {
        this.pinging = pinging;
    }
    public int getReferenceLayerStop() {
        return referenceLayerStop;
    }

    public void setReferenceLayerStop(int referenceLayerStop) {
        this.referenceLayerStop = referenceLayerStop;
    }
    public int getFalseTargetThreshold() {
        return falseTargetThreshold;
    }

    public void setFalseTargetThreshold(int falseTargetThreshold) {
        this.falseTargetThreshold = falseTargetThreshold;
    }
    public int getLowLatencyTrigger() {
        return lowLatencyTrigger;
    }

    public void setLowLatencyTrigger(int lowLatencyTrigger) {
        this.lowLatencyTrigger = lowLatencyTrigger;
    }
    public int getTransmitLagDistance() {
        return transmitLagDistance;
    }

    public void setTransmitLagDistance(int transmitLagDistance) {
        this.transmitLagDistance = transmitLagDistance;
    }
    public int getSensorAvailableTemperature() {
        return sensorAvailableTemperature;
    }

    public void setSensorAvailableTemperature(int sensorAvailableTemperature) {
        this.sensorAvailableTemperature = sensorAvailableTemperature;
    }
    public int getBin1Distance() {
        return bin1Distance;
    }

    public void setBin1Distance(int bin1Distance) {
        this.bin1Distance = bin1Distance;
    }
    public int getTransmitPulseLength() {
        return transmitPulseLength;
    }

    public void setTransmitPulseLength(int transmitPulseLength) {
        this.transmitPulseLength = transmitPulseLength;
    }
    public int getReferenceLayerStart() {
        return referenceLayerStart;
    }

    public void setReferenceLayerStart(int referenceLayerStart) {
        this.referenceLayerStart = referenceLayerStart;
    }
    public int getLevel7Interrupt() {
        return level7Interrupt;
    }

    public void setLevel7Interrupt(int level7Interrupt) {
        this.level7Interrupt = level7Interrupt;
    }
    public BigInteger getCpuBoardSerialNumber() {
        return cpuBoardSerialNumber;
    }

    public void setCpuBoardSerialNumber(BigInteger cpuBoardSerialNumber) {
        this.cpuBoardSerialNumber = cpuBoardSerialNumber;
    }
    public int getSystemBandwidth() {
        return systemBandwidth;
    }

    public void setSystemBandwidth(int systemBandwidth) {
        this.systemBandwidth = systemBandwidth;
    }
    public int getPercentGoodId() {
        return percentGoodId;
    }

    public void setPercentGoodId(int percentGoodId) {
        this.percentGoodId = percentGoodId;
    }
    public List<Integer> getEchoIntensityBeam1() {
        // TODO - restore original dimensions, (remove fill values?)
        return echoIntensityBeam1;
    }

    public void setEchoIntensityBeam1(List<Integer> echoIntensityBeam1) {
        // TODO - flatten for storage, insert fill values
        this.echoIntensityBeam1 = echoIntensityBeam1;
    }
    public int getEchoIntensityBeam1Dims() {
        return echoIntensityBeam1Dims;
    }

    public void setEchoIntensityBeam1Dims(int echoIntensityBeam1Dims) {
        this.echoIntensityBeam1Dims = echoIntensityBeam1Dims;
    }
    public List<Long> getEchoIntensityBeam1Sizes() {
        return echoIntensityBeam1Sizes;
    }

    public void setEchoIntensityBeam1Sizes(List<Long> echoIntensityBeam1Sizes) {
        this.echoIntensityBeam1Sizes = echoIntensityBeam1Sizes;
    }
    public List<Integer> getEchoIntensityBeam2() {
        // TODO - restore original dimensions, (remove fill values?)
        return echoIntensityBeam2;
    }

    public void setEchoIntensityBeam2(List<Integer> echoIntensityBeam2) {
        // TODO - flatten for storage, insert fill values
        this.echoIntensityBeam2 = echoIntensityBeam2;
    }
    public int getEchoIntensityBeam2Dims() {
        return echoIntensityBeam2Dims;
    }

    public void setEchoIntensityBeam2Dims(int echoIntensityBeam2Dims) {
        this.echoIntensityBeam2Dims = echoIntensityBeam2Dims;
    }
    public List<Long> getEchoIntensityBeam2Sizes() {
        return echoIntensityBeam2Sizes;
    }

    public void setEchoIntensityBeam2Sizes(List<Long> echoIntensityBeam2Sizes) {
        this.echoIntensityBeam2Sizes = echoIntensityBeam2Sizes;
    }
    public List<Integer> getEchoIntensityBeam3() {
        // TODO - restore original dimensions, (remove fill values?)
        return echoIntensityBeam3;
    }

    public void setEchoIntensityBeam3(List<Integer> echoIntensityBeam3) {
        // TODO - flatten for storage, insert fill values
        this.echoIntensityBeam3 = echoIntensityBeam3;
    }
    public int getEchoIntensityBeam3Dims() {
        return echoIntensityBeam3Dims;
    }

    public void setEchoIntensityBeam3Dims(int echoIntensityBeam3Dims) {
        this.echoIntensityBeam3Dims = echoIntensityBeam3Dims;
    }
    public List<Long> getEchoIntensityBeam3Sizes() {
        return echoIntensityBeam3Sizes;
    }

    public void setEchoIntensityBeam3Sizes(List<Long> echoIntensityBeam3Sizes) {
        this.echoIntensityBeam3Sizes = echoIntensityBeam3Sizes;
    }
    public List<Integer> getEchoIntensityBeam4() {
        // TODO - restore original dimensions, (remove fill values?)
        return echoIntensityBeam4;
    }

    public void setEchoIntensityBeam4(List<Integer> echoIntensityBeam4) {
        // TODO - flatten for storage, insert fill values
        this.echoIntensityBeam4 = echoIntensityBeam4;
    }
    public int getEchoIntensityBeam4Dims() {
        return echoIntensityBeam4Dims;
    }

    public void setEchoIntensityBeam4Dims(int echoIntensityBeam4Dims) {
        this.echoIntensityBeam4Dims = echoIntensityBeam4Dims;
    }
    public List<Long> getEchoIntensityBeam4Sizes() {
        return echoIntensityBeam4Sizes;
    }

    public void setEchoIntensityBeam4Sizes(List<Long> echoIntensityBeam4Sizes) {
        this.echoIntensityBeam4Sizes = echoIntensityBeam4Sizes;
    }
    public List<Integer> getCorrelationMagnitudeBeam2() {
        // TODO - restore original dimensions, (remove fill values?)
        return correlationMagnitudeBeam2;
    }

    public void setCorrelationMagnitudeBeam2(List<Integer> correlationMagnitudeBeam2) {
        // TODO - flatten for storage, insert fill values
        this.correlationMagnitudeBeam2 = correlationMagnitudeBeam2;
    }
    public int getCorrelationMagnitudeBeam2Dims() {
        return correlationMagnitudeBeam2Dims;
    }

    public void setCorrelationMagnitudeBeam2Dims(int correlationMagnitudeBeam2Dims) {
        this.correlationMagnitudeBeam2Dims = correlationMagnitudeBeam2Dims;
    }
    public List<Long> getCorrelationMagnitudeBeam2Sizes() {
        return correlationMagnitudeBeam2Sizes;
    }

    public void setCorrelationMagnitudeBeam2Sizes(List<Long> correlationMagnitudeBeam2Sizes) {
        this.correlationMagnitudeBeam2Sizes = correlationMagnitudeBeam2Sizes;
    }
    public List<Integer> getCorrelationMagnitudeBeam3() {
        // TODO - restore original dimensions, (remove fill values?)
        return correlationMagnitudeBeam3;
    }

    public void setCorrelationMagnitudeBeam3(List<Integer> correlationMagnitudeBeam3) {
        // TODO - flatten for storage, insert fill values
        this.correlationMagnitudeBeam3 = correlationMagnitudeBeam3;
    }
    public int getCorrelationMagnitudeBeam3Dims() {
        return correlationMagnitudeBeam3Dims;
    }

    public void setCorrelationMagnitudeBeam3Dims(int correlationMagnitudeBeam3Dims) {
        this.correlationMagnitudeBeam3Dims = correlationMagnitudeBeam3Dims;
    }
    public List<Long> getCorrelationMagnitudeBeam3Sizes() {
        return correlationMagnitudeBeam3Sizes;
    }

    public void setCorrelationMagnitudeBeam3Sizes(List<Long> correlationMagnitudeBeam3Sizes) {
        this.correlationMagnitudeBeam3Sizes = correlationMagnitudeBeam3Sizes;
    }
    public List<Integer> getCorrelationMagnitudeBeam4() {
        // TODO - restore original dimensions, (remove fill values?)
        return correlationMagnitudeBeam4;
    }

    public void setCorrelationMagnitudeBeam4(List<Integer> correlationMagnitudeBeam4) {
        // TODO - flatten for storage, insert fill values
        this.correlationMagnitudeBeam4 = correlationMagnitudeBeam4;
    }
    public int getCorrelationMagnitudeBeam4Dims() {
        return correlationMagnitudeBeam4Dims;
    }

    public void setCorrelationMagnitudeBeam4Dims(int correlationMagnitudeBeam4Dims) {
        this.correlationMagnitudeBeam4Dims = correlationMagnitudeBeam4Dims;
    }
    public List<Long> getCorrelationMagnitudeBeam4Sizes() {
        return correlationMagnitudeBeam4Sizes;
    }

    public void setCorrelationMagnitudeBeam4Sizes(List<Long> correlationMagnitudeBeam4Sizes) {
        this.correlationMagnitudeBeam4Sizes = correlationMagnitudeBeam4Sizes;
    }
    public int getEchoIntensityId() {
        return echoIntensityId;
    }

    public void setEchoIntensityId(int echoIntensityId) {
        this.echoIntensityId = echoIntensityId;
    }
    public int getNumCells() {
        return numCells;
    }

    public void setNumCells(int numCells) {
        this.numCells = numCells;
    }
    public int getNumBeams() {
        return numBeams;
    }

    public void setNumBeams(int numBeams) {
        this.numBeams = numBeams;
    }
    public int getCellLength() {
        return cellLength;
    }

    public void setCellLength(int cellLength) {
        this.cellLength = cellLength;
    }
    public int getPingsPerEnsemble() {
        return pingsPerEnsemble;
    }

    public void setPingsPerEnsemble(int pingsPerEnsemble) {
        this.pingsPerEnsemble = pingsPerEnsemble;
    }
    public int getSignalProcessingMode() {
        return signalProcessingMode;
    }

    public void setSignalProcessingMode(int signalProcessingMode) {
        this.signalProcessingMode = signalProcessingMode;
    }
    public int getBlankAfterTransmit() {
        return blankAfterTransmit;
    }

    public void setBlankAfterTransmit(int blankAfterTransmit) {
        this.blankAfterTransmit = blankAfterTransmit;
    }
    public int getNumCodeRepetitions() {
        return numCodeRepetitions;
    }

    public void setNumCodeRepetitions(int numCodeRepetitions) {
        this.numCodeRepetitions = numCodeRepetitions;
    }
    public int getLowCorrThreshold() {
        return lowCorrThreshold;
    }

    public void setLowCorrThreshold(int lowCorrThreshold) {
        this.lowCorrThreshold = lowCorrThreshold;
    }
    public int getErrorVelThreshold() {
        return errorVelThreshold;
    }

    public void setErrorVelThreshold(int errorVelThreshold) {
        this.errorVelThreshold = errorVelThreshold;
    }
    public int getPercentGoodMin() {
        return percentGoodMin;
    }

    public void setPercentGoodMin(int percentGoodMin) {
        this.percentGoodMin = percentGoodMin;
    }
    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }
    public List<Integer> getCorrelationMagnitudeBeam1() {
        // TODO - restore original dimensions, (remove fill values?)
        return correlationMagnitudeBeam1;
    }

    public void setCorrelationMagnitudeBeam1(List<Integer> correlationMagnitudeBeam1) {
        // TODO - flatten for storage, insert fill values
        this.correlationMagnitudeBeam1 = correlationMagnitudeBeam1;
    }
    public int getCorrelationMagnitudeBeam1Dims() {
        return correlationMagnitudeBeam1Dims;
    }

    public void setCorrelationMagnitudeBeam1Dims(int correlationMagnitudeBeam1Dims) {
        this.correlationMagnitudeBeam1Dims = correlationMagnitudeBeam1Dims;
    }
    public List<Long> getCorrelationMagnitudeBeam1Sizes() {
        return correlationMagnitudeBeam1Sizes;
    }

    public void setCorrelationMagnitudeBeam1Sizes(List<Long> correlationMagnitudeBeam1Sizes) {
        this.correlationMagnitudeBeam1Sizes = correlationMagnitudeBeam1Sizes;
    }
    public int getCorrelationMagnitudeId() {
        return correlationMagnitudeId;
    }

    public void setCorrelationMagnitudeId(int correlationMagnitudeId) {
        this.correlationMagnitudeId = correlationMagnitudeId;
    }
    public int getCoordTransformType() {
        return coordTransformType;
    }

    public void setCoordTransformType(int coordTransformType) {
        this.coordTransformType = coordTransformType;
    }
    public int getCoordTransformTilts() {
        return coordTransformTilts;
    }

    public void setCoordTransformTilts(int coordTransformTilts) {
        this.coordTransformTilts = coordTransformTilts;
    }
    public int getTimePerPingMinutes() {
        return timePerPingMinutes;
    }

    public void setTimePerPingMinutes(int timePerPingMinutes) {
        this.timePerPingMinutes = timePerPingMinutes;
    }
    public float getTimePerPingSeconds() {
        return timePerPingSeconds;
    }

    public void setTimePerPingSeconds(float timePerPingSeconds) {
        this.timePerPingSeconds = timePerPingSeconds;
    }
    public int getHeadingAlignment() {
        return headingAlignment;
    }

    public void setHeadingAlignment(int headingAlignment) {
        this.headingAlignment = headingAlignment;
    }
    public int getHeadingBias() {
        return headingBias;
    }

    public void setHeadingBias(int headingBias) {
        this.headingBias = headingBias;
    }
    public int getCoordTransformBeams() {
        return coordTransformBeams;
    }

    public void setCoordTransformBeams(int coordTransformBeams) {
        this.coordTransformBeams = coordTransformBeams;
    }
    public int getCoordTransformMapping() {
        return coordTransformMapping;
    }

    public void setCoordTransformMapping(int coordTransformMapping) {
        this.coordTransformMapping = coordTransformMapping;
    }
    public int getSensorSourceSpeed() {
        return sensorSourceSpeed;
    }

    public void setSensorSourceSpeed(int sensorSourceSpeed) {
        this.sensorSourceSpeed = sensorSourceSpeed;
    }
    public int getSensorSourceDepth() {
        return sensorSourceDepth;
    }

    public void setSensorSourceDepth(int sensorSourceDepth) {
        this.sensorSourceDepth = sensorSourceDepth;
    }
    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }
    public int getClockReadError() {
        return clockReadError;
    }

    public void setClockReadError(int clockReadError) {
        this.clockReadError = clockReadError;
    }
    public List<Integer> getOffsetDataTypes() {
        // TODO - restore original dimensions, (remove fill values?)
        return offsetDataTypes;
    }

    public void setOffsetDataTypes(List<Integer> offsetDataTypes) {
        // TODO - flatten for storage, insert fill values
        this.offsetDataTypes = offsetDataTypes;
    }
    public int getOffsetDataTypesDims() {
        return offsetDataTypesDims;
    }

    public void setOffsetDataTypesDims(int offsetDataTypesDims) {
        this.offsetDataTypesDims = offsetDataTypesDims;
    }
    public List<Long> getOffsetDataTypesSizes() {
        return offsetDataTypesSizes;
    }

    public void setOffsetDataTypesSizes(List<Long> offsetDataTypesSizes) {
        this.offsetDataTypesSizes = offsetDataTypesSizes;
    }
    public int getNumDataTypes() {
        return numDataTypes;
    }

    public void setNumDataTypes(int numDataTypes) {
        this.numDataTypes = numDataTypes;
    }
    public int getNumBytes() {
        return numBytes;
    }

    public void setNumBytes(int numBytes) {
        this.numBytes = numBytes;
    }
    public int getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(int dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    public int getHeaderId() {
        return headerId;
    }

    public void setHeaderId(int headerId) {
        this.headerId = headerId;
    }
    public int getAdcAttitudeTemp() {
        return adcAttitudeTemp;
    }

    public void setAdcAttitudeTemp(int adcAttitudeTemp) {
        this.adcAttitudeTemp = adcAttitudeTemp;
    }
    public int getAdcPressureMinus() {
        return adcPressureMinus;
    }

    public void setAdcPressureMinus(int adcPressureMinus) {
        this.adcPressureMinus = adcPressureMinus;
    }
    public int getAdcPressurePlus() {
        return adcPressurePlus;
    }

    public void setAdcPressurePlus(int adcPressurePlus) {
        this.adcPressurePlus = adcPressurePlus;
    }
    public int getAdcAmbientTemp() {
        return adcAmbientTemp;
    }

    public void setAdcAmbientTemp(int adcAmbientTemp) {
        this.adcAmbientTemp = adcAmbientTemp;
    }
    public int getAdcTransmitVoltage() {
        return adcTransmitVoltage;
    }

    public void setAdcTransmitVoltage(int adcTransmitVoltage) {
        this.adcTransmitVoltage = adcTransmitVoltage;
    }
    public int getAdcTransmitCurrent() {
        return adcTransmitCurrent;
    }

    public void setAdcTransmitCurrent(int adcTransmitCurrent) {
        this.adcTransmitCurrent = adcTransmitCurrent;
    }
    public int getRollStdev() {
        return rollStdev;
    }

    public void setRollStdev(int rollStdev) {
        this.rollStdev = rollStdev;
    }
    public int getPitchStdev() {
        return pitchStdev;
    }

    public void setPitchStdev(int pitchStdev) {
        this.pitchStdev = pitchStdev;
    }
    public int getAdcContaminationSensor() {
        return adcContaminationSensor;
    }

    public void setAdcContaminationSensor(int adcContaminationSensor) {
        this.adcContaminationSensor = adcContaminationSensor;
    }
    public int getAdcAttitude() {
        return adcAttitude;
    }

    public void setAdcAttitude(int adcAttitude) {
        this.adcAttitude = adcAttitude;
    }
    public int getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(int dataFlag) {
        this.dataFlag = dataFlag;
    }
    public int getLagLength() {
        return lagLength;
    }

    public void setLagLength(int lagLength) {
        this.lagLength = lagLength;
    }
    public long getPressureVariance() {
        return pressureVariance;
    }

    public void setPressureVariance(long pressureVariance) {
        this.pressureVariance = pressureVariance;
    }
    public int getFixedLeaderId() {
        return fixedLeaderId;
    }

    public void setFixedLeaderId(int fixedLeaderId) {
        this.fixedLeaderId = fixedLeaderId;
    }
    public int getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(int firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
    public int getFirmwareRevision() {
        return firmwareRevision;
    }

    public void setFirmwareRevision(int firmwareRevision) {
        this.firmwareRevision = firmwareRevision;
    }
    public int getSysconfigFrequency() {
        return sysconfigFrequency;
    }

    public void setSysconfigFrequency(int sysconfigFrequency) {
        this.sysconfigFrequency = sysconfigFrequency;
    }
    public int getSysconfigBeamPattern() {
        return sysconfigBeamPattern;
    }

    public void setSysconfigBeamPattern(int sysconfigBeamPattern) {
        this.sysconfigBeamPattern = sysconfigBeamPattern;
    }
    public int getSysconfigSensorConfig() {
        return sysconfigSensorConfig;
    }

    public void setSysconfigSensorConfig(int sysconfigSensorConfig) {
        this.sysconfigSensorConfig = sysconfigSensorConfig;
    }
    public int getSysconfigHeadAttached() {
        return sysconfigHeadAttached;
    }

    public void setSysconfigHeadAttached(int sysconfigHeadAttached) {
        this.sysconfigHeadAttached = sysconfigHeadAttached;
    }
    public int getSysconfigVerticalOrientation() {
        return sysconfigVerticalOrientation;
    }

    public void setSysconfigVerticalOrientation(int sysconfigVerticalOrientation) {
        this.sysconfigVerticalOrientation = sysconfigVerticalOrientation;
    }
    public int getBusErrorException() {
        return busErrorException;
    }

    public void setBusErrorException(int busErrorException) {
        this.busErrorException = busErrorException;
    }
    public int getAddressErrorException() {
        return addressErrorException;
    }

    public void setAddressErrorException(int addressErrorException) {
        this.addressErrorException = addressErrorException;
    }
    public int getIllegalInstructionException() {
        return illegalInstructionException;
    }

    public void setIllegalInstructionException(int illegalInstructionException) {
        this.illegalInstructionException = illegalInstructionException;
    }
    public int getZeroDivideInstruction() {
        return zeroDivideInstruction;
    }

    public void setZeroDivideInstruction(int zeroDivideInstruction) {
        this.zeroDivideInstruction = zeroDivideInstruction;
    }
    public int getEmulatorException() {
        return emulatorException;
    }

    public void setEmulatorException(int emulatorException) {
        this.emulatorException = emulatorException;
    }
    public int getUnassignedException() {
        return unassignedException;
    }

    public void setUnassignedException(int unassignedException) {
        this.unassignedException = unassignedException;
    }
    public int getWatchdogRestartOccurred() {
        return watchdogRestartOccurred;
    }

    public void setWatchdogRestartOccurred(int watchdogRestartOccurred) {
        this.watchdogRestartOccurred = watchdogRestartOccurred;
    }
    public int getBatterySaverPower() {
        return batterySaverPower;
    }

    public void setBatterySaverPower(int batterySaverPower) {
        this.batterySaverPower = batterySaverPower;
    }
    public int getColdWakeupOccurred() {
        return coldWakeupOccurred;
    }

    public void setColdWakeupOccurred(int coldWakeupOccurred) {
        this.coldWakeupOccurred = coldWakeupOccurred;
    }
    public List<Integer> getPercentGoodBeam4() {
        // TODO - restore original dimensions, (remove fill values?)
        return percentGoodBeam4;
    }

    public void setPercentGoodBeam4(List<Integer> percentGoodBeam4) {
        // TODO - flatten for storage, insert fill values
        this.percentGoodBeam4 = percentGoodBeam4;
    }
    public int getPercentGoodBeam4Dims() {
        return percentGoodBeam4Dims;
    }

    public void setPercentGoodBeam4Dims(int percentGoodBeam4Dims) {
        this.percentGoodBeam4Dims = percentGoodBeam4Dims;
    }
    public List<Long> getPercentGoodBeam4Sizes() {
        return percentGoodBeam4Sizes;
    }

    public void setPercentGoodBeam4Sizes(List<Long> percentGoodBeam4Sizes) {
        this.percentGoodBeam4Sizes = percentGoodBeam4Sizes;
    }
    public int getSensorAvailableRoll() {
        return sensorAvailableRoll;
    }

    public void setSensorAvailableRoll(int sensorAvailableRoll) {
        this.sensorAvailableRoll = sensorAvailableRoll;
    }
    public List<Integer> getBeam3Velocity() {
        // TODO - restore original dimensions, (remove fill values?)
        return beam3Velocity;
    }

    public void setBeam3Velocity(List<Integer> beam3Velocity) {
        // TODO - flatten for storage, insert fill values
        this.beam3Velocity = beam3Velocity;
    }
    public int getBeam3VelocityDims() {
        return beam3VelocityDims;
    }

    public void setBeam3VelocityDims(int beam3VelocityDims) {
        this.beam3VelocityDims = beam3VelocityDims;
    }
    public List<Long> getBeam3VelocitySizes() {
        return beam3VelocitySizes;
    }

    public void setBeam3VelocitySizes(List<Long> beam3VelocitySizes) {
        this.beam3VelocitySizes = beam3VelocitySizes;
    }
    public int getBitResultTiming() {
        return bitResultTiming;
    }

    public void setBitResultTiming(int bitResultTiming) {
        this.bitResultTiming = bitResultTiming;
    }
    public int getBitResultDemod0() {
        return bitResultDemod0;
    }

    public void setBitResultDemod0(int bitResultDemod0) {
        this.bitResultDemod0 = bitResultDemod0;
    }
    public int getVelocityDataId() {
        return velocityDataId;
    }

    public void setVelocityDataId(int velocityDataId) {
        this.velocityDataId = velocityDataId;
    }
    public int getEnsembleNumber() {
        return ensembleNumber;
    }

    public void setEnsembleNumber(int ensembleNumber) {
        this.ensembleNumber = ensembleNumber;
    }
    public int getBitResultDemod1() {
        return bitResultDemod1;
    }

    public void setBitResultDemod1(int bitResultDemod1) {
        this.bitResultDemod1 = bitResultDemod1;
    }
    public int getEnsembleNumberIncrement() {
        return ensembleNumberIncrement;
    }

    public void setEnsembleNumberIncrement(int ensembleNumberIncrement) {
        this.ensembleNumberIncrement = ensembleNumberIncrement;
    }
    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getSystemPower() {
        return systemPower;
    }

    public void setSystemPower(int systemPower) {
        this.systemPower = systemPower;
    }
    public int getVariableLeaderId() {
        return variableLeaderId;
    }

    public void setVariableLeaderId(int variableLeaderId) {
        this.variableLeaderId = variableLeaderId;
    }
    public int getBeamAngle() {
        return beamAngle;
    }

    public void setBeamAngle(int beamAngle) {
        this.beamAngle = beamAngle;
    }
    public int getSpuriousClockInterrupt() {
        return spuriousClockInterrupt;
    }

    public void setSpuriousClockInterrupt(int spuriousClockInterrupt) {
        this.spuriousClockInterrupt = spuriousClockInterrupt;
    }
    public double getEnsembleStartTime() {
        return ensembleStartTime;
    }

    public void setEnsembleStartTime(double ensembleStartTime) {
        this.ensembleStartTime = ensembleStartTime;
    }
    public int getSpuriousDspInterrupt() {
        return spuriousDspInterrupt;
    }

    public void setSpuriousDspInterrupt(int spuriousDspInterrupt) {
        this.spuriousDspInterrupt = spuriousDspInterrupt;
    }
    public int getSpuriousUartInterrupt() {
        return spuriousUartInterrupt;
    }

    public void setSpuriousUartInterrupt(int spuriousUartInterrupt) {
        this.spuriousUartInterrupt = spuriousUartInterrupt;
    }
    public int getClockJumpBackward() {
        return clockJumpBackward;
    }

    public void setClockJumpBackward(int clockJumpBackward) {
        this.clockJumpBackward = clockJumpBackward;
    }
    public int getPowerFail() {
        return powerFail;
    }

    public void setPowerFail(int powerFail) {
        this.powerFail = powerFail;
    }
    public int getUnexpectedAlarm() {
        return unexpectedAlarm;
    }

    public void setUnexpectedAlarm(int unexpectedAlarm) {
        this.unexpectedAlarm = unexpectedAlarm;
    }
    public int getClockJumpForward() {
        return clockJumpForward;
    }

    public void setClockJumpForward(int clockJumpForward) {
        this.clockJumpForward = clockJumpForward;
    }
    public float getMptSeconds() {
        return mptSeconds;
    }

    public void setMptSeconds(float mptSeconds) {
        this.mptSeconds = mptSeconds;
    }
    public int getHeadingStdev() {
        return headingStdev;
    }

    public void setHeadingStdev(int headingStdev) {
        this.headingStdev = headingStdev;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getMptMinutes() {
        return mptMinutes;
    }

    public void setMptMinutes(int mptMinutes) {
        this.mptMinutes = mptMinutes;
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getSalinity() {
        return salinity;
    }

    public void setSalinity(int salinity) {
        this.salinity = salinity;
    }
    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }
    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }
    public int getSpeedOfSound() {
        return speedOfSound;
    }

    public void setSpeedOfSound(int speedOfSound) {
        this.speedOfSound = speedOfSound;
    }
    public int getTransducerDepth() {
        return transducerDepth;
    }

    public void setTransducerDepth(int transducerDepth) {
        this.transducerDepth = transducerDepth;
    }
    public List<Integer> getBeam1Velocity() {
        // TODO - restore original dimensions, (remove fill values?)
        return beam1Velocity;
    }

    public void setBeam1Velocity(List<Integer> beam1Velocity) {
        // TODO - flatten for storage, insert fill values
        this.beam1Velocity = beam1Velocity;
    }
    public int getBeam1VelocityDims() {
        return beam1VelocityDims;
    }

    public void setBeam1VelocityDims(int beam1VelocityDims) {
        this.beam1VelocityDims = beam1VelocityDims;
    }
    public List<Long> getBeam1VelocitySizes() {
        return beam1VelocitySizes;
    }

    public void setBeam1VelocitySizes(List<Long> beam1VelocitySizes) {
        this.beam1VelocitySizes = beam1VelocitySizes;
    }
    public List<Integer> getPercentGoodBeam2() {
        // TODO - restore original dimensions, (remove fill values?)
        return percentGoodBeam2;
    }

    public void setPercentGoodBeam2(List<Integer> percentGoodBeam2) {
        // TODO - flatten for storage, insert fill values
        this.percentGoodBeam2 = percentGoodBeam2;
    }
    public int getPercentGoodBeam2Dims() {
        return percentGoodBeam2Dims;
    }

    public void setPercentGoodBeam2Dims(int percentGoodBeam2Dims) {
        this.percentGoodBeam2Dims = percentGoodBeam2Dims;
    }
    public List<Long> getPercentGoodBeam2Sizes() {
        return percentGoodBeam2Sizes;
    }

    public void setPercentGoodBeam2Sizes(List<Long> percentGoodBeam2Sizes) {
        this.percentGoodBeam2Sizes = percentGoodBeam2Sizes;
    }
    public List<Integer> getPercentGoodBeam3() {
        // TODO - restore original dimensions, (remove fill values?)
        return percentGoodBeam3;
    }

    public void setPercentGoodBeam3(List<Integer> percentGoodBeam3) {
        // TODO - flatten for storage, insert fill values
        this.percentGoodBeam3 = percentGoodBeam3;
    }
    public int getPercentGoodBeam3Dims() {
        return percentGoodBeam3Dims;
    }

    public void setPercentGoodBeam3Dims(int percentGoodBeam3Dims) {
        this.percentGoodBeam3Dims = percentGoodBeam3Dims;
    }
    public List<Long> getPercentGoodBeam3Sizes() {
        return percentGoodBeam3Sizes;
    }

    public void setPercentGoodBeam3Sizes(List<Long> percentGoodBeam3Sizes) {
        this.percentGoodBeam3Sizes = percentGoodBeam3Sizes;
    }
    public int getSensorAvailableConductivity() {
        return sensorAvailableConductivity;
    }

    public void setSensorAvailableConductivity(int sensorAvailableConductivity) {
        this.sensorAvailableConductivity = sensorAvailableConductivity;
    }
    public List<Integer> getRealTimeClock() {
        // TODO - restore original dimensions, (remove fill values?)
        return realTimeClock;
    }

    public void setRealTimeClock(List<Integer> realTimeClock) {
        // TODO - flatten for storage, insert fill values
        this.realTimeClock = realTimeClock;
    }
    public int getRealTimeClockDims() {
        return realTimeClockDims;
    }

    public void setRealTimeClockDims(int realTimeClockDims) {
        this.realTimeClockDims = realTimeClockDims;
    }
    public List<Long> getRealTimeClockSizes() {
        return realTimeClockSizes;
    }

    public void setRealTimeClockSizes(List<Long> realTimeClockSizes) {
        this.realTimeClockSizes = realTimeClockSizes;
    }
    public List<Integer> getBeam2Velocity() {
        // TODO - restore original dimensions, (remove fill values?)
        return beam2Velocity;
    }

    public void setBeam2Velocity(List<Integer> beam2Velocity) {
        // TODO - flatten for storage, insert fill values
        this.beam2Velocity = beam2Velocity;
    }
    public int getBeam2VelocityDims() {
        return beam2VelocityDims;
    }

    public void setBeam2VelocityDims(int beam2VelocityDims) {
        this.beam2VelocityDims = beam2VelocityDims;
    }
    public List<Long> getBeam2VelocitySizes() {
        return beam2VelocitySizes;
    }

    public void setBeam2VelocitySizes(List<Long> beam2VelocitySizes) {
        this.beam2VelocitySizes = beam2VelocitySizes;
    }
    public int getUnknownWakeupOccurred() {
        return unknownWakeupOccurred;
    }

    public void setUnknownWakeupOccurred(int unknownWakeupOccurred) {
        this.unknownWakeupOccurred = unknownWakeupOccurred;
    }
    public List<Integer> getBeam4Velocity() {
        // TODO - restore original dimensions, (remove fill values?)
        return beam4Velocity;
    }

    public void setBeam4Velocity(List<Integer> beam4Velocity) {
        // TODO - flatten for storage, insert fill values
        this.beam4Velocity = beam4Velocity;
    }
    public int getBeam4VelocityDims() {
        return beam4VelocityDims;
    }

    public void setBeam4VelocityDims(int beam4VelocityDims) {
        this.beam4VelocityDims = beam4VelocityDims;
    }
    public List<Long> getBeam4VelocitySizes() {
        return beam4VelocitySizes;
    }

    public void setBeam4VelocitySizes(List<Long> beam4VelocitySizes) {
        this.beam4VelocitySizes = beam4VelocitySizes;
    }
    public List<Integer> getPercentGoodBeam1() {
        // TODO - restore original dimensions, (remove fill values?)
        return percentGoodBeam1;
    }

    public void setPercentGoodBeam1(List<Integer> percentGoodBeam1) {
        // TODO - flatten for storage, insert fill values
        this.percentGoodBeam1 = percentGoodBeam1;
    }
    public int getPercentGoodBeam1Dims() {
        return percentGoodBeam1Dims;
    }

    public void setPercentGoodBeam1Dims(int percentGoodBeam1Dims) {
        this.percentGoodBeam1Dims = percentGoodBeam1Dims;
    }
    public List<Long> getPercentGoodBeam1Sizes() {
        return percentGoodBeam1Sizes;
    }

    public void setPercentGoodBeam1Sizes(List<Long> percentGoodBeam1Sizes) {
        this.percentGoodBeam1Sizes = percentGoodBeam1Sizes;
    }
    public int getSensorSourceConductivity() {
        return sensorSourceConductivity;
    }

    public void setSensorSourceConductivity(int sensorSourceConductivity) {
        this.sensorSourceConductivity = sensorSourceConductivity;
    }
    public int getSensorSourceRoll() {
        return sensorSourceRoll;
    }

    public void setSensorSourceRoll(int sensorSourceRoll) {
        this.sensorSourceRoll = sensorSourceRoll;
    }
    public int getSensorSourcePitch() {
        return sensorSourcePitch;
    }

    public void setSensorSourcePitch(int sensorSourcePitch) {
        this.sensorSourcePitch = sensorSourcePitch;
    }
    public int getSensorSourceHeading() {
        return sensorSourceHeading;
    }

    public void setSensorSourceHeading(int sensorSourceHeading) {
        this.sensorSourceHeading = sensorSourceHeading;
    }
    public int getSensorAvailablePitch() {
        return sensorAvailablePitch;
    }

    public void setSensorAvailablePitch(int sensorAvailablePitch) {
        this.sensorAvailablePitch = sensorAvailablePitch;
    }
    public int getSensorAvailableHeading() {
        return sensorAvailableHeading;
    }

    public void setSensorAvailableHeading(int sensorAvailableHeading) {
        this.sensorAvailableHeading = sensorAvailableHeading;
    }
    public int getSensorAvailableDepth() {
        return sensorAvailableDepth;
    }

    public void setSensorAvailableDepth(int sensorAvailableDepth) {
        this.sensorAvailableDepth = sensorAvailableDepth;
    }
    public int getSensorSourceTemperature() {
        return sensorSourceTemperature;
    }

    public void setSensorSourceTemperature(int sensorSourceTemperature) {
        this.sensorSourceTemperature = sensorSourceTemperature;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}