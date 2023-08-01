package com.atguigu.designpattern.memento;
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
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state 1: attack 100");
        Memento memento = originator.saveStateToMemento();
        careTaker.add(memento);

        originator.setState("state 2: attack 80");
        Memento memento1 = originator.saveStateToMemento();
        careTaker.add(memento1);

        //rollback to state 1
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.get(0));//index 0 stands for state 1
        System.out.println(originator.getState());
    }
}