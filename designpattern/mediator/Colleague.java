package com.atguigu.designpattern.mediator;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public abstract class Colleague {
    public String name;
    private Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public Mediator getMediator(){
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
