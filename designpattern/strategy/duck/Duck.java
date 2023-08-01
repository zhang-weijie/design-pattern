package com.atguigu.designpattern.strategy.duck;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.strategy.fly.FlyBehavior;
import com.atguigu.designpattern.strategy.quack.QuackBehavior;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void fly(){
        if (flyBehavior != null)
            flyBehavior.fly();
    }

    public void quack(){
        if (quackBehavior != null)
            quackBehavior.quack();
    }

    public void display(){
        fly();
        quack();
    }
}
