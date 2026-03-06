package com.basics.oops.diamondProblem;

public interface Cat {
    default void sound(){
        System.out.println("Meow!");
    }
}
interface Dog{
    default void sound(){
        System.out.println("Woof!");
    }
}
class Cog implements Cat, Dog{
    public void sound(){
        // You can use any of these --> it removes ambiguity
        //System.out.println("Fahhh!");
        //Cat.super.sound();
        Dog.super.sound();   //Accessing rom the parent class
    }
}
class Demo{
    public static void main(String[] args) {
        Cog cog = new Cog();
        cog.sound();
    }
}