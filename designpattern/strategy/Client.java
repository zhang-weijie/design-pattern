package com.atguigu.designpattern.strategy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.strategy.duck.DomesticDuck;
import com.atguigu.designpattern.strategy.duck.Duck;
import com.atguigu.designpattern.strategy.duck.ToyDuck;
import com.atguigu.designpattern.strategy.duck.WildDuck;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        Duck domesticDuck = new DomesticDuck();
        Duck toyDuck = new ToyDuck();

        wildDuck.display();
        domesticDuck.display();
        toyDuck.display();
    }
}
