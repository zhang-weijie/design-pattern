package com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.milk.Milk;
import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.pizza.Pizza;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public interface AbstractFactory {
    Pizza createPizza();
    Milk createMilk();
}
