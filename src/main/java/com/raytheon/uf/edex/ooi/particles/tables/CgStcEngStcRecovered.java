package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_stc_eng_stc_recovered")
public class CgStcEngStcRecovered extends CassandraParticle {

    @Column(value = "cg_eng_platform_time")
    private String cgEngPlatformTime;

    @Column(value = "cg_eng_platform_utime")
    private double cgEngPlatformUtime;

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

    @Column(value = "cg_eng_msg_cnts_d_gps")
    private int cgEngMsgCntsDGps;

    @Column(value = "cg_eng_msg_cnts_d_ntp")
    private int cgEngMsgCntsDNtp;

    @Column(value = "cg_eng_msg_cnts_d_pps")
    private int cgEngMsgCntsDPps;

    @Column(value = "cg_eng_msg_cnts_d_superv")
    private int cgEngMsgCntsDSuperv;

    @Column(value = "cg_eng_msg_cnts_d_dlog_ngr")
    private int cgEngMsgCntsDDlogNgr;

    @Column(value = "cg_eng_dclp1_enable")
    private int cgEngDclp1Enable;

    @Column(value = "cg_eng_dclp1_volt")
    private float cgEngDclp1Volt;

    @Column(value = "cg_eng_dclp1_current")
    private float cgEngDclp1Current;

    @Column(value = "cg_eng_dclp1_eflag")
    private int cgEngDclp1Eflag;

    @Column(value = "cg_eng_dclp1_vsel")
    private int cgEngDclp1Vsel;

    @Column(value = "cg_eng_dclp1_clim")
    private int cgEngDclp1Clim;

    @Column(value = "cg_eng_dclp1_prot")
    private int cgEngDclp1Prot;

    @Column(value = "cg_eng_dclp2_enable")
    private int cgEngDclp2Enable;

    @Column(value = "cg_eng_dclp2_volt")
    private float cgEngDclp2Volt;

    @Column(value = "cg_eng_dclp2_current")
    private float cgEngDclp2Current;

    @Column(value = "cg_eng_dclp2_eflag")
    private int cgEngDclp2Eflag;

    @Column(value = "cg_eng_dclp2_vsel")
    private int cgEngDclp2Vsel;

    @Column(value = "cg_eng_dclp2_clim")
    private int cgEngDclp2Clim;

    @Column(value = "cg_eng_dclp2_prot")
    private int cgEngDclp2Prot;

    @Column(value = "cg_eng_dclp3_enable")
    private int cgEngDclp3Enable;

    @Column(value = "cg_eng_dclp3_volt")
    private float cgEngDclp3Volt;

    @Column(value = "cg_eng_dclp3_current")
    private float cgEngDclp3Current;

    @Column(value = "cg_eng_dclp3_eflag")
    private int cgEngDclp3Eflag;

    @Column(value = "cg_eng_dclp3_vsel")
    private int cgEngDclp3Vsel;

    @Column(value = "cg_eng_dclp3_clim")
    private int cgEngDclp3Clim;

    @Column(value = "cg_eng_dclp3_prot")
    private int cgEngDclp3Prot;

    @Column(value = "cg_eng_dclp4_enable")
    private int cgEngDclp4Enable;

    @Column(value = "cg_eng_dclp4_volt")
    private float cgEngDclp4Volt;

    @Column(value = "cg_eng_dclp4_current")
    private float cgEngDclp4Current;

    @Column(value = "cg_eng_dclp4_eflag")
    private int cgEngDclp4Eflag;

    @Column(value = "cg_eng_dclp4_vsel")
    private int cgEngDclp4Vsel;

    @Column(value = "cg_eng_dclp4_clim")
    private int cgEngDclp4Clim;

    @Column(value = "cg_eng_dclp4_prot")
    private int cgEngDclp4Prot;

    @Column(value = "cg_eng_dclp5_enable")
    private int cgEngDclp5Enable;

    @Column(value = "cg_eng_dclp5_volt")
    private float cgEngDclp5Volt;

    @Column(value = "cg_eng_dclp5_current")
    private float cgEngDclp5Current;

    @Column(value = "cg_eng_dclp5_eflag")
    private int cgEngDclp5Eflag;

    @Column(value = "cg_eng_dclp5_vsel")
    private int cgEngDclp5Vsel;

    @Column(value = "cg_eng_dclp5_clim")
    private int cgEngDclp5Clim;

    @Column(value = "cg_eng_dclp5_prot")
    private int cgEngDclp5Prot;

    @Column(value = "cg_eng_dclp6_enable")
    private int cgEngDclp6Enable;

    @Column(value = "cg_eng_dclp6_volt")
    private float cgEngDclp6Volt;

    @Column(value = "cg_eng_dclp6_current")
    private float cgEngDclp6Current;

    @Column(value = "cg_eng_dclp6_eflag")
    private int cgEngDclp6Eflag;

    @Column(value = "cg_eng_dclp6_vsel")
    private int cgEngDclp6Vsel;

    @Column(value = "cg_eng_dclp6_clim")
    private int cgEngDclp6Clim;

    @Column(value = "cg_eng_dclp6_prot")
    private int cgEngDclp6Prot;

    @Column(value = "cg_eng_dclp7_enable")
    private int cgEngDclp7Enable;

    @Column(value = "cg_eng_dclp7_volt")
    private float cgEngDclp7Volt;

    @Column(value = "cg_eng_dclp7_current")
    private float cgEngDclp7Current;

    @Column(value = "cg_eng_dclp7_eflag")
    private int cgEngDclp7Eflag;

    @Column(value = "cg_eng_dclp7_vsel")
    private int cgEngDclp7Vsel;

    @Column(value = "cg_eng_dclp7_clim")
    private int cgEngDclp7Clim;

    @Column(value = "cg_eng_dclp7_prot")
    private int cgEngDclp7Prot;

    @Column(value = "cg_eng_dclp8_enable")
    private int cgEngDclp8Enable;

    @Column(value = "cg_eng_dclp8_volt")
    private float cgEngDclp8Volt;

    @Column(value = "cg_eng_dclp8_current")
    private float cgEngDclp8Current;

    @Column(value = "cg_eng_dclp8_eflag")
    private int cgEngDclp8Eflag;

    @Column(value = "cg_eng_dclp8_vsel")
    private int cgEngDclp8Vsel;

    @Column(value = "cg_eng_dclp8_clim")
    private int cgEngDclp8Clim;

    @Column(value = "cg_eng_dclp8_prot")
    private int cgEngDclp8Prot;

    @Column(value = "cg_eng_dcl_port_status")
    private float cgEngDclPortStatus;

    @Column(value = "cg_eng_port_dlog1_name")
    private String cgEngPortDlog1Name;

    @Column(value = "cg_eng_port_dlog1_state")
    private String cgEngPortDlog1State;

    @Column(value = "cg_eng_port_dlog1_tx")
    private BigInteger cgEngPortDlog1Tx;

    @Column(value = "cg_eng_port_dlog1_rx")
    private BigInteger cgEngPortDlog1Rx;

    @Column(value = "cg_eng_port_dlog1_log")
    private BigInteger cgEngPortDlog1Log;

    @Column(value = "cg_eng_port_dlog1_good")
    private BigInteger cgEngPortDlog1Good;

    @Column(value = "cg_eng_port_dlog1_bad")
    private BigInteger cgEngPortDlog1Bad;

    @Column(value = "cg_eng_port_dlog1_bb")
    private BigInteger cgEngPortDlog1Bb;

    @Column(value = "cg_eng_port_dlog1_ld")
    private long cgEngPortDlog1Ld;

    @Column(value = "cg_eng_port_dlog1_lu")
    private double cgEngPortDlog1Lu;

    @Column(value = "cg_eng_port_dlog2_name")
    private String cgEngPortDlog2Name;

    @Column(value = "cg_eng_port_dlog2_state")
    private String cgEngPortDlog2State;

    @Column(value = "cg_eng_port_dlog2_tx")
    private BigInteger cgEngPortDlog2Tx;

    @Column(value = "cg_eng_port_dlog2_rx")
    private BigInteger cgEngPortDlog2Rx;

    @Column(value = "cg_eng_port_dlog2_log")
    private BigInteger cgEngPortDlog2Log;

    @Column(value = "cg_eng_port_dlog2_good")
    private BigInteger cgEngPortDlog2Good;

    @Column(value = "cg_eng_port_dlog2_bad")
    private BigInteger cgEngPortDlog2Bad;

    @Column(value = "cg_eng_port_dlog2_bb")
    private BigInteger cgEngPortDlog2Bb;

    @Column(value = "cg_eng_port_dlog2_ld")
    private long cgEngPortDlog2Ld;

    @Column(value = "cg_eng_port_dlog2_lu")
    private double cgEngPortDlog2Lu;

    @Column(value = "cg_eng_port_dlog3_name")
    private String cgEngPortDlog3Name;

    @Column(value = "cg_eng_port_dlog3_state")
    private String cgEngPortDlog3State;

    @Column(value = "cg_eng_port_dlog3_tx")
    private BigInteger cgEngPortDlog3Tx;

    @Column(value = "cg_eng_port_dlog3_rx")
    private BigInteger cgEngPortDlog3Rx;

    @Column(value = "cg_eng_port_dlog3_log")
    private BigInteger cgEngPortDlog3Log;

    @Column(value = "cg_eng_port_dlog3_good")
    private BigInteger cgEngPortDlog3Good;

