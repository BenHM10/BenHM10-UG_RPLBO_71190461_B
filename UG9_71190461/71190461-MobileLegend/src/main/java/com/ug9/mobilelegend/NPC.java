package com.ug9.mobilelegend;

public class NPC extends Character {
    private String npc;
    private String attack;

    public NPC(String name, int damage, int health){
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public void attack(Character enemy){

    }
}
