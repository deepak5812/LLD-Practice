package Patterns.AbstractFactoryPattern.Factories;

import Patterns.AbstractFactoryPattern.Bike;
import Patterns.AbstractFactoryPattern.Car;

public abstract class VehicleFactory {
    abstract public Car createCar();

    abstract public Bike createBike();
}
