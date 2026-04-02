package assignment3.module7;
public class TimeComplexityComparison {

    // Linear Search
    static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Binary Search
    static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 1000000; // large input size
        int arr[] = new int[n];

        // Fill array with sorted values
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int key = n; // worst-case element

        // -------- Linear Search Timing --------
        long startLinear = System.nanoTime();
        linearSearch(arr, key);
        long endLinear = System.nanoTime();

        // -------- Binary Search Timing --------
        long startBinary = System.nanoTime();
        binarySearch(arr, key);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Time: "
                + (endLinear - startLinear) + " ns");

        System.out.println("Binary Search Time: "
                + (endBinary - startBinary) + " ns");
    }
}