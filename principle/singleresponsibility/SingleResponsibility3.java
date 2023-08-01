package com.atguigu.principle.singleresponsibility;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("Motor");
        vehicle2.runAir("Airplane");
        vehicle2.runWater("Ship");
    }
}

//3.method
//(1) less modification to the class, add only extra methods
//(2) against single responsibility principle at class level, but not at method level
class Vehicle2 {
    public void runRoad(String vehicle){
        System.out.println(vehicle + " runs on the road...");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + " runs in the sky...");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + " runs on the water...");
    }
}