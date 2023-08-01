package com.atguigu.designpattern.template.hook;
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
        //use hook method here
        if (clientWantIngredients())
            addIngredients();
//        addIngredients();
        soak();
        beat();
    }

    //hook method, has a default implementation, can be eventually modified by subclasses
    //for example, a method allowing client to decide to add ingredients or not
    boolean clientWantIngredients(){
        return true;
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
