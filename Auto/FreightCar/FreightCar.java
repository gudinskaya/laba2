package org.anngudin.laba2.Auto.FreightCar;

import org.anngudin.laba2.Auto.Auto;

public class FreightCar extends Auto {
    protected int carryingCapacity; // в тоннах
    protected String carcase; // открытый. закрытый

    public FreightCar(String mark, String motorType, int mass, int enginePower, int mileage,int carryingCapacity,String carcase) {
        super(mark, motorType, mass, enginePower, mileage);
        this.mark = mark;
        this.motorType = motorType;
        this.mass = mass;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.carryingCapacity = carryingCapacity;
        this.carcase = carcase;
    }

    protected int getCarryingCapacity() {
        return carryingCapacity;

    }

    protected String getCarcase() {
        return carcase;
    }

    public void show() {
        super.show();
        System.out.println("Cattying capacity: " + getCarryingCapacity() + "\nCarcase: " + getCarcase());
    }
}
