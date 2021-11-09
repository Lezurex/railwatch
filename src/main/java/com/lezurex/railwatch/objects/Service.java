package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

/** Operation information for a {@link Connection}. */
@Getter
public class Service {

    /**
     * Parses a {@link Service} from a JSON object
     * 
     * @param json JSON-formatted data
     * @return parsed {@link Service}
     * @throws JsonProcessingException
     */
    public static Service fromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, Service.class);
    }

    /** Information about how regular a {@link Connection} operates */
    private String regular;
    /** Additional information about irregular operation dates */
    private String irregular;

    @Override
    public String toString() {
        return "Service [irregular=" + irregular + ", regular=" + regular + "]";
    }

}
