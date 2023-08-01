package com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 * for more about abstract factory, refer:
 * https://www.runoob.com/design-pattern/abstract-factory-pattern.html
 */

import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.milk.GreekMilk;
import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.milk.Milk;
import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.pizza.GreekPizza;
import com.atguigu.designpattern.factory.abstractfactory.pizzamilkstore.pizza.Pizza;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class GreekFactory implements AbstractFactory{
    @Override
    public Pizza createPizza() {
        Pizza pizza = new GreekPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    @Override
    public Milk createMilk() {
        Milk milk = new GreekMilk();
        milk.prepare();
        return milk;
    }
}
