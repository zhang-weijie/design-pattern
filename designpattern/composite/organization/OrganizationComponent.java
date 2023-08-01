package com.atguigu.designpattern.composite.organization;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    //此处的add和remove未声明为抽象，否则叶子节点如Department需要额外地实现它，造成冗余
    protected void add(OrganizationComponent organizationComponent){
        //以不支持操作地异常笼统地代替原本应当实现的add操作
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
