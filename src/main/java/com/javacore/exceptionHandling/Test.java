package com.javacore.exceptionHandling;

public class Test {
    public static void main(String[] args) {
        try {
            vote(2);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public  static void vote(int age) throws InvalidAgeException{
        if (age<18){
            throw  new InvalidAgeException("Person is not eligible for voting");
        }
        else
            System.out.println("Eligible for voting");
    }
}
