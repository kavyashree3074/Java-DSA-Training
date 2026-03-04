package tripillarsCodingAssignment.module1;
import java.util.Scanner;
//Write a program to swap two numbers (with and without third variable).
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();
        System.out.println("Before: " + " a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After: " + "  a = " + a + " b = " + b);



    }
}
