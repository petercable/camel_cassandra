package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "cg_dcl_eng_dcl_superv")
public class CgDclEngDclSuperv extends CassandraParticle {

    @Column(value = "header_timestamp")
    private String headerTimestamp;

    @Column(value = "board_type")
    private String boardType;

    @Column(value = "vmain_backplane_bus_voltage")
    private float vmainBackplaneBusVoltage;

    @Column(value = "imain_current")
    private float imainCurrent;

    @Column(value = "error_vmain_out_tolerance")
    private int errorVmainOutTolerance;

    @Column(value = "error_imain_out_tolerance")
    private int errorImainOutTolerance;

    @Column(value = "error_dcl_iso_swgf_lim_exceeded")
    private int errorDclIsoSwgfLimExceeded;

    @Column(value = "error_dcl_rtn_swfg_lim_exceeded")
    private int errorDclRtnSwfgLimExceeded;

    @Column(value = "error_vmain_swgf_lim_exceeded")
    private int errorVmainSwgfLimExceeded;

    @Column(value = "error_gmain_swgf_lim_exceeded")
    private int errorGmainSwgfLimExceeded;

    @Column(value = "error_sensor_iso_swgf_lim_exceeded")
    private int errorSensorIsoSwgfLimExceeded;

    @Column(value = "error_snsr_com_swgf_lim_exceeded")
    private int errorSnsrComSwgfLimExceeded;

    @Column(value = "error_leak_detect_c1_lim_exceeded")
    private int errorLeakDetectC1LimExceeded;

    @Column(value = "error_leak_detect_c2_lim_exceeded")
    private int errorLeakDetectC2LimExceeded;

    @Column(value = "error_channel_overcurrent_fault")
    private int errorChannelOvercurrentFault;

    @Column(value = "error_channel_1_not_responding")
    private int errorChannel1NotResponding;

    @Column(value = "error_channel_2_not_responding")
    private int errorChannel2NotResponding;

    @Column(value = "error_channel_3_not_responding")
    private int errorChannel3NotResponding;

    @Column(value = "error_channel_4_not_responding")
    private int errorChannel4NotResponding;

    @Column(value = "error_channel_5_not_responding")
    private int errorChannel5NotResponding;

    @Column(value = "error_channel_6_not_responding")
    private int errorChannel6NotResponding;

    @Column(value = "error_channel_7_not_responding")
    private int errorChannel7NotResponding;

    @Column(value = "error_channel_8_not_responding")
    private int errorChannel8NotResponding;

    @Column(value = "error_i2c_error")
    private int errorI2cError;

    @Column(value = "error_uart_error")
    private int errorUartError;

    @Column(value = "error_brown_out_reset")
    private int errorBrownOutReset;

    @Column(value = "bmp085_temp")
    private float bmp085Temp;

    @Column(value = "sht25_temp")
    private float sht25Temp;

    @Column(value = "murata_12v_temp")
    private float murata12vTemp;

    @Column(value = "murata_24v_temp")
    private float murata24vTemp;

    @Column(value = "vicor_12v_bcm_temp")
    private float vicor12vBcmTemp;

    @Column(value = "sht25_humidity")
    private float sht25Humidity;

    @Column(value = "bmp085_pressure")
    private float bmp085Pressure;

    @Column(value = "active_swgf_channels")
    private int activeSwgfChannels;

    @Column(value = "swgf_c1_max_leakage")
    private float swgfC1MaxLeakage;

    @Column(value = "swgf_c2_max_leakage")
    private float swgfC2MaxLeakage;

    @Column(value = "swgf_c3_max_leakage")
    private float swgfC3MaxLeakage;

    @Column(value = "active_leak_detect_channels")
    private int activeLeakDetectChannels;

    @Column(value = "leak_detect_c1_v")
    private int leakDetectC1V;

    @Column(value = "leak_detect_c2_v")
    private int leakDetectC2V;

    @Column(value = "channel_state")
    private List<Integer> channelState;

    @Column(value = "channel_state_dims")
    private int channelStateDims;

    @Column(value = "channel_state_sizes")
    private List<Long> channelStateSizes;

