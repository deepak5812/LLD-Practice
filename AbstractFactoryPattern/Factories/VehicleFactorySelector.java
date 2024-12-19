package Patterns.AbstractFactoryPattern.Factories;


public class VehicleFactorySelector {
    public VehicleFactory getFactory(String brand) {
        switch (brand) {
            case "Hero":
                return new HeroFactory();
            case "Bmw":
                return new BmwFactory();
            default:
                return null;
        }
    }
}
