package com.atguigu.designpattern.strategy.duck;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.strategy.fly.GoodFlyBehavior;
import com.atguigu.designpattern.strategy.quack.GegeQuackBehavior;
import com.atguigu.designpattern.strategy.quack.QuackBehavior;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class WildDuck extends Duck{
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GegeQuackBehavior();
    }
}
