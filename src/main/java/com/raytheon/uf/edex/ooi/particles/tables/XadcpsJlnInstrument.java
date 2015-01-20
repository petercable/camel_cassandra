package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "Xadcps_jln_instrument")
public class XadcpsJlnInstrument extends CassandraParticle {

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

    @Column(value = "adcps_jln_sysconfig_beam_angle")
    private int adcpsJlnSysconfigBeamAngle;

    @Column(value = "adcps_jln_sysconfig_beam_config")
    private int adcpsJlnSysconfigBeamConfig;

    @Column(value = "data_flag")
    private int dataFlag;

    @Column(value = "lag_length")
    private int lagLength;

    @Column(value = "num_beams")
    private int numBeams;

    @Column(value = "num_cells")
    private int numCells;

    @Column(value = "pings_per_ensemble")
    private int pingsPerEnsemble;

    @Column(value = "cell_length")
    private int cellLength;

    @Column(value = "blank_after_transmit")
    private int blankAfterTransmit;

    @Column(value = "signal_processing_mode")
    private int signalProcessingMode;

    @Column(value = "low_corr_threshold")
    private int lowCorrThreshold;

    @Column(value = "num_code_repetitions")
    private int numCodeRepetitions;

    @Column(value = "percent_good_min")
    private int percentGoodMin;

    @Column(value = "error_vel_threshold")
    private int errorVelThreshold;

    @Column(value = "time_per_ping_minutes")
    private int timePerPingMinutes;

    @Column(value = "time_per_ping_seconds")
    private float timePerPingSeconds;

    @Column(value = "coord_transform_type")
    private int coordTransformType;

    @Column(value = "coord_transform_tilts")
    private int coordTransformTilts;

    @Column(value = "coord_transform_beams")
    private int coordTransformBeams;

    @Column(value = "coord_transform_mapping")
    private int coordTransformMapping;

    @Column(value = "heading_alignment")
    private int headingAlignment;

    @Column(value = "heading_bias")
    private int headingBias;

    @Column(value = "sensor_source_speed")
    private int sensorSourceSpeed;

    @Column(value = "sensor_source_depth")
    private int sensorSourceDepth;

    @Column(value = "sensor_source_heading")
    private int sensorSourceHeading;

    @Column(value = "sensor_source_pitch")
    private int sensorSourcePitch;

    @Column(value = "sensor_source_roll")
    private int sensorSourceRoll;

    @Column(value = "sensor_source_conductivity")
    private int sensorSourceConductivity;

    @Column(value = "sensor_source_temperature")
    private int sensorSourceTemperature;

    @Column(value = "sensor_available_speed")
    private int sensorAvailableSpeed;

    @Column(value = "sensor_available_depth")
    private int sensorAvailableDepth;

    @Column(value = "sensor_available_heading")
    private int sensorAvailableHeading;

    @Column(value = "sensor_available_pitch")
    private int sensorAvailablePitch;

    @Column(value = "sensor_available_roll")
    private int sensorAvailableRoll;

    @Column(value = "sensor_available_conductivity")
    private int sensorAvailableConductivity;

    @Column(value = "sensor_available_temperature")
    private int sensorAvailableTemperature;

    @Column(value = "bin_1_distance")
    private int bin1Distance;

    @Column(value = "transmit_pulse_length")
    private int transmitPulseLength;

    @Column(value = "reference_layer_start")
    private int referenceLayerStart;

    @Column(value = "reference_layer_stop")
    private int referenceLayerStop;

    @Column(value = "false_target_threshold")
    private int falseTargetThreshold;

    @Column(value = "low_latency_trigger")
    private int lowLatencyTrigger;

    @Column(value = "transmit_lag_distance")
    private int transmitLagDistance;

    @Column(value = "cpu_board_serial_number")
    private BigInteger cpuBoardSerialNumber;

    @Column(value = "system_bandwidth")
    private int systemBandwidth;

    @Column(value = "system_power")
    private int systemPower;

    @Column(value = "serial_number")
    private long serialNumber;

    @Column(value = "beam_angle")
    private int beamAngle;

    @Column(value = "ensemble_number")
    private int ensembleNumber;

    @Column(value = "real_time_clock")
    private List<Integer> realTimeClock;

    @Column(value = "real_time_clock_dims")
    private int realTimeClockDims;

    @Column(value = "real_time_clock_sizes")
    private List<Long> realTimeClockSizes;

    @Column(value = "ensemble_start_time")
    private double ensembleStartTime;

    @Column(value = "ensemble_number_increment")
    private int ensembleNumberIncrement;

    @Column(value = "bit_result_demod_1")
    private int bitResultDemod1;

    @Column(value = "bit_result_demod_0")
    private int bitResultDemod0;

    @Column(value = "bit_result_timing")
    private int bitResultTiming;

    @Column(value = "speed_of_sound")
    private int speedOfSound;

    @Column(value = "transducer_depth")
    private int transducerDepth;

    @Column(value = "heading")
    private int heading;

    @Column(value = "pitch")
    private int pitch;

    @Column(value = "roll")
    private int roll;

    @Column(value = "salinity")
    private int salinity;

    @Column(value = "temperature")
    private int temperature;

    @Column(value = "mpt_minutes")
    private int mptMinutes;

    @Column(value = "mpt_seconds")
    private float mptSeconds;

    @Column(value = "heading_stdev")
    private int headingStdev;

    @Column(value = "pitch_stdev")
    private int pitchStdev;

    @Column(value = "roll_stdev")
    private int rollStdev;

    @Column(value = "adc_transmit_current")
    private int adcTransmitCurrent;

    @Column(value = "adc_transmit_voltage")
    private int adcTransmitVoltage;

    @Column(value = "adc_ambient_temp")
    private int adcAmbientTemp;

    @Column(value = "adc_pressure_plus")
    private int adcPressurePlus;

    @Column(value = "adc_pressure_minus")
    private int adcPressureMinus;

    @Column(value = "adc_attitude_temp")
    private int adcAttitudeTemp;

    @Column(value = "adc_attitude")
    private int adcAttitude;

    @Column(value = "adc_contamination_sensor")
    private int adcContaminationSensor;

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

    @Column(value = "pinging")
    private int pinging;

    @Column(value = "cold_wakeup_occurred")
    private int coldWakeupOccurred;

    @Column(value = "unknown_wakeup_occurred")
    private int unknownWakeupOccurred;

    @Column(value = "clock_read_error")
    private int clockReadError;

    @Column(value = "unexpected_alarm")
    private int unexpectedAlarm;

    @Column(value = "clock_jump_forward")
    private int clockJumpForward;

    @Column(value = "clock_jump_backward")
    private int clockJumpBackward;

    @Column(value = "power_fail")
    private int powerFail;

    @Column(value = "spurious_dsp_interrupt")
    private int spuriousDspInterrupt;

    @Column(value = "spurious_uart_interrupt")
    private int spuriousUartInterrupt;

    @Column(value = "spurious_clock_interrupt")
    private int spuriousClockInterrupt;

    @Column(value = "level_7_interrupt")
    private int level7Interrupt;

    @Column(value = "pressure")
    private long pressure;

    @Column(value = "pressure_variance")
    private long pressureVariance;

    @Column(value = "adcps_jln_real_time_clock_2")
    private int adcpsJlnRealTimeClock2;

