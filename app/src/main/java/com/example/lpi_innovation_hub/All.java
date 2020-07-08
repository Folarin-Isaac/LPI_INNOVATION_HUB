package com.example.lpi_innovation_hub;

public class All {
    private String Name;
    private String Email;
    private int Photo;

    public All() {
    }

    public All(String name, String email, int photo) {
        Name = name;
        Email = email;
        Photo = photo;
    }
    //Getters

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhoto() {
        return Photo;
    }
    //Setters

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