    @Column(value = "channel_v")
    private List<Float> channelV;

    @Column(value = "channel_v_dims")
    private int channelVDims;

    @Column(value = "channel_v_sizes")
    private List<Long> channelVSizes;

    @Column(value = "channel_i")
    private List<Float> channelI;

    @Column(value = "channel_i_dims")
    private int channelIDims;

    @Column(value = "channel_i_sizes")
    private List<Long> channelISizes;

    @Column(value = "channel_error_status")
    private List<Integer> channelErrorStatus;

    @Column(value = "channel_error_status_dims")
    private int channelErrorStatusDims;

    @Column(value = "channel_error_status_sizes")
    private List<Long> channelErrorStatusSizes;

    @Column(value = "pwr_board_mode")
    private int pwrBoardMode;

    @Column(value = "dpb_mode")
    private int dpbMode;

    @Column(value = "dpb_voltage_mode")
    private int dpbVoltageMode;

    @Column(value = "vmain_dpb_in")
    private float vmainDpbIn;

    @Column(value = "imain_dpb_in")
    private float imainDpbIn;

    @Column(value = "out_12v_v")
    private float out12vV;

    @Column(value = "out_12v_i")
    private float out12vI;

    @Column(value = "out_24v_v")
    private float out24vV;

    @Column(value = "out_24v_i")
    private float out24vI;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setHeaderTimestamp((String) particle.get("header_timestamp"));
        setBoardType((String) particle.get("board_type"));
        setVmainBackplaneBusVoltage((float) particle.get("vmain_backplane_bus_voltage"));
        setImainCurrent((float) particle.get("imain_current"));
        setErrorVmainOutTolerance((int) particle.get("error_vmain_out_tolerance"));
        setErrorImainOutTolerance((int) particle.get("error_imain_out_tolerance"));
        setErrorDclIsoSwgfLimExceeded((int) particle.get("error_dcl_iso_swgf_lim_exceeded"));
        setErrorDclRtnSwfgLimExceeded((int) particle.get("error_dcl_rtn_swfg_lim_exceeded"));
        setErrorVmainSwgfLimExceeded((int) particle.get("error_vmain_swgf_lim_exceeded"));
        setErrorGmainSwgfLimExceeded((int) particle.get("error_gmain_swgf_lim_exceeded"));
        setErrorSensorIsoSwgfLimExceeded((int) particle.get("error_sensor_iso_swgf_lim_exceeded"));
        setErrorSnsrComSwgfLimExceeded((int) particle.get("error_snsr_com_swgf_lim_exceeded"));
        setErrorLeakDetectC1LimExceeded((int) particle.get("error_leak_detect_c1_lim_exceeded"));
        setErrorLeakDetectC2LimExceeded((int) particle.get("error_leak_detect_c2_lim_exceeded"));
        setErrorChannelOvercurrentFault((int) particle.get("error_channel_overcurrent_fault"));
        setErrorChannel1NotResponding((int) particle.get("error_channel_1_not_responding"));
        setErrorChannel2NotResponding((int) particle.get("error_channel_2_not_responding"));
        setErrorChannel3NotResponding((int) particle.get("error_channel_3_not_responding"));
        setErrorChannel4NotResponding((int) particle.get("error_channel_4_not_responding"));
        setErrorChannel5NotResponding((int) particle.get("error_channel_5_not_responding"));
        setErrorChannel6NotResponding((int) particle.get("error_channel_6_not_responding"));
        setErrorChannel7NotResponding((int) particle.get("error_channel_7_not_responding"));
        setErrorChannel8NotResponding((int) particle.get("error_channel_8_not_responding"));
        setErrorI2cError((int) particle.get("error_i2c_error"));
        setErrorUartError((int) particle.get("error_uart_error"));
        setErrorBrownOutReset((int) particle.get("error_brown_out_reset"));
        setBmp085Temp((float) particle.get("bmp085_temp"));
        setSht25Temp((float) particle.get("sht25_temp"));
        setMurata12vTemp((float) particle.get("murata_12v_temp"));
        setMurata24vTemp((float) particle.get("murata_24v_temp"));
        setVicor12vBcmTemp((float) particle.get("vicor_12v_bcm_temp"));
        setSht25Humidity((float) particle.get("sht25_humidity"));
        setBmp085Pressure((float) particle.get("bmp085_pressure"));
        setActiveSwgfChannels((int) particle.get("active_swgf_channels"));
        setSwgfC1MaxLeakage((float) particle.get("swgf_c1_max_leakage"));
        setSwgfC2MaxLeakage((float) particle.get("swgf_c2_max_leakage"));
        setSwgfC3MaxLeakage((float) particle.get("swgf_c3_max_leakage"));
        setActiveLeakDetectChannels((int) particle.get("active_leak_detect_channels"));
        setLeakDetectC1V((int) particle.get("leak_detect_c1_v"));
        setLeakDetectC2V((int) particle.get("leak_detect_c2_v"));
        setChannelState((List<Integer>) particle.get("channel_state"));
        setChannelStateDims((int) particle.get("channel_state_dims"));
        setChannelStateSizes((List<Long>) particle.get("channel_state_sizes"));
        setChannelV((List<Float>) particle.get("channel_v"));
        setChannelVDims((int) particle.get("channel_v_dims"));
        setChannelVSizes((List<Long>) particle.get("channel_v_sizes"));
        setChannelI((List<Float>) particle.get("channel_i"));
        setChannelIDims((int) particle.get("channel_i_dims"));
        setChannelISizes((List<Long>) particle.get("channel_i_sizes"));
        setChannelErrorStatus((List<Integer>) particle.get("channel_error_status"));
        setChannelErrorStatusDims((int) particle.get("channel_error_status_dims"));
        setChannelErrorStatusSizes((List<Long>) particle.get("channel_error_status_sizes"));
        setPwrBoardMode((int) particle.get("pwr_board_mode"));
        setDpbMode((int) particle.get("dpb_mode"));
        setDpbVoltageMode((int) particle.get("dpb_voltage_mode"));
        setVmainDpbIn((float) particle.get("vmain_dpb_in"));
        setImainDpbIn((float) particle.get("imain_dpb_in"));
        setOut12vV((float) particle.get("out_12v_v"));
        setOut12vI((float) particle.get("out_12v_i"));
        setOut24vV((float) particle.get("out_24v_v"));
        setOut24vI((float) particle.get("out_24v_i"));
    }

    public String getHeaderTimestamp() {
        return headerTimestamp;
    }

    public void setHeaderTimestamp(String headerTimestamp) {
        this.headerTimestamp = headerTimestamp;
    }
    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }
    public float getVmainBackplaneBusVoltage() {
        return vmainBackplaneBusVoltage;
    }

    public void setVmainBackplaneBusVoltage(float vmainBackplaneBusVoltage) {
        this.vmainBackplaneBusVoltage = vmainBackplaneBusVoltage;
    }
    public float getImainCurrent() {
        return imainCurrent;
    }

    public void setImainCurrent(float imainCurrent) {
        this.imainCurrent = imainCurrent;
    }
    public int getErrorVmainOutTolerance() {
        return errorVmainOutTolerance;
    }

    public void setErrorVmainOutTolerance(int errorVmainOutTolerance) {
        this.errorVmainOutTolerance = errorVmainOutTolerance;
    }
    public int getErrorImainOutTolerance() {
        return errorImainOutTolerance;
    }

    public void setErrorImainOutTolerance(int errorImainOutTolerance) {
        this.errorImainOutTolerance = errorImainOutTolerance;
    }
    public int getErrorDclIsoSwgfLimExceeded() {
        return errorDclIsoSwgfLimExceeded;
    }

    public void setErrorDclIsoSwgfLimExceeded(int errorDclIsoSwgfLimExceeded) {
        this.errorDclIsoSwgfLimExceeded = errorDclIsoSwgfLimExceeded;
    }
    public int getErrorDclRtnSwfgLimExceeded() {
        return errorDclRtnSwfgLimExceeded;
    }

    public void setErrorDclRtnSwfgLimExceeded(int errorDclRtnSwfgLimExceeded) {
        this.errorDclRtnSwfgLimExceeded = errorDclRtnSwfgLimExceeded;
    }
    public int getErrorVmainSwgfLimExceeded() {
        return errorVmainSwgfLimExceeded;
    }

    public void setErrorVmainSwgfLimExceeded(int errorVmainSwgfLimExceeded) {
        this.errorVmainSwgfLimExceeded = errorVmainSwgfLimExceeded;
    }
    public int getErrorGmainSwgfLimExceeded() {
        return errorGmainSwgfLimExceeded;
    }

    public void setErrorGmainSwgfLimExceeded(int errorGmainSwgfLimExceeded) {
        this.errorGmainSwgfLimExceeded = errorGmainSwgfLimExceeded;
    }
    public int getErrorSensorIsoSwgfLimExceeded() {
        return errorSensorIsoSwgfLimExceeded;
    }

    public void setErrorSensorIsoSwgfLimExceeded(int errorSensorIsoSwgfLimExceeded) {
        this.errorSensorIsoSwgfLimExceeded = errorSensorIsoSwgfLimExceeded;
    }
    public int getErrorSnsrComSwgfLimExceeded() {
        return errorSnsrComSwgfLimExceeded;
    }

    public void setErrorSnsrComSwgfLimExceeded(int errorSnsrComSwgfLimExceeded) {
        this.errorSnsrComSwgfLimExceeded = errorSnsrComSwgfLimExceeded;
    }
    public int getErrorLeakDetectC1LimExceeded() {
        return errorLeakDetectC1LimExceeded;
    }

    public void setErrorLeakDetectC1LimExceeded(int errorLeakDetectC1LimExceeded) {
        this.errorLeakDetectC1LimExceeded = errorLeakDetectC1LimExceeded;
    }
    public int getErrorLeakDetectC2LimExceeded() {
        return errorLeakDetectC2LimExceeded;
    }

    public void setErrorLeakDetectC2LimExceeded(int errorLeakDetectC2LimExceeded) {
        this.errorLeakDetectC2LimExceeded = errorLeakDetectC2LimExceeded;
    }
    public int getErrorChannelOvercurrentFault() {
        return errorChannelOvercurrentFault;
    }

    public void setErrorChannelOvercurrentFault(int errorChannelOvercurrentFault) {
        this.errorChannelOvercurrentFault = errorChannelOvercurrentFault;
    }
    public int getErrorChannel1NotResponding() {
        return errorChannel1NotResponding;
    }

    public void setErrorChannel1NotResponding(int errorChannel1NotResponding) {
        this.errorChannel1NotResponding = errorChannel1NotResponding;
    }
    public int getErrorChannel2NotResponding() {
        return errorChannel2NotResponding;
    }

    public void setErrorChannel2NotResponding(int errorChannel2NotResponding) {
        this.errorChannel2NotResponding = errorChannel2NotResponding;
    }
    public int getErrorChannel3NotResponding() {
        return errorChannel3NotResponding;
    }

    public void setErrorChannel3NotResponding(int errorChannel3NotResponding) {
        this.errorChannel3NotResponding = errorChannel3NotResponding;
    }
    public int getErrorChannel4NotResponding() {
        return errorChannel4NotResponding;
    }

    public void setErrorChannel4NotResponding(int errorChannel4NotResponding) {
        this.errorChannel4NotResponding = errorChannel4NotResponding;
    }
    public int getErrorChannel5NotResponding() {
        return errorChannel5NotResponding;
    }

    public void setErrorChannel5NotResponding(int errorChannel5NotResponding) {
        this.errorChannel5NotResponding = errorChannel5NotResponding;
    }
    public int getErrorChannel6NotResponding() {
        return errorChannel6NotResponding;
    }

    public void setErrorChannel6NotResponding(int errorChannel6NotResponding) {
        this.errorChannel6NotResponding = errorChannel6NotResponding;
    }
    public int getErrorChannel7NotResponding() {
        return errorChannel7NotResponding;
    }

    public void setErrorChannel7NotResponding(int errorChannel7NotResponding) {
        this.errorChannel7NotResponding = errorChannel7NotResponding;
    }
    public int getErrorChannel8NotResponding() {
        return errorChannel8NotResponding;
    }

    public void setErrorChannel8NotResponding(int errorChannel8NotResponding) {
        this.errorChannel8NotResponding = errorChannel8NotResponding;
    }
    public int getErrorI2cError() {
        return errorI2cError;
    }

    public void setErrorI2cError(int errorI2cError) {
        this.errorI2cError = errorI2cError;
    }
    public int getErrorUartError() {
        return errorUartError;
    }

    public void setErrorUartError(int errorUartError) {
        this.errorUartError = errorUartError;
    }
    public int getErrorBrownOutReset() {
        return errorBrownOutReset;
    }

    public void setErrorBrownOutReset(int errorBrownOutReset) {
        this.errorBrownOutReset = errorBrownOutReset;
    }
    public float getBmp085Temp() {
        return bmp085Temp;
    }

    public void setBmp085Temp(float bmp085Temp) {
        this.bmp085Temp = bmp085Temp;
    }
    public float getSht25Temp() {
        return sht25Temp;
    }

    public void setSht25Temp(float sht25Temp) {
        this.sht25Temp = sht25Temp;
    }
    public float getMurata12vTemp() {
        return murata12vTemp;
    }

    public void setMurata12vTemp(float murata12vTemp) {
        this.murata12vTemp = murata12vTemp;
    }
    public float getMurata24vTemp() {
        return murata24vTemp;
    }

    public void setMurata24vTemp(float murata24vTemp) {
        this.murata24vTemp = murata24vTemp;
    }
    public float getVicor12vBcmTemp() {
        return vicor12vBcmTemp;
    }

    public void setVicor12vBcmTemp(float vicor12vBcmTemp) {
        this.vicor12vBcmTemp = vicor12vBcmTemp;
    }
    public float getSht25Humidity() {
        return sht25Humidity;
    }

    public void setSht25Humidity(float sht25Humidity) {
        this.sht25Humidity = sht25Humidity;
    }
    public float getBmp085Pressure() {
        return bmp085Pressure;
    }

    public void setBmp085Pressure(float bmp085Pressure) {
        this.bmp085Pressure = bmp085Pressure;
    }
    public int getActiveSwgfChannels() {
        return activeSwgfChannels;
    }

    public void setActiveSwgfChannels(int activeSwgfChannels) {
        this.activeSwgfChannels = activeSwgfChannels;
    }
    public float getSwgfC1MaxLeakage() {
        return swgfC1MaxLeakage;
    }

    public void setSwgfC1MaxLeakage(float swgfC1MaxLeakage) {
        this.swgfC1MaxLeakage = swgfC1MaxLeakage;
    }
    public float getSwgfC2MaxLeakage() {
        return swgfC2MaxLeakage;
    }

    public void setSwgfC2MaxLeakage(float swgfC2MaxLeakage) {
        this.swgfC2MaxLeakage = swgfC2MaxLeakage;
    }
    public float getSwgfC3MaxLeakage() {
        return swgfC3MaxLeakage;
    }

    public void setSwgfC3MaxLeakage(float swgfC3MaxLeakage) {
        this.swgfC3MaxLeakage = swgfC3MaxLeakage;
    }
    public int getActiveLeakDetectChannels() {
        return activeLeakDetectChannels;
    }

    public void setActiveLeakDetectChannels(int activeLeakDetectChannels) {
        this.activeLeakDetectChannels = activeLeakDetectChannels;
    }
    public int getLeakDetectC1V() {
        return leakDetectC1V;
    }

    public void setLeakDetectC1V(int leakDetectC1V) {
        this.leakDetectC1V = leakDetectC1V;
    }
    public int getLeakDetectC2V() {
        return leakDetectC2V;
    }

    public void setLeakDetectC2V(int leakDetectC2V) {
        this.leakDetectC2V = leakDetectC2V;
    }
    public List<Integer> getChannelState() {
        // TODO - restore original dimensions, (remove fill values?)
        return channelState;
    }

    public void setChannelState(List<Integer> channelState) {
        // TODO - flatten for storage, insert fill values
        this.channelState = channelState;
    }
    public int getChannelStateDims() {
        return channelStateDims;
    }

    public void setChannelStateDims(int channelStateDims) {
        this.channelStateDims = channelStateDims;
    }
    public List<Long> getChannelStateSizes() {
        return channelStateSizes;
    }

    public void setChannelStateSizes(List<Long> channelStateSizes) {
        this.channelStateSizes = channelStateSizes;
    }
    public List<Float> getChannelV() {
        // TODO - restore original dimensions, (remove fill values?)
        return channelV;
    }

    public void setChannelV(List<Float> channelV) {
        // TODO - flatten for storage, insert fill values
        this.channelV = channelV;
    }
    public int getChannelVDims() {
        return channelVDims;
    }

    public void setChannelVDims(int channelVDims) {
        this.channelVDims = channelVDims;
    }
    public List<Long> getChannelVSizes() {
        return channelVSizes;
    }

    public void setChannelVSizes(List<Long> channelVSizes) {
        this.channelVSizes = channelVSizes;
    }
    public List<Float> getChannelI() {
        // TODO - restore original dimensions, (remove fill values?)
        return channelI;
    }

    public void setChannelI(List<Float> channelI) {
        // TODO - flatten for storage, insert fill values
        this.channelI = channelI;
    }
    public int getChannelIDims() {
        return channelIDims;
    }

    public void setChannelIDims(int channelIDims) {
        this.channelIDims = channelIDims;
    }
    public List<Long> getChannelISizes() {
        return channelISizes;
    }

    public void setChannelISizes(List<Long> channelISizes) {
        this.channelISizes = channelISizes;
    }
    public List<Integer> getChannelErrorStatus() {
        // TODO - restore original dimensions, (remove fill values?)
        return channelErrorStatus;
    }

    public void setChannelErrorStatus(List<Integer> channelErrorStatus) {
        // TODO - flatten for storage, insert fill values
        this.channelErrorStatus = channelErrorStatus;
    }
    public int getChannelErrorStatusDims() {
        return channelErrorStatusDims;
    }

    public void setChannelErrorStatusDims(int channelErrorStatusDims) {
        this.channelErrorStatusDims = channelErrorStatusDims;
    }
    public List<Long> getChannelErrorStatusSizes() {
        return channelErrorStatusSizes;
    }

    public void setChannelErrorStatusSizes(List<Long> channelErrorStatusSizes) {
        this.channelErrorStatusSizes = channelErrorStatusSizes;
    }
    public int getPwrBoardMode() {
        return pwrBoardMode;
    }

    public void setPwrBoardMode(int pwrBoardMode) {
        this.pwrBoardMode = pwrBoardMode;
    }
    public int getDpbMode() {
        return dpbMode;
    }

    public void setDpbMode(int dpbMode) {
        this.dpbMode = dpbMode;
    }
    public int getDpbVoltageMode() {
        return dpbVoltageMode;
    }

    public void setDpbVoltageMode(int dpbVoltageMode) {
        this.dpbVoltageMode = dpbVoltageMode;
    }
    public float getVmainDpbIn() {
        return vmainDpbIn;
    }

    public void setVmainDpbIn(float vmainDpbIn) {
        this.vmainDpbIn = vmainDpbIn;
    }
    public float getImainDpbIn() {
        return imainDpbIn;
    }

    public void setImainDpbIn(float imainDpbIn) {
        this.imainDpbIn = imainDpbIn;
    }
    public float getOut12vV() {
        return out12vV;
    }

    public void setOut12vV(float out12vV) {
        this.out12vV = out12vV;
    }
    public float getOut12vI() {
        return out12vI;
    }

    public void setOut12vI(float out12vI) {
        this.out12vI = out12vI;
    }
    public float getOut24vV() {
        return out24vV;
    }

    public void setOut24vV(float out24vV) {
        this.out24vV = out24vV;
    }
    public float getOut24vI() {
        return out24vI;
    }

    public void setOut24vI(float out24vI) {
        this.out24vI = out24vI;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}