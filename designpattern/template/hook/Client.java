package com.atguigu.designpattern.template.hook;
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
        //usage of hook method: prepare pure soy milk
        SoyMilk pure = new PureSoyMilk();
        pure.templateMake();
    }
}
