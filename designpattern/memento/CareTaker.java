package com.atguigu.designpattern.memento;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
