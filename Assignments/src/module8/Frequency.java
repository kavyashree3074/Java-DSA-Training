package module8;
//Count frequency of characters in a string
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
        sc.close();
    }
}