package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
public class Location {

    public static Location fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Location.class);
    }

    private int id;
    private LocationType type;
    private String name;
    private int score;
    private Coordinates coordinate;
    private int distance;

    @Override
    public String toString() {
        return "Location [coordinate=" + coordinate + ", distance=" + distance + ", id=" + id + ", name=" + name
                + ", score=" + score + ", type=" + type + "]";
    }

}
