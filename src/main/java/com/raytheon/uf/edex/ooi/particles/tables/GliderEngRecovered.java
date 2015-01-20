package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "glider_eng_recovered")
public class GliderEngRecovered extends CassandraParticle {

    @Column(value = "m_present_time")
    private double mPresentTime;

    @Column(value = "m_present_secs_into_mission")
    private float mPresentSecsIntoMission;

    @Column(value = "m_altitude")
    private float mAltitude;

    @Column(value = "m_depth")
    private float mDepth;

    @Column(value = "m_gps_lat")
    private float mGpsLat;

    @Column(value = "m_gps_lon")
    private float mGpsLon;

    @Column(value = "m_lat")
    private float mLat;

    @Column(value = "m_lon")
    private float mLon;

    @Column(value = "c_air_pump")
    private int cAirPump;

    @Column(value = "c_ballast_pumped")
    private float cBallastPumped;

    @Column(value = "c_battpos")
    private float cBattpos;

    @Column(value = "c_battroll")
    private float cBattroll;

    @Column(value = "c_bsipar_on")
    private float cBsiparOn;

    @Column(value = "c_de_oil_vol")
    private float cDeOilVol;

    @Column(value = "c_dvl_on")
    private float cDvlOn;

    @Column(value = "c_flbbcd_on")
    private float cFlbbcdOn;

    @Column(value = "c_heading")
    private float cHeading;

    @Column(value = "c_oxy3835_wphase_on")
    private float cOxy3835WphaseOn;

    @Column(value = "c_pitch")
    private float cPitch;

    @Column(value = "c_profile_on")
    private float cProfileOn;

    @Column(value = "c_wpt_lat")
    private float cWptLat;

    @Column(value = "c_wpt_lon")
    private float cWptLon;

    @Column(value = "m_1meg_persistor")
    private int m1megPersistor;

    @Column(value = "m_aground_water_depth")
    private float mAgroundWaterDepth;

    @Column(value = "m_air_fill")
    private int mAirFill;

    @Column(value = "m_air_pump")
    private int mAirPump;

    @Column(value = "m_altimeter_status")
    private int mAltimeterStatus;

    @Column(value = "m_altimeter_voltage")
    private float mAltimeterVoltage;

    @Column(value = "m_altitude_rate")
    private float mAltitudeRate;

    @Column(value = "m_appear_to_be_at_surface")
    private int mAppearToBeAtSurface;

    @Column(value = "m_argos_is_xmitting")
    private int mArgosIsXmitting;

    @Column(value = "m_argos_on")
    private int mArgosOn;

    @Column(value = "m_argos_sent_data")
    private int mArgosSentData;

    @Column(value = "m_argos_timestamp")
    private double mArgosTimestamp;

    @Column(value = "m_at_risk_depth")
    private float mAtRiskDepth;

    @Column(value = "m_avbot_enable")
    private int mAvbotEnable;

    @Column(value = "m_avbot_power")
    private int mAvbotPower;

    @Column(value = "m_avg_climb_rate")
    private float mAvgClimbRate;

    @Column(value = "m_avg_depth_rate")
    private float mAvgDepthRate;

    @Column(value = "m_avg_dive_rate")
    private float mAvgDiveRate;

    @Column(value = "m_avg_downward_inflection_time")
    private float mAvgDownwardInflectionTime;

    @Column(value = "m_avg_speed")
    private float mAvgSpeed;

    @Column(value = "m_avg_system_clock_lags_gps")
    private float mAvgSystemClockLagsGps;

    @Column(value = "m_avg_upward_inflection_time")
    private float mAvgUpwardInflectionTime;

    @Column(value = "m_avg_yo_time")
    private float mAvgYoTime;

    @Column(value = "m_ballast_pumped")
    private float mBallastPumped;

    @Column(value = "m_ballast_pumped_energy")
    private float mBallastPumpedEnergy;

    @Column(value = "m_ballast_pumped_vel")
    private float mBallastPumpedVel;

    @Column(value = "m_battery")
    private float mBattery;

    @Column(value = "m_battery_inst")
    private float mBatteryInst;

    @Column(value = "m_battpos")
    private float mBattpos;

    @Column(value = "m_battpos_vel")
    private float mBattposVel;

    @Column(value = "m_battroll")
    private float mBattroll;

    @Column(value = "m_battroll_vel")
    private float mBattrollVel;

    @Column(value = "m_bpump_fault_bit")
    private int mBpumpFaultBit;

    @Column(value = "m_certainly_at_surface")
    private int mCertainlyAtSurface;

    @Column(value = "m_chars_tossed_by_abend")
    private float mCharsTossedByAbend;

    @Column(value = "m_chars_tossed_with_cd_off")
    private float mCharsTossedWithCdOff;

    @Column(value = "m_chars_tossed_with_power_off")
    private float mCharsTossedWithPowerOff;

    @Column(value = "m_climb_tot_time")
    private float mClimbTotTime;

    @Column(value = "m_console_cd")
    private int mConsoleCd;

    @Column(value = "m_console_on")
    private int mConsoleOn;

    @Column(value = "m_cop_tickle")
    private int mCopTickle;

    @Column(value = "m_coulomb_amphr")
    private float mCoulombAmphr;

    @Column(value = "m_coulomb_amphr_raw")
    private float mCoulombAmphrRaw;

    @Column(value = "m_coulomb_amphr_total")
    private float mCoulombAmphrTotal;

    @Column(value = "m_coulomb_current")
    private float mCoulombCurrent;

    @Column(value = "m_coulomb_current_raw")
    private float mCoulombCurrentRaw;

    @Column(value = "m_cycle_number")
    private float mCycleNumber;

    @Column(value = "m_depth_rate")
    private float mDepthRate;

    @Column(value = "m_depth_rate_avg_final")
    private float mDepthRateAvgFinal;

    @Column(value = "m_depth_rate_running_avg")
    private float mDepthRateRunningAvg;

    @Column(value = "m_depth_rate_running_avg_n")
    private int mDepthRateRunningAvgN;

    @Column(value = "m_depth_rate_subsampled")
    private float mDepthRateSubsampled;

    @Column(value = "m_depth_rejected")
    private int mDepthRejected;

    @Column(value = "m_depth_state")
    private int mDepthState;

    @Column(value = "m_depth_subsampled")
    private float mDepthSubsampled;

    @Column(value = "m_device_drivers_called_abnormally")
    private float mDeviceDriversCalledAbnormally;

    @Column(value = "m_device_error")
    private float mDeviceError;

    @Column(value = "m_device_oddity")
    private float mDeviceOddity;

    @Column(value = "m_device_warning")
    private float mDeviceWarning;

    @Column(value = "m_de_oil_vol")
    private float mDeOilVol;

    @Column(value = "m_de_oil_vol_pot_voltage")
    private float mDeOilVolPotVoltage;

    @Column(value = "m_de_pump_fault_count")
    private float mDePumpFaultCount;

    @Column(value = "m_digifin_cmd_done")
    private float mDigifinCmdDone;

    @Column(value = "m_digifin_cmd_error")
    private float mDigifinCmdError;

    @Column(value = "m_digifin_leakdetect_reading")
    private float mDigifinLeakdetectReading;

    @Column(value = "m_digifin_motorstep_counter")
    private float mDigifinMotorstepCounter;

    @Column(value = "m_digifin_resp_data")
    private float mDigifinRespData;

    @Column(value = "m_digifin_status")
    private float mDigifinStatus;

    @Column(value = "m_disk_free")
    private float mDiskFree;

    @Column(value = "m_disk_usage")
    private float mDiskUsage;

    @Column(value = "m_dist_to_wpt")
    private float mDistToWpt;

    @Column(value = "m_dive_depth")
    private float mDiveDepth;

    @Column(value = "m_dive_tot_time")
    private float mDiveTotTime;

    @Column(value = "m_dr_fix_time")
    private float mDrFixTime;

    @Column(value = "m_dr_postfix_time")
    private float mDrPostfixTime;

    @Column(value = "m_dr_surf_x_lmc")
    private float mDrSurfXLmc;

    @Column(value = "m_dr_surf_y_lmc")
    private float mDrSurfYLmc;

    @Column(value = "m_dr_time")
    private float mDrTime;

    @Column(value = "m_dr_x_actual_err")
    private float mDrXActualErr;

    @Column(value = "m_dr_x_ini_err")
    private float mDrXIniErr;

    @Column(value = "m_dr_x_postfix_drift")
    private float mDrXPostfixDrift;

    @Column(value = "m_dr_x_ta_postfix_drift")
    private float mDrXTaPostfixDrift;

    @Column(value = "m_dr_y_actual_err")
    private float mDrYActualErr;

    @Column(value = "m_dr_y_ini_err")
    private float mDrYIniErr;

    @Column(value = "m_dr_y_postfix_drift")
    private float mDrYPostfixDrift;

    @Column(value = "m_dr_y_ta_postfix_drift")
    private float mDrYTaPostfixDrift;

    @Column(value = "m_est_time_to_surface")
    private float mEstTimeToSurface;

    @Column(value = "m_fin")
    private float mFin;

    @Column(value = "m_final_water_vx")
    private float mFinalWaterVx;

    @Column(value = "m_final_water_vy")
    private float mFinalWaterVy;

    @Column(value = "m_fin_vel")
    private float mFinVel;

    @Column(value = "m_fluid_pumped")
    private float mFluidPumped;

    @Column(value = "m_fluid_pumped_aft_hall_voltage")
    private float mFluidPumpedAftHallVoltage;

    @Column(value = "m_fluid_pumped_fwd_hall_voltage")
    private float mFluidPumpedFwdHallVoltage;

    @Column(value = "m_fluid_pumped_vel")
    private float mFluidPumpedVel;

    @Column(value = "m_free_heap")
    private float mFreeHeap;

    @Column(value = "m_gps_dist_from_dr")
    private float mGpsDistFromDr;

    @Column(value = "m_gps_fix_x_lmc")
    private float mGpsFixXLmc;

    @Column(value = "m_gps_fix_y_lmc")
    private float mGpsFixYLmc;

    @Column(value = "m_gps_full_status")
    private int mGpsFullStatus;

    @Column(value = "m_gps_heading")
    private float mGpsHeading;

    @Column(value = "m_gps_ignored_lat")
    private double mGpsIgnoredLat;

    @Column(value = "m_gps_ignored_lon")
    private double mGpsIgnoredLon;

    @Column(value = "m_gps_invalid_lat")
    private double mGpsInvalidLat;

    @Column(value = "m_gps_invalid_lon")
    private double mGpsInvalidLon;

    @Column(value = "m_gps_mag_var")
    private float mGpsMagVar;

    @Column(value = "m_gps_num_satellites")
    private float mGpsNumSatellites;

    @Column(value = "m_gps_on")
    private int mGpsOn;

    @Column(value = "m_gps_postfix_x_lmc")
    private float mGpsPostfixXLmc;

    @Column(value = "m_gps_postfix_y_lmc")
    private float mGpsPostfixYLmc;

    @Column(value = "m_gps_speed")
    private float mGpsSpeed;

    @Column(value = "m_gps_status")
    private int mGpsStatus;

    @Column(value = "m_gps_toofar_lat")
    private double mGpsToofarLat;

    @Column(value = "m_gps_toofar_lon")
    private double mGpsToofarLon;

    @Column(value = "m_gps_uncertainty")
    private float mGpsUncertainty;

    @Column(value = "m_gps_utc_day")
    private int mGpsUtcDay;

    @Column(value = "m_gps_utc_hour")
    private int mGpsUtcHour;

    @Column(value = "m_gps_utc_minute")
    private int mGpsUtcMinute;

    @Column(value = "m_gps_utc_month")
    private int mGpsUtcMonth;

    @Column(value = "m_gps_utc_second")
    private float mGpsUtcSecond;

