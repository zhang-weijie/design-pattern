package com.atguigu.designpattern.builder;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Director {
    public void constructAbsComputer(AbsComputerBuilder computerBuilder){
        computerBuilder.setUsbCount();
        computerBuilder.setKeyboard();
        computerBuilder.setDisplay();
    }

    public void constructIComputer(IComputerBuilder computerBuilder){
        computerBuilder.setUsbCount();
        computerBuilder.setKeyboard();
        computerBuilder.setDisplay();
    }
}
