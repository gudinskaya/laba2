package org.anngudin.laba2;

import org.anngudin.laba2.Auto.Auto;
import org.anngudin.laba2.Auto.FreightCar.FreightCar;
import org.anngudin.laba2.Auto.Car.Autobus.Autobus;
import org.anngudin.laba2.Auto.Car.Car;

public class Main {
    public static void main(String[] args) {
        Autobus autobus = new Autobus("Maz", "Carbifeous", 7, 250, 2500, 20, 10, 40);
        FreightCar freightCar = new FreightCar("Man", "Disel", 11, 251, 10501, 11, "Closed");
        Car car = new Car("Porshe", "Disel", 2, 400, 1000, 20, 3);
        autobus.show();
        freightCar.show();
        car.show();
    }
}
