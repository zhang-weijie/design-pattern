package com.atguigu.designpattern.bridge;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Vivo implements Brand{
    @Override
    public void turnOn() {
        System.out.println("turn on Vivo phone");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off Vivo phone");
    }

    @Override
    public void call() {
        System.out.println("call with Vivo phone");
    }
}
