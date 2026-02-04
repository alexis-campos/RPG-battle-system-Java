package org.example;
import  java.util.Random;

public class Magician implements Character {
    String name;
    int health;
    int attack;
    int Critical;

    public Magician(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    @Override
    public int atacar() {
        Random aleatorio = new Random();
        int critico = aleatorio.nextInt(5);

        if(critico == 3){
            Critical = attack * 3;

        }else {
            Critical = attack;
        }
        return Critical;
    }


    public int getHealth() {
        return health;
    }


}
