package com.atguigu.designpattern.visitor.differentusageofcooperandpaper;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public interface Visitor {
    void visit(PaperElement paperElement);
    void visit(CooperElement cooperElement);
}
