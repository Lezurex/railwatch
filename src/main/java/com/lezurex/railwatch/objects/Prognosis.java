package com.lezurex.railwatch.objects;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

/** Contains realtime information on the status of a connection {@link Stop}. */
@Getter
public class Prognosis {

    /**
     * Parses a {@link Prognosis} from a JSON object
     * 
     * @param json JSON-formatted data
     * @return parsed {@link Prognosis}
     * @throws JsonProcessingException
     */
    public static Prognosis fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Prognosis.class);
    }

    /** The estimated arrival/departure platform */
    private int platform;
    /** The departure time prognosis to the checkpoint */
    private Date departure;
    /** The arrival time prognosis to the checkpoint */
    private Date arrival;
    /** The estimated occupation load of 1st class coaches */
    private int capacity1st;
    /** The estimated occupation load of 2nd class coaches */
    private int capacity2nd;

    @Override
    public String toString() {
        return "Prognosis [arrival=" + arrival + ", capacity1st=" + capacity1st + ", capacity2nd=" + capacity2nd
                + ", departure=" + departure + ", platform=" + platform + "]";
    }

}
