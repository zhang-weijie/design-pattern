package com.atguigu.designpattern.prototype.deepcopy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import javax.sound.midi.Soundbank;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "宋江";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的类");

        //方式1完成深拷贝
        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.clone();
        System.out.println(deepPrototype.deepCloneableTarget.hashCode() == deepPrototype1.deepCloneableTarget.hashCode());

        //方式2完成深拷贝
        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.deepClone();
        System.out.println(deepPrototype.deepCloneableTarget.hashCode() == deepPrototype2.deepCloneableTarget.hashCode());
    }
}
