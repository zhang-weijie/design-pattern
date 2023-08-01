package com.atguigu.designpattern.template.hook;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class PureSoyMilk extends SoyMilk{
    @Override
    void addIngredients() {

    }

    @Override
    boolean clientWantIngredients() {
        return false;
    }
}
