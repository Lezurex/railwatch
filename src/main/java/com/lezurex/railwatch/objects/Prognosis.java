package com.lezurex.railwatch.objects;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
public class Prognosis {

    public static Prognosis fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Prognosis.class);
    }

    private int platform;
    private Date departure;
    private Date arrival;
    private int capacity1st;
    private int capacity2nd;

    @Override
    public String toString() {
        return "Prognosis [arrival=" + arrival + ", capacity1st=" + capacity1st + ", capacity2nd=" + capacity2nd
                + ", departure=" + departure + ", platform=" + platform + "]";
    }
    
}
