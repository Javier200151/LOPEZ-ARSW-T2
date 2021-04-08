package edu.eci.arsw.openweather.model;

import java.io.Serializable;

/**
 * @author: Javier E. López
 * @version: 08/04/2021 [ParcialT2]
 */
public class Main implements Serializable {
    private double temp, feels_like, temp_min,temp_max;
    private int pressure, humidity;

    public Main(double temp, double feels_like, double temp_min, double temp_max, int pressure, int humidity) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Main() {
        
    }

    
    /** 
     * @return double
     */
    public double getTemp() {
        return temp;
    }

    
    /** 
     * @param temp
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    
    /** 
     * @return double
     */
    public double getFeels_like() {
        return feels_like;
    }

    
    /** 
     * @param feels_like
     */
    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    
    /** 
     * @return double
     */
    public double getTemp_min() {
        return temp_min;
    }

    
    /** 
     * @param temp_min
     */
    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    
    /** 
     * @return double
     */
    public double getTemp_max() {
        return temp_max;
    }

    
    /** 
     * @param temp_max
     */
    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    
    /** 
     * @return int
     */
    public int getPressure() {
        return pressure;
    }

    
    /** 
     * @param pressure
     */
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    
    /** 
     * @return int
     */
    public int getHumidity() {
        return humidity;
    }

    
    /** 
     * @param humidity
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