    @Column(value = "cg_eng_port_dlog3_bad")
    private BigInteger cgEngPortDlog3Bad;

    @Column(value = "cg_eng_port_dlog3_bb")
    private BigInteger cgEngPortDlog3Bb;

    @Column(value = "cg_eng_port_dlog3_ld")
    private long cgEngPortDlog3Ld;

    @Column(value = "cg_eng_port_dlog3_lu")
    private double cgEngPortDlog3Lu;

    @Column(value = "cg_eng_port_dlog4_name")
    private String cgEngPortDlog4Name;

    @Column(value = "cg_eng_port_dlog4_state")
    private String cgEngPortDlog4State;

    @Column(value = "cg_eng_port_dlog4_tx")
    private BigInteger cgEngPortDlog4Tx;

    @Column(value = "cg_eng_port_dlog4_rx")
    private BigInteger cgEngPortDlog4Rx;

    @Column(value = "cg_eng_port_dlog4_log")
    private BigInteger cgEngPortDlog4Log;

    @Column(value = "cg_eng_port_dlog4_good")
    private BigInteger cgEngPortDlog4Good;

    @Column(value = "cg_eng_port_dlog4_bad")
    private BigInteger cgEngPortDlog4Bad;

    @Column(value = "cg_eng_port_dlog4_bb")
    private BigInteger cgEngPortDlog4Bb;

    @Column(value = "cg_eng_port_dlog4_ld")
    private long cgEngPortDlog4Ld;

    @Column(value = "cg_eng_port_dlog4_lu")
    private double cgEngPortDlog4Lu;

    @Column(value = "cg_eng_port_dlog5_name")
    private String cgEngPortDlog5Name;

    @Column(value = "cg_eng_port_dlog5_state")
    private String cgEngPortDlog5State;

    @Column(value = "cg_eng_port_dlog5_tx")
    private BigInteger cgEngPortDlog5Tx;

    @Column(value = "cg_eng_port_dlog5_rx")
    private BigInteger cgEngPortDlog5Rx;

    @Column(value = "cg_eng_port_dlog5_log")
    private BigInteger cgEngPortDlog5Log;

    @Column(value = "cg_eng_port_dlog5_good")
    private BigInteger cgEngPortDlog5Good;

    @Column(value = "cg_eng_port_dlog5_bad")
    private BigInteger cgEngPortDlog5Bad;

    @Column(value = "cg_eng_port_dlog5_bb")
    private BigInteger cgEngPortDlog5Bb;

    @Column(value = "cg_eng_port_dlog5_ld")
    private long cgEngPortDlog5Ld;

    @Column(value = "cg_eng_port_dlog5_lu")
    private double cgEngPortDlog5Lu;

    @Column(value = "cg_eng_port_dlog6_name")
    private String cgEngPortDlog6Name;

    @Column(value = "cg_eng_port_dlog6_state")
    private String cgEngPortDlog6State;

    @Column(value = "cg_eng_port_dlog6_tx")
    private BigInteger cgEngPortDlog6Tx;

    @Column(value = "cg_eng_port_dlog6_rx")
    private BigInteger cgEngPortDlog6Rx;

    @Column(value = "cg_eng_port_dlog6_log")
    private BigInteger cgEngPortDlog6Log;

    @Column(value = "cg_eng_port_dlog6_good")
    private BigInteger cgEngPortDlog6Good;

    @Column(value = "cg_eng_port_dlog6_bad")
    private BigInteger cgEngPortDlog6Bad;

    @Column(value = "cg_eng_port_dlog6_bb")
    private BigInteger cgEngPortDlog6Bb;

    @Column(value = "cg_eng_port_dlog6_ld")
    private long cgEngPortDlog6Ld;

    @Column(value = "cg_eng_port_dlog6_lu")
    private double cgEngPortDlog6Lu;

    @Column(value = "cg_eng_port_dlog7_name")
    private String cgEngPortDlog7Name;

    @Column(value = "cg_eng_port_dlog7_state")
    private String cgEngPortDlog7State;

    @Column(value = "cg_eng_port_dlog7_tx")
    private BigInteger cgEngPortDlog7Tx;

    @Column(value = "cg_eng_port_dlog7_rx")
    private BigInteger cgEngPortDlog7Rx;

    @Column(value = "cg_eng_port_dlog7_log")
    private BigInteger cgEngPortDlog7Log;

    @Column(value = "cg_eng_port_dlog7_good")
    private BigInteger cgEngPortDlog7Good;

    @Column(value = "cg_eng_port_dlog7_bad")
    private BigInteger cgEngPortDlog7Bad;

    @Column(value = "cg_eng_port_dlog7_bb")
    private BigInteger cgEngPortDlog7Bb;

    @Column(value = "cg_eng_port_dlog7_ld")
    private long cgEngPortDlog7Ld;

    @Column(value = "cg_eng_port_dlog7_lu")
    private double cgEngPortDlog7Lu;

    @Column(value = "cg_eng_port_dlog8_name")
    private String cgEngPortDlog8Name;

    @Column(value = "cg_eng_port_dlog8_state")
    private String cgEngPortDlog8State;

    @Column(value = "cg_eng_port_dlog8_tx")
    private BigInteger cgEngPortDlog8Tx;

    @Column(value = "cg_eng_port_dlog8_rx")
    private BigInteger cgEngPortDlog8Rx;

    @Column(value = "cg_eng_port_dlog8_log")
    private BigInteger cgEngPortDlog8Log;

    @Column(value = "cg_eng_port_dlog8_good")
    private BigInteger cgEngPortDlog8Good;

    @Column(value = "cg_eng_port_dlog8_bad")
    private BigInteger cgEngPortDlog8Bad;

    @Column(value = "cg_eng_port_dlog8_bb")
    private BigInteger cgEngPortDlog8Bb;

    @Column(value = "cg_eng_port_dlog8_ld")
    private long cgEngPortDlog8Ld;

    @Column(value = "cg_eng_port_dlog8_lu")
    private double cgEngPortDlog8Lu;

    @Column(value = "cg_eng_dmgrstatus_date")
    private String cgEngDmgrstatusDate;

    @Column(value = "cg_eng_dmgrstatus_time")
    private String cgEngDmgrstatusTime;

    @Column(value = "cg_eng_dmgrstatus_active")
    private int cgEngDmgrstatusActive;

    @Column(value = "cg_eng_dmgrstatus_started")
    private int cgEngDmgrstatusStarted;

    @Column(value = "cg_eng_dmgrstatus_halted")
    private int cgEngDmgrstatusHalted;

    @Column(value = "cg_eng_dmgrstatus_failed")
    private int cgEngDmgrstatusFailed;

    @Column(value = "cg_eng_dmgrstatus_map")
    private String cgEngDmgrstatusMap;

    @Column(value = "cg_eng_dmgrstatus_update")
    private float cgEngDmgrstatusUpdate;

    @Column(value = "cg_eng_port_dlog1_lc")
    private long cgEngPortDlog1Lc;

    @Column(value = "cg_eng_port_dlog2_lc")
    private long cgEngPortDlog2Lc;

    @Column(value = "cg_eng_port_dlog3_lc")
    private long cgEngPortDlog3Lc;

    @Column(value = "cg_eng_port_dlog4_lc")
    private long cgEngPortDlog4Lc;

    @Column(value = "cg_eng_port_dlog5_lc")
    private long cgEngPortDlog5Lc;

    @Column(value = "cg_eng_port_dlog6_lc")
    private long cgEngPortDlog6Lc;

    @Column(value = "cg_eng_port_dlog7_lc")
    private long cgEngPortDlog7Lc;

