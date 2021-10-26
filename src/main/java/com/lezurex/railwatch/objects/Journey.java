package com.lezurex.railwatch.objects;

import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
public class Journey {
    
    public static Journey fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Journey.class);
    }

    private String name;
    private String category;
    private String categoryCode;
    private String subcategory;
    private String number;
    private String operator;
    private String to;
    private Stop[] passList;
    private int capacity1st;
    private int capacity2nd;

    @Override
    public String toString() {
        return "Journey [capacity1st=" + capacity1st + ", capacity2nd=" + capacity2nd + ", category=" + category
                + ", categoryCode=" + categoryCode + ", name=" + name + ", number=" + number + ", operator=" + operator
                + ", passList=" + Arrays.toString(passList) + ", to=" + to + "]";
    }

}
