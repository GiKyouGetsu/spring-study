package com.wei.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }
    // Proxy Handler
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    public void seeHouse() {
        System.out.println("See House");
    }

    public  void fare() {
        System.out.println("收中介费");
    }
}
