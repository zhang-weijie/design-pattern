package com.atguigu.designpattern.decorator;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.decorator.coffee.LongBlack;
import com.atguigu.designpattern.decorator.decorator.Chocolate;
import com.atguigu.designpattern.decorator.decorator.Milk;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //order a long black coffee with  1 * Milk and 2 * Chocolate
        //1. oder a long black coffee
        Drink order = new LongBlack();
        System.out.println(order.getDesc());
        System.out.println(order.cost());

        //2. add a milk
        order = new Milk(order);
        System.out.println(order.getDesc());
        System.out.println(order.cost());

        //3. add 2 chocolate
        order = new Chocolate(order);
        System.out.println(order.getDesc());
        System.out.println(order.cost());

        order = new Chocolate(order);
        System.out.println(order.getDesc());
        System.out.println(order.cost());
    }
}
