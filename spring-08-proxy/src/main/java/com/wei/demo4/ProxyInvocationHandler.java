package com.wei.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    // Proxy Handler
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logMessage(method.getName() + "Invoked");
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    public void logMessage(String msg) {
        System.out.println(msg);
    }
}
