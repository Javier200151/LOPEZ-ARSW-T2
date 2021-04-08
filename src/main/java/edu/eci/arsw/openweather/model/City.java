package edu.eci.arsw.openweather.model;

public class City {
    private Clouds clouds;
    private Coord coord;
    private Main main;
    private Sys sys;
    private Weather weather;
    private Wind wind;
    private String base, name;
    private long dt;
    private int visibility, timezone, id;

    public City(Clouds clouds, Coord coord, Main main, Sys sys, Weather weather, Wind wind, String base, int visibility, long dt,  int timezone, int id, String name) {
        this.setClouds(clouds);
        this.setCoord(coord);
        this.setWeather(weather);
        this.setBase(base);
        this.setMain(main);
        this.setVisibility(visibility);
        this.setWind(wind);
        this.setDt(dt);
        this.setSys(sys);
        this.setTimezone(timezone);
        this.setId(id);
        this.setName(name);
	}

    public City() {

    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}