    @Column(value = "cg_eng_port_dlog8_lc")
    private long cgEngPortDlog8Lc;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setCgEngPlatformTime((String) particle.get("cg_eng_platform_time"));
        setCgEngPlatformUtime((double) particle.get("cg_eng_platform_utime"));
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
        setCgEngMsgCntsDGps((int) particle.get("cg_eng_msg_cnts_d_gps"));
        setCgEngMsgCntsDNtp((int) particle.get("cg_eng_msg_cnts_d_ntp"));
        setCgEngMsgCntsDPps((int) particle.get("cg_eng_msg_cnts_d_pps"));
        setCgEngMsgCntsDSuperv((int) particle.get("cg_eng_msg_cnts_d_superv"));
        setCgEngMsgCntsDDlogNgr((int) particle.get("cg_eng_msg_cnts_d_dlog_ngr"));
        setCgEngDclp1Enable((int) particle.get("cg_eng_dclp1_enable"));
        setCgEngDclp1Volt((float) particle.get("cg_eng_dclp1_volt"));
        setCgEngDclp1Current((float) particle.get("cg_eng_dclp1_current"));
        setCgEngDclp1Eflag((int) particle.get("cg_eng_dclp1_eflag"));
        setCgEngDclp1Vsel((int) particle.get("cg_eng_dclp1_vsel"));
        setCgEngDclp1Clim((int) particle.get("cg_eng_dclp1_clim"));
        setCgEngDclp1Prot((int) particle.get("cg_eng_dclp1_prot"));
        setCgEngDclp2Enable((int) particle.get("cg_eng_dclp2_enable"));
        setCgEngDclp2Volt((float) particle.get("cg_eng_dclp2_volt"));
        setCgEngDclp2Current((float) particle.get("cg_eng_dclp2_current"));
        setCgEngDclp2Eflag((int) particle.get("cg_eng_dclp2_eflag"));
        setCgEngDclp2Vsel((int) particle.get("cg_eng_dclp2_vsel"));
        setCgEngDclp2Clim((int) particle.get("cg_eng_dclp2_clim"));
        setCgEngDclp2Prot((int) particle.get("cg_eng_dclp2_prot"));
        setCgEngDclp3Enable((int) particle.get("cg_eng_dclp3_enable"));
        setCgEngDclp3Volt((float) particle.get("cg_eng_dclp3_volt"));
        setCgEngDclp3Current((float) particle.get("cg_eng_dclp3_current"));
        setCgEngDclp3Eflag((int) particle.get("cg_eng_dclp3_eflag"));
        setCgEngDclp3Vsel((int) particle.get("cg_eng_dclp3_vsel"));
        setCgEngDclp3Clim((int) particle.get("cg_eng_dclp3_clim"));
        setCgEngDclp3Prot((int) particle.get("cg_eng_dclp3_prot"));
        setCgEngDclp4Enable((int) particle.get("cg_eng_dclp4_enable"));
        setCgEngDclp4Volt((float) particle.get("cg_eng_dclp4_volt"));
        setCgEngDclp4Current((float) particle.get("cg_eng_dclp4_current"));
        setCgEngDclp4Eflag((int) particle.get("cg_eng_dclp4_eflag"));
        setCgEngDclp4Vsel((int) particle.get("cg_eng_dclp4_vsel"));
        setCgEngDclp4Clim((int) particle.get("cg_eng_dclp4_clim"));
        setCgEngDclp4Prot((int) particle.get("cg_eng_dclp4_prot"));
        setCgEngDclp5Enable((int) particle.get("cg_eng_dclp5_enable"));
        setCgEngDclp5Volt((float) particle.get("cg_eng_dclp5_volt"));
        setCgEngDclp5Current((float) particle.get("cg_eng_dclp5_current"));
        setCgEngDclp5Eflag((int) particle.get("cg_eng_dclp5_eflag"));
        setCgEngDclp5Vsel((int) particle.get("cg_eng_dclp5_vsel"));
        setCgEngDclp5Clim((int) particle.get("cg_eng_dclp5_clim"));
        setCgEngDclp5Prot((int) particle.get("cg_eng_dclp5_prot"));
        setCgEngDclp6Enable((int) particle.get("cg_eng_dclp6_enable"));
        setCgEngDclp6Volt((float) particle.get("cg_eng_dclp6_volt"));
        setCgEngDclp6Current((float) particle.get("cg_eng_dclp6_current"));
        setCgEngDclp6Eflag((int) particle.get("cg_eng_dclp6_eflag"));
        setCgEngDclp6Vsel((int) particle.get("cg_eng_dclp6_vsel"));
        setCgEngDclp6Clim((int) particle.get("cg_eng_dclp6_clim"));
        setCgEngDclp6Prot((int) particle.get("cg_eng_dclp6_prot"));
        setCgEngDclp7Enable((int) particle.get("cg_eng_dclp7_enable"));
        setCgEngDclp7Volt((float) particle.get("cg_eng_dclp7_volt"));
        setCgEngDclp7Current((float) particle.get("cg_eng_dclp7_current"));
        setCgEngDclp7Eflag((int) particle.get("cg_eng_dclp7_eflag"));
        setCgEngDclp7Vsel((int) particle.get("cg_eng_dclp7_vsel"));
        setCgEngDclp7Clim((int) particle.get("cg_eng_dclp7_clim"));
        setCgEngDclp7Prot((int) particle.get("cg_eng_dclp7_prot"));
        setCgEngDclp8Enable((int) particle.get("cg_eng_dclp8_enable"));
        setCgEngDclp8Volt((float) particle.get("cg_eng_dclp8_volt"));
        setCgEngDclp8Current((float) particle.get("cg_eng_dclp8_current"));
        setCgEngDclp8Eflag((int) particle.get("cg_eng_dclp8_eflag"));
        setCgEngDclp8Vsel((int) particle.get("cg_eng_dclp8_vsel"));
        setCgEngDclp8Clim((int) particle.get("cg_eng_dclp8_clim"));
        setCgEngDclp8Prot((int) particle.get("cg_eng_dclp8_prot"));
        setCgEngDclPortStatus((float) particle.get("cg_eng_dcl_port_status"));
        setCgEngPortDlog1Name((String) particle.get("cg_eng_port_dlog1_name"));
        setCgEngPortDlog1State((String) particle.get("cg_eng_port_dlog1_state"));
        setCgEngPortDlog1Tx((BigInteger) particle.get("cg_eng_port_dlog1_tx"));
        setCgEngPortDlog1Rx((BigInteger) particle.get("cg_eng_port_dlog1_rx"));
        setCgEngPortDlog1Log((BigInteger) particle.get("cg_eng_port_dlog1_log"));
        setCgEngPortDlog1Good((BigInteger) particle.get("cg_eng_port_dlog1_good"));
        setCgEngPortDlog1Bad((BigInteger) particle.get("cg_eng_port_dlog1_bad"));
        setCgEngPortDlog1Bb((BigInteger) particle.get("cg_eng_port_dlog1_bb"));
        setCgEngPortDlog1Ld((long) particle.get("cg_eng_port_dlog1_ld"));
        setCgEngPortDlog1Lu((double) particle.get("cg_eng_port_dlog1_lu"));
        setCgEngPortDlog2Name((String) particle.get("cg_eng_port_dlog2_name"));
        setCgEngPortDlog2State((String) particle.get("cg_eng_port_dlog2_state"));
        setCgEngPortDlog2Tx((BigInteger) particle.get("cg_eng_port_dlog2_tx"));
        setCgEngPortDlog2Rx((BigInteger) particle.get("cg_eng_port_dlog2_rx"));
        setCgEngPortDlog2Log((BigInteger) particle.get("cg_eng_port_dlog2_log"));
        setCgEngPortDlog2Good((BigInteger) particle.get("cg_eng_port_dlog2_good"));
        setCgEngPortDlog2Bad((BigInteger) particle.get("cg_eng_port_dlog2_bad"));
        setCgEngPortDlog2Bb((BigInteger) particle.get("cg_eng_port_dlog2_bb"));
        setCgEngPortDlog2Ld((long) particle.get("cg_eng_port_dlog2_ld"));
        setCgEngPortDlog2Lu((double) particle.get("cg_eng_port_dlog2_lu"));
        setCgEngPortDlog3Name((String) particle.get("cg_eng_port_dlog3_name"));
        setCgEngPortDlog3State((String) particle.get("cg_eng_port_dlog3_state"));
        setCgEngPortDlog3Tx((BigInteger) particle.get("cg_eng_port_dlog3_tx"));
        setCgEngPortDlog3Rx((BigInteger) particle.get("cg_eng_port_dlog3_rx"));
        setCgEngPortDlog3Log((BigInteger) particle.get("cg_eng_port_dlog3_log"));
        setCgEngPortDlog3Good((BigInteger) particle.get("cg_eng_port_dlog3_good"));
        setCgEngPortDlog3Bad((BigInteger) particle.get("cg_eng_port_dlog3_bad"));
        setCgEngPortDlog3Bb((BigInteger) particle.get("cg_eng_port_dlog3_bb"));
        setCgEngPortDlog3Ld((long) particle.get("cg_eng_port_dlog3_ld"));
        setCgEngPortDlog3Lu((double) particle.get("cg_eng_port_dlog3_lu"));
        setCgEngPortDlog4Name((String) particle.get("cg_eng_port_dlog4_name"));
        setCgEngPortDlog4State((String) particle.get("cg_eng_port_dlog4_state"));
        setCgEngPortDlog4Tx((BigInteger) particle.get("cg_eng_port_dlog4_tx"));
        setCgEngPortDlog4Rx((BigInteger) particle.get("cg_eng_port_dlog4_rx"));
        setCgEngPortDlog4Log((BigInteger) particle.get("cg_eng_port_dlog4_log"));
        setCgEngPortDlog4Good((BigInteger) particle.get("cg_eng_port_dlog4_good"));
        setCgEngPortDlog4Bad((BigInteger) particle.get("cg_eng_port_dlog4_bad"));
        setCgEngPortDlog4Bb((BigInteger) particle.get("cg_eng_port_dlog4_bb"));
        setCgEngPortDlog4Ld((long) particle.get("cg_eng_port_dlog4_ld"));
        setCgEngPortDlog4Lu((double) particle.get("cg_eng_port_dlog4_lu"));
        setCgEngPortDlog5Name((String) particle.get("cg_eng_port_dlog5_name"));
        setCgEngPortDlog5State((String) particle.get("cg_eng_port_dlog5_state"));
        setCgEngPortDlog5Tx((BigInteger) particle.get("cg_eng_port_dlog5_tx"));
        setCgEngPortDlog5Rx((BigInteger) particle.get("cg_eng_port_dlog5_rx"));
        setCgEngPortDlog5Log((BigInteger) particle.get("cg_eng_port_dlog5_log"));
        setCgEngPortDlog5Good((BigInteger) particle.get("cg_eng_port_dlog5_good"));
        setCgEngPortDlog5Bad((BigInteger) particle.get("cg_eng_port_dlog5_bad"));
        setCgEngPortDlog5Bb((BigInteger) particle.get("cg_eng_port_dlog5_bb"));
        setCgEngPortDlog5Ld((long) particle.get("cg_eng_port_dlog5_ld"));
        setCgEngPortDlog5Lu((double) particle.get("cg_eng_port_dlog5_lu"));
        setCgEngPortDlog6Name((String) particle.get("cg_eng_port_dlog6_name"));
        setCgEngPortDlog6State((String) particle.get("cg_eng_port_dlog6_state"));
        setCgEngPortDlog6Tx((BigInteger) particle.get("cg_eng_port_dlog6_tx"));
        setCgEngPortDlog6Rx((BigInteger) particle.get("cg_eng_port_dlog6_rx"));
        setCgEngPortDlog6Log((BigInteger) particle.get("cg_eng_port_dlog6_log"));
        setCgEngPortDlog6Good((BigInteger) particle.get("cg_eng_port_dlog6_good"));
        setCgEngPortDlog6Bad((BigInteger) particle.get("cg_eng_port_dlog6_bad"));
        setCgEngPortDlog6Bb((BigInteger) particle.get("cg_eng_port_dlog6_bb"));
        setCgEngPortDlog6Ld((long) particle.get("cg_eng_port_dlog6_ld"));
        setCgEngPortDlog6Lu((double) particle.get("cg_eng_port_dlog6_lu"));
        setCgEngPortDlog7Name((String) particle.get("cg_eng_port_dlog7_name"));
        setCgEngPortDlog7State((String) particle.get("cg_eng_port_dlog7_state"));
        setCgEngPortDlog7Tx((BigInteger) particle.get("cg_eng_port_dlog7_tx"));
        setCgEngPortDlog7Rx((BigInteger) particle.get("cg_eng_port_dlog7_rx"));
        setCgEngPortDlog7Log((BigInteger) particle.get("cg_eng_port_dlog7_log"));
        setCgEngPortDlog7Good((BigInteger) particle.get("cg_eng_port_dlog7_good"));
        setCgEngPortDlog7Bad((BigInteger) particle.get("cg_eng_port_dlog7_bad"));
        setCgEngPortDlog7Bb((BigInteger) particle.get("cg_eng_port_dlog7_bb"));
        setCgEngPortDlog7Ld((long) particle.get("cg_eng_port_dlog7_ld"));
        setCgEngPortDlog7Lu((double) particle.get("cg_eng_port_dlog7_lu"));
        setCgEngPortDlog8Name((String) particle.get("cg_eng_port_dlog8_name"));
        setCgEngPortDlog8State((String) particle.get("cg_eng_port_dlog8_state"));
        setCgEngPortDlog8Tx((BigInteger) particle.get("cg_eng_port_dlog8_tx"));
        setCgEngPortDlog8Rx((BigInteger) particle.get("cg_eng_port_dlog8_rx"));
        setCgEngPortDlog8Log((BigInteger) particle.get("cg_eng_port_dlog8_log"));
        setCgEngPortDlog8Good((BigInteger) particle.get("cg_eng_port_dlog8_good"));
        setCgEngPortDlog8Bad((BigInteger) particle.get("cg_eng_port_dlog8_bad"));
        setCgEngPortDlog8Bb((BigInteger) particle.get("cg_eng_port_dlog8_bb"));
        setCgEngPortDlog8Ld((long) particle.get("cg_eng_port_dlog8_ld"));
        setCgEngPortDlog8Lu((double) particle.get("cg_eng_port_dlog8_lu"));
        setCgEngDmgrstatusDate((String) particle.get("cg_eng_dmgrstatus_date"));
        setCgEngDmgrstatusTime((String) particle.get("cg_eng_dmgrstatus_time"));
        setCgEngDmgrstatusActive((int) particle.get("cg_eng_dmgrstatus_active"));
        setCgEngDmgrstatusStarted((int) particle.get("cg_eng_dmgrstatus_started"));
        setCgEngDmgrstatusHalted((int) particle.get("cg_eng_dmgrstatus_halted"));
        setCgEngDmgrstatusFailed((int) particle.get("cg_eng_dmgrstatus_failed"));
        setCgEngDmgrstatusMap((String) particle.get("cg_eng_dmgrstatus_map"));
        setCgEngDmgrstatusUpdate((float) particle.get("cg_eng_dmgrstatus_update"));
        setCgEngPortDlog1Lc((long) particle.get("cg_eng_port_dlog1_lc"));
        setCgEngPortDlog2Lc((long) particle.get("cg_eng_port_dlog2_lc"));
        setCgEngPortDlog3Lc((long) particle.get("cg_eng_port_dlog3_lc"));
        setCgEngPortDlog4Lc((long) particle.get("cg_eng_port_dlog4_lc"));
        setCgEngPortDlog5Lc((long) particle.get("cg_eng_port_dlog5_lc"));
        setCgEngPortDlog6Lc((long) particle.get("cg_eng_port_dlog6_lc"));
        setCgEngPortDlog7Lc((long) particle.get("cg_eng_port_dlog7_lc"));
        setCgEngPortDlog8Lc((long) particle.get("cg_eng_port_dlog8_lc"));
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
    public int getCgEngMsgCntsDGps() {
        return cgEngMsgCntsDGps;
    }

