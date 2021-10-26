package com.lezurex.railwatch.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.junit.jupiter.api.Test;

class ObjectsParsingTest {

    @Test
    void testLocation() throws JsonMappingException, JsonProcessingException {
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

        Location location = Location.fromJson(json);
        assertEquals(8502113, location.getId());
        assertEquals("Aarau", location.getName());
        assertEquals(0, location.getScore());
        assertEquals("WGS84", location.getCoordinate().getType());
        assertEquals(47.391361, location.getCoordinate().getX());
        assertEquals(8.051284, location.getCoordinate().getY());
        assertEquals(0, location.getDistance());

    }

    void testCoordinates() throws JsonMappingException, JsonProcessingException {
        String json = """
        {
            \"type\": \"WGS84\",
            \"x\": 47.391361,
            \"y\": 8.051284
        }
        """;

        Coordinates coordinates = Coordinates.fromJson(json);
        assertEquals("WGS84", coordinates.getType());
        assertEquals(47.391361, coordinates.getX());
        assertEquals(8.051284, coordinates.getY());
    }

}
