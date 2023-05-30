package com.example.earthquake.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Properties {
    @JsonProperty("mag")
    private Float mag;
    @JsonProperty("place")
    private String place;
    @JsonProperty("time")
    private Date time;
    @JsonProperty("updated")
    private Long updated;
    @JsonProperty("tz")
    private Integer tz;
    @JsonProperty("url")
    private String url;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("felt")
    private Integer felt;
    @JsonProperty("cdi")
    private Float cdi;
    @JsonProperty("mmi")
    private Float mmi;
    @JsonProperty("alert")
    private String alert;
    @JsonProperty("status")
    private String status;
    @JsonProperty("tsunami")
    private Integer tsunami;
    @JsonProperty("sig")
    private Integer sig;
    @JsonProperty("net")
    private String net;
    @JsonProperty("code")
    private String code;
    @JsonProperty("ids")
    private String ids;
    @JsonProperty("sources")
    private String sources;
    @JsonProperty("types")
    private String types;
    @JsonProperty("nst")
    private Integer nst;
    @JsonProperty("dmin")
    private Float dmin;
    @JsonProperty("rms")
    private Float rms;
    @JsonProperty("gap")
    private Float gap;
    @JsonProperty("magType")
    private String magType;
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;

    public Properties() {
    }

    public Float getMag() {
        return mag;
    }

    public void setMag(Float mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Integer getTz() {
        return tz;
    }

    public void setTz(Integer tz) {
        this.tz = tz;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getFelt() {
        return felt;
    }

    public void setFelt(Integer felt) {
        this.felt = felt;
    }

    public Float getCdi() {
        return cdi;
    }

    public void setCdi(Float cdi) {
        this.cdi = cdi;
    }

    public Float getMmi() {
        return mmi;
    }

    public void setMmi(Float mmi) {
        this.mmi = mmi;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTsunami() {
        return tsunami;
    }

    public void setTsunami(Integer tsunami) {
        this.tsunami = tsunami;
    }

    public Integer getSig() {
        return sig;
    }

    public void setSig(Integer sig) {
        this.sig = sig;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Integer getNst() {
        return nst;
    }

    public void setNst(Integer nst) {
        this.nst = nst;
    }

    public Float getDmin() {
        return dmin;
    }

    public void setDmin(Float dmin) {
        this.dmin = dmin;
    }

    public Float getRms() {
        return rms;
    }

    public void setRms(Float rms) {
        this.rms = rms;
    }

    public Float getGap() {
        return gap;
    }

    public void setGap(Float gap) {
        this.gap = gap;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "mag=" + mag +
                ", place='" + place + '\'' +
                ", time=" + time +
                ", updated=" + updated +
                ", tz=" + tz +
                ", url='" + url + '\'' +
                ", detail='" + detail + '\'' +
                ", felt=" + felt +
                ", cdi=" + cdi +
                ", mmi=" + mmi +
                ", alert='" + alert + '\'' +
                ", status='" + status + '\'' +
                ", tsunami=" + tsunami +
                ", sig=" + sig +
                ", net='" + net + '\'' +
                ", code='" + code + '\'' +
                ", ids='" + ids + '\'' +
                ", sources='" + sources + '\'' +
                ", types='" + types + '\'' +
                ", nst=" + nst +
                ", dmin=" + dmin +
                ", rms=" + rms +
                ", gap=" + gap +
                ", magType='" + magType + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
