package com.basics.strings.problems;
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "MADAM";
        String reverse = "";//No space
        for (int i = str.length() - 1; i >= 0; i--) {//we are checking in reverse
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
