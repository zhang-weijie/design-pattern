package com.atguigu.designpattern.decorator.decorator;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.decorator.Drink;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Decorator extends Drink {
    //Decorator组合了Drink(Coffee)，相当于把Coffee放进了Decorator中
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.desc + " " + super.getPrice() + " & " + drink.getDesc() + " " + drink.getPrice();
    }
}
