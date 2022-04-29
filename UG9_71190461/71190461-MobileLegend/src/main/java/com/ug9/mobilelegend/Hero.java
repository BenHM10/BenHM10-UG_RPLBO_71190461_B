    package com.ug9.mobilelegend;

public class Hero extends Character{
    private int healthBonus;
    private int level = 1;
    private int healthMax;
    private int lifeSteal = 50;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public void addDamage(){
        this.damage;
    }

    public void attack (Character enemy) {
        int damage;

    }

    public void healthBonus(){

    }

    public int getLevel() {
        return this.level;
    }
}
