package com.atguigu.designpattern.command;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class TVOffCommand implements Command{
    //concrete command aggregates command receiver
    TVCommandReceiver tvCommandReceiver;

    public TVOffCommand(TVCommandReceiver tvCommandReceiver) {
        super();
        this.tvCommandReceiver = tvCommandReceiver;
    }

    @Override
    public void execute() {
        tvCommandReceiver.off();
    }

    @Override
    public void undo() {
        tvCommandReceiver.on();
    }
}
