package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_cpm_eng_cpm")
public class CgCpmEngCpm extends CassandraParticle {

    @Column(value = "cg_eng_platform_time")
    private String cgEngPlatformTime;

    @Column(value = "cg_eng_platform_utime")
    private double cgEngPlatformUtime;

    @Column(value = "cg_eng_alarm_sys")
    private List<String> cgEngAlarmSys;

    @Column(value = "cg_eng_alarm_sys_dims")
    private int cgEngAlarmSysDims;

    @Column(value = "cg_eng_alarm_sys_sizes")
    private List<Long> cgEngAlarmSysSizes;

    @Column(value = "cg_eng_alarm_ts")
    private List<String> cgEngAlarmTs;

    @Column(value = "cg_eng_alarm_ts_dims")
    private int cgEngAlarmTsDims;

    @Column(value = "cg_eng_alarm_ts_sizes")
    private List<Long> cgEngAlarmTsSizes;

    @Column(value = "cg_eng_alarm_severity")
    private List<String> cgEngAlarmSeverity;

    @Column(value = "cg_eng_alarm_severity_dims")
    private int cgEngAlarmSeverityDims;

    @Column(value = "cg_eng_alarm_severity_sizes")
    private List<Long> cgEngAlarmSeveritySizes;

    @Column(value = "cg_eng_alarm_at")
    private List<Integer> cgEngAlarmAt;

    @Column(value = "cg_eng_alarm_at_dims")
    private int cgEngAlarmAtDims;

    @Column(value = "cg_eng_alarm_at_sizes")
    private List<Long> cgEngAlarmAtSizes;

    @Column(value = "cg_eng_alarm_pc")
    private List<Integer> cgEngAlarmPc;

    @Column(value = "cg_eng_alarm_pc_dims")
    private int cgEngAlarmPcDims;

    @Column(value = "cg_eng_alarm_pc_sizes")
    private List<Long> cgEngAlarmPcSizes;

    @Column(value = "cg_eng_alarm_err")
    private List<String> cgEngAlarmErr;

    @Column(value = "cg_eng_alarm_err_dims")
    private int cgEngAlarmErrDims;

    @Column(value = "cg_eng_alarm_err_sizes")
    private List<Long> cgEngAlarmErrSizes;

    @Column(value = "cg_eng_msg_cnts_c_gps")
    private int cgEngMsgCntsCGps;

    @Column(value = "cg_eng_msg_cnts_c_ntp")
    private int cgEngMsgCntsCNtp;

    @Column(value = "cg_eng_msg_cnts_c_pps")
    private int cgEngMsgCntsCPps;

    @Column(value = "cg_eng_msg_cnts_c_power_sys")
    private int cgEngMsgCntsCPowerSys;

    @Column(value = "cg_eng_msg_cnts_c_superv")
    private int cgEngMsgCntsCSuperv;

    @Column(value = "cg_eng_msg_cnts_c_telem")
    private int cgEngMsgCntsCTelem;

    @Column(value = "cg_eng_err_c_gps")
    private int cgEngErrCGps;

    @Column(value = "cg_eng_err_c_pps")
    private int cgEngErrCPps;

    @Column(value = "cg_eng_err_c_ctl")
    private int cgEngErrCCtl;

    @Column(value = "cg_eng_err_c_status")
    private int cgEngErrCStatus;

    @Column(value = "cg_eng_err_superv")
    private int cgEngErrSuperv;

    @Column(value = "cg_eng_err_c_power_sys")
    private int cgEngErrCPowerSys;

    @Column(value = "cg_eng_err_c_telem_sys")
    private int cgEngErrCTelemSys;

    @Column(value = "cg_eng_err_c_irid")
    private int cgEngErrCIrid;

    @Column(value = "cg_eng_err_c_imm")
    private int cgEngErrCImm;

    @Column(value = "cg_eng_err_cpm1")
    private int cgEngErrCpm1;

    @Column(value = "cg_eng_err_d_ctl")
    private int cgEngErrDCtl;

    @Column(value = "cg_eng_err_d_status")
    private int cgEngErrDStatus;

    @Column(value = "cg_eng_err_dlog_mgr")
    private int cgEngErrDlogMgr;

    @Column(value = "cg_eng_err_dlogp1")
    private int cgEngErrDlogp1;

    @Column(value = "cg_eng_err_dlogp2")
    private int cgEngErrDlogp2;

    @Column(value = "cg_eng_err_dlogp3")
    private int cgEngErrDlogp3;

    @Column(value = "cg_eng_err_dlogp4")
    private int cgEngErrDlogp4;

    @Column(value = "cg_eng_err_dlogp5")
    private int cgEngErrDlogp5;

    @Column(value = "cg_eng_err_dlogp6")
    private int cgEngErrDlogp6;

    @Column(value = "cg_eng_err_dlogp7")
    private int cgEngErrDlogp7;

    @Column(value = "cg_eng_err_dlogp8")
    private int cgEngErrDlogp8;

    @Column(value = "cg_eng_err_rcmd")
    private int cgEngErrRcmd;

    @Column(value = "cg_eng_err_bcmd")
    private int cgEngErrBcmd;

    @Column(value = "cg_eng_errmsg_c_gps")
    private String cgEngErrmsgCGps;

    @Column(value = "cg_eng_errmsg_c_pps")
    private String cgEngErrmsgCPps;

    @Column(value = "cg_eng_errmsg_c_ctl")
    private String cgEngErrmsgCCtl;

    @Column(value = "cg_eng_errmsg_c_status")
    private String cgEngErrmsgCStatus;

    @Column(value = "cg_eng_errmsg_superv")
    private String cgEngErrmsgSuperv;

    @Column(value = "cg_eng_errmsg_c_power_sys")
    private String cgEngErrmsgCPowerSys;

    @Column(value = "cg_eng_errmsg_c_telem_sys")
    private String cgEngErrmsgCTelemSys;

    @Column(value = "cg_eng_errmsg_c_irid")
    private String cgEngErrmsgCIrid;

    @Column(value = "cg_eng_errmsg_c_imm")
    private String cgEngErrmsgCImm;

    @Column(value = "cg_eng_errmsg_cpm1")
    private String cgEngErrmsgCpm1;

    @Column(value = "cg_eng_errmsg_d_ctl")
    private String cgEngErrmsgDCtl;

    @Column(value = "cg_eng_errmsg_d_status")
    private String cgEngErrmsgDStatus;

    @Column(value = "cg_eng_errmsg_dlog_mgr")
    private String cgEngErrmsgDlogMgr;

    @Column(value = "cg_eng_errmsg_dlogp1")
    private String cgEngErrmsgDlogp1;

    @Column(value = "cg_eng_errmsg_dlogp2")
    private String cgEngErrmsgDlogp2;

    @Column(value = "cg_eng_errmsg_dlogp3")
    private String cgEngErrmsgDlogp3;

    @Column(value = "cg_eng_errmsg_dlogp4")
    private String cgEngErrmsgDlogp4;

    @Column(value = "cg_eng_errmsg_dlogp5")
    private String cgEngErrmsgDlogp5;

    @Column(value = "cg_eng_errmsg_dlogp6")
    private String cgEngErrmsgDlogp6;

    @Column(value = "cg_eng_errmsg_dlogp7")
    private String cgEngErrmsgDlogp7;

    @Column(value = "cg_eng_errmsg_dlogp8")
    private String cgEngErrmsgDlogp8;

    @Column(value = "cg_eng_errmsg_rcmd")
    private String cgEngErrmsgRcmd;

    @Column(value = "cg_eng_errmsg_bcmd")
    private String cgEngErrmsgBcmd;

    @Column(value = "cg_eng_cpu_uptime")
    private String cgEngCpuUptime;

    @Column(value = "cg_eng_cpu_load1")
    private float cgEngCpuLoad1;

    @Column(value = "cg_eng_cpu_load5")
    private float cgEngCpuLoad5;

    @Column(value = "cg_eng_cpu_load15")
    private float cgEngCpuLoad15;

    @Column(value = "cg_eng_memory_ram")
    private long cgEngMemoryRam;

    @Column(value = "cg_eng_memory_free")
    private long cgEngMemoryFree;

    @Column(value = "cg_eng_nproc")
    private int cgEngNproc;

    @Column(value = "cg_eng_mpic_eflag")
    private long cgEngMpicEflag;

    @Column(value = "cg_eng_mpic_main_v")
    private float cgEngMpicMainV;

    @Column(value = "cg_eng_mpic_main_c")
    private float cgEngMpicMainC;

    @Column(value = "cg_eng_mpic_bat_v")
    private float cgEngMpicBatV;

    @Column(value = "cg_eng_mpic_bat_c")
    private float cgEngMpicBatC;

    @Column(value = "cg_eng_mpic_temp1")
    private float cgEngMpicTemp1;

    @Column(value = "cg_eng_mpic_temp2")
    private float cgEngMpicTemp2;

    @Column(value = "cg_eng_mpic_humid")
    private float cgEngMpicHumid;

    @Column(value = "cg_eng_mpic_press")
    private float cgEngMpicPress;

    @Column(value = "cg_eng_mpic_gf_ena")
    private int cgEngMpicGfEna;

    @Column(value = "cg_eng_mpic_gflt1")
    private float cgEngMpicGflt1;

    @Column(value = "cg_eng_mpic_gflt2")
    private float cgEngMpicGflt2;

    @Column(value = "cg_eng_mpic_gflt3")
    private float cgEngMpicGflt3;

    @Column(value = "cg_eng_mpic_gflt4")
    private float cgEngMpicGflt4;

    @Column(value = "cg_eng_mpic_ld_ena")
    private int cgEngMpicLdEna;

    @Column(value = "cg_eng_mpic_ldet1")
    private float cgEngMpicLdet1;

    @Column(value = "cg_eng_mpic_ldet2")
    private float cgEngMpicLdet2;

    @Column(value = "cg_eng_mpic_wsrc")
    private int cgEngMpicWsrc;

    @Column(value = "cg_eng_mpic_irid")
    private int cgEngMpicIrid;

    @Column(value = "cg_eng_mpic_irid_v")
    private float cgEngMpicIridV;

    @Column(value = "cg_eng_mpic_irid_c")
    private float cgEngMpicIridC;

    @Column(value = "cg_eng_mpic_irid_e")
    private int cgEngMpicIridE;

    @Column(value = "cg_eng_mpic_fw_wifi")
    private int cgEngMpicFwWifi;

    @Column(value = "cg_eng_mpic_fw_wifi_v")
    private float cgEngMpicFwWifiV;

    @Column(value = "cg_eng_mpic_fw_wifi_c")
    private float cgEngMpicFwWifiC;

    @Column(value = "cg_eng_mpic_fw_wifi_e")
    private int cgEngMpicFwWifiE;

    @Column(value = "cg_eng_mpic_gps")
    private int cgEngMpicGps;

    @Column(value = "cg_eng_mpic_sbd")
    private int cgEngMpicSbd;

    @Column(value = "cg_eng_mpic_sbd_ce_msg")
    private int cgEngMpicSbdCeMsg;

    @Column(value = "cg_eng_mpic_pps")
    private int cgEngMpicPps;

    @Column(value = "cg_eng_mpic_dcl")
    private long cgEngMpicDcl;

    @Column(value = "cg_eng_mpic_esw")
    private long cgEngMpicEsw;

    @Column(value = "cg_eng_mpic_dsl")
    private long cgEngMpicDsl;

    @Column(value = "cg_eng_mpic_hbeat_enable")
    private int cgEngMpicHbeatEnable;

    @Column(value = "cg_eng_mpic_hbeat_dtime")
    private int cgEngMpicHbeatDtime;

    @Column(value = "cg_eng_mpic_hbeat_threshold")
    private int cgEngMpicHbeatThreshold;

    @Column(value = "cg_eng_mpic_wake_cpm")
    private int cgEngMpicWakeCpm;

    @Column(value = "cg_eng_mpic_wpc")
    private int cgEngMpicWpc;

    @Column(value = "cg_eng_mpic_eflag2")
    private long cgEngMpicEflag2;

    @Column(value = "cg_eng_mpic_last_update")
    private float cgEngMpicLastUpdate;

    @Column(value = "cg_eng_pwrsys_main_v")
    private float cgEngPwrsysMainV;

    @Column(value = "cg_eng_pwrsys_main_c")
    private float cgEngPwrsysMainC;

    @Column(value = "cg_eng_pwrsys_b_chg")
    private float cgEngPwrsysBChg;

    @Column(value = "cg_eng_pwrsys_override")
    private int cgEngPwrsysOverride;

    @Column(value = "cg_eng_pwrsys_eflag1")
    private long cgEngPwrsysEflag1;

    @Column(value = "cg_eng_pwrsys_eflag2")
    private long cgEngPwrsysEflag2;

    @Column(value = "cg_eng_pwrsys_eflag3")
    private long cgEngPwrsysEflag3;

    @Column(value = "cg_eng_pwrsys_b1_0")
    private float cgEngPwrsysB10;

    @Column(value = "cg_eng_pwrsys_b1_1")
    private float cgEngPwrsysB11;

    @Column(value = "cg_eng_pwrsys_b1_2")
    private float cgEngPwrsysB12;

    @Column(value = "cg_eng_pwrsys_b2_0")
    private float cgEngPwrsysB20;

    @Column(value = "cg_eng_pwrsys_b2_1")
    private float cgEngPwrsysB21;

    @Column(value = "cg_eng_pwrsys_b2_2")
    private float cgEngPwrsysB22;

    @Column(value = "cg_eng_pwrsys_b3_0")
    private float cgEngPwrsysB30;

    @Column(value = "cg_eng_pwrsys_b3_1")
    private float cgEngPwrsysB31;

    @Column(value = "cg_eng_pwrsys_b3_2")
    private float cgEngPwrsysB32;

    @Column(value = "cg_eng_pwrsys_b4_0")
    private float cgEngPwrsysB40;

    @Column(value = "cg_eng_pwrsys_b4_1")
    private float cgEngPwrsysB41;

    @Column(value = "cg_eng_pwrsys_b4_2")
    private float cgEngPwrsysB42;

    @Column(value = "cg_eng_pwrsys_pv1_0")
    private float cgEngPwrsysPv10;

    @Column(value = "cg_eng_pwrsys_pv1_1")
    private float cgEngPwrsysPv11;

    @Column(value = "cg_eng_pwrsys_pv1_2")
    private float cgEngPwrsysPv12;

    @Column(value = "cg_eng_pwrsys_pv2_0")
    private float cgEngPwrsysPv20;

    @Column(value = "cg_eng_pwrsys_pv2_1")
    private float cgEngPwrsysPv21;

    @Column(value = "cg_eng_pwrsys_pv2_2")
    private float cgEngPwrsysPv22;

