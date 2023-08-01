package com.atguigu.designpattern.bridge;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void turnOn(){
        super.turnOn();
        System.out.println("this is a folded phone");
    }

    public void turnOff(){
        super.turnOff();
        System.out.println("this is a folded phone");
    }

    public void call(){
        super.call();
        System.out.println("this is a folded phone");
    }
}
