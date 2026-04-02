package assignment2.module4;
public interface Vehicle {
    void start();
}
class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("The car is starting");
    }
}
class Main{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
    }
}