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
public class AddExpression extends SymbolExpression  {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
