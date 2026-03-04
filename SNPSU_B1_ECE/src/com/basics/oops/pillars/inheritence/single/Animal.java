package com.basics.oops.pillars.inheritence.single;
public class Animal {  //Parent Class // Super Class
    void eat(){
        System.out.println("Animal eats some food: ");
    }
}
class Cat extends Animal{    //Child class // Sub class
    void run(){
        System.out.println("Cats run very fast: ");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}