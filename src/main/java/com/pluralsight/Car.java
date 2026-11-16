package com.pluralsight;

public class Car extends Vehicle {
    public boolean hasTrunk;
    public int numberOfWheels;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasTrunk, int numberOfWheels) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hasTrunk = hasTrunk;
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isHasTrunk() {
        return hasTrunk;
    }

    public void setHasTrunk(boolean hasTrunk) {
        this.hasTrunk = hasTrunk;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
