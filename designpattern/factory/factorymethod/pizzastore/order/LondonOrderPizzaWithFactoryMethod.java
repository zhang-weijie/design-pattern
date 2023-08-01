package com.atguigu.designpattern.factory.factorymethod.pizzastore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.*;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class LondonOrderPizzaWithFactoryMethod extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LondonCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LondonGreekPizza();
        }
        return pizza;
    }
}
