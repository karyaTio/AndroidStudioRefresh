package com.bookingmobil.jeff.bookingmobil;

public class Showroom {

    private String name;
    private String location;
    private String rating;
    private int Photo;

    public Showroom(){

    }

    public Showroom(String name, String location, String rating, int photo) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        Photo = photo;
    }

    //    Getter

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getRating() {
        return rating;
    }

    public int getPhoto() {
        return Photo;
    }

    //    Setter


    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
