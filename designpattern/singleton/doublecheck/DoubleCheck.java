package com.atguigu.designpattern.singleton.doublecheck;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 * 优缺点说明：
    1) Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两
    次if (singleton == null)检查，这样就可以保证线程安全了。
    2) 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，
    直接return实例化对象，也避免的反复进行方法同步.
    3) 线程安全；延迟加载；效率较高
    4) 结论：在实际开发中，推荐使用这种单例设计模式
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class DoubleCheck {

}

class SingleTon6 {
    private SingleTon6() {

    }
    //for usage details of modifier volatile, refer:
    //https://blog.csdn.net/suifeng3051/article/details/52611233
    //https://blog.csdn.net/suifeng3051/article/details/52611310

    private static volatile SingleTon6 instance;

    public static SingleTon6 getInstance() {
        if (instance == null) {
            synchronized (SingleTon6.class) {
                if (instance == null){
                    instance = new SingleTon6();
                }
            }
        }
        return instance;
    }
}
