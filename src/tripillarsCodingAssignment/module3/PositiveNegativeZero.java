package tripillarsCodingAssignment.module3;
//Write a method to check whether a number is positive, negative, or zero.
public class PositiveNegativeZero {
    static void positiveNegativeZero(int n){
        if(n<0){
            System.out.println(n+" is NEGATIVE");
        } else if(n>0) {
            System.out.println(n+" is POSITIVE");
        }else{
            System.out.println(n+" is equal to ZERO");
        }
    }

    public static void main(String[] args) {
        positiveNegativeZero(22);
        positiveNegativeZero(-5);
        positiveNegativeZero(0);
    }
}
