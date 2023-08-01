package com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.milk.CheeseMilk;
import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.milk.Milk;
import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.pizza.CheesePizza;
import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.pizza.Pizza;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class CheeseFactory implements AbstractFactory{
    @Override
    public Pizza createPizza() {
        Pizza pizza = new CheesePizza();
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

    @Override
    public Milk createMilk() {
        Milk milk = new CheeseMilk();
        milk.prepare();
        return milk;
    }
}
