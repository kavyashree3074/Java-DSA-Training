package tripillarsCodingAssignment.module1;

public class SwapWith {

        public static void main(String[] args) {

            int a = 10;
            int b = 20;

            System.out.println("Before Swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Swapping using third variable
            int temp;      // third variable
            temp = a;
            a = b;
            b = temp;

            System.out.println("After Swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
