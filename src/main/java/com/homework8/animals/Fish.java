package com.homework8.animals;

import com.homework8.Swim;

public class Fish extends Animals implements Swim {
    private final boolean useAsBait;

    public Fish(String classType, String species, String breed, String type, String environmentOfLiving, double weight,
                boolean useAsBait) {
        super(classType, species, breed, type, environmentOfLiving, weight);
        this.useAsBait = useAsBait;
    }

    public boolean isUseAsBait() {
        return useAsBait;
    }

    @Override
    public void swim() {
        System.out.println("I am " + getSpecies() + "! I can swim!");
    }

}
