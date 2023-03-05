package com.homework8.vehicle.landTransport;

import com.homework8.vehicle.Transport;

public abstract class LandTransport extends Transport {

    public LandTransport(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
                         String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour,
                         double weightInTones, double heightInMetres, double widthInMetres, double lengthInMetres) {
        super(vehicleType, movingWay, brand, fuelType, purposeType, passengerCapacity, loadCapacity,
                maxMovementSpeedInKmPerHour, weightInTones, heightInMetres, widthInMetres, lengthInMetres);
    }

    public LandTransport(String vehicleType, String movingWay, String brand, String fuelType, String passengerCapacity,
                         String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones, double heightInMetres,
                         double widthInMetres, double lengthInMetres) {
        super(vehicleType, movingWay, brand, fuelType, passengerCapacity, loadCapacity,
                maxMovementSpeedInKmPerHour, weightInTones, heightInMetres, widthInMetres, lengthInMetres);
    }
}
