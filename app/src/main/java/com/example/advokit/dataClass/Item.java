package com.example.advokit.dataClass;

public class Item {
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    int image;
    String name;
    String address;
    String degree;
    int rating;
    String description;

    public Item(int image, String name, String address, String degree, int rating, String description) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.degree = degree;
        this.rating = rating;
        this.description = description;
    }








}

