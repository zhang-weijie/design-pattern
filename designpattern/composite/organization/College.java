package com.atguigu.designpattern.composite.organization;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class College extends OrganizationComponent{
    //this list is used to store departments because college is not leaf
    List<OrganizationComponent> organizationComponentList =  new ArrayList<OrganizationComponent>();

    public College(String name, String desc) {
        super(name, desc);
    }

    //the add and remove methods vary from university to college
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("College " + this.getName());
        for (OrganizationComponent o :
                organizationComponentList) {
            o.print();
        }
    }
}
