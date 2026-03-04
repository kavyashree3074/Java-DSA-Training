package com.basics.exceptions;
public class E1 {
    public static void main(String[] args) {
        int i, j,k=0;
        i = 10;
        j = 2;
        try {
            k = i / j;
            String name = "Java";
            System.out.println(name.charAt(6));
        }catch (ArithmeticException e){// catch block will catch the exception, here it is known exception
            System.out.println("Cannot divide by zero IDIOT!");
            e.printStackTrace();
        }
        catch (StringIndexOutOfBoundsException e){// catch block will catch the exception, here it is known exception
            System.out.println("The index of string is out of bounds(OOB) ");
        }catch(Exception e){
            System.out.println("Unexcepted error");
        }
        finally {
            System.out.println("This block will always execute.");
            System.out.println("No matter what happens to the code.");
            System.out.println("We use this block for releasing resources.");
            System.out.println("All internet, db, files, etc are closed here.");
        }
        System.out.println("The value of k is: "+ k);
    }
}
