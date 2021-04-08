package edu.eci.arsw.openweather.model;

public class Clouds {
    private double all;
    public Clouds(double all){
        this.all = all;
    }

    public Clouds(){

    }

    public double getAll() {
        return all;
    }

    public void setAll(double all) {
        this.all = all;
    }

}
