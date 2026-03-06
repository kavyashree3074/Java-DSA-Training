package com.basics.methods;
public class ExampleOne {
    static void add(int a,int b){// to access methods without objects //(Method definition
        // a,b are parameters and 1&2 are called arguments
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        // ExampleOne obj = new ExampleOne();  // heap memory with the usage of 'new' keyword
        add(1,2); // Method call. The actual value passed during method is called arguments
        // call are  arguments
        System.out.println();
    }
}
