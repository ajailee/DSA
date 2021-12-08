package DesignPrinciple.Duck.behavior.myimplementation.quack;

import DesignPrinciple.Duck.behavior.myinterface.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
