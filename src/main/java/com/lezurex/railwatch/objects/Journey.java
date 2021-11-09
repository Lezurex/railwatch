package com.lezurex.railwatch.objects;

import java.util.Arrays;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

/**
 * The actual transportation of a section, e.g. a bus or a train between two
 * stations.
 */
@Getter
public class Journey {

    /**
     * Parses a {@link Journey} from a JSON object
     * 
     * @param json JSON-formatted data
     * @return parsed {@link Journey}
     * @throws JsonProcessingException
     */
    public static Journey fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Journey.class);
    }

    /** The name of the transportation */
    private String name;
    /** Category of the transportation, e.g. S, IR, IC */
    private String category;
    /** An internal category code of the transportation */
    private String categoryCode;
    /** Can be null */
    private String subcategory;
    /** The number of the transportation line */
    private String number;
    /** The company performing the transportation, e.g. SBB, BLS, RhB, ... */
    private String operator;
    /**
     * Final destination of the train, as seen on the destination display on the
     * vehicle
     */
    private String to;
    /** {@Stops} the train passes on the {@link Journey} */
    private Stop[] passList;
    /** The maximum estimated occupation load of 1st class coaches */
    private int capacity1st;
    /** The maximum estimated occupation load of 2nd class coaches */
    private int capacity2nd;

    @Override
    public String toString() {
        return "Journey [capacity1st=" + capacity1st + ", capacity2nd=" + capacity2nd + ", category=" + category
                + ", categoryCode=" + categoryCode + ", name=" + name + ", number=" + number + ", operator=" + operator
                + ", passList=" + Arrays.toString(passList) + ", to=" + to + "]";
    }

}
