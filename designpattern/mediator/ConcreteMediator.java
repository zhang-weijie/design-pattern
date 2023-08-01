package com.atguigu.designpattern.mediator;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.mediator.smarthouse.Alarm;
import com.atguigu.designpattern.mediator.smarthouse.CoffeeMachine;
import com.atguigu.designpattern.mediator.smarthouse.Curtains;
import com.atguigu.designpattern.mediator.smarthouse.TV;

import java.util.Currency;
import java.util.HashMap;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class ConcreteMediator extends Mediator{
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);

        if (colleague instanceof Alarm)
            interMap.put("Alarm",colleagueName);
        else if (colleague instanceof CoffeeMachine)
            interMap.put("CoffeeMachine", colleagueName);
        else if (colleague instanceof Curtains)
            interMap.put("Curtains",colleagueName);
        else if (colleague instanceof TV)
            interMap.put("TV", colleagueName);
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm){
            if (stateChange == 0){
                ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV)(colleagueMap.get(interMap.get("TV")))).onTV();
            } else if (stateChange == 1)
                ((TV)(colleagueMap.get(interMap.get("TV")))).offTV();
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtains)(colleagueMap.get(interMap.get("Curtains")))).upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV){

        } else if (colleagueMap.get(colleagueName) instanceof Curtains){

        }
    }

    @Override
    public void sendMessage() {

    }
}
