package com.ug11.channelsahamukdw;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private int tag = 1;

    public Channel(String email, String namaDepan, String namaBelakang, int tag){
        this.email = email;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tag = tag;
    }

    public void login(String login){
        this.login = login;
    }
    public void bagikanIde(String bagikanIde){
        this.bagikanIde = bagikanIde;
    }
    public void printInfo(String printInfo){
        this.printInfo = printInfo;
    }
}
