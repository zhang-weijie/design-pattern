package com.atguigu.designpattern.strategy.fly;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import javax.sound.midi.Soundbank;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("No fly behavior");
    }
}
