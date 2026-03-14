package module7;
import java.util.Arrays;
//Implement Selection Sort
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {100,3,200,-2,4,8,5,10,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
