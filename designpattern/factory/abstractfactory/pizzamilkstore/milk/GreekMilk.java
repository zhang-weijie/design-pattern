package com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.milk;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class GreekMilk extends Milk {
    @Override
    public void prepare() {
        setName("Greek milk");
        System.out.println(name + " preparing;");
    }
}