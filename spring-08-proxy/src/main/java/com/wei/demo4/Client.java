package com.wei.demo4;

import com.wei.demo02.UserService;
import com.wei.demo02.UserServiceImpl;

public class Client {

    public static void main(String[] args) {
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(new UserServiceImpl());

        UserService proxy = (UserService) proxyInvocationHandler.getProxy();


        proxy.update();
    }
}
