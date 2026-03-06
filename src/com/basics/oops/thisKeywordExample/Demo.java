package com.basics.oops.thisKeywordExample;

public class Demo {
    // Instances Variable
    int i;
    void change(int i){
        // to remove ambiguity
        this.i=i;//if only i=i is used in the code, it creates ambiguity or confusion.
    }
    void display(){
        System.out.println("The value of i is:" + i);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.change(10);
        obj.display();
    }
}
