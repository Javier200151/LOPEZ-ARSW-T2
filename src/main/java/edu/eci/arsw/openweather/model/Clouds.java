package edu.eci.arsw.openweather.model;

import java.io.Serializable;

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
