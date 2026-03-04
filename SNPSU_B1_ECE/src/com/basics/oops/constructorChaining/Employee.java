package com.basics.oops.constructorChaining;
public class Employee {
    int id;
    String name;
    double salary;
    static String company = "Accenture";
    Employee(){ //Employee()--> Blank(*beginning)
        this(0,"Not Assigned",0.0);
    }
    Employee(int id,String name){
        this(id, name, 30000);
    }
    public Employee(int id, String name, double salary) {  //code>generate-->constructor-->select all
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary+" "+company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();// While keeping it blank, it will directly go to the beginning*...
        Employee e2 = new Employee(100,"Sachin");
        Employee e3 = new Employee(101, "Ramesh", 45000);
        e1.display();
        e2.display();
        e3.display();
    }
}
