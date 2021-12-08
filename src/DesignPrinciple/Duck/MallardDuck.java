package DesignPrinciple.Duck;

import DesignPrinciple.Duck.behavior.myimplementation.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        /*
         * calling the varable of the base calls and setting the behavior
         * here quackBehavior is the variable of the base class and we are setting the
         * Quack behavior to it
         */
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
