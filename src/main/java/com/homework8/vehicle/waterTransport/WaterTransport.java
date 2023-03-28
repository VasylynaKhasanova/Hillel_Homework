package com.homework8.vehicle.waterTransport;

import com.homework8.Swim;
import com.homework8.vehicle.Transport;

public abstract class WaterTransport extends Transport implements Swim {
    private final boolean withSail;
    private final boolean withAnchor;

    public WaterTransport(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
                          String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour,
                          double weightInTones, double heightInMetres, double widthInMetres, double lengthInMetres,
                          boolean withSail, boolean withAnchor) {
        super(vehicleType, movingWay, brand, fuelType, purposeType, passengerCapacity, loadCapacity,
                maxMovementSpeedInKmPerHour, weightInTones, heightInMetres, widthInMetres, lengthInMetres);
        this.withAnchor = withAnchor;
        this.withSail = withSail;
    }

    public WaterTransport(String vehicleType, String movingWay, String brand, String fuelType, String passengerCapacity,
                          String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones, double heightInMetres,
                          double widthInMetres, double lengthInMetres, boolean withSail, boolean withAnchor) {
        super(vehicleType, movingWay, brand, fuelType, passengerCapacity, loadCapacity,
                maxMovementSpeedInKmPerHour, weightInTones, heightInMetres, widthInMetres, lengthInMetres);
        this.withAnchor = withAnchor;
        this.withSail = withSail;
    }

    public boolean isWithSail() {
        return withSail;
    }

    public boolean isWithAnchor() {
        return withAnchor;
    }

    @Override
    public void swim() {
        System.out.println("I am " + getVehicleType() + "! I can swim!");
    }
}
