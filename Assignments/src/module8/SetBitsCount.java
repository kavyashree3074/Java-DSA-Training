package module8;
//Find the number of set bits in a number.
public class SetBitsCount {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        System.out.println("Set Bits = " + count);
    }
}

