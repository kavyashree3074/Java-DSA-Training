package tripillarsCodingAssignment.module3;
//Write a program to demonstrate constructor usage.
public class ConstructorUsage {
    //
    String item;
    double weight;
    double cost;
    static String brand="Supreme";
    ConstructorUsage(String item,double weight,double cost){
        this.item=item;
        this.weight=weight;
        this.cost=cost;
    }
    void productDetails(){
        System.out.println("Brand: " + brand + " Item: " + item +" Weight in kg: " + weight + " Cost in rupees: " + cost + "\t" );
    }

    public static void main(String[] args) {
        ConstructorUsage c1 = new ConstructorUsage("Rice",5.8,335);
        ConstructorUsage c2 = new ConstructorUsage("Ragi",10.25,225.8);
        ConstructorUsage c3 = new ConstructorUsage("Wheat",6.5,350);
        ConstructorUsage c4 = new ConstructorUsage("BrownRice",10.25,500.50);
        c1.productDetails();
        c2.productDetails();
        c3.productDetails();
        c4.productDetails();
    }
}
