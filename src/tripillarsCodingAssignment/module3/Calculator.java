package tripillarsCodingAssignment.module3;
//Create a class Calculator with methods add() and subtract().
public class Calculator {
    static int add(int a, int b){
        return (a+b);
    }
    static int sub(int a, int b){
        return(a-b);
    }

    public static void main(String[] args) {
        System.out.println(add(20,10));
        System.out.println(sub(20,10));
        System.out.println(add(12,8));
        System.out.println(sub(12,8));
    }
}
