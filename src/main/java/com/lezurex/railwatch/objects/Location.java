package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

/**
 * Describes a location of a {@link Stop} and contains it's {@link Coordinates}.
 */
@Getter
public class Location {

    /**
     * Parses a {@link Location} from a JSON object
     * 
     * @param json JSON-formatted data
     * @return parsed {@link Location}
     * @throws JsonProcessingException
     */
    public static Location fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Location.class);
    }

    private String id;
    /**
     * {@link LocationType Type} of this {@link Location} to differentiate between
     * stations, poi's, etc.
     */
    private LocationType type;
    /** Name of the {@link Location} */
    private String name;
    /** Accuracy/certainity of the now selected {@link Location} */
    private int score;
    /** Exact coordinates */
    private Coordinates coordinate;
    /**
     * If search was made with coordinates, the distance to the original coordinates
     */
    private int distance;

    @Override
    public String toString() {
        return "Location [coordinate=" + coordinate + ", distance=" + distance + ", id=" + id + ", name=" + name
                + ", score=" + score + ", type=" + type + "]";
    }

}
