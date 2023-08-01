package com.atguigu.designpattern.adapter.interfaceadapter;
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
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        Phone phone = new Phone();
        phone.charge(voltageAdapter);
    }
}
