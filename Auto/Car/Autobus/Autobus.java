package org.anngudin.laba2.Auto.Car.Autobus;

import org.anngudin.laba2.Auto.Car.Car;

public class Autobus extends Car {
    protected int seats;

    public Autobus(String mark, String motorType, int mass, int enginePower, int mileage, int fuel, int time,
            int seats) {
        super(mark, motorType, mass, enginePower, mileage, fuel, time);
        this.mark = mark;
        this.motorType = motorType;
        this.mass = mass;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.fuel = fuel;
        this.time = time;
        this.seats = seats;

    }

    protected int getSeats() {
        return seats;
    }

    public void show() {
        super.show();
        System.out.println("Seats: " + getSeats());
    }
}
