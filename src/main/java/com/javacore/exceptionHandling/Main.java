package com.javacore.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(TestThrows.divideNum(40,0));
        }
        catch (ArithmeticException e){
            System.out.println("Number can't be divided by 0 ");
        }
        System.out.println("Rest of Code");
    }
}
