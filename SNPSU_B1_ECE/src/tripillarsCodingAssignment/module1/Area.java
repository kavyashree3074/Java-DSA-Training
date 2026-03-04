package tripillarsCodingAssignment.module1;
import java.util.Scanner;
//Write a program to calculate the area of a circle.
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter the radius of the circle:");
            double radius=sc.nextDouble();
            double area= Math.PI * radius * radius;
            System.out.println("The area of the circle with radius " + radius + " is: " + area);

        }
    }
}

