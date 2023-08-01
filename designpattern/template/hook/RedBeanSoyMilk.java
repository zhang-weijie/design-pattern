package com.atguigu.designpattern.template.hook;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class RedBeanSoyMilk extends SoyMilk {
    @Override
    void addIngredients() {
        System.out.println("add fine red beans");
    }
}
