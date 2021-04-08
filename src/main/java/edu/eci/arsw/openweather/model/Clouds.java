package edu.eci.arsw.openweather.model;

import java.io.Serializable;

/**
 * @author: Javier E. López
 * @version: 08/04/2021 [ParcialT2]
 */
public class Clouds implements Serializable{
    private int all;
    public Clouds(int all){
        this.all = all;
    }

    public Clouds(){

    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

}
