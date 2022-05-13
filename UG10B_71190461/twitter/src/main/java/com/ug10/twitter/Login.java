package com.ug10.twitter;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        System.out.println("Selamat datang di Twitter");
        System.out.println("Silahkan login dengan akun Anda.");

        String Username;
        String Password;

        Username = "u71190461";
        Password = "p71190461";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Selamat datang di Twitter, " + username);
        }

        else if (username.equals(Username)) {
            System.out.println("Password Salah!");
        } else if (password.equals(Password)) {
            System.out.println("Username Salah!");
        } else {
            System.out.println("Maaf, Username atau Password salah! Silahkan coba lagi!");
        }

        System.out.println("Kamu diminta untuk mengganti username, silahkan masukkan username kamu");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Username : ");
        String username2 = input3.next();

        if (username2.length() > 6) {
            System.out.println("Maaf, username minimal harus terdiri dari 6 karakter");
        }
        if (username2.matches("^[A-Za-z0-9_-]*$")) {
            System.out.println("Username kamu berhasil diperbaharui," + username2);
        } else {
            System.out.println("Maaf, username hanya boleh mengandung huruf, angka, dan _ (underscore)");
        }

        if (username2.length() > 6 && username2.matches("^[A-Za-z0-9_-]*$")) {
            System.out.println("Username kamu berhasil diperbaharui," + username2);
        }
    }
}