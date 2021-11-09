package com.lezurex.railwatch.objects;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

/**
 * A {@link Stop} represents an arrival or a departure point (in time and space)
 * of a {@link Connection}.
 */
@Getter
public class Stop {

    /**
     * Parses a {@link Stop} from a JSON object
     * 
     * @param json JSON-formatted data
     * @return parsed {@link Stop}
     * @throws JsonProcessingException
     */
    public static Stop fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Stop.class);
    }

    /**
     * A {@link Location} object showing this line's stop at the requested station.
     */
    private Location station;
    private Location location;
    /** The arrival time to the checkpoint */
    private Date arrival;
    /** Arrival time as UNIX timestamp */
    private long arrivalTimestamp;
    /** The departure time from the checkpoint */
    private Date departure;
    /** Departure time as UNIX timestamp */
    private long departureTimestamp;
    /**
     * The delay at this {@link Stop}, can be null if no {@link Prognosis} is
     * available.
     */
    private int delay;
    /** The arrival/departure platform */
    private String platform;
    /** The checkpoint {@link Prognosis} */
    private Prognosis prognosis;
    private String realtimeAvailability;

    @Override
    public String toString() {
        return "Stop{" + "station=" + station + ", location=" + location + ", arrival=" + arrival
                + ", arrivalTimestamp=" + arrivalTimestamp + ", departure=" + departure + ", departureTimestamp="
                + departureTimestamp + ", delay=" + delay + ", platform=" + platform + ", prognosis=" + prognosis
                + ", realtimeAvailability='" + realtimeAvailability + '\'' + '}';
    }

}
