package assignment2.module4;
class StaticBlockDemo {
    static int number;
    static {
        System.out.println("Static block executed");
        number = 100;
    }
    public static void main(String[] args) {
        System.out.println("Value of number: " + number);
    }
}

