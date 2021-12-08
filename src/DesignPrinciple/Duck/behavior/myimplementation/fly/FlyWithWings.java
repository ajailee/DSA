package DesignPrinciple.Duck.behavior.myimplementation.fly;

import DesignPrinciple.Duck.behavior.myinterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }

}
