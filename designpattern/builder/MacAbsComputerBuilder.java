package com.atguigu.designpattern.builder;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class MacAbsComputerBuilder extends AbsComputerBuilder {
    public MacAbsComputerBuilder(String cpu, String ram) {
        super(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        this.computer.setUsbCount(4);
    }

    @Override
    public void setKeyboard() {
        this.computer.setKeyboard("Logic for Macbook");
    }

    @Override
    public void setDisplay() {
        this.computer.setDisplay("Samsung for Macbook");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
