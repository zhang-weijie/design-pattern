package com.atguigu.principle.singleresponsibility;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("Motor");
        roadVehicle.run("Car");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("Airplane");

    }
}

//2. method
//(1) follow single responsibility principle
//(2) redundant classes
class RoadVehicle {
    public void run(String vehicle){
        System.out.println(vehicle + " runs on the road...");
    }
}
class AirVehicle {
    public void run(String vehicle){
        System.out.println(vehicle + " flies in the sky...");
    }
}
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " on the water...");
    }
}