    @Column(value = "cg_eng_pwrsys_pv3_0")
    private float cgEngPwrsysPv30;

    @Column(value = "cg_eng_pwrsys_pv3_1")
    private float cgEngPwrsysPv31;

    @Column(value = "cg_eng_pwrsys_pv3_2")
    private float cgEngPwrsysPv32;

    @Column(value = "cg_eng_pwrsys_pv4_0")
    private float cgEngPwrsysPv40;

    @Column(value = "cg_eng_pwrsys_pv4_1")
    private float cgEngPwrsysPv41;

    @Column(value = "cg_eng_pwrsys_pv4_2")
    private float cgEngPwrsysPv42;

    @Column(value = "cg_eng_pwrsys_wt1_0")
    private float cgEngPwrsysWt10;

    @Column(value = "cg_eng_pwrsys_wt1_1")
    private float cgEngPwrsysWt11;

    @Column(value = "cg_eng_pwrsys_wt1_2")
    private float cgEngPwrsysWt12;

    @Column(value = "cg_eng_pwrsys_wt2_0")
    private float cgEngPwrsysWt20;

    @Column(value = "cg_eng_pwrsys_wt2_1")
    private float cgEngPwrsysWt21;

    @Column(value = "cg_eng_pwrsys_wt2_2")
    private float cgEngPwrsysWt22;

    @Column(value = "cg_eng_pwrsys_fc1_0")
    private float cgEngPwrsysFc10;

    @Column(value = "cg_eng_pwrsys_fc1_1")
    private float cgEngPwrsysFc11;

    @Column(value = "cg_eng_pwrsys_fc1_2")
    private float cgEngPwrsysFc12;

    @Column(value = "cg_eng_pwrsys_fc2_0")
    private float cgEngPwrsysFc20;

    @Column(value = "cg_eng_pwrsys_fc2_1")
    private float cgEngPwrsysFc21;

    @Column(value = "cg_eng_pwrsys_fc2_2")
    private float cgEngPwrsysFc22;

    @Column(value = "cg_eng_pwrsys_temp")
    private float cgEngPwrsysTemp;

    @Column(value = "cg_eng_pwrsys_fc_level")
    private float cgEngPwrsysFcLevel;

    @Column(value = "cg_eng_pwrsys_swg_0")
    private float cgEngPwrsysSwg0;

    @Column(value = "cg_eng_pwrsys_swg_1")
    private float cgEngPwrsysSwg1;

    @Column(value = "cg_eng_pwrsys_swg_2")
    private float cgEngPwrsysSwg2;

    @Column(value = "cg_eng_pwrsys_cvt_0")
    private float cgEngPwrsysCvt0;

    @Column(value = "cg_eng_pwrsys_cvt_1")
    private float cgEngPwrsysCvt1;

    @Column(value = "cg_eng_pwrsys_cvt_2")
    private float cgEngPwrsysCvt2;

    @Column(value = "cg_eng_pwrsys_cvt_3")
    private float cgEngPwrsysCvt3;

    @Column(value = "cg_eng_pwrsys_cvt_4")
    private float cgEngPwrsysCvt4;

    @Column(value = "cg_eng_pwrsys_last_update")
    private double cgEngPwrsysLastUpdate;

    @Column(value = "cg_eng_gps_msg_date")
    private String cgEngGpsMsgDate;

    @Column(value = "cg_eng_gps_msg_time")
    private String cgEngGpsMsgTime;

    @Column(value = "cg_eng_gps_date")
    private long cgEngGpsDate;

    @Column(value = "cg_eng_gps_time")
    private long cgEngGpsTime;

    @Column(value = "cg_eng_gps_latstr")
    private String cgEngGpsLatstr;

    @Column(value = "cg_eng_gps_lonstr")
    private String cgEngGpsLonstr;

    @Column(value = "cg_eng_gps_lat")
    private double cgEngGpsLat;

    @Column(value = "cg_eng_gps_lon")
    private double cgEngGpsLon;

    @Column(value = "cg_eng_gps_spd")
    private float cgEngGpsSpd;

    @Column(value = "cg_eng_gps_cog")
    private float cgEngGpsCog;

    @Column(value = "cg_eng_gps_fix")
    private int cgEngGpsFix;

    @Column(value = "cg_eng_gps_nsat")
    private int cgEngGpsNsat;

    @Column(value = "cg_eng_gps_hdop")
    private float cgEngGpsHdop;

    @Column(value = "cg_eng_gps_alt")
    private float cgEngGpsAlt;

    @Column(value = "cg_eng_gps_last_update")
    private double cgEngGpsLastUpdate;

    @Column(value = "cg_eng_sched_sys")
    private List<String> cgEngSchedSys;

    @Column(value = "cg_eng_sched_sys_dims")
    private int cgEngSchedSysDims;

    @Column(value = "cg_eng_sched_sys_sizes")
    private List<Long> cgEngSchedSysSizes;

    @Column(value = "cg_eng_sched_type")
    private List<String> cgEngSchedType;

    @Column(value = "cg_eng_sched_type_dims")
    private int cgEngSchedTypeDims;

    @Column(value = "cg_eng_sched_type_sizes")
    private List<Long> cgEngSchedTypeSizes;

    @Column(value = "cg_eng_sched_status")
    private List<String> cgEngSchedStatus;

    @Column(value = "cg_eng_sched_status_dims")
    private int cgEngSchedStatusDims;

    @Column(value = "cg_eng_sched_status_sizes")
    private List<Long> cgEngSchedStatusSizes;

    @Column(value = "cg_eng_sched_status_val")
    private List<Integer> cgEngSchedStatusVal;

    @Column(value = "cg_eng_sched_status_val_dims")
    private int cgEngSchedStatusValDims;

    @Column(value = "cg_eng_sched_status_val_sizes")
    private List<Long> cgEngSchedStatusValSizes;

    @Column(value = "cg_eng_sched_num1")
    private List<Integer> cgEngSchedNum1;

    @Column(value = "cg_eng_sched_num1_dims")
    private int cgEngSchedNum1Dims;

    @Column(value = "cg_eng_sched_num1_sizes")
    private List<Long> cgEngSchedNum1Sizes;

    @Column(value = "cg_eng_sched_num2")
    private List<Integer> cgEngSchedNum2;

    @Column(value = "cg_eng_sched_num2_dims")
    private int cgEngSchedNum2Dims;

    @Column(value = "cg_eng_sched_num2_sizes")
    private List<Long> cgEngSchedNum2Sizes;

    @Column(value = "cg_eng_sched_num3")
    private List<Integer> cgEngSchedNum3;

    @Column(value = "cg_eng_sched_num3_dims")
    private int cgEngSchedNum3Dims;

    @Column(value = "cg_eng_sched_num3_sizes")
    private List<Long> cgEngSchedNum3Sizes;

    @Column(value = "cg_eng_sched_num4")
    private List<Integer> cgEngSchedNum4;

    @Column(value = "cg_eng_sched_num4_dims")
    private int cgEngSchedNum4Dims;

    @Column(value = "cg_eng_sched_num4_sizes")
    private List<Long> cgEngSchedNum4Sizes;

    @Column(value = "cg_eng_sched_num5")
    private List<Integer> cgEngSchedNum5;

    @Column(value = "cg_eng_sched_num5_dims")
    private int cgEngSchedNum5Dims;

    @Column(value = "cg_eng_sched_num5_sizes")
    private List<Long> cgEngSchedNum5Sizes;

    @Column(value = "cg_eng_sched_num6")
    private List<Integer> cgEngSchedNum6;

    @Column(value = "cg_eng_sched_num6_dims")
    private int cgEngSchedNum6Dims;

    @Column(value = "cg_eng_sched_num6_sizes")
    private List<Long> cgEngSchedNum6Sizes;

    @Column(value = "cg_eng_sched_num7")
    private List<Integer> cgEngSchedNum7;

    @Column(value = "cg_eng_sched_num7_dims")
    private int cgEngSchedNum7Dims;

    @Column(value = "cg_eng_sched_num7_sizes")
    private List<Long> cgEngSchedNum7Sizes;

    @Column(value = "cg_eng_sched_time")
    private List<String> cgEngSchedTime;

    @Column(value = "cg_eng_sched_time_dims")
    private int cgEngSchedTimeDims;

    @Column(value = "cg_eng_sched_time_sizes")
    private List<Long> cgEngSchedTimeSizes;

    @Column(value = "cg_eng_sched_remaining")
    private List<Integer> cgEngSchedRemaining;

    @Column(value = "cg_eng_sched_remaining_dims")
    private int cgEngSchedRemainingDims;

    @Column(value = "cg_eng_sched_remaining_sizes")
    private List<Long> cgEngSchedRemainingSizes;

    @Column(value = "cg_eng_sched_last_update")
    private float cgEngSchedLastUpdate;

    @Column(value = "cg_eng_ntp_refid")
    private String cgEngNtpRefid;

    @Column(value = "cg_eng_ntp_offset")
    private float cgEngNtpOffset;

    @Column(value = "cg_eng_ntp_jitter")
    private float cgEngNtpJitter;

    @Column(value = "cg_eng_pps_lock")
    private String cgEngPpsLock;

    @Column(value = "cg_eng_pps_delta")
    private int cgEngPpsDelta;

    @Column(value = "cg_eng_pps_deltamin")
    private int cgEngPpsDeltamin;

    @Column(value = "cg_eng_pps_deltamax")
    private int cgEngPpsDeltamax;

    @Column(value = "cg_eng_pps_bad_pulse")
    private int cgEngPpsBadPulse;

    @Column(value = "cg_eng_pps_timestamp")
    private String cgEngPpsTimestamp;

    @Column(value = "cg_eng_pps_last_update")
    private double cgEngPpsLastUpdate;

    @Column(value = "cg_eng_loadshed_status")
    private String cgEngLoadshedStatus;

    @Column(value = "cg_eng_loadshed_last_update")
    private double cgEngLoadshedLastUpdate;

    @Column(value = "cg_eng_sbc_eth0")
    private int cgEngSbcEth0;

    @Column(value = "cg_eng_sbc_eth1")
    private int cgEngSbcEth1;

    @Column(value = "cg_eng_sbc_led0")
    private int cgEngSbcLed0;

    @Column(value = "cg_eng_sbc_led1")
    private int cgEngSbcLed1;

    @Column(value = "cg_eng_sbc_led2")
    private int cgEngSbcLed2;

    @Column(value = "cg_eng_sbc_gpo0")
    private int cgEngSbcGpo0;

    @Column(value = "cg_eng_sbc_gpo1")
    private int cgEngSbcGpo1;

    @Column(value = "cg_eng_sbc_gpo2")
    private int cgEngSbcGpo2;

    @Column(value = "cg_eng_sbc_gpo3")
    private int cgEngSbcGpo3;

    @Column(value = "cg_eng_sbc_gpo4")
    private int cgEngSbcGpo4;

    @Column(value = "cg_eng_sbc_gpio0")
    private int cgEngSbcGpio0;

    @Column(value = "cg_eng_sbc_gpio1")
    private int cgEngSbcGpio1;

    @Column(value = "cg_eng_sbc_gpio2")
    private int cgEngSbcGpio2;

    @Column(value = "cg_eng_sbc_gpio3")
    private int cgEngSbcGpio3;

    @Column(value = "cg_eng_sbc_gpio4")
    private int cgEngSbcGpio4;

    @Column(value = "cg_eng_sbc_gpio5")
    private int cgEngSbcGpio5;

    @Column(value = "cg_eng_sbc_fb1")
    private int cgEngSbcFb1;

    @Column(value = "cg_eng_sbc_fb2")
    private int cgEngSbcFb2;

    @Column(value = "cg_eng_sbc_ce_led")
    private int cgEngSbcCeLed;

    @Column(value = "cg_eng_sbc_wdt")
    private int cgEngSbcWdt;

    @Column(value = "cg_eng_sbc_bid")
    private int cgEngSbcBid;

