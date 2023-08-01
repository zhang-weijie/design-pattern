package com.atguigu.designpattern.proxy.dynamicproxy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

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
