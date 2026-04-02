package assignment2.module5;
public class Arithmetic {
    public static void main(String[] args) {
        try{
          int x = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero" );
        }
    }
}
