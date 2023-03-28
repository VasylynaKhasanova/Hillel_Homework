package com.homework8.animals;

public abstract class Animals {
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
