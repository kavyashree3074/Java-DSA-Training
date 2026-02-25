package com.basics.loopingStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            if(i==3) {
                continue;// continue statement skips the current value &
                //goes to the beginning of the loop for the next loop
            }
            System.out.println(i+" ");
            }
        }

    }

