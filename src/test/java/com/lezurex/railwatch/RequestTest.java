package com.lezurex.railwatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RequestTest {

    @Test
    public void testRequest() {
        var request = new Request("Zürich HB", "Bern", "12:00");
        var result = request.send();
        assertEquals("SBB", result[0].getSections()[0].getJourney().getOperator());
    }

}