    public void setCgEngMsgCntsDGps(int cgEngMsgCntsDGps) {
        this.cgEngMsgCntsDGps = cgEngMsgCntsDGps;
    }
    public int getCgEngMsgCntsDNtp() {
        return cgEngMsgCntsDNtp;
    }

    public void setCgEngMsgCntsDNtp(int cgEngMsgCntsDNtp) {
        this.cgEngMsgCntsDNtp = cgEngMsgCntsDNtp;
    }
    public int getCgEngMsgCntsDPps() {
        return cgEngMsgCntsDPps;
    }

    public void setCgEngMsgCntsDPps(int cgEngMsgCntsDPps) {
        this.cgEngMsgCntsDPps = cgEngMsgCntsDPps;
    }
    public int getCgEngMsgCntsDSuperv() {
        return cgEngMsgCntsDSuperv;
    }

    public void setCgEngMsgCntsDSuperv(int cgEngMsgCntsDSuperv) {
        this.cgEngMsgCntsDSuperv = cgEngMsgCntsDSuperv;
    }
    public int getCgEngMsgCntsDDlogNgr() {
        return cgEngMsgCntsDDlogNgr;
    }

    public void setCgEngMsgCntsDDlogNgr(int cgEngMsgCntsDDlogNgr) {
        this.cgEngMsgCntsDDlogNgr = cgEngMsgCntsDDlogNgr;
    }
    public int getCgEngDclp1Enable() {
        return cgEngDclp1Enable;
    }

    public void setCgEngDclp1Enable(int cgEngDclp1Enable) {
        this.cgEngDclp1Enable = cgEngDclp1Enable;
    }
    public float getCgEngDclp1Volt() {
        return cgEngDclp1Volt;
    }

    public void setCgEngDclp1Volt(float cgEngDclp1Volt) {
        this.cgEngDclp1Volt = cgEngDclp1Volt;
    }
    public float getCgEngDclp1Current() {
        return cgEngDclp1Current;
    }

    public void setCgEngDclp1Current(float cgEngDclp1Current) {
        this.cgEngDclp1Current = cgEngDclp1Current;
    }
    public int getCgEngDclp1Eflag() {
        return cgEngDclp1Eflag;
    }

    public void setCgEngDclp1Eflag(int cgEngDclp1Eflag) {
        this.cgEngDclp1Eflag = cgEngDclp1Eflag;
    }
    public int getCgEngDclp1Vsel() {
        return cgEngDclp1Vsel;
    }

    public void setCgEngDclp1Vsel(int cgEngDclp1Vsel) {
        this.cgEngDclp1Vsel = cgEngDclp1Vsel;
    }
    public int getCgEngDclp1Clim() {
        return cgEngDclp1Clim;
    }

    public void setCgEngDclp1Clim(int cgEngDclp1Clim) {
        this.cgEngDclp1Clim = cgEngDclp1Clim;
    }
    public int getCgEngDclp1Prot() {
        return cgEngDclp1Prot;
    }

    public void setCgEngDclp1Prot(int cgEngDclp1Prot) {
        this.cgEngDclp1Prot = cgEngDclp1Prot;
    }
    public int getCgEngDclp2Enable() {
        return cgEngDclp2Enable;
    }

    public void setCgEngDclp2Enable(int cgEngDclp2Enable) {
        this.cgEngDclp2Enable = cgEngDclp2Enable;
    }
    public float getCgEngDclp2Volt() {
        return cgEngDclp2Volt;
    }

    public void setCgEngDclp2Volt(float cgEngDclp2Volt) {
        this.cgEngDclp2Volt = cgEngDclp2Volt;
    }
    public float getCgEngDclp2Current() {
        return cgEngDclp2Current;
    }

    public void setCgEngDclp2Current(float cgEngDclp2Current) {
        this.cgEngDclp2Current = cgEngDclp2Current;
    }
    public int getCgEngDclp2Eflag() {
        return cgEngDclp2Eflag;
    }

    public void setCgEngDclp2Eflag(int cgEngDclp2Eflag) {
        this.cgEngDclp2Eflag = cgEngDclp2Eflag;
    }
    public int getCgEngDclp2Vsel() {
        return cgEngDclp2Vsel;
    }

    public void setCgEngDclp2Vsel(int cgEngDclp2Vsel) {
        this.cgEngDclp2Vsel = cgEngDclp2Vsel;
    }
    public int getCgEngDclp2Clim() {
        return cgEngDclp2Clim;
    }

