package com.example.earthquake.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EarthquakeApiResponse {
    @JsonProperty("type")
    private String type;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("features")
    private List<Feature> features;
    @JsonProperty("bbox")
    private List<Float> bbox;
    @JsonProperty("coordinates")
    private List<Float> coordinates;

    public EarthquakeApiResponse() {
    }

    public EarthquakeApiResponse(String type, Metadata metadata, List<Feature> features, List<Float> bbox, List<Float> coordinates) {
        this.type = type;
        this.metadata = metadata;
        this.features = features;
        this.bbox = bbox;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<Float> getBbox() {
        return bbox;
    }

    public void setBbox(List<Float> bbox) {
        this.bbox = bbox;
    }

    public List<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "EarthquakeApiResponse{" +
                "type='" + type + '\'' +
                ", metadata=" + metadata +
                ", features=" + features +
                ", bbox=" + bbox +
                ", coordinates=" + coordinates +
                '}';
    }
    private List<Earthquake> earthquakes;

    public List<Earthquake> getEarthquakes() {
        return earthquakes;
    }

    public void setEarthquakes(List<Earthquake> earthquakes) {
        this.earthquakes = earthquakes;
    }
}

