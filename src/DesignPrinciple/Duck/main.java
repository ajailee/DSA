package DesignPrinciple.Duck;

import DesignPrinciple.Duck.behavior.myimplementation.fly.FlyNoWay;
import DesignPrinciple.Duck.behavior.myimplementation.fly.FlyWithWings;

public class main {
    public static void main(String[] args) {

        /* creating the mallard duck */
        MallardDuck mallardDuck = new MallardDuck();
        // setting the fly behavior during run time using setter method
        mallardDuck.display();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.performFly();
        // changing the fly behavior
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performFly();
    }
}
