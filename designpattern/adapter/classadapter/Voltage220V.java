package com.atguigu.designpattern.adapter.classadapter;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
//class to be adapted
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("voltage = " + src + "V");
        return src;
    }
}
