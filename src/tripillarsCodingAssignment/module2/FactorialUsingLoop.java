package tripillarsCodingAssignment.module2;

import java.util.Scanner;

//Write a program to find the factorial of a number using a loop
public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        long factorial=1;
        for(int i = 1; i<=n; ++i){
            factorial *= i;
        }
        System.out.println("Factorial of the number " + n + " is: " + factorial);
    }
}
