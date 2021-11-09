package com.lezurex.railwatch.objects;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
public class Connection {
    
    public static Connection fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Connection.class);
    }

    private Stop from;
    private Stop to;
    private String duration;
    private Service service;
    private String[] products;
    private int capacity1st;
    private int capacity2nd;
    private Section[] sections;
    private int transfers;

    @Override
    public String toString() {
        return "Connection [capacity1st=" + capacity1st + ", capacity2nd=" + capacity2nd + ", duration=" + duration
                + ", from=" + from + ", products=" + Arrays.toString(products) + ", sections="
                + Arrays.toString(sections) + ", service=" + service + ", to=" + to + ", transfers=" + transfers + "]";
    }

}
