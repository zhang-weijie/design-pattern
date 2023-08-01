package com.atguigu.designpattern.adapter.interfaceadapter;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */


/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public abstract class AbstractVoltageAdapter implements IVoltage {
    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output10V() {
        return 0;
    }

    @Override
    public int output15V() {
        return 0;
    }

    @Override
    public int output20V() {
        return 0;
    }
}
