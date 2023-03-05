package com.homework8.vehicle.waterTransport;

public class Cutter extends WaterTransport {

    public Cutter(String vehicleType, String movingWay, String brand, String fuelType, String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones,
                  double heightInMetres, double widthInMetres, double lengthInMetres, boolean withSail, boolean withAnchor) {
        super(vehicleType, movingWay, brand, fuelType, passengerCapacity, loadCapacity, maxMovementSpeedInKmPerHour,
                weightInTones, heightInMetres, widthInMetres, lengthInMetres, withSail, withAnchor);
    }

    @Override
    public void swim() {
        System.out.println("I am " + getVehicleType() + "! I can swim and bring joy to the owner!");
    }
}
