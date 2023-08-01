package com.atguigu.designpattern.flyweight;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.HashMap;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class WebsiteFactory {
    //a set as pool
    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    //return website from the pool according to specified type
    //if no available websites exist, create one
    public Website getWebsiteOfCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }
        return (Website) pool.get(type);
    }

    public int getWebsiteCount(){
        return pool.size();
    }
}
