package edu.eci.arsw.openweather.service.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import edu.eci.arsw.openweather.service.HTTPServices;

@Service
public class HTTPServicesimpl implements HTTPServices{

    @Override
    public JSONObject connection(String city) throws UnirestException { // d1bcfbab47d918a819df1b59af4eee93
        HttpResponse<String> httpResponse = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=d1bcfbab47d918a819df1b59af4eee93").asString();

        return new JSONObject(httpResponse.getBody());
    }
    
}