    public void setCgEngDclp2Clim(int cgEngDclp2Clim) {
        this.cgEngDclp2Clim = cgEngDclp2Clim;
    }
    public int getCgEngDclp2Prot() {
        return cgEngDclp2Prot;
    }

    public void setCgEngDclp2Prot(int cgEngDclp2Prot) {
        this.cgEngDclp2Prot = cgEngDclp2Prot;
    }
    public int getCgEngDclp3Enable() {
        return cgEngDclp3Enable;
    }

    public void setCgEngDclp3Enable(int cgEngDclp3Enable) {
        this.cgEngDclp3Enable = cgEngDclp3Enable;
    }
    public float getCgEngDclp3Volt() {
        return cgEngDclp3Volt;
    }

    public void setCgEngDclp3Volt(float cgEngDclp3Volt) {
        this.cgEngDclp3Volt = cgEngDclp3Volt;
    }
    public float getCgEngDclp3Current() {
        return cgEngDclp3Current;
    }

    public void setCgEngDclp3Current(float cgEngDclp3Current) {
        this.cgEngDclp3Current = cgEngDclp3Current;
    }
    public int getCgEngDclp3Eflag() {
        return cgEngDclp3Eflag;
    }

    public void setCgEngDclp3Eflag(int cgEngDclp3Eflag) {
        this.cgEngDclp3Eflag = cgEngDclp3Eflag;
    }
    public int getCgEngDclp3Vsel() {
        return cgEngDclp3Vsel;
    }

    public void setCgEngDclp3Vsel(int cgEngDclp3Vsel) {
        this.cgEngDclp3Vsel = cgEngDclp3Vsel;
    }
    public int getCgEngDclp3Clim() {
        return cgEngDclp3Clim;
    }

    public void setCgEngDclp3Clim(int cgEngDclp3Clim) {
        this.cgEngDclp3Clim = cgEngDclp3Clim;
    }
    public int getCgEngDclp3Prot() {
        return cgEngDclp3Prot;
    }

    public void setCgEngDclp3Prot(int cgEngDclp3Prot) {
        this.cgEngDclp3Prot = cgEngDclp3Prot;
    }
    public int getCgEngDclp4Enable() {
        return cgEngDclp4Enable;
    }

    public void setCgEngDclp4Enable(int cgEngDclp4Enable) {
        this.cgEngDclp4Enable = cgEngDclp4Enable;
    }
    public float getCgEngDclp4Volt() {
        return cgEngDclp4Volt;
    }

    public void setCgEngDclp4Volt(float cgEngDclp4Volt) {
        this.cgEngDclp4Volt = cgEngDclp4Volt;
    }
    public float getCgEngDclp4Current() {
        return cgEngDclp4Current;
    }

    public void setCgEngDclp4Current(float cgEngDclp4Current) {
        this.cgEngDclp4Current = cgEngDclp4Current;
    }
    public int getCgEngDclp4Eflag() {
        return cgEngDclp4Eflag;
    }

    public void setCgEngDclp4Eflag(int cgEngDclp4Eflag) {
        this.cgEngDclp4Eflag = cgEngDclp4Eflag;
    }
    public int getCgEngDclp4Vsel() {
        return cgEngDclp4Vsel;
    }

    public void setCgEngDclp4Vsel(int cgEngDclp4Vsel) {
        this.cgEngDclp4Vsel = cgEngDclp4Vsel;
    }
    public int getCgEngDclp4Clim() {
        return cgEngDclp4Clim;
    }

    public void setCgEngDclp4Clim(int cgEngDclp4Clim) {
        this.cgEngDclp4Clim = cgEngDclp4Clim;
    }
    public int getCgEngDclp4Prot() {
        return cgEngDclp4Prot;
    }

    public void setCgEngDclp4Prot(int cgEngDclp4Prot) {
        this.cgEngDclp4Prot = cgEngDclp4Prot;
    }
    public int getCgEngDclp5Enable() {
        return cgEngDclp5Enable;
    }

    public void setCgEngDclp5Enable(int cgEngDclp5Enable) {
        this.cgEngDclp5Enable = cgEngDclp5Enable;
    }
    public float getCgEngDclp5Volt() {
        return cgEngDclp5Volt;
    }

    public void setCgEngDclp5Volt(float cgEngDclp5Volt) {
        this.cgEngDclp5Volt = cgEngDclp5Volt;
    }
    public float getCgEngDclp5Current() {
        return cgEngDclp5Current;
    }

    public void setCgEngDclp5Current(float cgEngDclp5Current) {
        this.cgEngDclp5Current = cgEngDclp5Current;
    }
    public int getCgEngDclp5Eflag() {
        return cgEngDclp5Eflag;
    }

    public void setCgEngDclp5Eflag(int cgEngDclp5Eflag) {
        this.cgEngDclp5Eflag = cgEngDclp5Eflag;
    }
    public int getCgEngDclp5Vsel() {
        return cgEngDclp5Vsel;
    }

    public void setCgEngDclp5Vsel(int cgEngDclp5Vsel) {
        this.cgEngDclp5Vsel = cgEngDclp5Vsel;
    }
    public int getCgEngDclp5Clim() {
        return cgEngDclp5Clim;
    }

    public void setCgEngDclp5Clim(int cgEngDclp5Clim) {
        this.cgEngDclp5Clim = cgEngDclp5Clim;
    }
    public int getCgEngDclp5Prot() {
        return cgEngDclp5Prot;
    }

    public void setCgEngDclp5Prot(int cgEngDclp5Prot) {
        this.cgEngDclp5Prot = cgEngDclp5Prot;
    }
    public int getCgEngDclp6Enable() {
        return cgEngDclp6Enable;
    }

    public void setCgEngDclp6Enable(int cgEngDclp6Enable) {
        this.cgEngDclp6Enable = cgEngDclp6Enable;
    }
    public float getCgEngDclp6Volt() {
        return cgEngDclp6Volt;
    }

    public void setCgEngDclp6Volt(float cgEngDclp6Volt) {
        this.cgEngDclp6Volt = cgEngDclp6Volt;
    }
    public float getCgEngDclp6Current() {
        return cgEngDclp6Current;
    }

    public void setCgEngDclp6Current(float cgEngDclp6Current) {
        this.cgEngDclp6Current = cgEngDclp6Current;
    }
    public int getCgEngDclp6Eflag() {
        return cgEngDclp6Eflag;
    }

    public void setCgEngDclp6Eflag(int cgEngDclp6Eflag) {
        this.cgEngDclp6Eflag = cgEngDclp6Eflag;
    }
    public int getCgEngDclp6Vsel() {
        return cgEngDclp6Vsel;
    }

    public void setCgEngDclp6Vsel(int cgEngDclp6Vsel) {
        this.cgEngDclp6Vsel = cgEngDclp6Vsel;
    }
    public int getCgEngDclp6Clim() {
        return cgEngDclp6Clim;
    }

    public void setCgEngDclp6Clim(int cgEngDclp6Clim) {
        this.cgEngDclp6Clim = cgEngDclp6Clim;
    }
    public int getCgEngDclp6Prot() {
        return cgEngDclp6Prot;
    }

    public void setCgEngDclp6Prot(int cgEngDclp6Prot) {
        this.cgEngDclp6Prot = cgEngDclp6Prot;
    }
    public int getCgEngDclp7Enable() {
        return cgEngDclp7Enable;
    }

    public void setCgEngDclp7Enable(int cgEngDclp7Enable) {
        this.cgEngDclp7Enable = cgEngDclp7Enable;
    }
    public float getCgEngDclp7Volt() {
        return cgEngDclp7Volt;
    }

    public void setCgEngDclp7Volt(float cgEngDclp7Volt) {
        this.cgEngDclp7Volt = cgEngDclp7Volt;
    }
    public float getCgEngDclp7Current() {
        return cgEngDclp7Current;
    }

    public void setCgEngDclp7Current(float cgEngDclp7Current) {
        this.cgEngDclp7Current = cgEngDclp7Current;
    }
    public int getCgEngDclp7Eflag() {
        return cgEngDclp7Eflag;
    }

    public void setCgEngDclp7Eflag(int cgEngDclp7Eflag) {
        this.cgEngDclp7Eflag = cgEngDclp7Eflag;
    }
    public int getCgEngDclp7Vsel() {
        return cgEngDclp7Vsel;
    }

    public void setCgEngDclp7Vsel(int cgEngDclp7Vsel) {
        this.cgEngDclp7Vsel = cgEngDclp7Vsel;
    }
    public int getCgEngDclp7Clim() {
        return cgEngDclp7Clim;
    }

    public void setCgEngDclp7Clim(int cgEngDclp7Clim) {
        this.cgEngDclp7Clim = cgEngDclp7Clim;
    }
    public int getCgEngDclp7Prot() {
        return cgEngDclp7Prot;
    }

    public void setCgEngDclp7Prot(int cgEngDclp7Prot) {
        this.cgEngDclp7Prot = cgEngDclp7Prot;
    }
    public int getCgEngDclp8Enable() {
        return cgEngDclp8Enable;
    }

    public void setCgEngDclp8Enable(int cgEngDclp8Enable) {
        this.cgEngDclp8Enable = cgEngDclp8Enable;
    }
    public float getCgEngDclp8Volt() {
        return cgEngDclp8Volt;
    }

