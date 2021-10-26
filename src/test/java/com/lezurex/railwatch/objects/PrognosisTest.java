package com.lezurex.railwatch.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.jupiter.api.Test;

public class PrognosisTest {

    @Test
    void testPrognosis() throws JsonProcessingException {
        Prognosis prognosis = Prognosis.fromJson(json);
        assertEquals(10, prognosis.getPlatform());
        assertEquals(58, prognosis.getArrival().getMinutes());
        assertEquals(0, prognosis.getDeparture().getMinutes());
        assertEquals(0, prognosis.getCapacity1st());
        assertEquals(-1, prognosis.getCapacity2nd());
    }

    String json = """
    {
        "platform": 10,
        "arrival": "2022-03-31T08:58:00+02:00",
        "departure": "2022-03-31T09:00:00+02:00",
        "capacity1st": 0,
        "capacity2nd": -1
    }
    """;
    
}
