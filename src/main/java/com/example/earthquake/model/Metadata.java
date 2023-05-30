package com.example.earthquake.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata {
    @JsonProperty("generated")
    private Long generated;
    @JsonProperty("url")
    private String url;
    @JsonProperty("title")
    private String title;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("api")
    private String api;
    @JsonProperty("count")
    private Integer count;

    public Metadata() {
    }

    public Long getGenerated() {
        return generated;
    }

    public void setGenerated(Long generated) {
        this.generated = generated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
