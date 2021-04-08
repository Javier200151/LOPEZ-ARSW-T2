package edu.eci.arsw.openweather.service.impl;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.openweather.model.*;
import edu.eci.arsw.openweather.service.CityWeatherServices;
import edu.eci.arsw.openweather.service.HTTPServices;

/**
 * @author: Javier E. López
 * @version: 08/04/2021 [ParcialT2]
 */
@Service
public class CityWeatherServicesimpl implements CityWeatherServices{
    @Autowired
    HTTPServices httpService;

    public CityWeatherServicesimpl(){}

    /**
     * Obtener el JSON directamente 
     * @param city String, ciudad que se desea buscar
     * @return JSON obtenido de la conexión 
     */
    @Override
    public JSONObject getWeatherByCity(String city) throws UnirestException, IOException {
        JSONObject cityWeather=httpService.connection(city);
        return cityWeather;
    }
    /**
     * Setear las variables obtenidas del JSON a los objetos respectivos
     * @param jcity JSONObject, formato de la información del clima recibida de la ciudad buscada
     * @return nueva ciudad que representa el objeto con cada componente del JSON
     */
    @Override
    public City setWeatherByCity(JSONObject jcity) throws UnirestException, IOException {
        JSONObject jsonObject = jcity.getJSONObject("coord");
        ObjectMapper mapper = new ObjectMapper();
        Coord coord = mapper.readValue(jsonObject.toString(), Coord.class);

        jsonObject = jcity.getJSONArray("weather").getJSONObject(0);
        Weather weather = mapper.readValue(jsonObject.toString(), Weather.class);

        jsonObject = jcity.getJSONObject("main");
        Main main = mapper.readValue(jsonObject.toString(), Main.class);

        jsonObject = jcity.getJSONObject("wind");
        Wind wind = mapper.readValue(jsonObject.toString(), Wind.class);

        jsonObject = jcity.getJSONObject("clouds");
        Clouds clouds = mapper.readValue(jsonObject.toString(), Clouds.class);

        jsonObject = jcity.getJSONObject("sys");
        Sys sys = mapper.readValue(jsonObject.toString(), Sys.class);

        Long dt = jcity.getLong("dt");

        int timezone=jcity.getInt("timezone");

        int id= jcity.getInt("id");

        String name = jcity.getString("name");

        String base = jcity.getString("base");

        int visibility = jcity.getInt("visibility");

        int cod = jcity.getInt("cod");

        return new City(coord, weather, base, main, visibility, wind, clouds, dt, sys, timezone, id, name, cod);
    }

   
}
