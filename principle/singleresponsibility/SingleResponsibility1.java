package com.atguigu.principle.singleresponsibility;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("Motor");
        vehicle.run("Car");
        vehicle.run("Airplane");
    }
}

//class vehicle
// 1. method
// (1) run method against single responsibility principle
// (2) we should distinguish vehicles according to their running ways
class Vehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "runs on the road...");
    }
}
