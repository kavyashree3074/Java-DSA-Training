package module10;

import java.util.Scanner;

public class ReplacePercent20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        String result = str.replace(" ", "%20");
        System.out.println("Modified String: " + result);

    }
}
