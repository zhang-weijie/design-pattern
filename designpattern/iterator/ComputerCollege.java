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
public class ComputerCollege implements College{
    Department[] departments;
    int numOfDepartments = 0;

    //capacity should be specified in a hidden way
    public ComputerCollege() {
        departments = new Department[100];
    }

    @Override
    public String getName() {
        return "Computer College";
    }

    //this method hide the data structure of array
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartments] = department;
        numOfDepartments++;
    }

    @Override
    public Iterator getIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
