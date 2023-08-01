package com.atguigu.designpattern.factory.simplefactory.pizzastore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class OrderPizzaWithStaticSimpleFactory {
    Pizza pizza = null;

    public OrderPizzaWithStaticSimpleFactory(){
        String orderType = "";

        do {
            orderType = getType();
            pizza = StaticSimpleFactory.createPizza(orderType);

            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else
                System.out.println("Order failed!");

        } while (true);

    }

    //get the ordered pizza type
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
