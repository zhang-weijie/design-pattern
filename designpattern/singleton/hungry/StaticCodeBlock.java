package com.atguigu.designpattern.singleton.hungry;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 *  * 饿汉式（静态代码块）应用实例
    步骤如下：
    1) 构造器私有化 (防止 new )
    2) 类的内部创建静态对象,通过静态代码块对其进行实例化
    3) 向外暴露一个静态的公共方法。getInstance
    4) 代码实现
    *
 优缺点说明：
    1) 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同
    步问题。
    2) 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始
    至终从未使用过这个实例，则会造成内存的浪费
    3) 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载
    时就实例化，在单例模式中大多数都是调用getInstance方法， 但是导致类装载
    的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类
    装载，这时候初始化instance就没有达到lazy loading的效果
    4) 结论：这种单例模式可用，可能造成内存浪费
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class StaticCodeBlock {

}

class SingleTon2 {
    private SingleTon2(){

    }

    private static SingleTon2 instance;

    static {
        instance = new SingleTon2();
    }

    public static SingleTon2 getInstance(){
        return instance;
    }
}
