package com.homework8.animals;

public class Mammal extends Animals {
    private boolean isPredator;

    public Mammal(String classType, String species, String breed, String type, String environmentOfLiving, double weightInKg,
                  boolean isPredator) {
        super(classType, species, breed, type, environmentOfLiving, weightInKg);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }
}
