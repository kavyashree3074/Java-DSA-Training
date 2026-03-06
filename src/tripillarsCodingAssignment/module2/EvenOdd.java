package tripillarsCodingAssignment.module2;

import java.util.Scanner;
//Write a program to check whether a number is even or odd.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a whole number");
        int n = sc.nextInt();{
            if((n%2)==0){
                System.out.println(n + " is EVEN");
            }else{
                System.out.println(n + " is ODD");
            }
        }
    }
}
