package com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.milk;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public abstract class Milk {
    protected String name;

    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }
}
