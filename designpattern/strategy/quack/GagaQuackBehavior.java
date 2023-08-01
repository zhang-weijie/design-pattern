package com.atguigu.designpattern.strategy.quack;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class GagaQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Gaga quack behavior");
    }
}
