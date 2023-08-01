package com.atguigu.designpattern.bridge;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Xiaomi());
        foldedPhone.turnOn();
        foldedPhone.call();
        foldedPhone.turnOff();

        UprightPhone uprightPhone = new UprightPhone(new Vivo());
        uprightPhone.turnOn();
        uprightPhone.call();
        uprightPhone.turnOff();
    }
}
