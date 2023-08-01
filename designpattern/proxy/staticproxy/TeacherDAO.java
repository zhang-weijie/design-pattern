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
public class TeacherDAO implements ITeacherDAO {
    @Override
    public void teach() {
        System.out.println("Teacher teaches");
    }
}
