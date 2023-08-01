package com.atguigu.designpattern.memento.game;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class CareTaker {
    //case 1: only one state of the only player to be saved
    private Memento memento;
    //case 2: states of the only player to be saved
//    private ArrayList<Memento> mementoArrayList;
    //case 3: states of players to be saved
//    private HashMap<String, ArrayList<Memento>> mementosHashmap;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
