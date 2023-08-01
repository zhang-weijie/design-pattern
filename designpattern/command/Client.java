package com.atguigu.designpattern.command;
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
        RemoteController remoteController = new RemoteController();

        //add new electric equipment Light
        LightCommandReceiver lightCommandReceiver = new LightCommandReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightCommandReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightCommandReceiver);

        //id 0 for light
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        remoteController.onButtonWasClicked(0);
        remoteController.offButtonWasClicked(0);
        remoteController.undoButtonWasClicked();

        //add new electric equipment TV
        TVCommandReceiver tvCommandReceiver = new TVCommandReceiver();

        TVOnCommand tvOnCommand = new TVOnCommand(tvCommandReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvCommandReceiver);

        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        remoteController.onButtonWasClicked(1);
        remoteController.offButtonWasClicked(1);
        remoteController.undoButtonWasClicked();



    }
}
