package com.example.khoa.restaurantentry;
import android.graphics.Bitmap;


public class restaurantData
{
    private Bitmap Picture;
    private String Name;
    private String City;

    public restaurantData(Bitmap picture, String name, String city){
        Picture = picture;
        Name = name;
        City = city;
    }

    public void setPicture(Bitmap picture) {
        Picture = picture;
    }
    public Bitmap getPicture() {
        return Picture;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }

    public void setCity(String city) {
        City = city;
    }
    public String getCity() {
        return City;
    }


}