    public void setCgEngDclp8Volt(float cgEngDclp8Volt) {
        this.cgEngDclp8Volt = cgEngDclp8Volt;
    }
    public float getCgEngDclp8Current() {
        return cgEngDclp8Current;
    }

    public void setCgEngDclp8Current(float cgEngDclp8Current) {
        this.cgEngDclp8Current = cgEngDclp8Current;
    }
    public int getCgEngDclp8Eflag() {
        return cgEngDclp8Eflag;
    }

    public void setCgEngDclp8Eflag(int cgEngDclp8Eflag) {
        this.cgEngDclp8Eflag = cgEngDclp8Eflag;
    }
    public int getCgEngDclp8Vsel() {
        return cgEngDclp8Vsel;
    }

    public void setCgEngDclp8Vsel(int cgEngDclp8Vsel) {
        this.cgEngDclp8Vsel = cgEngDclp8Vsel;
    }
    public int getCgEngDclp8Clim() {
        return cgEngDclp8Clim;
    }

    public void setCgEngDclp8Clim(int cgEngDclp8Clim) {
        this.cgEngDclp8Clim = cgEngDclp8Clim;
    }
    public int getCgEngDclp8Prot() {
        return cgEngDclp8Prot;
    }

    public void setCgEngDclp8Prot(int cgEngDclp8Prot) {
        this.cgEngDclp8Prot = cgEngDclp8Prot;
    }
    public float getCgEngDclPortStatus() {
        return cgEngDclPortStatus;
    }

    public void setCgEngDclPortStatus(float cgEngDclPortStatus) {
        this.cgEngDclPortStatus = cgEngDclPortStatus;
    }
    public String getCgEngPortDlog1Name() {
        return cgEngPortDlog1Name;
    }

    public void setCgEngPortDlog1Name(String cgEngPortDlog1Name) {
        this.cgEngPortDlog1Name = cgEngPortDlog1Name;
    }
    public String getCgEngPortDlog1State() {
        return cgEngPortDlog1State;
    }

    public void setCgEngPortDlog1State(String cgEngPortDlog1State) {
        this.cgEngPortDlog1State = cgEngPortDlog1State;
    }
    public BigInteger getCgEngPortDlog1Tx() {
        return cgEngPortDlog1Tx;
    }

    public void setCgEngPortDlog1Tx(BigInteger cgEngPortDlog1Tx) {
        this.cgEngPortDlog1Tx = cgEngPortDlog1Tx;
    }
    public BigInteger getCgEngPortDlog1Rx() {
        return cgEngPortDlog1Rx;
    }

    public void setCgEngPortDlog1Rx(BigInteger cgEngPortDlog1Rx) {
        this.cgEngPortDlog1Rx = cgEngPortDlog1Rx;
    }
    public BigInteger getCgEngPortDlog1Log() {
        return cgEngPortDlog1Log;
    }

    public void setCgEngPortDlog1Log(BigInteger cgEngPortDlog1Log) {
        this.cgEngPortDlog1Log = cgEngPortDlog1Log;
    }
    public BigInteger getCgEngPortDlog1Good() {
        return cgEngPortDlog1Good;
    }

    public void setCgEngPortDlog1Good(BigInteger cgEngPortDlog1Good) {
        this.cgEngPortDlog1Good = cgEngPortDlog1Good;
    }
    public BigInteger getCgEngPortDlog1Bad() {
        return cgEngPortDlog1Bad;
    }

    public void setCgEngPortDlog1Bad(BigInteger cgEngPortDlog1Bad) {
        this.cgEngPortDlog1Bad = cgEngPortDlog1Bad;
    }
    public BigInteger getCgEngPortDlog1Bb() {
        return cgEngPortDlog1Bb;
    }

    public void setCgEngPortDlog1Bb(BigInteger cgEngPortDlog1Bb) {
        this.cgEngPortDlog1Bb = cgEngPortDlog1Bb;
    }
    public long getCgEngPortDlog1Ld() {
        return cgEngPortDlog1Ld;
    }

    public void setCgEngPortDlog1Ld(long cgEngPortDlog1Ld) {
        this.cgEngPortDlog1Ld = cgEngPortDlog1Ld;
    }
    public double getCgEngPortDlog1Lu() {
        return cgEngPortDlog1Lu;
    }

    public void setCgEngPortDlog1Lu(double cgEngPortDlog1Lu) {
        this.cgEngPortDlog1Lu = cgEngPortDlog1Lu;
    }
    public String getCgEngPortDlog2Name() {
        return cgEngPortDlog2Name;
    }

    public void setCgEngPortDlog2Name(String cgEngPortDlog2Name) {
        this.cgEngPortDlog2Name = cgEngPortDlog2Name;
    }
    public String getCgEngPortDlog2State() {
        return cgEngPortDlog2State;
    }

    public void setCgEngPortDlog2State(String cgEngPortDlog2State) {
        this.cgEngPortDlog2State = cgEngPortDlog2State;
    }
    public BigInteger getCgEngPortDlog2Tx() {
        return cgEngPortDlog2Tx;
    }

    public void setCgEngPortDlog2Tx(BigInteger cgEngPortDlog2Tx) {
        this.cgEngPortDlog2Tx = cgEngPortDlog2Tx;
    }
    public BigInteger getCgEngPortDlog2Rx() {
        return cgEngPortDlog2Rx;
    }

    public void setCgEngPortDlog2Rx(BigInteger cgEngPortDlog2Rx) {
        this.cgEngPortDlog2Rx = cgEngPortDlog2Rx;
    }
    public BigInteger getCgEngPortDlog2Log() {
        return cgEngPortDlog2Log;
    }

    public void setCgEngPortDlog2Log(BigInteger cgEngPortDlog2Log) {
        this.cgEngPortDlog2Log = cgEngPortDlog2Log;
    }
    public BigInteger getCgEngPortDlog2Good() {
        return cgEngPortDlog2Good;
    }

    public void setCgEngPortDlog2Good(BigInteger cgEngPortDlog2Good) {
        this.cgEngPortDlog2Good = cgEngPortDlog2Good;
    }
    public BigInteger getCgEngPortDlog2Bad() {
        return cgEngPortDlog2Bad;
    }

    public void setCgEngPortDlog2Bad(BigInteger cgEngPortDlog2Bad) {
        this.cgEngPortDlog2Bad = cgEngPortDlog2Bad;
    }
    public BigInteger getCgEngPortDlog2Bb() {
        return cgEngPortDlog2Bb;
    }

    public void setCgEngPortDlog2Bb(BigInteger cgEngPortDlog2Bb) {
        this.cgEngPortDlog2Bb = cgEngPortDlog2Bb;
    }
    public long getCgEngPortDlog2Ld() {
        return cgEngPortDlog2Ld;
    }

    public void setCgEngPortDlog2Ld(long cgEngPortDlog2Ld) {
        this.cgEngPortDlog2Ld = cgEngPortDlog2Ld;
    }
    public double getCgEngPortDlog2Lu() {
        return cgEngPortDlog2Lu;
    }

    public void setCgEngPortDlog2Lu(double cgEngPortDlog2Lu) {
        this.cgEngPortDlog2Lu = cgEngPortDlog2Lu;
    }
    public String getCgEngPortDlog3Name() {
        return cgEngPortDlog3Name;
    }

    public void setCgEngPortDlog3Name(String cgEngPortDlog3Name) {
        this.cgEngPortDlog3Name = cgEngPortDlog3Name;
    }
    public String getCgEngPortDlog3State() {
        return cgEngPortDlog3State;
    }

    public void setCgEngPortDlog3State(String cgEngPortDlog3State) {
        this.cgEngPortDlog3State = cgEngPortDlog3State;
    }
    public BigInteger getCgEngPortDlog3Tx() {
        return cgEngPortDlog3Tx;
    }

    public void setCgEngPortDlog3Tx(BigInteger cgEngPortDlog3Tx) {
        this.cgEngPortDlog3Tx = cgEngPortDlog3Tx;
    }
    public BigInteger getCgEngPortDlog3Rx() {
        return cgEngPortDlog3Rx;
    }

    public void setCgEngPortDlog3Rx(BigInteger cgEngPortDlog3Rx) {
        this.cgEngPortDlog3Rx = cgEngPortDlog3Rx;
    }
    public BigInteger getCgEngPortDlog3Log() {
        return cgEngPortDlog3Log;
    }

    public void setCgEngPortDlog3Log(BigInteger cgEngPortDlog3Log) {
        this.cgEngPortDlog3Log = cgEngPortDlog3Log;
    }
    public BigInteger getCgEngPortDlog3Good() {
        return cgEngPortDlog3Good;
    }

    public void setCgEngPortDlog3Good(BigInteger cgEngPortDlog3Good) {
        this.cgEngPortDlog3Good = cgEngPortDlog3Good;
    }
    public BigInteger getCgEngPortDlog3Bad() {
        return cgEngPortDlog3Bad;
    }

    public void setCgEngPortDlog3Bad(BigInteger cgEngPortDlog3Bad) {
        this.cgEngPortDlog3Bad = cgEngPortDlog3Bad;
    }
    public BigInteger getCgEngPortDlog3Bb() {
        return cgEngPortDlog3Bb;
    }

    public void setCgEngPortDlog3Bb(BigInteger cgEngPortDlog3Bb) {
        this.cgEngPortDlog3Bb = cgEngPortDlog3Bb;
    }
    public long getCgEngPortDlog3Ld() {
        return cgEngPortDlog3Ld;
    }

