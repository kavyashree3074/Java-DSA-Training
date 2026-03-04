package com.basics.strings.problems;
//education
//cauliflower
//Mozambique
public class CountVowels {
    public static void main(String[] args) {
        String s1 = "education";
        int count = 0;
        for(int i = 0; i<s1.length(); i++){//DONOT use '<='
            char ch = s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("Vowels: "+count);
    }
}
