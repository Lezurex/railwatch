package com.lezurex.railwatch.objects;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

/**
 * Top-level API object which represents a single connection between two
 * {@link Location Locations}. Multiple connections in one request are possible.
 */
@Getter
public class Connection {

    /**
     * Parses a {@link Connection} from a JSON object
     * 
     * @param json JSON-formatted data
     * @return parsed {@link Connection}
     * @throws JsonProcessingException
     */
    public static Connection fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Connection.class);
    }

    /** Departure {@link Stop} of the {@link Connection} */
    private Stop from;
    /** Destination {@link Stop} of the {@link Connection} */
    private Stop to;
    /** Duration of the complete journey in format: 00d00:00:00 */
    private String duration;
    /** How regular this {@link Connection} exists */
    private Service service;
    /** Names of products like: IC, IR, S5 */
    private String[] products;
    /** The maximum estimated occupation load of 1st class coaches */
    private int capacity1st;
    /** The maximum estimated occupation load of 2nd class coaches */
    private int capacity2nd;
    /** List of {@link Section Sections} of this {@link Connection} */
    private Section[] sections;
    /** How many times the user will have to change */
    private int transfers;

    @Override
    public String toString() {
        return "Connection [capacity1st=" + capacity1st + ", capacity2nd=" + capacity2nd + ", duration=" + duration
                + ", from=" + from + ", products=" + Arrays.toString(products) + ", sections="
                + Arrays.toString(sections) + ", service=" + service + ", to=" + to + ", transfers=" + transfers + "]";
    }

}
