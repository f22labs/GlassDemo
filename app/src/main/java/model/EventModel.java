package com.example.hariharasudhan.glassfirst;

import java.io.Serializable;

/**
 * Created by hariharasudhan on 13/09/14.
 */
public class EventModel implements Serializable {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    private String platform;
    public String getPlatform(){
        return platform;
    }
    public void setPlatform(String platform){
        this.platform=platform;
    }

    private String image;
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image=image;
    }

    private String country;
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }

    private String place;
    public String getPlace(){
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
}
