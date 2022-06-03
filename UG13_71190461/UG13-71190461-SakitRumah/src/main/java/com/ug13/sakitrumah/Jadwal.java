package com.ug13.sakitrumah;

public class Jadwal {
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    boolean statusDaftar = false;
    boolean statusScreening = false;

    public void statusDaftar(boolean type) {
        this.statusDaftar = type;
    }
    public void statusScreening(boolean type) {
        this.statusScreening = type;
    }


}
