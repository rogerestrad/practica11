package com.rogerestrad.practica11;

import java.util.Arrays;

public class Artista {
    private long id;
    private String name;
    private String phone;
    private byte[] photo;
    private String location;
    private float rating;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "artista{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", location='" + location + '\'' +
                '}';
    }
    public boolean ChecarImagen(){
        if (photo==null)
            return false;
        else
            return true;

    }
}
