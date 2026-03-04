package com.basics.exceptions;
public class CheckBalance {
    static void withdraw(int total, int amt){
        final int min_bal = 2000;
        if(total-min_bal>amt){
            System.out.println("Sufficient balance");
        }else{
            throw new RuntimeException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
    }
    public static void main(String[] args) {
      withdraw(6000,3000);
      withdraw(7000,6000);
    }
}
