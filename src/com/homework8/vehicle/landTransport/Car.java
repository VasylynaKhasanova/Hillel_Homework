package com.homework8.vehicle.landTransport;

public class Car extends LandTransport {
    public Car(String vehicleType, String movingWay, String brand, String fuelType, String passengerCapacity,
               String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones, double heightInMetres,
               double widthInMetres, double lengthInMetres) {
        super(vehicleType, movingWay, brand, fuelType, passengerCapacity, loadCapacity, maxMovementSpeedInKmPerHour,
                weightInTones, heightInMetres, widthInMetres, lengthInMetres);
    }
}
