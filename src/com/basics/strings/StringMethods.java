package com.basics.strings;
public class StringMethods {
    public static void main(String[] args) {
    String str = "Tripillar Solutions";
        System.out.println("Length"+str.length());
        System.out.println("Char at index 2: " + str.charAt(2));
        System.out.println("Char at the last index : " + str.charAt(str.length()-1 ));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring(0-9): " + str.substring(0,10));
        System.out.println("Equals(Triplillar Solution): " + str.equals("Tripillar Solutions"));
        System.out.println("Equals (Case doesn't matter: " + str.equalsIgnoreCase("tripillar solutions"));
        String jumbled = "Kavya1is1from1ECE1Sec1A";
        //Kavya, is, from, ECE, Sec, A
        String[] words = jumbled.split("1");
        System.out.println(words[3]);
        String name = "     Kavya Shree      ";
        System.out.println(name.trim());//Remove unwanted spaces
        char[] letters = {'K','A','V','Y','A'};
        //String word = letters.toString(); is not correct and only works for Wrapper classes
        String word = new String(letters);//use this which is a constructor
        System.out.println(word);
    }
}
