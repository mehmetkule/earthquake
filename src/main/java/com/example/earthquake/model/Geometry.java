package com.example.earthquake.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Geometry {
    @JsonProperty("type")
    private String type;
    @JsonProperty("coordinates")
    private List<Float> coordinates;

    public Geometry() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
    }
}
