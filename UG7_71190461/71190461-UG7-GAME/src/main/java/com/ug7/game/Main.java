package com.ug7.game;

public class Main {
    public static void main(String[] args) {
        Player P_71190480 = new Player("Bantolo", "Soal susah");
        Player P_71190461 = new Player("Ben_HM", "ben.hoffman@ti.ukdw.ac.id");
        Ninja A_71190480 = new Ninja(P_71190480);
        Penyihir B_71190461 = new Penyihir(P_71190461);
        System.out.println("\n========== AWAL ==========");
        A_71190480.getInfo();
        B_71190461.getInfo();
        System.out.println("\n========== NORMAL ATTACK #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(B_71190461);
        System.out.println("\n========== BELI SENJATA #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.buyWeapon(2);
        System.out.print("[" + B_71190461.getPlayer().getUsername() + "] - ");
        B_71190461.buyWeapon(4);
        System.out.println("\n========== BELI SENJATA #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.buyWeapon(1);
        System.out.print("[" + B_71190461.getPlayer().getUsername() + "] - ");
        B_71190461.buyWeapon(3);
        System.out.println("\n========== NORMAL ATTACK #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(B_71190461);
        System.out.print("[" + B_71190461.getPlayer().getUsername() + "] - ");
        B_71190461.normalAttack(A_71190480);
        System.out.println("\n========== ABILITY ATTACK #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(B_71190461);
        System.out.print("[" + B_71190461.getPlayer().getUsername() + "] - ");
        B_71190461.abilityAttack(A_71190480);
        System.out.println("\n========== WALKING AND NORMAL ATTACK #1 ==========");
        A_71190480.walk(true);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(B_71190461);
        B_71190461.walk(true);
        System.out.print("[" + B_71190461.getPlayer().getUsername() + "] - ");
        B_71190461.normalAttack(A_71190480);
        System.out.println("\n========== ABILITY ATTACK #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(B_71190461);
        System.out.print("[" + B_71190461.getPlayer().getUsername() + "] - ");
        B_71190461.abilityAttack(A_71190480);
        System.out.println("\n========== WAR #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.walk(false);
        System.out.print("[" + B_71190461.getPlayer().getUsername() + "] - ");
        B_71190461.walk(false);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(B_71190461);
        System.out.print("[" + B_71190461.getPlayer().getUsername() + "] - ");
        B_71190461.normalAttack(A_71190480);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(B_71190461);
        System.out.println("\n========== AKHIR ==========");
        A_71190480.getInfo();
        B_71190461.getInfo();
    }
}
