package com.basics.patterns;
public class ZigZag {
    static void zigZagFast(int cols){
        for(int r=1; r<=3; r++){
            for(int c=1; c<=cols; c++){
                if(r==1 && c%4==3||r==2 && c%2==0||r==3 && c%4==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();//For inner loop
        }
        System.out.println();
    }
    static void zigZagFast2(int cols1){
        for(int r=1; r<=3; r++){
            for(int c=1; c<=cols1; c++){
                if(r==1 && c%4==3||r==2 && c%2==0||r==3 && c%4==1){//change the logic-remove this comment once changed
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();//For inner loop
        }
    }
    public static void main(String[] args) {
        zigZagFast(9);
        zigZagFast2(13);
    }
}

