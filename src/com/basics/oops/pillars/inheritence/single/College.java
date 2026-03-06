package com.basics.oops.pillars.inheritence.single;

public class College {
    static String name="SNPSU";
    String address;
    int pinCode;

    public College(String address, int pinCode) {
        this.address = address;
        this.pinCode = pinCode;
    }
}
class Department extends College{
    String block;
    int lecturerCount;
    Department(String address, int pinCode,String block, int lecturerCount){
        super(address,pinCode);
        this.block=block;
        this.lecturerCount=lecturerCount;
    }
    void details(){
        System.out.println(block+" "+ lecturerCount+" "+address+" "+ pinCode+" "+ College.name);
    }

    public static void main(String[] args) {
        Department department=new Department("Bangalore",560057,"C-Block",25);
        department.details();
    }
}
/*
Points to remember:
✅ super.something->variable from Parent class
super()->constructor of the parent class
Don't use super. for constructor
These are important for interviews and vivas
 */
