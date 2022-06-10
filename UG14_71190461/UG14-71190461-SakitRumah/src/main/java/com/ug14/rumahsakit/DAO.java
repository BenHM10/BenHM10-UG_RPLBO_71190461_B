package com.ug14.rumahsakit;

import java.io.BufferedReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAO {
    static String url = "jdbc:mysql://localhost:3306/rumahsakit";
    static Connection con;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        con = DriverManager.getConnection(url,"root","");
        stmt = con.createStatement();
        ArrayList <String> arr = new ArrayList<>();
    }

    public void getDokterbyID(int Dokter){
        this.Dokter = new Dokter;
    }
    public void getSusterByID(int Suster){
        this.Suster = new Suster;
    }
    public void getPelayananByID(int Pelayanan){
        this.Pelayanan = new Pelayanan;
    }
    public void getPasienSembuh()
}
