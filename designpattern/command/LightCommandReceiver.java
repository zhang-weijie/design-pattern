package com.atguigu.designpattern.command;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class LightCommandReceiver {
    public void on(){
        System.out.println("turn on light");
    }

    public void off(){
        System.out.println("turn off light");
    }
}
