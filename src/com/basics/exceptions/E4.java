package com.basics.exceptions;

public class E4 {
    static void withdraw(int total, int amt){
        final int min_bal = 2000;
        if(total-min_bal>amt){
            throw new RuntimeException("Minimum balance is 2000 - Insufficient balance");
    }
    System.out.println("Withdrawal successful");
    System.out.println("Remaining balance:"+ (total-amt));
    }
    public static void main(String[] args) {
        withdraw(6000,3000);
        withdraw(7000,1000);
    }
}


