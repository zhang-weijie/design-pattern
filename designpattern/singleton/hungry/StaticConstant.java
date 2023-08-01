package com.atguigu.designpattern.singleton.hungry;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 * 饿汉式（静态常量）应用实例
    步骤如下：
    1) 构造器私有化 (防止 new )
    2) 类的内部创建对象,对其进行实例化
    3) 向外暴露一个静态的公共方法。getInstance
    4) 代码实现
 */


/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class StaticConstant {
    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance1 = SingleTon.getInstance();

        System.out.println(instance == instance1);
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}

class SingleTon {
    private SingleTon() {

    }

    private final static SingleTon instance = new SingleTon();

    public static SingleTon getInstance(){
        return instance;
    }
}