    @Column(value = "adcps_jln_ensemble_start_time_2")
    private double adcpsJlnEnsembleStartTime2;

    @Column(value = "water_velocity_east")
    private List<Integer> waterVelocityEast;

    @Column(value = "water_velocity_east_dims")
    private int waterVelocityEastDims;

    @Column(value = "water_velocity_east_sizes")
    private List<Long> waterVelocityEastSizes;

    @Column(value = "water_velocity_north")
    private List<Integer> waterVelocityNorth;

    @Column(value = "water_velocity_north_dims")
    private int waterVelocityNorthDims;

    @Column(value = "water_velocity_north_sizes")
    private List<Long> waterVelocityNorthSizes;

    @Column(value = "water_velocity_up")
    private List<Integer> waterVelocityUp;

    @Column(value = "water_velocity_up_dims")
    private int waterVelocityUpDims;

    @Column(value = "water_velocity_up_sizes")
    private List<Long> waterVelocityUpSizes;

    @Column(value = "correlation_magnitude_beam1")
    private List<Integer> correlationMagnitudeBeam1;

    @Column(value = "correlation_magnitude_beam1_dims")
    private int correlationMagnitudeBeam1Dims;

    @Column(value = "correlation_magnitude_beam1_sizes")
    private List<Long> correlationMagnitudeBeam1Sizes;

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

    @Column(value = "percent_good_3beam")
    private List<Integer> percentGood3beam;

    @Column(value = "percent_good_3beam_dims")
    private int percentGood3beamDims;

    @Column(value = "percent_good_3beam_sizes")
    private List<Long> percentGood3beamSizes;

    @Column(value = "percent_transforms_reject")
    private List<Integer> percentTransformsReject;

    @Column(value = "percent_transforms_reject_dims")
    private int percentTransformsRejectDims;

    @Column(value = "percent_transforms_reject_sizes")
    private List<Long> percentTransformsRejectSizes;

    @Column(value = "percent_bad_beams")
    private List<Integer> percentBadBeams;

    @Column(value = "percent_bad_beams_dims")
    private int percentBadBeamsDims;

    @Column(value = "percent_bad_beams_sizes")
    private List<Long> percentBadBeamsSizes;

    @Column(value = "percent_good_4beam")
    private List<Integer> percentGood4beam;

    @Column(value = "percent_good_4beam_dims")
    private int percentGood4beamDims;

    @Column(value = "percent_good_4beam_sizes")
    private List<Long> percentGood4beamSizes;

    @Column(value = "bt_pings_per_ensemble")
    private int btPingsPerEnsemble;

    @Column(value = "bt_delay_before_reacquire")
    private int btDelayBeforeReacquire;

    @Column(value = "bt_corr_magnitude_min")
    private int btCorrMagnitudeMin;

    @Column(value = "bt_eval_magnitude_min")
    private int btEvalMagnitudeMin;

    @Column(value = "bt_percent_good_min")
    private int btPercentGoodMin;

    @Column(value = "bt_mode")
    private int btMode;

    @Column(value = "bt_error_velocity_max")
    private int btErrorVelocityMax;

    @Column(value = "bt_beam1_range")
    private long btBeam1Range;

    @Column(value = "bt_beam2_range")
    private long btBeam2Range;

    @Column(value = "bt_beam3_range")
    private long btBeam3Range;

    @Column(value = "bt_beam4_range")
    private long btBeam4Range;

    @Column(value = "bt_northward_velocity")
    private int btNorthwardVelocity;

    @Column(value = "bt_upward_velocity")
    private int btUpwardVelocity;

    @Column(value = "bt_error_velocity")
    private int btErrorVelocity;

    @Column(value = "bt_beam1_correlation")
    private int btBeam1Correlation;

    @Column(value = "bt_beam2_correlation")
    private int btBeam2Correlation;

    @Column(value = "bt_beam4_correlation")
    private int btBeam4Correlation;

    @Column(value = "bt_beam1_eval_amp")
    private int btBeam1EvalAmp;

    @Column(value = "bt_beam2_eval_amp")
    private int btBeam2EvalAmp;

    @Column(value = "bt_beam3_eval_amp")
    private int btBeam3EvalAmp;

    @Column(value = "bt_beam4_eval_amp")
    private int btBeam4EvalAmp;

    @Column(value = "bt_beam1_percent_good")
    private int btBeam1PercentGood;

    @Column(value = "bt_beam2_percent_good")
    private int btBeam2PercentGood;

    @Column(value = "bt_beam3_percent_good")
    private int btBeam3PercentGood;

    @Column(value = "bt_beam4_percent_good")
    private int btBeam4PercentGood;

    @Column(value = "bt_ref_layer_min")
    private int btRefLayerMin;

    @Column(value = "bt_ref_layer_near")
    private int btRefLayerNear;

    @Column(value = "bt_ref_layer_far")
    private int btRefLayerFar;

    @Column(value = "bt_eastward_ref_layer_velocity")
    private int btEastwardRefLayerVelocity;

    @Column(value = "bt_northward_ref_layer_velocity")
    private int btNorthwardRefLayerVelocity;

    @Column(value = "bt_upward_ref_layer_velocity")
    private int btUpwardRefLayerVelocity;

    @Column(value = "bt_error_ref_layer_velocity")
    private int btErrorRefLayerVelocity;

    @Column(value = "bt_beam1_ref_correlation")
    private int btBeam1RefCorrelation;

    @Column(value = "bt_beam2_ref_correlation")
    private int btBeam2RefCorrelation;

    @Column(value = "bt_beam3_ref_correlation")
    private int btBeam3RefCorrelation;

    @Column(value = "bt_beam4_ref_correlation")
    private int btBeam4RefCorrelation;

    @Column(value = "bt_beam1_ref_intensity")
    private int btBeam1RefIntensity;

    @Column(value = "bt_beam2_ref_intensity")
    private int btBeam2RefIntensity;

    @Column(value = "bt_beam3_ref_intensity")
    private int btBeam3RefIntensity;

    @Column(value = "bt_beam4_ref_intensity")
    private int btBeam4RefIntensity;

    @Column(value = "bt_beam1_ref_percent_good")
    private int btBeam1RefPercentGood;

    @Column(value = "bt_beam2_ref_percent_good")
    private int btBeam2RefPercentGood;

    @Column(value = "bt_beam3_ref_percent_good")
    private int btBeam3RefPercentGood;

    @Column(value = "bt_beam4_ref_percent_good")
    private int btBeam4RefPercentGood;

    @Column(value = "bt_max_depth")
    private int btMaxDepth;

    @Column(value = "bt_beam1_rssi_amplitude")
    private int btBeam1RssiAmplitude;

    @Column(value = "bt_beam2_rssi_amplitude")
    private int btBeam2RssiAmplitude;

    @Column(value = "bt_beam3_rssi_amplitude")
    private int btBeam3RssiAmplitude;

    @Column(value = "bt_beam4_rssi_amplitude")
    private int btBeam4RssiAmplitude;

