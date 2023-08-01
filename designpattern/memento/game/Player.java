package com.atguigu.designpattern.memento.game;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Player {
    private int atk;
    private int def;

    public Memento saveStateToMemento(){
        return new Memento(atk,def);
    }

    public void getStateFromMemento(Memento memento){
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void display(){
        System.out.println("atk: " + atk + " def: " + def);
    }

    public Player(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
