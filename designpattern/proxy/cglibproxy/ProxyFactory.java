package com.atguigu.designpattern.proxy.cglibproxy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        //1. create a tool class
        Enhancer enhancer = new Enhancer();
        //2. set super class
        enhancer.setSuperclass(target.getClass());
        //3. set call back function
        enhancer.setCallback(this);
        //4. create proxy
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib proxy starts");
        Object returnVal = method.invoke(target,objects);
        System.out.println("Cglib proxy ends");

        return returnVal;
    }
}
