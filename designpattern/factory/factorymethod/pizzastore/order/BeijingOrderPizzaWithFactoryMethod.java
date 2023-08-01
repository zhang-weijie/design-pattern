package com.atguigu.designpattern.factory.factorymethod.pizzastore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.BeijingCheesePizza;
import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.BeijingGreekPizza;
import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class BeijingOrderPizzaWithFactoryMethod extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BeijingCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BeijingGreekPizza();
        }
        return pizza;
    }
}

