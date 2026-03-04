package com.basics.exceptions;
public class E3 {
    static void chechAge(int age){
        if(age>=18){
            System.out.println("Access granted - Eligible");
        }else{
            throw new RuntimeException("Access denied - Not Eligible");
            // usage of if-else block will just check and
            // go to the next line for execution
            // but the 'throw' keyword will handle the exception well!
        }
        System.out.println("User starts the app!");
    }
    public static void main(String[] args) {
        chechAge(21);
    }
}
