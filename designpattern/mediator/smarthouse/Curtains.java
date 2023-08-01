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
public class Curtains extends Colleague {

    public Curtains(String name, Mediator mediator) {
        super(name, mediator);
        mediator.register(name,this);
    }

    public void upCurtains() {
        System.out.println("I'm holding up curtains.");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
