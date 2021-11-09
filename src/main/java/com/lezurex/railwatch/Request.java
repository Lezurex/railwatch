package com.lezurex.railwatch;

import static java.net.HttpURLConnection.HTTP_OK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lezurex.railwatch.objects.Connection;

/**
 * Sends a GET request to the Transport API using the params from the user input
 */
public class Request {

    /** Query string for the departure location */
    private String departureStr;
    /** Query string for the destination location */
    private String destinationStr;
    /** Query string for the departure time */
    private String departureTime;

    /**
     * Creates a new request ready to be sent to the Transport API
     * 
     * @param departureStr   Query string for the departure location
     * @param destinationStr Query string for the destination location
     * @param departureTime  Query string for the departure time
     */
    public Request(String departureStr, String destinationStr, String departureTime) {
        this.departureStr = departureStr;
        this.destinationStr = destinationStr;
        this.departureTime = departureTime;
    }

    /**
     * Sends the prepared request to the Transport API
     * 
     * @return List of all possible {@link Connection Connections}
     */
    public Connection[] send() {
        try {
            var params = String.format("from=%s&to=%s&time=%s", URLEncoder.encode(departureStr, "UTF-8"),
                    URLEncoder.encode(destinationStr, "UTF-8"), URLEncoder.encode(departureTime, "UTF-8"));
            var url = new URL(String.format("https://transport.opendata.ch/v1/connections?%s", params));
            var connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() == HTTP_OK) {

                var in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String l;
                var sb = new StringBuilder();
                while ((l = in.readLine()) != null) {
                    sb.append(l);
                }
                in.close();
                JsonObject object = (JsonObject) JsonParser.parseString(sb.toString());
                var connectionsJson = object.get("connections").getAsJsonArray().toString();
                return new ObjectMapper().readValue(connectionsJson, Connection[].class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Connection[0];
    }

}
