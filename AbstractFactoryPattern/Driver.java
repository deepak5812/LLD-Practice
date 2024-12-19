package Patterns.AbstractFactoryPattern;

import Patterns.AbstractFactoryPattern.Factories.VehicleFactory;
import Patterns.AbstractFactoryPattern.Factories.VehicleFactorySelector;

public class Driver {

    public static void main(String[] str){

        /*
            The Abstract Factory Design Pattern is a creational design pattern
            that provides an interface for creating families of related or dependent
            objects without specifying their concrete classes.
         */
        VehicleFactorySelector vs=new VehicleFactorySelector();
        VehicleFactory Heroobj1=vs.getFactory("Hero");
        VehicleFactory Heroobj2=vs.getFactory("Bmw");
        Heroobj1.createBike().ride();
        Heroobj1.createCar().drive();
        Heroobj2.createBike().ride();
        Heroobj2.createCar().drive();

    }


}
