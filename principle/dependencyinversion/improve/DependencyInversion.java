package com.atguigu.principle.dependencyinversion.improve;
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
        // client end must not be altered
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}

//define Interface IReceiver
interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {
    public String getInfo() {
        return "Email: hello world!";
    }
}

class Wechat implements IReceiver {
    public String getInfo(){
        return "Wechat: hello world!";
    }
}

class Person {
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}