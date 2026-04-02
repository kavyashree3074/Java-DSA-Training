package assignment4.module9;
//Print numbers from 1 to n using recursion
public class NumberFrom1ToNUsingRecursion {
    static void print(int n){

        if(n == 0)
            return;

        print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print(5);
    }
}
