package com.javacore.builderPattern;

public class Main {
    public static void main(String[] args) {
        Department department = Department
                .builder()
                .id(1L)
                .id(2L)
                .name("Carlos")
                .numberOfMember(200)
                .build();

        System.out.println(department);


        Child child = Child
                .builder()
                .id(1L)
                .fname("Reeamsh")
                .lname("Sanjel")
                .build();


        child.setFname("asd");
        System.out.println(child);
    }
}
