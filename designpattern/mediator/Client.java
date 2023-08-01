package com.atguigu.designpattern.mediator;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.mediator.smarthouse.Alarm;
import com.atguigu.designpattern.mediator.smarthouse.CoffeeMachine;
import com.atguigu.designpattern.mediator.smarthouse.Curtains;
import com.atguigu.designpattern.mediator.smarthouse.TV;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Alarm alarm = new Alarm("alarm",mediator);
        CoffeeMachine coffeeMachine = new CoffeeMachine("coffee machine", mediator);
        Curtains curtains = new Curtains("curtains", mediator);
        TV tv = new TV("tv", mediator);

        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
