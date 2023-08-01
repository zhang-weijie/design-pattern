package com.atguigu.designpattern.bridge;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void turnOn(){
        this.brand.turnOn();
    }

    protected void turnOff(){
        this.brand.turnOff();
    }

    protected void call(){
        this.brand.call();
    }
}
