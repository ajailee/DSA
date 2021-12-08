
package DesignPrinciple.Duck.behavior.myimplementation.quack;

import DesignPrinciple.Duck.behavior.myinterface.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeak");
    }
}
