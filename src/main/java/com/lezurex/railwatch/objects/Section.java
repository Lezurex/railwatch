package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

/**
 * Smaller part of a {@link Connection} which contains a single ride with some
 * service.
 */
@Getter
@JsonIgnoreProperties
public class Section {

    /**
     * Parses a {@link Section} from a JSON object
     * 
     * @param json JSON-formatted data
     * @return parsed {@link Section}
     * @throws JsonProcessingException
     */
    public static Section fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Section.class);
    }

    /**
     * A {@link Journey}, the transportation used by this section. Can be null (if
     * it is a walking section, see {@link #walk})
     */
    private Journey journey;
    /** Information about walking distance, if available */
    private WalkDuration walk;
    /** The departure {@link Stop} of the connection */
    private Stop departure;
    /** The arrival {@link Stop} of the connection */
    private Stop arrival;

    @Override
    public String toString() {
        return "Section [arrival=" + arrival + ", departure=" + departure + ", journey=" + journey + ", walk=" + walk
                + "]";
    }

}
