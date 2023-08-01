package com.atguigu.designpattern.template;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public abstract class SoyMilk {
    //declare template method as final to avoid override by subclasses
    final void templateMake(){
        select();
        addIngredients();
        soak();
        beat();
    }

    void select(){
        System.out.println("select fresh soy beans");
    }

    //implementation of this method varies according to subclasses
    abstract void addIngredients();

    void soak(){
        System.out.println("soak in water");
    }

    void beat(){
        System.out.println("beat all ingredients");
    }
}
