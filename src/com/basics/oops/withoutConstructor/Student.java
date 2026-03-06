package com.basics.oops.withoutConstructor;
public class Student {
    // Instance Variables
    int USN;
    String name;
    int marks;
    void evaluateMarks(){
        if(marks<75){
            System.out.println(name + " has FAILED");
        }else{
            System.out.println((name + " has PASSED"));
        }
    }
    public static void main(String[] args) {
        //Object Creation Syntax: ClassName obj = new ClassName
        Student s1=new Student();
        s1.USN = 51;
        s1.name = "Kavya";
        s1.marks = 90;
        Student s2 = new Student();
        s2.USN = 79;
        s2.name = "Hema";
        s2.marks = 50;
        s1.evaluateMarks();
        s2.evaluateMarks();
    }
}
