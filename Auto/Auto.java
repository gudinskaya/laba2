//супер класс Авто: марка, тип двигателя, масса, мощность двигателя, пробег км.
//get(), метод класса Марка, который переоределят производные классы
//класс Легковой автомобиль: расход топлива на 100 км, время разгона до 100 км/x в сек
//Грузовой автомобиль: грузоподЬемность в тоннах. тип кузова(открытый/закрытый)
//Автобус производный от Легкового авто: кол-во мест

//добавить везде импорты и getы, в мейн вывод 
package org.anngudin.laba2.Auto;

public class Auto {
    protected String mark;
    protected String motorType;
    protected int mass;
    protected int enginePower;
    protected int mileage; // пробег в км

    public Auto(String mark, String motorType, int mass, int enginePower, int mileage) {
        this.mark = mark;
        this.motorType = motorType;
        this.mass = mass;
        this.enginePower = enginePower;
        this.mileage = mileage;
    }

    public String getMark() {
        return mark;
    }

    public String getMotorType() {
        return motorType;
    }

    public int getMass() {
        return mass;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getMileage() {
        return mileage;
    }

    public void show() {
        System.out.println("\nMark: " + getMark() + "\nMotor type: " + getMotorType() + "\nMass: " + getMass() + "\nEngine Power: " + getEnginePower() + "\nMileage: " + getMileage());
    }
}
