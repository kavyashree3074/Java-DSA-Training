package module4;

import java.util.Scanner;

public class FinalKeyword {
    public static void main(String[] args) {
        final int x = 5;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(x+y);
        //int x = 25; not possible
    }
}
