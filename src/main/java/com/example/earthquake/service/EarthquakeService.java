package com.example.earthquake.service;

import com.example.earthquake.model.Earthquake;
import com.example.earthquake.model.EarthquakeApiResponse;
import com.example.earthquake.model.Properties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class EarthquakeService {
    private static final String USGS_API_URL = "https://earthquake.usgs.gov/fdsnws/event/1/query";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public EarthquakeService() {
        httpClient = HttpClients.createDefault();
        objectMapper = new ObjectMapper();
    }

    public List<Earthquake> getEarthquakesByCountryAndDays(String country, int days) throws IOException {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(days);

        String formattedStartDate = startDate.format(DATE_FORMATTER);
        String formattedEndDate = endDate.format(DATE_FORMATTER);

        String url = USGS_API_URL + "?format=geojson&starttime=" + formattedStartDate + "&endtime=" + formattedEndDate;

        HttpGet request = new HttpGet(url);
        HttpResponse response = httpClient.execute(request);

        String responseBody = EntityUtils.toString(response.getEntity());
        EarthquakeApiResponse apiResponse = objectMapper.readValue(responseBody, EarthquakeApiResponse.class);
        List<Earthquake> earthquakes = new ArrayList<>();
        apiResponse.getFeatures().forEach(feature -> {
            String sources = feature.getProperties().getSources().replace(",", "");
            if (sources.contains(country)) {
                Earthquake earthquake = new Earthquake();
                earthquake.setCountry(country);
                earthquake.setPlace(feature.getProperties().getPlace());
                earthquake.setDateTime(feature.getProperties().getTime());
                earthquake.setMagnitude(feature.getProperties().getMag());
                earthquakes.add(earthquake);
            }
        });
        apiResponse.setEarthquakes(earthquakes);

        return apiResponse.getEarthquakes();
    }
}
