package edu.eci.arsw.openweather.model;

import java.io.Serializable;

/**
 * @author: Javier E. López
 * @version: 08/04/2021 [ParcialT2]
 */
public class Coord implements Serializable{
    private double lon, lat;

    public Coord(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Coord () {
        
    }

    
    /** 
     * @return double
     */
    public double getLon() {
        return lon;
    }

    
    /** 
     * @param lon
     */
    public void setLon(double lon) {
        this.lon = lon;
    }

    
    /** 
     * @return double
     */
    public double getLat() {
        return lat;
    }

    
    /** 
     * @param lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }
}
