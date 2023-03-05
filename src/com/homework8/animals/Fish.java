package com.homework8.animals;

import com.homework8.animals.Animals;

public class Fish extends Animals {
    private final boolean useAsBait;

    public Fish(String classType, String species, String breed, String type, String environmentOfLiving, double weight,
                boolean useAsBait) {
        super(classType, species, breed, type, environmentOfLiving, weight);
        this.useAsBait = useAsBait;
    }

    public boolean isUseAsBait() {
        return useAsBait;
    }
}
