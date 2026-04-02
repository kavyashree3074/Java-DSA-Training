package assignment4.module11;
public class PowerOfNumber {
    static int power(int a, int b) {
        return (b == 0) ? 1 : a * power(a, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
