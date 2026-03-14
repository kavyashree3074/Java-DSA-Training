package module6;
//Find the second-largest element in an array.
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,10,13,30,45,22};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + secondLargest);
    }
}