package tripillarsCodingAssignment.module1;

import java.util.Scanner;

//Write a program to convert temperature from Celsius to Fahrenheit.
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature from Celsius" + celsius + " to Fahrenheit is " + fahrenheit);
    }
}

