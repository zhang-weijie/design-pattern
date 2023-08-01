package com.atguigu.designpattern.proxy.staticproxy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.proxy.dynamicproxy.ITeacherDAO;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class TeacherDAOProxy implements ITeacherDAO {
    //target object to be proxied
    private ITeacherDAO target;

    public TeacherDAOProxy(ITeacherDAO target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("Proxy starts");//expanded function added by proxy
        target.teach();
        System.out.println("Proxy ends");//expanded function added by proxy
    }
}
