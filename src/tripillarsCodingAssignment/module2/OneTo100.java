package tripillarsCodingAssignment.module2;
//Write a program to print numbers from 1 to 100 using a loop
public class OneTo100 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            System.out.print(i + " ");
            if(i%10==0){
                System.out.println();
            }
        }

    }
}
