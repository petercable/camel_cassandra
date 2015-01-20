package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "zplsc_status")
public class ZplscStatus extends CassandraParticle {

    @Column(value = "zplsc_connected")
    private int zplscConnected;

    @Column(value = "zplsc_active_38k_mode")
    private String zplscActive38kMode;

    @Column(value = "zplsc_active_38k_power")
    private float zplscActive38kPower;

    @Column(value = "zplsc_active_38k_pulse_length")
    private float zplscActive38kPulseLength;

    @Column(value = "zplsc_active_38k_sample_interval")
    private float zplscActive38kSampleInterval;

    @Column(value = "zplsc_active_120k_mode")
    private String zplscActive120kMode;

    @Column(value = "zplsc_active_120k_power")
    private float zplscActive120kPower;

    @Column(value = "zplsc_active_120k_pulse_length")
    private float zplscActive120kPulseLength;

    @Column(value = "zplsc_active_120k_sample_interval")
    private float zplscActive120kSampleInterval;

    @Column(value = "zplsc_active_200k_mode")
    private String zplscActive200kMode;

    @Column(value = "zplsc_active_200k_power")
    private float zplscActive200kPower;

    @Column(value = "zplsc_active_200k_pulse_length")
    private float zplscActive200kPulseLength;

    @Column(value = "zplsc_active_200k_sample_interval")
    private float zplscActive200kSampleInterval;

    @Column(value = "zplsc_current_utc_time")
    private String zplscCurrentUtcTime;

    @Column(value = "zplsc_executable")
    private String zplscExecutable;

    @Column(value = "zplsc_fs_root")
    private String zplscFsRoot;

    @Column(value = "zplsc_next_scheduled_interval")
    private String zplscNextScheduledInterval;

    @Column(value = "zplsc_host")
    private String zplscHost;

    @Column(value = "zplsc_pid")
    private String zplscPid;

    @Column(value = "zplsc_port")
    private int zplscPort;

    @Column(value = "zplsc_current_raw_filename")
    private String zplscCurrentRawFilename;

    @Column(value = "zplsc_current_raw_filesize")
    private int zplscCurrentRawFilesize;

    @Column(value = "zplsc_file_path")
    private String zplscFilePath;

    @Column(value = "zplsc_file_prefix")
    private String zplscFilePrefix;

    @Column(value = "zplsc_max_file_size")
    private int zplscMaxFileSize;

    @Column(value = "zplsc_sample_range")
    private float zplscSampleRange;

    @Column(value = "zplsc_save_bottom")
    private int zplscSaveBottom;

    @Column(value = "zplsc_save_index")
    private int zplscSaveIndex;

    @Column(value = "zplsc_save_raw")
    private int zplscSaveRaw;

    @Column(value = "zplsc_scheduled_intervals_remaining")
    private int zplscScheduledIntervalsRemaining;

    @Column(value = "zplsc_gpts_enabled")
    private int zplscGptsEnabled;

