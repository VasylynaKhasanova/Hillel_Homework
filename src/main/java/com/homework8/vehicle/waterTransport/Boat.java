package com.homework8.vehicle.waterTransport;

public class Boat extends WaterTransport {
    private final boolean isInflatable;
    private final boolean isMotor;

    public Boat(String vehicleType, String movingWay, String brand, String fuelType, String passengerCapacity,
                String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones, double heightInMetres,
                double widthInMetres, double lengthInMetres, boolean withSail, boolean withAnchor, boolean isInflatable,
                boolean isMotor) {
        super(vehicleType, movingWay, brand, fuelType, passengerCapacity, loadCapacity, maxMovementSpeedInKmPerHour,
                weightInTones, heightInMetres, widthInMetres, lengthInMetres, withSail, withAnchor);
        this.isInflatable = isInflatable;
        this.isMotor = isMotor;
    }

    public boolean isInflatable() {
        return isInflatable;
    }

    public boolean isMotor() {
        return isMotor;
    }
}
