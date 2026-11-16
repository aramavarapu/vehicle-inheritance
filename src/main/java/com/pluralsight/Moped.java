package com.pluralsight;

public class Moped extends Vehicle{
    private boolean hasKickstand;
    private boolean hasPedals;
    public int numberOfWheels;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasKickstand, boolean hasPedals, int numberOfWheels) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hasKickstand = hasKickstand;
        this.hasPedals = hasPedals;
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isHasKickstand() {
        return hasKickstand;
    }

    public void setHasKickstand(boolean hasKickstand) {
        this.hasKickstand = hasKickstand;
    }

    public boolean isHasPedals() {
        return hasPedals;
    }

    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
