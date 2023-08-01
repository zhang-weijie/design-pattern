package com.atguigu.designpattern.proxy.dynamicproxy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //generate a proxy for target object
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK proxy starts");

                        //call object method using reflection
                        Object returnVal = method.invoke(target, args);

                        System.out.println("JDK proxy ends");

                        return returnVal;
                    }
                });
    }
}
