package Patterns.FactoryPattern;

public class ShapeFactory {

    public Shape getShape(String input){

        switch (input){

            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "RHOMBUS":
                return new Rhombus();
            case "SQUARE":
                return new Square();
            default:
                return null;

        }

    }




}
