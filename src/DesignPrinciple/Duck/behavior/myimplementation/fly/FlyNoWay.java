package DesignPrinciple.Duck.behavior.myimplementation.fly;

import DesignPrinciple.Duck.behavior.myinterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
