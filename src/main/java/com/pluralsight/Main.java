package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped altRide = new Moped();
        altRide.setColor("Red");
        altRide.setFuelCapacity(5);
        altRide.setNumberOfPassengers(1);
        altRide.setCargoCapacity(40);
        altRide.setHasKickstand(true);
        altRide.setHasPedals(true);
        altRide.setNumberOfWheels(2);
        // Why can a Moped call setColor() when I never created a Vehicle?
        // Because Moped extends Vehicle, so it can get Vehicle's fields and methods

        Car commuter = new Car();
        commuter.setColor("Black");
        commuter.setFuelCapacity(20);
        commuter.setNumberOfPassengers(5);
        commuter.setCargoCapacity(400);
        commuter.setHasTrunk(true);
        commuter.setNumberOfWheels(4);

        SemiTruck roadTrip = new SemiTruck();
        roadTrip.setColor("Blue");
        roadTrip.setFuelCapacity(200);
        roadTrip.setNumberOfPassengers(2);
        roadTrip.setCargoCapacity(4000);
        roadTrip.setHasTrailer(true);
        roadTrip.setNumberOfWheels(18);

        Hovercraft water = new Hovercraft();
        water.setColor("White");
        water.setFuelCapacity(150);
        water.setNumberOfPassengers(5);
        water.setCargoCapacity(450);
        water.setInflated(true);

        System.out.println("Moped: " + altRide.getColor() + ", fuel " + altRide.getFuelCapacity());
        System.out.println("Car: " + commuter.getColor() + ", wheels" + commuter.getNumberOfWheels());
        System.out.println("SemiTruck: " + roadTrip.getColor() + ", trailer? " + roadTrip.isHasTrailer());
        System.out.println("Hovercraft: " + water.getColor() + ", passengers " + water.getNumberOfPassengers());

    }
}
