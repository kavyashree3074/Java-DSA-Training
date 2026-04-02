package assignment3.module7;

import java.util.Arrays;

//Implement Bubble sort
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {// number of iterations = n-1
            for (int j = 0; j < n - 1; j++) {// Second last Element(n-2)
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j]&arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 12, 9, 7, 3, 5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
