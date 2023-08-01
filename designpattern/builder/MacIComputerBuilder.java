package com.atguigu.designpattern.builder;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class MacIComputerBuilder implements IComputerBuilder {
    private Computer computer;

    public MacIComputerBuilder(String cpu, String ram) {
        this.computer = new Computer(cpu,ram);
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
