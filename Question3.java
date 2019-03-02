package com.DesignPatterns;

enum CarType {MICRO, MINI, LUXURY}

enum Location {INDIA, USA, JAPAN}

abstract class Car {
    private CarType carType;
    private Location location;

    Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class MicroCar extends Car {


    MicroCar(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Micro Car >>>>>");
    }
}

class MiniCar extends Car {


    MiniCar(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Mini Car >>>>>");
    }
}

class LuxuryCar extends Car {


    LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Luxury Car >>>>>");
    }
}

class IndianCarFactory {

    static Car buildIndianCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;
        }
        return car;
    }
}

class USACarFactory {

    static Car buildUSACar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
        }
        return car;
    }
}

class JapanCarFactory {

    static Car buildJapanCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.JAPAN);
                break;
            case MINI:
                car = new MiniCar(Location.JAPAN);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.JAPAN);
                break;
        }
        return car;
    }
}

class CarFactory {

    static Car buildCar(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case INDIA:
                car = IndianCarFactory.buildIndianCar(carType);
                car.construct();
                break;
            case USA:
                car = USACarFactory.buildUSACar(carType);
                car.construct();
                break;
            case JAPAN:
                car = JapanCarFactory.buildJapanCar(carType);
                car.construct();
                break;
        }
        return car;
    }
}

public class Question3 {

    public static void main(String[] args) {

        System.out.println(
                CarFactory.buildCar(CarType.LUXURY, Location.USA)
        );
    }
}
