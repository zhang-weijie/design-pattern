package com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.pizza;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("Cheese pizza");
        System.out.println(name + " preparing;");
    }
}