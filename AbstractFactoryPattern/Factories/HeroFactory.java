package Patterns.AbstractFactoryPattern.Factories;

import Patterns.AbstractFactoryPattern.Bike;
import Patterns.AbstractFactoryPattern.Car;
import Patterns.AbstractFactoryPattern.HeroBike;
import Patterns.AbstractFactoryPattern.HeroCar;

public class HeroFactory extends VehicleFactory{
    @Override
    public Car createCar() {
        return new HeroCar();
    }

    @Override
    public Bike createBike() {
        return new HeroBike();
    }
}
