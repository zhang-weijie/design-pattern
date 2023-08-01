package com.atguigu.designpattern.visitor.differentusageofcooperandpaper;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class MintCompanyVisitor implements Visitor{
    @Override
    public void visit(PaperElement paperElement) {
        System.out.println("Mint company uses paper to make paper money");
    }

    @Override
    public void visit(CooperElement cooperElement) {
        System.out.println("Mint company uses cooper to make copper");
    }
}
