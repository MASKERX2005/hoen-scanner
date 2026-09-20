package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

// Represents one hotel or rental car. Jackson uses the same field names to read
// hotels.json / rental_cars.json and to write the JSON response.
public class SearchResult {
    @JsonProperty
    private String city;

    @JsonProperty
    private String title;

    // The data files don't include "kind", so it is null unless a file provides it.
    @JsonProperty
    private String kind;

    public SearchResult() {
    }

    public SearchResult(String city, String title, String kind) {
        this.city = city;
        this.title = title;
        this.kind = kind;
    }

    public String getCity() {
        return city;
    }

    public String getTitle() {
        return title;
    }

    public String getKind() {
        return kind;
    }
}