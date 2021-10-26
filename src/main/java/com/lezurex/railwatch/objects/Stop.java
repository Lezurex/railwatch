package com.lezurex.railwatch.objects;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
public class Stop {
    
    public static Stop fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Stop.class);
    }

    private Location station;
    private Date arrival;
    private Date departure;
    private int delay;
    private int platform;
    private Prognosis prognosis;
    
    @Override
    public String toString() {
        return "Stop [arrival=" + arrival + ", delay=" + delay + ", departure=" + departure + ", platform=" + platform
                + ", prognosis=" + prognosis + ", station=" + station + "]";
    }

}