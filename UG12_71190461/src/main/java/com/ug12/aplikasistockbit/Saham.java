package com.ug12.aplikasistockbit;

public class Saham {
    private long harga;
    private String kode;

    public Saham(long harga, String kode){
        this.harga = harga;
        this.kode = kode;
    }
    public long getHarga() {
        return harga;
    }

    public String getKode() {
        return kode;
    }
}

