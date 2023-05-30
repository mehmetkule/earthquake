package com.example.earthquake.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.james.mime4j.field.datetime.DateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Map;

@Entity
public class Earthquake {
    @Id
    private Long id;
    private  String country;
    private String place;
    private float magnitude;
    private Date dateTime;


    @JsonProperty("properties")
    private void unpackPropertiesFromNestedObject(Map<String, Object> properties) {
        country = (String) properties.get("country");
        place = (String) properties.get("place");
        magnitude = (float) properties.get("mag");
        dateTime = (Date) properties.get("dateTime");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
