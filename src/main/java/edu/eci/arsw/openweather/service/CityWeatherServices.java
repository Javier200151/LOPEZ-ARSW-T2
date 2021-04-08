package edu.eci.arsw.openweather.service;

import java.io.IOException;

import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;

import edu.eci.arsw.openweather.model.City;

public interface CityWeatherServices {
    JSONObject getWeatherByCity(String city) throws UnirestException, IOException;
    City setWeatherByCity(JSONObject jcity) throws UnirestException, IOException;
}
