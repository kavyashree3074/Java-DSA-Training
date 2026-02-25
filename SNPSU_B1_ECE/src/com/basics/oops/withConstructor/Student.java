package com.basics.oops.withConstructor;
public class Student {
    // Instance Variables
    int USN;
    String name;
    int marks;
    static String college="SNPSU";
    Student(int USN, String name, int marks){
        this.USN=USN;
        this.name=name;
        this.marks=marks;

    }
    void evaluateMarks(){
        if(marks<75){
            System.out.println(name + " has FAILED");
        }else{
            System.out.println((name + " has PASSED"));
        }
    }
    void studentDetails(){
        System.out.println(name+"-"+USN+"-"+marks+"-"+college+" ");
    }
    public static void main(String[] args) {
        //Object Creation Syntax: ClassName obj = new ClassName
        Student s1=new Student(51,"Kavya",90);

        Student s2 = new Student(79, "Hema",65);
        // It reduces duplication->usage of constructor
        s1.evaluateMarks();
        s2.evaluateMarks();
        s1.studentDetails();
        s2.studentDetails();
    }
}
