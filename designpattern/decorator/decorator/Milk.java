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
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDesc("Milk");
        setPrice(2f);
    }
}
