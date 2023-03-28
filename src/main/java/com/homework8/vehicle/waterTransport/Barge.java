package com.homework8.vehicle.waterTransport;

public class Barge extends WaterTransport {
    private final boolean withPlatform;

    public Barge(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
                 String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones,
                 double heightInMetres, double widthInMetres, double lengthInMetres, boolean withSail, boolean withAnchor,
                 boolean withPlatform) {
        super(vehicleType, movingWay, brand, fuelType, purposeType, passengerCapacity, loadCapacity, maxMovementSpeedInKmPerHour,
                weightInTones, heightInMetres, widthInMetres, lengthInMetres, withSail, withAnchor);
        this.withPlatform = withPlatform;
    }

    public boolean isWithPlatform() {
        return withPlatform;
    }

    public void carryShipment() {
        System.out.println("I am " + getVehicleType() + "! I'm transporting the goods!");
    }
}
