package com.atguigu.designpattern.adapter.objectadapter;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Phone {
    public void charge(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5)
            System.out.println("5V detected, start charging");
        else if (iVoltage5V.output5V() > 5)
            System.out.println("Voltage higher than 5V detected, deny charging");
    }
}
