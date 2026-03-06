package com.basics.loopingStatements;
public class PrintingMultiplicationTable {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){//rows
            for(int j=1; j<=10; j++){//columns
                System.out.print(j + "x" + i + "=" +i*j + "\t");
            }
            System.out.println();
        }
    }
}
