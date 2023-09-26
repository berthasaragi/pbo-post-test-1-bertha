package com.bags;

public class Bag {
    private String jenis;
    private String merk;
    private int harga;


    public Bag(String jenis, String merk, int harga) {
        this.jenis = jenis;
        this.merk = merk;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }
    
    public String getMerk() {
        return merk;
    }
    public int getHarga() {
        return harga;
    }
}
    