package Patterns.AbstractFactoryPattern.Factories;


import Patterns.AbstractFactoryPattern.Bike;
import Patterns.AbstractFactoryPattern.BmwBike;
import Patterns.AbstractFactoryPattern.BmwCar;
import Patterns.AbstractFactoryPattern.Car;


public class BmwFactory extends VehicleFactory {

    @Override
    public Car createCar() {
        return new BmwCar();
    }

    @Override
    public Bike createBike() {
        return new BmwBike();

    }
}
