package com.atguigu.designpattern.adapter.objectadapter;
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
        Voltage220V voltage220V = new Voltage220V();
        VoltageAdapter voltageAdapter = new VoltageAdapter(voltage220V);
        Phone phone = new Phone();
        phone.charge(voltageAdapter);
    }
}