    @Column(value = "m_gps_utc_year")
    private int mGpsUtcYear;

    @Column(value = "m_gps_x_lmc")
    private float mGpsXLmc;

    @Column(value = "m_gps_y_lmc")
    private float mGpsYLmc;

    @Column(value = "m_hdg_derror")
    private float mHdgDerror;

    @Column(value = "m_hdg_error")
    private float mHdgError;

    @Column(value = "m_hdg_ierror")
    private float mHdgIerror;

    @Column(value = "m_hdg_rate")
    private float mHdgRate;

    @Column(value = "m_heading")
    private float mHeading;

    @Column(value = "m_initial_water_vx")
    private float mInitialWaterVx;

    @Column(value = "m_initial_water_vy")
    private float mInitialWaterVy;

    @Column(value = "m_iridium_attempt_num")
    private float mIridiumAttemptNum;

    @Column(value = "m_iridium_call_num")
    private float mIridiumCallNum;

    @Column(value = "m_iridium_connected")
    private int mIridiumConnected;

    @Column(value = "m_iridium_console_on")
    private int mIridiumConsoleOn;

    @Column(value = "m_iridium_dialed_num")
    private float mIridiumDialedNum;

    @Column(value = "m_iridium_on")
    private int mIridiumOn;

    @Column(value = "m_iridium_redials")
    private float mIridiumRedials;

    @Column(value = "m_iridium_signal_strength")
    private float mIridiumSignalStrength;

    @Column(value = "m_iridium_status")
    private int mIridiumStatus;

    @Column(value = "m_iridium_waiting_redial_delay")
    private int mIridiumWaitingRedialDelay;

    @Column(value = "m_iridium_waiting_registration")
    private int mIridiumWaitingRegistration;

    @Column(value = "m_is_ballast_pump_moving")
    private int mIsBallastPumpMoving;

    @Column(value = "m_is_battpos_moving")
    private int mIsBattposMoving;

    @Column(value = "m_is_battroll_moving")
    private int mIsBattrollMoving;

    @Column(value = "m_is_de_pump_moving")
    private int mIsDePumpMoving;

    @Column(value = "m_is_fin_moving")
    private int mIsFinMoving;

    @Column(value = "m_is_fpitch_pump_moving")
    private int mIsFpitchPumpMoving;

    @Column(value = "m_is_speed_estimated")
    private int mIsSpeedEstimated;

    @Column(value = "m_is_thermal_valve_moving")
    private int mIsThermalValveMoving;

    @Column(value = "m_last_yo_time")
    private float mLastYoTime;

    @Column(value = "m_leak")
    private int mLeak;

    @Column(value = "m_leakdetect_voltage")
    private float mLeakdetectVoltage;

    @Column(value = "m_leakdetect_voltage_forward")
    private float mLeakdetectVoltageForward;

    @Column(value = "m_leak_forward")
    private int mLeakForward;

    @Column(value = "m_lithium_battery_relative_charge")
    private float mLithiumBatteryRelativeCharge;

    @Column(value = "m_lithium_battery_status")
    private float mLithiumBatteryStatus;

    @Column(value = "m_lithium_battery_time_to_charge")
    private float mLithiumBatteryTimeToCharge;

    @Column(value = "m_lithium_battery_time_to_discharge")
    private float mLithiumBatteryTimeToDischarge;

    @Column(value = "m_min_free_heap")
    private float mMinFreeHeap;

    @Column(value = "m_min_spare_heap")
    private float mMinSpareHeap;

    @Column(value = "m_mission_avg_speed_climbing")
    private float mMissionAvgSpeedClimbing;

    @Column(value = "m_mission_avg_speed_diving")
    private float mMissionAvgSpeedDiving;

    @Column(value = "m_mission_start_time")
    private double mMissionStartTime;

    @Column(value = "m_num_half_yos_in_segment")
    private float mNumHalfYosInSegment;

    @Column(value = "m_pitch")
    private float mPitch;

    @Column(value = "m_pitch_energy")
    private float mPitchEnergy;

    @Column(value = "m_pitch_error")
    private float mPitchError;

    @Column(value = "m_pressure")
    private float mPressure;

    @Column(value = "m_pressure_raw_voltage_sample0")
    private float mPressureRawVoltageSample0;

    @Column(value = "m_pressure_raw_voltage_sample19")
    private float mPressureRawVoltageSample19;

    @Column(value = "m_pressure_voltage")
    private float mPressureVoltage;

    @Column(value = "m_raw_altitude")
    private float mRawAltitude;

    @Column(value = "m_raw_altitude_rejected")
    private int mRawAltitudeRejected;

    @Column(value = "m_roll")
    private float mRoll;

    @Column(value = "m_science_clothesline_lag")
    private float mScienceClotheslineLag;

    @Column(value = "m_science_on")
    private int mScienceOn;

    @Column(value = "m_science_ready_for_consci")
    private int mScienceReadyForConsci;

    @Column(value = "m_science_sent_some_data")
    private float mScienceSentSomeData;

    @Column(value = "m_science_sync_time")
    private double mScienceSyncTime;

    @Column(value = "m_science_unreadiness_for_consci")
    private int mScienceUnreadinessForConsci;

    @Column(value = "m_spare_heap")
    private float mSpareHeap;

    @Column(value = "m_speed")
    private float mSpeed;

    @Column(value = "m_stable_comms")
    private int mStableComms;

    @Column(value = "m_strobe_ctrl")
    private int mStrobeCtrl;

    @Column(value = "m_surface_est_cmd")
    private float mSurfaceEstCmd;

    @Column(value = "m_surface_est_ctd")
    private float mSurfaceEstCtd;

    @Column(value = "m_surface_est_fw")
    private float mSurfaceEstFw;

    @Column(value = "m_surface_est_gps")
    private float mSurfaceEstGps;

    @Column(value = "m_surface_est_irid")
    private float mSurfaceEstIrid;

    @Column(value = "m_surface_est_total")
    private float mSurfaceEstTotal;

    @Column(value = "m_system_clock_lags_gps")
    private float mSystemClockLagsGps;

    @Column(value = "m_tcm3_is_calibrated")
    private int mTcm3IsCalibrated;

    @Column(value = "m_tcm3_magbearth")
    private float mTcm3Magbearth;

    @Column(value = "m_tcm3_poll_time")
    private float mTcm3PollTime;

    @Column(value = "m_tcm3_recv_start_time")
    private float mTcm3RecvStartTime;

    @Column(value = "m_tcm3_recv_stop_time")
    private float mTcm3RecvStopTime;

    @Column(value = "m_tcm3_stddeverr")
    private float mTcm3Stddeverr;

    @Column(value = "m_tcm3_xcoverage")
    private float mTcm3Xcoverage;

    @Column(value = "m_tcm3_ycoverage")
    private float mTcm3Ycoverage;

    @Column(value = "m_tcm3_zcoverage")
    private float mTcm3Zcoverage;

    @Column(value = "m_thermal_acc_pres")
    private float mThermalAccPres;

    @Column(value = "m_thermal_acc_pres_voltage")
    private float mThermalAccPresVoltage;

    @Column(value = "m_thermal_acc_vol")
    private float mThermalAccVol;

    @Column(value = "m_thermal_enuf_acc_vol")
    private int mThermalEnufAccVol;

    @Column(value = "m_thermal_pump")
    private int mThermalPump;

    @Column(value = "m_thermal_updown")
    private int mThermalUpdown;

    @Column(value = "m_thermal_valve")
    private int mThermalValve;

    @Column(value = "m_time_til_wpt")
    private float mTimeTilWpt;

    @Column(value = "m_tot_ballast_pumped_energy")
    private float mTotBallastPumpedEnergy;

    @Column(value = "m_tot_horz_dist")
    private float mTotHorzDist;

    @Column(value = "m_tot_num_inflections")
    private float mTotNumInflections;

    @Column(value = "m_tot_on_time")
    private float mTotOnTime;

    @Column(value = "m_vacuum")
    private float mVacuum;

    @Column(value = "m_vehicle_temp")
    private float mVehicleTemp;

    @Column(value = "m_veh_overheat")
    private int mVehOverheat;

    @Column(value = "m_veh_temp")
    private float mVehTemp;

    @Column(value = "m_vmg_to_wpt")
    private float mVmgToWpt;

    @Column(value = "m_vx_lmc")
    private float mVxLmc;

    @Column(value = "m_vy_lmc")
    private float mVyLmc;

    @Column(value = "m_water_cond")
    private float mWaterCond;

    @Column(value = "m_water_delta_vx")
    private float mWaterDeltaVx;

    @Column(value = "m_water_delta_vy")
    private float mWaterDeltaVy;

    @Column(value = "m_water_depth")
    private float mWaterDepth;

    @Column(value = "m_water_pressure")
    private float mWaterPressure;

    @Column(value = "m_water_temp")
    private float mWaterTemp;

    @Column(value = "m_water_vx")
    private float mWaterVx;

    @Column(value = "m_water_vy")
    private float mWaterVy;

    @Column(value = "m_why_started")
    private int mWhyStarted;

    @Column(value = "m_x_lmc")
    private float mXLmc;

    @Column(value = "m_y_lmc")
    private float mYLmc;

    @Column(value = "x_last_wpt_lat")
    private float xLastWptLat;

    @Column(value = "x_last_wpt_lon")
    private float xLastWptLon;

