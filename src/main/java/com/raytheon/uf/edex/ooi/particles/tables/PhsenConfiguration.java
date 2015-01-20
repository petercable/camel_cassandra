package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "phsen_configuration")
public class PhsenConfiguration extends CassandraParticle {

    @Column(value = "launch_time")
    private long launchTime;

    @Column(value = "start_time_offset")
    private int startTimeOffset;

    @Column(value = "recording_time")
    private int recordingTime;

    @Column(value = "pmi_sample_schedule")
    private int pmiSampleSchedule;

    @Column(value = "sami_sample_schedule")
    private int samiSampleSchedule;

    @Column(value = "slot1_follows_sami_sample")
    private int slot1FollowsSamiSample;

    @Column(value = "slot1_independent_schedule")
    private int slot1IndependentSchedule;

    @Column(value = "slot2_follows_sami_sample")
    private int slot2FollowsSamiSample;

    @Column(value = "slot2_independent_schedule")
    private int slot2IndependentSchedule;

    @Column(value = "slot3_follows_sami_sample")
    private int slot3FollowsSamiSample;

    @Column(value = "slot3_independent_schedule")
    private int slot3IndependentSchedule;

    @Column(value = "timer_interval_sami")
    private int timerIntervalSami;

    @Column(value = "driver_id_sami")
    private int driverIdSami;

    @Column(value = "parameter_pointer_sami")
    private int parameterPointerSami;

    @Column(value = "timer_interval_device1")
    private int timerIntervalDevice1;

    @Column(value = "driver_id_device1")
    private int driverIdDevice1;

    @Column(value = "parameter_pointer_device1")
    private int parameterPointerDevice1;

    @Column(value = "timer_interval_device2")
    private int timerIntervalDevice2;

    @Column(value = "driver_id_device2")
    private int driverIdDevice2;

    @Column(value = "parameter_pointer_device2")
    private int parameterPointerDevice2;

    @Column(value = "timer_interval_device3")
    private int timerIntervalDevice3;

    @Column(value = "driver_id_device3")
    private int driverIdDevice3;

    @Column(value = "parameter_pointer_device3")
    private int parameterPointerDevice3;

    @Column(value = "timer_interval_prestart")
    private int timerIntervalPrestart;

    @Column(value = "driver_id_prestart")
    private int driverIdPrestart;

    @Column(value = "parameter_pointer_prestart")
    private int parameterPointerPrestart;

    @Column(value = "use_baud_rate_57600")
    private int useBaudRate57600;

    @Column(value = "send_record_type")
    private int sendRecordType;

    @Column(value = "send_live_records")
    private int sendLiveRecords;

    @Column(value = "extend_global_config")
    private int extendGlobalConfig;

    @Column(value = "number_samples_averaged")
    private int numberSamplesAveraged;

    @Column(value = "number_flushes")
    private int numberFlushes;

    @Column(value = "pump_on_flush")
    private int pumpOnFlush;

    @Column(value = "pump_off_flush")
    private int pumpOffFlush;

    @Column(value = "number_reagent_pumps")
    private int numberReagentPumps;

    @Column(value = "valve_delay")
    private int valveDelay;

    @Column(value = "pump_on_ind")
    private int pumpOnInd;

    @Column(value = "pv_off_ind")
    private int pvOffInd;

    @Column(value = "number_blanks")
    private int numberBlanks;

    @Column(value = "pump_measure_t")
    private int pumpMeasureT;

    @Column(value = "pump_off_to_measure")
    private int pumpOffToMeasure;

    @Column(value = "measure_to_pump_on")
    private int measureToPumpOn;

    @Column(value = "number_measurements")
    private int numberMeasurements;

