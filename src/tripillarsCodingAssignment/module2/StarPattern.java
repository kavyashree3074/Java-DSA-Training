package tripillarsCodingAssignment.module2;
//Write a program to print a simple star pattern using nested loops.
public class StarPattern {
     static void starPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        starPattern(5);
        starPattern(3);
    }
}
