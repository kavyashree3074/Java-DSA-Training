package com.basics.staticKeyword;

public class Example {
    // Static belongs to the Stack memory
    // no objects needed
    // the static block executes with the class before the main()
    static int x =2;
    static {
        System.out.println("Open the system");
    }
    public static void main(String[] args) {
        System.out.println("SNPSU");

    }
    static{
        System.out.println("Start the app");
        System.out.println("db.start()");
        System.out.println("Internet.start");
    }
}
