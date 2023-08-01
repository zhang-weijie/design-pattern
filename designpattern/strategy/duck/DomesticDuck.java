package com.atguigu.designpattern.strategy.duck;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.strategy.fly.BadFlyBehavior;
import com.atguigu.designpattern.strategy.quack.GagaQuackBehavior;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class DomesticDuck extends Duck{
    public DomesticDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GagaQuackBehavior();
    }
}
