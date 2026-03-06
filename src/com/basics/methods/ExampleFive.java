package com.basics.methods;
public class ExampleFive {
    static int hammingWweight(int n){
        int count = 0;
        while(n != 0){
            if ((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("HW-11:" + hammingWweight(11));
        System.out.println("HW-5:" + hammingWweight(5));
        System.out.println("HW-15:" + hammingWweight(15));
        System.out.println("HW-0:" + hammingWweight(0));

    }
}
