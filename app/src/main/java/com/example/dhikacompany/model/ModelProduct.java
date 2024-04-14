package com.example.dhikacompany.model;

public class ModelProduct {
    String name,deskripsi;
    int image;

    public ModelProduct(String name, String deskripsi, int image) {
        this.name = name;
        this.deskripsi = deskripsi;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getImage() {
        return image;
    }
}
