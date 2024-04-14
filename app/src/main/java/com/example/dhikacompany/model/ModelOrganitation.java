package com.example.dhikacompany.model;

public class ModelOrganitation {
    String nama,jabatan,masa;
    int image;

    public ModelOrganitation(String nama, String jabatan, String masa, int image) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.masa = masa;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getMasa() {
        return masa;
    }

    public int getImage() {
        return image;
    }
}
