package com.homework8.animals;

import com.homework8.Move;

public class Mammal extends Animals implements Move {
    private final boolean isPredator;

    public Mammal(String classType, String species, String breed, String type, String environmentOfLiving, double weightInKg,
                  boolean isPredator) {
        super(classType, species, breed, type, environmentOfLiving, weightInKg);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public void move() {
        System.out.println("I am " + getSpecies() + "! I can walk!");
    }
}
