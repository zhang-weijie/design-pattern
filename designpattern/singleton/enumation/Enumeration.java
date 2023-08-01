package com.atguigu.designpattern.singleton.enumation;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 * 优缺点说明：
    1) 这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而
    且还能防止反序列化重新创建新的对象。
    2) 这种方式是Effective Java作者Josh Bloch 提倡的方式
    3) 抗反射，不管是懒汉式还是饿汉式都可以通过反射变成多例，枚举类则不会
    4) 缺点，无法实现懒加载
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Enumeration {
    public static void main(String[] args) {
        SingleTon8 instance = SingleTon8.INSTANCE;
        SingleTon8 instance2 = SingleTon8.INSTANCE;
        System.out.println(instance.hashCode() == instance2.hashCode());
    }
}

enum SingleTon8 {
    INSTANCE;
    public void sayOK() {
        System.out.println("ok~");
    }
}
