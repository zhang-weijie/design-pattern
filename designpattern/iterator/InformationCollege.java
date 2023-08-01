package com.atguigu.designpattern.iterator;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class InformationCollege implements College{
    List<Department> departmentList;

    public InformationCollege() {
        departmentList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return "Information College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator getIterator() {
        return new InformationCollegeIterator(departmentList);
    }
}