    public void setCgEngPortDlog3Ld(long cgEngPortDlog3Ld) {
        this.cgEngPortDlog3Ld = cgEngPortDlog3Ld;
    }
    public double getCgEngPortDlog3Lu() {
        return cgEngPortDlog3Lu;
    }

    public void setCgEngPortDlog3Lu(double cgEngPortDlog3Lu) {
        this.cgEngPortDlog3Lu = cgEngPortDlog3Lu;
    }
    public String getCgEngPortDlog4Name() {
        return cgEngPortDlog4Name;
    }

    public void setCgEngPortDlog4Name(String cgEngPortDlog4Name) {
        this.cgEngPortDlog4Name = cgEngPortDlog4Name;
    }
    public String getCgEngPortDlog4State() {
        return cgEngPortDlog4State;
    }

    public void setCgEngPortDlog4State(String cgEngPortDlog4State) {
        this.cgEngPortDlog4State = cgEngPortDlog4State;
    }
    public BigInteger getCgEngPortDlog4Tx() {
        return cgEngPortDlog4Tx;
    }

    public void setCgEngPortDlog4Tx(BigInteger cgEngPortDlog4Tx) {
        this.cgEngPortDlog4Tx = cgEngPortDlog4Tx;
    }
    public BigInteger getCgEngPortDlog4Rx() {
        return cgEngPortDlog4Rx;
    }

    public void setCgEngPortDlog4Rx(BigInteger cgEngPortDlog4Rx) {
        this.cgEngPortDlog4Rx = cgEngPortDlog4Rx;
    }
    public BigInteger getCgEngPortDlog4Log() {
        return cgEngPortDlog4Log;
    }

    public void setCgEngPortDlog4Log(BigInteger cgEngPortDlog4Log) {
        this.cgEngPortDlog4Log = cgEngPortDlog4Log;
    }
    public BigInteger getCgEngPortDlog4Good() {
        return cgEngPortDlog4Good;
    }

    public void setCgEngPortDlog4Good(BigInteger cgEngPortDlog4Good) {
        this.cgEngPortDlog4Good = cgEngPortDlog4Good;
    }
    public BigInteger getCgEngPortDlog4Bad() {
        return cgEngPortDlog4Bad;
    }

    public void setCgEngPortDlog4Bad(BigInteger cgEngPortDlog4Bad) {
        this.cgEngPortDlog4Bad = cgEngPortDlog4Bad;
    }
    public BigInteger getCgEngPortDlog4Bb() {
        return cgEngPortDlog4Bb;
    }

    public void setCgEngPortDlog4Bb(BigInteger cgEngPortDlog4Bb) {
        this.cgEngPortDlog4Bb = cgEngPortDlog4Bb;
    }
    public long getCgEngPortDlog4Ld() {
        return cgEngPortDlog4Ld;
    }

    public void setCgEngPortDlog4Ld(long cgEngPortDlog4Ld) {
        this.cgEngPortDlog4Ld = cgEngPortDlog4Ld;
    }
    public double getCgEngPortDlog4Lu() {
        return cgEngPortDlog4Lu;
    }

    public void setCgEngPortDlog4Lu(double cgEngPortDlog4Lu) {
        this.cgEngPortDlog4Lu = cgEngPortDlog4Lu;
    }
    public String getCgEngPortDlog5Name() {
        return cgEngPortDlog5Name;
    }

    public void setCgEngPortDlog5Name(String cgEngPortDlog5Name) {
        this.cgEngPortDlog5Name = cgEngPortDlog5Name;
    }
    public String getCgEngPortDlog5State() {
        return cgEngPortDlog5State;
    }

    public void setCgEngPortDlog5State(String cgEngPortDlog5State) {
        this.cgEngPortDlog5State = cgEngPortDlog5State;
    }
    public BigInteger getCgEngPortDlog5Tx() {
        return cgEngPortDlog5Tx;
    }

    public void setCgEngPortDlog5Tx(BigInteger cgEngPortDlog5Tx) {
        this.cgEngPortDlog5Tx = cgEngPortDlog5Tx;
    }
    public BigInteger getCgEngPortDlog5Rx() {
        return cgEngPortDlog5Rx;
    }

    public void setCgEngPortDlog5Rx(BigInteger cgEngPortDlog5Rx) {
        this.cgEngPortDlog5Rx = cgEngPortDlog5Rx;
    }
    public BigInteger getCgEngPortDlog5Log() {
        return cgEngPortDlog5Log;
    }

    public void setCgEngPortDlog5Log(BigInteger cgEngPortDlog5Log) {
        this.cgEngPortDlog5Log = cgEngPortDlog5Log;
    }
    public BigInteger getCgEngPortDlog5Good() {
        return cgEngPortDlog5Good;
    }

    public void setCgEngPortDlog5Good(BigInteger cgEngPortDlog5Good) {
        this.cgEngPortDlog5Good = cgEngPortDlog5Good;
    }
    public BigInteger getCgEngPortDlog5Bad() {
        return cgEngPortDlog5Bad;
    }

    public void setCgEngPortDlog5Bad(BigInteger cgEngPortDlog5Bad) {
        this.cgEngPortDlog5Bad = cgEngPortDlog5Bad;
    }
    public BigInteger getCgEngPortDlog5Bb() {
        return cgEngPortDlog5Bb;
    }

    public void setCgEngPortDlog5Bb(BigInteger cgEngPortDlog5Bb) {
        this.cgEngPortDlog5Bb = cgEngPortDlog5Bb;
    }
    public long getCgEngPortDlog5Ld() {
        return cgEngPortDlog5Ld;
    }

    public void setCgEngPortDlog5Ld(long cgEngPortDlog5Ld) {
        this.cgEngPortDlog5Ld = cgEngPortDlog5Ld;
    }
    public double getCgEngPortDlog5Lu() {
        return cgEngPortDlog5Lu;
    }

    public void setCgEngPortDlog5Lu(double cgEngPortDlog5Lu) {
        this.cgEngPortDlog5Lu = cgEngPortDlog5Lu;
    }
    public String getCgEngPortDlog6Name() {
        return cgEngPortDlog6Name;
    }

    public void setCgEngPortDlog6Name(String cgEngPortDlog6Name) {
        this.cgEngPortDlog6Name = cgEngPortDlog6Name;
    }
    public String getCgEngPortDlog6State() {
        return cgEngPortDlog6State;
    }

    public void setCgEngPortDlog6State(String cgEngPortDlog6State) {
        this.cgEngPortDlog6State = cgEngPortDlog6State;
    }
    public BigInteger getCgEngPortDlog6Tx() {
        return cgEngPortDlog6Tx;
    }

    public void setCgEngPortDlog6Tx(BigInteger cgEngPortDlog6Tx) {
        this.cgEngPortDlog6Tx = cgEngPortDlog6Tx;
    }
    public BigInteger getCgEngPortDlog6Rx() {
        return cgEngPortDlog6Rx;
    }

    public void setCgEngPortDlog6Rx(BigInteger cgEngPortDlog6Rx) {
        this.cgEngPortDlog6Rx = cgEngPortDlog6Rx;
    }
    public BigInteger getCgEngPortDlog6Log() {
        return cgEngPortDlog6Log;
    }

    public void setCgEngPortDlog6Log(BigInteger cgEngPortDlog6Log) {
        this.cgEngPortDlog6Log = cgEngPortDlog6Log;
    }
    public BigInteger getCgEngPortDlog6Good() {
        return cgEngPortDlog6Good;
    }

    public void setCgEngPortDlog6Good(BigInteger cgEngPortDlog6Good) {
        this.cgEngPortDlog6Good = cgEngPortDlog6Good;
    }
    public BigInteger getCgEngPortDlog6Bad() {
        return cgEngPortDlog6Bad;
    }

    public void setCgEngPortDlog6Bad(BigInteger cgEngPortDlog6Bad) {
        this.cgEngPortDlog6Bad = cgEngPortDlog6Bad;
    }
    public BigInteger getCgEngPortDlog6Bb() {
        return cgEngPortDlog6Bb;
    }

    public void setCgEngPortDlog6Bb(BigInteger cgEngPortDlog6Bb) {
        this.cgEngPortDlog6Bb = cgEngPortDlog6Bb;
    }
    public long getCgEngPortDlog6Ld() {
        return cgEngPortDlog6Ld;
    }

    public void setCgEngPortDlog6Ld(long cgEngPortDlog6Ld) {
        this.cgEngPortDlog6Ld = cgEngPortDlog6Ld;
    }
    public double getCgEngPortDlog6Lu() {
        return cgEngPortDlog6Lu;
    }

    public void setCgEngPortDlog6Lu(double cgEngPortDlog6Lu) {
        this.cgEngPortDlog6Lu = cgEngPortDlog6Lu;
    }
    public String getCgEngPortDlog7Name() {
        return cgEngPortDlog7Name;
    }

    public void setCgEngPortDlog7Name(String cgEngPortDlog7Name) {
        this.cgEngPortDlog7Name = cgEngPortDlog7Name;
    }
    public String getCgEngPortDlog7State() {
        return cgEngPortDlog7State;
    }

    public void setCgEngPortDlog7State(String cgEngPortDlog7State) {
        this.cgEngPortDlog7State = cgEngPortDlog7State;
    }
    public BigInteger getCgEngPortDlog7Tx() {
        return cgEngPortDlog7Tx;
    }

