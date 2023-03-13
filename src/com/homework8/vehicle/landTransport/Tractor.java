package com.homework8.vehicle.landTransport;

public class Tractor extends LandTransport {
    private final boolean withTrailer;
    private final boolean withPlow;

    public Tractor(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
                   String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones,
                   double heightInMetres, double widthInMetres, double lengthInMetres, boolean withTrailer, boolean withPlow) {
        super(vehicleType, movingWay, brand, fuelType, purposeType, passengerCapacity, loadCapacity, maxMovementSpeedInKmPerHour,
                weightInTones, heightInMetres, widthInMetres, lengthInMetres);
        this.withTrailer = withTrailer;
        this.withPlow = withPlow;
    }

    @Override
    public void move() {
        System.out.println("I am " + getVehicleType() + "! I can ride on the road and on the ground!");
    }

    public boolean isWithTrailer() {
        return withTrailer;
    }

    public boolean isWithPlow() {
        return withPlow;
    }
}
