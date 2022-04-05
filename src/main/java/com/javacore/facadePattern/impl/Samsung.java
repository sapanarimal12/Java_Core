package com.javacore.facadePattern.impl;

public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Samsung M21");
    }

    @Override
    public void price() {
        System.out.println("Rs 30000");

    }
}
