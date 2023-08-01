package com.atguigu.designpattern.proxy.dynamicproxy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.lang.reflect.ParameterizedType;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        TeacherDAO target = new TeacherDAO();

        ITeacherDAO proxyInstance = (ITeacherDAO) new ProxyFactory(target).getProxyInstance();

        proxyInstance.teach();

        System.out.println(proxyInstance.getClass());

    }
}
