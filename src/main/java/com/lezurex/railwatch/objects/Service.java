package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
public class Service {

    public static Service fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Service.class);
    }

    private String regular;
    private String irregular;

    @Override
    public String toString() {
        return "Service [irregular=" + irregular + ", regular=" + regular + "]";
    }
    
}
