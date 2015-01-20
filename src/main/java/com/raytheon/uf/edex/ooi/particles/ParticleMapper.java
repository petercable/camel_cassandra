package com.raytheon.uf.edex.ooi.particles;

import com.raytheon.uf.edex.ooi.particles.tables.*;

import java.util.Map;
import java.util.TreeMap;

public class ParticleMapper {

    private ParticleMapper() {}

    public static Map<String, Class<? extends CassandraParticle>> build() {
        Map<String, Class<? extends CassandraParticle>> map = new TreeMap<>();
        map.put("D1000_sample", D1000Sample.class);
        map.put("Xadcps_jln_instrument", XadcpsJlnInstrument.class);
        map.put("adcp_ancillary_system_data", AdcpAncillarySystemData.class);
        map.put("adcp_compass_calibration", AdcpCompassCalibration.class);
        map.put("adcp_pd0_beam_parsed", AdcpPd0BeamParsed.class);
        map.put("adcp_pd0_earth_parsed", AdcpPd0EarthParsed.class);
        map.put("adcp_pd12_parsed", AdcpPd12Parsed.class);
        map.put("adcp_system_configuration", AdcpSystemConfiguration.class);
        map.put("adcp_transmit_path", AdcpTransmitPath.class);
        map.put("adcp_waves_parsed", AdcpWavesParsed.class);
        map.put("adcpa_m_glider_instrument", AdcpaMGliderInstrument.class);
        map.put("adcpa_m_glider_recovered", AdcpaMGliderRecovered.class);
        map.put("adcps_jln_beam_instrument", AdcpsJlnBeamInstrument.class);
        map.put("adcps_jln_instrument", AdcpsJlnInstrument.class);
        map.put("adcps_jln_sio_mule_instrument", AdcpsJlnSioMuleInstrument.class);
        map.put("adcps_jln_stc_instrument", AdcpsJlnStcInstrument.class);
        map.put("adcps_jln_stc_instrument_recovered", AdcpsJlnStcInstrumentRecovered.class);
        map.put("adcps_jln_stc_metadata", AdcpsJlnStcMetadata.class);
        map.put("adcps_jln_stc_metadata_recovered", AdcpsJlnStcMetadataRecovered.class);
        map.put("adcps_parsed", AdcpsParsed.class);
        map.put("adcpt_acfgm_dcl_instrument", AdcptAcfgmDclInstrument.class);
        map.put("adcpt_acfgm_dcl_instrument_recovered", AdcptAcfgmDclInstrumentRecovered.class);
        map.put("adcpt_acfgm_pd0_beam_dcl_instrument", AdcptAcfgmPd0BeamDclInstrument.class);
        map.put("adcpt_acfgm_pd0_beam_dcl_instrument_recovered", AdcptAcfgmPd0BeamDclInstrumentRecovered.class);
        map.put("adcpt_acfgm_pd0_dcl_instrument", AdcptAcfgmPd0DclInstrument.class);
        map.put("adcpt_acfgm_pd0_dcl_instrument_recovered", AdcptAcfgmPd0DclInstrumentRecovered.class);
        map.put("adcpt_acfgm_pd8_dcl_instrument", AdcptAcfgmPd8DclInstrument.class);
        map.put("adcpt_acfgm_pd8_dcl_instrument_recovered", AdcptAcfgmPd8DclInstrumentRecovered.class);
        map.put("adcpt_m_instrument_dspec_recovered", AdcptMInstrumentDspecRecovered.class);
        map.put("adcpt_m_instrument_fcoeff_recovered", AdcptMInstrumentFcoeffRecovered.class);
        map.put("adcpt_m_instrument_log9_recovered", AdcptMInstrumentLog9Recovered.class);
        map.put("adcpt_m_wvs_recovered", AdcptMWvsRecovered.class);
        map.put("antelope_orb_packet_bhe", AntelopeOrbPacketBhe.class);
        map.put("antelope_orb_packet_bhn", AntelopeOrbPacketBhn.class);
        map.put("antelope_orb_packet_bhz", AntelopeOrbPacketBhz.class);
        map.put("antelope_orb_packet_ehe", AntelopeOrbPacketEhe.class);
        map.put("antelope_orb_packet_ehn", AntelopeOrbPacketEhn.class);
        map.put("antelope_orb_packet_ehz", AntelopeOrbPacketEhz.class);
        map.put("antelope_orb_packet_hdh", AntelopeOrbPacketHdh.class);
        map.put("antelope_orb_packet_hhe", AntelopeOrbPacketHhe.class);
        map.put("antelope_orb_packet_hhn", AntelopeOrbPacketHhn.class);
        map.put("antelope_orb_packet_hhz", AntelopeOrbPacketHhz.class);
        map.put("antelope_orb_packet_hne", AntelopeOrbPacketHne.class);
        map.put("antelope_orb_packet_hnn", AntelopeOrbPacketHnn.class);
        map.put("antelope_orb_packet_hnz", AntelopeOrbPacketHnz.class);
        map.put("antelope_orb_packet_ldh", AntelopeOrbPacketLdh.class);
        map.put("antelope_orb_packet_lhe", AntelopeOrbPacketLhe.class);
        map.put("antelope_orb_packet_lhn", AntelopeOrbPacketLhn.class);
        map.put("antelope_orb_packet_lhz", AntelopeOrbPacketLhz.class);
        map.put("antelope_orb_packet_mhe", AntelopeOrbPacketMhe.class);
        map.put("antelope_orb_packet_mhn", AntelopeOrbPacketMhn.class);
        map.put("antelope_orb_packet_mhz", AntelopeOrbPacketMhz.class);
        map.put("antelope_orb_packet_xdh", AntelopeOrbPacketXdh.class);
        map.put("antelope_orb_packet_ydh", AntelopeOrbPacketYdh.class);
        map.put("botpt_heat_sample", BotptHeatSample.class);
        map.put("botpt_iris_sample", BotptIrisSample.class);
        map.put("botpt_lily_leveling", BotptLilyLeveling.class);
        map.put("botpt_lily_sample", BotptLilySample.class);
        map.put("botpt_nano_sample", BotptNanoSample.class);
        map.put("botpt_status", BotptStatus.class);
        map.put("botpt_syst_sample", BotptSystSample.class);
        map.put("calibration_status", CalibrationStatus.class);
        map.put("camds_disk_status", CamdsDiskStatus.class);
        map.put("camds_health_status", CamdsHealthStatus.class);
        map.put("camds_image_metadata", CamdsImageMetadata.class);
        map.put("camds_video", CamdsVideo.class);
        map.put("cg_cpm_eng_cpm", CgCpmEngCpm.class);
        map.put("cg_cpm_eng_cpm_recovered", CgCpmEngCpmRecovered.class);
        map.put("cg_dcl_eng_dcl_cpu_uptime", CgDclEngDclCpuUptime.class);
        map.put("cg_dcl_eng_dcl_cpu_uptime_recovered", CgDclEngDclCpuUptimeRecovered.class);
        map.put("cg_dcl_eng_dcl_dlog_aarm", CgDclEngDclDlogAarm.class);
        map.put("cg_dcl_eng_dcl_dlog_aarm_recovered", CgDclEngDclDlogAarmRecovered.class);
        map.put("cg_dcl_eng_dcl_dlog_mgr", CgDclEngDclDlogMgr.class);
        map.put("cg_dcl_eng_dcl_dlog_mgr_recovered", CgDclEngDclDlogMgrRecovered.class);
        map.put("cg_dcl_eng_dcl_dlog_status", CgDclEngDclDlogStatus.class);
        map.put("cg_dcl_eng_dcl_dlog_status_recovered", CgDclEngDclDlogStatusRecovered.class);
        map.put("cg_dcl_eng_dcl_error", CgDclEngDclError.class);
        map.put("cg_dcl_eng_dcl_error_recovered", CgDclEngDclErrorRecovered.class);
        map.put("cg_dcl_eng_dcl_gps", CgDclEngDclGps.class);
        map.put("cg_dcl_eng_dcl_gps_recovered", CgDclEngDclGpsRecovered.class);
        map.put("cg_dcl_eng_dcl_msg_counts", CgDclEngDclMsgCounts.class);
        map.put("cg_dcl_eng_dcl_msg_counts_recovered", CgDclEngDclMsgCountsRecovered.class);
        map.put("cg_dcl_eng_dcl_pps", CgDclEngDclPps.class);
        map.put("cg_dcl_eng_dcl_pps_recovered", CgDclEngDclPpsRecovered.class);
        map.put("cg_dcl_eng_dcl_status", CgDclEngDclStatus.class);
        map.put("cg_dcl_eng_dcl_status_recovered", CgDclEngDclStatusRecovered.class);
        map.put("cg_dcl_eng_dcl_superv", CgDclEngDclSuperv.class);
        map.put("cg_dcl_eng_dcl_superv_recovered", CgDclEngDclSupervRecovered.class);
        map.put("cg_stc_eng_stc", CgStcEngStc.class);
        map.put("cg_stc_eng_stc_recovered", CgStcEngStcRecovered.class);
        map.put("cgldr_adcpa_pd0_parsed", CgldrAdcpaPd0Parsed.class);
        map.put("cgldr_engineering_delayed", CgldrEngineeringDelayed.class);
        map.put("cgldr_flort_delayed", CgldrFlortDelayed.class);
        map.put("cgldr_parad_delayed", CgldrParadDelayed.class);
        map.put("cspp_eng_cspp_dbg_pdbg_batt_eng", CsppEngCsppDbgPdbgBattEng.class);
        map.put("cspp_eng_cspp_dbg_pdbg_batt_eng_recovered", CsppEngCsppDbgPdbgBattEngRecovered.class);
        map.put("cspp_eng_cspp_dbg_pdbg_gps_eng", CsppEngCsppDbgPdbgGpsEng.class);
        map.put("cspp_eng_cspp_dbg_pdbg_gps_eng_recovered", CsppEngCsppDbgPdbgGpsEngRecovered.class);
        map.put("cspp_eng_cspp_dbg_pdbg_metadata", CsppEngCsppDbgPdbgMetadata.class);
        map.put("cspp_eng_cspp_dbg_pdbg_metadata_recovered", CsppEngCsppDbgPdbgMetadataRecovered.class);
        map.put("cspp_eng_cspp_wc_hmr_eng", CsppEngCsppWcHmrEng.class);
        map.put("cspp_eng_cspp_wc_hmr_eng_recovered", CsppEngCsppWcHmrEngRecovered.class);
        map.put("cspp_eng_cspp_wc_hmr_metadata", CsppEngCsppWcHmrMetadata.class);
        map.put("cspp_eng_cspp_wc_hmr_metadata_recovered", CsppEngCsppWcHmrMetadataRecovered.class);
        map.put("cspp_eng_cspp_wc_sbe_eng", CsppEngCsppWcSbeEng.class);
        map.put("cspp_eng_cspp_wc_sbe_eng_recovered", CsppEngCsppWcSbeEngRecovered.class);
        map.put("cspp_eng_cspp_wc_sbe_metadata", CsppEngCsppWcSbeMetadata.class);
        map.put("cspp_eng_cspp_wc_sbe_metadata_recovered", CsppEngCsppWcSbeMetadataRecovered.class);
        map.put("cspp_eng_cspp_wc_wm_eng", CsppEngCsppWcWmEng.class);
        map.put("cspp_eng_cspp_wc_wm_eng_recovered", CsppEngCsppWcWmEngRecovered.class);
        map.put("cspp_eng_cspp_wc_wm_metadata", CsppEngCsppWcWmMetadata.class);
        map.put("cspp_eng_cspp_wc_wm_metadata_recovered", CsppEngCsppWcWmMetadataRecovered.class);
        map.put("ctd_LC_TEST", CtdLcTest.class);
        map.put("ctd_derived", CtdDerived.class);
        map.put("ctd_external_dataset", CtdExternalDataset.class);
        map.put("ctd_parsed_param_dict", CtdParsedParamDict.class);
        map.put("ctd_raw_param_dict", CtdRawParamDict.class);
        map.put("ctd_simulator", CtdSimulator.class);
        map.put("ctdbp_cdef_L0", CtdbpCdefL0.class);
        map.put("ctdbp_cdef_L1", CtdbpCdefL1.class);
        map.put("ctdbp_cdef_L2_density", CtdbpCdefL2Density.class);
        map.put("ctdbp_cdef_L2_pracsal", CtdbpCdefL2Pracsal.class);
        map.put("ctdbp_cdef_calibration_coefficients", CtdbpCdefCalibrationCoefficients.class);
        map.put("ctdbp_cdef_ce_dosta_recovered", CtdbpCdefCeDostaRecovered.class);
        map.put("ctdbp_cdef_ce_instrument_recovered", CtdbpCdefCeInstrumentRecovered.class);
        map.put("ctdbp_cdef_cp_instrument_recovered", CtdbpCdefCpInstrumentRecovered.class);
        map.put("ctdbp_cdef_dcl_ce_dosta", CtdbpCdefDclCeDosta.class);
        map.put("ctdbp_cdef_dcl_ce_dosta_recovered", CtdbpCdefDclCeDostaRecovered.class);
        map.put("ctdbp_cdef_dcl_ce_instrument", CtdbpCdefDclCeInstrument.class);
        map.put("ctdbp_cdef_dcl_ce_instrument_recovered", CtdbpCdefDclCeInstrumentRecovered.class);
        map.put("ctdbp_cdef_dcl_cp_instrument", CtdbpCdefDclCpInstrument.class);
        map.put("ctdbp_cdef_dcl_cp_instrument_recovered", CtdbpCdefDclCpInstrumentRecovered.class);
        map.put("ctdbp_cdef_raw", CtdbpCdefRaw.class);
        map.put("ctdbp_cdef_sample", CtdbpCdefSample.class);
        map.put("ctdbp_cdef_status", CtdbpCdefStatus.class);
        map.put("ctdbp_no_calibration_coefficients", CtdbpNoCalibrationCoefficients.class);
        map.put("ctdbp_no_configuration", CtdbpNoConfiguration.class);
        map.put("ctdbp_no_hardware", CtdbpNoHardware.class);
        map.put("ctdbp_no_optode_settings", CtdbpNoOptodeSettings.class);
        map.put("ctdbp_no_raw", CtdbpNoRaw.class);
        map.put("ctdbp_no_sample", CtdbpNoSample.class);
        map.put("ctdbp_no_status", CtdbpNoStatus.class);
        map.put("ctdgv_m_glider_instrument", CtdgvMGliderInstrument.class);
        map.put("ctdgv_m_glider_instrument_recovered", CtdgvMGliderInstrumentRecovered.class);
        map.put("ctdmo_ghqr_imodem_instrument", CtdmoGhqrImodemInstrument.class);
        map.put("ctdmo_ghqr_imodem_instrument_recovered", CtdmoGhqrImodemInstrumentRecovered.class);
        map.put("ctdmo_ghqr_imodem_metadata", CtdmoGhqrImodemMetadata.class);
        map.put("ctdmo_ghqr_imodem_metadata_recovered", CtdmoGhqrImodemMetadataRecovered.class);
        map.put("ctdmo_ghqr_instrument_recovered", CtdmoGhqrInstrumentRecovered.class);
        map.put("ctdmo_ghqr_offset_recovered", CtdmoGhqrOffsetRecovered.class);
        map.put("ctdmo_ghqr_sio_mule_instrument", CtdmoGhqrSioMuleInstrument.class);
        map.put("ctdmo_ghqr_sio_offset", CtdmoGhqrSioOffset.class);
        map.put("ctdmo_parsed", CtdmoParsed.class);
        map.put("ctdpf_ckl_mmp_cds_instrument", CtdpfCklMmpCdsInstrument.class);
        map.put("ctdpf_ckl_wfp_instrument", CtdpfCklWfpInstrument.class);
        map.put("ctdpf_ckl_wfp_instrument_recovered", CtdpfCklWfpInstrumentRecovered.class);
        map.put("ctdpf_ckl_wfp_metadata", CtdpfCklWfpMetadata.class);
        map.put("ctdpf_ckl_wfp_metadata_recovered", CtdpfCklWfpMetadataRecovered.class);
        map.put("ctdpf_ckl_wfp_sio_mule_metadata", CtdpfCklWfpSioMuleMetadata.class);
        map.put("ctdpf_j_cspp_instrument", CtdpfJCsppInstrument.class);
        map.put("ctdpf_j_cspp_instrument_recovered", CtdpfJCsppInstrumentRecovered.class);
        map.put("ctdpf_j_cspp_metadata", CtdpfJCsppMetadata.class);
        map.put("ctdpf_j_cspp_metadata_recovered", CtdpfJCsppMetadataRecovered.class);
        map.put("ctdpf_optode_calibration_coefficients", CtdpfOptodeCalibrationCoefficients.class);
        map.put("ctdpf_optode_configuration", CtdpfOptodeConfiguration.class);
        map.put("ctdpf_optode_hardware", CtdpfOptodeHardware.class);
        map.put("ctdpf_optode_sample", CtdpfOptodeSample.class);
        map.put("ctdpf_optode_settings", CtdpfOptodeSettings.class);
        map.put("ctdpf_optode_status", CtdpfOptodeStatus.class);
        map.put("ctdpf_parsed", CtdpfParsed.class);
        map.put("ctdpf_sbe43_calibration_coefficients", CtdpfSbe43CalibrationCoefficients.class);
        map.put("ctdpf_sbe43_configuration", CtdpfSbe43Configuration.class);
        map.put("ctdpf_sbe43_hardware", CtdpfSbe43Hardware.class);
        map.put("ctdpf_sbe43_sample", CtdpfSbe43Sample.class);
        map.put("ctdpf_sbe43_status", CtdpfSbe43Status.class);
        map.put("dofst_k_wfp_instrument", DofstKWfpInstrument.class);
        map.put("dofst_k_wfp_instrument_recovered", DofstKWfpInstrumentRecovered.class);
        map.put("dofst_k_wfp_metadata", DofstKWfpMetadata.class);
        map.put("dofst_k_wfp_metadata_recovered", DofstKWfpMetadataRecovered.class);
        map.put("dontuse", Dontuse.class);
        map.put("dosta_abcdjm_cspp_instrument", DostaAbcdjmCsppInstrument.class);
        map.put("dosta_abcdjm_cspp_instrument_recovered", DostaAbcdjmCsppInstrumentRecovered.class);
        map.put("dosta_abcdjm_cspp_metadata", DostaAbcdjmCsppMetadata.class);
        map.put("dosta_abcdjm_cspp_metadata_recovered", DostaAbcdjmCsppMetadataRecovered.class);
        map.put("dosta_abcdjm_dcl_instrument", DostaAbcdjmDclInstrument.class);
        map.put("dosta_abcdjm_dcl_instrument_recovered", DostaAbcdjmDclInstrumentRecovered.class);
        map.put("dosta_abcdjm_glider_instrument", DostaAbcdjmGliderInstrument.class);
        map.put("dosta_abcdjm_glider_recovered", DostaAbcdjmGliderRecovered.class);
        map.put("dosta_abcdjm_mmp_cds_instrument", DostaAbcdjmMmpCdsInstrument.class);
        map.put("dosta_abcdjm_sio_instrument", DostaAbcdjmSioInstrument.class);
        map.put("dosta_abcdjm_sio_instrument_recovered", DostaAbcdjmSioInstrumentRecovered.class);
        map.put("dosta_abcdjm_sio_metadata", DostaAbcdjmSioMetadata.class);
        map.put("dosta_abcdjm_sio_metadata_recovered", DostaAbcdjmSioMetadataRecovered.class);
        map.put("dosta_d_engineering", DostaDEngineering.class);
        map.put("dosta_d_sample", DostaDSample.class);
        map.put("dosta_ln_wfp_instrument", DostaLnWfpInstrument.class);
        map.put("dosta_ln_wfp_instrument_recovered", DostaLnWfpInstrumentRecovered.class);
        map.put("dosta_ln_wfp_sio_instrument", DostaLnWfpSioInstrument.class);
        map.put("dostad_parsed", DostadParsed.class);
        map.put("dpc_acm_instrument", DpcAcmInstrument.class);
        map.put("dpc_acm_instrument_recovered", DpcAcmInstrumentRecovered.class);
        map.put("dpc_acs_instrument_recovered", DpcAcsInstrumentRecovered.class);
        map.put("dpc_ctd_instrument", DpcCtdInstrument.class);
        map.put("dpc_ctd_instrument_recovered", DpcCtdInstrumentRecovered.class);
        map.put("dpc_flcdrtd_instrument", DpcFlcdrtdInstrument.class);
        map.put("dpc_flcdrtd_instrument_recovered", DpcFlcdrtdInstrumentRecovered.class);
        map.put("dpc_flnturtd_instrument", DpcFlnturtdInstrument.class);
        map.put("dpc_flnturtd_instrument_recovered", DpcFlnturtdInstrumentRecovered.class);
        map.put("dpc_mmp_instrument", DpcMmpInstrument.class);
        map.put("dpc_mmp_instrument_recovered", DpcMmpInstrumentRecovered.class);
        map.put("dpc_optode_instrument", DpcOptodeInstrument.class);
        map.put("dpc_optode_instrument_recovered", DpcOptodeInstrumentRecovered.class);
        map.put("echo_sounding", EchoSounding.class);
        map.put("explicit_lookup_value", ExplicitLookupValue.class);
        map.put("flcdr_x_mmp_cds_instrument", FlcdrXMmpCdsInstrument.class);
        map.put("flntu_x_mmp_cds_instrument", FlntuXMmpCdsInstrument.class);
        map.put("flord_l_wfp_instrument", FlordLWfpInstrument.class);
        map.put("flord_l_wfp_instrument", FlordLWfpInstrument.class);
        map.put("flord_l_wfp_instrument_recovered", FlordLWfpInstrumentRecovered.class);
        map.put("flord_l_wfp_sio_instrument", FlordLWfpSioInstrument.class);
        map.put("flord_m_glider_instrument", FlordMGliderInstrument.class);
        map.put("flord_m_glider_instrument_recovered", FlordMGliderInstrumentRecovered.class);
        map.put("flort_d_data_record", FlortDDataRecord.class);
        map.put("flort_d_metadata_record", FlortDMetadataRecord.class);
        map.put("flort_d_status", FlortDStatus.class);
        map.put("flort_dj_cspp_instrument", FlortDjCsppInstrument.class);
        map.put("flort_dj_cspp_instrument_recovered", FlortDjCsppInstrumentRecovered.class);
        map.put("flort_dj_cspp_metadata", FlortDjCsppMetadata.class);
        map.put("flort_dj_cspp_metadata_recovered", FlortDjCsppMetadataRecovered.class);
        map.put("flort_dj_dcl_instrument", FlortDjDclInstrument.class);
        map.put("flort_dj_dcl_instrument_recovered", FlortDjDclInstrumentRecovered.class);
        map.put("flort_dj_sio_instrument", FlortDjSioInstrument.class);
        map.put("flort_dj_sio_instrument_recovered", FlortDjSioInstrumentRecovered.class);
        map.put("flort_kn_stc_imodem_instrument", FlortKnStcImodemInstrument.class);
        map.put("flort_kn_stc_imodem_instrument_recovered", FlortKnStcImodemInstrumentRecovered.class);
        map.put("flort_m_glider_instrument", FlortMGliderInstrument.class);
        map.put("flort_m_glider_recovered", FlortMGliderRecovered.class);
        map.put("flortd_parsed", FlortdParsed.class);
        map.put("ggldr_ctdgv_delayed", GgldrCtdgvDelayed.class);
        map.put("ggldr_dosta_delayed", GgldrDostaDelayed.class);
        map.put("ggldr_eng_delayed", GgldrEngDelayed.class);
        map.put("ggldr_flord_delayed", GgldrFlordDelayed.class);
        map.put("glider_eng_metadata", GliderEngMetadata.class);
        map.put("glider_eng_metadata_recovered", GliderEngMetadataRecovered.class);
        map.put("glider_eng_recovered", GliderEngRecovered.class);
        map.put("glider_eng_sci_recovered", GliderEngSciRecovered.class);
        map.put("glider_eng_sci_telemetered", GliderEngSciTelemetered.class);
        map.put("glider_eng_telemetered", GliderEngTelemetered.class);
        map.put("global_range_ctp", GlobalRangeCtp.class);
        map.put("google_dt", GoogleDt.class);
        map.put("graph_image_param_dict", GraphImageParamDict.class);
        map.put("highcharts", Highcharts.class);
        map.put("horizontal_electric_field", HorizontalElectricField.class);
        map.put("hpies_data_header", HpiesDataHeader.class);
        map.put("hpies_status", HpiesStatus.class);
        map.put("ies_status", IesStatus.class);
        map.put("lookup_value_static_test", LookupValueStaticTest.class);
        map.put("lookup_value_test", LookupValueTest.class);
        map.put("luke_test", LukeTest.class);
        map.put("massp_mcu_status", MasspMcuStatus.class);
        map.put("massp_rga_sample", MasspRgaSample.class);
        map.put("massp_rga_status", MasspRgaStatus.class);
        map.put("massp_turbo_status", MasspTurboStatus.class);
        map.put("metbk_a_dcl_instrument", MetbkADclInstrument.class);
        map.put("metbk_a_dcl_instrument_recovered", MetbkADclInstrumentRecovered.class);
        map.put("metbk_sample", MetbkSample.class);
        map.put("metbk_status", MetbkStatus.class);
        map.put("mopak_o_dcl_accel", MopakODclAccel.class);
        map.put("mopak_o_dcl_accel_recovered", MopakODclAccelRecovered.class);
        map.put("mopak_o_dcl_rate", MopakODclRate.class);
        map.put("mopak_o_dcl_rate_recovered", MopakODclRateRecovered.class);
        map.put("motor_current", MotorCurrent.class);
        map.put("mpl_graph", MplGraph.class);
        map.put("nose_acm_external", NoseAcmExternal.class);
        map.put("nose_ctd_external", NoseCtdExternal.class);
        map.put("nutnr_a_sample", NutnrASample.class);
        map.put("nutnr_a_status", NutnrAStatus.class);
        map.put("nutnr_a_test", NutnrATest.class);
        map.put("nutnr_b_dcl_conc_instrument", NutnrBDclConcInstrument.class);
        map.put("nutnr_b_dcl_conc_instrument_recovered", NutnrBDclConcInstrumentRecovered.class);
        map.put("nutnr_b_dcl_conc_metadata", NutnrBDclConcMetadata.class);
        map.put("nutnr_b_dcl_conc_metadata_recovered", NutnrBDclConcMetadataRecovered.class);
        map.put("nutnr_b_dcl_full_instrument", NutnrBDclFullInstrument.class);
        map.put("nutnr_b_dcl_full_instrument_recovered", NutnrBDclFullInstrumentRecovered.class);
        map.put("nutnr_b_dcl_full_metadata", NutnrBDclFullMetadata.class);
        map.put("nutnr_b_dcl_full_metadata_recovered", NutnrBDclFullMetadataRecovered.class);
        map.put("nutnr_b_instrument_recovered", NutnrBInstrumentRecovered.class);
        map.put("nutnr_b_metadata_recovered", NutnrBMetadataRecovered.class);
        map.put("nutnr_b_raw", NutnrBRaw.class);
        map.put("nutnr_j_cspp_instrument", NutnrJCsppInstrument.class);
        map.put("nutnr_j_cspp_instrument_recovered", NutnrJCsppInstrumentRecovered.class);
        map.put("nutnr_j_cspp_metadata", NutnrJCsppMetadata.class);
        map.put("nutnr_j_cspp_metadata_recovered", NutnrJCsppMetadataRecovered.class);
        map.put("nutnr_parsed", NutnrParsed.class);
        map.put("old_adcps_jln_instrument", OldAdcpsJlnInstrument.class);
        map.put("optaa_ac_mmp_cds_instrument", OptaaAcMmpCdsInstrument.class);
        map.put("optaa_dj_cspp_instrument", OptaaDjCsppInstrument.class);
        map.put("optaa_dj_cspp_instrument_recovered", OptaaDjCsppInstrumentRecovered.class);
        map.put("optaa_dj_cspp_metadata", OptaaDjCsppMetadata.class);
        map.put("optaa_dj_cspp_metadata_recovered", OptaaDjCsppMetadataRecovered.class);
        map.put("optaa_dj_dcl_instrument", OptaaDjDclInstrument.class);
        map.put("optaa_dj_dcl_instrument_recovered", OptaaDjDclInstrumentRecovered.class);
        map.put("optaa_dj_dcl_metadata", OptaaDjDclMetadata.class);
        map.put("optaa_dj_dcl_metadata_recovered", OptaaDjDclMetadataRecovered.class);
        map.put("optaa_raw", OptaaRaw.class);
        map.put("optaa_sample", OptaaSample.class);
        map.put("optaa_status", OptaaStatus.class);
        map.put("parad_j_cspp_instrument", ParadJCsppInstrument.class);
        map.put("parad_j_cspp_instrument_recovered", ParadJCsppInstrumentRecovered.class);
        map.put("parad_j_cspp_metadata", ParadJCsppMetadata.class);
        map.put("parad_j_cspp_metadata_recovered", ParadJCsppMetadataRecovered.class);
        map.put("parad_k__stc_imodem_instrument", ParadKStcImodemInstrument.class);
        map.put("parad_k__stc_imodem_instrument_recovered", ParadKStcImodemInstrumentRecovered.class);
        map.put("parad_m_glider_instrument", ParadMGliderInstrument.class);
        map.put("parad_m_glider_recovered", ParadMGliderRecovered.class);
        map.put("parad_parsed", ParadParsed.class);
        map.put("parad_sa_config", ParadSaConfig.class);
        map.put("parad_sa_raw", ParadSaRaw.class);
        map.put("parad_sa_sample", ParadSaSample.class);
        map.put("pco2a_a_dcl_instrument_air", Pco2aADclInstrumentAir.class);
        map.put("pco2a_a_dcl_instrument_air_recovered", Pco2aADclInstrumentAirRecovered.class);
        map.put("pco2a_a_dcl_instrument_water", Pco2aADclInstrumentWater.class);
        map.put("pco2a_a_dcl_instrument_water_recovered", Pco2aADclInstrumentWaterRecovered.class);
        map.put("pco2a_a_dcl_metadata", Pco2aADclMetadata.class);
        map.put("pco2a_a_dcl_metadata_recovered", Pco2aADclMetadataRecovered.class);
        map.put("pco2w_a_battery_voltage", Pco2wABatteryVoltage.class);
        map.put("pco2w_a_configuration", Pco2wAConfiguration.class);
        map.put("pco2w_a_control_record", Pco2wAControlRecord.class);
        map.put("pco2w_a_data_record", Pco2wADataRecord.class);
        map.put("pco2w_a_regular_status", Pco2wARegularStatus.class);
        map.put("pco2w_a_sami_data_record", Pco2wASamiDataRecord.class);
        map.put("pco2w_a_sami_data_record_cal", Pco2wASamiDataRecordCal.class);
        map.put("pco2w_a_thermistor_voltage", Pco2wAThermistorVoltage.class);
        map.put("pco2w_abc_dcl_instrument", Pco2wAbcDclInstrument.class);
        map.put("pco2w_abc_dcl_instrument_blank", Pco2wAbcDclInstrumentBlank.class);
        map.put("pco2w_abc_dcl_instrument_blank_recovered", Pco2wAbcDclInstrumentBlankRecovered.class);
        map.put("pco2w_abc_dcl_instrument_recovered", Pco2wAbcDclInstrumentRecovered.class);
        map.put("pco2w_abc_dcl_metadata", Pco2wAbcDclMetadata.class);
        map.put("pco2w_abc_dcl_metadata_recovered", Pco2wAbcDclMetadataRecovered.class);
        map.put("pco2w_abc_dcl_power", Pco2wAbcDclPower.class);
        map.put("pco2w_abc_dcl_power_recovered", Pco2wAbcDclPowerRecovered.class);
        map.put("pco2w_abc_imodem_control", Pco2wAbcImodemControl.class);
        map.put("pco2w_abc_imodem_control_recovered", Pco2wAbcImodemControlRecovered.class);
        map.put("pco2w_abc_imodem_instrument", Pco2wAbcImodemInstrument.class);
        map.put("pco2w_abc_imodem_instrument_blank", Pco2wAbcImodemInstrumentBlank.class);
        map.put("pco2w_abc_imodem_instrument_blank_recovered", Pco2wAbcImodemInstrumentBlankRecovered.class);
        map.put("pco2w_abc_imodem_instrument_recovered", Pco2wAbcImodemInstrumentRecovered.class);
        map.put("pco2w_abc_imodem_metadata", Pco2wAbcImodemMetadata.class);
        map.put("pco2w_abc_imodem_metadata_recovered", Pco2wAbcImodemMetadataRecovered.class);
        map.put("pco2w_abc_imodem_power", Pco2wAbcImodemPower.class);
        map.put("pco2w_abc_imodem_power_recovered", Pco2wAbcImodemPowerRecovered.class);
        map.put("pco2w_abc_instrument", Pco2wAbcInstrument.class);
        map.put("pco2w_abc_instrument_blank", Pco2wAbcInstrumentBlank.class);
        map.put("pco2w_abc_metadata", Pco2wAbcMetadata.class);
        map.put("pco2w_abc_power", Pco2wAbcPower.class);
        map.put("pco2w_b_battery_voltage", Pco2wBBatteryVoltage.class);
        map.put("pco2w_b_configuration", Pco2wBConfiguration.class);
        map.put("pco2w_b_control_record", Pco2wBControlRecord.class);
        map.put("pco2w_b_data_record", Pco2wBDataRecord.class);
        map.put("pco2w_b_dev1_data_record", Pco2wBDev1DataRecord.class);
        map.put("pco2w_b_regular_status", Pco2wBRegularStatus.class);
        map.put("pco2w_b_sami_data_record", Pco2wBSamiDataRecord.class);
        map.put("pco2w_b_sami_data_record_cal", Pco2wBSamiDataRecordCal.class);
        map.put("pco2w_b_thermistor_voltage", Pco2wBThermistorVoltage.class);
        map.put("phsen_abcdef_dcl_instrument", PhsenAbcdefDclInstrument.class);
        map.put("phsen_abcdef_dcl_instrument_recovered", PhsenAbcdefDclInstrumentRecovered.class);
        map.put("phsen_abcdef_dcl_metadata", PhsenAbcdefDclMetadata.class);
        map.put("phsen_abcdef_dcl_metadata_recovered", PhsenAbcdefDclMetadataRecovered.class);
        map.put("phsen_abcdef_imodem_control", PhsenAbcdefImodemControl.class);
        map.put("phsen_abcdef_imodem_control_recovered", PhsenAbcdefImodemControlRecovered.class);
        map.put("phsen_abcdef_imodem_instrument", PhsenAbcdefImodemInstrument.class);
        map.put("phsen_abcdef_imodem_instrument_recovered", PhsenAbcdefImodemInstrumentRecovered.class);
        map.put("phsen_abcdef_imodem_metadata", PhsenAbcdefImodemMetadata.class);
        map.put("phsen_abcdef_imodem_metadata_recovered", PhsenAbcdefImodemMetadataRecovered.class);
        map.put("phsen_abcdef_instrument", PhsenAbcdefInstrument.class);
        map.put("phsen_abcdef_metadata", PhsenAbcdefMetadata.class);
        map.put("phsen_abcdef_sio_mule_instrument", PhsenAbcdefSioMuleInstrument.class);
        map.put("phsen_abcdef_sio_mule_metadata", PhsenAbcdefSioMuleMetadata.class);
        map.put("phsen_battery_voltage", PhsenBatteryVoltage.class);
        map.put("phsen_configuration", PhsenConfiguration.class);
        map.put("phsen_control_record", PhsenControlRecord.class);
        map.put("phsen_data_record", PhsenDataRecord.class);
        map.put("phsen_immediate_status", PhsenImmediateStatus.class);
        map.put("phsen_parsed", PhsenParsed.class);
        map.put("phsen_regular_status", PhsenRegularStatus.class);
        map.put("phsen_thermistor_voltage", PhsenThermistorVoltage.class);
        map.put("platform_eng_parsed", PlatformEngParsed.class);
        map.put("ppsdn_sample_result", PpsdnSampleResult.class);
        map.put("ppsdn_status", PpsdnStatus.class);
        map.put("presf_abc_dcl_tide_measurement", PresfAbcDclTideMeasurement.class);
        map.put("presf_abc_dcl_tide_measurement_recovered", PresfAbcDclTideMeasurementRecovered.class);
        map.put("presf_abc_dcl_wave_burst", PresfAbcDclWaveBurst.class);
        map.put("presf_abc_dcl_wave_burst_recovered", PresfAbcDclWaveBurstRecovered.class);
        map.put("presf_calibration_coefficients", PresfCalibrationCoefficients.class);
        map.put("presf_operating_status", PresfOperatingStatus.class);
        map.put("presf_raw", PresfRaw.class);
        map.put("presf_tide_converted", PresfTideConverted.class);
        map.put("presf_tide_measurement", PresfTideMeasurement.class);
        map.put("presf_wave_burst", PresfWaveBurst.class);
        map.put("presf_wave_statistics", PresfWaveStatistics.class);
        map.put("prest_configuration_data", PrestConfigurationData.class);
        map.put("prest_device_status", PrestDeviceStatus.class);
        map.put("prest_event_counter", PrestEventCounter.class);
        map.put("prest_hardware_data", PrestHardwareData.class);
        map.put("prest_l1_pressure", PrestL1Pressure.class);
        map.put("prest_parsed", PrestParsed.class);
        map.put("prest_raw", PrestRaw.class);
        map.put("prest_real_time", PrestRealTime.class);
        map.put("prest_reference_oscillator", PrestReferenceOscillator.class);
        map.put("rasfl_sample_result", RasflSampleResult.class);
        map.put("rasfl_status", RasflStatus.class);
        map.put("raw", Raw.class);
        map.put("raw_5thbeam", Raw5thbeam.class);
        map.put("rte_o_dcl_instrument", RteODclInstrument.class);
        map.put("rte_o_dcl_instrument_recovered", RteODclInstrumentRecovered.class);
        map.put("sami_regular_status", SamiRegularStatus.class);
        map.put("sample", Sample.class);
        map.put("sbe16_parsed", Sbe16Parsed.class);
        map.put("sbe37_L0_test", Sbe37L0Test.class);
        map.put("sbe37_L1_test", Sbe37L1Test.class);
        map.put("sbe37_LC_TEST", Sbe37LcTest.class);
        map.put("sio_eng_control_status", SioEngControlStatus.class);
        map.put("sio_eng_control_status_recovered", SioEngControlStatusRecovered.class);
        map.put("sparse_dict", SparseDict.class);
        map.put("spkir_a_configuration_record", SpkirAConfigurationRecord.class);
        map.put("spkir_abj_cspp_instrument", SpkirAbjCsppInstrument.class);
        map.put("spkir_abj_cspp_instrument_recovered", SpkirAbjCsppInstrumentRecovered.class);
        map.put("spkir_abj_cspp_metadata", SpkirAbjCsppMetadata.class);
        map.put("spkir_abj_cspp_metadata_recovered", SpkirAbjCsppMetadataRecovered.class);
        map.put("spkir_abj_dcl_instrument", SpkirAbjDclInstrument.class);
        map.put("spkir_abj_dcl_instrument_recovered", SpkirAbjDclInstrumentRecovered.class);
        map.put("spkir_data_record", SpkirDataRecord.class);
        map.put("stm_timestamp", StmTimestamp.class);
        map.put("thsph_sample", ThsphSample.class);
        map.put("tmpsf_L1", TmpsfL1.class);
        map.put("tmpsf_engineering", TmpsfEngineering.class);
        map.put("tmpsf_raw", TmpsfRaw.class);
        map.put("tmpsf_sample", TmpsfSample.class);
        map.put("trhph_parsed", TrhphParsed.class);
        map.put("trhph_raw", TrhphRaw.class);
        map.put("trhph_sample", TrhphSample.class);
        map.put("trhph_status", TrhphStatus.class);
        map.put("vadcp_4beam_system_configuration", Vadcp4beamSystemConfiguration.class);
        map.put("vadcp_5thbeam_compass_calibration", Vadcp5thbeamCompassCalibration.class);
        map.put("vadcp_5thbeam_pd0_beam_parsed", Vadcp5thbeamPd0BeamParsed.class);
        map.put("vadcp_5thbeam_system_configuration", Vadcp5thbeamSystemConfiguration.class);
        map.put("vadcp_ancillary_system_data", VadcpAncillarySystemData.class);
        map.put("vadcp_pd0_beam_parsed", VadcpPd0BeamParsed.class);
        map.put("vadcp_transmit_path", VadcpTransmitPath.class);
        map.put("vel3d_a_mmp_cds_instrument", Vel3dAMmpCdsInstrument.class);
        map.put("vel3d_b_L0", Vel3dBL0.class);
        map.put("vel3d_b_L1", Vel3dBL1.class);
        map.put("vel3d_b_engineering", Vel3dBEngineering.class);
        map.put("vel3d_b_sample", Vel3dBSample.class);
        map.put("vel3d_cd_battery_voltage", Vel3dCdBatteryVoltage.class);
        map.put("vel3d_cd_data_header", Vel3dCdDataHeader.class);
        map.put("vel3d_cd_hardware_configuration", Vel3dCdHardwareConfiguration.class);
        map.put("vel3d_cd_head_configuration", Vel3dCdHeadConfiguration.class);
        map.put("vel3d_cd_identification_string", Vel3dCdIdentificationString.class);
        map.put("vel3d_cd_system_data", Vel3dCdSystemData.class);
        map.put("vel3d_cd_user_configuration", Vel3dCdUserConfiguration.class);
        map.put("vel3d_cd_velocity_data", Vel3dCdVelocityData.class);
        map.put("vel3d_clock_data", Vel3dClockData.class);
        map.put("vel3d_k_wfp_instrument", Vel3dKWfpInstrument.class);
        map.put("vel3d_k_wfp_metadata", Vel3dKWfpMetadata.class);
        map.put("vel3d_k_wfp_stc_instrument", Vel3dKWfpStcInstrument.class);
        map.put("vel3d_k_wfp_stc_metadata", Vel3dKWfpStcMetadata.class);
        map.put("vel3d_k_wfp_string", Vel3dKWfpString.class);
        map.put("vel3d_l_wfp_instrument", Vel3dLWfpInstrument.class);
        map.put("vel3d_l_wfp_instrument_recovered", Vel3dLWfpInstrumentRecovered.class);
        map.put("vel3d_l_wfp_metadata_recovered", Vel3dLWfpMetadataRecovered.class);
        map.put("vel3d_l_wfp_sio_mule_metadata", Vel3dLWfpSioMuleMetadata.class);
        map.put("vel3d_parsed_sample", Vel3dParsedSample.class);
        map.put("velpt_ab_dcl_diagnostics", VelptAbDclDiagnostics.class);
        map.put("velpt_ab_dcl_diagnostics_metadata", VelptAbDclDiagnosticsMetadata.class);
        map.put("velpt_ab_dcl_diagnostics_metadata_recovered", VelptAbDclDiagnosticsMetadataRecovered.class);
        map.put("velpt_ab_dcl_diagnostics_recovered", VelptAbDclDiagnosticsRecovered.class);
        map.put("velpt_ab_dcl_instrument", VelptAbDclInstrument.class);
        map.put("velpt_ab_dcl_instrument_recovered", VelptAbDclInstrumentRecovered.class);
        map.put("velpt_ab_diagnostics_metadata_recovered", VelptAbDiagnosticsMetadataRecovered.class);
        map.put("velpt_ab_diagnostics_recovered", VelptAbDiagnosticsRecovered.class);
        map.put("velpt_ab_instrument_metadata_recovered", VelptAbInstrumentMetadataRecovered.class);
        map.put("velpt_ab_instrument_recovered", VelptAbInstrumentRecovered.class);
        map.put("velpt_battery_voltage", VelptBatteryVoltage.class);
        map.put("velpt_clock_data", VelptClockData.class);
        map.put("velpt_data_header", VelptDataHeader.class);
        map.put("velpt_hardware_configuration", VelptHardwareConfiguration.class);
        map.put("velpt_head_configuration", VelptHeadConfiguration.class);
        map.put("velpt_identification_string", VelptIdentificationString.class);
        map.put("velpt_j_cspp_instrument", VelptJCsppInstrument.class);
        map.put("velpt_j_cspp_instrument_recovered", VelptJCsppInstrumentRecovered.class);
        map.put("velpt_j_cspp_metadata", VelptJCsppMetadata.class);
        map.put("velpt_j_cspp_metadata_recovered", VelptJCsppMetadataRecovered.class);
        map.put("velpt_parsed", VelptParsed.class);
        map.put("velpt_raw", VelptRaw.class);
        map.put("velpt_system_data", VelptSystemData.class);
        map.put("velpt_user_configuration", VelptUserConfiguration.class);
        map.put("velpt_velocity_data", VelptVelocityData.class);
        map.put("wavss_a_dcl_fourier", WavssADclFourier.class);
        map.put("wavss_a_dcl_fourier_recovered", WavssADclFourierRecovered.class);
        map.put("wavss_a_dcl_mean_directional", WavssADclMeanDirectional.class);
        map.put("wavss_a_dcl_mean_directional_recovered", WavssADclMeanDirectionalRecovered.class);
        map.put("wavss_a_dcl_motion", WavssADclMotion.class);
        map.put("wavss_a_dcl_motion_recovered", WavssADclMotionRecovered.class);
        map.put("wavss_a_dcl_non_directional", WavssADclNonDirectional.class);
        map.put("wavss_a_dcl_non_directional_recovered", WavssADclNonDirectionalRecovered.class);
        map.put("wavss_a_dcl_statistics", WavssADclStatistics.class);
        map.put("wavss_a_dcl_statistics_recovered", WavssADclStatisticsRecovered.class);
        map.put("wfp_eng__stc_imodem_status_recovered", WfpEngStcImodemStatusRecovered.class);
        map.put("wfp_eng_stc_imodem_engineering", WfpEngStcImodemEngineering.class);
        map.put("wfp_eng_stc_imodem_engineering_recovered", WfpEngStcImodemEngineeringRecovered.class);
        map.put("wfp_eng_stc_imodem_start_time", WfpEngStcImodemStartTime.class);
        map.put("wfp_eng_stc_imodem_start_time_recovered", WfpEngStcImodemStartTimeRecovered.class);
        map.put("wfp_eng_stc_imodem_status", WfpEngStcImodemStatus.class);
        map.put("wfp_eng_stc_imodem_status_recovered", WfpEngStcImodemStatusRecovered.class);
        map.put("wfp_eng_wfp_sio_mule_engineering", WfpEngWfpSioMuleEngineering.class);
        map.put("wfp_eng_wfp_sio_mule_start_time", WfpEngWfpSioMuleStartTime.class);
        map.put("wfp_eng_wfp_sio_mule_status", WfpEngWfpSioMuleStatus.class);
        map.put("xadcps_jln_stc_instrument", XadcpsJlnStcInstrument.class);
        map.put("zplsc_status", ZplscStatus.class);
        return map;
    }
}