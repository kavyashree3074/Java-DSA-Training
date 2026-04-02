package assignment2.module4;
abstract class Shape {
    abstract void display();
}
class Circle extends Shape{
    @Override
    void display() {
        System.out.println("This shape is a Circle");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display();
    }
}