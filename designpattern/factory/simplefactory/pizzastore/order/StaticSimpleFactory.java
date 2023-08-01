package com.atguigu.designpattern.factory.simplefactory.pizzastore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class StaticSimpleFactory {
    public static Pizza createPizza(String orderType){
        Pizza pizza = null;

        if ("greek".equals(orderType))
            pizza = new GreekPizza();
        else if ("cheese".equals(orderType))
            pizza = new CheesePizza();

        return pizza;
    }
}
