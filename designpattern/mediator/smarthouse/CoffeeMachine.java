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
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(String name, Mediator mediator) {
        super(name, mediator);
        //when creating object, register it to the mediator at the same time
        mediator.register(name,this);
    }

    public void startCoffee(){
        System.out.println("It's time to start making coffee.");
    }

    public void finishCoffee(){
        System.out.println("After 5 minutes");
        System.out.println("Coffee is ready");
        sendMessage(0);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
