package com.atguigu.designpattern.command;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class LightOnCommand implements Command{
    //concrete command aggregates command receiver
    LightCommandReceiver lightCommandReceiver;

    public LightOnCommand(LightCommandReceiver lightCommandReceiver) {
        super();
        this.lightCommandReceiver = lightCommandReceiver;
    }

    @Override
    public void execute() {
        lightCommandReceiver.on();
    }

    @Override
    public void undo() {
        lightCommandReceiver.off();
    }
}
