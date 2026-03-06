package com.basics.oops.pillars.abstraction.interfaces;
public interface Animal {
    // Interfaces have methods with completely empty bodies
    // Interfaces don't have normal methods
    // So they exhibit 100% abstraction
    // The methods are defined in thr child class
    void run();
    void loves_to_eat();
}
class Rat implements Animal{ //When red line appears, bring the cursor and click on implement method and click ok.
    @Override
    public void run(){
        System.out.println("Rats run fast");
    }

    @Override
    public void loves_to_eat() {
        System.out.println("Rats love to eat cheese");
    }
}
class Cat implements Animal{
    @Override
    public void run(){
        System.out.println("Cats run fast");
    }

    @Override
    public void loves_to_eat() {
        System.out.println("Cats love to eat rats");
    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        Rat rat=new Rat();
        rat.run();
        rat.loves_to_eat();
        Cat cat = new Cat();
        cat.run();
        cat.loves_to_eat();
    }
}