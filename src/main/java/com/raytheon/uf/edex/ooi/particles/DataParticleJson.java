package com.raytheon.uf.edex.ooi.particles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataParticleJson {

    private double driver_timestamp;
    private double internal_timestamp;
    private double ingestion_timestamp;
    private double port_timestamp;
    private String preferred_timestamp;
    private String pkt_format_id;
    private int pkt_version;
    private String quality_flag;
    private String stream_name;
    private List<Map<String, Object>> values;
    private Map<String, Object> valueMap;

    @Override
    public String toString() {
        return "DataParticle{" +
                "driver_timestamp=" + driver_timestamp +
                ", internal_timestamp=" + internal_timestamp +
                ", ingestion_timestamp=" + ingestion_timestamp +
                ", port_timestamp=" + port_timestamp +
                ", preferred_timestamp='" + preferred_timestamp + '\'' +
                ", pkt_format_id='" + pkt_format_id + '\'' +
                ", pkt_version=" + pkt_version +
                ", quality_flag='" + quality_flag + '\'' +
                ", values=" + values +
                '}';
    }

    public Object get(String key) {
        if (valueMap == null) {
            flatten();
        }
        if (valueMap.containsKey(key))
            return valueMap.get(key);
        return null;
    }

    public void flatten() {
        valueMap = new HashMap<>();
        for (Map<String, Object> map: values) {
            String id = (String) map.get("value_id");
            Object value = map.get("value");
            valueMap.put(id, value);
        }
    }

    public double getTime() {
        switch (preferred_timestamp) {
            case "driver_timestamp":
                return driver_timestamp;
            case "ingestion_timestamp":
                return ingestion_timestamp;
            case "port_timestamp":
                return port_timestamp;
            case "internal_timestamp":
                return internal_timestamp;
            default:
                return 0.0;
        }
    }

    public List<Map<String, Object>> getValues() {
        return values;
    }

    public void setValues(List<Map<String, Object>> values) {
        this.values = values;
    }

    public double getDriver_timestamp() {
        return driver_timestamp;
    }

    public void setDriver_timestamp(double driver_timestamp) {
        this.driver_timestamp = driver_timestamp;
    }

    public double getInternal_timestamp() {
        return internal_timestamp;
    }

    public void setInternal_timestamp(double internal_timestamp) {
        this.internal_timestamp = internal_timestamp;
    }

    public double getIngestion_timestamp() {
        return ingestion_timestamp;
    }

    public void setIngestion_timestamp(double ingestion_timestamp) {
        this.ingestion_timestamp = ingestion_timestamp;
    }

    public double getPort_timestamp() {
        return port_timestamp;
    }

    public void setPort_timestamp(double port_timestamp) {
        this.port_timestamp = port_timestamp;
    }

    public String getPreferred_timestamp() {
        return preferred_timestamp;
    }

    public void setPreferred_timestamp(String preferred_timestamp) {
        this.preferred_timestamp = preferred_timestamp;
    }

    public String getPkt_format_id() {
        return pkt_format_id;
    }

    public void setPkt_format_id(String pkt_format_id) {
        this.pkt_format_id = pkt_format_id;
    }

    public int getPkt_version() {
        return pkt_version;
    }

    public void setPkt_version(int pkt_version) {
        this.pkt_version = pkt_version;
    }

    public String getQuality_flag() {
        return quality_flag;
    }

    public void setQuality_flag(String quality_flag) {
        this.quality_flag = quality_flag;
    }

    public String getStream_name() {
        return stream_name;
    }

    public void setStream_name(String stream_name) {
        this.stream_name = stream_name;
    }
}
