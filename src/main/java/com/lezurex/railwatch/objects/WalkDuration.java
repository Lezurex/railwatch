package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

/** Information about walking distance and duration*/
@Getter
@JsonIgnoreProperties
public class WalkDuration {

    /**
     * Parses a {@link WalkDuration} from a JSON object
     * 
     * @param json JSON-formatted data
     * @return parsed {@link WalkDuration}
     * @throws JsonProcessingException
     */
    public static WalkDuration fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, WalkDuration.class);
    }

    private int duration;

}
