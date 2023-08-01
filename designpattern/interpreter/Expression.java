package com.atguigu.designpattern.interpreter;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

import java.util.HashMap;

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public abstract class Expression {

    public abstract int interpreter(HashMap<String, Integer> var);
}
