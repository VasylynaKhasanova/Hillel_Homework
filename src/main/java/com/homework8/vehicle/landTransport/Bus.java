package com.homework8.vehicle.landTransport;

public class Bus extends LandTransport {
    private final boolean internationalTransportation;

    public Bus(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
               String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones,
               double heightInMetres, double widthInMetres, double lengthInMetres, boolean internationalTransportation) {
        super(vehicleType, movingWay, brand, fuelType, purposeType, passengerCapacity, loadCapacity,
                maxMovementSpeedInKmPerHour, weightInTones, heightInMetres, widthInMetres, lengthInMetres);
        this.internationalTransportation = internationalTransportation;
    }

    public void goAbroad() {
        System.out.println("I am " + getVehicleType() + "! I travel!");
    }

    public boolean isInternationalTransportation() {
        return internationalTransportation;
    }
}
