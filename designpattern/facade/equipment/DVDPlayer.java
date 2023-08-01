package com.atguigu.designpattern.facade.equipment;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD player on");
    }

    public void off(){
        System.out.println("DVD player off");
    }

    public void play(){
        System.out.println("DVD player plays");
    }

    public void pause(){
        System.out.println("DVD player pauses");
    }
}
