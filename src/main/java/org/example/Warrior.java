package org.example;

public class Warrior implements Character {

    String name;
    int health;
    int attack;

    public Warrior(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    @Override
    public int atacar() {
    return attack ;
    }

    public int getHealth() {
        return health;
    }

}
