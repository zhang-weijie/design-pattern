package com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class PizzaMilkStore {
    public static void main(String[] args) {
        GreekFactory greekFactory = new GreekFactory();
        greekFactory.createPizza();
        greekFactory.createMilk();
    }
}
