package com.basics.oops.pillars.inheritence.multi;

public class SimpleCalculator {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void subtract(int a,int b){
        System.out.println(a-b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void divide(int a, int b){
        System.out.println(a/b);
    }
    void multiply(int a,int b){
        System.out.println(a*b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void square(int x){
        System.out.println(Math.pow(x, 2));
    }
    void cube(int x){
        System.out.println(Math.pow(x, 3));
    }

    public static void main(String[] args) {
        System.out.println("==========================");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(4,2);
        c1.subtract(8,5);
        System.out.println("==========================");
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.add(2,4);
        c2.subtract(4,2);
        c2.divide(10,2);
        c2.multiply(2,3);
        System.out.println("==========================");
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.add(3,1);
        c3.subtract(5,3);
        c3.divide(12,3);
        c3.multiply(5,10);
        c3.square(9);
        c3.cube(3);
    }
}
