package com.homework8.animals;

import com.homework8.Action;

public abstract class Animals implements Action {
    private final String classType;
    private final String species;
    private final String breed;
    private final String type;
    private final String environmentOfLiving;
    private double weightInKg;

    public Animals(String classType, String species, String breed, String type, String environmentOfLiving, double weightInKg) {
        this.classType = classType;
        this.species = species;
        this.breed = breed;
        this.type = type;
        this.environmentOfLiving = environmentOfLiving;
        this.weightInKg = weightInKg;
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

    public String getBreed() {
        return breed;
    }

    public String getType() {
        return type;
    }

    public String getEnvironmentOfLiving() {
        return environmentOfLiving;
    }

    public String getSpecies() {
        return species;
    }

    public String getClassType() {
        return classType;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public void eatFish() {
        System.out.println("I am " + getSpecies() + "! I eat fish!");
    }

}
