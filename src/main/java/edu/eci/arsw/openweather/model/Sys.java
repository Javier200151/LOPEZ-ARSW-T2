package edu.eci.arsw.openweather.model;

import java.io.Serializable;

/**
 * @author: Javier E. López
 * @version: 08/04/2021 [ParcialT2]
 */
public class Sys implements Serializable {
    private int type, id;
    private String country;
    private Long sunrise, sunset;

    public Sys(int type, int id, String country, Long sunrise, Long sunset) {
        this.type = type;
        this.id = id;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Sys() {
        
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }
}
