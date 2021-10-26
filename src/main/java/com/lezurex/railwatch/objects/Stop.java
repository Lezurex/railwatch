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
    private Location location;
    private Date arrival;
    private long arrivalTimestamp;
    private Date departure;
    private long departureTimestamp;
    private int delay;
    private int platform;
    private Prognosis prognosis;
    private String realtimeAvailability;

    @Override
    public String toString() {
        return "Stop{" +
                "station=" + station +
                ", location=" + location +
                ", arrival=" + arrival +
                ", arrivalTimestamp=" + arrivalTimestamp +
                ", departure=" + departure +
                ", departureTimestamp=" + departureTimestamp +
                ", delay=" + delay +
                ", platform=" + platform +
                ", prognosis=" + prognosis +
                ", realtimeAvailability='" + realtimeAvailability + '\'' +
                '}';
    }

}
