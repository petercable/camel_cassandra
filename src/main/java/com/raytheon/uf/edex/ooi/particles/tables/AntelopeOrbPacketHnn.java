package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "antelope_orb_packet_hnn")
public class AntelopeOrbPacketHnn extends CassandraParticle {

    @Column(value = "id")
    private int id;

    @Column(value = "channels")
    private List<Integer> channels;

    @Column(value = "channels_dims")
    private int channelsDims;

    @Column(value = "channels_sizes")
    private List<Long> channelsSizes;

    @Column(value = "db")
    private List<Integer> db;

    @Column(value = "db_dims")
    private int dbDims;

    @Column(value = "db_sizes")
    private List<Long> dbSizes;

    @Column(value = "dfile")
    private String dfile;

    @Column(value = "pf")
    private String pf;

    @Column(value = "srcname")
    private String srcname;

    @Column(value = "string")
    private String string;

    @Column(value = "packet_time")
    private double packetTime;

    @Column(value = "type")
    private String type;

    @Column(value = "version")
    private int version;

    @Column(value = "calib")
    private double calib;

    @Column(value = "calper")
    private double calper;

    @Column(value = "chan")
    private String chan;

    @Column(value = "cuser1")
    private String cuser1;

    @Column(value = "cuser2")
    private String cuser2;

    @Column(value = "data")
    private List<Float> data;

    @Column(value = "data_dims")
    private int dataDims;

    @Column(value = "data_sizes")
    private List<Long> dataSizes;

    @Column(value = "duser1")
    private double duser1;

    @Column(value = "duser2")
    private double duser2;

    @Column(value = "iuser1")
    private int iuser1;

    @Column(value = "iuser2")
    private int iuser2;

    @Column(value = "iuser3")
    private int iuser3;

    @Column(value = "loc")
    private String loc;

    @Column(value = "net")
    private String net;

    @Column(value = "nsamp")
    private int nsamp;

    @Column(value = "samprate")
    private double samprate;

    @Column(value = "segtype")
    private String segtype;

    @Column(value = "sta")
    private String sta;

    @Column(value = "channel_time")
    private double channelTime;

    @Column(value = "suffix")
    private String suffix;

    @Column(value = "subcode")
    private int subcode;

    @Column(value = "joined")
    private String joined;

    @Column(value = "content")
    private int content;

    @Column(value = "name")
    private String name;

    @Column(value = "hdrcode")
    private String hdrcode;

    @Column(value = "bodycode")
    private long bodycode;

