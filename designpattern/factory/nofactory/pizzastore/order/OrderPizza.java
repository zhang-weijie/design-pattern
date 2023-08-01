package com.atguigu.designpattern.factory.nofactory.pizzastore.order;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 * 传统方式的优缺点
    1) 优点是比较好理解，简单易操作。
    2) 缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭。即当我们给类增
    加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
    3) 比如我们这时要新增加一个Pizza的种类(Pepper披萨)，需要修改客户端的OrderPizza类
 */

import com.atguigu.designpattern.factory.nofactory.pizzastore.pizza.CheesePizza;
import com.atguigu.designpattern.factory.nofactory.pizzastore.pizza.GreekPizza;
import com.atguigu.designpattern.factory.nofactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String oderType;
        do {
            oderType = getType();
            if ("greek".equals(oderType))
                pizza = new GreekPizza();
            else if ("cheese".equals(oderType))
                pizza = new CheesePizza();
            else
                break;
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