    @Column(value = "bt_gain")
    private int btGain;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setFirmwareVersion((int) particle.get("firmware_version"));
        setFirmwareRevision((int) particle.get("firmware_revision"));
        setSysconfigFrequency((int) particle.get("sysconfig_frequency"));
        setSysconfigBeamPattern((int) particle.get("sysconfig_beam_pattern"));
        setSysconfigSensorConfig((int) particle.get("sysconfig_sensor_config"));
        setSysconfigHeadAttached((int) particle.get("sysconfig_head_attached"));
        setSysconfigVerticalOrientation((int) particle.get("sysconfig_vertical_orientation"));
        setAdcpsJlnSysconfigBeamAngle((int) particle.get("adcps_jln_sysconfig_beam_angle"));
        setAdcpsJlnSysconfigBeamConfig((int) particle.get("adcps_jln_sysconfig_beam_config"));
        setDataFlag((int) particle.get("data_flag"));
        setLagLength((int) particle.get("lag_length"));
        setNumBeams((int) particle.get("num_beams"));
        setNumCells((int) particle.get("num_cells"));
        setPingsPerEnsemble((int) particle.get("pings_per_ensemble"));
        setCellLength((int) particle.get("cell_length"));
        setBlankAfterTransmit((int) particle.get("blank_after_transmit"));
        setSignalProcessingMode((int) particle.get("signal_processing_mode"));
        setLowCorrThreshold((int) particle.get("low_corr_threshold"));
        setNumCodeRepetitions((int) particle.get("num_code_repetitions"));
        setPercentGoodMin((int) particle.get("percent_good_min"));
        setErrorVelThreshold((int) particle.get("error_vel_threshold"));
        setTimePerPingMinutes((int) particle.get("time_per_ping_minutes"));
        setTimePerPingSeconds((float) particle.get("time_per_ping_seconds"));
        setCoordTransformType((int) particle.get("coord_transform_type"));
        setCoordTransformTilts((int) particle.get("coord_transform_tilts"));
        setCoordTransformBeams((int) particle.get("coord_transform_beams"));
        setCoordTransformMapping((int) particle.get("coord_transform_mapping"));
        setHeadingAlignment((int) particle.get("heading_alignment"));
        setHeadingBias((int) particle.get("heading_bias"));
        setSensorSourceSpeed((int) particle.get("sensor_source_speed"));
        setSensorSourceDepth((int) particle.get("sensor_source_depth"));
        setSensorSourceHeading((int) particle.get("sensor_source_heading"));
        setSensorSourcePitch((int) particle.get("sensor_source_pitch"));
        setSensorSourceRoll((int) particle.get("sensor_source_roll"));
        setSensorSourceConductivity((int) particle.get("sensor_source_conductivity"));
        setSensorSourceTemperature((int) particle.get("sensor_source_temperature"));
        setSensorAvailableSpeed((int) particle.get("sensor_available_speed"));
        setSensorAvailableDepth((int) particle.get("sensor_available_depth"));
        setSensorAvailableHeading((int) particle.get("sensor_available_heading"));
        setSensorAvailablePitch((int) particle.get("sensor_available_pitch"));
        setSensorAvailableRoll((int) particle.get("sensor_available_roll"));
        setSensorAvailableConductivity((int) particle.get("sensor_available_conductivity"));
        setSensorAvailableTemperature((int) particle.get("sensor_available_temperature"));
        setBin1Distance((int) particle.get("bin_1_distance"));
        setTransmitPulseLength((int) particle.get("transmit_pulse_length"));
        setReferenceLayerStart((int) particle.get("reference_layer_start"));
        setReferenceLayerStop((int) particle.get("reference_layer_stop"));
        setFalseTargetThreshold((int) particle.get("false_target_threshold"));
        setLowLatencyTrigger((int) particle.get("low_latency_trigger"));
        setTransmitLagDistance((int) particle.get("transmit_lag_distance"));
        setCpuBoardSerialNumber((BigInteger) particle.get("cpu_board_serial_number"));
        setSystemBandwidth((int) particle.get("system_bandwidth"));
        setSystemPower((int) particle.get("system_power"));
        setSerialNumber((long) particle.get("serial_number"));
        setBeamAngle((int) particle.get("beam_angle"));
        setEnsembleNumber((int) particle.get("ensemble_number"));
        setRealTimeClock((List<Integer>) particle.get("real_time_clock"));
        setRealTimeClockDims((int) particle.get("real_time_clock_dims"));
        setRealTimeClockSizes((List<Long>) particle.get("real_time_clock_sizes"));
        setEnsembleStartTime((double) particle.get("ensemble_start_time"));
        setEnsembleNumberIncrement((int) particle.get("ensemble_number_increment"));
        setBitResultDemod1((int) particle.get("bit_result_demod_1"));
        setBitResultDemod0((int) particle.get("bit_result_demod_0"));
        setBitResultTiming((int) particle.get("bit_result_timing"));
        setSpeedOfSound((int) particle.get("speed_of_sound"));
        setTransducerDepth((int) particle.get("transducer_depth"));
        setHeading((int) particle.get("heading"));
        setPitch((int) particle.get("pitch"));
        setRoll((int) particle.get("roll"));
        setSalinity((int) particle.get("salinity"));
        setTemperature((int) particle.get("temperature"));
        setMptMinutes((int) particle.get("mpt_minutes"));
        setMptSeconds((float) particle.get("mpt_seconds"));
        setHeadingStdev((int) particle.get("heading_stdev"));
        setPitchStdev((int) particle.get("pitch_stdev"));
        setRollStdev((int) particle.get("roll_stdev"));
        setAdcTransmitCurrent((int) particle.get("adc_transmit_current"));
        setAdcTransmitVoltage((int) particle.get("adc_transmit_voltage"));
        setAdcAmbientTemp((int) particle.get("adc_ambient_temp"));
        setAdcPressurePlus((int) particle.get("adc_pressure_plus"));
        setAdcPressureMinus((int) particle.get("adc_pressure_minus"));
        setAdcAttitudeTemp((int) particle.get("adc_attitude_temp"));
        setAdcAttitude((int) particle.get("adc_attitude"));
        setAdcContaminationSensor((int) particle.get("adc_contamination_sensor"));
        setBusErrorException((int) particle.get("bus_error_exception"));
        setAddressErrorException((int) particle.get("address_error_exception"));
        setIllegalInstructionException((int) particle.get("illegal_instruction_exception"));
        setZeroDivideInstruction((int) particle.get("zero_divide_instruction"));
        setEmulatorException((int) particle.get("emulator_exception"));
        setUnassignedException((int) particle.get("unassigned_exception"));
        setWatchdogRestartOccurred((int) particle.get("watchdog_restart_occurred"));
        setBatterySaverPower((int) particle.get("battery_saver_power"));
        setPinging((int) particle.get("pinging"));
        setColdWakeupOccurred((int) particle.get("cold_wakeup_occurred"));
        setUnknownWakeupOccurred((int) particle.get("unknown_wakeup_occurred"));
        setClockReadError((int) particle.get("clock_read_error"));
        setUnexpectedAlarm((int) particle.get("unexpected_alarm"));
        setClockJumpForward((int) particle.get("clock_jump_forward"));
        setClockJumpBackward((int) particle.get("clock_jump_backward"));
        setPowerFail((int) particle.get("power_fail"));
        setSpuriousDspInterrupt((int) particle.get("spurious_dsp_interrupt"));
        setSpuriousUartInterrupt((int) particle.get("spurious_uart_interrupt"));
        setSpuriousClockInterrupt((int) particle.get("spurious_clock_interrupt"));
        setLevel7Interrupt((int) particle.get("level_7_interrupt"));
        setPressure((long) particle.get("pressure"));
        setPressureVariance((long) particle.get("pressure_variance"));
        setAdcpsJlnRealTimeClock2((int) particle.get("adcps_jln_real_time_clock_2"));
        setAdcpsJlnEnsembleStartTime2((double) particle.get("adcps_jln_ensemble_start_time_2"));
        setWaterVelocityEast((List<Integer>) particle.get("water_velocity_east"));
        setWaterVelocityEastDims((int) particle.get("water_velocity_east_dims"));
        setWaterVelocityEastSizes((List<Long>) particle.get("water_velocity_east_sizes"));
        setWaterVelocityNorth((List<Integer>) particle.get("water_velocity_north"));
        setWaterVelocityNorthDims((int) particle.get("water_velocity_north_dims"));
        setWaterVelocityNorthSizes((List<Long>) particle.get("water_velocity_north_sizes"));
        setWaterVelocityUp((List<Integer>) particle.get("water_velocity_up"));
        setWaterVelocityUpDims((int) particle.get("water_velocity_up_dims"));
        setWaterVelocityUpSizes((List<Long>) particle.get("water_velocity_up_sizes"));
        setCorrelationMagnitudeBeam1((List<Integer>) particle.get("correlation_magnitude_beam1"));
        setCorrelationMagnitudeBeam1Dims((int) particle.get("correlation_magnitude_beam1_dims"));
        setCorrelationMagnitudeBeam1Sizes((List<Long>) particle.get("correlation_magnitude_beam1_sizes"));
        setCorrelationMagnitudeBeam2((List<Integer>) particle.get("correlation_magnitude_beam2"));
        setCorrelationMagnitudeBeam2Dims((int) particle.get("correlation_magnitude_beam2_dims"));
        setCorrelationMagnitudeBeam2Sizes((List<Long>) particle.get("correlation_magnitude_beam2_sizes"));
        setCorrelationMagnitudeBeam3((List<Integer>) particle.get("correlation_magnitude_beam3"));
        setCorrelationMagnitudeBeam3Dims((int) particle.get("correlation_magnitude_beam3_dims"));
        setCorrelationMagnitudeBeam3Sizes((List<Long>) particle.get("correlation_magnitude_beam3_sizes"));
        setCorrelationMagnitudeBeam4((List<Integer>) particle.get("correlation_magnitude_beam4"));
        setCorrelationMagnitudeBeam4Dims((int) particle.get("correlation_magnitude_beam4_dims"));
        setCorrelationMagnitudeBeam4Sizes((List<Long>) particle.get("correlation_magnitude_beam4_sizes"));
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
        setPercentGood3beam((List<Integer>) particle.get("percent_good_3beam"));
        setPercentGood3beamDims((int) particle.get("percent_good_3beam_dims"));
        setPercentGood3beamSizes((List<Long>) particle.get("percent_good_3beam_sizes"));
        setPercentTransformsReject((List<Integer>) particle.get("percent_transforms_reject"));
        setPercentTransformsRejectDims((int) particle.get("percent_transforms_reject_dims"));
        setPercentTransformsRejectSizes((List<Long>) particle.get("percent_transforms_reject_sizes"));
        setPercentBadBeams((List<Integer>) particle.get("percent_bad_beams"));
        setPercentBadBeamsDims((int) particle.get("percent_bad_beams_dims"));
        setPercentBadBeamsSizes((List<Long>) particle.get("percent_bad_beams_sizes"));
        setPercentGood4beam((List<Integer>) particle.get("percent_good_4beam"));
        setPercentGood4beamDims((int) particle.get("percent_good_4beam_dims"));
        setPercentGood4beamSizes((List<Long>) particle.get("percent_good_4beam_sizes"));
        setBtPingsPerEnsemble((int) particle.get("bt_pings_per_ensemble"));
        setBtDelayBeforeReacquire((int) particle.get("bt_delay_before_reacquire"));
        setBtCorrMagnitudeMin((int) particle.get("bt_corr_magnitude_min"));
        setBtEvalMagnitudeMin((int) particle.get("bt_eval_magnitude_min"));
        setBtPercentGoodMin((int) particle.get("bt_percent_good_min"));
        setBtMode((int) particle.get("bt_mode"));
        setBtErrorVelocityMax((int) particle.get("bt_error_velocity_max"));
        setBtBeam1Range((long) particle.get("bt_beam1_range"));
        setBtBeam2Range((long) particle.get("bt_beam2_range"));
        setBtBeam3Range((long) particle.get("bt_beam3_range"));
        setBtBeam4Range((long) particle.get("bt_beam4_range"));
        setBtNorthwardVelocity((int) particle.get("bt_northward_velocity"));
        setBtUpwardVelocity((int) particle.get("bt_upward_velocity"));
        setBtErrorVelocity((int) particle.get("bt_error_velocity"));
        setBtBeam1Correlation((int) particle.get("bt_beam1_correlation"));
        setBtBeam2Correlation((int) particle.get("bt_beam2_correlation"));
        setBtBeam4Correlation((int) particle.get("bt_beam4_correlation"));
        setBtBeam1EvalAmp((int) particle.get("bt_beam1_eval_amp"));
        setBtBeam2EvalAmp((int) particle.get("bt_beam2_eval_amp"));
        setBtBeam3EvalAmp((int) particle.get("bt_beam3_eval_amp"));
        setBtBeam4EvalAmp((int) particle.get("bt_beam4_eval_amp"));
        setBtBeam1PercentGood((int) particle.get("bt_beam1_percent_good"));
        setBtBeam2PercentGood((int) particle.get("bt_beam2_percent_good"));
        setBtBeam3PercentGood((int) particle.get("bt_beam3_percent_good"));
        setBtBeam4PercentGood((int) particle.get("bt_beam4_percent_good"));
        setBtRefLayerMin((int) particle.get("bt_ref_layer_min"));
        setBtRefLayerNear((int) particle.get("bt_ref_layer_near"));
        setBtRefLayerFar((int) particle.get("bt_ref_layer_far"));
        setBtEastwardRefLayerVelocity((int) particle.get("bt_eastward_ref_layer_velocity"));
        setBtNorthwardRefLayerVelocity((int) particle.get("bt_northward_ref_layer_velocity"));
        setBtUpwardRefLayerVelocity((int) particle.get("bt_upward_ref_layer_velocity"));
        setBtErrorRefLayerVelocity((int) particle.get("bt_error_ref_layer_velocity"));
        setBtBeam1RefCorrelation((int) particle.get("bt_beam1_ref_correlation"));
        setBtBeam2RefCorrelation((int) particle.get("bt_beam2_ref_correlation"));
        setBtBeam3RefCorrelation((int) particle.get("bt_beam3_ref_correlation"));
        setBtBeam4RefCorrelation((int) particle.get("bt_beam4_ref_correlation"));
        setBtBeam1RefIntensity((int) particle.get("bt_beam1_ref_intensity"));
        setBtBeam2RefIntensity((int) particle.get("bt_beam2_ref_intensity"));
        setBtBeam3RefIntensity((int) particle.get("bt_beam3_ref_intensity"));
        setBtBeam4RefIntensity((int) particle.get("bt_beam4_ref_intensity"));
        setBtBeam1RefPercentGood((int) particle.get("bt_beam1_ref_percent_good"));
        setBtBeam2RefPercentGood((int) particle.get("bt_beam2_ref_percent_good"));
        setBtBeam3RefPercentGood((int) particle.get("bt_beam3_ref_percent_good"));
        setBtBeam4RefPercentGood((int) particle.get("bt_beam4_ref_percent_good"));
        setBtMaxDepth((int) particle.get("bt_max_depth"));
        setBtBeam1RssiAmplitude((int) particle.get("bt_beam1_rssi_amplitude"));
        setBtBeam2RssiAmplitude((int) particle.get("bt_beam2_rssi_amplitude"));
        setBtBeam3RssiAmplitude((int) particle.get("bt_beam3_rssi_amplitude"));
        setBtBeam4RssiAmplitude((int) particle.get("bt_beam4_rssi_amplitude"));
        setBtGain((int) particle.get("bt_gain"));
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
    public int getAdcpsJlnSysconfigBeamAngle() {
        return adcpsJlnSysconfigBeamAngle;
    }

