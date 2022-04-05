package com.javacore.exceptionHandling;

public class TestThrow {
    public static void checkNum(int num) {
        if (num<1){
            throw new ArithmeticException("Number is Negative");
        }
        else {
            System.out.println("Square of " +num+" is " +num*num);
        }
    }
}
