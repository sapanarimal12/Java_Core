package com.javacore.singleton;

public class Singleton {
    public  static volatile   Singleton INSTANCE =null;

    public  String s;
    private Singleton(){
        s="Thread safe Singleton Example";

    }
    public static  Singleton getInstance(){
        if (INSTANCE==null) {
                synchronized (Singleton.class) {
                    if (INSTANCE==null) {
                        INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
