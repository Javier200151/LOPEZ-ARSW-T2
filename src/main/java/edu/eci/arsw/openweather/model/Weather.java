package edu.eci.arsw.openweather.model;

import java.io.Serializable;

/**
 * @author: Javier E. López
 * @version: 08/04/2021 [ParcialT2]
 */
public class Weather implements Serializable {
    private int id;
    private String main, description, icon;

    public Weather(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public Weather() {

    }

    
    /** 
     * @return String
     */
    public String getIcon() {
        return icon;
    }

    
    /** 
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    
    /** 
     * @return String
     */
    public String getDescription() {
        return description;
    }

    
    /** 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    /** 
     * @return String
     */
    public String getMain() {
        return main;
    }

    
    /** 
     * @param main
     */
    public void setMain(String main) {
        this.main = main;
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
}
