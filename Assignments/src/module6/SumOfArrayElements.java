package module6;
//Find the sum of all elements in an array.
public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Array elements:" );
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of the Array elements is: " + sum);
    }
}