    public void setAdcpsJlnSysconfigBeamAngle(int adcpsJlnSysconfigBeamAngle) {
        this.adcpsJlnSysconfigBeamAngle = adcpsJlnSysconfigBeamAngle;
    }
    public int getAdcpsJlnSysconfigBeamConfig() {
        return adcpsJlnSysconfigBeamConfig;
    }

    public void setAdcpsJlnSysconfigBeamConfig(int adcpsJlnSysconfigBeamConfig) {
        this.adcpsJlnSysconfigBeamConfig = adcpsJlnSysconfigBeamConfig;
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
    public int getNumBeams() {
        return numBeams;
    }

    public void setNumBeams(int numBeams) {
        this.numBeams = numBeams;
    }
    public int getNumCells() {
        return numCells;
    }

    public void setNumCells(int numCells) {
        this.numCells = numCells;
    }
    public int getPingsPerEnsemble() {
        return pingsPerEnsemble;
    }

    public void setPingsPerEnsemble(int pingsPerEnsemble) {
        this.pingsPerEnsemble = pingsPerEnsemble;
    }
    public int getCellLength() {
        return cellLength;
    }

    public void setCellLength(int cellLength) {
        this.cellLength = cellLength;
    }
    public int getBlankAfterTransmit() {
        return blankAfterTransmit;
    }

    public void setBlankAfterTransmit(int blankAfterTransmit) {
        this.blankAfterTransmit = blankAfterTransmit;
    }
    public int getSignalProcessingMode() {
        return signalProcessingMode;
    }

    public void setSignalProcessingMode(int signalProcessingMode) {
        this.signalProcessingMode = signalProcessingMode;
    }
    public int getLowCorrThreshold() {
        return lowCorrThreshold;
    }

    public void setLowCorrThreshold(int lowCorrThreshold) {
        this.lowCorrThreshold = lowCorrThreshold;
    }
    public int getNumCodeRepetitions() {
        return numCodeRepetitions;
    }

    public void setNumCodeRepetitions(int numCodeRepetitions) {
        this.numCodeRepetitions = numCodeRepetitions;
    }
    public int getPercentGoodMin() {
        return percentGoodMin;
    }

    public void setPercentGoodMin(int percentGoodMin) {
        this.percentGoodMin = percentGoodMin;
    }
    public int getErrorVelThreshold() {
        return errorVelThreshold;
    }

    public void setErrorVelThreshold(int errorVelThreshold) {
        this.errorVelThreshold = errorVelThreshold;
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
    public int getSensorSourceHeading() {
        return sensorSourceHeading;
    }

    public void setSensorSourceHeading(int sensorSourceHeading) {
        this.sensorSourceHeading = sensorSourceHeading;
    }
    public int getSensorSourcePitch() {
        return sensorSourcePitch;
    }

    public void setSensorSourcePitch(int sensorSourcePitch) {
        this.sensorSourcePitch = sensorSourcePitch;
    }
    public int getSensorSourceRoll() {
        return sensorSourceRoll;
    }

    public void setSensorSourceRoll(int sensorSourceRoll) {
        this.sensorSourceRoll = sensorSourceRoll;
    }
    public int getSensorSourceConductivity() {
        return sensorSourceConductivity;
    }

    public void setSensorSourceConductivity(int sensorSourceConductivity) {
        this.sensorSourceConductivity = sensorSourceConductivity;
    }
    public int getSensorSourceTemperature() {
        return sensorSourceTemperature;
    }

    public void setSensorSourceTemperature(int sensorSourceTemperature) {
        this.sensorSourceTemperature = sensorSourceTemperature;
    }
    public int getSensorAvailableSpeed() {
        return sensorAvailableSpeed;
    }

    public void setSensorAvailableSpeed(int sensorAvailableSpeed) {
        this.sensorAvailableSpeed = sensorAvailableSpeed;
    }
    public int getSensorAvailableDepth() {
        return sensorAvailableDepth;
    }

    public void setSensorAvailableDepth(int sensorAvailableDepth) {
        this.sensorAvailableDepth = sensorAvailableDepth;
    }
    public int getSensorAvailableHeading() {
        return sensorAvailableHeading;
    }

    public void setSensorAvailableHeading(int sensorAvailableHeading) {
        this.sensorAvailableHeading = sensorAvailableHeading;
    }
    public int getSensorAvailablePitch() {
        return sensorAvailablePitch;
    }

    public void setSensorAvailablePitch(int sensorAvailablePitch) {
        this.sensorAvailablePitch = sensorAvailablePitch;
    }
    public int getSensorAvailableRoll() {
        return sensorAvailableRoll;
    }

    public void setSensorAvailableRoll(int sensorAvailableRoll) {
        this.sensorAvailableRoll = sensorAvailableRoll;
    }
    public int getSensorAvailableConductivity() {
        return sensorAvailableConductivity;
    }

    public void setSensorAvailableConductivity(int sensorAvailableConductivity) {
        this.sensorAvailableConductivity = sensorAvailableConductivity;
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
    public int getSystemPower() {
        return systemPower;
    }

    public void setSystemPower(int systemPower) {
        this.systemPower = systemPower;
    }
    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getBeamAngle() {
        return beamAngle;
    }

    public void setBeamAngle(int beamAngle) {
        this.beamAngle = beamAngle;
    }
    public int getEnsembleNumber() {
        return ensembleNumber;
    }

    public void setEnsembleNumber(int ensembleNumber) {
        this.ensembleNumber = ensembleNumber;
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
    public double getEnsembleStartTime() {
        return ensembleStartTime;
    }

    public void setEnsembleStartTime(double ensembleStartTime) {
        this.ensembleStartTime = ensembleStartTime;
    }
    public int getEnsembleNumberIncrement() {
        return ensembleNumberIncrement;
    }

    public void setEnsembleNumberIncrement(int ensembleNumberIncrement) {
        this.ensembleNumberIncrement = ensembleNumberIncrement;
    }
    public int getBitResultDemod1() {
        return bitResultDemod1;
    }

    public void setBitResultDemod1(int bitResultDemod1) {
        this.bitResultDemod1 = bitResultDemod1;
    }
    public int getBitResultDemod0() {
        return bitResultDemod0;
    }

    public void setBitResultDemod0(int bitResultDemod0) {
        this.bitResultDemod0 = bitResultDemod0;
    }
    public int getBitResultTiming() {
        return bitResultTiming;
    }

    public void setBitResultTiming(int bitResultTiming) {
        this.bitResultTiming = bitResultTiming;
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
    public int getPitchStdev() {
        return pitchStdev;
    }

    public void setPitchStdev(int pitchStdev) {
        this.pitchStdev = pitchStdev;
    }
    public int getRollStdev() {
        return rollStdev;
    }

    public void setRollStdev(int rollStdev) {
        this.rollStdev = rollStdev;
    }
    public int getAdcTransmitCurrent() {
        return adcTransmitCurrent;
    }

    public void setAdcTransmitCurrent(int adcTransmitCurrent) {
        this.adcTransmitCurrent = adcTransmitCurrent;
    }
    public int getAdcTransmitVoltage() {
        return adcTransmitVoltage;
    }

    public void setAdcTransmitVoltage(int adcTransmitVoltage) {
        this.adcTransmitVoltage = adcTransmitVoltage;
    }
    public int getAdcAmbientTemp() {
        return adcAmbientTemp;
    }

    public void setAdcAmbientTemp(int adcAmbientTemp) {
        this.adcAmbientTemp = adcAmbientTemp;
    }
    public int getAdcPressurePlus() {
        return adcPressurePlus;
    }

    public void setAdcPressurePlus(int adcPressurePlus) {
        this.adcPressurePlus = adcPressurePlus;
    }
    public int getAdcPressureMinus() {
        return adcPressureMinus;
    }

    public void setAdcPressureMinus(int adcPressureMinus) {
        this.adcPressureMinus = adcPressureMinus;
    }
    public int getAdcAttitudeTemp() {
        return adcAttitudeTemp;
    }

    public void setAdcAttitudeTemp(int adcAttitudeTemp) {
        this.adcAttitudeTemp = adcAttitudeTemp;
    }
    public int getAdcAttitude() {
        return adcAttitude;
    }

    public void setAdcAttitude(int adcAttitude) {
        this.adcAttitude = adcAttitude;
    }
    public int getAdcContaminationSensor() {
        return adcContaminationSensor;
    }

    public void setAdcContaminationSensor(int adcContaminationSensor) {
        this.adcContaminationSensor = adcContaminationSensor;
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
    public int getPinging() {
        return pinging;
    }

    public void setPinging(int pinging) {
        this.pinging = pinging;
    }
    public int getColdWakeupOccurred() {
        return coldWakeupOccurred;
    }

    public void setColdWakeupOccurred(int coldWakeupOccurred) {
        this.coldWakeupOccurred = coldWakeupOccurred;
    }
    public int getUnknownWakeupOccurred() {
        return unknownWakeupOccurred;
    }

    public void setUnknownWakeupOccurred(int unknownWakeupOccurred) {
        this.unknownWakeupOccurred = unknownWakeupOccurred;
    }
    public int getClockReadError() {
        return clockReadError;
    }

    public void setClockReadError(int clockReadError) {
        this.clockReadError = clockReadError;
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
    public int getSpuriousClockInterrupt() {
        return spuriousClockInterrupt;
    }

    public void setSpuriousClockInterrupt(int spuriousClockInterrupt) {
        this.spuriousClockInterrupt = spuriousClockInterrupt;
    }
    public int getLevel7Interrupt() {
        return level7Interrupt;
    }

    public void setLevel7Interrupt(int level7Interrupt) {
        this.level7Interrupt = level7Interrupt;
    }
    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }
    public long getPressureVariance() {
        return pressureVariance;
    }

    public void setPressureVariance(long pressureVariance) {
        this.pressureVariance = pressureVariance;
    }
    public int getAdcpsJlnRealTimeClock2() {
        return adcpsJlnRealTimeClock2;
    }

    public void setAdcpsJlnRealTimeClock2(int adcpsJlnRealTimeClock2) {
        this.adcpsJlnRealTimeClock2 = adcpsJlnRealTimeClock2;
    }
    public double getAdcpsJlnEnsembleStartTime2() {
        return adcpsJlnEnsembleStartTime2;
    }

    public void setAdcpsJlnEnsembleStartTime2(double adcpsJlnEnsembleStartTime2) {
        this.adcpsJlnEnsembleStartTime2 = adcpsJlnEnsembleStartTime2;
    }
    public List<Integer> getWaterVelocityEast() {
        // TODO - restore original dimensions, (remove fill values?)
        return waterVelocityEast;
    }

    public void setWaterVelocityEast(List<Integer> waterVelocityEast) {
        // TODO - flatten for storage, insert fill values
        this.waterVelocityEast = waterVelocityEast;
    }
    public int getWaterVelocityEastDims() {
        return waterVelocityEastDims;
    }

    public void setWaterVelocityEastDims(int waterVelocityEastDims) {
        this.waterVelocityEastDims = waterVelocityEastDims;
    }
    public List<Long> getWaterVelocityEastSizes() {
        return waterVelocityEastSizes;
    }

    public void setWaterVelocityEastSizes(List<Long> waterVelocityEastSizes) {
        this.waterVelocityEastSizes = waterVelocityEastSizes;
    }
    public List<Integer> getWaterVelocityNorth() {
        // TODO - restore original dimensions, (remove fill values?)
        return waterVelocityNorth;
    }

    public void setWaterVelocityNorth(List<Integer> waterVelocityNorth) {
        // TODO - flatten for storage, insert fill values
        this.waterVelocityNorth = waterVelocityNorth;
    }
    public int getWaterVelocityNorthDims() {
        return waterVelocityNorthDims;
    }

    public void setWaterVelocityNorthDims(int waterVelocityNorthDims) {
        this.waterVelocityNorthDims = waterVelocityNorthDims;
    }
    public List<Long> getWaterVelocityNorthSizes() {
        return waterVelocityNorthSizes;
    }

    public void setWaterVelocityNorthSizes(List<Long> waterVelocityNorthSizes) {
        this.waterVelocityNorthSizes = waterVelocityNorthSizes;
    }
    public List<Integer> getWaterVelocityUp() {
        // TODO - restore original dimensions, (remove fill values?)
        return waterVelocityUp;
    }

    public void setWaterVelocityUp(List<Integer> waterVelocityUp) {
        // TODO - flatten for storage, insert fill values
        this.waterVelocityUp = waterVelocityUp;
    }
    public int getWaterVelocityUpDims() {
        return waterVelocityUpDims;
    }

    public void setWaterVelocityUpDims(int waterVelocityUpDims) {
        this.waterVelocityUpDims = waterVelocityUpDims;
    }
    public List<Long> getWaterVelocityUpSizes() {
        return waterVelocityUpSizes;
    }

    public void setWaterVelocityUpSizes(List<Long> waterVelocityUpSizes) {
        this.waterVelocityUpSizes = waterVelocityUpSizes;
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
    public List<Integer> getPercentGood3beam() {
        // TODO - restore original dimensions, (remove fill values?)
        return percentGood3beam;
    }

    public void setPercentGood3beam(List<Integer> percentGood3beam) {
        // TODO - flatten for storage, insert fill values
        this.percentGood3beam = percentGood3beam;
    }
    public int getPercentGood3beamDims() {
        return percentGood3beamDims;
    }

    public void setPercentGood3beamDims(int percentGood3beamDims) {
        this.percentGood3beamDims = percentGood3beamDims;
    }
    public List<Long> getPercentGood3beamSizes() {
        return percentGood3beamSizes;
    }

    public void setPercentGood3beamSizes(List<Long> percentGood3beamSizes) {
        this.percentGood3beamSizes = percentGood3beamSizes;
    }
    public List<Integer> getPercentTransformsReject() {
        // TODO - restore original dimensions, (remove fill values?)
        return percentTransformsReject;
    }

    public void setPercentTransformsReject(List<Integer> percentTransformsReject) {
        // TODO - flatten for storage, insert fill values
        this.percentTransformsReject = percentTransformsReject;
    }
    public int getPercentTransformsRejectDims() {
        return percentTransformsRejectDims;
    }

    public void setPercentTransformsRejectDims(int percentTransformsRejectDims) {
        this.percentTransformsRejectDims = percentTransformsRejectDims;
    }
    public List<Long> getPercentTransformsRejectSizes() {
        return percentTransformsRejectSizes;
    }

    public void setPercentTransformsRejectSizes(List<Long> percentTransformsRejectSizes) {
        this.percentTransformsRejectSizes = percentTransformsRejectSizes;
    }
    public List<Integer> getPercentBadBeams() {
        // TODO - restore original dimensions, (remove fill values?)
        return percentBadBeams;
    }

    public void setPercentBadBeams(List<Integer> percentBadBeams) {
        // TODO - flatten for storage, insert fill values
        this.percentBadBeams = percentBadBeams;
    }
    public int getPercentBadBeamsDims() {
        return percentBadBeamsDims;
    }

    public void setPercentBadBeamsDims(int percentBadBeamsDims) {
        this.percentBadBeamsDims = percentBadBeamsDims;
    }
    public List<Long> getPercentBadBeamsSizes() {
        return percentBadBeamsSizes;
    }

    public void setPercentBadBeamsSizes(List<Long> percentBadBeamsSizes) {
        this.percentBadBeamsSizes = percentBadBeamsSizes;
    }
    public List<Integer> getPercentGood4beam() {
        // TODO - restore original dimensions, (remove fill values?)
        return percentGood4beam;
    }

    public void setPercentGood4beam(List<Integer> percentGood4beam) {
        // TODO - flatten for storage, insert fill values
        this.percentGood4beam = percentGood4beam;
    }
    public int getPercentGood4beamDims() {
        return percentGood4beamDims;
    }

    public void setPercentGood4beamDims(int percentGood4beamDims) {
        this.percentGood4beamDims = percentGood4beamDims;
    }
    public List<Long> getPercentGood4beamSizes() {
        return percentGood4beamSizes;
    }

    public void setPercentGood4beamSizes(List<Long> percentGood4beamSizes) {
        this.percentGood4beamSizes = percentGood4beamSizes;
    }
    public int getBtPingsPerEnsemble() {
        return btPingsPerEnsemble;
    }

    public void setBtPingsPerEnsemble(int btPingsPerEnsemble) {
        this.btPingsPerEnsemble = btPingsPerEnsemble;
    }
    public int getBtDelayBeforeReacquire() {
        return btDelayBeforeReacquire;
    }

    public void setBtDelayBeforeReacquire(int btDelayBeforeReacquire) {
        this.btDelayBeforeReacquire = btDelayBeforeReacquire;
    }
    public int getBtCorrMagnitudeMin() {
        return btCorrMagnitudeMin;
    }

    public void setBtCorrMagnitudeMin(int btCorrMagnitudeMin) {
        this.btCorrMagnitudeMin = btCorrMagnitudeMin;
    }
    public int getBtEvalMagnitudeMin() {
        return btEvalMagnitudeMin;
    }

    public void setBtEvalMagnitudeMin(int btEvalMagnitudeMin) {
        this.btEvalMagnitudeMin = btEvalMagnitudeMin;
    }
    public int getBtPercentGoodMin() {
        return btPercentGoodMin;
    }

    public void setBtPercentGoodMin(int btPercentGoodMin) {
        this.btPercentGoodMin = btPercentGoodMin;
    }
    public int getBtMode() {
        return btMode;
    }

    public void setBtMode(int btMode) {
        this.btMode = btMode;
    }
    public int getBtErrorVelocityMax() {
        return btErrorVelocityMax;
    }

    public void setBtErrorVelocityMax(int btErrorVelocityMax) {
        this.btErrorVelocityMax = btErrorVelocityMax;
    }
    public long getBtBeam1Range() {
        return btBeam1Range;
    }

    public void setBtBeam1Range(long btBeam1Range) {
        this.btBeam1Range = btBeam1Range;
    }
    public long getBtBeam2Range() {
        return btBeam2Range;
    }

    public void setBtBeam2Range(long btBeam2Range) {
        this.btBeam2Range = btBeam2Range;
    }
    public long getBtBeam3Range() {
        return btBeam3Range;
    }

    public void setBtBeam3Range(long btBeam3Range) {
        this.btBeam3Range = btBeam3Range;
    }
    public long getBtBeam4Range() {
        return btBeam4Range;
    }

    public void setBtBeam4Range(long btBeam4Range) {
        this.btBeam4Range = btBeam4Range;
    }
    public int getBtNorthwardVelocity() {
        return btNorthwardVelocity;
    }

    public void setBtNorthwardVelocity(int btNorthwardVelocity) {
        this.btNorthwardVelocity = btNorthwardVelocity;
    }
    public int getBtUpwardVelocity() {
        return btUpwardVelocity;
    }

    public void setBtUpwardVelocity(int btUpwardVelocity) {
        this.btUpwardVelocity = btUpwardVelocity;
    }
    public int getBtErrorVelocity() {
        return btErrorVelocity;
    }

    public void setBtErrorVelocity(int btErrorVelocity) {
        this.btErrorVelocity = btErrorVelocity;
    }
    public int getBtBeam1Correlation() {
        return btBeam1Correlation;
    }

    public void setBtBeam1Correlation(int btBeam1Correlation) {
        this.btBeam1Correlation = btBeam1Correlation;
    }
    public int getBtBeam2Correlation() {
        return btBeam2Correlation;
    }

    public void setBtBeam2Correlation(int btBeam2Correlation) {
        this.btBeam2Correlation = btBeam2Correlation;
    }
    public int getBtBeam4Correlation() {
        return btBeam4Correlation;
    }

    public void setBtBeam4Correlation(int btBeam4Correlation) {
        this.btBeam4Correlation = btBeam4Correlation;
    }
    public int getBtBeam1EvalAmp() {
        return btBeam1EvalAmp;
    }

    public void setBtBeam1EvalAmp(int btBeam1EvalAmp) {
        this.btBeam1EvalAmp = btBeam1EvalAmp;
    }
    public int getBtBeam2EvalAmp() {
        return btBeam2EvalAmp;
    }

    public void setBtBeam2EvalAmp(int btBeam2EvalAmp) {
        this.btBeam2EvalAmp = btBeam2EvalAmp;
    }
    public int getBtBeam3EvalAmp() {
        return btBeam3EvalAmp;
    }

    public void setBtBeam3EvalAmp(int btBeam3EvalAmp) {
        this.btBeam3EvalAmp = btBeam3EvalAmp;
    }
    public int getBtBeam4EvalAmp() {
        return btBeam4EvalAmp;
    }

    public void setBtBeam4EvalAmp(int btBeam4EvalAmp) {
        this.btBeam4EvalAmp = btBeam4EvalAmp;
    }
    public int getBtBeam1PercentGood() {
        return btBeam1PercentGood;
    }

    public void setBtBeam1PercentGood(int btBeam1PercentGood) {
        this.btBeam1PercentGood = btBeam1PercentGood;
    }
    public int getBtBeam2PercentGood() {
        return btBeam2PercentGood;
    }

    public void setBtBeam2PercentGood(int btBeam2PercentGood) {
        this.btBeam2PercentGood = btBeam2PercentGood;
    }
    public int getBtBeam3PercentGood() {
        return btBeam3PercentGood;
    }

    public void setBtBeam3PercentGood(int btBeam3PercentGood) {
        this.btBeam3PercentGood = btBeam3PercentGood;
    }
    public int getBtBeam4PercentGood() {
        return btBeam4PercentGood;
    }

    public void setBtBeam4PercentGood(int btBeam4PercentGood) {
        this.btBeam4PercentGood = btBeam4PercentGood;
    }
    public int getBtRefLayerMin() {
        return btRefLayerMin;
    }

    public void setBtRefLayerMin(int btRefLayerMin) {
        this.btRefLayerMin = btRefLayerMin;
    }
    public int getBtRefLayerNear() {
        return btRefLayerNear;
    }

    public void setBtRefLayerNear(int btRefLayerNear) {
        this.btRefLayerNear = btRefLayerNear;
    }
    public int getBtRefLayerFar() {
        return btRefLayerFar;
    }

    public void setBtRefLayerFar(int btRefLayerFar) {
        this.btRefLayerFar = btRefLayerFar;
    }
    public int getBtEastwardRefLayerVelocity() {
        return btEastwardRefLayerVelocity;
    }

    public void setBtEastwardRefLayerVelocity(int btEastwardRefLayerVelocity) {
        this.btEastwardRefLayerVelocity = btEastwardRefLayerVelocity;
    }
    public int getBtNorthwardRefLayerVelocity() {
        return btNorthwardRefLayerVelocity;
    }

    public void setBtNorthwardRefLayerVelocity(int btNorthwardRefLayerVelocity) {
        this.btNorthwardRefLayerVelocity = btNorthwardRefLayerVelocity;
    }
    public int getBtUpwardRefLayerVelocity() {
        return btUpwardRefLayerVelocity;
    }

    public void setBtUpwardRefLayerVelocity(int btUpwardRefLayerVelocity) {
        this.btUpwardRefLayerVelocity = btUpwardRefLayerVelocity;
    }
    public int getBtErrorRefLayerVelocity() {
        return btErrorRefLayerVelocity;
    }

    public void setBtErrorRefLayerVelocity(int btErrorRefLayerVelocity) {
        this.btErrorRefLayerVelocity = btErrorRefLayerVelocity;
    }
    public int getBtBeam1RefCorrelation() {
        return btBeam1RefCorrelation;
    }

    public void setBtBeam1RefCorrelation(int btBeam1RefCorrelation) {
        this.btBeam1RefCorrelation = btBeam1RefCorrelation;
    }
    public int getBtBeam2RefCorrelation() {
        return btBeam2RefCorrelation;
    }

    public void setBtBeam2RefCorrelation(int btBeam2RefCorrelation) {
        this.btBeam2RefCorrelation = btBeam2RefCorrelation;
    }
    public int getBtBeam3RefCorrelation() {
        return btBeam3RefCorrelation;
    }

    public void setBtBeam3RefCorrelation(int btBeam3RefCorrelation) {
        this.btBeam3RefCorrelation = btBeam3RefCorrelation;
    }
    public int getBtBeam4RefCorrelation() {
        return btBeam4RefCorrelation;
    }

    public void setBtBeam4RefCorrelation(int btBeam4RefCorrelation) {
        this.btBeam4RefCorrelation = btBeam4RefCorrelation;
    }
    public int getBtBeam1RefIntensity() {
        return btBeam1RefIntensity;
    }

    public void setBtBeam1RefIntensity(int btBeam1RefIntensity) {
        this.btBeam1RefIntensity = btBeam1RefIntensity;
    }
    public int getBtBeam2RefIntensity() {
        return btBeam2RefIntensity;
    }

    public void setBtBeam2RefIntensity(int btBeam2RefIntensity) {
        this.btBeam2RefIntensity = btBeam2RefIntensity;
    }
    public int getBtBeam3RefIntensity() {
        return btBeam3RefIntensity;
    }

    public void setBtBeam3RefIntensity(int btBeam3RefIntensity) {
        this.btBeam3RefIntensity = btBeam3RefIntensity;
    }
    public int getBtBeam4RefIntensity() {
        return btBeam4RefIntensity;
    }

    public void setBtBeam4RefIntensity(int btBeam4RefIntensity) {
        this.btBeam4RefIntensity = btBeam4RefIntensity;
    }
    public int getBtBeam1RefPercentGood() {
        return btBeam1RefPercentGood;
    }

    public void setBtBeam1RefPercentGood(int btBeam1RefPercentGood) {
        this.btBeam1RefPercentGood = btBeam1RefPercentGood;
    }
    public int getBtBeam2RefPercentGood() {
        return btBeam2RefPercentGood;
    }

    public void setBtBeam2RefPercentGood(int btBeam2RefPercentGood) {
        this.btBeam2RefPercentGood = btBeam2RefPercentGood;
    }
    public int getBtBeam3RefPercentGood() {
        return btBeam3RefPercentGood;
    }

    public void setBtBeam3RefPercentGood(int btBeam3RefPercentGood) {
        this.btBeam3RefPercentGood = btBeam3RefPercentGood;
    }
    public int getBtBeam4RefPercentGood() {
        return btBeam4RefPercentGood;
    }

    public void setBtBeam4RefPercentGood(int btBeam4RefPercentGood) {
        this.btBeam4RefPercentGood = btBeam4RefPercentGood;
    }
    public int getBtMaxDepth() {
        return btMaxDepth;
    }

    public void setBtMaxDepth(int btMaxDepth) {
        this.btMaxDepth = btMaxDepth;
    }
    public int getBtBeam1RssiAmplitude() {
        return btBeam1RssiAmplitude;
    }

    public void setBtBeam1RssiAmplitude(int btBeam1RssiAmplitude) {
        this.btBeam1RssiAmplitude = btBeam1RssiAmplitude;
    }
    public int getBtBeam2RssiAmplitude() {
        return btBeam2RssiAmplitude;
    }

    public void setBtBeam2RssiAmplitude(int btBeam2RssiAmplitude) {
        this.btBeam2RssiAmplitude = btBeam2RssiAmplitude;
    }
    public int getBtBeam3RssiAmplitude() {
        return btBeam3RssiAmplitude;
    }

    public void setBtBeam3RssiAmplitude(int btBeam3RssiAmplitude) {
        this.btBeam3RssiAmplitude = btBeam3RssiAmplitude;
    }
    public int getBtBeam4RssiAmplitude() {
        return btBeam4RssiAmplitude;
    }

    public void setBtBeam4RssiAmplitude(int btBeam4RssiAmplitude) {
        this.btBeam4RssiAmplitude = btBeam4RssiAmplitude;
    }
    public int getBtGain() {
        return btGain;
    }

    public void setBtGain(int btGain) {
        this.btGain = btGain;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}