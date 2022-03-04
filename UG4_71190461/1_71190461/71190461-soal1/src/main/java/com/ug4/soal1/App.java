package com.ug4.soal1;

import java.util.Scanner;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        int daun, akar, dahan, umur_pohon, pil;
        Scanner user_input = new Scanner(System.in);

        String pohon;
        System.out.println("================================================");
        System.out.println("Pohon kehidupan");
        System.out.println("Mari menyiapkan pohon kehidupanmu");
        System.out.println("================================================");

        System.out.println("Berapa banyak daun yang akan dimiliki : ");
        daun = user_input.nextInt();

        System.out.println("Berapa banyak akar yang akan tumbuh : ");
        akar = user_input.nextInt();

        System.out.println("Berapa banyak dahan yang akan dimiliki : ");
        dahan = user_input.nextInt();

        System.out.println("Masa hidup pohon kamu adalah 10 tahun");
        System.out.println("Berapa umur mulai pohon kamu : ");
        umur_pohon = user_input.nextInt();

        if (umur_pohon > 10) {
            System.out.println("Maaf umur melebihi masa hidup pohon kamu");
        } else {
            System.out.println("Pohon kehidupan kamu sudah tumbuh");
        }
        String pohon2;
        System.out.println("================================================");
        System.out.println("Pohon kehidupan");
        System.out.println("Atur pohon kamu agar menjadi pohon yang bermanfaat");
        System.out.println("================================================");

        System.out.println("1. Tampilkan informasi pohon");
        System.out.println("2. Masukan musim sekarang");
        System.out.println("3. Panen buah");
        System.out.println("4. Keluar");
        System.out.print("Pilihan Operasi: ");
        pil = user_input.nextInt();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        switch (pil) {
            case 1:
                System.out.println("1. Tampilkan jumlah daun");
                System.out.println("2. Tampilkan jumlah akar");
                System.out.println("3. Tampilkan jumlah dahan");
                System.out.println("4. Tampilkan umur pohon kamu sekarang");
                System.out.println("5. Tampilkan rentang hidup pohon kamu");
                System.out.println("Rentang masa hidup pohon kamu selama 10 tahun");
                System.out.println("6. Tampilkan musim apa sekarang");
                System.out.println("7. Tampilkan berapa banyak buah yang sudah dipanen");
                System.out.println("8. Kembali");
                break;
            case 2:
                String musim;
                System.out.println("Masukan musim apa sekarang (Kemarau, Penghujan, Dingin):");
                musim = user_input.next();
                System.out.println("Berhasil menambahkan musim untuk pohonmu");
                break;
            case 3:
                System.out.println("Ayo panen buahnya");
                System.out.println("Tanggal musimn : ");
                System.out.println("Tanggal hari ini : ");
                System.out.println("Tanggal panen : ");
                System.out.println("Hari sebelum masa panen");
                System.out.println("???");
                break;
            case 4:
                break;
            default:
                System.out.println("Salah memasukan pilihan");
        }
    }
}
