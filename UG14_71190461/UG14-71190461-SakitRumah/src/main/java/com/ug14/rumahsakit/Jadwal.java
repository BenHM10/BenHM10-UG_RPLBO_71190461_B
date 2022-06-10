package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksaan;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    boolean statusDaftar = false;
    boolean statusScreening = false;

    public void statusDaftar(boolean type) {
        this.statusDaftar = type;
    }
    public void statusScreening(boolean type) {
        this.statusScreening = type;
    }
}
