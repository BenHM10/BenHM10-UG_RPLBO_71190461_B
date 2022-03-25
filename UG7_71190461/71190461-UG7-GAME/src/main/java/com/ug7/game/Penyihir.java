package com.ug7.game;

public class Penyihir extends Karakter {
    private boolean isAbilityReady;

    public Penyihir(Player player) {
        super(player);
    }

    public void buyWeapon(int weapon) {
        System.out.println("Daftar senjata:\n1. Pisau\n2. Tongkat\n3. Tongkat Sihir\n4. Katana");
        System.out.println("Pilihan senjata: " + weapon);
        if (weapon == 2 || weapon == 3) {
            super.buyWeapon(weapon);
        } else {
            System.out.println("Sebagai penyihir kamu hanya boleh membeli tongkat/tongkat sihir!");
            return;
        }
    }

    public void abilityAttack(Karakter karakter) {
        if (this.isAbilityReady) {
            int heal;
            if (isWalk()) {
                heal = karakter.getHP() / 2;
            } else {
                heal = 100;
            }
            System.out.println("Tidak semudah itu, " + karakter.getPlayer().getUsername() + "!");
            receiveHP(heal);
        } else {
            System.out.println("Ability belum aktif!");
        }
    }

    public void walk(boolean type) {
        if (!type)
            System.out.println(getPlayer().getUsername() + " terbang! (Lari)");
        super.walk(type);
    }

    public void getInfo() {
        System.out.println("[Karakter Penyihir]");
        super.getInfo();
    }
}
