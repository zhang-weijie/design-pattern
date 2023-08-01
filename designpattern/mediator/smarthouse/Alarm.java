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
public class Alarm extends Colleague {
    public Alarm(String name, Mediator mediator) {
        super(name, mediator);
        //when creating Alarm object, register it to the mediator at the same time
        mediator.register(name,this);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
