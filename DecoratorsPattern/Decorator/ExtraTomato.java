package Patterns.DecoratorsPattern.Decorator;

import Patterns.DecoratorsPattern.BasePizza;

public class ExtraTomato extends TopingsDecorator{


    BasePizza basePizza;
    public ExtraTomato(BasePizza basePizza){
        this.basePizza=basePizza;

    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}