package com.example.dhikacompany.model;

public class ModelCompany {
    String name, description;
    int image;

    public ModelCompany(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
