package com.atguigu.designpattern.builder;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class LenovoAbsComputerBuilder extends AbsComputerBuilder {

    public LenovoAbsComputerBuilder(String cpu, String ram) {
        super(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        this.computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        this.computer.setKeyboard("Logic for Lenovo");
    }

    @Override
    public void setDisplay() {
        this.computer.setDisplay("Samsung for Lenovo");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
