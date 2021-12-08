package DesignPrinciple.Duck;

import DesignPrinciple.Duck.behavior.myinterface.FlyBehavior;
import DesignPrinciple.Duck.behavior.myinterface.QuackBehaviour;

/*

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.


                        HAS-A can be better than IS-A

Foo is-a Bar:

public class Foo extends Bar{}
Foo has-a Bar

public class Foo {
    private Bar bar;
}



*/

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehaviour quackBehavior;

    public void swim() {
        System.out.println("Duck can swim");
    }

    public void display() {
        System.out.println("Duck can display");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        System.out.println("setted flyBehavior using setter");
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehaviour quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
