package DesignPrinciple.Duck;

import DesignPrinciple.Duck.behavior.myimplementation.fly.FlyNoWay;
import DesignPrinciple.Duck.behavior.myimplementation.quack.MuteQuack;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        // setting the fly and quack behavior during instantiation itself insted of
        // using getters and setters
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a wooden duck");
    }

}
