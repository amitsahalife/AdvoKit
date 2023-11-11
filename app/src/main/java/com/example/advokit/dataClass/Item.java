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

    public String getDistacne() {
        return distacne;
    }

    public void setDistacne(String distacne) {
        this.distacne = distacne;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
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
    String distacne;
    String hobby;
    String description;

    public Item(int image, String name, String address, String distacne, String hobby, String description) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.distacne = distacne;
        this.hobby = hobby;
        this.description = description;
    }


}

