package com.bookingmobil.jeff.bookingmobil;

public class Car {

    private String name;
    private String merek;
    private String model;
    private String warna;
    private String harga;
    private int gambar;

    public Car(){

    }

    public Car(String name, String merek, String model, String warna, String harga, int gambar) {
        this.name = name;
        this.merek = merek;
        this.model = model;
        this.warna = warna;
        this.harga = harga;
        this.gambar = gambar;
    }

//    Getter
    public String getName() {
        return name;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public String getWarna() {
        return warna;
    }

    public String getHarga() {
        return harga;
    }

    public int getGambar() {
        return gambar;
    }

//    Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