    @Column(value = "salinity_delay")
    private int salinityDelay;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setLaunchTime((long) particle.get("launch_time"));
        setStartTimeOffset((int) particle.get("start_time_offset"));
        setRecordingTime((int) particle.get("recording_time"));
        setPmiSampleSchedule((int) particle.get("pmi_sample_schedule"));
        setSamiSampleSchedule((int) particle.get("sami_sample_schedule"));
        setSlot1FollowsSamiSample((int) particle.get("slot1_follows_sami_sample"));
        setSlot1IndependentSchedule((int) particle.get("slot1_independent_schedule"));
        setSlot2FollowsSamiSample((int) particle.get("slot2_follows_sami_sample"));
        setSlot2IndependentSchedule((int) particle.get("slot2_independent_schedule"));
        setSlot3FollowsSamiSample((int) particle.get("slot3_follows_sami_sample"));
        setSlot3IndependentSchedule((int) particle.get("slot3_independent_schedule"));
        setTimerIntervalSami((int) particle.get("timer_interval_sami"));
        setDriverIdSami((int) particle.get("driver_id_sami"));
        setParameterPointerSami((int) particle.get("parameter_pointer_sami"));
        setTimerIntervalDevice1((int) particle.get("timer_interval_device1"));
        setDriverIdDevice1((int) particle.get("driver_id_device1"));
        setParameterPointerDevice1((int) particle.get("parameter_pointer_device1"));
        setTimerIntervalDevice2((int) particle.get("timer_interval_device2"));
        setDriverIdDevice2((int) particle.get("driver_id_device2"));
        setParameterPointerDevice2((int) particle.get("parameter_pointer_device2"));
        setTimerIntervalDevice3((int) particle.get("timer_interval_device3"));
        setDriverIdDevice3((int) particle.get("driver_id_device3"));
        setParameterPointerDevice3((int) particle.get("parameter_pointer_device3"));
        setTimerIntervalPrestart((int) particle.get("timer_interval_prestart"));
        setDriverIdPrestart((int) particle.get("driver_id_prestart"));
        setParameterPointerPrestart((int) particle.get("parameter_pointer_prestart"));
        setUseBaudRate57600((int) particle.get("use_baud_rate_57600"));
        setSendRecordType((int) particle.get("send_record_type"));
        setSendLiveRecords((int) particle.get("send_live_records"));
        setExtendGlobalConfig((int) particle.get("extend_global_config"));
        setNumberSamplesAveraged((int) particle.get("number_samples_averaged"));
        setNumberFlushes((int) particle.get("number_flushes"));
        setPumpOnFlush((int) particle.get("pump_on_flush"));
        setPumpOffFlush((int) particle.get("pump_off_flush"));
        setNumberReagentPumps((int) particle.get("number_reagent_pumps"));
        setValveDelay((int) particle.get("valve_delay"));
        setPumpOnInd((int) particle.get("pump_on_ind"));
        setPvOffInd((int) particle.get("pv_off_ind"));
        setNumberBlanks((int) particle.get("number_blanks"));
        setPumpMeasureT((int) particle.get("pump_measure_t"));
        setPumpOffToMeasure((int) particle.get("pump_off_to_measure"));
        setMeasureToPumpOn((int) particle.get("measure_to_pump_on"));
        setNumberMeasurements((int) particle.get("number_measurements"));
        setSalinityDelay((int) particle.get("salinity_delay"));
    }

    public long getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(long launchTime) {
        this.launchTime = launchTime;
    }
    public int getStartTimeOffset() {
        return startTimeOffset;
    }

    public void setStartTimeOffset(int startTimeOffset) {
        this.startTimeOffset = startTimeOffset;
    }
    public int getRecordingTime() {
        return recordingTime;
    }

    public void setRecordingTime(int recordingTime) {
        this.recordingTime = recordingTime;
    }
    public int getPmiSampleSchedule() {
        return pmiSampleSchedule;
    }

    public void setPmiSampleSchedule(int pmiSampleSchedule) {
        this.pmiSampleSchedule = pmiSampleSchedule;
    }
    public int getSamiSampleSchedule() {
        return samiSampleSchedule;
    }

    public void setSamiSampleSchedule(int samiSampleSchedule) {
        this.samiSampleSchedule = samiSampleSchedule;
    }
    public int getSlot1FollowsSamiSample() {
        return slot1FollowsSamiSample;
    }

    public void setSlot1FollowsSamiSample(int slot1FollowsSamiSample) {
        this.slot1FollowsSamiSample = slot1FollowsSamiSample;
    }
    public int getSlot1IndependentSchedule() {
        return slot1IndependentSchedule;
    }

    public void setSlot1IndependentSchedule(int slot1IndependentSchedule) {
        this.slot1IndependentSchedule = slot1IndependentSchedule;
    }
    public int getSlot2FollowsSamiSample() {
        return slot2FollowsSamiSample;
    }

    public void setSlot2FollowsSamiSample(int slot2FollowsSamiSample) {
        this.slot2FollowsSamiSample = slot2FollowsSamiSample;
    }
    public int getSlot2IndependentSchedule() {
        return slot2IndependentSchedule;
    }

    public void setSlot2IndependentSchedule(int slot2IndependentSchedule) {
        this.slot2IndependentSchedule = slot2IndependentSchedule;
    }
    public int getSlot3FollowsSamiSample() {
        return slot3FollowsSamiSample;
    }

    public void setSlot3FollowsSamiSample(int slot3FollowsSamiSample) {
        this.slot3FollowsSamiSample = slot3FollowsSamiSample;
    }
    public int getSlot3IndependentSchedule() {
        return slot3IndependentSchedule;
    }

    public void setSlot3IndependentSchedule(int slot3IndependentSchedule) {
        this.slot3IndependentSchedule = slot3IndependentSchedule;
    }
    public int getTimerIntervalSami() {
        return timerIntervalSami;
    }

    public void setTimerIntervalSami(int timerIntervalSami) {
        this.timerIntervalSami = timerIntervalSami;
    }
    public int getDriverIdSami() {
        return driverIdSami;
    }

    public void setDriverIdSami(int driverIdSami) {
        this.driverIdSami = driverIdSami;
    }
    public int getParameterPointerSami() {
        return parameterPointerSami;
    }

    public void setParameterPointerSami(int parameterPointerSami) {
        this.parameterPointerSami = parameterPointerSami;
    }
    public int getTimerIntervalDevice1() {
        return timerIntervalDevice1;
    }

    public void setTimerIntervalDevice1(int timerIntervalDevice1) {
        this.timerIntervalDevice1 = timerIntervalDevice1;
    }
    public int getDriverIdDevice1() {
        return driverIdDevice1;
    }

    public void setDriverIdDevice1(int driverIdDevice1) {
        this.driverIdDevice1 = driverIdDevice1;
    }
    public int getParameterPointerDevice1() {
        return parameterPointerDevice1;
    }

    public void setParameterPointerDevice1(int parameterPointerDevice1) {
        this.parameterPointerDevice1 = parameterPointerDevice1;
    }
    public int getTimerIntervalDevice2() {
        return timerIntervalDevice2;
    }

    public void setTimerIntervalDevice2(int timerIntervalDevice2) {
        this.timerIntervalDevice2 = timerIntervalDevice2;
    }
    public int getDriverIdDevice2() {
        return driverIdDevice2;
    }

    public void setDriverIdDevice2(int driverIdDevice2) {
        this.driverIdDevice2 = driverIdDevice2;
    }
    public int getParameterPointerDevice2() {
        return parameterPointerDevice2;
    }

    public void setParameterPointerDevice2(int parameterPointerDevice2) {
        this.parameterPointerDevice2 = parameterPointerDevice2;
    }
    public int getTimerIntervalDevice3() {
        return timerIntervalDevice3;
    }

    public void setTimerIntervalDevice3(int timerIntervalDevice3) {
        this.timerIntervalDevice3 = timerIntervalDevice3;
    }
    public int getDriverIdDevice3() {
        return driverIdDevice3;
    }

    public void setDriverIdDevice3(int driverIdDevice3) {
        this.driverIdDevice3 = driverIdDevice3;
    }
    public int getParameterPointerDevice3() {
        return parameterPointerDevice3;
    }

    public void setParameterPointerDevice3(int parameterPointerDevice3) {
        this.parameterPointerDevice3 = parameterPointerDevice3;
    }
    public int getTimerIntervalPrestart() {
        return timerIntervalPrestart;
    }

    public void setTimerIntervalPrestart(int timerIntervalPrestart) {
        this.timerIntervalPrestart = timerIntervalPrestart;
    }
    public int getDriverIdPrestart() {
        return driverIdPrestart;
    }

    public void setDriverIdPrestart(int driverIdPrestart) {
        this.driverIdPrestart = driverIdPrestart;
    }
    public int getParameterPointerPrestart() {
        return parameterPointerPrestart;
    }

    public void setParameterPointerPrestart(int parameterPointerPrestart) {
        this.parameterPointerPrestart = parameterPointerPrestart;
    }
    public int getUseBaudRate57600() {
        return useBaudRate57600;
    }

    public void setUseBaudRate57600(int useBaudRate57600) {
        this.useBaudRate57600 = useBaudRate57600;
    }
    public int getSendRecordType() {
        return sendRecordType;
    }

    public void setSendRecordType(int sendRecordType) {
        this.sendRecordType = sendRecordType;
    }
    public int getSendLiveRecords() {
        return sendLiveRecords;
    }

    public void setSendLiveRecords(int sendLiveRecords) {
        this.sendLiveRecords = sendLiveRecords;
    }
    public int getExtendGlobalConfig() {
        return extendGlobalConfig;
    }

    public void setExtendGlobalConfig(int extendGlobalConfig) {
        this.extendGlobalConfig = extendGlobalConfig;
    }
    public int getNumberSamplesAveraged() {
        return numberSamplesAveraged;
    }

    public void setNumberSamplesAveraged(int numberSamplesAveraged) {
        this.numberSamplesAveraged = numberSamplesAveraged;
    }
    public int getNumberFlushes() {
        return numberFlushes;
    }

    public void setNumberFlushes(int numberFlushes) {
        this.numberFlushes = numberFlushes;
    }
    public int getPumpOnFlush() {
        return pumpOnFlush;
    }

    public void setPumpOnFlush(int pumpOnFlush) {
        this.pumpOnFlush = pumpOnFlush;
    }
    public int getPumpOffFlush() {
        return pumpOffFlush;
    }

    public void setPumpOffFlush(int pumpOffFlush) {
        this.pumpOffFlush = pumpOffFlush;
    }
    public int getNumberReagentPumps() {
        return numberReagentPumps;
    }

    public void setNumberReagentPumps(int numberReagentPumps) {
        this.numberReagentPumps = numberReagentPumps;
    }
    public int getValveDelay() {
        return valveDelay;
    }

    public void setValveDelay(int valveDelay) {
        this.valveDelay = valveDelay;
    }
    public int getPumpOnInd() {
        return pumpOnInd;
    }

    public void setPumpOnInd(int pumpOnInd) {
        this.pumpOnInd = pumpOnInd;
    }
    public int getPvOffInd() {
        return pvOffInd;
    }

    public void setPvOffInd(int pvOffInd) {
        this.pvOffInd = pvOffInd;
    }
    public int getNumberBlanks() {
        return numberBlanks;
    }

    public void setNumberBlanks(int numberBlanks) {
        this.numberBlanks = numberBlanks;
    }
    public int getPumpMeasureT() {
        return pumpMeasureT;
    }

    public void setPumpMeasureT(int pumpMeasureT) {
        this.pumpMeasureT = pumpMeasureT;
    }
    public int getPumpOffToMeasure() {
        return pumpOffToMeasure;
    }

    public void setPumpOffToMeasure(int pumpOffToMeasure) {
        this.pumpOffToMeasure = pumpOffToMeasure;
    }
    public int getMeasureToPumpOn() {
        return measureToPumpOn;
    }

    public void setMeasureToPumpOn(int measureToPumpOn) {
        this.measureToPumpOn = measureToPumpOn;
    }
    public int getNumberMeasurements() {
        return numberMeasurements;
    }

    public void setNumberMeasurements(int numberMeasurements) {
        this.numberMeasurements = numberMeasurements;
    }
    public int getSalinityDelay() {
        return salinityDelay;
    }

    public void setSalinityDelay(int salinityDelay) {
        this.salinityDelay = salinityDelay;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}