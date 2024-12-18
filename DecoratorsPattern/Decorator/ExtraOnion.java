package Patterns.DecoratorsPattern.Decorator;

import Patterns.DecoratorsPattern.BasePizza;

public class ExtraOnion  extends TopingsDecorator{

    BasePizza basePizza;
    public ExtraOnion(BasePizza basePizza){
        this.basePizza=basePizza;

    }

    @Override
    public int cost() {
        return this.basePizza.cost()+40;
    }
}
