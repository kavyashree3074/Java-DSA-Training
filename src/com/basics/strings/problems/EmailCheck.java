package com.basics.strings.problems;
public class EmailCheck {
    public static void main(String[] args) {
        String email1 = "student@gmail.com";
        String email2 = "worker1_edu";
        if(email1.contains("@") && email1.endsWith(".com")){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        if (email2.contains("@") && email2.endsWith(".com")){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        String USN = "1SG23EC051";
        System.out.println(USN.startsWith("1SG"));
        System.out.println(USN.startsWith("SG"));
    }
}
