package com.javacore.pattern;

public class StarMixPattern {
    public static void main(String[] args) {
        int i, j, row = 6;

        for (i = 1; i < row; i++) {
            for (j = 1; j <= i; j++) {
                if(i==2 || i==3 ) {
                    System.out.print("+");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

