package com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class LondonCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("London cheese pizza");
        System.out.println(name + " preparing;");
    }
}
