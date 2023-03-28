package com.homework8.vehicle.airMachines;

import com.homework8.Fly;
import com.homework8.vehicle.Transport;

public abstract class AirMachine extends Transport implements Fly {
    private final double liftHeight;
    private final double hoursInAir;

    public AirMachine(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
                      String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour,
                      double weightInTones, double heightInMetres, double widthInMetres, double lengthInMetres,
                      double liftHeight, double hoursInAir) {
        super(vehicleType, movingWay, brand, fuelType, purposeType, passengerCapacity, loadCapacity,
                maxMovementSpeedInKmPerHour, weightInTones, heightInMetres, widthInMetres, lengthInMetres);
        this.liftHeight = liftHeight;
        this.hoursInAir = hoursInAir;
    }

    public AirMachine(String vehicleType, String movingWay, String brand, String fuelType,
                      String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour,
                      double weightInTones, double heightInMetres, double widthInMetres, double lengthInMetres,
                      double liftHeight, double hoursInAir) {
        super(vehicleType, movingWay, brand, fuelType, passengerCapacity, loadCapacity,
                maxMovementSpeedInKmPerHour, weightInTones, heightInMetres, widthInMetres, lengthInMetres);
        this.liftHeight = liftHeight;
        this.hoursInAir = hoursInAir;
    }

    public double getLiftHeight() {
        return liftHeight;
    }

    public double getHoursInAir() {
        return hoursInAir;
    }

    @Override
    public void fly() {
        {
            System.out.println("I am " + getVehicleType() + "! I can fly!");
        }
    }
}
