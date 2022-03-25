package com.ug7.game;

public class Ninja extends Karakter {
    private boolean isAbilityReady;

    public Ninja(Player player) {
        super(player);
    }

    public void buyWeapon(int weapon) {
        System.out.println("Daftar senjata:\n1. Pisau\n2. Tongkat\n3. Tongkat Sihir\n4. Katana");
        System.out.println("Pilihan senjata: " + weapon);
        if (weapon == 1 || weapon == 4) {
            super.buyWeapon(weapon);
        } else {
            System.out.println("Sebagai ninja kamu hanya boleh membeli pisau/katana!");
            return;
        }
    }

    public void abilityAttack(Karakter karakter) {
        if (this.isAbilityReady) {
            int damage = karakter.getHP() / 2;
            if (!isWalk())
                damage = karakter.getHP();
            System.out.println("Rasakan ini, " + karakter.getPlayer().getUsername() + "!");
            karakter.receiveDamage(damage);
            if (karakter.getHP() == 0)
                getPlayer().levelUp();
        } else {
            System.out.println("Ability belum aktif!");
        }
    }

    public void walk(boolean type) {
        if (!type)
            System.out.println(getPlayer().getUsername() + " menghilang! (Lari)");
        super.walk(type);
    }

    public void getInfo() {
        System.out.println("[Karakter Ninja]");
        super.getInfo();
    }
}
