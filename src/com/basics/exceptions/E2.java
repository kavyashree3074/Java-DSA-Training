package com.basics.exceptions;
public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            String str = "SNPSU";
            System.out.println(str.charAt(9));
        }catch(ArithmeticException |StringIndexOutOfBoundsException e){//Multi catch block for multiple exceptions
            System.out.println("Error!");
        }finally{
            System.out.println("End of execution of code");//Mandatorily it will happen
        }
        System.out.println("The value of k is: " + k);
    }
}
