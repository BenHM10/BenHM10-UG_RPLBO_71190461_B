package com.ug7.game;

public class Karakter {
    private Player player;

    private int HP = 100;

    private int money = 5000;

    private int weapon = 0;

    private boolean isWalk = false;

    public Karakter(Player player) {
        this.player = new Player(player.getUsername(), player.getPassword());
    }

    public void buyWeapon(int weapon) {
        int price;
        if (weapon > 0 && weapon < 5) {
            this.weapon = weapon;
        } else {
            System.out.println("Pilihan yang kamu masukkan salah!");
            return;
        }
        switch (weapon) {
            case 1:
                price = 500;
                break;
            case 2:
                price = 3000;
                break;
            case 3:
                price = 2000;
                break;
            case 4:
                price = 4000;
                break;
            default:
                price = 0;
                break;
        }
        if (this.money >= price) {
            this.money -= price;
            System.out.println("Berhasil membeli senjata! Uang sekarang: " + getMoney());
        } else {
            System.out.println("Maaf uang kamu tidak mencukupi!");
            return;
        }
    }

    public void abilityAttack(Karakter karakter) {
        karakter.HP -= 0;
        karakter.receiveDamage(0);
    }

    public void normalAttack(Karakter karakter) {
        int damage;
        switch (this.weapon) {
            case 1:
                damage = 20;
                break;
            case 2:
                damage = 60;
                break;
            case 3:
                damage = 25;
                break;
            case 4:
                damage = 50;
                break;
            default:
                damage = 0;
                break;
        }
        karakter.receiveDamage(damage);
    }

    public void receiveDamage(int damage) {
        this.HP -= damage;
        System.out.println(getPlayer().getUsername() + " terkena serangan! Sisa HP " + getPlayer().getUsername() + ": " + getHP());
        if (getHP() <= 0) {
            this.HP = 0;
            System.out.println(getPlayer().getUsername() + " mati!");
        }
    }

    public void receiveHP(int hp) {
        this.HP += hp;
        if (getHP() > 100)
            this.HP = 100;
        System.out.println("HP sekarang: " + getHP());
    }

    public void getInfo() {
        String weapon, movement;
        System.out.println("Username: " + getPlayer().getUsername());
        System.out.println("Level: " + getPlayer().getLevel());
        System.out.println("Money: " + getMoney());
        String isDie = "";
        if (getHP() <= 0)
            isDie = "[Mati]";
        System.out.println("HP: " + getHP() + " " + isDie);
        switch (this.weapon) {
            case 1:
                weapon = "Pisau";
                break;
            case 2:
                weapon = "Tongkat Sihir";
                break;
            case 3:
                weapon = "Tongkat";
                break;
            case 4:
                weapon = "Katana";
                break;
            default:
                weapon = "Knife";
                break;
        }
        System.out.println("Weapon: " + weapon);
        if (this.isWalk) {
            movement = "Berjalan";
        } else {
            movement = "Berlari";
        }
        System.out.println("Movement: " + movement);
        System.out.println();
    }

    public void walk(boolean type) {
        this.isWalk = type;
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getHP() {
        return this.HP;
    }

    public int getMoney() {
        return this.money;
    }

    public int getWeapon() {
        return this.weapon;
    }

    public boolean isWalk() {
        return this.isWalk;
    }
}
