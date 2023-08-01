package com.atguigu.designpattern.builder;
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
        Director director = new Director();

        //1. use extended abstract computer builder
        AbsComputerBuilder lenovoBuilder1 = new LenovoAbsComputerBuilder("Ryzen 9 5950x","Hynix 64gb");
        director.constructAbsComputer(lenovoBuilder1);
        Computer lenovo1 = lenovoBuilder1.getComputer();
        System.out.println(lenovo1);
        lenovo1.setDisplay("LG for Lenovo");
        System.out.println(lenovo1);

        //2. use implemented interface computer builder
        IComputerBuilder macBuilder1 = new MacIComputerBuilder("Ryzen 9 3950x","Kingston 32gb");
        director.constructIComputer(macBuilder1);
        Computer mac1 = macBuilder1.getComputer();
        System.out.println(mac1);
        mac1.setKeyboard("Gigabyte for Mac");
        System.out.println(mac1);
    }
}
