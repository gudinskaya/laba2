package org.anngudin.laba2.Auto.Car;

import org.anngudin.laba2.Auto.Auto;

public class Car extends Auto {
    protected int fuel; // расход топлива
    protected int time; // время разгова в сек

    public Car(String mark, String motorType, int mass, int enginePower, int mileage, int fuel, int time) {
        super(mark, motorType, mass, enginePower, mileage);
        this.mark = mark;
        this.motorType = motorType;
        this.mass = mass;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.fuel = fuel;
        this.time = time;
    }

    protected int getFuel() {
        return fuel;
    }

    protected int getTime() {
        return time;
    }

    public void show() {
        super.show();
        System.out.println("Fuel: " + getFuel() + "\nTime: " + getTime());
    }
}
