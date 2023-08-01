package com.atguigu.designpattern.responsibilitychain;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class SchoolMasterApprover extends Approver{
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processPurchaseRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 40000)
            System.out.println("Purchase request " + purchaseRequest.getId() + " processed by school master approver");
        else
            nextApprover.processPurchaseRequest(purchaseRequest);
    }
}
