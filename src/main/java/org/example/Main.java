package org.example;

public class Main {
    public static void main(String[] args) {
        var warrior = new Warrior("Juan", 240,20);
        var magician = new Magician("Wizz", 280,12);

        var healthWarrior = warrior.getHealth();
        var healthMagician = magician.getHealth();

        while(healthWarrior > 0 && healthMagician > 0) {
            var attackWarrior = warrior.atacar();
            var attackMagician =  magician.atacar();

            healthMagician = healthMagician - attackWarrior;
            healthWarrior = healthWarrior - attackMagician;

            System.out.println("------------------------------------------------------");
            System.out.println("La salud del Guerrero ahora es de: " + healthWarrior);
            System.out.println("La salud del Mago ahora es de: " + healthMagician);

        }


    }
}


