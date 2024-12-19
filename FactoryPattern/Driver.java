package Patterns.FactoryPattern;

public class Driver {

    public static void main(String[] args){
        /*
           The Factory Design Pattern is a creational design pattern used to create
           objects without exposing the exact class or creation logic to the client.
         */
        ShapeFactory sf=new ShapeFactory();
        Shape shapeObj1=sf.getShape("SQUARE");
        shapeObj1.draw();
        Shape shapeObj2=sf.getShape("CIRCLE");
        shapeObj2.draw();



    }

}
