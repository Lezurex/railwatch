package com.lezurex.railwatch;

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

public class Request {

    private String departureStr;
    private String destinationStr;
    private String departureTime;

    public Request(String departureStr, String destinationStr, String departureTime) {
        this.departureStr = departureStr;
        this.destinationStr = destinationStr;
        this.departureTime = departureTime;
    }

    public Connection[] send() {
        try {
            var params = String.format("from=%s&to=%s&time=%s", URLEncoder.encode(departureStr, "UTF-8"),
                    URLEncoder.encode(destinationStr, "UTF-8"), URLEncoder.encode(departureTime, "UTF-8"));
            var url = new URL(String.format("https://transport.opendata.ch/v1/connections?%s", params));
            var connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() == HttpsURLConnection.HTTP_OK) {

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
