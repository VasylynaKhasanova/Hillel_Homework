package com.homework8.animals;

import com.homework8.Fly;
import com.homework8.Move;
import com.homework8.Swim;

public class Bird extends Animals implements Fly, Swim, Move {
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

    @Override
    public void fly() {
        System.out.println("I am " + getSpecies() + "! I can fly!");
    }

    @Override
    public void move() {
        System.out.println("I am " + getSpecies() + "! I can walk!");
    }

    @Override
    public void swim() {
        System.out.println("I am " + getSpecies() + "! I can swim!");
    }
}
