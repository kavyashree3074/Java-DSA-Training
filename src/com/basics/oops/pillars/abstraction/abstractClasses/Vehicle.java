package com.basics.oops.pillars.abstraction.abstractClasses;

import java.awt.*;

abstract class Vehicle {
    //Two types of methods
    //1. Normal or Concrete method
    void vehicle_type() {
        System.out.println("Two wheeler or four wheeler");
    }

    // 2.Abstract method
    abstract void start();
    //This method will be defined in the child class
    // If there are only abstract method - 100% abstraction
    // If there is even one normal method - not 100% abstraction
}
class Meteor350 extends Vehicle{

    @Override
    void start() {
        System.out.println("Meteor350 starts with the self");

    }
}
class TataHexa extends Vehicle{

    @Override
    void start() {
        System.out.println("Hexa starts with a key!");

    }
}
class Demo{
    public static void main(String[] args) {
        Meteor350 bike = new Meteor350();
        TataHexa car = new TataHexa();
        bike.start();
        bike.vehicle_type();
        car.start();
        car.vehicle_type();
    }
}