    @Column(value = "x_system_clock_adjusted")
    private float xSystemClockAdjusted;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMPresentTime((double) particle.get("m_present_time"));
        setMPresentSecsIntoMission((float) particle.get("m_present_secs_into_mission"));
        setMAltitude((float) particle.get("m_altitude"));
        setMDepth((float) particle.get("m_depth"));
        setMGpsLat((float) particle.get("m_gps_lat"));
        setMGpsLon((float) particle.get("m_gps_lon"));
        setMLat((float) particle.get("m_lat"));
        setMLon((float) particle.get("m_lon"));
        setCAirPump((int) particle.get("c_air_pump"));
        setCBallastPumped((float) particle.get("c_ballast_pumped"));
        setCBattpos((float) particle.get("c_battpos"));
        setCBattroll((float) particle.get("c_battroll"));
        setCBsiparOn((float) particle.get("c_bsipar_on"));
        setCDeOilVol((float) particle.get("c_de_oil_vol"));
        setCDvlOn((float) particle.get("c_dvl_on"));
        setCFlbbcdOn((float) particle.get("c_flbbcd_on"));
        setCHeading((float) particle.get("c_heading"));
        setCOxy3835WphaseOn((float) particle.get("c_oxy3835_wphase_on"));
        setCPitch((float) particle.get("c_pitch"));
        setCProfileOn((float) particle.get("c_profile_on"));
        setCWptLat((float) particle.get("c_wpt_lat"));
        setCWptLon((float) particle.get("c_wpt_lon"));
        setM1megPersistor((int) particle.get("m_1meg_persistor"));
        setMAgroundWaterDepth((float) particle.get("m_aground_water_depth"));
        setMAirFill((int) particle.get("m_air_fill"));
        setMAirPump((int) particle.get("m_air_pump"));
        setMAltimeterStatus((int) particle.get("m_altimeter_status"));
        setMAltimeterVoltage((float) particle.get("m_altimeter_voltage"));
        setMAltitudeRate((float) particle.get("m_altitude_rate"));
        setMAppearToBeAtSurface((int) particle.get("m_appear_to_be_at_surface"));
        setMArgosIsXmitting((int) particle.get("m_argos_is_xmitting"));
        setMArgosOn((int) particle.get("m_argos_on"));
        setMArgosSentData((int) particle.get("m_argos_sent_data"));
        setMArgosTimestamp((double) particle.get("m_argos_timestamp"));
        setMAtRiskDepth((float) particle.get("m_at_risk_depth"));
        setMAvbotEnable((int) particle.get("m_avbot_enable"));
        setMAvbotPower((int) particle.get("m_avbot_power"));
        setMAvgClimbRate((float) particle.get("m_avg_climb_rate"));
        setMAvgDepthRate((float) particle.get("m_avg_depth_rate"));
        setMAvgDiveRate((float) particle.get("m_avg_dive_rate"));
        setMAvgDownwardInflectionTime((float) particle.get("m_avg_downward_inflection_time"));
        setMAvgSpeed((float) particle.get("m_avg_speed"));
        setMAvgSystemClockLagsGps((float) particle.get("m_avg_system_clock_lags_gps"));
        setMAvgUpwardInflectionTime((float) particle.get("m_avg_upward_inflection_time"));
        setMAvgYoTime((float) particle.get("m_avg_yo_time"));
        setMBallastPumped((float) particle.get("m_ballast_pumped"));
        setMBallastPumpedEnergy((float) particle.get("m_ballast_pumped_energy"));
        setMBallastPumpedVel((float) particle.get("m_ballast_pumped_vel"));
        setMBattery((float) particle.get("m_battery"));
        setMBatteryInst((float) particle.get("m_battery_inst"));
        setMBattpos((float) particle.get("m_battpos"));
        setMBattposVel((float) particle.get("m_battpos_vel"));
        setMBattroll((float) particle.get("m_battroll"));
        setMBattrollVel((float) particle.get("m_battroll_vel"));
        setMBpumpFaultBit((int) particle.get("m_bpump_fault_bit"));
        setMCertainlyAtSurface((int) particle.get("m_certainly_at_surface"));
        setMCharsTossedByAbend((float) particle.get("m_chars_tossed_by_abend"));
        setMCharsTossedWithCdOff((float) particle.get("m_chars_tossed_with_cd_off"));
        setMCharsTossedWithPowerOff((float) particle.get("m_chars_tossed_with_power_off"));
        setMClimbTotTime((float) particle.get("m_climb_tot_time"));
        setMConsoleCd((int) particle.get("m_console_cd"));
        setMConsoleOn((int) particle.get("m_console_on"));
        setMCopTickle((int) particle.get("m_cop_tickle"));
        setMCoulombAmphr((float) particle.get("m_coulomb_amphr"));
        setMCoulombAmphrRaw((float) particle.get("m_coulomb_amphr_raw"));
        setMCoulombAmphrTotal((float) particle.get("m_coulomb_amphr_total"));
        setMCoulombCurrent((float) particle.get("m_coulomb_current"));
        setMCoulombCurrentRaw((float) particle.get("m_coulomb_current_raw"));
        setMCycleNumber((float) particle.get("m_cycle_number"));
        setMDepthRate((float) particle.get("m_depth_rate"));
        setMDepthRateAvgFinal((float) particle.get("m_depth_rate_avg_final"));
        setMDepthRateRunningAvg((float) particle.get("m_depth_rate_running_avg"));
        setMDepthRateRunningAvgN((int) particle.get("m_depth_rate_running_avg_n"));
        setMDepthRateSubsampled((float) particle.get("m_depth_rate_subsampled"));
        setMDepthRejected((int) particle.get("m_depth_rejected"));
        setMDepthState((int) particle.get("m_depth_state"));
        setMDepthSubsampled((float) particle.get("m_depth_subsampled"));
        setMDeviceDriversCalledAbnormally((float) particle.get("m_device_drivers_called_abnormally"));
        setMDeviceError((float) particle.get("m_device_error"));
        setMDeviceOddity((float) particle.get("m_device_oddity"));
        setMDeviceWarning((float) particle.get("m_device_warning"));
        setMDeOilVol((float) particle.get("m_de_oil_vol"));
        setMDeOilVolPotVoltage((float) particle.get("m_de_oil_vol_pot_voltage"));
        setMDePumpFaultCount((float) particle.get("m_de_pump_fault_count"));
        setMDigifinCmdDone((float) particle.get("m_digifin_cmd_done"));
        setMDigifinCmdError((float) particle.get("m_digifin_cmd_error"));
        setMDigifinLeakdetectReading((float) particle.get("m_digifin_leakdetect_reading"));
        setMDigifinMotorstepCounter((float) particle.get("m_digifin_motorstep_counter"));
        setMDigifinRespData((float) particle.get("m_digifin_resp_data"));
        setMDigifinStatus((float) particle.get("m_digifin_status"));
        setMDiskFree((float) particle.get("m_disk_free"));
        setMDiskUsage((float) particle.get("m_disk_usage"));
        setMDistToWpt((float) particle.get("m_dist_to_wpt"));
        setMDiveDepth((float) particle.get("m_dive_depth"));
        setMDiveTotTime((float) particle.get("m_dive_tot_time"));
        setMDrFixTime((float) particle.get("m_dr_fix_time"));
        setMDrPostfixTime((float) particle.get("m_dr_postfix_time"));
        setMDrSurfXLmc((float) particle.get("m_dr_surf_x_lmc"));
        setMDrSurfYLmc((float) particle.get("m_dr_surf_y_lmc"));
        setMDrTime((float) particle.get("m_dr_time"));
        setMDrXActualErr((float) particle.get("m_dr_x_actual_err"));
        setMDrXIniErr((float) particle.get("m_dr_x_ini_err"));
        setMDrXPostfixDrift((float) particle.get("m_dr_x_postfix_drift"));
        setMDrXTaPostfixDrift((float) particle.get("m_dr_x_ta_postfix_drift"));
        setMDrYActualErr((float) particle.get("m_dr_y_actual_err"));
        setMDrYIniErr((float) particle.get("m_dr_y_ini_err"));
        setMDrYPostfixDrift((float) particle.get("m_dr_y_postfix_drift"));
        setMDrYTaPostfixDrift((float) particle.get("m_dr_y_ta_postfix_drift"));
        setMEstTimeToSurface((float) particle.get("m_est_time_to_surface"));
        setMFin((float) particle.get("m_fin"));
        setMFinalWaterVx((float) particle.get("m_final_water_vx"));
        setMFinalWaterVy((float) particle.get("m_final_water_vy"));
        setMFinVel((float) particle.get("m_fin_vel"));
        setMFluidPumped((float) particle.get("m_fluid_pumped"));
        setMFluidPumpedAftHallVoltage((float) particle.get("m_fluid_pumped_aft_hall_voltage"));
        setMFluidPumpedFwdHallVoltage((float) particle.get("m_fluid_pumped_fwd_hall_voltage"));
        setMFluidPumpedVel((float) particle.get("m_fluid_pumped_vel"));
        setMFreeHeap((float) particle.get("m_free_heap"));
        setMGpsDistFromDr((float) particle.get("m_gps_dist_from_dr"));
        setMGpsFixXLmc((float) particle.get("m_gps_fix_x_lmc"));
        setMGpsFixYLmc((float) particle.get("m_gps_fix_y_lmc"));
        setMGpsFullStatus((int) particle.get("m_gps_full_status"));
        setMGpsHeading((float) particle.get("m_gps_heading"));
        setMGpsIgnoredLat((double) particle.get("m_gps_ignored_lat"));
        setMGpsIgnoredLon((double) particle.get("m_gps_ignored_lon"));
        setMGpsInvalidLat((double) particle.get("m_gps_invalid_lat"));
        setMGpsInvalidLon((double) particle.get("m_gps_invalid_lon"));
        setMGpsMagVar((float) particle.get("m_gps_mag_var"));
        setMGpsNumSatellites((float) particle.get("m_gps_num_satellites"));
        setMGpsOn((int) particle.get("m_gps_on"));
        setMGpsPostfixXLmc((float) particle.get("m_gps_postfix_x_lmc"));
        setMGpsPostfixYLmc((float) particle.get("m_gps_postfix_y_lmc"));
        setMGpsSpeed((float) particle.get("m_gps_speed"));
        setMGpsStatus((int) particle.get("m_gps_status"));
        setMGpsToofarLat((double) particle.get("m_gps_toofar_lat"));
        setMGpsToofarLon((double) particle.get("m_gps_toofar_lon"));
        setMGpsUncertainty((float) particle.get("m_gps_uncertainty"));
        setMGpsUtcDay((int) particle.get("m_gps_utc_day"));
        setMGpsUtcHour((int) particle.get("m_gps_utc_hour"));
        setMGpsUtcMinute((int) particle.get("m_gps_utc_minute"));
        setMGpsUtcMonth((int) particle.get("m_gps_utc_month"));
        setMGpsUtcSecond((float) particle.get("m_gps_utc_second"));
        setMGpsUtcYear((int) particle.get("m_gps_utc_year"));
        setMGpsXLmc((float) particle.get("m_gps_x_lmc"));
        setMGpsYLmc((float) particle.get("m_gps_y_lmc"));
        setMHdgDerror((float) particle.get("m_hdg_derror"));
        setMHdgError((float) particle.get("m_hdg_error"));
        setMHdgIerror((float) particle.get("m_hdg_ierror"));
        setMHdgRate((float) particle.get("m_hdg_rate"));
        setMHeading((float) particle.get("m_heading"));
        setMInitialWaterVx((float) particle.get("m_initial_water_vx"));
        setMInitialWaterVy((float) particle.get("m_initial_water_vy"));
        setMIridiumAttemptNum((float) particle.get("m_iridium_attempt_num"));
        setMIridiumCallNum((float) particle.get("m_iridium_call_num"));
        setMIridiumConnected((int) particle.get("m_iridium_connected"));
        setMIridiumConsoleOn((int) particle.get("m_iridium_console_on"));
        setMIridiumDialedNum((float) particle.get("m_iridium_dialed_num"));
        setMIridiumOn((int) particle.get("m_iridium_on"));
        setMIridiumRedials((float) particle.get("m_iridium_redials"));
        setMIridiumSignalStrength((float) particle.get("m_iridium_signal_strength"));
        setMIridiumStatus((int) particle.get("m_iridium_status"));
        setMIridiumWaitingRedialDelay((int) particle.get("m_iridium_waiting_redial_delay"));
        setMIridiumWaitingRegistration((int) particle.get("m_iridium_waiting_registration"));
        setMIsBallastPumpMoving((int) particle.get("m_is_ballast_pump_moving"));
        setMIsBattposMoving((int) particle.get("m_is_battpos_moving"));
        setMIsBattrollMoving((int) particle.get("m_is_battroll_moving"));
        setMIsDePumpMoving((int) particle.get("m_is_de_pump_moving"));
        setMIsFinMoving((int) particle.get("m_is_fin_moving"));
        setMIsFpitchPumpMoving((int) particle.get("m_is_fpitch_pump_moving"));
        setMIsSpeedEstimated((int) particle.get("m_is_speed_estimated"));
        setMIsThermalValveMoving((int) particle.get("m_is_thermal_valve_moving"));
        setMLastYoTime((float) particle.get("m_last_yo_time"));
        setMLeak((int) particle.get("m_leak"));
        setMLeakdetectVoltage((float) particle.get("m_leakdetect_voltage"));
        setMLeakdetectVoltageForward((float) particle.get("m_leakdetect_voltage_forward"));
        setMLeakForward((int) particle.get("m_leak_forward"));
        setMLithiumBatteryRelativeCharge((float) particle.get("m_lithium_battery_relative_charge"));
        setMLithiumBatteryStatus((float) particle.get("m_lithium_battery_status"));
        setMLithiumBatteryTimeToCharge((float) particle.get("m_lithium_battery_time_to_charge"));
        setMLithiumBatteryTimeToDischarge((float) particle.get("m_lithium_battery_time_to_discharge"));
        setMMinFreeHeap((float) particle.get("m_min_free_heap"));
        setMMinSpareHeap((float) particle.get("m_min_spare_heap"));
        setMMissionAvgSpeedClimbing((float) particle.get("m_mission_avg_speed_climbing"));
        setMMissionAvgSpeedDiving((float) particle.get("m_mission_avg_speed_diving"));
        setMMissionStartTime((double) particle.get("m_mission_start_time"));
        setMNumHalfYosInSegment((float) particle.get("m_num_half_yos_in_segment"));
        setMPitch((float) particle.get("m_pitch"));
        setMPitchEnergy((float) particle.get("m_pitch_energy"));
        setMPitchError((float) particle.get("m_pitch_error"));
        setMPressure((float) particle.get("m_pressure"));
        setMPressureRawVoltageSample0((float) particle.get("m_pressure_raw_voltage_sample0"));
        setMPressureRawVoltageSample19((float) particle.get("m_pressure_raw_voltage_sample19"));
        setMPressureVoltage((float) particle.get("m_pressure_voltage"));
        setMRawAltitude((float) particle.get("m_raw_altitude"));
        setMRawAltitudeRejected((int) particle.get("m_raw_altitude_rejected"));
        setMRoll((float) particle.get("m_roll"));
        setMScienceClotheslineLag((float) particle.get("m_science_clothesline_lag"));
        setMScienceOn((int) particle.get("m_science_on"));
        setMScienceReadyForConsci((int) particle.get("m_science_ready_for_consci"));
        setMScienceSentSomeData((float) particle.get("m_science_sent_some_data"));
        setMScienceSyncTime((double) particle.get("m_science_sync_time"));
        setMScienceUnreadinessForConsci((int) particle.get("m_science_unreadiness_for_consci"));
        setMSpareHeap((float) particle.get("m_spare_heap"));
        setMSpeed((float) particle.get("m_speed"));
        setMStableComms((int) particle.get("m_stable_comms"));
        setMStrobeCtrl((int) particle.get("m_strobe_ctrl"));
        setMSurfaceEstCmd((float) particle.get("m_surface_est_cmd"));
        setMSurfaceEstCtd((float) particle.get("m_surface_est_ctd"));
        setMSurfaceEstFw((float) particle.get("m_surface_est_fw"));
        setMSurfaceEstGps((float) particle.get("m_surface_est_gps"));
        setMSurfaceEstIrid((float) particle.get("m_surface_est_irid"));
        setMSurfaceEstTotal((float) particle.get("m_surface_est_total"));
        setMSystemClockLagsGps((float) particle.get("m_system_clock_lags_gps"));
        setMTcm3IsCalibrated((int) particle.get("m_tcm3_is_calibrated"));
        setMTcm3Magbearth((float) particle.get("m_tcm3_magbearth"));
        setMTcm3PollTime((float) particle.get("m_tcm3_poll_time"));
        setMTcm3RecvStartTime((float) particle.get("m_tcm3_recv_start_time"));
        setMTcm3RecvStopTime((float) particle.get("m_tcm3_recv_stop_time"));
        setMTcm3Stddeverr((float) particle.get("m_tcm3_stddeverr"));
        setMTcm3Xcoverage((float) particle.get("m_tcm3_xcoverage"));
        setMTcm3Ycoverage((float) particle.get("m_tcm3_ycoverage"));
        setMTcm3Zcoverage((float) particle.get("m_tcm3_zcoverage"));
        setMThermalAccPres((float) particle.get("m_thermal_acc_pres"));
        setMThermalAccPresVoltage((float) particle.get("m_thermal_acc_pres_voltage"));
        setMThermalAccVol((float) particle.get("m_thermal_acc_vol"));
        setMThermalEnufAccVol((int) particle.get("m_thermal_enuf_acc_vol"));
        setMThermalPump((int) particle.get("m_thermal_pump"));
        setMThermalUpdown((int) particle.get("m_thermal_updown"));
        setMThermalValve((int) particle.get("m_thermal_valve"));
        setMTimeTilWpt((float) particle.get("m_time_til_wpt"));
        setMTotBallastPumpedEnergy((float) particle.get("m_tot_ballast_pumped_energy"));
        setMTotHorzDist((float) particle.get("m_tot_horz_dist"));
        setMTotNumInflections((float) particle.get("m_tot_num_inflections"));
        setMTotOnTime((float) particle.get("m_tot_on_time"));
        setMVacuum((float) particle.get("m_vacuum"));
        setMVehicleTemp((float) particle.get("m_vehicle_temp"));
        setMVehOverheat((int) particle.get("m_veh_overheat"));
        setMVehTemp((float) particle.get("m_veh_temp"));
        setMVmgToWpt((float) particle.get("m_vmg_to_wpt"));
        setMVxLmc((float) particle.get("m_vx_lmc"));
        setMVyLmc((float) particle.get("m_vy_lmc"));
        setMWaterCond((float) particle.get("m_water_cond"));
        setMWaterDeltaVx((float) particle.get("m_water_delta_vx"));
        setMWaterDeltaVy((float) particle.get("m_water_delta_vy"));
        setMWaterDepth((float) particle.get("m_water_depth"));
        setMWaterPressure((float) particle.get("m_water_pressure"));
        setMWaterTemp((float) particle.get("m_water_temp"));
        setMWaterVx((float) particle.get("m_water_vx"));
        setMWaterVy((float) particle.get("m_water_vy"));
        setMWhyStarted((int) particle.get("m_why_started"));
        setMXLmc((float) particle.get("m_x_lmc"));
        setMYLmc((float) particle.get("m_y_lmc"));
        setXLastWptLat((float) particle.get("x_last_wpt_lat"));
        setXLastWptLon((float) particle.get("x_last_wpt_lon"));
        setXSystemClockAdjusted((float) particle.get("x_system_clock_adjusted"));
    }

    public double getMPresentTime() {
        return mPresentTime;
    }

    public void setMPresentTime(double mPresentTime) {
        this.mPresentTime = mPresentTime;
    }
    public float getMPresentSecsIntoMission() {
        return mPresentSecsIntoMission;
    }

    public void setMPresentSecsIntoMission(float mPresentSecsIntoMission) {
        this.mPresentSecsIntoMission = mPresentSecsIntoMission;
    }
    public float getMAltitude() {
        return mAltitude;
    }

    public void setMAltitude(float mAltitude) {
        this.mAltitude = mAltitude;
    }
    public float getMDepth() {
        return mDepth;
    }

    public void setMDepth(float mDepth) {
        this.mDepth = mDepth;
    }
    public float getMGpsLat() {
        return mGpsLat;
    }

    public void setMGpsLat(float mGpsLat) {
        this.mGpsLat = mGpsLat;
    }
    public float getMGpsLon() {
        return mGpsLon;
    }

    public void setMGpsLon(float mGpsLon) {
        this.mGpsLon = mGpsLon;
    }
    public float getMLat() {
        return mLat;
    }

    public void setMLat(float mLat) {
        this.mLat = mLat;
    }
    public float getMLon() {
        return mLon;
    }

    public void setMLon(float mLon) {
        this.mLon = mLon;
    }
    public int getCAirPump() {
        return cAirPump;
    }

    public void setCAirPump(int cAirPump) {
        this.cAirPump = cAirPump;
    }
    public float getCBallastPumped() {
        return cBallastPumped;
    }

    public void setCBallastPumped(float cBallastPumped) {
        this.cBallastPumped = cBallastPumped;
    }
    public float getCBattpos() {
        return cBattpos;
    }

    public void setCBattpos(float cBattpos) {
        this.cBattpos = cBattpos;
    }
    public float getCBattroll() {
        return cBattroll;
    }

    public void setCBattroll(float cBattroll) {
        this.cBattroll = cBattroll;
    }
    public float getCBsiparOn() {
        return cBsiparOn;
    }

    public void setCBsiparOn(float cBsiparOn) {
        this.cBsiparOn = cBsiparOn;
    }
    public float getCDeOilVol() {
        return cDeOilVol;
    }

    public void setCDeOilVol(float cDeOilVol) {
        this.cDeOilVol = cDeOilVol;
    }
    public float getCDvlOn() {
        return cDvlOn;
    }

    public void setCDvlOn(float cDvlOn) {
        this.cDvlOn = cDvlOn;
    }
    public float getCFlbbcdOn() {
        return cFlbbcdOn;
    }

    public void setCFlbbcdOn(float cFlbbcdOn) {
        this.cFlbbcdOn = cFlbbcdOn;
    }
    public float getCHeading() {
        return cHeading;
    }

    public void setCHeading(float cHeading) {
        this.cHeading = cHeading;
    }
    public float getCOxy3835WphaseOn() {
        return cOxy3835WphaseOn;
    }

    public void setCOxy3835WphaseOn(float cOxy3835WphaseOn) {
        this.cOxy3835WphaseOn = cOxy3835WphaseOn;
    }
    public float getCPitch() {
        return cPitch;
    }

    public void setCPitch(float cPitch) {
        this.cPitch = cPitch;
    }
    public float getCProfileOn() {
        return cProfileOn;
    }

    public void setCProfileOn(float cProfileOn) {
        this.cProfileOn = cProfileOn;
    }
    public float getCWptLat() {
        return cWptLat;
    }

    public void setCWptLat(float cWptLat) {
        this.cWptLat = cWptLat;
    }
    public float getCWptLon() {
        return cWptLon;
    }

    public void setCWptLon(float cWptLon) {
        this.cWptLon = cWptLon;
    }
    public int getM1megPersistor() {
        return m1megPersistor;
    }

    public void setM1megPersistor(int m1megPersistor) {
        this.m1megPersistor = m1megPersistor;
    }
    public float getMAgroundWaterDepth() {
        return mAgroundWaterDepth;
    }

    public void setMAgroundWaterDepth(float mAgroundWaterDepth) {
        this.mAgroundWaterDepth = mAgroundWaterDepth;
    }
    public int getMAirFill() {
        return mAirFill;
    }

    public void setMAirFill(int mAirFill) {
        this.mAirFill = mAirFill;
    }
    public int getMAirPump() {
        return mAirPump;
    }

    public void setMAirPump(int mAirPump) {
        this.mAirPump = mAirPump;
    }
    public int getMAltimeterStatus() {
        return mAltimeterStatus;
    }

    public void setMAltimeterStatus(int mAltimeterStatus) {
        this.mAltimeterStatus = mAltimeterStatus;
    }
    public float getMAltimeterVoltage() {
        return mAltimeterVoltage;
    }

    public void setMAltimeterVoltage(float mAltimeterVoltage) {
        this.mAltimeterVoltage = mAltimeterVoltage;
    }
    public float getMAltitudeRate() {
        return mAltitudeRate;
    }

    public void setMAltitudeRate(float mAltitudeRate) {
        this.mAltitudeRate = mAltitudeRate;
    }
    public int getMAppearToBeAtSurface() {
        return mAppearToBeAtSurface;
    }

    public void setMAppearToBeAtSurface(int mAppearToBeAtSurface) {
        this.mAppearToBeAtSurface = mAppearToBeAtSurface;
    }
    public int getMArgosIsXmitting() {
        return mArgosIsXmitting;
    }

    public void setMArgosIsXmitting(int mArgosIsXmitting) {
        this.mArgosIsXmitting = mArgosIsXmitting;
    }
    public int getMArgosOn() {
        return mArgosOn;
    }

    public void setMArgosOn(int mArgosOn) {
        this.mArgosOn = mArgosOn;
    }
    public int getMArgosSentData() {
        return mArgosSentData;
    }

    public void setMArgosSentData(int mArgosSentData) {
        this.mArgosSentData = mArgosSentData;
    }
    public double getMArgosTimestamp() {
        return mArgosTimestamp;
    }

    public void setMArgosTimestamp(double mArgosTimestamp) {
        this.mArgosTimestamp = mArgosTimestamp;
    }
    public float getMAtRiskDepth() {
        return mAtRiskDepth;
    }

    public void setMAtRiskDepth(float mAtRiskDepth) {
        this.mAtRiskDepth = mAtRiskDepth;
    }
    public int getMAvbotEnable() {
        return mAvbotEnable;
    }

    public void setMAvbotEnable(int mAvbotEnable) {
        this.mAvbotEnable = mAvbotEnable;
    }
    public int getMAvbotPower() {
        return mAvbotPower;
    }

    public void setMAvbotPower(int mAvbotPower) {
        this.mAvbotPower = mAvbotPower;
    }
    public float getMAvgClimbRate() {
        return mAvgClimbRate;
    }

    public void setMAvgClimbRate(float mAvgClimbRate) {
        this.mAvgClimbRate = mAvgClimbRate;
    }
    public float getMAvgDepthRate() {
        return mAvgDepthRate;
    }

    public void setMAvgDepthRate(float mAvgDepthRate) {
        this.mAvgDepthRate = mAvgDepthRate;
    }
    public float getMAvgDiveRate() {
        return mAvgDiveRate;
    }

    public void setMAvgDiveRate(float mAvgDiveRate) {
        this.mAvgDiveRate = mAvgDiveRate;
    }
    public float getMAvgDownwardInflectionTime() {
        return mAvgDownwardInflectionTime;
    }

    public void setMAvgDownwardInflectionTime(float mAvgDownwardInflectionTime) {
        this.mAvgDownwardInflectionTime = mAvgDownwardInflectionTime;
    }
    public float getMAvgSpeed() {
        return mAvgSpeed;
    }

    public void setMAvgSpeed(float mAvgSpeed) {
        this.mAvgSpeed = mAvgSpeed;
    }
    public float getMAvgSystemClockLagsGps() {
        return mAvgSystemClockLagsGps;
    }

    public void setMAvgSystemClockLagsGps(float mAvgSystemClockLagsGps) {
        this.mAvgSystemClockLagsGps = mAvgSystemClockLagsGps;
    }
    public float getMAvgUpwardInflectionTime() {
        return mAvgUpwardInflectionTime;
    }

    public void setMAvgUpwardInflectionTime(float mAvgUpwardInflectionTime) {
        this.mAvgUpwardInflectionTime = mAvgUpwardInflectionTime;
    }
    public float getMAvgYoTime() {
        return mAvgYoTime;
    }

    public void setMAvgYoTime(float mAvgYoTime) {
        this.mAvgYoTime = mAvgYoTime;
    }
    public float getMBallastPumped() {
        return mBallastPumped;
    }

    public void setMBallastPumped(float mBallastPumped) {
        this.mBallastPumped = mBallastPumped;
    }
    public float getMBallastPumpedEnergy() {
        return mBallastPumpedEnergy;
    }

    public void setMBallastPumpedEnergy(float mBallastPumpedEnergy) {
        this.mBallastPumpedEnergy = mBallastPumpedEnergy;
    }
    public float getMBallastPumpedVel() {
        return mBallastPumpedVel;
    }

    public void setMBallastPumpedVel(float mBallastPumpedVel) {
        this.mBallastPumpedVel = mBallastPumpedVel;
    }
    public float getMBattery() {
        return mBattery;
    }

    public void setMBattery(float mBattery) {
        this.mBattery = mBattery;
    }
    public float getMBatteryInst() {
        return mBatteryInst;
    }

    public void setMBatteryInst(float mBatteryInst) {
        this.mBatteryInst = mBatteryInst;
    }
    public float getMBattpos() {
        return mBattpos;
    }

    public void setMBattpos(float mBattpos) {
        this.mBattpos = mBattpos;
    }
    public float getMBattposVel() {
        return mBattposVel;
    }

    public void setMBattposVel(float mBattposVel) {
        this.mBattposVel = mBattposVel;
    }
    public float getMBattroll() {
        return mBattroll;
    }

    public void setMBattroll(float mBattroll) {
        this.mBattroll = mBattroll;
    }
    public float getMBattrollVel() {
        return mBattrollVel;
    }

    public void setMBattrollVel(float mBattrollVel) {
        this.mBattrollVel = mBattrollVel;
    }
    public int getMBpumpFaultBit() {
        return mBpumpFaultBit;
    }

    public void setMBpumpFaultBit(int mBpumpFaultBit) {
        this.mBpumpFaultBit = mBpumpFaultBit;
    }
    public int getMCertainlyAtSurface() {
        return mCertainlyAtSurface;
    }

    public void setMCertainlyAtSurface(int mCertainlyAtSurface) {
        this.mCertainlyAtSurface = mCertainlyAtSurface;
    }
    public float getMCharsTossedByAbend() {
        return mCharsTossedByAbend;
    }

    public void setMCharsTossedByAbend(float mCharsTossedByAbend) {
        this.mCharsTossedByAbend = mCharsTossedByAbend;
    }
    public float getMCharsTossedWithCdOff() {
        return mCharsTossedWithCdOff;
    }

    public void setMCharsTossedWithCdOff(float mCharsTossedWithCdOff) {
        this.mCharsTossedWithCdOff = mCharsTossedWithCdOff;
    }
    public float getMCharsTossedWithPowerOff() {
        return mCharsTossedWithPowerOff;
    }

    public void setMCharsTossedWithPowerOff(float mCharsTossedWithPowerOff) {
        this.mCharsTossedWithPowerOff = mCharsTossedWithPowerOff;
    }
    public float getMClimbTotTime() {
        return mClimbTotTime;
    }

    public void setMClimbTotTime(float mClimbTotTime) {
        this.mClimbTotTime = mClimbTotTime;
    }
    public int getMConsoleCd() {
        return mConsoleCd;
    }

    public void setMConsoleCd(int mConsoleCd) {
        this.mConsoleCd = mConsoleCd;
    }
    public int getMConsoleOn() {
        return mConsoleOn;
    }

    public void setMConsoleOn(int mConsoleOn) {
        this.mConsoleOn = mConsoleOn;
    }
    public int getMCopTickle() {
        return mCopTickle;
    }

    public void setMCopTickle(int mCopTickle) {
        this.mCopTickle = mCopTickle;
    }
    public float getMCoulombAmphr() {
        return mCoulombAmphr;
    }

    public void setMCoulombAmphr(float mCoulombAmphr) {
        this.mCoulombAmphr = mCoulombAmphr;
    }
    public float getMCoulombAmphrRaw() {
        return mCoulombAmphrRaw;
    }

    public void setMCoulombAmphrRaw(float mCoulombAmphrRaw) {
        this.mCoulombAmphrRaw = mCoulombAmphrRaw;
    }
    public float getMCoulombAmphrTotal() {
        return mCoulombAmphrTotal;
    }

    public void setMCoulombAmphrTotal(float mCoulombAmphrTotal) {
        this.mCoulombAmphrTotal = mCoulombAmphrTotal;
    }
    public float getMCoulombCurrent() {
        return mCoulombCurrent;
    }

    public void setMCoulombCurrent(float mCoulombCurrent) {
        this.mCoulombCurrent = mCoulombCurrent;
    }
    public float getMCoulombCurrentRaw() {
        return mCoulombCurrentRaw;
    }

    public void setMCoulombCurrentRaw(float mCoulombCurrentRaw) {
        this.mCoulombCurrentRaw = mCoulombCurrentRaw;
    }
    public float getMCycleNumber() {
        return mCycleNumber;
    }

    public void setMCycleNumber(float mCycleNumber) {
        this.mCycleNumber = mCycleNumber;
    }
    public float getMDepthRate() {
        return mDepthRate;
    }

    public void setMDepthRate(float mDepthRate) {
        this.mDepthRate = mDepthRate;
    }
    public float getMDepthRateAvgFinal() {
        return mDepthRateAvgFinal;
    }

    public void setMDepthRateAvgFinal(float mDepthRateAvgFinal) {
        this.mDepthRateAvgFinal = mDepthRateAvgFinal;
    }
    public float getMDepthRateRunningAvg() {
        return mDepthRateRunningAvg;
    }

    public void setMDepthRateRunningAvg(float mDepthRateRunningAvg) {
        this.mDepthRateRunningAvg = mDepthRateRunningAvg;
    }
    public int getMDepthRateRunningAvgN() {
        return mDepthRateRunningAvgN;
    }

    public void setMDepthRateRunningAvgN(int mDepthRateRunningAvgN) {
        this.mDepthRateRunningAvgN = mDepthRateRunningAvgN;
    }
    public float getMDepthRateSubsampled() {
        return mDepthRateSubsampled;
    }

    public void setMDepthRateSubsampled(float mDepthRateSubsampled) {
        this.mDepthRateSubsampled = mDepthRateSubsampled;
    }
    public int getMDepthRejected() {
        return mDepthRejected;
    }

    public void setMDepthRejected(int mDepthRejected) {
        this.mDepthRejected = mDepthRejected;
    }
    public int getMDepthState() {
        return mDepthState;
    }

    public void setMDepthState(int mDepthState) {
        this.mDepthState = mDepthState;
    }
    public float getMDepthSubsampled() {
        return mDepthSubsampled;
    }

    public void setMDepthSubsampled(float mDepthSubsampled) {
        this.mDepthSubsampled = mDepthSubsampled;
    }
    public float getMDeviceDriversCalledAbnormally() {
        return mDeviceDriversCalledAbnormally;
    }

    public void setMDeviceDriversCalledAbnormally(float mDeviceDriversCalledAbnormally) {
        this.mDeviceDriversCalledAbnormally = mDeviceDriversCalledAbnormally;
    }
    public float getMDeviceError() {
        return mDeviceError;
    }

    public void setMDeviceError(float mDeviceError) {
        this.mDeviceError = mDeviceError;
    }
    public float getMDeviceOddity() {
        return mDeviceOddity;
    }

    public void setMDeviceOddity(float mDeviceOddity) {
        this.mDeviceOddity = mDeviceOddity;
    }
    public float getMDeviceWarning() {
        return mDeviceWarning;
    }

    public void setMDeviceWarning(float mDeviceWarning) {
        this.mDeviceWarning = mDeviceWarning;
    }
    public float getMDeOilVol() {
        return mDeOilVol;
    }

    public void setMDeOilVol(float mDeOilVol) {
        this.mDeOilVol = mDeOilVol;
    }
    public float getMDeOilVolPotVoltage() {
        return mDeOilVolPotVoltage;
    }

    public void setMDeOilVolPotVoltage(float mDeOilVolPotVoltage) {
        this.mDeOilVolPotVoltage = mDeOilVolPotVoltage;
    }
    public float getMDePumpFaultCount() {
        return mDePumpFaultCount;
    }

    public void setMDePumpFaultCount(float mDePumpFaultCount) {
        this.mDePumpFaultCount = mDePumpFaultCount;
    }
    public float getMDigifinCmdDone() {
        return mDigifinCmdDone;
    }

    public void setMDigifinCmdDone(float mDigifinCmdDone) {
        this.mDigifinCmdDone = mDigifinCmdDone;
    }
    public float getMDigifinCmdError() {
        return mDigifinCmdError;
    }

    public void setMDigifinCmdError(float mDigifinCmdError) {
        this.mDigifinCmdError = mDigifinCmdError;
    }
    public float getMDigifinLeakdetectReading() {
        return mDigifinLeakdetectReading;
    }

    public void setMDigifinLeakdetectReading(float mDigifinLeakdetectReading) {
        this.mDigifinLeakdetectReading = mDigifinLeakdetectReading;
    }
    public float getMDigifinMotorstepCounter() {
        return mDigifinMotorstepCounter;
    }

    public void setMDigifinMotorstepCounter(float mDigifinMotorstepCounter) {
        this.mDigifinMotorstepCounter = mDigifinMotorstepCounter;
    }
    public float getMDigifinRespData() {
        return mDigifinRespData;
    }

    public void setMDigifinRespData(float mDigifinRespData) {
        this.mDigifinRespData = mDigifinRespData;
    }
    public float getMDigifinStatus() {
        return mDigifinStatus;
    }

    public void setMDigifinStatus(float mDigifinStatus) {
        this.mDigifinStatus = mDigifinStatus;
    }
    public float getMDiskFree() {
        return mDiskFree;
    }

    public void setMDiskFree(float mDiskFree) {
        this.mDiskFree = mDiskFree;
    }
    public float getMDiskUsage() {
        return mDiskUsage;
    }

    public void setMDiskUsage(float mDiskUsage) {
        this.mDiskUsage = mDiskUsage;
    }
    public float getMDistToWpt() {
        return mDistToWpt;
    }

    public void setMDistToWpt(float mDistToWpt) {
        this.mDistToWpt = mDistToWpt;
    }
    public float getMDiveDepth() {
        return mDiveDepth;
    }

    public void setMDiveDepth(float mDiveDepth) {
        this.mDiveDepth = mDiveDepth;
    }
    public float getMDiveTotTime() {
        return mDiveTotTime;
    }

    public void setMDiveTotTime(float mDiveTotTime) {
        this.mDiveTotTime = mDiveTotTime;
    }
    public float getMDrFixTime() {
        return mDrFixTime;
    }

    public void setMDrFixTime(float mDrFixTime) {
        this.mDrFixTime = mDrFixTime;
    }
    public float getMDrPostfixTime() {
        return mDrPostfixTime;
    }

    public void setMDrPostfixTime(float mDrPostfixTime) {
        this.mDrPostfixTime = mDrPostfixTime;
    }
    public float getMDrSurfXLmc() {
        return mDrSurfXLmc;
    }

    public void setMDrSurfXLmc(float mDrSurfXLmc) {
        this.mDrSurfXLmc = mDrSurfXLmc;
    }
    public float getMDrSurfYLmc() {
        return mDrSurfYLmc;
    }

    public void setMDrSurfYLmc(float mDrSurfYLmc) {
        this.mDrSurfYLmc = mDrSurfYLmc;
    }
    public float getMDrTime() {
        return mDrTime;
    }

    public void setMDrTime(float mDrTime) {
        this.mDrTime = mDrTime;
    }
    public float getMDrXActualErr() {
        return mDrXActualErr;
    }

    public void setMDrXActualErr(float mDrXActualErr) {
        this.mDrXActualErr = mDrXActualErr;
    }
    public float getMDrXIniErr() {
        return mDrXIniErr;
    }

    public void setMDrXIniErr(float mDrXIniErr) {
        this.mDrXIniErr = mDrXIniErr;
    }
    public float getMDrXPostfixDrift() {
        return mDrXPostfixDrift;
    }

    public void setMDrXPostfixDrift(float mDrXPostfixDrift) {
        this.mDrXPostfixDrift = mDrXPostfixDrift;
    }
    public float getMDrXTaPostfixDrift() {
        return mDrXTaPostfixDrift;
    }

    public void setMDrXTaPostfixDrift(float mDrXTaPostfixDrift) {
        this.mDrXTaPostfixDrift = mDrXTaPostfixDrift;
    }
    public float getMDrYActualErr() {
        return mDrYActualErr;
    }

    public void setMDrYActualErr(float mDrYActualErr) {
        this.mDrYActualErr = mDrYActualErr;
    }
    public float getMDrYIniErr() {
        return mDrYIniErr;
    }

    public void setMDrYIniErr(float mDrYIniErr) {
        this.mDrYIniErr = mDrYIniErr;
    }
    public float getMDrYPostfixDrift() {
        return mDrYPostfixDrift;
    }

    public void setMDrYPostfixDrift(float mDrYPostfixDrift) {
        this.mDrYPostfixDrift = mDrYPostfixDrift;
    }
    public float getMDrYTaPostfixDrift() {
        return mDrYTaPostfixDrift;
    }

    public void setMDrYTaPostfixDrift(float mDrYTaPostfixDrift) {
        this.mDrYTaPostfixDrift = mDrYTaPostfixDrift;
    }
    public float getMEstTimeToSurface() {
        return mEstTimeToSurface;
    }

    public void setMEstTimeToSurface(float mEstTimeToSurface) {
        this.mEstTimeToSurface = mEstTimeToSurface;
    }
    public float getMFin() {
        return mFin;
    }

    public void setMFin(float mFin) {
        this.mFin = mFin;
    }
    public float getMFinalWaterVx() {
        return mFinalWaterVx;
    }

    public void setMFinalWaterVx(float mFinalWaterVx) {
        this.mFinalWaterVx = mFinalWaterVx;
    }
    public float getMFinalWaterVy() {
        return mFinalWaterVy;
    }

    public void setMFinalWaterVy(float mFinalWaterVy) {
        this.mFinalWaterVy = mFinalWaterVy;
    }
    public float getMFinVel() {
        return mFinVel;
    }

    public void setMFinVel(float mFinVel) {
        this.mFinVel = mFinVel;
    }
    public float getMFluidPumped() {
        return mFluidPumped;
    }

    public void setMFluidPumped(float mFluidPumped) {
        this.mFluidPumped = mFluidPumped;
    }
    public float getMFluidPumpedAftHallVoltage() {
        return mFluidPumpedAftHallVoltage;
    }

    public void setMFluidPumpedAftHallVoltage(float mFluidPumpedAftHallVoltage) {
        this.mFluidPumpedAftHallVoltage = mFluidPumpedAftHallVoltage;
    }
    public float getMFluidPumpedFwdHallVoltage() {
        return mFluidPumpedFwdHallVoltage;
    }

    public void setMFluidPumpedFwdHallVoltage(float mFluidPumpedFwdHallVoltage) {
        this.mFluidPumpedFwdHallVoltage = mFluidPumpedFwdHallVoltage;
    }
    public float getMFluidPumpedVel() {
        return mFluidPumpedVel;
    }

    public void setMFluidPumpedVel(float mFluidPumpedVel) {
        this.mFluidPumpedVel = mFluidPumpedVel;
    }
    public float getMFreeHeap() {
        return mFreeHeap;
    }

    public void setMFreeHeap(float mFreeHeap) {
        this.mFreeHeap = mFreeHeap;
    }
    public float getMGpsDistFromDr() {
        return mGpsDistFromDr;
    }

    public void setMGpsDistFromDr(float mGpsDistFromDr) {
        this.mGpsDistFromDr = mGpsDistFromDr;
    }
    public float getMGpsFixXLmc() {
        return mGpsFixXLmc;
    }

    public void setMGpsFixXLmc(float mGpsFixXLmc) {
        this.mGpsFixXLmc = mGpsFixXLmc;
    }
    public float getMGpsFixYLmc() {
        return mGpsFixYLmc;
    }

    public void setMGpsFixYLmc(float mGpsFixYLmc) {
        this.mGpsFixYLmc = mGpsFixYLmc;
    }
    public int getMGpsFullStatus() {
        return mGpsFullStatus;
    }

    public void setMGpsFullStatus(int mGpsFullStatus) {
        this.mGpsFullStatus = mGpsFullStatus;
    }
    public float getMGpsHeading() {
        return mGpsHeading;
    }

    public void setMGpsHeading(float mGpsHeading) {
        this.mGpsHeading = mGpsHeading;
    }
    public double getMGpsIgnoredLat() {
        return mGpsIgnoredLat;
    }

    public void setMGpsIgnoredLat(double mGpsIgnoredLat) {
        this.mGpsIgnoredLat = mGpsIgnoredLat;
    }
    public double getMGpsIgnoredLon() {
        return mGpsIgnoredLon;
    }

    public void setMGpsIgnoredLon(double mGpsIgnoredLon) {
        this.mGpsIgnoredLon = mGpsIgnoredLon;
    }
    public double getMGpsInvalidLat() {
        return mGpsInvalidLat;
    }

    public void setMGpsInvalidLat(double mGpsInvalidLat) {
        this.mGpsInvalidLat = mGpsInvalidLat;
    }
    public double getMGpsInvalidLon() {
        return mGpsInvalidLon;
    }

    public void setMGpsInvalidLon(double mGpsInvalidLon) {
        this.mGpsInvalidLon = mGpsInvalidLon;
    }
    public float getMGpsMagVar() {
        return mGpsMagVar;
    }

    public void setMGpsMagVar(float mGpsMagVar) {
        this.mGpsMagVar = mGpsMagVar;
    }
    public float getMGpsNumSatellites() {
        return mGpsNumSatellites;
    }

    public void setMGpsNumSatellites(float mGpsNumSatellites) {
        this.mGpsNumSatellites = mGpsNumSatellites;
    }
    public int getMGpsOn() {
        return mGpsOn;
    }

    public void setMGpsOn(int mGpsOn) {
        this.mGpsOn = mGpsOn;
    }
    public float getMGpsPostfixXLmc() {
        return mGpsPostfixXLmc;
    }

    public void setMGpsPostfixXLmc(float mGpsPostfixXLmc) {
        this.mGpsPostfixXLmc = mGpsPostfixXLmc;
    }
    public float getMGpsPostfixYLmc() {
        return mGpsPostfixYLmc;
    }

    public void setMGpsPostfixYLmc(float mGpsPostfixYLmc) {
        this.mGpsPostfixYLmc = mGpsPostfixYLmc;
    }
    public float getMGpsSpeed() {
        return mGpsSpeed;
    }

    public void setMGpsSpeed(float mGpsSpeed) {
        this.mGpsSpeed = mGpsSpeed;
    }
    public int getMGpsStatus() {
        return mGpsStatus;
    }

    public void setMGpsStatus(int mGpsStatus) {
        this.mGpsStatus = mGpsStatus;
    }
    public double getMGpsToofarLat() {
        return mGpsToofarLat;
    }

    public void setMGpsToofarLat(double mGpsToofarLat) {
        this.mGpsToofarLat = mGpsToofarLat;
    }
    public double getMGpsToofarLon() {
        return mGpsToofarLon;
    }

    public void setMGpsToofarLon(double mGpsToofarLon) {
        this.mGpsToofarLon = mGpsToofarLon;
    }
    public float getMGpsUncertainty() {
        return mGpsUncertainty;
    }

    public void setMGpsUncertainty(float mGpsUncertainty) {
        this.mGpsUncertainty = mGpsUncertainty;
    }
    public int getMGpsUtcDay() {
        return mGpsUtcDay;
    }

    public void setMGpsUtcDay(int mGpsUtcDay) {
        this.mGpsUtcDay = mGpsUtcDay;
    }
    public int getMGpsUtcHour() {
        return mGpsUtcHour;
    }

    public void setMGpsUtcHour(int mGpsUtcHour) {
        this.mGpsUtcHour = mGpsUtcHour;
    }
    public int getMGpsUtcMinute() {
        return mGpsUtcMinute;
    }

    public void setMGpsUtcMinute(int mGpsUtcMinute) {
        this.mGpsUtcMinute = mGpsUtcMinute;
    }
    public int getMGpsUtcMonth() {
        return mGpsUtcMonth;
    }

    public void setMGpsUtcMonth(int mGpsUtcMonth) {
        this.mGpsUtcMonth = mGpsUtcMonth;
    }
    public float getMGpsUtcSecond() {
        return mGpsUtcSecond;
    }

    public void setMGpsUtcSecond(float mGpsUtcSecond) {
        this.mGpsUtcSecond = mGpsUtcSecond;
    }
    public int getMGpsUtcYear() {
        return mGpsUtcYear;
    }

    public void setMGpsUtcYear(int mGpsUtcYear) {
        this.mGpsUtcYear = mGpsUtcYear;
    }
    public float getMGpsXLmc() {
        return mGpsXLmc;
    }

    public void setMGpsXLmc(float mGpsXLmc) {
        this.mGpsXLmc = mGpsXLmc;
    }
    public float getMGpsYLmc() {
        return mGpsYLmc;
    }

    public void setMGpsYLmc(float mGpsYLmc) {
        this.mGpsYLmc = mGpsYLmc;
    }
    public float getMHdgDerror() {
        return mHdgDerror;
    }

    public void setMHdgDerror(float mHdgDerror) {
        this.mHdgDerror = mHdgDerror;
    }
    public float getMHdgError() {
        return mHdgError;
    }

    public void setMHdgError(float mHdgError) {
        this.mHdgError = mHdgError;
    }
    public float getMHdgIerror() {
        return mHdgIerror;
    }

    public void setMHdgIerror(float mHdgIerror) {
        this.mHdgIerror = mHdgIerror;
    }
    public float getMHdgRate() {
        return mHdgRate;
    }

    public void setMHdgRate(float mHdgRate) {
        this.mHdgRate = mHdgRate;
    }
    public float getMHeading() {
        return mHeading;
    }

    public void setMHeading(float mHeading) {
        this.mHeading = mHeading;
    }
    public float getMInitialWaterVx() {
        return mInitialWaterVx;
    }

    public void setMInitialWaterVx(float mInitialWaterVx) {
        this.mInitialWaterVx = mInitialWaterVx;
    }
    public float getMInitialWaterVy() {
        return mInitialWaterVy;
    }

    public void setMInitialWaterVy(float mInitialWaterVy) {
        this.mInitialWaterVy = mInitialWaterVy;
    }
    public float getMIridiumAttemptNum() {
        return mIridiumAttemptNum;
    }

    public void setMIridiumAttemptNum(float mIridiumAttemptNum) {
        this.mIridiumAttemptNum = mIridiumAttemptNum;
    }
    public float getMIridiumCallNum() {
        return mIridiumCallNum;
    }

    public void setMIridiumCallNum(float mIridiumCallNum) {
        this.mIridiumCallNum = mIridiumCallNum;
    }
    public int getMIridiumConnected() {
        return mIridiumConnected;
    }

    public void setMIridiumConnected(int mIridiumConnected) {
        this.mIridiumConnected = mIridiumConnected;
    }
    public int getMIridiumConsoleOn() {
        return mIridiumConsoleOn;
    }

    public void setMIridiumConsoleOn(int mIridiumConsoleOn) {
        this.mIridiumConsoleOn = mIridiumConsoleOn;
    }
    public float getMIridiumDialedNum() {
        return mIridiumDialedNum;
    }

    public void setMIridiumDialedNum(float mIridiumDialedNum) {
        this.mIridiumDialedNum = mIridiumDialedNum;
    }
    public int getMIridiumOn() {
        return mIridiumOn;
    }

    public void setMIridiumOn(int mIridiumOn) {
        this.mIridiumOn = mIridiumOn;
    }
    public float getMIridiumRedials() {
        return mIridiumRedials;
    }

    public void setMIridiumRedials(float mIridiumRedials) {
        this.mIridiumRedials = mIridiumRedials;
    }
    public float getMIridiumSignalStrength() {
        return mIridiumSignalStrength;
    }

    public void setMIridiumSignalStrength(float mIridiumSignalStrength) {
        this.mIridiumSignalStrength = mIridiumSignalStrength;
    }
    public int getMIridiumStatus() {
        return mIridiumStatus;
    }

    public void setMIridiumStatus(int mIridiumStatus) {
        this.mIridiumStatus = mIridiumStatus;
    }
    public int getMIridiumWaitingRedialDelay() {
        return mIridiumWaitingRedialDelay;
    }

    public void setMIridiumWaitingRedialDelay(int mIridiumWaitingRedialDelay) {
        this.mIridiumWaitingRedialDelay = mIridiumWaitingRedialDelay;
    }
    public int getMIridiumWaitingRegistration() {
        return mIridiumWaitingRegistration;
    }

    public void setMIridiumWaitingRegistration(int mIridiumWaitingRegistration) {
        this.mIridiumWaitingRegistration = mIridiumWaitingRegistration;
    }
    public int getMIsBallastPumpMoving() {
        return mIsBallastPumpMoving;
    }

    public void setMIsBallastPumpMoving(int mIsBallastPumpMoving) {
        this.mIsBallastPumpMoving = mIsBallastPumpMoving;
    }
    public int getMIsBattposMoving() {
        return mIsBattposMoving;
    }

    public void setMIsBattposMoving(int mIsBattposMoving) {
        this.mIsBattposMoving = mIsBattposMoving;
    }
    public int getMIsBattrollMoving() {
        return mIsBattrollMoving;
    }

    public void setMIsBattrollMoving(int mIsBattrollMoving) {
        this.mIsBattrollMoving = mIsBattrollMoving;
    }
    public int getMIsDePumpMoving() {
        return mIsDePumpMoving;
    }

    public void setMIsDePumpMoving(int mIsDePumpMoving) {
        this.mIsDePumpMoving = mIsDePumpMoving;
    }
    public int getMIsFinMoving() {
        return mIsFinMoving;
    }

    public void setMIsFinMoving(int mIsFinMoving) {
        this.mIsFinMoving = mIsFinMoving;
    }
    public int getMIsFpitchPumpMoving() {
        return mIsFpitchPumpMoving;
    }

    public void setMIsFpitchPumpMoving(int mIsFpitchPumpMoving) {
        this.mIsFpitchPumpMoving = mIsFpitchPumpMoving;
    }
    public int getMIsSpeedEstimated() {
        return mIsSpeedEstimated;
    }

    public void setMIsSpeedEstimated(int mIsSpeedEstimated) {
        this.mIsSpeedEstimated = mIsSpeedEstimated;
    }
    public int getMIsThermalValveMoving() {
        return mIsThermalValveMoving;
    }

    public void setMIsThermalValveMoving(int mIsThermalValveMoving) {
        this.mIsThermalValveMoving = mIsThermalValveMoving;
    }
    public float getMLastYoTime() {
        return mLastYoTime;
    }

    public void setMLastYoTime(float mLastYoTime) {
        this.mLastYoTime = mLastYoTime;
    }
    public int getMLeak() {
        return mLeak;
    }

    public void setMLeak(int mLeak) {
        this.mLeak = mLeak;
    }
    public float getMLeakdetectVoltage() {
        return mLeakdetectVoltage;
    }

    public void setMLeakdetectVoltage(float mLeakdetectVoltage) {
        this.mLeakdetectVoltage = mLeakdetectVoltage;
    }
    public float getMLeakdetectVoltageForward() {
        return mLeakdetectVoltageForward;
    }

    public void setMLeakdetectVoltageForward(float mLeakdetectVoltageForward) {
        this.mLeakdetectVoltageForward = mLeakdetectVoltageForward;
    }
    public int getMLeakForward() {
        return mLeakForward;
    }

    public void setMLeakForward(int mLeakForward) {
        this.mLeakForward = mLeakForward;
    }
    public float getMLithiumBatteryRelativeCharge() {
        return mLithiumBatteryRelativeCharge;
    }

    public void setMLithiumBatteryRelativeCharge(float mLithiumBatteryRelativeCharge) {
        this.mLithiumBatteryRelativeCharge = mLithiumBatteryRelativeCharge;
    }
    public float getMLithiumBatteryStatus() {
        return mLithiumBatteryStatus;
    }

    public void setMLithiumBatteryStatus(float mLithiumBatteryStatus) {
        this.mLithiumBatteryStatus = mLithiumBatteryStatus;
    }
    public float getMLithiumBatteryTimeToCharge() {
        return mLithiumBatteryTimeToCharge;
    }

    public void setMLithiumBatteryTimeToCharge(float mLithiumBatteryTimeToCharge) {
        this.mLithiumBatteryTimeToCharge = mLithiumBatteryTimeToCharge;
    }
    public float getMLithiumBatteryTimeToDischarge() {
        return mLithiumBatteryTimeToDischarge;
    }

    public void setMLithiumBatteryTimeToDischarge(float mLithiumBatteryTimeToDischarge) {
        this.mLithiumBatteryTimeToDischarge = mLithiumBatteryTimeToDischarge;
    }
    public float getMMinFreeHeap() {
        return mMinFreeHeap;
    }

    public void setMMinFreeHeap(float mMinFreeHeap) {
        this.mMinFreeHeap = mMinFreeHeap;
    }
    public float getMMinSpareHeap() {
        return mMinSpareHeap;
    }

    public void setMMinSpareHeap(float mMinSpareHeap) {
        this.mMinSpareHeap = mMinSpareHeap;
    }
    public float getMMissionAvgSpeedClimbing() {
        return mMissionAvgSpeedClimbing;
    }

    public void setMMissionAvgSpeedClimbing(float mMissionAvgSpeedClimbing) {
        this.mMissionAvgSpeedClimbing = mMissionAvgSpeedClimbing;
    }
    public float getMMissionAvgSpeedDiving() {
        return mMissionAvgSpeedDiving;
    }

    public void setMMissionAvgSpeedDiving(float mMissionAvgSpeedDiving) {
        this.mMissionAvgSpeedDiving = mMissionAvgSpeedDiving;
    }
    public double getMMissionStartTime() {
        return mMissionStartTime;
    }

    public void setMMissionStartTime(double mMissionStartTime) {
        this.mMissionStartTime = mMissionStartTime;
    }
    public float getMNumHalfYosInSegment() {
        return mNumHalfYosInSegment;
    }

    public void setMNumHalfYosInSegment(float mNumHalfYosInSegment) {
        this.mNumHalfYosInSegment = mNumHalfYosInSegment;
    }
    public float getMPitch() {
        return mPitch;
    }

    public void setMPitch(float mPitch) {
        this.mPitch = mPitch;
    }
    public float getMPitchEnergy() {
        return mPitchEnergy;
    }

    public void setMPitchEnergy(float mPitchEnergy) {
        this.mPitchEnergy = mPitchEnergy;
    }
    public float getMPitchError() {
        return mPitchError;
    }

    public void setMPitchError(float mPitchError) {
        this.mPitchError = mPitchError;
    }
    public float getMPressure() {
        return mPressure;
    }

    public void setMPressure(float mPressure) {
        this.mPressure = mPressure;
    }
    public float getMPressureRawVoltageSample0() {
        return mPressureRawVoltageSample0;
    }

    public void setMPressureRawVoltageSample0(float mPressureRawVoltageSample0) {
        this.mPressureRawVoltageSample0 = mPressureRawVoltageSample0;
    }
    public float getMPressureRawVoltageSample19() {
        return mPressureRawVoltageSample19;
    }

    public void setMPressureRawVoltageSample19(float mPressureRawVoltageSample19) {
        this.mPressureRawVoltageSample19 = mPressureRawVoltageSample19;
    }
    public float getMPressureVoltage() {
        return mPressureVoltage;
    }

    public void setMPressureVoltage(float mPressureVoltage) {
        this.mPressureVoltage = mPressureVoltage;
    }
    public float getMRawAltitude() {
        return mRawAltitude;
    }

    public void setMRawAltitude(float mRawAltitude) {
        this.mRawAltitude = mRawAltitude;
    }
    public int getMRawAltitudeRejected() {
        return mRawAltitudeRejected;
    }

    public void setMRawAltitudeRejected(int mRawAltitudeRejected) {
        this.mRawAltitudeRejected = mRawAltitudeRejected;
    }
    public float getMRoll() {
        return mRoll;
    }

    public void setMRoll(float mRoll) {
        this.mRoll = mRoll;
    }
    public float getMScienceClotheslineLag() {
        return mScienceClotheslineLag;
    }

    public void setMScienceClotheslineLag(float mScienceClotheslineLag) {
        this.mScienceClotheslineLag = mScienceClotheslineLag;
    }
    public int getMScienceOn() {
        return mScienceOn;
    }

    public void setMScienceOn(int mScienceOn) {
        this.mScienceOn = mScienceOn;
    }
    public int getMScienceReadyForConsci() {
        return mScienceReadyForConsci;
    }

    public void setMScienceReadyForConsci(int mScienceReadyForConsci) {
        this.mScienceReadyForConsci = mScienceReadyForConsci;
    }
    public float getMScienceSentSomeData() {
        return mScienceSentSomeData;
    }

    public void setMScienceSentSomeData(float mScienceSentSomeData) {
        this.mScienceSentSomeData = mScienceSentSomeData;
    }
    public double getMScienceSyncTime() {
        return mScienceSyncTime;
    }

    public void setMScienceSyncTime(double mScienceSyncTime) {
        this.mScienceSyncTime = mScienceSyncTime;
    }
    public int getMScienceUnreadinessForConsci() {
        return mScienceUnreadinessForConsci;
    }

    public void setMScienceUnreadinessForConsci(int mScienceUnreadinessForConsci) {
        this.mScienceUnreadinessForConsci = mScienceUnreadinessForConsci;
    }
    public float getMSpareHeap() {
        return mSpareHeap;
    }

    public void setMSpareHeap(float mSpareHeap) {
        this.mSpareHeap = mSpareHeap;
    }
    public float getMSpeed() {
        return mSpeed;
    }

    public void setMSpeed(float mSpeed) {
        this.mSpeed = mSpeed;
    }
    public int getMStableComms() {
        return mStableComms;
    }

    public void setMStableComms(int mStableComms) {
        this.mStableComms = mStableComms;
    }
    public int getMStrobeCtrl() {
        return mStrobeCtrl;
    }

    public void setMStrobeCtrl(int mStrobeCtrl) {
        this.mStrobeCtrl = mStrobeCtrl;
    }
    public float getMSurfaceEstCmd() {
        return mSurfaceEstCmd;
    }

    public void setMSurfaceEstCmd(float mSurfaceEstCmd) {
        this.mSurfaceEstCmd = mSurfaceEstCmd;
    }
    public float getMSurfaceEstCtd() {
        return mSurfaceEstCtd;
    }

    public void setMSurfaceEstCtd(float mSurfaceEstCtd) {
        this.mSurfaceEstCtd = mSurfaceEstCtd;
    }
    public float getMSurfaceEstFw() {
        return mSurfaceEstFw;
    }

    public void setMSurfaceEstFw(float mSurfaceEstFw) {
        this.mSurfaceEstFw = mSurfaceEstFw;
    }
    public float getMSurfaceEstGps() {
        return mSurfaceEstGps;
    }

    public void setMSurfaceEstGps(float mSurfaceEstGps) {
        this.mSurfaceEstGps = mSurfaceEstGps;
    }
    public float getMSurfaceEstIrid() {
        return mSurfaceEstIrid;
    }

    public void setMSurfaceEstIrid(float mSurfaceEstIrid) {
        this.mSurfaceEstIrid = mSurfaceEstIrid;
    }
    public float getMSurfaceEstTotal() {
        return mSurfaceEstTotal;
    }

    public void setMSurfaceEstTotal(float mSurfaceEstTotal) {
        this.mSurfaceEstTotal = mSurfaceEstTotal;
    }
    public float getMSystemClockLagsGps() {
        return mSystemClockLagsGps;
    }

    public void setMSystemClockLagsGps(float mSystemClockLagsGps) {
        this.mSystemClockLagsGps = mSystemClockLagsGps;
    }
    public int getMTcm3IsCalibrated() {
        return mTcm3IsCalibrated;
    }

    public void setMTcm3IsCalibrated(int mTcm3IsCalibrated) {
        this.mTcm3IsCalibrated = mTcm3IsCalibrated;
    }
    public float getMTcm3Magbearth() {
        return mTcm3Magbearth;
    }

    public void setMTcm3Magbearth(float mTcm3Magbearth) {
        this.mTcm3Magbearth = mTcm3Magbearth;
    }
    public float getMTcm3PollTime() {
        return mTcm3PollTime;
    }

    public void setMTcm3PollTime(float mTcm3PollTime) {
        this.mTcm3PollTime = mTcm3PollTime;
    }
    public float getMTcm3RecvStartTime() {
        return mTcm3RecvStartTime;
    }

    public void setMTcm3RecvStartTime(float mTcm3RecvStartTime) {
        this.mTcm3RecvStartTime = mTcm3RecvStartTime;
    }
    public float getMTcm3RecvStopTime() {
        return mTcm3RecvStopTime;
    }

    public void setMTcm3RecvStopTime(float mTcm3RecvStopTime) {
        this.mTcm3RecvStopTime = mTcm3RecvStopTime;
    }
    public float getMTcm3Stddeverr() {
        return mTcm3Stddeverr;
    }

    public void setMTcm3Stddeverr(float mTcm3Stddeverr) {
        this.mTcm3Stddeverr = mTcm3Stddeverr;
    }
    public float getMTcm3Xcoverage() {
        return mTcm3Xcoverage;
    }

    public void setMTcm3Xcoverage(float mTcm3Xcoverage) {
        this.mTcm3Xcoverage = mTcm3Xcoverage;
    }
    public float getMTcm3Ycoverage() {
        return mTcm3Ycoverage;
    }

    public void setMTcm3Ycoverage(float mTcm3Ycoverage) {
        this.mTcm3Ycoverage = mTcm3Ycoverage;
    }
    public float getMTcm3Zcoverage() {
        return mTcm3Zcoverage;
    }

    public void setMTcm3Zcoverage(float mTcm3Zcoverage) {
        this.mTcm3Zcoverage = mTcm3Zcoverage;
    }
    public float getMThermalAccPres() {
        return mThermalAccPres;
    }

    public void setMThermalAccPres(float mThermalAccPres) {
        this.mThermalAccPres = mThermalAccPres;
    }
    public float getMThermalAccPresVoltage() {
        return mThermalAccPresVoltage;
    }

    public void setMThermalAccPresVoltage(float mThermalAccPresVoltage) {
        this.mThermalAccPresVoltage = mThermalAccPresVoltage;
    }
    public float getMThermalAccVol() {
        return mThermalAccVol;
    }

    public void setMThermalAccVol(float mThermalAccVol) {
        this.mThermalAccVol = mThermalAccVol;
    }
    public int getMThermalEnufAccVol() {
        return mThermalEnufAccVol;
    }

    public void setMThermalEnufAccVol(int mThermalEnufAccVol) {
        this.mThermalEnufAccVol = mThermalEnufAccVol;
    }
    public int getMThermalPump() {
        return mThermalPump;
    }

    public void setMThermalPump(int mThermalPump) {
        this.mThermalPump = mThermalPump;
    }
    public int getMThermalUpdown() {
        return mThermalUpdown;
    }

    public void setMThermalUpdown(int mThermalUpdown) {
        this.mThermalUpdown = mThermalUpdown;
    }
    public int getMThermalValve() {
        return mThermalValve;
    }

    public void setMThermalValve(int mThermalValve) {
        this.mThermalValve = mThermalValve;
    }
    public float getMTimeTilWpt() {
        return mTimeTilWpt;
    }

    public void setMTimeTilWpt(float mTimeTilWpt) {
        this.mTimeTilWpt = mTimeTilWpt;
    }
    public float getMTotBallastPumpedEnergy() {
        return mTotBallastPumpedEnergy;
    }

    public void setMTotBallastPumpedEnergy(float mTotBallastPumpedEnergy) {
        this.mTotBallastPumpedEnergy = mTotBallastPumpedEnergy;
    }
    public float getMTotHorzDist() {
        return mTotHorzDist;
    }

    public void setMTotHorzDist(float mTotHorzDist) {
        this.mTotHorzDist = mTotHorzDist;
    }
    public float getMTotNumInflections() {
        return mTotNumInflections;
    }

    public void setMTotNumInflections(float mTotNumInflections) {
        this.mTotNumInflections = mTotNumInflections;
    }
    public float getMTotOnTime() {
        return mTotOnTime;
    }

    public void setMTotOnTime(float mTotOnTime) {
        this.mTotOnTime = mTotOnTime;
    }
    public float getMVacuum() {
        return mVacuum;
    }

    public void setMVacuum(float mVacuum) {
        this.mVacuum = mVacuum;
    }
    public float getMVehicleTemp() {
        return mVehicleTemp;
    }

    public void setMVehicleTemp(float mVehicleTemp) {
        this.mVehicleTemp = mVehicleTemp;
    }
    public int getMVehOverheat() {
        return mVehOverheat;
    }

    public void setMVehOverheat(int mVehOverheat) {
        this.mVehOverheat = mVehOverheat;
    }
    public float getMVehTemp() {
        return mVehTemp;
    }

    public void setMVehTemp(float mVehTemp) {
        this.mVehTemp = mVehTemp;
    }
    public float getMVmgToWpt() {
        return mVmgToWpt;
    }

    public void setMVmgToWpt(float mVmgToWpt) {
        this.mVmgToWpt = mVmgToWpt;
    }
    public float getMVxLmc() {
        return mVxLmc;
    }

    public void setMVxLmc(float mVxLmc) {
        this.mVxLmc = mVxLmc;
    }
    public float getMVyLmc() {
        return mVyLmc;
    }

    public void setMVyLmc(float mVyLmc) {
        this.mVyLmc = mVyLmc;
    }
    public float getMWaterCond() {
        return mWaterCond;
    }

    public void setMWaterCond(float mWaterCond) {
        this.mWaterCond = mWaterCond;
    }
    public float getMWaterDeltaVx() {
        return mWaterDeltaVx;
    }

    public void setMWaterDeltaVx(float mWaterDeltaVx) {
        this.mWaterDeltaVx = mWaterDeltaVx;
    }
    public float getMWaterDeltaVy() {
        return mWaterDeltaVy;
    }

    public void setMWaterDeltaVy(float mWaterDeltaVy) {
        this.mWaterDeltaVy = mWaterDeltaVy;
    }
    public float getMWaterDepth() {
        return mWaterDepth;
    }

    public void setMWaterDepth(float mWaterDepth) {
        this.mWaterDepth = mWaterDepth;
    }
    public float getMWaterPressure() {
        return mWaterPressure;
    }

    public void setMWaterPressure(float mWaterPressure) {
        this.mWaterPressure = mWaterPressure;
    }
    public float getMWaterTemp() {
        return mWaterTemp;
    }

    public void setMWaterTemp(float mWaterTemp) {
        this.mWaterTemp = mWaterTemp;
    }
    public float getMWaterVx() {
        return mWaterVx;
    }

    public void setMWaterVx(float mWaterVx) {
        this.mWaterVx = mWaterVx;
    }
    public float getMWaterVy() {
        return mWaterVy;
    }

    public void setMWaterVy(float mWaterVy) {
        this.mWaterVy = mWaterVy;
    }
    public int getMWhyStarted() {
        return mWhyStarted;
    }

    public void setMWhyStarted(int mWhyStarted) {
        this.mWhyStarted = mWhyStarted;
    }
    public float getMXLmc() {
        return mXLmc;
    }

    public void setMXLmc(float mXLmc) {
        this.mXLmc = mXLmc;
    }
    public float getMYLmc() {
        return mYLmc;
    }

    public void setMYLmc(float mYLmc) {
        this.mYLmc = mYLmc;
    }
    public float getXLastWptLat() {
        return xLastWptLat;
    }

    public void setXLastWptLat(float xLastWptLat) {
        this.xLastWptLat = xLastWptLat;
    }
    public float getXLastWptLon() {
        return xLastWptLon;
    }

    public void setXLastWptLon(float xLastWptLon) {
        this.xLastWptLon = xLastWptLon;
    }
    public float getXSystemClockAdjusted() {
        return xSystemClockAdjusted;
    }

    public void setXSystemClockAdjusted(float xSystemClockAdjusted) {
        this.xSystemClockAdjusted = xSystemClockAdjusted;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}