package com.javacore.facadePattern.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    public  static int choice;

    public static void main(String[] args) throws NumberFormatException , IOException {

        do {
            System.out.println(" !!----  Mobile Shop ----!! \n ");
            System.out.println("--Iphone Shop--");

            System.out.println("---Samsung Shop---");
            System.out.print("   1. IPHONE.\n");
            System.out.print("    2. SAMSUNG.   \n");
            System.out.println("   3 Exit    ");
            System.out.println("Enter your choice");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            Shopkeeper sk = new Shopkeeper();

            switch (choice) {
                case 1:

                    sk.iphoneSale();
                    break;

                case 2:
                    sk.samsungSale();
                    break;

                default:
                    System.out.println("Nothing you purchased");
            }
        }
        while (choice != 4) ;
        }
}
