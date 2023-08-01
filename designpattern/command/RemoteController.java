package com.atguigu.designpattern.command;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command toUndoCommand;

    public RemoteController() {
        onCommands = new Command[5];//light, TV, fridge, wash machine, vacuum cleaner
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            //usage of NoCommand in order to initialize all on/off commands
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int id, Command on, Command off){
        onCommands[id] = on;
        offCommands[id] = off;
    }

    public void onButtonWasClicked(int id){
        onCommands[id].execute();
        // save last executed command for undoing it
        toUndoCommand = onCommands[id];
    }

    public void offButtonWasClicked(int id){
        offCommands[id].execute();
        // save last executed command for undoing it
        toUndoCommand = offCommands[id];
    }

    public void undoButtonWasClicked(){
        toUndoCommand.undo();
    }
}
