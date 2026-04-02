package assignment3.module7;

import java.util.Arrays;

//Implement Linear Search.
public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {2,-1,9,4,12,-56};
        int key = 9;
        int index = linearSearch(arr,key);
        if(index==-1){
            System.out.println(key + " is not present in the array " + Arrays.toString(arr));
        }else{
            System.out.println(key + " is present in the array " + Arrays.toString(arr));
        }
    }
}
