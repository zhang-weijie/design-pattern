package com.atguigu.designpattern.iterator;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.Iterator;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public interface College {
    String getName();

    void addDepartment(String name, String desc);

    Iterator getIterator();
}
