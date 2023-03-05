package com.homework8.vehicle.airMachines;

public class Plane extends AirMachine {
    public Plane(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
                 String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones,
                 double heightInMetres, double widthInMetres, double lengthInMetres, double liftHeight, double hoursInAir) {
        super(vehicleType, movingWay, brand, fuelType, purposeType, passengerCapacity, loadCapacity, maxMovementSpeedInKmPerHour,
                weightInTones, heightInMetres, widthInMetres, lengthInMetres, liftHeight, hoursInAir);
    }
}
