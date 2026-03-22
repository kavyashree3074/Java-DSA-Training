package module11;
import java.util.Scanner;
public class BinaryString {
    static void generate(String str, int n) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }
        generate(str + "0", n);
        generate(str + "1", n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length n: ");
        int n = sc.nextInt();
        generate("", n);
        sc.close();
    }
}
