package com.atguigu.principle.dependencyinversion;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "Email: hello world!";
    }
}

//class Person owns method receive
//1.if add Message classes MSG or Wechat, we must add new receive methods
//==>solution: add a abstract interface IReceiver, let Email, MSG and Wechat implement it
class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}