    @Column(value = "desc")
    private long desc;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setId((int) particle.get("id"));
        setChannels((List<Integer>) particle.get("channels"));
        setChannelsDims((int) particle.get("channels_dims"));
        setChannelsSizes((List<Long>) particle.get("channels_sizes"));
        setDb((List<Integer>) particle.get("db"));
        setDbDims((int) particle.get("db_dims"));
        setDbSizes((List<Long>) particle.get("db_sizes"));
        setDfile((String) particle.get("dfile"));
        setPf((String) particle.get("pf"));
        setSrcname((String) particle.get("srcname"));
        setString((String) particle.get("string"));
        setPacketTime((double) particle.get("packet_time"));
        setType((String) particle.get("type"));
        setVersion((int) particle.get("version"));
        setCalib((double) particle.get("calib"));
        setCalper((double) particle.get("calper"));
        setChan((String) particle.get("chan"));
        setCuser1((String) particle.get("cuser1"));
        setCuser2((String) particle.get("cuser2"));
        setData((List<Float>) particle.get("data"));
        setDataDims((int) particle.get("data_dims"));
        setDataSizes((List<Long>) particle.get("data_sizes"));
        setDuser1((double) particle.get("duser1"));
        setDuser2((double) particle.get("duser2"));
        setIuser1((int) particle.get("iuser1"));
        setIuser2((int) particle.get("iuser2"));
        setIuser3((int) particle.get("iuser3"));
        setLoc((String) particle.get("loc"));
        setNet((String) particle.get("net"));
        setNsamp((int) particle.get("nsamp"));
        setSamprate((double) particle.get("samprate"));
        setSegtype((String) particle.get("segtype"));
        setSta((String) particle.get("sta"));
        setChannelTime((double) particle.get("channel_time"));
        setSuffix((String) particle.get("suffix"));
        setSubcode((int) particle.get("subcode"));
        setJoined((String) particle.get("joined"));
        setContent((int) particle.get("content"));
        setName((String) particle.get("name"));
        setHdrcode((String) particle.get("hdrcode"));
        setBodycode((long) particle.get("bodycode"));
        setDesc((long) particle.get("desc"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public List<Integer> getChannels() {
        // TODO - restore original dimensions, (remove fill values?)
        return channels;
    }

    public void setChannels(List<Integer> channels) {
        // TODO - flatten for storage, insert fill values
        this.channels = channels;
    }
    public int getChannelsDims() {
        return channelsDims;
    }

    public void setChannelsDims(int channelsDims) {
        this.channelsDims = channelsDims;
    }
    public List<Long> getChannelsSizes() {
        return channelsSizes;
    }

    public void setChannelsSizes(List<Long> channelsSizes) {
        this.channelsSizes = channelsSizes;
    }
    public List<Integer> getDb() {
        // TODO - restore original dimensions, (remove fill values?)
        return db;
    }

    public void setDb(List<Integer> db) {
        // TODO - flatten for storage, insert fill values
        this.db = db;
    }
    public int getDbDims() {
        return dbDims;
    }

    public void setDbDims(int dbDims) {
        this.dbDims = dbDims;
    }
    public List<Long> getDbSizes() {
        return dbSizes;
    }

    public void setDbSizes(List<Long> dbSizes) {
        this.dbSizes = dbSizes;
    }
    public String getDfile() {
        return dfile;
    }

    public void setDfile(String dfile) {
        this.dfile = dfile;
    }
    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf;
    }
    public String getSrcname() {
        return srcname;
    }

    public void setSrcname(String srcname) {
        this.srcname = srcname;
    }
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public double getPacketTime() {
        return packetTime;
    }

    public void setPacketTime(double packetTime) {
        this.packetTime = packetTime;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    public double getCalib() {
        return calib;
    }

    public void setCalib(double calib) {
        this.calib = calib;
    }
    public double getCalper() {
        return calper;
    }

    public void setCalper(double calper) {
        this.calper = calper;
    }
    public String getChan() {
        return chan;
    }

    public void setChan(String chan) {
        this.chan = chan;
    }
    public String getCuser1() {
        return cuser1;
    }

    public void setCuser1(String cuser1) {
        this.cuser1 = cuser1;
    }
    public String getCuser2() {
        return cuser2;
    }

    public void setCuser2(String cuser2) {
        this.cuser2 = cuser2;
    }
    public List<Float> getData() {
        // TODO - restore original dimensions, (remove fill values?)
        return data;
    }

    public void setData(List<Float> data) {
        // TODO - flatten for storage, insert fill values
        this.data = data;
    }
    public int getDataDims() {
        return dataDims;
    }

    public void setDataDims(int dataDims) {
        this.dataDims = dataDims;
    }
    public List<Long> getDataSizes() {
        return dataSizes;
    }

    public void setDataSizes(List<Long> dataSizes) {
        this.dataSizes = dataSizes;
    }
    public double getDuser1() {
        return duser1;
    }

    public void setDuser1(double duser1) {
        this.duser1 = duser1;
    }
    public double getDuser2() {
        return duser2;
    }

    public void setDuser2(double duser2) {
        this.duser2 = duser2;
    }
    public int getIuser1() {
        return iuser1;
    }

    public void setIuser1(int iuser1) {
        this.iuser1 = iuser1;
    }
    public int getIuser2() {
        return iuser2;
    }

    public void setIuser2(int iuser2) {
        this.iuser2 = iuser2;
    }
    public int getIuser3() {
        return iuser3;
    }

    public void setIuser3(int iuser3) {
        this.iuser3 = iuser3;
    }
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }
    public int getNsamp() {
        return nsamp;
    }

    public void setNsamp(int nsamp) {
        this.nsamp = nsamp;
    }
    public double getSamprate() {
        return samprate;
    }

    public void setSamprate(double samprate) {
        this.samprate = samprate;
    }
    public String getSegtype() {
        return segtype;
    }

    public void setSegtype(String segtype) {
        this.segtype = segtype;
    }
    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }
    public double getChannelTime() {
        return channelTime;
    }

    public void setChannelTime(double channelTime) {
        this.channelTime = channelTime;
    }
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    public int getSubcode() {
        return subcode;
    }

    public void setSubcode(int subcode) {
        this.subcode = subcode;
    }
    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }
    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getHdrcode() {
        return hdrcode;
    }

    public void setHdrcode(String hdrcode) {
        this.hdrcode = hdrcode;
    }
    public long getBodycode() {
        return bodycode;
    }

    public void setBodycode(long bodycode) {
        this.bodycode = bodycode;
    }
    public long getDesc() {
        return desc;
    }

    public void setDesc(long desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}