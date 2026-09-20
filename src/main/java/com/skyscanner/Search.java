package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

// Represents the JSON body a user sends to POST /search, e.g. {"city": "petalborough"}.
// @JsonProperty tells Jackson to read the "city" field from the request's JSON.
public class Search {
    @JsonProperty
    private String city;

    // Jackson needs a no-argument constructor to create the object before filling in fields.
    public Search() {

    }

    public Search(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}