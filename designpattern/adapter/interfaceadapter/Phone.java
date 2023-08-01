package com.atguigu.designpattern.adapter.interfaceadapter;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */


/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Phone {
    public void charge(IVoltage iVoltage){
        if (iVoltage.output5V() == 5)
            System.out.println("5V detected, start charging");
        else if (iVoltage.output5V() > 5)
            System.out.println("Voltage higher than 5V detected, deny charging");
    }
}
