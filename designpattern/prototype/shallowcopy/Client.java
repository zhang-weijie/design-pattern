package com.atguigu.designpattern.prototype.shallowcopy;
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
        Sheep sheep = new Sheep("Tom", 1, "white");
        Sheep friendSheep = new Sheep("Jerry", 2, "black");
        sheep.setFriend(friendSheep);

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

        //in the shallow copy case, clones have the same only friend with unique hashcode
        System.out.println(sheep.getFriend().hashCode());
        System.out.println(sheep1.getFriend().hashCode());
        System.out.println(sheep2.getFriend().hashCode());
        System.out.println(sheep3.getFriend().hashCode());
        System.out.println(sheep4.getFriend().hashCode());

    }
}
