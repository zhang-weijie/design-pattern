package com.atguigu.designpattern.visitor.differentusageofcooperandpaper;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class ArtCompanyVisitor implements Visitor{
    @Override
    public void visit(PaperElement paperElement) {
        System.out.println("Art company uses paper to make paints");
    }

    @Override
    public void visit(CooperElement cooperElement) {
        System.out.println("Art company uses cooper to make statues");
    }
}
