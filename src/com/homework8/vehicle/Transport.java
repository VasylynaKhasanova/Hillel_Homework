package com.homework8.vehicle;

import com.homework8.Action;

public abstract class Transport implements Action {
    private final String vehicleType;
    private final String movingWay;
    private final String brand;
    private final String fuelType;
    private String purposeType;
    private final String passengerCapacity;
    private final String loadCapacity;
    private final int maxMovementSpeedInKmPerHour;
    private final double weightInTones;
    private final double heightInMetres;
    private final double widthInMetres;
    private final double lengthInMetres;

    public Transport(String vehicleType, String movingWay, String brand, String fuelType, String purposeType,
                     String passengerCapacity, String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones,
                     double heightInMetres, double widthInMetres, double lengthInMetres) {
        this.vehicleType = vehicleType;
        this.movingWay = movingWay;
        this.brand = brand;
        this.fuelType = fuelType;
        this.purposeType = purposeType;
        this.passengerCapacity = passengerCapacity;
        this.loadCapacity = loadCapacity;
        this.maxMovementSpeedInKmPerHour = maxMovementSpeedInKmPerHour;
        this.weightInTones = weightInTones;
        this.heightInMetres = heightInMetres;
        this.widthInMetres = widthInMetres;
        this.lengthInMetres = lengthInMetres;
    }

    public Transport(String vehicleType, String movingWay, String brand, String fuelType, String passengerCapacity,
                     String loadCapacity, int maxMovementSpeedInKmPerHour, double weightInTones, double heightInMetres,
                     double widthInMetres, double lengthInMetres) {
        this.vehicleType = vehicleType;
        this.movingWay = movingWay;
        this.brand = brand;
        this.fuelType = fuelType;
        this.passengerCapacity = passengerCapacity;
        this.loadCapacity = loadCapacity;
        this.maxMovementSpeedInKmPerHour = maxMovementSpeedInKmPerHour;
        this.weightInTones = weightInTones;
        this.heightInMetres = heightInMetres;
        this.widthInMetres = widthInMetres;
        this.lengthInMetres = lengthInMetres;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getMovingWay() {
        return movingWay;
    }

    public String getBrand() {
        return brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getPurposeType() {
        return purposeType;
    }

    public String getPassengerCapacity() {
        return passengerCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public int getMaxMovementSpeedInKmPerHour() {
        return maxMovementSpeedInKmPerHour;
    }

    public double getWeightInTones() {
        return weightInTones;
    }

    public double getHeightInMetres() {
        return heightInMetres;
    }

    public double getWidthInMetres() {
        return widthInMetres;
    }

    public double getLengthInMetres() {
        return lengthInMetres;
    }

    @Override
    public void move() {
        System.out.println("I am " + getVehicleType() + "! I can ride on the road!");
    }

    @Override
    public void swim() {
        System.out.println("I am " + getVehicleType() + "! I can swim!");
    }

    @Override
    public void fly() {
        {
            System.out.println("I am " + getVehicleType() + "! I can fly!");
        }
    }

}
