package com.javacore.singleton;

public class ClientTest {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton1.hashCode());
        System.out.println(singleton1.s);
    }
}
