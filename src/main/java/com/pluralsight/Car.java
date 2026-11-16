package com.pluralsight;

public class Car extends Vehicle {
    public boolean hasTrunk;
    public int numberOfWheels;

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
