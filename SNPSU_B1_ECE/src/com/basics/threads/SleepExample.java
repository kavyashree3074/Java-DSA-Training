package com.basics.threads;
public class SleepExample {
    public static void main(String[] args) throws InterruptedException{
        for(int i=1; i<=5; i++){
            System.out.println("Printing number 1 to 5: " + i);
            Thread.sleep(2000);
        }
        System.out.println("Successfully printed 1 to 5");
    }
}
/*
Code Explanation
Here,
 */
