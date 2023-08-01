package com.atguigu.designpattern.template;
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
        SoyMilk redBean = new RedBeanSoyMilk();
        redBean.templateMake();

        SoyMilk peanut = new PeanutSoyMilk();
        peanut.templateMake();
    }
}
