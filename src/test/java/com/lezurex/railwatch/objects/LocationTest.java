package com.lezurex.railwatch.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.jupiter.api.Test;

public class LocationTest {

    @Test
    void testLocation() throws JsonProcessingException {
        Location location = Location.fromJson(json);
        assertEquals("8502113", location.getId());
        assertEquals("Aarau", location.getName());
        assertEquals(0, location.getScore());
        assertEquals("WGS84", location.getCoordinate().getType());
        assertEquals(47.391361, location.getCoordinate().getX());
        assertEquals(8.051284, location.getCoordinate().getY());
        assertEquals(0, location.getDistance());

    }

    String json = """
                {
                    \"id\": \"8502113\",
                    \"name\": \"Aarau\",
                    \"score\": null,
                    \"coordinate\": {
                      \"type\": \"WGS84\",
                      \"x\": 47.391361,
                      \"y\": 8.051284
                    },\"distance\": null
            }
                """;

}
