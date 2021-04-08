package edu.eci.arsw.openweather.model;

import java.io.Serializable;

/**
 * @author: Javier E. López
 * @version: 08/04/2021 [ParcialT2]
 */
public class Wind implements Serializable {
    private double speed;
    private int deg;

    public Wind(double speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public Wind() {

    }

    
    /** 
     * @return int
     */
    public int getDeg() {
        return deg;
    }

    
    /** 
     * @param deg
     */
    public void setDeg(int deg) {
        this.deg = deg;
    }

    
    /** 
     * @return double
     */
    public double getSpeed() {
        return speed;
    }

    
    /** 
     * @param speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
