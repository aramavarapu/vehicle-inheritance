package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped altRide = new Moped("Red", 1, 40, 5, true, true, 2);
        // Why can a Moped call setColor() when I never created a Vehicle?
        // Because Moped extends Vehicle, so it can get Vehicle's fields and methods

        Car commuter = new Car("Black",5,400, 20, true, 4);

        SemiTruck roadTrip = new SemiTruck("Blue", 2, 4000, 200, true, 18);

        Hovercraft water = new Hovercraft("White", 5, 450, 150, true);

        System.out.println("Moped: " + altRide.getColor() + ", fuel " + altRide.getFuelCapacity());
        System.out.println("Car: " + commuter.getColor() + ", wheels " + commuter.getNumberOfWheels());
        System.out.println("SemiTruck: " + roadTrip.getColor() + ", trailer? " + roadTrip.isHasTrailer());
        System.out.println("Hovercraft: " + water.getColor() + ", passengers " + water.getNumberOfPassengers());

    }
}
