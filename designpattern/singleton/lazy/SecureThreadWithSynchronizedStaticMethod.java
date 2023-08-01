package com.atguigu.designpattern.singleton.lazy;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 *
 * 优缺点说明：
    1) 解决了线程不安全问题
    2) 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行
    同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，
    直接return就行了。方法进行同步效率太低
    3) 结论：在实际开发中，不推荐使用这种方式
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class SecureThreadWithSynchronizedStaticMethod {

}

class SingleTon4 {
    private SingleTon4(){

    }

    private static SingleTon4 instance;

    public static synchronized SingleTon4 getInstance(){
        if (instance == null){
            instance = new SingleTon4();
        }
        return instance;
    }
}
