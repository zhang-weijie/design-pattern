package com.atguigu.designpattern.facade.equipment;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Theater light on");
    }

    public void off(){
        System.out.println("Theater light off");
    }

    public void dim(){
        System.out.println("Theater light dims");
    }

    public void bright(){
        System.out.println("Theater light brights");
    }
}
