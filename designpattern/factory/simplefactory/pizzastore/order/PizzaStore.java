package com.atguigu.designpattern.factory.simplefactory.pizzastore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        //1. SimpleFactory
        //new OrderPizzaWithSimpleFactory(new SimpleFactory());

        //2. StaticSimpleFactory
        new OrderPizzaWithStaticSimpleFactory();
    }
}