    @Column(value = "zplsc_schedule_filename")
    private String zplscScheduleFilename;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setZplscConnected((int) particle.get("zplsc_connected"));
        setZplscActive38kMode((String) particle.get("zplsc_active_38k_mode"));
        setZplscActive38kPower((float) particle.get("zplsc_active_38k_power"));
        setZplscActive38kPulseLength((float) particle.get("zplsc_active_38k_pulse_length"));
        setZplscActive38kSampleInterval((float) particle.get("zplsc_active_38k_sample_interval"));
        setZplscActive120kMode((String) particle.get("zplsc_active_120k_mode"));
        setZplscActive120kPower((float) particle.get("zplsc_active_120k_power"));
        setZplscActive120kPulseLength((float) particle.get("zplsc_active_120k_pulse_length"));
        setZplscActive120kSampleInterval((float) particle.get("zplsc_active_120k_sample_interval"));
        setZplscActive200kMode((String) particle.get("zplsc_active_200k_mode"));
        setZplscActive200kPower((float) particle.get("zplsc_active_200k_power"));
        setZplscActive200kPulseLength((float) particle.get("zplsc_active_200k_pulse_length"));
        setZplscActive200kSampleInterval((float) particle.get("zplsc_active_200k_sample_interval"));
        setZplscCurrentUtcTime((String) particle.get("zplsc_current_utc_time"));
        setZplscExecutable((String) particle.get("zplsc_executable"));
        setZplscFsRoot((String) particle.get("zplsc_fs_root"));
        setZplscNextScheduledInterval((String) particle.get("zplsc_next_scheduled_interval"));
        setZplscHost((String) particle.get("zplsc_host"));
        setZplscPid((String) particle.get("zplsc_pid"));
        setZplscPort((int) particle.get("zplsc_port"));
        setZplscCurrentRawFilename((String) particle.get("zplsc_current_raw_filename"));
        setZplscCurrentRawFilesize((int) particle.get("zplsc_current_raw_filesize"));
        setZplscFilePath((String) particle.get("zplsc_file_path"));
        setZplscFilePrefix((String) particle.get("zplsc_file_prefix"));
        setZplscMaxFileSize((int) particle.get("zplsc_max_file_size"));
        setZplscSampleRange((float) particle.get("zplsc_sample_range"));
        setZplscSaveBottom((int) particle.get("zplsc_save_bottom"));
        setZplscSaveIndex((int) particle.get("zplsc_save_index"));
        setZplscSaveRaw((int) particle.get("zplsc_save_raw"));
        setZplscScheduledIntervalsRemaining((int) particle.get("zplsc_scheduled_intervals_remaining"));
        setZplscGptsEnabled((int) particle.get("zplsc_gpts_enabled"));
        setZplscScheduleFilename((String) particle.get("zplsc_schedule_filename"));
    }

    public int getZplscConnected() {
        return zplscConnected;
    }

    public void setZplscConnected(int zplscConnected) {
        this.zplscConnected = zplscConnected;
    }
    public String getZplscActive38kMode() {
        return zplscActive38kMode;
    }

    public void setZplscActive38kMode(String zplscActive38kMode) {
        this.zplscActive38kMode = zplscActive38kMode;
    }
    public float getZplscActive38kPower() {
        return zplscActive38kPower;
    }

    public void setZplscActive38kPower(float zplscActive38kPower) {
        this.zplscActive38kPower = zplscActive38kPower;
    }
    public float getZplscActive38kPulseLength() {
        return zplscActive38kPulseLength;
    }

    public void setZplscActive38kPulseLength(float zplscActive38kPulseLength) {
        this.zplscActive38kPulseLength = zplscActive38kPulseLength;
    }
    public float getZplscActive38kSampleInterval() {
        return zplscActive38kSampleInterval;
    }

    public void setZplscActive38kSampleInterval(float zplscActive38kSampleInterval) {
        this.zplscActive38kSampleInterval = zplscActive38kSampleInterval;
    }
    public String getZplscActive120kMode() {
        return zplscActive120kMode;
    }

    public void setZplscActive120kMode(String zplscActive120kMode) {
        this.zplscActive120kMode = zplscActive120kMode;
    }
    public float getZplscActive120kPower() {
        return zplscActive120kPower;
    }

    public void setZplscActive120kPower(float zplscActive120kPower) {
        this.zplscActive120kPower = zplscActive120kPower;
    }
    public float getZplscActive120kPulseLength() {
        return zplscActive120kPulseLength;
    }

    public void setZplscActive120kPulseLength(float zplscActive120kPulseLength) {
        this.zplscActive120kPulseLength = zplscActive120kPulseLength;
    }
    public float getZplscActive120kSampleInterval() {
        return zplscActive120kSampleInterval;
    }

    public void setZplscActive120kSampleInterval(float zplscActive120kSampleInterval) {
        this.zplscActive120kSampleInterval = zplscActive120kSampleInterval;
    }
    public String getZplscActive200kMode() {
        return zplscActive200kMode;
    }

    public void setZplscActive200kMode(String zplscActive200kMode) {
        this.zplscActive200kMode = zplscActive200kMode;
    }
    public float getZplscActive200kPower() {
        return zplscActive200kPower;
    }

    public void setZplscActive200kPower(float zplscActive200kPower) {
        this.zplscActive200kPower = zplscActive200kPower;
    }
    public float getZplscActive200kPulseLength() {
        return zplscActive200kPulseLength;
    }

    public void setZplscActive200kPulseLength(float zplscActive200kPulseLength) {
        this.zplscActive200kPulseLength = zplscActive200kPulseLength;
    }
    public float getZplscActive200kSampleInterval() {
        return zplscActive200kSampleInterval;
    }

    public void setZplscActive200kSampleInterval(float zplscActive200kSampleInterval) {
        this.zplscActive200kSampleInterval = zplscActive200kSampleInterval;
    }
    public String getZplscCurrentUtcTime() {
        return zplscCurrentUtcTime;
    }

    public void setZplscCurrentUtcTime(String zplscCurrentUtcTime) {
        this.zplscCurrentUtcTime = zplscCurrentUtcTime;
    }
    public String getZplscExecutable() {
        return zplscExecutable;
    }

    public void setZplscExecutable(String zplscExecutable) {
        this.zplscExecutable = zplscExecutable;
    }
    public String getZplscFsRoot() {
        return zplscFsRoot;
    }

    public void setZplscFsRoot(String zplscFsRoot) {
        this.zplscFsRoot = zplscFsRoot;
    }
    public String getZplscNextScheduledInterval() {
        return zplscNextScheduledInterval;
    }

    public void setZplscNextScheduledInterval(String zplscNextScheduledInterval) {
        this.zplscNextScheduledInterval = zplscNextScheduledInterval;
    }
    public String getZplscHost() {
        return zplscHost;
    }

    public void setZplscHost(String zplscHost) {
        this.zplscHost = zplscHost;
    }
    public String getZplscPid() {
        return zplscPid;
    }

    public void setZplscPid(String zplscPid) {
        this.zplscPid = zplscPid;
    }
    public int getZplscPort() {
        return zplscPort;
    }

    public void setZplscPort(int zplscPort) {
        this.zplscPort = zplscPort;
    }
    public String getZplscCurrentRawFilename() {
        return zplscCurrentRawFilename;
    }

    public void setZplscCurrentRawFilename(String zplscCurrentRawFilename) {
        this.zplscCurrentRawFilename = zplscCurrentRawFilename;
    }
    public int getZplscCurrentRawFilesize() {
        return zplscCurrentRawFilesize;
    }

    public void setZplscCurrentRawFilesize(int zplscCurrentRawFilesize) {
        this.zplscCurrentRawFilesize = zplscCurrentRawFilesize;
    }
    public String getZplscFilePath() {
        return zplscFilePath;
    }

    public void setZplscFilePath(String zplscFilePath) {
        this.zplscFilePath = zplscFilePath;
    }
    public String getZplscFilePrefix() {
        return zplscFilePrefix;
    }

    public void setZplscFilePrefix(String zplscFilePrefix) {
        this.zplscFilePrefix = zplscFilePrefix;
    }
    public int getZplscMaxFileSize() {
        return zplscMaxFileSize;
    }

    public void setZplscMaxFileSize(int zplscMaxFileSize) {
        this.zplscMaxFileSize = zplscMaxFileSize;
    }
    public float getZplscSampleRange() {
        return zplscSampleRange;
    }

    public void setZplscSampleRange(float zplscSampleRange) {
        this.zplscSampleRange = zplscSampleRange;
    }
    public int getZplscSaveBottom() {
        return zplscSaveBottom;
    }

    public void setZplscSaveBottom(int zplscSaveBottom) {
        this.zplscSaveBottom = zplscSaveBottom;
    }
    public int getZplscSaveIndex() {
        return zplscSaveIndex;
    }

    public void setZplscSaveIndex(int zplscSaveIndex) {
        this.zplscSaveIndex = zplscSaveIndex;
    }
    public int getZplscSaveRaw() {
        return zplscSaveRaw;
    }

    public void setZplscSaveRaw(int zplscSaveRaw) {
        this.zplscSaveRaw = zplscSaveRaw;
    }
    public int getZplscScheduledIntervalsRemaining() {
        return zplscScheduledIntervalsRemaining;
    }

    public void setZplscScheduledIntervalsRemaining(int zplscScheduledIntervalsRemaining) {
        this.zplscScheduledIntervalsRemaining = zplscScheduledIntervalsRemaining;
    }
    public int getZplscGptsEnabled() {
        return zplscGptsEnabled;
    }

    public void setZplscGptsEnabled(int zplscGptsEnabled) {
        this.zplscGptsEnabled = zplscGptsEnabled;
    }
    public String getZplscScheduleFilename() {
        return zplscScheduleFilename;
    }

    public void setZplscScheduleFilename(String zplscScheduleFilename) {
        this.zplscScheduleFilename = zplscScheduleFilename;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}