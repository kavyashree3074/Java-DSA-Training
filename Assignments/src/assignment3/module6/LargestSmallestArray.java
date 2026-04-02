package assignment3.module6;
//Find the largest and smallest element in an array.
public class LargestSmallestArray {
    public static void main(String[] args) {
        int[] numbers = {15, 42, 7, 89, 23, 1, 56};
        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // New largest found
            } else if (numbers[i] < min) {
                min = numbers[i]; // New smallest found
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}



