package com.homework8.vehicle.airMachines;

public class Helicopter extends AirMachine {
    int bladesAmount;

    public Helicopter(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
                      String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones,
                      double heightInMetres, double widthInMetres, double lengthInMetres, double liftHeight, double hoursInAir,
                      int bladesAmount) {
        super(vehicleType, movingWay, brand, fuelType, purposeType, passengerCapacity, loadCapacity, maxMovementSpeedInKmPerHour,
                weightInTones, heightInMetres, widthInMetres, lengthInMetres, liftHeight, hoursInAir);
        this.bladesAmount = bladesAmount;
    }
}
