package com.basics.oops.pillars.inheritence.single;

public class Library {
    String name;
    int id;
    Library(String name, int id){
        this.name=name;
        this.id=id;
    }
}
class Book extends Library{
    double price;
    Book( String name, int id, double price){
        super(name, id);
        this.price=price;
    }
    void details(){
        System.out.println("Name of the book: "+ name+" Student id: "+id+" Cost of the book: "+price);
    }

    public static void main(String[] args) {
        Book book=new Book("3 Mistakes of my life",51,85.5);
        book.details();
    }
}
