package com.atguigu.designpattern.singleton.staticinnerclass;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 * 优缺点说明：
    1) 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
    2) 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化
    时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的
    懒加载实例化。
    3) 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们
    保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。保证了线程安全。
    4) 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
    5) 结论：推荐使用.
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class StaticInnerClass {

}

class SingleTon7 {
    private SingleTon7(){

    }

    private static class SingleTon7Instance {
        private static final SingleTon7 INSTANCE = new SingleTon7();
    }

    public static SingleTon7 getInstance() {
        return SingleTon7Instance.INSTANCE;
    }
}


