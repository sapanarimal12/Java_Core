package com.javacore.proxyPatern;

public class  ProxyPatternClient {

    public static void main(String[] args) {

        OfficeInternetAccess officeInternetAccess=new ProxyInternetAccess("Sapana");
        officeInternetAccess.grantInternetAccess();
    }
}
