package com.atguigu.principle.liskovsubstitution.improve;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

class Base {

}

class A extends Base {
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

// class C as alias for class A
class C extends Base {
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends Base {
    //如果B类需要使用A类的方法，
    // 1.使用组合Composition
    private A a = new A();
    public int func3(int num1,int num2){
        return a.func1(num1,num2);
    }

    // 2.使用聚合Aggregation
    //以C替代A举例
    private C c;
    public void setC(C c){
        this.c = c;
    }
    public int func4(int num1,int num2){
        C c = new C();
        this.setC(c);
        return this.c.func1(num1,num2);
    }

    //3. 使用依赖Dependency
    public int func5(A a, int num1,int num2){
        return a.func1(num1,num2);
    }

    public int func1(int num1,int num2){
        return num1 + num2;
    }

    public int func2(int num1,int num2){
        return func1(num1,num2) + 9;
    }
}