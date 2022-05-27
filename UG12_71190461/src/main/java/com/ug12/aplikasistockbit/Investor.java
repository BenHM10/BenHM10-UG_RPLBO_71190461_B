package com.ug12.aplikasistockbit;

import java.util.HashMap;
import javax.management.loading.PrivateClassLoader;

public class Investor {
    private String username;
    private String password;
    private String nama;

    private HashMap<Saham, Integer> portofolio = new HashMap<Saham, Integer>();
    portofolio.put("BBRI", 4330);
    portofolio.put("ANTM", 2530);
    portofolio.put("ADRO", 3150);
    portofolio.put("BBCA", 7375);

    public Investor(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public HashMap<Saham, Integer> getPortofolio() {
        return portofolio;
    }
}
