package edu.eci.arsw.openweather.service;

import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONML;
import org.json.JSONObject;

public interface HTTPServices {
    JSONObject connection(String city) throws UnirestException;
}
