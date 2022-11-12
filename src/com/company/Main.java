package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        com.company.Animal dog = new com.company.Animal("canis");
        dog.name = "Szarik";
        dog.age = 4;

        System.out.println(dog.name);
        System.out.println(dog.species);
        System.out.println(dog.getWeight() + "kg");


        System.out.println("\n[Task1]\n");
        dog.feed();
        dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();dog.takeForAWalk();


        com.company.Animal cat = new com.company.Animal("felis");
        cat.name = "sierściuch";
        cat.age = 5;


        cat.feed();



        System.out.println("\n[Task2]\n");
        Car c1 = new Car("Caddy", "Volkswagen", 2004, 10000.0); Car c2 = new Car("Octavia", "Skoda", 2007, 15000.0);
        c1.turnOn();
        com.company.Human filip = new com.company.Human("Filip", "Kaniecki");
        filip.setCar(c1);


        System.out.println("\nTask3/4\n");
        System.out.println("Obecna pensja:");
        System.out.println(filip.getCash());
        System.out.println("\n");

        filip.setSalary(10000.0);
        System.out.println(filip.getCash());

        System.out.println("\n[Task5]\n");

        filip.getCar();

        System.out.println("\n[Task6]\n");
        System.out.println(filip.showHuman());
        System.out.println(c2.showCar());
        System.out.println(cat.showAnimal());
        Phone p1 = new Phone("Xiaomi", "Mi 10T Lite", 2020, 6.67);
        p1.os = "Android 10";
        System.out.println(p1.showPhone());
    }
}
