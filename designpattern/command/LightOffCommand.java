package com.atguigu.designpattern.command;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class LightOffCommand implements Command{
    LightCommandReceiver lightCommandReceiver;

    public LightOffCommand(LightCommandReceiver lightCommandReceiver) {
        super();
        this.lightCommandReceiver = lightCommandReceiver;
    }

    @Override
    public void execute() {
        lightCommandReceiver.off();
    }

    @Override
    public void undo() {
        lightCommandReceiver.on();
    }
}
