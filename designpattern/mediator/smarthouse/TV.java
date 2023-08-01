package com.atguigu.designpattern.mediator.smarthouse;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.mediator.Colleague;
import com.atguigu.designpattern.mediator.Mediator;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class TV extends Colleague {
    public TV(String name, Mediator mediator) {
        super(name, mediator);
        mediator.register(name,this);
    }

    public void onTV(){
        System.out.println("It's time to turn on TV.");
    }

    public void offTV(){
        System.out.println("It's time to turn off TV.");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
