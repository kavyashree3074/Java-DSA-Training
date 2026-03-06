package com.basics.strings;

public class DifferenceDemo {
    public static void main(String[] args) {
        String s = "Java";
        // hashcode -> unique id or no. given by JVM
        System.out.println("String before: " + s.hashCode());
        s = s + "DSA";
        System.out.println("String after: " + s.hashCode());
        // This proves that strings are immutable

        //for(int i=0; i<1000; i++){
        //    s = s + "DSA"; }// This creates 1000 new objects
    // to do this we have 2 special MUTABLE STRINGS
    // StringBuffer or StringBuilder -> java.lang
    StringBuilder builder = new StringBuilder("java");
        System.out.println("Builder before: " + builder.hashCode());
        builder.append("DSA");
        System.out.println("Builder After: " + builder.hashCode());
    }
}
