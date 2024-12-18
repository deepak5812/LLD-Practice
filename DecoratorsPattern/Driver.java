package Patterns.DecoratorsPattern;

import Patterns.DecoratorsPattern.Decorator.ExtraCheese;
import Patterns.DecoratorsPattern.Decorator.ExtraOnion;

public class Driver {
    public static void main(String[] args){
        /*
        The Decorator Design Pattern is a structural design pattern that allows you to dynamically
        add new functionality to an object without altering its structure or modifying its original
        code
         */
        BasePizza obj=new FarmhousePizza();
        System.out.println("Original FarmHousePizza Price");
        System.out.println(obj.cost());
        System.out.println("After adding ExtraCheese,ExtraOnion FarmHousePizza Price");
        BasePizza obj2=new ExtraCheese(new ExtraOnion(new FarmhousePizza()));
        System.out.println(obj2.cost());


    }

}
