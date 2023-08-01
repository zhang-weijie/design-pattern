package com.atguigu.designpattern.visitor.differentusageofcooperandpaper;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        CooperElement cooperElement = new CooperElement();
        PaperElement paperElement = new PaperElement();

        objectStructure.add(cooperElement);
        objectStructure.add(paperElement);

        ArtCompanyVisitor artCompanyVisitor = new ArtCompanyVisitor();
        MintCompanyVisitor mintCompanyVisitor = new MintCompanyVisitor();

        objectStructure.accept(artCompanyVisitor);
        objectStructure.accept(mintCompanyVisitor);
    }
}
