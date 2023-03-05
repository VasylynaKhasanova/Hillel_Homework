package com.homework8.animals;

import com.homework8.animals.Animals;

public class Bird extends Animals {
    private final String infraClass;
    private final boolean isWings;

    public Bird(String classType, String infraClass, String species, String breed, String type, String environmentOfLiving,
                double weightInKg, boolean isWings) {
        super(classType, species, breed, type, environmentOfLiving, weightInKg);
        this.infraClass = infraClass;
        this.isWings = isWings;
    }

    public void layEggs() {
        System.out.println("I am " + getSpecies() + "! I can lay eggs!");
    }

    public boolean isWings() {
        return isWings;
    }

    public String getInfraClass() {
        return infraClass;
    }
}
