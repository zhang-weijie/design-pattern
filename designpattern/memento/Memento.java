package com.atguigu.designpattern.memento;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Memento {
    private String state;

    public Memento(String state){
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
