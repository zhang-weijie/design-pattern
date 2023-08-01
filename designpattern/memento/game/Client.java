package com.atguigu.designpattern.memento.game;
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
        Player player = new Player(100, 100);
        player.display();

        Memento memento = player.saveStateToMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(memento);

        player.setAtk(30);
        player.setDef(30);
        player.display();

        player.getStateFromMemento(careTaker.getMemento());
        
        player.display();
    }
}
