package Patterns.DecoratorsPattern.Decorator;

import Patterns.DecoratorsPattern.BasePizza;

public class ExtraCheese extends TopingsDecorator{

    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;

    }

    @Override
    public int cost() {
        return this.basePizza.cost()+60;
    }
}
