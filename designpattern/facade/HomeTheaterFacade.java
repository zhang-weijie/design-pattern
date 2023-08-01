package com.atguigu.designpattern.facade;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.facade.equipment.*;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class HomeTheaterFacade {
    //define composited sub equipments
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private TheaterLight theaterLight;

    public HomeTheaterFacade(){
        super();
        dvdPlayer = DVDPlayer.getInstance();
        popcorn = Popcorn.getInstance();
        stereo = Stereo.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        theaterLight = TheaterLight.getInstance();
    }

    //start home theater in 4 steps
    public void start(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }

}
