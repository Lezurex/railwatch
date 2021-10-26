package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
public class Section {

    public static Section fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Section.class);
    }

    private Journey journey;
    private String walk;
    private Stop departure;
    private Stop arrival;
    
    @Override
    public String toString() {
        return "Section [arrival=" + arrival + ", departure=" + departure + ", journey=" + journey + ", walk=" + walk
                + "]";
    }
    
}
