package com.company;

public class Animal {

    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.3;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;


    final String species;
    String name;
    private Double weight;
    Integer age;
    Boolean alive;


    Animal(String species) {
        this.species = species;
        this.alive = true;
        // ^default
        if (this.species.equals("canis")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("felis")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }



    private void checkWeight(double weight){
        if(weight <= 0) {
            System.out.println("Zwierzątko jest martwe.");
        }
        else{
            System.out.println("Waga zwięrzątka wynosi: " + this.weight);
        }
    }

    void feed() {
        this.weight++;
        checkWeight(this.weight);
    }

    void feed(Double foodWeight) {
        this.weight += foodWeight;
        System.out.println("Waga zwięrzątka wynosi: " + this.weight);
    }

    void takeForAWalk(){
        this.weight--;
        checkWeight(this.weight);
    }

    Double getWeight() {
        return this.weight;
    }

    void resetWeightToDefault(){
        this.weight = DEFAULT_ANIMAL_WEIGHT;
    }


    String showAnimal()
    {
        return "Gatunek: " + species + " Nazwa " + name + " Waga: " + weight + " kg Wiek: " + age + " lat " + alive;
    }
}
