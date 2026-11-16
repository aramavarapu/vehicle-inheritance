package com.pluralsight;

public class Hovercraft extends Vehicle {
    public boolean isInflated;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isInflated) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.isInflated = isInflated;
    }

    public boolean isInflated() {
        return isInflated;
    }

    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }
}
