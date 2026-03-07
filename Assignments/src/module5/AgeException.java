package module5;

class AgeException {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18. Not eligible.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        checkAge(16);   // change the value to test
    }
}

