package edu.eci.arsw.openweather.model;

/**
 * @author: Javier E. López
 * @version: 08/04/2021 [ParcialT2]
 */
public class City {
    private Coord coord;
    private Weather weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private int timezone, id;
    private String name;
    private int cod;

    public City(Coord coord, Weather weather, String base, Main main, int visibility, Wind wind, Clouds clouds, long dt, Sys sys,  int timezone, int id, String name, int cod) {
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
        this.setCod(cod);
	}

    public City() {

    }

    
    /** 
     * @return int
     */
    public int getId() {
        return id;
    }
    
    
    /** 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /** 
     * @return int
     */
    public int getCod() {
        return cod;
    }
    
    
    /** 
     * @param cod
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    
    /** 
     * @return int
     */
    public int getTimezone() {
        return timezone;
    }

    
    /** 
     * @param timezone
     */
    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    
    /** 
     * @return Clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    
    /** 
     * @param clouds
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * @return Sys
     */
    public Sys getSys() {
        return sys;
    }

    
    /** 
     * @param sys
     */
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    
    /** 
     * @return long
     */
    public long getDt() {
        return dt;
    }

    
    /** 
     * @param dt
     */
    public void setDt(long dt) {
        this.dt = dt;
    }

    
    /** 
     * @return Wind
     */
    public Wind getWind() {
        return wind;
    }

    
    /** 
     * @param wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    
    /** 
     * @return int
     */
    public int getVisibility() {
        return visibility;
    }

    
    /** 
     * @param visibility
     */
    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    
    /** 
     * @return Main
     */
    public Main getMain() {
        return main;
    }

    
    /** 
     * @param main
     */
    public void setMain(Main main) {
        this.main = main;
    }

    
    /** 
     * @return String
     */
    public String getBase() {
        return base;
    }

    
    /** 
     * @param base
     */
    public void setBase(String base) {
        this.base = base;
    }

    
    /** 
     * @return Weather
     */
    public Weather getWeather() {
        return weather;
    }

    
    /** 
     * @param weather
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    
    /** 
     * @return Coord
     */
    public Coord getCoord() {
        return coord;
    }

    
    /** 
     * @param coord
     */
    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}