    public void setCgEngPortDlog7Tx(BigInteger cgEngPortDlog7Tx) {
        this.cgEngPortDlog7Tx = cgEngPortDlog7Tx;
    }
    public BigInteger getCgEngPortDlog7Rx() {
        return cgEngPortDlog7Rx;
    }

    public void setCgEngPortDlog7Rx(BigInteger cgEngPortDlog7Rx) {
        this.cgEngPortDlog7Rx = cgEngPortDlog7Rx;
    }
    public BigInteger getCgEngPortDlog7Log() {
        return cgEngPortDlog7Log;
    }

    public void setCgEngPortDlog7Log(BigInteger cgEngPortDlog7Log) {
        this.cgEngPortDlog7Log = cgEngPortDlog7Log;
    }
    public BigInteger getCgEngPortDlog7Good() {
        return cgEngPortDlog7Good;
    }

    public void setCgEngPortDlog7Good(BigInteger cgEngPortDlog7Good) {
        this.cgEngPortDlog7Good = cgEngPortDlog7Good;
    }
    public BigInteger getCgEngPortDlog7Bad() {
        return cgEngPortDlog7Bad;
    }

    public void setCgEngPortDlog7Bad(BigInteger cgEngPortDlog7Bad) {
        this.cgEngPortDlog7Bad = cgEngPortDlog7Bad;
    }
    public BigInteger getCgEngPortDlog7Bb() {
        return cgEngPortDlog7Bb;
    }

    public void setCgEngPortDlog7Bb(BigInteger cgEngPortDlog7Bb) {
        this.cgEngPortDlog7Bb = cgEngPortDlog7Bb;
    }
    public long getCgEngPortDlog7Ld() {
        return cgEngPortDlog7Ld;
    }

    public void setCgEngPortDlog7Ld(long cgEngPortDlog7Ld) {
        this.cgEngPortDlog7Ld = cgEngPortDlog7Ld;
    }
    public double getCgEngPortDlog7Lu() {
        return cgEngPortDlog7Lu;
    }

    public void setCgEngPortDlog7Lu(double cgEngPortDlog7Lu) {
        this.cgEngPortDlog7Lu = cgEngPortDlog7Lu;
    }
    public String getCgEngPortDlog8Name() {
        return cgEngPortDlog8Name;
    }

    public void setCgEngPortDlog8Name(String cgEngPortDlog8Name) {
        this.cgEngPortDlog8Name = cgEngPortDlog8Name;
    }
    public String getCgEngPortDlog8State() {
        return cgEngPortDlog8State;
    }

    public void setCgEngPortDlog8State(String cgEngPortDlog8State) {
        this.cgEngPortDlog8State = cgEngPortDlog8State;
    }
    public BigInteger getCgEngPortDlog8Tx() {
        return cgEngPortDlog8Tx;
    }

    public void setCgEngPortDlog8Tx(BigInteger cgEngPortDlog8Tx) {
        this.cgEngPortDlog8Tx = cgEngPortDlog8Tx;
    }
    public BigInteger getCgEngPortDlog8Rx() {
        return cgEngPortDlog8Rx;
    }

    public void setCgEngPortDlog8Rx(BigInteger cgEngPortDlog8Rx) {
        this.cgEngPortDlog8Rx = cgEngPortDlog8Rx;
    }
    public BigInteger getCgEngPortDlog8Log() {
        return cgEngPortDlog8Log;
    }

    public void setCgEngPortDlog8Log(BigInteger cgEngPortDlog8Log) {
        this.cgEngPortDlog8Log = cgEngPortDlog8Log;
    }
    public BigInteger getCgEngPortDlog8Good() {
        return cgEngPortDlog8Good;
    }

    public void setCgEngPortDlog8Good(BigInteger cgEngPortDlog8Good) {
        this.cgEngPortDlog8Good = cgEngPortDlog8Good;
    }
    public BigInteger getCgEngPortDlog8Bad() {
        return cgEngPortDlog8Bad;
    }

    public void setCgEngPortDlog8Bad(BigInteger cgEngPortDlog8Bad) {
        this.cgEngPortDlog8Bad = cgEngPortDlog8Bad;
    }
    public BigInteger getCgEngPortDlog8Bb() {
        return cgEngPortDlog8Bb;
    }

    public void setCgEngPortDlog8Bb(BigInteger cgEngPortDlog8Bb) {
        this.cgEngPortDlog8Bb = cgEngPortDlog8Bb;
    }
    public long getCgEngPortDlog8Ld() {
        return cgEngPortDlog8Ld;
    }

    public void setCgEngPortDlog8Ld(long cgEngPortDlog8Ld) {
        this.cgEngPortDlog8Ld = cgEngPortDlog8Ld;
    }
    public double getCgEngPortDlog8Lu() {
        return cgEngPortDlog8Lu;
    }

    public void setCgEngPortDlog8Lu(double cgEngPortDlog8Lu) {
        this.cgEngPortDlog8Lu = cgEngPortDlog8Lu;
    }
    public String getCgEngDmgrstatusDate() {
        return cgEngDmgrstatusDate;
    }

    public void setCgEngDmgrstatusDate(String cgEngDmgrstatusDate) {
        this.cgEngDmgrstatusDate = cgEngDmgrstatusDate;
    }
    public String getCgEngDmgrstatusTime() {
        return cgEngDmgrstatusTime;
    }

    public void setCgEngDmgrstatusTime(String cgEngDmgrstatusTime) {
        this.cgEngDmgrstatusTime = cgEngDmgrstatusTime;
    }
    public int getCgEngDmgrstatusActive() {
        return cgEngDmgrstatusActive;
    }

    public void setCgEngDmgrstatusActive(int cgEngDmgrstatusActive) {
        this.cgEngDmgrstatusActive = cgEngDmgrstatusActive;
    }
    public int getCgEngDmgrstatusStarted() {
        return cgEngDmgrstatusStarted;
    }

    public void setCgEngDmgrstatusStarted(int cgEngDmgrstatusStarted) {
        this.cgEngDmgrstatusStarted = cgEngDmgrstatusStarted;
    }
    public int getCgEngDmgrstatusHalted() {
        return cgEngDmgrstatusHalted;
    }

    public void setCgEngDmgrstatusHalted(int cgEngDmgrstatusHalted) {
        this.cgEngDmgrstatusHalted = cgEngDmgrstatusHalted;
    }
    public int getCgEngDmgrstatusFailed() {
        return cgEngDmgrstatusFailed;
    }

    public void setCgEngDmgrstatusFailed(int cgEngDmgrstatusFailed) {
        this.cgEngDmgrstatusFailed = cgEngDmgrstatusFailed;
    }
    public String getCgEngDmgrstatusMap() {
        return cgEngDmgrstatusMap;
    }

    public void setCgEngDmgrstatusMap(String cgEngDmgrstatusMap) {
        this.cgEngDmgrstatusMap = cgEngDmgrstatusMap;
    }
    public float getCgEngDmgrstatusUpdate() {
        return cgEngDmgrstatusUpdate;
    }

    public void setCgEngDmgrstatusUpdate(float cgEngDmgrstatusUpdate) {
        this.cgEngDmgrstatusUpdate = cgEngDmgrstatusUpdate;
    }
    public long getCgEngPortDlog1Lc() {
        return cgEngPortDlog1Lc;
    }

    public void setCgEngPortDlog1Lc(long cgEngPortDlog1Lc) {
        this.cgEngPortDlog1Lc = cgEngPortDlog1Lc;
    }
    public long getCgEngPortDlog2Lc() {
        return cgEngPortDlog2Lc;
    }

    public void setCgEngPortDlog2Lc(long cgEngPortDlog2Lc) {
        this.cgEngPortDlog2Lc = cgEngPortDlog2Lc;
    }
    public long getCgEngPortDlog3Lc() {
        return cgEngPortDlog3Lc;
    }

    public void setCgEngPortDlog3Lc(long cgEngPortDlog3Lc) {
        this.cgEngPortDlog3Lc = cgEngPortDlog3Lc;
    }
    public long getCgEngPortDlog4Lc() {
        return cgEngPortDlog4Lc;
    }

    public void setCgEngPortDlog4Lc(long cgEngPortDlog4Lc) {
        this.cgEngPortDlog4Lc = cgEngPortDlog4Lc;
    }
    public long getCgEngPortDlog5Lc() {
        return cgEngPortDlog5Lc;
    }

    public void setCgEngPortDlog5Lc(long cgEngPortDlog5Lc) {
        this.cgEngPortDlog5Lc = cgEngPortDlog5Lc;
    }
    public long getCgEngPortDlog6Lc() {
        return cgEngPortDlog6Lc;
    }

    public void setCgEngPortDlog6Lc(long cgEngPortDlog6Lc) {
        this.cgEngPortDlog6Lc = cgEngPortDlog6Lc;
    }
    public long getCgEngPortDlog7Lc() {
        return cgEngPortDlog7Lc;
    }

    public void setCgEngPortDlog7Lc(long cgEngPortDlog7Lc) {
        this.cgEngPortDlog7Lc = cgEngPortDlog7Lc;
    }
    public long getCgEngPortDlog8Lc() {
        return cgEngPortDlog8Lc;
    }

    public void setCgEngPortDlog8Lc(long cgEngPortDlog8Lc) {
        this.cgEngPortDlog8Lc = cgEngPortDlog8Lc;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}