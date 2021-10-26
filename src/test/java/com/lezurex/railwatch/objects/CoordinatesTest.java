package com.lezurex.railwatch.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.jupiter.api.Test;

public class CoordinatesTest {
    
    @Test
    void testCoordinates() throws JsonProcessingException {
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
