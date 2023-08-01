package com.atguigu.principle.interfacesegregation;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B implements operation 1");
    }

    @Override
    public void operation2() {
        System.out.println("B implements operation 2");
    }

    @Override
    public void operation3() {
        System.out.println("B implements operation 3");
    }

    @Override
    public void operation4() {
        System.out.println("B implements operation 4");
    }

    @Override
    public void operation5() {
        System.out.println("B implements operation 5");
    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D implements operation 1");
    }

    @Override
    public void operation2() {
        System.out.println("D implements operation 2");
    }

    @Override
    public void operation3() {
        System.out.println("D implements operation 3");
    }

    @Override
    public void operation4() {
        System.out.println("D implements operation 4");
    }

    @Override
    public void operation5() {
        System.out.println("D implements operation 5");
    }
}

//class A use class B through Interface1, but involve only method 1,2,3
class A {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}

//class C use class D through Interface1, but involve only method 1,4,5
class C {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}