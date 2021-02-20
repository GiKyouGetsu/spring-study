package com.wei.demo03;

public class Client {

    public static void main(String[] args) {
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(new Host());

        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
    }
}
