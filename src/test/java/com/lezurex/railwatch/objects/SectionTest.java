package com.lezurex.railwatch.objects;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.jupiter.api.Test;

public class SectionTest {

    @Test
    void testSection() throws JsonProcessingException {
        Section.fromJson(json);
    }

    String json = """
    {
        "journey": {
          "name": "000720",
          "category": "IC",
          "subcategory": null,
          "categoryCode": null,
          "number": "1",
          "operator": "SBB",
          "to": "Genève-Aéroport",
          "passList": [
            {
              "station": {
                "id": "8501120",
                "name": "Lausanne",
                "score": null,
                "coordinate": {
                  "type": "WGS84",
                  "x": 46.516795,
                  "y": 6.629087
                },
                "distance": null
              },
              "arrival": null,
              "arrivalTimestamp": null,
              "departure": "2021-10-26T15:42:00+0200",
              "departureTimestamp": 1635255720,
              "delay": 0,
              "platform": "5",
              "prognosis": {
                "platform": null,
                "arrival": null,
                "departure": "2021-10-26T15:42:00+0200",
                "capacity1st": null,
                "capacity2nd": null
              },
              "realtimeAvailability": null,
              "location": {
                "id": "8501120",
                "name": "Lausanne",
                "score": null,
                "coordinate": {
                  "type": "WGS84",
                  "x": 46.516795,
                  "y": 6.629087
                },
                "distance": null
              }
            },
            {
              "station": {
                "id": "8501008",
                "name": "Genève",
                "score": null,
                "coordinate": {
                  "type": "WGS84",
                  "x": 46.210228,
                  "y": 6.142435
                },
                "distance": null
              },
              "arrival": "2021-10-26T16:18:00+0200",
              "arrivalTimestamp": 1635257880,
              "departure": null,
              "departureTimestamp": null,
              "delay": 0,
              "platform": "3",
              "prognosis": {
                "platform": null,
                "arrival": "2021-10-26T16:18:00+0200",
                "departure": null,
                "capacity1st": null,
                "capacity2nd": null
              },
              "realtimeAvailability": null,
              "location": {
                "id": "8501008",
                "name": "Genève",
                "score": null,
                "coordinate": {
                  "type": "WGS84",
                  "x": 46.210228,
                  "y": 6.142435
                },
                "distance": null
              }
            }
          ],
          "capacity1st": null,
          "capacity2nd": null
        },
        "walk": null,
        "departure": {
          "station": {
            "id": "8501120",
            "name": "Lausanne",
            "score": null,
            "coordinate": {
              "type": "WGS84",
              "x": 46.516795,
              "y": 6.629087
            },
            "distance": null
          },
          "arrival": null,
          "arrivalTimestamp": null,
          "departure": "2021-10-26T15:42:00+0200",
          "departureTimestamp": 1635255720,
          "delay": 0,
          "platform": "5",
          "prognosis": {
            "platform": null,
            "arrival": null,
            "departure": "2021-10-26T15:42:00+0200",
            "capacity1st": null,
            "capacity2nd": null
          },
          "realtimeAvailability": null,
          "location": {
            "id": "8501120",
            "name": "Lausanne",
            "score": null,
            "coordinate": {
              "type": "WGS84",
              "x": 46.516795,
              "y": 6.629087
            },
            "distance": null
          }
        },
        "arrival": {
          "station": {
            "id": "8501008",
            "name": "Genève",
            "score": null,
            "coordinate": {
              "type": "WGS84",
              "x": 46.210228,
              "y": 6.142435
            },
            "distance": null
          },
          "arrival": "2021-10-26T16:18:00+0200",
          "arrivalTimestamp": 1635257880,
          "departure": null,
          "departureTimestamp": null,
          "delay": 0,
          "platform": "3",
          "prognosis": {
            "platform": null,
            "arrival": "2021-10-26T16:18:00+0200",
            "departure": null,
            "capacity1st": null,
            "capacity2nd": null
          },
          "realtimeAvailability": null,
          "location": {
            "id": "8501008",
            "name": "Genève",
            "score": null,
            "coordinate": {
              "type": "WGS84",
              "x": 46.210228,
              "y": 6.142435
            },
            "distance": null
          }
        }
      }
    """;
    
}