    @Column(value = "cg_eng_sbc_bstr")
    private int cgEngSbcBstr;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setCgEngPlatformTime((String) particle.get("cg_eng_platform_time"));
        setCgEngPlatformUtime((double) particle.get("cg_eng_platform_utime"));
        setCgEngAlarmSys((List<String>) particle.get("cg_eng_alarm_sys"));
        setCgEngAlarmSysDims((int) particle.get("cg_eng_alarm_sys_dims"));
        setCgEngAlarmSysSizes((List<Long>) particle.get("cg_eng_alarm_sys_sizes"));
        setCgEngAlarmTs((List<String>) particle.get("cg_eng_alarm_ts"));
        setCgEngAlarmTsDims((int) particle.get("cg_eng_alarm_ts_dims"));
        setCgEngAlarmTsSizes((List<Long>) particle.get("cg_eng_alarm_ts_sizes"));
        setCgEngAlarmSeverity((List<String>) particle.get("cg_eng_alarm_severity"));
        setCgEngAlarmSeverityDims((int) particle.get("cg_eng_alarm_severity_dims"));
        setCgEngAlarmSeveritySizes((List<Long>) particle.get("cg_eng_alarm_severity_sizes"));
        setCgEngAlarmAt((List<Integer>) particle.get("cg_eng_alarm_at"));
        setCgEngAlarmAtDims((int) particle.get("cg_eng_alarm_at_dims"));
        setCgEngAlarmAtSizes((List<Long>) particle.get("cg_eng_alarm_at_sizes"));
        setCgEngAlarmPc((List<Integer>) particle.get("cg_eng_alarm_pc"));
        setCgEngAlarmPcDims((int) particle.get("cg_eng_alarm_pc_dims"));
        setCgEngAlarmPcSizes((List<Long>) particle.get("cg_eng_alarm_pc_sizes"));
        setCgEngAlarmErr((List<String>) particle.get("cg_eng_alarm_err"));
        setCgEngAlarmErrDims((int) particle.get("cg_eng_alarm_err_dims"));
        setCgEngAlarmErrSizes((List<Long>) particle.get("cg_eng_alarm_err_sizes"));
        setCgEngMsgCntsCGps((int) particle.get("cg_eng_msg_cnts_c_gps"));
        setCgEngMsgCntsCNtp((int) particle.get("cg_eng_msg_cnts_c_ntp"));
        setCgEngMsgCntsCPps((int) particle.get("cg_eng_msg_cnts_c_pps"));
        setCgEngMsgCntsCPowerSys((int) particle.get("cg_eng_msg_cnts_c_power_sys"));
        setCgEngMsgCntsCSuperv((int) particle.get("cg_eng_msg_cnts_c_superv"));
        setCgEngMsgCntsCTelem((int) particle.get("cg_eng_msg_cnts_c_telem"));
        setCgEngErrCGps((int) particle.get("cg_eng_err_c_gps"));
        setCgEngErrCPps((int) particle.get("cg_eng_err_c_pps"));
        setCgEngErrCCtl((int) particle.get("cg_eng_err_c_ctl"));
        setCgEngErrCStatus((int) particle.get("cg_eng_err_c_status"));
        setCgEngErrSuperv((int) particle.get("cg_eng_err_superv"));
        setCgEngErrCPowerSys((int) particle.get("cg_eng_err_c_power_sys"));
        setCgEngErrCTelemSys((int) particle.get("cg_eng_err_c_telem_sys"));
        setCgEngErrCIrid((int) particle.get("cg_eng_err_c_irid"));
        setCgEngErrCImm((int) particle.get("cg_eng_err_c_imm"));
        setCgEngErrCpm1((int) particle.get("cg_eng_err_cpm1"));
        setCgEngErrDCtl((int) particle.get("cg_eng_err_d_ctl"));
        setCgEngErrDStatus((int) particle.get("cg_eng_err_d_status"));
        setCgEngErrDlogMgr((int) particle.get("cg_eng_err_dlog_mgr"));
        setCgEngErrDlogp1((int) particle.get("cg_eng_err_dlogp1"));
        setCgEngErrDlogp2((int) particle.get("cg_eng_err_dlogp2"));
        setCgEngErrDlogp3((int) particle.get("cg_eng_err_dlogp3"));
        setCgEngErrDlogp4((int) particle.get("cg_eng_err_dlogp4"));
        setCgEngErrDlogp5((int) particle.get("cg_eng_err_dlogp5"));
        setCgEngErrDlogp6((int) particle.get("cg_eng_err_dlogp6"));
        setCgEngErrDlogp7((int) particle.get("cg_eng_err_dlogp7"));
        setCgEngErrDlogp8((int) particle.get("cg_eng_err_dlogp8"));
        setCgEngErrRcmd((int) particle.get("cg_eng_err_rcmd"));
        setCgEngErrBcmd((int) particle.get("cg_eng_err_bcmd"));
        setCgEngErrmsgCGps((String) particle.get("cg_eng_errmsg_c_gps"));
        setCgEngErrmsgCPps((String) particle.get("cg_eng_errmsg_c_pps"));
        setCgEngErrmsgCCtl((String) particle.get("cg_eng_errmsg_c_ctl"));
        setCgEngErrmsgCStatus((String) particle.get("cg_eng_errmsg_c_status"));
        setCgEngErrmsgSuperv((String) particle.get("cg_eng_errmsg_superv"));
        setCgEngErrmsgCPowerSys((String) particle.get("cg_eng_errmsg_c_power_sys"));
        setCgEngErrmsgCTelemSys((String) particle.get("cg_eng_errmsg_c_telem_sys"));
        setCgEngErrmsgCIrid((String) particle.get("cg_eng_errmsg_c_irid"));
        setCgEngErrmsgCImm((String) particle.get("cg_eng_errmsg_c_imm"));
        setCgEngErrmsgCpm1((String) particle.get("cg_eng_errmsg_cpm1"));
        setCgEngErrmsgDCtl((String) particle.get("cg_eng_errmsg_d_ctl"));
        setCgEngErrmsgDStatus((String) particle.get("cg_eng_errmsg_d_status"));
        setCgEngErrmsgDlogMgr((String) particle.get("cg_eng_errmsg_dlog_mgr"));
        setCgEngErrmsgDlogp1((String) particle.get("cg_eng_errmsg_dlogp1"));
        setCgEngErrmsgDlogp2((String) particle.get("cg_eng_errmsg_dlogp2"));
        setCgEngErrmsgDlogp3((String) particle.get("cg_eng_errmsg_dlogp3"));
        setCgEngErrmsgDlogp4((String) particle.get("cg_eng_errmsg_dlogp4"));
        setCgEngErrmsgDlogp5((String) particle.get("cg_eng_errmsg_dlogp5"));
        setCgEngErrmsgDlogp6((String) particle.get("cg_eng_errmsg_dlogp6"));
        setCgEngErrmsgDlogp7((String) particle.get("cg_eng_errmsg_dlogp7"));
        setCgEngErrmsgDlogp8((String) particle.get("cg_eng_errmsg_dlogp8"));
        setCgEngErrmsgRcmd((String) particle.get("cg_eng_errmsg_rcmd"));
        setCgEngErrmsgBcmd((String) particle.get("cg_eng_errmsg_bcmd"));
        setCgEngCpuUptime((String) particle.get("cg_eng_cpu_uptime"));
        setCgEngCpuLoad1((float) particle.get("cg_eng_cpu_load1"));
        setCgEngCpuLoad5((float) particle.get("cg_eng_cpu_load5"));
        setCgEngCpuLoad15((float) particle.get("cg_eng_cpu_load15"));
        setCgEngMemoryRam((long) particle.get("cg_eng_memory_ram"));
        setCgEngMemoryFree((long) particle.get("cg_eng_memory_free"));
        setCgEngNproc((int) particle.get("cg_eng_nproc"));
        setCgEngMpicEflag((long) particle.get("cg_eng_mpic_eflag"));
        setCgEngMpicMainV((float) particle.get("cg_eng_mpic_main_v"));
        setCgEngMpicMainC((float) particle.get("cg_eng_mpic_main_c"));
        setCgEngMpicBatV((float) particle.get("cg_eng_mpic_bat_v"));
        setCgEngMpicBatC((float) particle.get("cg_eng_mpic_bat_c"));
        setCgEngMpicTemp1((float) particle.get("cg_eng_mpic_temp1"));
        setCgEngMpicTemp2((float) particle.get("cg_eng_mpic_temp2"));
        setCgEngMpicHumid((float) particle.get("cg_eng_mpic_humid"));
        setCgEngMpicPress((float) particle.get("cg_eng_mpic_press"));
        setCgEngMpicGfEna((int) particle.get("cg_eng_mpic_gf_ena"));
        setCgEngMpicGflt1((float) particle.get("cg_eng_mpic_gflt1"));
        setCgEngMpicGflt2((float) particle.get("cg_eng_mpic_gflt2"));
        setCgEngMpicGflt3((float) particle.get("cg_eng_mpic_gflt3"));
        setCgEngMpicGflt4((float) particle.get("cg_eng_mpic_gflt4"));
        setCgEngMpicLdEna((int) particle.get("cg_eng_mpic_ld_ena"));
        setCgEngMpicLdet1((float) particle.get("cg_eng_mpic_ldet1"));
        setCgEngMpicLdet2((float) particle.get("cg_eng_mpic_ldet2"));
        setCgEngMpicWsrc((int) particle.get("cg_eng_mpic_wsrc"));
        setCgEngMpicIrid((int) particle.get("cg_eng_mpic_irid"));
        setCgEngMpicIridV((float) particle.get("cg_eng_mpic_irid_v"));
        setCgEngMpicIridC((float) particle.get("cg_eng_mpic_irid_c"));
        setCgEngMpicIridE((int) particle.get("cg_eng_mpic_irid_e"));
        setCgEngMpicFwWifi((int) particle.get("cg_eng_mpic_fw_wifi"));
        setCgEngMpicFwWifiV((float) particle.get("cg_eng_mpic_fw_wifi_v"));
        setCgEngMpicFwWifiC((float) particle.get("cg_eng_mpic_fw_wifi_c"));
        setCgEngMpicFwWifiE((int) particle.get("cg_eng_mpic_fw_wifi_e"));
        setCgEngMpicGps((int) particle.get("cg_eng_mpic_gps"));
        setCgEngMpicSbd((int) particle.get("cg_eng_mpic_sbd"));
        setCgEngMpicSbdCeMsg((int) particle.get("cg_eng_mpic_sbd_ce_msg"));
        setCgEngMpicPps((int) particle.get("cg_eng_mpic_pps"));
        setCgEngMpicDcl((long) particle.get("cg_eng_mpic_dcl"));
        setCgEngMpicEsw((long) particle.get("cg_eng_mpic_esw"));
        setCgEngMpicDsl((long) particle.get("cg_eng_mpic_dsl"));
        setCgEngMpicHbeatEnable((int) particle.get("cg_eng_mpic_hbeat_enable"));
        setCgEngMpicHbeatDtime((int) particle.get("cg_eng_mpic_hbeat_dtime"));
        setCgEngMpicHbeatThreshold((int) particle.get("cg_eng_mpic_hbeat_threshold"));
        setCgEngMpicWakeCpm((int) particle.get("cg_eng_mpic_wake_cpm"));
        setCgEngMpicWpc((int) particle.get("cg_eng_mpic_wpc"));
        setCgEngMpicEflag2((long) particle.get("cg_eng_mpic_eflag2"));
        setCgEngMpicLastUpdate((float) particle.get("cg_eng_mpic_last_update"));
        setCgEngPwrsysMainV((float) particle.get("cg_eng_pwrsys_main_v"));
        setCgEngPwrsysMainC((float) particle.get("cg_eng_pwrsys_main_c"));
        setCgEngPwrsysBChg((float) particle.get("cg_eng_pwrsys_b_chg"));
        setCgEngPwrsysOverride((int) particle.get("cg_eng_pwrsys_override"));
        setCgEngPwrsysEflag1((long) particle.get("cg_eng_pwrsys_eflag1"));
        setCgEngPwrsysEflag2((long) particle.get("cg_eng_pwrsys_eflag2"));
        setCgEngPwrsysEflag3((long) particle.get("cg_eng_pwrsys_eflag3"));
        setCgEngPwrsysB10((float) particle.get("cg_eng_pwrsys_b1_0"));
        setCgEngPwrsysB11((float) particle.get("cg_eng_pwrsys_b1_1"));
        setCgEngPwrsysB12((float) particle.get("cg_eng_pwrsys_b1_2"));
        setCgEngPwrsysB20((float) particle.get("cg_eng_pwrsys_b2_0"));
        setCgEngPwrsysB21((float) particle.get("cg_eng_pwrsys_b2_1"));
        setCgEngPwrsysB22((float) particle.get("cg_eng_pwrsys_b2_2"));
        setCgEngPwrsysB30((float) particle.get("cg_eng_pwrsys_b3_0"));
        setCgEngPwrsysB31((float) particle.get("cg_eng_pwrsys_b3_1"));
        setCgEngPwrsysB32((float) particle.get("cg_eng_pwrsys_b3_2"));
        setCgEngPwrsysB40((float) particle.get("cg_eng_pwrsys_b4_0"));
        setCgEngPwrsysB41((float) particle.get("cg_eng_pwrsys_b4_1"));
        setCgEngPwrsysB42((float) particle.get("cg_eng_pwrsys_b4_2"));
        setCgEngPwrsysPv10((float) particle.get("cg_eng_pwrsys_pv1_0"));
        setCgEngPwrsysPv11((float) particle.get("cg_eng_pwrsys_pv1_1"));
        setCgEngPwrsysPv12((float) particle.get("cg_eng_pwrsys_pv1_2"));
        setCgEngPwrsysPv20((float) particle.get("cg_eng_pwrsys_pv2_0"));
        setCgEngPwrsysPv21((float) particle.get("cg_eng_pwrsys_pv2_1"));
        setCgEngPwrsysPv22((float) particle.get("cg_eng_pwrsys_pv2_2"));
        setCgEngPwrsysPv30((float) particle.get("cg_eng_pwrsys_pv3_0"));
        setCgEngPwrsysPv31((float) particle.get("cg_eng_pwrsys_pv3_1"));
        setCgEngPwrsysPv32((float) particle.get("cg_eng_pwrsys_pv3_2"));
        setCgEngPwrsysPv40((float) particle.get("cg_eng_pwrsys_pv4_0"));
        setCgEngPwrsysPv41((float) particle.get("cg_eng_pwrsys_pv4_1"));
        setCgEngPwrsysPv42((float) particle.get("cg_eng_pwrsys_pv4_2"));
        setCgEngPwrsysWt10((float) particle.get("cg_eng_pwrsys_wt1_0"));
        setCgEngPwrsysWt11((float) particle.get("cg_eng_pwrsys_wt1_1"));
        setCgEngPwrsysWt12((float) particle.get("cg_eng_pwrsys_wt1_2"));
        setCgEngPwrsysWt20((float) particle.get("cg_eng_pwrsys_wt2_0"));
        setCgEngPwrsysWt21((float) particle.get("cg_eng_pwrsys_wt2_1"));
        setCgEngPwrsysWt22((float) particle.get("cg_eng_pwrsys_wt2_2"));
        setCgEngPwrsysFc10((float) particle.get("cg_eng_pwrsys_fc1_0"));
        setCgEngPwrsysFc11((float) particle.get("cg_eng_pwrsys_fc1_1"));
        setCgEngPwrsysFc12((float) particle.get("cg_eng_pwrsys_fc1_2"));
        setCgEngPwrsysFc20((float) particle.get("cg_eng_pwrsys_fc2_0"));
        setCgEngPwrsysFc21((float) particle.get("cg_eng_pwrsys_fc2_1"));
        setCgEngPwrsysFc22((float) particle.get("cg_eng_pwrsys_fc2_2"));
        setCgEngPwrsysTemp((float) particle.get("cg_eng_pwrsys_temp"));
        setCgEngPwrsysFcLevel((float) particle.get("cg_eng_pwrsys_fc_level"));
        setCgEngPwrsysSwg0((float) particle.get("cg_eng_pwrsys_swg_0"));
        setCgEngPwrsysSwg1((float) particle.get("cg_eng_pwrsys_swg_1"));
        setCgEngPwrsysSwg2((float) particle.get("cg_eng_pwrsys_swg_2"));
        setCgEngPwrsysCvt0((float) particle.get("cg_eng_pwrsys_cvt_0"));
        setCgEngPwrsysCvt1((float) particle.get("cg_eng_pwrsys_cvt_1"));
        setCgEngPwrsysCvt2((float) particle.get("cg_eng_pwrsys_cvt_2"));
        setCgEngPwrsysCvt3((float) particle.get("cg_eng_pwrsys_cvt_3"));
        setCgEngPwrsysCvt4((float) particle.get("cg_eng_pwrsys_cvt_4"));
        setCgEngPwrsysLastUpdate((double) particle.get("cg_eng_pwrsys_last_update"));
        setCgEngGpsMsgDate((String) particle.get("cg_eng_gps_msg_date"));
        setCgEngGpsMsgTime((String) particle.get("cg_eng_gps_msg_time"));
        setCgEngGpsDate((long) particle.get("cg_eng_gps_date"));
        setCgEngGpsTime((long) particle.get("cg_eng_gps_time"));
        setCgEngGpsLatstr((String) particle.get("cg_eng_gps_latstr"));
        setCgEngGpsLonstr((String) particle.get("cg_eng_gps_lonstr"));
        setCgEngGpsLat((double) particle.get("cg_eng_gps_lat"));
        setCgEngGpsLon((double) particle.get("cg_eng_gps_lon"));
        setCgEngGpsSpd((float) particle.get("cg_eng_gps_spd"));
        setCgEngGpsCog((float) particle.get("cg_eng_gps_cog"));
        setCgEngGpsFix((int) particle.get("cg_eng_gps_fix"));
        setCgEngGpsNsat((int) particle.get("cg_eng_gps_nsat"));
        setCgEngGpsHdop((float) particle.get("cg_eng_gps_hdop"));
        setCgEngGpsAlt((float) particle.get("cg_eng_gps_alt"));
        setCgEngGpsLastUpdate((double) particle.get("cg_eng_gps_last_update"));
        setCgEngSchedSys((List<String>) particle.get("cg_eng_sched_sys"));
        setCgEngSchedSysDims((int) particle.get("cg_eng_sched_sys_dims"));
        setCgEngSchedSysSizes((List<Long>) particle.get("cg_eng_sched_sys_sizes"));
        setCgEngSchedType((List<String>) particle.get("cg_eng_sched_type"));
        setCgEngSchedTypeDims((int) particle.get("cg_eng_sched_type_dims"));
        setCgEngSchedTypeSizes((List<Long>) particle.get("cg_eng_sched_type_sizes"));
        setCgEngSchedStatus((List<String>) particle.get("cg_eng_sched_status"));
        setCgEngSchedStatusDims((int) particle.get("cg_eng_sched_status_dims"));
        setCgEngSchedStatusSizes((List<Long>) particle.get("cg_eng_sched_status_sizes"));
        setCgEngSchedStatusVal((List<Integer>) particle.get("cg_eng_sched_status_val"));
        setCgEngSchedStatusValDims((int) particle.get("cg_eng_sched_status_val_dims"));
        setCgEngSchedStatusValSizes((List<Long>) particle.get("cg_eng_sched_status_val_sizes"));
        setCgEngSchedNum1((List<Integer>) particle.get("cg_eng_sched_num1"));
        setCgEngSchedNum1Dims((int) particle.get("cg_eng_sched_num1_dims"));
        setCgEngSchedNum1Sizes((List<Long>) particle.get("cg_eng_sched_num1_sizes"));
        setCgEngSchedNum2((List<Integer>) particle.get("cg_eng_sched_num2"));
        setCgEngSchedNum2Dims((int) particle.get("cg_eng_sched_num2_dims"));
        setCgEngSchedNum2Sizes((List<Long>) particle.get("cg_eng_sched_num2_sizes"));
        setCgEngSchedNum3((List<Integer>) particle.get("cg_eng_sched_num3"));
        setCgEngSchedNum3Dims((int) particle.get("cg_eng_sched_num3_dims"));
        setCgEngSchedNum3Sizes((List<Long>) particle.get("cg_eng_sched_num3_sizes"));
        setCgEngSchedNum4((List<Integer>) particle.get("cg_eng_sched_num4"));
        setCgEngSchedNum4Dims((int) particle.get("cg_eng_sched_num4_dims"));
        setCgEngSchedNum4Sizes((List<Long>) particle.get("cg_eng_sched_num4_sizes"));
        setCgEngSchedNum5((List<Integer>) particle.get("cg_eng_sched_num5"));
        setCgEngSchedNum5Dims((int) particle.get("cg_eng_sched_num5_dims"));
        setCgEngSchedNum5Sizes((List<Long>) particle.get("cg_eng_sched_num5_sizes"));
        setCgEngSchedNum6((List<Integer>) particle.get("cg_eng_sched_num6"));
        setCgEngSchedNum6Dims((int) particle.get("cg_eng_sched_num6_dims"));
        setCgEngSchedNum6Sizes((List<Long>) particle.get("cg_eng_sched_num6_sizes"));
        setCgEngSchedNum7((List<Integer>) particle.get("cg_eng_sched_num7"));
        setCgEngSchedNum7Dims((int) particle.get("cg_eng_sched_num7_dims"));
        setCgEngSchedNum7Sizes((List<Long>) particle.get("cg_eng_sched_num7_sizes"));
        setCgEngSchedTime((List<String>) particle.get("cg_eng_sched_time"));
        setCgEngSchedTimeDims((int) particle.get("cg_eng_sched_time_dims"));
        setCgEngSchedTimeSizes((List<Long>) particle.get("cg_eng_sched_time_sizes"));
        setCgEngSchedRemaining((List<Integer>) particle.get("cg_eng_sched_remaining"));
        setCgEngSchedRemainingDims((int) particle.get("cg_eng_sched_remaining_dims"));
        setCgEngSchedRemainingSizes((List<Long>) particle.get("cg_eng_sched_remaining_sizes"));
        setCgEngSchedLastUpdate((float) particle.get("cg_eng_sched_last_update"));
        setCgEngNtpRefid((String) particle.get("cg_eng_ntp_refid"));
        setCgEngNtpOffset((float) particle.get("cg_eng_ntp_offset"));
        setCgEngNtpJitter((float) particle.get("cg_eng_ntp_jitter"));
        setCgEngPpsLock((String) particle.get("cg_eng_pps_lock"));
        setCgEngPpsDelta((int) particle.get("cg_eng_pps_delta"));
        setCgEngPpsDeltamin((int) particle.get("cg_eng_pps_deltamin"));
        setCgEngPpsDeltamax((int) particle.get("cg_eng_pps_deltamax"));
        setCgEngPpsBadPulse((int) particle.get("cg_eng_pps_bad_pulse"));
        setCgEngPpsTimestamp((String) particle.get("cg_eng_pps_timestamp"));
        setCgEngPpsLastUpdate((double) particle.get("cg_eng_pps_last_update"));
        setCgEngLoadshedStatus((String) particle.get("cg_eng_loadshed_status"));
        setCgEngLoadshedLastUpdate((double) particle.get("cg_eng_loadshed_last_update"));
        setCgEngSbcEth0((int) particle.get("cg_eng_sbc_eth0"));
        setCgEngSbcEth1((int) particle.get("cg_eng_sbc_eth1"));
        setCgEngSbcLed0((int) particle.get("cg_eng_sbc_led0"));
        setCgEngSbcLed1((int) particle.get("cg_eng_sbc_led1"));
        setCgEngSbcLed2((int) particle.get("cg_eng_sbc_led2"));
        setCgEngSbcGpo0((int) particle.get("cg_eng_sbc_gpo0"));
        setCgEngSbcGpo1((int) particle.get("cg_eng_sbc_gpo1"));
        setCgEngSbcGpo2((int) particle.get("cg_eng_sbc_gpo2"));
        setCgEngSbcGpo3((int) particle.get("cg_eng_sbc_gpo3"));
        setCgEngSbcGpo4((int) particle.get("cg_eng_sbc_gpo4"));
        setCgEngSbcGpio0((int) particle.get("cg_eng_sbc_gpio0"));
        setCgEngSbcGpio1((int) particle.get("cg_eng_sbc_gpio1"));
        setCgEngSbcGpio2((int) particle.get("cg_eng_sbc_gpio2"));
        setCgEngSbcGpio3((int) particle.get("cg_eng_sbc_gpio3"));
        setCgEngSbcGpio4((int) particle.get("cg_eng_sbc_gpio4"));
        setCgEngSbcGpio5((int) particle.get("cg_eng_sbc_gpio5"));
        setCgEngSbcFb1((int) particle.get("cg_eng_sbc_fb1"));
        setCgEngSbcFb2((int) particle.get("cg_eng_sbc_fb2"));
        setCgEngSbcCeLed((int) particle.get("cg_eng_sbc_ce_led"));
        setCgEngSbcWdt((int) particle.get("cg_eng_sbc_wdt"));
        setCgEngSbcBid((int) particle.get("cg_eng_sbc_bid"));
        setCgEngSbcBstr((int) particle.get("cg_eng_sbc_bstr"));
    }

    public String getCgEngPlatformTime() {
        return cgEngPlatformTime;
    }

    public void setCgEngPlatformTime(String cgEngPlatformTime) {
        this.cgEngPlatformTime = cgEngPlatformTime;
    }
    public double getCgEngPlatformUtime() {
        return cgEngPlatformUtime;
    }

    public void setCgEngPlatformUtime(double cgEngPlatformUtime) {
        this.cgEngPlatformUtime = cgEngPlatformUtime;
    }
    public List<String> getCgEngAlarmSys() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngAlarmSys;
    }

    public void setCgEngAlarmSys(List<String> cgEngAlarmSys) {
        // TODO - flatten for storage, insert fill values
        this.cgEngAlarmSys = cgEngAlarmSys;
    }
    public int getCgEngAlarmSysDims() {
        return cgEngAlarmSysDims;
    }

    public void setCgEngAlarmSysDims(int cgEngAlarmSysDims) {
        this.cgEngAlarmSysDims = cgEngAlarmSysDims;
    }
    public List<Long> getCgEngAlarmSysSizes() {
        return cgEngAlarmSysSizes;
    }

    public void setCgEngAlarmSysSizes(List<Long> cgEngAlarmSysSizes) {
        this.cgEngAlarmSysSizes = cgEngAlarmSysSizes;
    }
    public List<String> getCgEngAlarmTs() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngAlarmTs;
    }

    public void setCgEngAlarmTs(List<String> cgEngAlarmTs) {
        // TODO - flatten for storage, insert fill values
        this.cgEngAlarmTs = cgEngAlarmTs;
    }
    public int getCgEngAlarmTsDims() {
        return cgEngAlarmTsDims;
    }

    public void setCgEngAlarmTsDims(int cgEngAlarmTsDims) {
        this.cgEngAlarmTsDims = cgEngAlarmTsDims;
    }
    public List<Long> getCgEngAlarmTsSizes() {
        return cgEngAlarmTsSizes;
    }

    public void setCgEngAlarmTsSizes(List<Long> cgEngAlarmTsSizes) {
        this.cgEngAlarmTsSizes = cgEngAlarmTsSizes;
    }
    public List<String> getCgEngAlarmSeverity() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngAlarmSeverity;
    }

    public void setCgEngAlarmSeverity(List<String> cgEngAlarmSeverity) {
        // TODO - flatten for storage, insert fill values
        this.cgEngAlarmSeverity = cgEngAlarmSeverity;
    }
    public int getCgEngAlarmSeverityDims() {
        return cgEngAlarmSeverityDims;
    }

    public void setCgEngAlarmSeverityDims(int cgEngAlarmSeverityDims) {
        this.cgEngAlarmSeverityDims = cgEngAlarmSeverityDims;
    }
    public List<Long> getCgEngAlarmSeveritySizes() {
        return cgEngAlarmSeveritySizes;
    }

    public void setCgEngAlarmSeveritySizes(List<Long> cgEngAlarmSeveritySizes) {
        this.cgEngAlarmSeveritySizes = cgEngAlarmSeveritySizes;
    }
    public List<Integer> getCgEngAlarmAt() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngAlarmAt;
    }

    public void setCgEngAlarmAt(List<Integer> cgEngAlarmAt) {
        // TODO - flatten for storage, insert fill values
        this.cgEngAlarmAt = cgEngAlarmAt;
    }
    public int getCgEngAlarmAtDims() {
        return cgEngAlarmAtDims;
    }

    public void setCgEngAlarmAtDims(int cgEngAlarmAtDims) {
        this.cgEngAlarmAtDims = cgEngAlarmAtDims;
    }
    public List<Long> getCgEngAlarmAtSizes() {
        return cgEngAlarmAtSizes;
    }

    public void setCgEngAlarmAtSizes(List<Long> cgEngAlarmAtSizes) {
        this.cgEngAlarmAtSizes = cgEngAlarmAtSizes;
    }
    public List<Integer> getCgEngAlarmPc() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngAlarmPc;
    }

    public void setCgEngAlarmPc(List<Integer> cgEngAlarmPc) {
        // TODO - flatten for storage, insert fill values
        this.cgEngAlarmPc = cgEngAlarmPc;
    }
    public int getCgEngAlarmPcDims() {
        return cgEngAlarmPcDims;
    }

    public void setCgEngAlarmPcDims(int cgEngAlarmPcDims) {
        this.cgEngAlarmPcDims = cgEngAlarmPcDims;
    }
    public List<Long> getCgEngAlarmPcSizes() {
        return cgEngAlarmPcSizes;
    }

    public void setCgEngAlarmPcSizes(List<Long> cgEngAlarmPcSizes) {
        this.cgEngAlarmPcSizes = cgEngAlarmPcSizes;
    }
    public List<String> getCgEngAlarmErr() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngAlarmErr;
    }

    public void setCgEngAlarmErr(List<String> cgEngAlarmErr) {
        // TODO - flatten for storage, insert fill values
        this.cgEngAlarmErr = cgEngAlarmErr;
    }
    public int getCgEngAlarmErrDims() {
        return cgEngAlarmErrDims;
    }

    public void setCgEngAlarmErrDims(int cgEngAlarmErrDims) {
        this.cgEngAlarmErrDims = cgEngAlarmErrDims;
    }
    public List<Long> getCgEngAlarmErrSizes() {
        return cgEngAlarmErrSizes;
    }

    public void setCgEngAlarmErrSizes(List<Long> cgEngAlarmErrSizes) {
        this.cgEngAlarmErrSizes = cgEngAlarmErrSizes;
    }
    public int getCgEngMsgCntsCGps() {
        return cgEngMsgCntsCGps;
    }

    public void setCgEngMsgCntsCGps(int cgEngMsgCntsCGps) {
        this.cgEngMsgCntsCGps = cgEngMsgCntsCGps;
    }
    public int getCgEngMsgCntsCNtp() {
        return cgEngMsgCntsCNtp;
    }

    public void setCgEngMsgCntsCNtp(int cgEngMsgCntsCNtp) {
        this.cgEngMsgCntsCNtp = cgEngMsgCntsCNtp;
    }
    public int getCgEngMsgCntsCPps() {
        return cgEngMsgCntsCPps;
    }

    public void setCgEngMsgCntsCPps(int cgEngMsgCntsCPps) {
        this.cgEngMsgCntsCPps = cgEngMsgCntsCPps;
    }
    public int getCgEngMsgCntsCPowerSys() {
        return cgEngMsgCntsCPowerSys;
    }

    public void setCgEngMsgCntsCPowerSys(int cgEngMsgCntsCPowerSys) {
        this.cgEngMsgCntsCPowerSys = cgEngMsgCntsCPowerSys;
    }
    public int getCgEngMsgCntsCSuperv() {
        return cgEngMsgCntsCSuperv;
    }

    public void setCgEngMsgCntsCSuperv(int cgEngMsgCntsCSuperv) {
        this.cgEngMsgCntsCSuperv = cgEngMsgCntsCSuperv;
    }
    public int getCgEngMsgCntsCTelem() {
        return cgEngMsgCntsCTelem;
    }

    public void setCgEngMsgCntsCTelem(int cgEngMsgCntsCTelem) {
        this.cgEngMsgCntsCTelem = cgEngMsgCntsCTelem;
    }
    public int getCgEngErrCGps() {
        return cgEngErrCGps;
    }

    public void setCgEngErrCGps(int cgEngErrCGps) {
        this.cgEngErrCGps = cgEngErrCGps;
    }
    public int getCgEngErrCPps() {
        return cgEngErrCPps;
    }

    public void setCgEngErrCPps(int cgEngErrCPps) {
        this.cgEngErrCPps = cgEngErrCPps;
    }
    public int getCgEngErrCCtl() {
        return cgEngErrCCtl;
    }

    public void setCgEngErrCCtl(int cgEngErrCCtl) {
        this.cgEngErrCCtl = cgEngErrCCtl;
    }
    public int getCgEngErrCStatus() {
        return cgEngErrCStatus;
    }

    public void setCgEngErrCStatus(int cgEngErrCStatus) {
        this.cgEngErrCStatus = cgEngErrCStatus;
    }
    public int getCgEngErrSuperv() {
        return cgEngErrSuperv;
    }

    public void setCgEngErrSuperv(int cgEngErrSuperv) {
        this.cgEngErrSuperv = cgEngErrSuperv;
    }
    public int getCgEngErrCPowerSys() {
        return cgEngErrCPowerSys;
    }

    public void setCgEngErrCPowerSys(int cgEngErrCPowerSys) {
        this.cgEngErrCPowerSys = cgEngErrCPowerSys;
    }
    public int getCgEngErrCTelemSys() {
        return cgEngErrCTelemSys;
    }

    public void setCgEngErrCTelemSys(int cgEngErrCTelemSys) {
        this.cgEngErrCTelemSys = cgEngErrCTelemSys;
    }
    public int getCgEngErrCIrid() {
        return cgEngErrCIrid;
    }

    public void setCgEngErrCIrid(int cgEngErrCIrid) {
        this.cgEngErrCIrid = cgEngErrCIrid;
    }
    public int getCgEngErrCImm() {
        return cgEngErrCImm;
    }

    public void setCgEngErrCImm(int cgEngErrCImm) {
        this.cgEngErrCImm = cgEngErrCImm;
    }
    public int getCgEngErrCpm1() {
        return cgEngErrCpm1;
    }

    public void setCgEngErrCpm1(int cgEngErrCpm1) {
        this.cgEngErrCpm1 = cgEngErrCpm1;
    }
    public int getCgEngErrDCtl() {
        return cgEngErrDCtl;
    }

    public void setCgEngErrDCtl(int cgEngErrDCtl) {
        this.cgEngErrDCtl = cgEngErrDCtl;
    }
    public int getCgEngErrDStatus() {
        return cgEngErrDStatus;
    }

    public void setCgEngErrDStatus(int cgEngErrDStatus) {
        this.cgEngErrDStatus = cgEngErrDStatus;
    }
    public int getCgEngErrDlogMgr() {
        return cgEngErrDlogMgr;
    }

    public void setCgEngErrDlogMgr(int cgEngErrDlogMgr) {
        this.cgEngErrDlogMgr = cgEngErrDlogMgr;
    }
    public int getCgEngErrDlogp1() {
        return cgEngErrDlogp1;
    }

    public void setCgEngErrDlogp1(int cgEngErrDlogp1) {
        this.cgEngErrDlogp1 = cgEngErrDlogp1;
    }
    public int getCgEngErrDlogp2() {
        return cgEngErrDlogp2;
    }

    public void setCgEngErrDlogp2(int cgEngErrDlogp2) {
        this.cgEngErrDlogp2 = cgEngErrDlogp2;
    }
    public int getCgEngErrDlogp3() {
        return cgEngErrDlogp3;
    }

    public void setCgEngErrDlogp3(int cgEngErrDlogp3) {
        this.cgEngErrDlogp3 = cgEngErrDlogp3;
    }
    public int getCgEngErrDlogp4() {
        return cgEngErrDlogp4;
    }

    public void setCgEngErrDlogp4(int cgEngErrDlogp4) {
        this.cgEngErrDlogp4 = cgEngErrDlogp4;
    }
    public int getCgEngErrDlogp5() {
        return cgEngErrDlogp5;
    }

    public void setCgEngErrDlogp5(int cgEngErrDlogp5) {
        this.cgEngErrDlogp5 = cgEngErrDlogp5;
    }
    public int getCgEngErrDlogp6() {
        return cgEngErrDlogp6;
    }

    public void setCgEngErrDlogp6(int cgEngErrDlogp6) {
        this.cgEngErrDlogp6 = cgEngErrDlogp6;
    }
    public int getCgEngErrDlogp7() {
        return cgEngErrDlogp7;
    }

    public void setCgEngErrDlogp7(int cgEngErrDlogp7) {
        this.cgEngErrDlogp7 = cgEngErrDlogp7;
    }
    public int getCgEngErrDlogp8() {
        return cgEngErrDlogp8;
    }

    public void setCgEngErrDlogp8(int cgEngErrDlogp8) {
        this.cgEngErrDlogp8 = cgEngErrDlogp8;
    }
    public int getCgEngErrRcmd() {
        return cgEngErrRcmd;
    }

    public void setCgEngErrRcmd(int cgEngErrRcmd) {
        this.cgEngErrRcmd = cgEngErrRcmd;
    }
    public int getCgEngErrBcmd() {
        return cgEngErrBcmd;
    }

    public void setCgEngErrBcmd(int cgEngErrBcmd) {
        this.cgEngErrBcmd = cgEngErrBcmd;
    }
    public String getCgEngErrmsgCGps() {
        return cgEngErrmsgCGps;
    }

    public void setCgEngErrmsgCGps(String cgEngErrmsgCGps) {
        this.cgEngErrmsgCGps = cgEngErrmsgCGps;
    }
    public String getCgEngErrmsgCPps() {
        return cgEngErrmsgCPps;
    }

    public void setCgEngErrmsgCPps(String cgEngErrmsgCPps) {
        this.cgEngErrmsgCPps = cgEngErrmsgCPps;
    }
    public String getCgEngErrmsgCCtl() {
        return cgEngErrmsgCCtl;
    }

    public void setCgEngErrmsgCCtl(String cgEngErrmsgCCtl) {
        this.cgEngErrmsgCCtl = cgEngErrmsgCCtl;
    }
    public String getCgEngErrmsgCStatus() {
        return cgEngErrmsgCStatus;
    }

    public void setCgEngErrmsgCStatus(String cgEngErrmsgCStatus) {
        this.cgEngErrmsgCStatus = cgEngErrmsgCStatus;
    }
    public String getCgEngErrmsgSuperv() {
        return cgEngErrmsgSuperv;
    }

    public void setCgEngErrmsgSuperv(String cgEngErrmsgSuperv) {
        this.cgEngErrmsgSuperv = cgEngErrmsgSuperv;
    }
    public String getCgEngErrmsgCPowerSys() {
        return cgEngErrmsgCPowerSys;
    }

    public void setCgEngErrmsgCPowerSys(String cgEngErrmsgCPowerSys) {
        this.cgEngErrmsgCPowerSys = cgEngErrmsgCPowerSys;
    }
    public String getCgEngErrmsgCTelemSys() {
        return cgEngErrmsgCTelemSys;
    }

    public void setCgEngErrmsgCTelemSys(String cgEngErrmsgCTelemSys) {
        this.cgEngErrmsgCTelemSys = cgEngErrmsgCTelemSys;
    }
    public String getCgEngErrmsgCIrid() {
        return cgEngErrmsgCIrid;
    }

    public void setCgEngErrmsgCIrid(String cgEngErrmsgCIrid) {
        this.cgEngErrmsgCIrid = cgEngErrmsgCIrid;
    }
    public String getCgEngErrmsgCImm() {
        return cgEngErrmsgCImm;
    }

    public void setCgEngErrmsgCImm(String cgEngErrmsgCImm) {
        this.cgEngErrmsgCImm = cgEngErrmsgCImm;
    }
    public String getCgEngErrmsgCpm1() {
        return cgEngErrmsgCpm1;
    }

    public void setCgEngErrmsgCpm1(String cgEngErrmsgCpm1) {
        this.cgEngErrmsgCpm1 = cgEngErrmsgCpm1;
    }
    public String getCgEngErrmsgDCtl() {
        return cgEngErrmsgDCtl;
    }

    public void setCgEngErrmsgDCtl(String cgEngErrmsgDCtl) {
        this.cgEngErrmsgDCtl = cgEngErrmsgDCtl;
    }
    public String getCgEngErrmsgDStatus() {
        return cgEngErrmsgDStatus;
    }

    public void setCgEngErrmsgDStatus(String cgEngErrmsgDStatus) {
        this.cgEngErrmsgDStatus = cgEngErrmsgDStatus;
    }
    public String getCgEngErrmsgDlogMgr() {
        return cgEngErrmsgDlogMgr;
    }

    public void setCgEngErrmsgDlogMgr(String cgEngErrmsgDlogMgr) {
        this.cgEngErrmsgDlogMgr = cgEngErrmsgDlogMgr;
    }
    public String getCgEngErrmsgDlogp1() {
        return cgEngErrmsgDlogp1;
    }

    public void setCgEngErrmsgDlogp1(String cgEngErrmsgDlogp1) {
        this.cgEngErrmsgDlogp1 = cgEngErrmsgDlogp1;
    }
    public String getCgEngErrmsgDlogp2() {
        return cgEngErrmsgDlogp2;
    }

    public void setCgEngErrmsgDlogp2(String cgEngErrmsgDlogp2) {
        this.cgEngErrmsgDlogp2 = cgEngErrmsgDlogp2;
    }
    public String getCgEngErrmsgDlogp3() {
        return cgEngErrmsgDlogp3;
    }

    public void setCgEngErrmsgDlogp3(String cgEngErrmsgDlogp3) {
        this.cgEngErrmsgDlogp3 = cgEngErrmsgDlogp3;
    }
    public String getCgEngErrmsgDlogp4() {
        return cgEngErrmsgDlogp4;
    }

    public void setCgEngErrmsgDlogp4(String cgEngErrmsgDlogp4) {
        this.cgEngErrmsgDlogp4 = cgEngErrmsgDlogp4;
    }
    public String getCgEngErrmsgDlogp5() {
        return cgEngErrmsgDlogp5;
    }

    public void setCgEngErrmsgDlogp5(String cgEngErrmsgDlogp5) {
        this.cgEngErrmsgDlogp5 = cgEngErrmsgDlogp5;
    }
    public String getCgEngErrmsgDlogp6() {
        return cgEngErrmsgDlogp6;
    }

    public void setCgEngErrmsgDlogp6(String cgEngErrmsgDlogp6) {
        this.cgEngErrmsgDlogp6 = cgEngErrmsgDlogp6;
    }
    public String getCgEngErrmsgDlogp7() {
        return cgEngErrmsgDlogp7;
    }

    public void setCgEngErrmsgDlogp7(String cgEngErrmsgDlogp7) {
        this.cgEngErrmsgDlogp7 = cgEngErrmsgDlogp7;
    }
    public String getCgEngErrmsgDlogp8() {
        return cgEngErrmsgDlogp8;
    }

    public void setCgEngErrmsgDlogp8(String cgEngErrmsgDlogp8) {
        this.cgEngErrmsgDlogp8 = cgEngErrmsgDlogp8;
    }
    public String getCgEngErrmsgRcmd() {
        return cgEngErrmsgRcmd;
    }

    public void setCgEngErrmsgRcmd(String cgEngErrmsgRcmd) {
        this.cgEngErrmsgRcmd = cgEngErrmsgRcmd;
    }
    public String getCgEngErrmsgBcmd() {
        return cgEngErrmsgBcmd;
    }

    public void setCgEngErrmsgBcmd(String cgEngErrmsgBcmd) {
        this.cgEngErrmsgBcmd = cgEngErrmsgBcmd;
    }
    public String getCgEngCpuUptime() {
        return cgEngCpuUptime;
    }

    public void setCgEngCpuUptime(String cgEngCpuUptime) {
        this.cgEngCpuUptime = cgEngCpuUptime;
    }
    public float getCgEngCpuLoad1() {
        return cgEngCpuLoad1;
    }

    public void setCgEngCpuLoad1(float cgEngCpuLoad1) {
        this.cgEngCpuLoad1 = cgEngCpuLoad1;
    }
    public float getCgEngCpuLoad5() {
        return cgEngCpuLoad5;
    }

    public void setCgEngCpuLoad5(float cgEngCpuLoad5) {
        this.cgEngCpuLoad5 = cgEngCpuLoad5;
    }
    public float getCgEngCpuLoad15() {
        return cgEngCpuLoad15;
    }

    public void setCgEngCpuLoad15(float cgEngCpuLoad15) {
        this.cgEngCpuLoad15 = cgEngCpuLoad15;
    }
    public long getCgEngMemoryRam() {
        return cgEngMemoryRam;
    }

    public void setCgEngMemoryRam(long cgEngMemoryRam) {
        this.cgEngMemoryRam = cgEngMemoryRam;
    }
    public long getCgEngMemoryFree() {
        return cgEngMemoryFree;
    }

    public void setCgEngMemoryFree(long cgEngMemoryFree) {
        this.cgEngMemoryFree = cgEngMemoryFree;
    }
    public int getCgEngNproc() {
        return cgEngNproc;
    }

    public void setCgEngNproc(int cgEngNproc) {
        this.cgEngNproc = cgEngNproc;
    }
    public long getCgEngMpicEflag() {
        return cgEngMpicEflag;
    }

    public void setCgEngMpicEflag(long cgEngMpicEflag) {
        this.cgEngMpicEflag = cgEngMpicEflag;
    }
    public float getCgEngMpicMainV() {
        return cgEngMpicMainV;
    }

    public void setCgEngMpicMainV(float cgEngMpicMainV) {
        this.cgEngMpicMainV = cgEngMpicMainV;
    }
    public float getCgEngMpicMainC() {
        return cgEngMpicMainC;
    }

    public void setCgEngMpicMainC(float cgEngMpicMainC) {
        this.cgEngMpicMainC = cgEngMpicMainC;
    }
    public float getCgEngMpicBatV() {
        return cgEngMpicBatV;
    }

    public void setCgEngMpicBatV(float cgEngMpicBatV) {
        this.cgEngMpicBatV = cgEngMpicBatV;
    }
    public float getCgEngMpicBatC() {
        return cgEngMpicBatC;
    }

    public void setCgEngMpicBatC(float cgEngMpicBatC) {
        this.cgEngMpicBatC = cgEngMpicBatC;
    }
    public float getCgEngMpicTemp1() {
        return cgEngMpicTemp1;
    }

    public void setCgEngMpicTemp1(float cgEngMpicTemp1) {
        this.cgEngMpicTemp1 = cgEngMpicTemp1;
    }
    public float getCgEngMpicTemp2() {
        return cgEngMpicTemp2;
    }

    public void setCgEngMpicTemp2(float cgEngMpicTemp2) {
        this.cgEngMpicTemp2 = cgEngMpicTemp2;
    }
    public float getCgEngMpicHumid() {
        return cgEngMpicHumid;
    }

    public void setCgEngMpicHumid(float cgEngMpicHumid) {
        this.cgEngMpicHumid = cgEngMpicHumid;
    }
    public float getCgEngMpicPress() {
        return cgEngMpicPress;
    }

    public void setCgEngMpicPress(float cgEngMpicPress) {
        this.cgEngMpicPress = cgEngMpicPress;
    }
    public int getCgEngMpicGfEna() {
        return cgEngMpicGfEna;
    }

    public void setCgEngMpicGfEna(int cgEngMpicGfEna) {
        this.cgEngMpicGfEna = cgEngMpicGfEna;
    }
    public float getCgEngMpicGflt1() {
        return cgEngMpicGflt1;
    }

    public void setCgEngMpicGflt1(float cgEngMpicGflt1) {
        this.cgEngMpicGflt1 = cgEngMpicGflt1;
    }
    public float getCgEngMpicGflt2() {
        return cgEngMpicGflt2;
    }

    public void setCgEngMpicGflt2(float cgEngMpicGflt2) {
        this.cgEngMpicGflt2 = cgEngMpicGflt2;
    }
    public float getCgEngMpicGflt3() {
        return cgEngMpicGflt3;
    }

    public void setCgEngMpicGflt3(float cgEngMpicGflt3) {
        this.cgEngMpicGflt3 = cgEngMpicGflt3;
    }
    public float getCgEngMpicGflt4() {
        return cgEngMpicGflt4;
    }

    public void setCgEngMpicGflt4(float cgEngMpicGflt4) {
        this.cgEngMpicGflt4 = cgEngMpicGflt4;
    }
    public int getCgEngMpicLdEna() {
        return cgEngMpicLdEna;
    }

    public void setCgEngMpicLdEna(int cgEngMpicLdEna) {
        this.cgEngMpicLdEna = cgEngMpicLdEna;
    }
    public float getCgEngMpicLdet1() {
        return cgEngMpicLdet1;
    }

    public void setCgEngMpicLdet1(float cgEngMpicLdet1) {
        this.cgEngMpicLdet1 = cgEngMpicLdet1;
    }
    public float getCgEngMpicLdet2() {
        return cgEngMpicLdet2;
    }

    public void setCgEngMpicLdet2(float cgEngMpicLdet2) {
        this.cgEngMpicLdet2 = cgEngMpicLdet2;
    }
    public int getCgEngMpicWsrc() {
        return cgEngMpicWsrc;
    }

    public void setCgEngMpicWsrc(int cgEngMpicWsrc) {
        this.cgEngMpicWsrc = cgEngMpicWsrc;
    }
    public int getCgEngMpicIrid() {
        return cgEngMpicIrid;
    }

    public void setCgEngMpicIrid(int cgEngMpicIrid) {
        this.cgEngMpicIrid = cgEngMpicIrid;
    }
    public float getCgEngMpicIridV() {
        return cgEngMpicIridV;
    }

    public void setCgEngMpicIridV(float cgEngMpicIridV) {
        this.cgEngMpicIridV = cgEngMpicIridV;
    }
    public float getCgEngMpicIridC() {
        return cgEngMpicIridC;
    }

    public void setCgEngMpicIridC(float cgEngMpicIridC) {
        this.cgEngMpicIridC = cgEngMpicIridC;
    }
    public int getCgEngMpicIridE() {
        return cgEngMpicIridE;
    }

    public void setCgEngMpicIridE(int cgEngMpicIridE) {
        this.cgEngMpicIridE = cgEngMpicIridE;
    }
    public int getCgEngMpicFwWifi() {
        return cgEngMpicFwWifi;
    }

    public void setCgEngMpicFwWifi(int cgEngMpicFwWifi) {
        this.cgEngMpicFwWifi = cgEngMpicFwWifi;
    }
    public float getCgEngMpicFwWifiV() {
        return cgEngMpicFwWifiV;
    }

    public void setCgEngMpicFwWifiV(float cgEngMpicFwWifiV) {
        this.cgEngMpicFwWifiV = cgEngMpicFwWifiV;
    }
    public float getCgEngMpicFwWifiC() {
        return cgEngMpicFwWifiC;
    }

    public void setCgEngMpicFwWifiC(float cgEngMpicFwWifiC) {
        this.cgEngMpicFwWifiC = cgEngMpicFwWifiC;
    }
    public int getCgEngMpicFwWifiE() {
        return cgEngMpicFwWifiE;
    }

    public void setCgEngMpicFwWifiE(int cgEngMpicFwWifiE) {
        this.cgEngMpicFwWifiE = cgEngMpicFwWifiE;
    }
    public int getCgEngMpicGps() {
        return cgEngMpicGps;
    }

    public void setCgEngMpicGps(int cgEngMpicGps) {
        this.cgEngMpicGps = cgEngMpicGps;
    }
    public int getCgEngMpicSbd() {
        return cgEngMpicSbd;
    }

    public void setCgEngMpicSbd(int cgEngMpicSbd) {
        this.cgEngMpicSbd = cgEngMpicSbd;
    }
    public int getCgEngMpicSbdCeMsg() {
        return cgEngMpicSbdCeMsg;
    }

    public void setCgEngMpicSbdCeMsg(int cgEngMpicSbdCeMsg) {
        this.cgEngMpicSbdCeMsg = cgEngMpicSbdCeMsg;
    }
    public int getCgEngMpicPps() {
        return cgEngMpicPps;
    }

    public void setCgEngMpicPps(int cgEngMpicPps) {
        this.cgEngMpicPps = cgEngMpicPps;
    }
    public long getCgEngMpicDcl() {
        return cgEngMpicDcl;
    }

    public void setCgEngMpicDcl(long cgEngMpicDcl) {
        this.cgEngMpicDcl = cgEngMpicDcl;
    }
    public long getCgEngMpicEsw() {
        return cgEngMpicEsw;
    }

    public void setCgEngMpicEsw(long cgEngMpicEsw) {
        this.cgEngMpicEsw = cgEngMpicEsw;
    }
    public long getCgEngMpicDsl() {
        return cgEngMpicDsl;
    }

    public void setCgEngMpicDsl(long cgEngMpicDsl) {
        this.cgEngMpicDsl = cgEngMpicDsl;
    }
    public int getCgEngMpicHbeatEnable() {
        return cgEngMpicHbeatEnable;
    }

    public void setCgEngMpicHbeatEnable(int cgEngMpicHbeatEnable) {
        this.cgEngMpicHbeatEnable = cgEngMpicHbeatEnable;
    }
    public int getCgEngMpicHbeatDtime() {
        return cgEngMpicHbeatDtime;
    }

    public void setCgEngMpicHbeatDtime(int cgEngMpicHbeatDtime) {
        this.cgEngMpicHbeatDtime = cgEngMpicHbeatDtime;
    }
    public int getCgEngMpicHbeatThreshold() {
        return cgEngMpicHbeatThreshold;
    }

    public void setCgEngMpicHbeatThreshold(int cgEngMpicHbeatThreshold) {
        this.cgEngMpicHbeatThreshold = cgEngMpicHbeatThreshold;
    }
    public int getCgEngMpicWakeCpm() {
        return cgEngMpicWakeCpm;
    }

    public void setCgEngMpicWakeCpm(int cgEngMpicWakeCpm) {
        this.cgEngMpicWakeCpm = cgEngMpicWakeCpm;
    }
    public int getCgEngMpicWpc() {
        return cgEngMpicWpc;
    }

    public void setCgEngMpicWpc(int cgEngMpicWpc) {
        this.cgEngMpicWpc = cgEngMpicWpc;
    }
    public long getCgEngMpicEflag2() {
        return cgEngMpicEflag2;
    }

    public void setCgEngMpicEflag2(long cgEngMpicEflag2) {
        this.cgEngMpicEflag2 = cgEngMpicEflag2;
    }
    public float getCgEngMpicLastUpdate() {
        return cgEngMpicLastUpdate;
    }

    public void setCgEngMpicLastUpdate(float cgEngMpicLastUpdate) {
        this.cgEngMpicLastUpdate = cgEngMpicLastUpdate;
    }
    public float getCgEngPwrsysMainV() {
        return cgEngPwrsysMainV;
    }

    public void setCgEngPwrsysMainV(float cgEngPwrsysMainV) {
        this.cgEngPwrsysMainV = cgEngPwrsysMainV;
    }
    public float getCgEngPwrsysMainC() {
        return cgEngPwrsysMainC;
    }

    public void setCgEngPwrsysMainC(float cgEngPwrsysMainC) {
        this.cgEngPwrsysMainC = cgEngPwrsysMainC;
    }
    public float getCgEngPwrsysBChg() {
        return cgEngPwrsysBChg;
    }

    public void setCgEngPwrsysBChg(float cgEngPwrsysBChg) {
        this.cgEngPwrsysBChg = cgEngPwrsysBChg;
    }
    public int getCgEngPwrsysOverride() {
        return cgEngPwrsysOverride;
    }

    public void setCgEngPwrsysOverride(int cgEngPwrsysOverride) {
        this.cgEngPwrsysOverride = cgEngPwrsysOverride;
    }
    public long getCgEngPwrsysEflag1() {
        return cgEngPwrsysEflag1;
    }

    public void setCgEngPwrsysEflag1(long cgEngPwrsysEflag1) {
        this.cgEngPwrsysEflag1 = cgEngPwrsysEflag1;
    }
    public long getCgEngPwrsysEflag2() {
        return cgEngPwrsysEflag2;
    }

    public void setCgEngPwrsysEflag2(long cgEngPwrsysEflag2) {
        this.cgEngPwrsysEflag2 = cgEngPwrsysEflag2;
    }
    public long getCgEngPwrsysEflag3() {
        return cgEngPwrsysEflag3;
    }

    public void setCgEngPwrsysEflag3(long cgEngPwrsysEflag3) {
        this.cgEngPwrsysEflag3 = cgEngPwrsysEflag3;
    }
    public float getCgEngPwrsysB10() {
        return cgEngPwrsysB10;
    }

    public void setCgEngPwrsysB10(float cgEngPwrsysB10) {
        this.cgEngPwrsysB10 = cgEngPwrsysB10;
    }
    public float getCgEngPwrsysB11() {
        return cgEngPwrsysB11;
    }

    public void setCgEngPwrsysB11(float cgEngPwrsysB11) {
        this.cgEngPwrsysB11 = cgEngPwrsysB11;
    }
    public float getCgEngPwrsysB12() {
        return cgEngPwrsysB12;
    }

    public void setCgEngPwrsysB12(float cgEngPwrsysB12) {
        this.cgEngPwrsysB12 = cgEngPwrsysB12;
    }
    public float getCgEngPwrsysB20() {
        return cgEngPwrsysB20;
    }

    public void setCgEngPwrsysB20(float cgEngPwrsysB20) {
        this.cgEngPwrsysB20 = cgEngPwrsysB20;
    }
    public float getCgEngPwrsysB21() {
        return cgEngPwrsysB21;
    }

    public void setCgEngPwrsysB21(float cgEngPwrsysB21) {
        this.cgEngPwrsysB21 = cgEngPwrsysB21;
    }
    public float getCgEngPwrsysB22() {
        return cgEngPwrsysB22;
    }

    public void setCgEngPwrsysB22(float cgEngPwrsysB22) {
        this.cgEngPwrsysB22 = cgEngPwrsysB22;
    }
    public float getCgEngPwrsysB30() {
        return cgEngPwrsysB30;
    }

    public void setCgEngPwrsysB30(float cgEngPwrsysB30) {
        this.cgEngPwrsysB30 = cgEngPwrsysB30;
    }
    public float getCgEngPwrsysB31() {
        return cgEngPwrsysB31;
    }

    public void setCgEngPwrsysB31(float cgEngPwrsysB31) {
        this.cgEngPwrsysB31 = cgEngPwrsysB31;
    }
    public float getCgEngPwrsysB32() {
        return cgEngPwrsysB32;
    }

    public void setCgEngPwrsysB32(float cgEngPwrsysB32) {
        this.cgEngPwrsysB32 = cgEngPwrsysB32;
    }
    public float getCgEngPwrsysB40() {
        return cgEngPwrsysB40;
    }

    public void setCgEngPwrsysB40(float cgEngPwrsysB40) {
        this.cgEngPwrsysB40 = cgEngPwrsysB40;
    }
    public float getCgEngPwrsysB41() {
        return cgEngPwrsysB41;
    }

    public void setCgEngPwrsysB41(float cgEngPwrsysB41) {
        this.cgEngPwrsysB41 = cgEngPwrsysB41;
    }
    public float getCgEngPwrsysB42() {
        return cgEngPwrsysB42;
    }

    public void setCgEngPwrsysB42(float cgEngPwrsysB42) {
        this.cgEngPwrsysB42 = cgEngPwrsysB42;
    }
    public float getCgEngPwrsysPv10() {
        return cgEngPwrsysPv10;
    }

    public void setCgEngPwrsysPv10(float cgEngPwrsysPv10) {
        this.cgEngPwrsysPv10 = cgEngPwrsysPv10;
    }
    public float getCgEngPwrsysPv11() {
        return cgEngPwrsysPv11;
    }

    public void setCgEngPwrsysPv11(float cgEngPwrsysPv11) {
        this.cgEngPwrsysPv11 = cgEngPwrsysPv11;
    }
    public float getCgEngPwrsysPv12() {
        return cgEngPwrsysPv12;
    }

    public void setCgEngPwrsysPv12(float cgEngPwrsysPv12) {
        this.cgEngPwrsysPv12 = cgEngPwrsysPv12;
    }
    public float getCgEngPwrsysPv20() {
        return cgEngPwrsysPv20;
    }

    public void setCgEngPwrsysPv20(float cgEngPwrsysPv20) {
        this.cgEngPwrsysPv20 = cgEngPwrsysPv20;
    }
    public float getCgEngPwrsysPv21() {
        return cgEngPwrsysPv21;
    }

    public void setCgEngPwrsysPv21(float cgEngPwrsysPv21) {
        this.cgEngPwrsysPv21 = cgEngPwrsysPv21;
    }
    public float getCgEngPwrsysPv22() {
        return cgEngPwrsysPv22;
    }

    public void setCgEngPwrsysPv22(float cgEngPwrsysPv22) {
        this.cgEngPwrsysPv22 = cgEngPwrsysPv22;
    }
    public float getCgEngPwrsysPv30() {
        return cgEngPwrsysPv30;
    }

    public void setCgEngPwrsysPv30(float cgEngPwrsysPv30) {
        this.cgEngPwrsysPv30 = cgEngPwrsysPv30;
    }
    public float getCgEngPwrsysPv31() {
        return cgEngPwrsysPv31;
    }

    public void setCgEngPwrsysPv31(float cgEngPwrsysPv31) {
        this.cgEngPwrsysPv31 = cgEngPwrsysPv31;
    }
    public float getCgEngPwrsysPv32() {
        return cgEngPwrsysPv32;
    }

    public void setCgEngPwrsysPv32(float cgEngPwrsysPv32) {
        this.cgEngPwrsysPv32 = cgEngPwrsysPv32;
    }
    public float getCgEngPwrsysPv40() {
        return cgEngPwrsysPv40;
    }

    public void setCgEngPwrsysPv40(float cgEngPwrsysPv40) {
        this.cgEngPwrsysPv40 = cgEngPwrsysPv40;
    }
    public float getCgEngPwrsysPv41() {
        return cgEngPwrsysPv41;
    }

    public void setCgEngPwrsysPv41(float cgEngPwrsysPv41) {
        this.cgEngPwrsysPv41 = cgEngPwrsysPv41;
    }
    public float getCgEngPwrsysPv42() {
        return cgEngPwrsysPv42;
    }

    public void setCgEngPwrsysPv42(float cgEngPwrsysPv42) {
        this.cgEngPwrsysPv42 = cgEngPwrsysPv42;
    }
    public float getCgEngPwrsysWt10() {
        return cgEngPwrsysWt10;
    }

    public void setCgEngPwrsysWt10(float cgEngPwrsysWt10) {
        this.cgEngPwrsysWt10 = cgEngPwrsysWt10;
    }
    public float getCgEngPwrsysWt11() {
        return cgEngPwrsysWt11;
    }

    public void setCgEngPwrsysWt11(float cgEngPwrsysWt11) {
        this.cgEngPwrsysWt11 = cgEngPwrsysWt11;
    }
    public float getCgEngPwrsysWt12() {
        return cgEngPwrsysWt12;
    }

    public void setCgEngPwrsysWt12(float cgEngPwrsysWt12) {
        this.cgEngPwrsysWt12 = cgEngPwrsysWt12;
    }
    public float getCgEngPwrsysWt20() {
        return cgEngPwrsysWt20;
    }

    public void setCgEngPwrsysWt20(float cgEngPwrsysWt20) {
        this.cgEngPwrsysWt20 = cgEngPwrsysWt20;
    }
    public float getCgEngPwrsysWt21() {
        return cgEngPwrsysWt21;
    }

    public void setCgEngPwrsysWt21(float cgEngPwrsysWt21) {
        this.cgEngPwrsysWt21 = cgEngPwrsysWt21;
    }
    public float getCgEngPwrsysWt22() {
        return cgEngPwrsysWt22;
    }

    public void setCgEngPwrsysWt22(float cgEngPwrsysWt22) {
        this.cgEngPwrsysWt22 = cgEngPwrsysWt22;
    }
    public float getCgEngPwrsysFc10() {
        return cgEngPwrsysFc10;
    }

    public void setCgEngPwrsysFc10(float cgEngPwrsysFc10) {
        this.cgEngPwrsysFc10 = cgEngPwrsysFc10;
    }
    public float getCgEngPwrsysFc11() {
        return cgEngPwrsysFc11;
    }

    public void setCgEngPwrsysFc11(float cgEngPwrsysFc11) {
        this.cgEngPwrsysFc11 = cgEngPwrsysFc11;
    }
    public float getCgEngPwrsysFc12() {
        return cgEngPwrsysFc12;
    }

    public void setCgEngPwrsysFc12(float cgEngPwrsysFc12) {
        this.cgEngPwrsysFc12 = cgEngPwrsysFc12;
    }
    public float getCgEngPwrsysFc20() {
        return cgEngPwrsysFc20;
    }

    public void setCgEngPwrsysFc20(float cgEngPwrsysFc20) {
        this.cgEngPwrsysFc20 = cgEngPwrsysFc20;
    }
    public float getCgEngPwrsysFc21() {
        return cgEngPwrsysFc21;
    }

    public void setCgEngPwrsysFc21(float cgEngPwrsysFc21) {
        this.cgEngPwrsysFc21 = cgEngPwrsysFc21;
    }
    public float getCgEngPwrsysFc22() {
        return cgEngPwrsysFc22;
    }

    public void setCgEngPwrsysFc22(float cgEngPwrsysFc22) {
        this.cgEngPwrsysFc22 = cgEngPwrsysFc22;
    }
    public float getCgEngPwrsysTemp() {
        return cgEngPwrsysTemp;
    }

    public void setCgEngPwrsysTemp(float cgEngPwrsysTemp) {
        this.cgEngPwrsysTemp = cgEngPwrsysTemp;
    }
    public float getCgEngPwrsysFcLevel() {
        return cgEngPwrsysFcLevel;
    }

    public void setCgEngPwrsysFcLevel(float cgEngPwrsysFcLevel) {
        this.cgEngPwrsysFcLevel = cgEngPwrsysFcLevel;
    }
    public float getCgEngPwrsysSwg0() {
        return cgEngPwrsysSwg0;
    }

    public void setCgEngPwrsysSwg0(float cgEngPwrsysSwg0) {
        this.cgEngPwrsysSwg0 = cgEngPwrsysSwg0;
    }
    public float getCgEngPwrsysSwg1() {
        return cgEngPwrsysSwg1;
    }

    public void setCgEngPwrsysSwg1(float cgEngPwrsysSwg1) {
        this.cgEngPwrsysSwg1 = cgEngPwrsysSwg1;
    }
    public float getCgEngPwrsysSwg2() {
        return cgEngPwrsysSwg2;
    }

    public void setCgEngPwrsysSwg2(float cgEngPwrsysSwg2) {
        this.cgEngPwrsysSwg2 = cgEngPwrsysSwg2;
    }
    public float getCgEngPwrsysCvt0() {
        return cgEngPwrsysCvt0;
    }

    public void setCgEngPwrsysCvt0(float cgEngPwrsysCvt0) {
        this.cgEngPwrsysCvt0 = cgEngPwrsysCvt0;
    }
    public float getCgEngPwrsysCvt1() {
        return cgEngPwrsysCvt1;
    }

    public void setCgEngPwrsysCvt1(float cgEngPwrsysCvt1) {
        this.cgEngPwrsysCvt1 = cgEngPwrsysCvt1;
    }
    public float getCgEngPwrsysCvt2() {
        return cgEngPwrsysCvt2;
    }

    public void setCgEngPwrsysCvt2(float cgEngPwrsysCvt2) {
        this.cgEngPwrsysCvt2 = cgEngPwrsysCvt2;
    }
    public float getCgEngPwrsysCvt3() {
        return cgEngPwrsysCvt3;
    }

    public void setCgEngPwrsysCvt3(float cgEngPwrsysCvt3) {
        this.cgEngPwrsysCvt3 = cgEngPwrsysCvt3;
    }
    public float getCgEngPwrsysCvt4() {
        return cgEngPwrsysCvt4;
    }

    public void setCgEngPwrsysCvt4(float cgEngPwrsysCvt4) {
        this.cgEngPwrsysCvt4 = cgEngPwrsysCvt4;
    }
    public double getCgEngPwrsysLastUpdate() {
        return cgEngPwrsysLastUpdate;
    }

    public void setCgEngPwrsysLastUpdate(double cgEngPwrsysLastUpdate) {
        this.cgEngPwrsysLastUpdate = cgEngPwrsysLastUpdate;
    }
    public String getCgEngGpsMsgDate() {
        return cgEngGpsMsgDate;
    }

    public void setCgEngGpsMsgDate(String cgEngGpsMsgDate) {
        this.cgEngGpsMsgDate = cgEngGpsMsgDate;
    }
    public String getCgEngGpsMsgTime() {
        return cgEngGpsMsgTime;
    }

    public void setCgEngGpsMsgTime(String cgEngGpsMsgTime) {
        this.cgEngGpsMsgTime = cgEngGpsMsgTime;
    }
    public long getCgEngGpsDate() {
        return cgEngGpsDate;
    }

    public void setCgEngGpsDate(long cgEngGpsDate) {
        this.cgEngGpsDate = cgEngGpsDate;
    }
    public long getCgEngGpsTime() {
        return cgEngGpsTime;
    }

    public void setCgEngGpsTime(long cgEngGpsTime) {
        this.cgEngGpsTime = cgEngGpsTime;
    }
    public String getCgEngGpsLatstr() {
        return cgEngGpsLatstr;
    }

    public void setCgEngGpsLatstr(String cgEngGpsLatstr) {
        this.cgEngGpsLatstr = cgEngGpsLatstr;
    }
    public String getCgEngGpsLonstr() {
        return cgEngGpsLonstr;
    }

    public void setCgEngGpsLonstr(String cgEngGpsLonstr) {
        this.cgEngGpsLonstr = cgEngGpsLonstr;
    }
    public double getCgEngGpsLat() {
        return cgEngGpsLat;
    }

    public void setCgEngGpsLat(double cgEngGpsLat) {
        this.cgEngGpsLat = cgEngGpsLat;
    }
    public double getCgEngGpsLon() {
        return cgEngGpsLon;
    }

    public void setCgEngGpsLon(double cgEngGpsLon) {
        this.cgEngGpsLon = cgEngGpsLon;
    }
    public float getCgEngGpsSpd() {
        return cgEngGpsSpd;
    }

    public void setCgEngGpsSpd(float cgEngGpsSpd) {
        this.cgEngGpsSpd = cgEngGpsSpd;
    }
    public float getCgEngGpsCog() {
        return cgEngGpsCog;
    }

    public void setCgEngGpsCog(float cgEngGpsCog) {
        this.cgEngGpsCog = cgEngGpsCog;
    }
    public int getCgEngGpsFix() {
        return cgEngGpsFix;
    }

    public void setCgEngGpsFix(int cgEngGpsFix) {
        this.cgEngGpsFix = cgEngGpsFix;
    }
    public int getCgEngGpsNsat() {
        return cgEngGpsNsat;
    }

    public void setCgEngGpsNsat(int cgEngGpsNsat) {
        this.cgEngGpsNsat = cgEngGpsNsat;
    }
    public float getCgEngGpsHdop() {
        return cgEngGpsHdop;
    }

    public void setCgEngGpsHdop(float cgEngGpsHdop) {
        this.cgEngGpsHdop = cgEngGpsHdop;
    }
    public float getCgEngGpsAlt() {
        return cgEngGpsAlt;
    }

    public void setCgEngGpsAlt(float cgEngGpsAlt) {
        this.cgEngGpsAlt = cgEngGpsAlt;
    }
    public double getCgEngGpsLastUpdate() {
        return cgEngGpsLastUpdate;
    }

    public void setCgEngGpsLastUpdate(double cgEngGpsLastUpdate) {
        this.cgEngGpsLastUpdate = cgEngGpsLastUpdate;
    }
    public List<String> getCgEngSchedSys() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedSys;
    }

    public void setCgEngSchedSys(List<String> cgEngSchedSys) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedSys = cgEngSchedSys;
    }
    public int getCgEngSchedSysDims() {
        return cgEngSchedSysDims;
    }

    public void setCgEngSchedSysDims(int cgEngSchedSysDims) {
        this.cgEngSchedSysDims = cgEngSchedSysDims;
    }
    public List<Long> getCgEngSchedSysSizes() {
        return cgEngSchedSysSizes;
    }

    public void setCgEngSchedSysSizes(List<Long> cgEngSchedSysSizes) {
        this.cgEngSchedSysSizes = cgEngSchedSysSizes;
    }
    public List<String> getCgEngSchedType() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedType;
    }

    public void setCgEngSchedType(List<String> cgEngSchedType) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedType = cgEngSchedType;
    }
    public int getCgEngSchedTypeDims() {
        return cgEngSchedTypeDims;
    }

    public void setCgEngSchedTypeDims(int cgEngSchedTypeDims) {
        this.cgEngSchedTypeDims = cgEngSchedTypeDims;
    }
    public List<Long> getCgEngSchedTypeSizes() {
        return cgEngSchedTypeSizes;
    }

    public void setCgEngSchedTypeSizes(List<Long> cgEngSchedTypeSizes) {
        this.cgEngSchedTypeSizes = cgEngSchedTypeSizes;
    }
    public List<String> getCgEngSchedStatus() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedStatus;
    }

    public void setCgEngSchedStatus(List<String> cgEngSchedStatus) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedStatus = cgEngSchedStatus;
    }
    public int getCgEngSchedStatusDims() {
        return cgEngSchedStatusDims;
    }

    public void setCgEngSchedStatusDims(int cgEngSchedStatusDims) {
        this.cgEngSchedStatusDims = cgEngSchedStatusDims;
    }
    public List<Long> getCgEngSchedStatusSizes() {
        return cgEngSchedStatusSizes;
    }

    public void setCgEngSchedStatusSizes(List<Long> cgEngSchedStatusSizes) {
        this.cgEngSchedStatusSizes = cgEngSchedStatusSizes;
    }
    public List<Integer> getCgEngSchedStatusVal() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedStatusVal;
    }

    public void setCgEngSchedStatusVal(List<Integer> cgEngSchedStatusVal) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedStatusVal = cgEngSchedStatusVal;
    }
    public int getCgEngSchedStatusValDims() {
        return cgEngSchedStatusValDims;
    }

    public void setCgEngSchedStatusValDims(int cgEngSchedStatusValDims) {
        this.cgEngSchedStatusValDims = cgEngSchedStatusValDims;
    }
    public List<Long> getCgEngSchedStatusValSizes() {
        return cgEngSchedStatusValSizes;
    }

    public void setCgEngSchedStatusValSizes(List<Long> cgEngSchedStatusValSizes) {
        this.cgEngSchedStatusValSizes = cgEngSchedStatusValSizes;
    }
    public List<Integer> getCgEngSchedNum1() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedNum1;
    }

    public void setCgEngSchedNum1(List<Integer> cgEngSchedNum1) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedNum1 = cgEngSchedNum1;
    }
    public int getCgEngSchedNum1Dims() {
        return cgEngSchedNum1Dims;
    }

    public void setCgEngSchedNum1Dims(int cgEngSchedNum1Dims) {
        this.cgEngSchedNum1Dims = cgEngSchedNum1Dims;
    }
    public List<Long> getCgEngSchedNum1Sizes() {
        return cgEngSchedNum1Sizes;
    }

    public void setCgEngSchedNum1Sizes(List<Long> cgEngSchedNum1Sizes) {
        this.cgEngSchedNum1Sizes = cgEngSchedNum1Sizes;
    }
    public List<Integer> getCgEngSchedNum2() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedNum2;
    }

    public void setCgEngSchedNum2(List<Integer> cgEngSchedNum2) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedNum2 = cgEngSchedNum2;
    }
    public int getCgEngSchedNum2Dims() {
        return cgEngSchedNum2Dims;
    }

    public void setCgEngSchedNum2Dims(int cgEngSchedNum2Dims) {
        this.cgEngSchedNum2Dims = cgEngSchedNum2Dims;
    }
    public List<Long> getCgEngSchedNum2Sizes() {
        return cgEngSchedNum2Sizes;
    }

    public void setCgEngSchedNum2Sizes(List<Long> cgEngSchedNum2Sizes) {
        this.cgEngSchedNum2Sizes = cgEngSchedNum2Sizes;
    }
    public List<Integer> getCgEngSchedNum3() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedNum3;
    }

    public void setCgEngSchedNum3(List<Integer> cgEngSchedNum3) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedNum3 = cgEngSchedNum3;
    }
    public int getCgEngSchedNum3Dims() {
        return cgEngSchedNum3Dims;
    }

    public void setCgEngSchedNum3Dims(int cgEngSchedNum3Dims) {
        this.cgEngSchedNum3Dims = cgEngSchedNum3Dims;
    }
    public List<Long> getCgEngSchedNum3Sizes() {
        return cgEngSchedNum3Sizes;
    }

    public void setCgEngSchedNum3Sizes(List<Long> cgEngSchedNum3Sizes) {
        this.cgEngSchedNum3Sizes = cgEngSchedNum3Sizes;
    }
    public List<Integer> getCgEngSchedNum4() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedNum4;
    }

    public void setCgEngSchedNum4(List<Integer> cgEngSchedNum4) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedNum4 = cgEngSchedNum4;
    }
    public int getCgEngSchedNum4Dims() {
        return cgEngSchedNum4Dims;
    }

    public void setCgEngSchedNum4Dims(int cgEngSchedNum4Dims) {
        this.cgEngSchedNum4Dims = cgEngSchedNum4Dims;
    }
    public List<Long> getCgEngSchedNum4Sizes() {
        return cgEngSchedNum4Sizes;
    }

    public void setCgEngSchedNum4Sizes(List<Long> cgEngSchedNum4Sizes) {
        this.cgEngSchedNum4Sizes = cgEngSchedNum4Sizes;
    }
    public List<Integer> getCgEngSchedNum5() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedNum5;
    }

    public void setCgEngSchedNum5(List<Integer> cgEngSchedNum5) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedNum5 = cgEngSchedNum5;
    }
    public int getCgEngSchedNum5Dims() {
        return cgEngSchedNum5Dims;
    }

    public void setCgEngSchedNum5Dims(int cgEngSchedNum5Dims) {
        this.cgEngSchedNum5Dims = cgEngSchedNum5Dims;
    }
    public List<Long> getCgEngSchedNum5Sizes() {
        return cgEngSchedNum5Sizes;
    }

    public void setCgEngSchedNum5Sizes(List<Long> cgEngSchedNum5Sizes) {
        this.cgEngSchedNum5Sizes = cgEngSchedNum5Sizes;
    }
    public List<Integer> getCgEngSchedNum6() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedNum6;
    }

    public void setCgEngSchedNum6(List<Integer> cgEngSchedNum6) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedNum6 = cgEngSchedNum6;
    }
    public int getCgEngSchedNum6Dims() {
        return cgEngSchedNum6Dims;
    }

    public void setCgEngSchedNum6Dims(int cgEngSchedNum6Dims) {
        this.cgEngSchedNum6Dims = cgEngSchedNum6Dims;
    }
    public List<Long> getCgEngSchedNum6Sizes() {
        return cgEngSchedNum6Sizes;
    }

    public void setCgEngSchedNum6Sizes(List<Long> cgEngSchedNum6Sizes) {
        this.cgEngSchedNum6Sizes = cgEngSchedNum6Sizes;
    }
    public List<Integer> getCgEngSchedNum7() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedNum7;
    }

    public void setCgEngSchedNum7(List<Integer> cgEngSchedNum7) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedNum7 = cgEngSchedNum7;
    }
    public int getCgEngSchedNum7Dims() {
        return cgEngSchedNum7Dims;
    }

    public void setCgEngSchedNum7Dims(int cgEngSchedNum7Dims) {
        this.cgEngSchedNum7Dims = cgEngSchedNum7Dims;
    }
    public List<Long> getCgEngSchedNum7Sizes() {
        return cgEngSchedNum7Sizes;
    }

    public void setCgEngSchedNum7Sizes(List<Long> cgEngSchedNum7Sizes) {
        this.cgEngSchedNum7Sizes = cgEngSchedNum7Sizes;
    }
    public List<String> getCgEngSchedTime() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedTime;
    }

    public void setCgEngSchedTime(List<String> cgEngSchedTime) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedTime = cgEngSchedTime;
    }
    public int getCgEngSchedTimeDims() {
        return cgEngSchedTimeDims;
    }

    public void setCgEngSchedTimeDims(int cgEngSchedTimeDims) {
        this.cgEngSchedTimeDims = cgEngSchedTimeDims;
    }
    public List<Long> getCgEngSchedTimeSizes() {
        return cgEngSchedTimeSizes;
    }

    public void setCgEngSchedTimeSizes(List<Long> cgEngSchedTimeSizes) {
        this.cgEngSchedTimeSizes = cgEngSchedTimeSizes;
    }
    public List<Integer> getCgEngSchedRemaining() {
        // TODO - restore original dimensions, (remove fill values?)
        return cgEngSchedRemaining;
    }

    public void setCgEngSchedRemaining(List<Integer> cgEngSchedRemaining) {
        // TODO - flatten for storage, insert fill values
        this.cgEngSchedRemaining = cgEngSchedRemaining;
    }
    public int getCgEngSchedRemainingDims() {
        return cgEngSchedRemainingDims;
    }

    public void setCgEngSchedRemainingDims(int cgEngSchedRemainingDims) {
        this.cgEngSchedRemainingDims = cgEngSchedRemainingDims;
    }
    public List<Long> getCgEngSchedRemainingSizes() {
        return cgEngSchedRemainingSizes;
    }

    public void setCgEngSchedRemainingSizes(List<Long> cgEngSchedRemainingSizes) {
        this.cgEngSchedRemainingSizes = cgEngSchedRemainingSizes;
    }
    public float getCgEngSchedLastUpdate() {
        return cgEngSchedLastUpdate;
    }

    public void setCgEngSchedLastUpdate(float cgEngSchedLastUpdate) {
        this.cgEngSchedLastUpdate = cgEngSchedLastUpdate;
    }
    public String getCgEngNtpRefid() {
        return cgEngNtpRefid;
    }

    public void setCgEngNtpRefid(String cgEngNtpRefid) {
        this.cgEngNtpRefid = cgEngNtpRefid;
    }
    public float getCgEngNtpOffset() {
        return cgEngNtpOffset;
    }

    public void setCgEngNtpOffset(float cgEngNtpOffset) {
        this.cgEngNtpOffset = cgEngNtpOffset;
    }
    public float getCgEngNtpJitter() {
        return cgEngNtpJitter;
    }

    public void setCgEngNtpJitter(float cgEngNtpJitter) {
        this.cgEngNtpJitter = cgEngNtpJitter;
    }
    public String getCgEngPpsLock() {
        return cgEngPpsLock;
    }

    public void setCgEngPpsLock(String cgEngPpsLock) {
        this.cgEngPpsLock = cgEngPpsLock;
    }
    public int getCgEngPpsDelta() {
        return cgEngPpsDelta;
    }

    public void setCgEngPpsDelta(int cgEngPpsDelta) {
        this.cgEngPpsDelta = cgEngPpsDelta;
    }
    public int getCgEngPpsDeltamin() {
        return cgEngPpsDeltamin;
    }

    public void setCgEngPpsDeltamin(int cgEngPpsDeltamin) {
        this.cgEngPpsDeltamin = cgEngPpsDeltamin;
    }
    public int getCgEngPpsDeltamax() {
        return cgEngPpsDeltamax;
    }

    public void setCgEngPpsDeltamax(int cgEngPpsDeltamax) {
        this.cgEngPpsDeltamax = cgEngPpsDeltamax;
    }
    public int getCgEngPpsBadPulse() {
        return cgEngPpsBadPulse;
    }

    public void setCgEngPpsBadPulse(int cgEngPpsBadPulse) {
        this.cgEngPpsBadPulse = cgEngPpsBadPulse;
    }
    public String getCgEngPpsTimestamp() {
        return cgEngPpsTimestamp;
    }

    public void setCgEngPpsTimestamp(String cgEngPpsTimestamp) {
        this.cgEngPpsTimestamp = cgEngPpsTimestamp;
    }
    public double getCgEngPpsLastUpdate() {
        return cgEngPpsLastUpdate;
    }

    public void setCgEngPpsLastUpdate(double cgEngPpsLastUpdate) {
        this.cgEngPpsLastUpdate = cgEngPpsLastUpdate;
    }
    public String getCgEngLoadshedStatus() {
        return cgEngLoadshedStatus;
    }

    public void setCgEngLoadshedStatus(String cgEngLoadshedStatus) {
        this.cgEngLoadshedStatus = cgEngLoadshedStatus;
    }
    public double getCgEngLoadshedLastUpdate() {
        return cgEngLoadshedLastUpdate;
    }

    public void setCgEngLoadshedLastUpdate(double cgEngLoadshedLastUpdate) {
        this.cgEngLoadshedLastUpdate = cgEngLoadshedLastUpdate;
    }
    public int getCgEngSbcEth0() {
        return cgEngSbcEth0;
    }

    public void setCgEngSbcEth0(int cgEngSbcEth0) {
        this.cgEngSbcEth0 = cgEngSbcEth0;
    }
    public int getCgEngSbcEth1() {
        return cgEngSbcEth1;
    }

    public void setCgEngSbcEth1(int cgEngSbcEth1) {
        this.cgEngSbcEth1 = cgEngSbcEth1;
    }
    public int getCgEngSbcLed0() {
        return cgEngSbcLed0;
    }

    public void setCgEngSbcLed0(int cgEngSbcLed0) {
        this.cgEngSbcLed0 = cgEngSbcLed0;
    }
    public int getCgEngSbcLed1() {
        return cgEngSbcLed1;
    }

    public void setCgEngSbcLed1(int cgEngSbcLed1) {
        this.cgEngSbcLed1 = cgEngSbcLed1;
    }
    public int getCgEngSbcLed2() {
        return cgEngSbcLed2;
    }

    public void setCgEngSbcLed2(int cgEngSbcLed2) {
        this.cgEngSbcLed2 = cgEngSbcLed2;
    }
    public int getCgEngSbcGpo0() {
        return cgEngSbcGpo0;
    }

    public void setCgEngSbcGpo0(int cgEngSbcGpo0) {
        this.cgEngSbcGpo0 = cgEngSbcGpo0;
    }
    public int getCgEngSbcGpo1() {
        return cgEngSbcGpo1;
    }

    public void setCgEngSbcGpo1(int cgEngSbcGpo1) {
        this.cgEngSbcGpo1 = cgEngSbcGpo1;
    }
    public int getCgEngSbcGpo2() {
        return cgEngSbcGpo2;
    }

    public void setCgEngSbcGpo2(int cgEngSbcGpo2) {
        this.cgEngSbcGpo2 = cgEngSbcGpo2;
    }
    public int getCgEngSbcGpo3() {
        return cgEngSbcGpo3;
    }

    public void setCgEngSbcGpo3(int cgEngSbcGpo3) {
        this.cgEngSbcGpo3 = cgEngSbcGpo3;
    }
    public int getCgEngSbcGpo4() {
        return cgEngSbcGpo4;
    }

    public void setCgEngSbcGpo4(int cgEngSbcGpo4) {
        this.cgEngSbcGpo4 = cgEngSbcGpo4;
    }
    public int getCgEngSbcGpio0() {
        return cgEngSbcGpio0;
    }

    public void setCgEngSbcGpio0(int cgEngSbcGpio0) {
        this.cgEngSbcGpio0 = cgEngSbcGpio0;
    }
    public int getCgEngSbcGpio1() {
        return cgEngSbcGpio1;
    }

    public void setCgEngSbcGpio1(int cgEngSbcGpio1) {
        this.cgEngSbcGpio1 = cgEngSbcGpio1;
    }
    public int getCgEngSbcGpio2() {
        return cgEngSbcGpio2;
    }

    public void setCgEngSbcGpio2(int cgEngSbcGpio2) {
        this.cgEngSbcGpio2 = cgEngSbcGpio2;
    }
    public int getCgEngSbcGpio3() {
        return cgEngSbcGpio3;
    }

    public void setCgEngSbcGpio3(int cgEngSbcGpio3) {
        this.cgEngSbcGpio3 = cgEngSbcGpio3;
    }
    public int getCgEngSbcGpio4() {
        return cgEngSbcGpio4;
    }

    public void setCgEngSbcGpio4(int cgEngSbcGpio4) {
        this.cgEngSbcGpio4 = cgEngSbcGpio4;
    }
    public int getCgEngSbcGpio5() {
        return cgEngSbcGpio5;
    }

    public void setCgEngSbcGpio5(int cgEngSbcGpio5) {
        this.cgEngSbcGpio5 = cgEngSbcGpio5;
    }
    public int getCgEngSbcFb1() {
        return cgEngSbcFb1;
    }

    public void setCgEngSbcFb1(int cgEngSbcFb1) {
        this.cgEngSbcFb1 = cgEngSbcFb1;
    }
    public int getCgEngSbcFb2() {
        return cgEngSbcFb2;
    }

    public void setCgEngSbcFb2(int cgEngSbcFb2) {
        this.cgEngSbcFb2 = cgEngSbcFb2;
    }
    public int getCgEngSbcCeLed() {
        return cgEngSbcCeLed;
    }

    public void setCgEngSbcCeLed(int cgEngSbcCeLed) {
        this.cgEngSbcCeLed = cgEngSbcCeLed;
    }
    public int getCgEngSbcWdt() {
        return cgEngSbcWdt;
    }

    public void setCgEngSbcWdt(int cgEngSbcWdt) {
        this.cgEngSbcWdt = cgEngSbcWdt;
    }
    public int getCgEngSbcBid() {
        return cgEngSbcBid;
    }

    public void setCgEngSbcBid(int cgEngSbcBid) {
        this.cgEngSbcBid = cgEngSbcBid;
    }
    public int getCgEngSbcBstr() {
        return cgEngSbcBstr;
    }

    public void setCgEngSbcBstr(int cgEngSbcBstr) {
        this.cgEngSbcBstr = cgEngSbcBstr;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}