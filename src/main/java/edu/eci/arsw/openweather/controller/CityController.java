package edu.eci.arsw.openweather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.openweather.service.CityWeatherServices;

@RestController
public class CityController {
    @Autowired
    CityWeatherServices cityWeatherServices;

    @RequestMapping(value = "weather/{city}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherByCity(@PathVariable(name="city") String city) {
        try{
            return new ResponseEntity<>(cityWeatherServices.setWeatherByCity(cityWeatherServices.getWeatherByCity(city)), HttpStatus.ACCEPTED);
        }catch (Exception e) {
            return new ResponseEntity<>("Error al buscar "+city, HttpStatus.BAD_REQUEST);
        }
    }
}
