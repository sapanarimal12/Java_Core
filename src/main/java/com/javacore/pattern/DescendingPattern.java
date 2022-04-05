package com.javacore.pattern;

public class DescendingPattern {
    public static void main(String[] args) {
        int i,j,row=6;
        for (i=row;i>=1;i--){
            for (j=1;j<=i;j++){
                if (i==2 ||i==4){
                    System.out.print(" + ");
                }
                else if(i==3||i==5){
                    System.out.print(" - ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }
    }
}
