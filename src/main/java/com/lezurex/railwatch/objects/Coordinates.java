package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
@JsonIgnoreProperties
public class Coordinates {
    
    public static Coordinates fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Coordinates.class);
    }

    private String type;
    private double x;
    private double y;
    
    @Override
    public String toString() {
        return "Coordinates [type=" + type + ", x=" + x + ", y=" + y + "]";
    }

}
