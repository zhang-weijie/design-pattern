package com.atguigu.designpattern.composite.organization;
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
        //create objects top down

        University university = new University("Peking University", "Top2");

        College sfl = new College("SFL", "School of foreign language");
        College it = new College("IT", "School of information technology");

        sfl.add(new Department("German","German language and literature"));
        sfl.add(new Department("French","French language and literature"));

        it.add(new Department("Software","Software engineering"));
        it.add(new Department("Hardware","Hardware engineering"));

        university.add(sfl);
        university.add(it);

        university.print();
        sfl.print();
        it.print();
    }
}
